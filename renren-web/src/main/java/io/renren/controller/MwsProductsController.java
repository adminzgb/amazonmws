package io.renren.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazonaws.common.Contants;
import com.amazonaws.mws.myModel.ListMatchingProductsRequest;
import com.amazonaws.mws.samples.mySamples.ListMatchingProductsSample;

import io.renren.common.MwsConfigBuilder;
import io.renren.entity.MwsSellerEntity;

@Controller
@RequestMapping("mwsseller")
public class MwsProductsController {

	/**
	 * 信息
	 */
	@RequestMapping("/info")
	public String info(Map<String, Object> source) {
		MwsConfigBuilder builder = new MwsConfigBuilder();

		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		ListMatchingProductsRequest request = new ListMatchingProductsRequest();
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		request.setQuery(source.get("query").toString());
		request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdUs());
		request.setQueryContextId(
				source.get("queryContextId") == null ? null : source.get("queryContextId").toString());
		ListMatchingProductsSample.invokeListMatchingProducts(builder.getMwsService(), request);

	}

}
