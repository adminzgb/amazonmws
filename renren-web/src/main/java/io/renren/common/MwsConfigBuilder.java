package io.renren.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.model.response.IdentifierType;
import com.amazonaws.mws.model.response.ItemAttributesType;
import com.amazonaws.mws.model.response.ProductType;
import com.amazonaws.mws.model.response.SalesRankList;
import com.amazonaws.mws.model.response.SalesRankType;

import io.renren.dto.MatchingProductDetailDto;
import io.renren.entity.MwsSellerEntity;
import io.renren.service.MwsSellerService;
import io.renren.utils.ShiroUtils;
import io.renren.utils.SpringContextUtils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * mws商家信息生成器
 * 
 * @author Administrator
 *
 */
@Service
public final class MwsConfigBuilder {

	private static MarketplaceWebService service;

	private static MwsSellerService mwsSellerService = (MwsSellerService) new FileSystemXmlApplicationContext(
			"classpath*:spring-*.xml", "classpath*:renren-*.xml").getBean("mwsSellerService");


	public List<String> getMarketplaces() {
		List<String> strList = new ArrayList<>();
		MwsSellerEntity entity = getMwsSellerEntity();
		if (entity == null) {
			return strList;
		}
		if (entity.getMarketplaceIdCa() != null && !entity.getMarketplaceIdCa().equals("")) {
			strList.add("加拿大");
		}
		if (entity.getMarketplaceIdUs() != null && !entity.getMarketplaceIdUs().equals("")) {
			strList.add("美国");
		}
		return strList;
	}

	public MwsSellerEntity getMwsSellerEntity() {
		Map<String, Object> source = new HashMap<>();
		// source.put("user_id",
		// ShiroUtils.getUserEntity().getUserId().toString());
		source.put("user_id", "1");
		java.util.List<MwsSellerEntity> response = new ArrayList<MwsSellerEntity>();
		response = mwsSellerService.queryList(source);
		if (response == null || response.isEmpty()) {
			return null;
		}
		MwsSellerEntity entity = response.get(0);
		return entity;
	}

	public static MarketplaceWebService getMwsService() {
		return service;
	}

	static {
		Map<String, Object> source = new HashMap<>();
		// source.put("user_id",
		// ShiroUtils.getUserEntity().getUserId().toString());
		source.put("user_id", "1");
		java.util.List<MwsSellerEntity> response = new ArrayList<MwsSellerEntity>();
		response = mwsSellerService.queryList(source);
		MwsSellerEntity entity = response.get(0);
		final String accessKeyId = entity.getAccessKeyId();
		final String secretAccessKey = entity.getSecretAccessKey();
		final String appName = entity.getAppName();
		final String appVersion = entity.getAppVersion();
		MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
		service = new MarketplaceWebServiceClient(accessKeyId, secretAccessKey, appName, appVersion, config);
	}

	public static MatchingProductDetailDto buildProductDetail(IdentifierType t, ProductType productType,
			SalesRankList s) {
		MatchingProductDetailDto dto = new MatchingProductDetailDto();
		ItemAttributesType type = productType.getAttributeSets().getAttributeSet().get(0).getValue();
		dto.setFeatures(type.getFeature());
		dto.setBrandName(type.getBrand());
		dto.setLabel(type.getLabel());
		dto.setTitle(type.getTitle());
		dto.setImgUrl(type.getSmallImage() == null ? null : type.getSmallImage().getURL());
		if (type.getListPrice() == null) {
			dto.setPrice(null);
		} else {
			dto.setPrice(type.getListPrice().getAmount().toString() + "" + type.getListPrice().getCurrencyCode());
		}
		dto.setCata(s.getSalesRank().get(0).getProductCategoryId());
		dto.setRank(s.getSalesRank().get(0).getRank().toString());
		dto.setReviewCount(type.getNumberOfDiscs() == null ? null : type.getNumberOfDiscs().toString());
		dto.setProductName(type.getProductTypeName());
		dto.setAsin(t.getMarketplaceASIN() == null ? null:t.getMarketplaceASIN().getASIN());
		dto.setSku(t.getSKUIdentifier() == null ? null: t.getSKUIdentifier().getSellerSKU());
		return dto;
	}
}
