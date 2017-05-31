package io.renren.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.amazonaws.common.Contants;
import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.model.response.ListMatchingProductsRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsResponse;
import com.amazonaws.mws.samples.mySamples.ListMatchingProductsSample;

import io.renren.common.MwsConfigBuilder;
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
	public ListMatchingProductsResponse info(ListMatchingProductsRequest request, HttpServletRequest request2) {
		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		MarketplaceWebService service = builder.getMwsService("https://mws.amazonservices.com/Products/2011-10-01");

		ListMatchingProductsResponse response = ListMatchingProductsSample
				.invokeListMatchingProducts(service, request);
		return response;

	}

}
