package io.renren.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.model.response.ListMatchingProductsRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsResponse;
import com.amazonaws.mws.model.response.ProductType;
import com.amazonaws.mws.samples.mySamples.ListMatchingProductsSample;

import io.renren.common.MwsConfigBuilder;
import io.renren.dto.MatchProductDto;
import io.renren.entity.MwsSellerEntity;

@RestController
@RequestMapping("mwsseller")
public class MwsProductsController {

	@Autowired
	MwsConfigBuilder builder;

	/**
	 * 信息
	 */
	@RequestMapping(path = "/info", method = RequestMethod.POST)
	@ResponseBody
	public List<MatchProductDto> info(ListMatchingProductsRequest request, HttpServletRequest request2) {
		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		List<MatchProductDto> matchProductDtos = new ArrayList<>();
		if (request.getMarketplaceId().equals("美国")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdUs());
		} else if (request.getMarketplaceId().equals("加拿大")) {
			request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdCa());
		}
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		MarketplaceWebService service = builder.getMwsService("https://mws.amazonservices.com/Products/2011-10-01");

		ListMatchingProductsResponse response = ListMatchingProductsSample.invokeListMatchingProducts(service, request);
		// return response;
		List<ProductType> productTypes = response.getListMatchingProductsResult().getProducts().getProduct();
		for (ProductType p : productTypes) {
			MatchProductDto matchProductDto = new MatchProductDto();
			try {
				matchProductDto.setASIN(p.getIdentifiers().getMarketplaceASIN().getASIN());

				matchProductDto
						.setPrice(p.getAttributeSets().getAttributeSet().get(0).getValue().getListPrice().getAmount());
				matchProductDto.setSmallImg(
						p.getAttributeSets().getAttributeSet().get(0).getValue().getSmallImage().getURL());
				matchProductDto.setBrandName(p.getAttributeSets().getAttributeSet().get(0).getValue().getBrand());
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

}
