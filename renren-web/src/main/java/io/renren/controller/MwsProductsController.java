package io.renren.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.common.Contants;
import com.amazonaws.common.QueryContextIdContants;
import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.model.IdList;
import com.amazonaws.mws.model.response.GetMatchingProductForIdRequest;
import com.amazonaws.mws.model.response.GetMatchingProductForIdResponse;
import com.amazonaws.mws.model.response.ListMatchingProductsRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsResponse;
import com.amazonaws.mws.model.response.ProductType;
import com.amazonaws.mws.samples.mySamples.ListMatchingProductsSample;

import io.renren.common.MwsConfigBuilder;
import io.renren.dto.GetMatchingProductForIdDto;
import io.renren.dto.MatchProductDto;
import io.renren.dto.MatchingProductDetailDto;
import io.renren.entity.MwsSellerEntity;

@RestController
@RequestMapping("mwsseller")
public class MwsProductsController {

	@Autowired
	MwsConfigBuilder builder;

	/**
	 * 获取单个
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(path = "/singleInfo", method = RequestMethod.POST)
	@ResponseBody
	public List<MatchingProductDetailDto> singleInfo(GetMatchingProductForIdDto param) {
		GetMatchingProductForIdRequest request = new GetMatchingProductForIdRequest();
		request.setIdType(param.getIdType());
		IdList idList = new IdList();
		List<String> str = new ArrayList<>();
		str.add(param.getIdList());
		idList.setId(str);
		request.setIdList(idList);
		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		if (param.getMarketplaceId().equals("美国")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdUs());
		} else if (param.getMarketplaceId().equals("加拿大")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdCa());
		}
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		MarketplaceWebService service = MwsConfigBuilder.getMwsService();
		List<MatchingProductDetailDto> matchProductDtos = new ArrayList<>();
		GetMatchingProductForIdResponse response = ListMatchingProductsSample.invokeGetMatchingProductForId(service,
				request);
		List<ProductType> productTypes = response.getGetMatchingProductResult().getProducts().getProduct();
		for (ProductType p : productTypes) {
			MatchingProductDetailDto matchProductDto = new MatchingProductDetailDto();
			try {
				// matchProductDto.setASIN(p.getIdentifiers().getMarketplaceASIN().getASIN());
				//
				// matchProductDto.setSmallImg(
				// p.getAttributeSets().getAttributeSet().get(0).getValue().getSmallImage().getURL());
				// matchProductDto.setBrandName(p.getAttributeSets().getAttributeSet().get(0).getValue().getBrand());
				matchProductDto = MwsConfigBuilder.buildProductDetail(p.getIdentifiers(), p, p.getSalesRankings());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			matchProductDtos.add(matchProductDto);
		}
		return matchProductDtos;
	}

	/**
	 * 信息
	 */
	@RequestMapping(path = "/info", method = RequestMethod.POST)
	@ResponseBody
	public List<MatchingProductDetailDto> info(ListMatchingProductsRequest request, HttpServletRequest request2) {
		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		List<MatchingProductDetailDto> matchProductDtos = new ArrayList<>();
		if (request.getMarketplaceId().equals("美国")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdUs());
		} else if (request.getMarketplaceId().equals("加拿大")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdCa());
		}
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		MarketplaceWebService service = MwsConfigBuilder.getMwsService();

		ListMatchingProductsResponse response = ListMatchingProductsSample.invokeListMatchingProducts(service, request);
		// return response;
		List<ProductType> productTypes = response.getListMatchingProductsResult().getProducts().getProduct();
		for (ProductType p : productTypes) {
			MatchingProductDetailDto matchProductDto = new MatchingProductDetailDto();
			try {
				// matchProductDto.setASIN(p.getIdentifiers().getMarketplaceASIN().getASIN());
				//
				// matchProductDto.setSmallImg(
				// p.getAttributeSets().getAttributeSet().get(0).getValue().getSmallImage().getURL());
				// matchProductDto.setBrandName(p.getAttributeSets().getAttributeSet().get(0).getValue().getBrand());
				matchProductDto = MwsConfigBuilder.buildProductDetail(p.getIdentifiers(), p, p.getSalesRankings());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			matchProductDtos.add(matchProductDto);
		}
		return matchProductDtos;
	}

	@RequestMapping(path = "/listMP", method = RequestMethod.GET)
	@ResponseBody
	public List<String> listMarketplaces() {
		return builder.getMarketplaces();
	}

	@RequestMapping(path = "/listQueryContextId", method = RequestMethod.GET)
	@ResponseBody
	public List<String> listQueryContextId(String marketplaceId) {
		if (marketplaceId.equals("美国")) {
			marketplaceId = Contants.MARKETPLACE_ID_US;
		} else {
			marketplaceId = Contants.MARKETPLACE_ID_CA;
		}
		return QueryContextIdContants.getQueryContextByMarket(marketplaceId);
	}

}
