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
			"classpath*:spring-*.xml","classpath*:renren-*.xml").getBean("mwsSellerService");

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
		//source.put("user_id", ShiroUtils.getUserEntity().getUserId().toString());
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
}
