package io.renren.web.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.model.response.ListMatchingProductsRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsResponse;
import com.amazonaws.mws.model.response.ProductType;
import com.amazonaws.mws.samples.mySamples.ListMatchingProductsSample;

import io.renren.common.MwsConfigBuilder;
import io.renren.entity.MwsSellerEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-jdbc.xml","classpath*:renren-*.xml"})
public class TestMwsProductsController extends AbstractJUnit4SpringContextTests {

	@Autowired
	MwsConfigBuilder builder;

	@Test
	public void info() {
		ListMatchingProductsRequest request = new ListMatchingProductsRequest();
		MwsSellerEntity mwsSellerEntity = builder.getMwsSellerEntity();
		request.setQuery("bell");
		request.setQueryContextId("tools");
		request.setMarketplaceId(mwsSellerEntity.getMarketplaceIdUs());
		request.setSellerId(mwsSellerEntity.getSellerId());
		request.setMWSAuthToken(mwsSellerEntity.getMwsAuthToken());
		MarketplaceWebService service = MwsConfigBuilder.getMwsService();

		ListMatchingProductsResponse response = ListMatchingProductsSample.invokeListMatchingProducts(service, request);
		// return response;
		List<ProductType> productTypes = response.getListMatchingProductsResult().getProducts().getProduct();
		productTypes.toString();
	}

}
