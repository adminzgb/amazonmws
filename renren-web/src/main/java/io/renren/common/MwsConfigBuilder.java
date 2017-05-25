package io.renren.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;

import io.renren.entity.MwsSellerEntity;
import io.renren.service.MwsSellerService;
import io.renren.utils.ShiroUtils;

/**
 * mws商家信息生成器
 * 
 * @author Administrator
 *
 */
@Service
public final class MwsConfigBuilder {

	private MarketplaceWebService service;

	@Autowired
	private MwsSellerService mwsSellerService;

	public MwsSellerEntity getMwsSellerEntity(){
		Map<String, Object> source = new HashMap<>();
		source.put("user_id", ShiroUtils.getUserEntity().getUserId().toString());
		java.util.List<MwsSellerEntity> response = new ArrayList<MwsSellerEntity>();
		mwsSellerService.queryList(source);
		if (response == null || response.isEmpty()) {
			return null;
		}
		MwsSellerEntity entity = response.get(0);
		return entity;
	}
	
	public MarketplaceWebService getMwsService() {
		Map<String, Object> source = new HashMap<>();
		source.put("user_id", ShiroUtils.getUserEntity().getUserId().toString());
		java.util.List<MwsSellerEntity> response = new ArrayList<MwsSellerEntity>();
		mwsSellerService.queryList(source);
		if (response == null || response.isEmpty()) {
			return null;
		}
		MwsSellerEntity entity = response.get(0);
		final String accessKeyId = entity.getAccessKeyId();
		final String secretAccessKey = entity.getSecretAccessKey();
		final String appName = entity.getAppName();
		final String appVersion = entity.getAppVersion();
		MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

		/************************************************************************
		 * Uncomment to set the correct MWS endpoint.
		 ************************************************************************/
		// US
		config.setServiceURL("https://mws.amazonservices.com");

		/************************************************************************
		 * You can also try advanced configuration options. Available options
		 * are:
		 *
		 * - Signature Version - Proxy Host and Proxy Port - User Agent String
		 * to be sent to Marketplace Web Service
		 *
		 ***********************************************************************/

		/************************************************************************
		 * Instantiate Http Client Implementation of Marketplace Web Service
		 ***********************************************************************/

		service = new MarketplaceWebServiceClient(accessKeyId, secretAccessKey, appName, appVersion, config);
		return service;
	}
}
