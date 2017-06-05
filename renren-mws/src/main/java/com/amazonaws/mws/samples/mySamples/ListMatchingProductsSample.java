/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package com.amazonaws.mws.samples.mySamples;

import com.amazonaws.common.Contants;
import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.ResponseMetadata;
import com.amazonaws.mws.model.response.GetMatchingProductForIdRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsRequest;
import com.amazonaws.mws.model.response.ListMatchingProductsResponse;

/**
 *
 * Get Feed Submission Count  Samples
 *
 *
 */
public class ListMatchingProductsSample {

    /**
     * Just add a few required parameters, and try the service
     * Get Feed Submission Count functionality
     *
     * @param args unused
     */
    public static void main(String... args) {
        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
        final String accessKeyId = Contants.ACCESS_KEY_ID;
        final String secretAccessKey = Contants.SECRET_ACCESS_KEY;

        final String appName = Contants.APP_NAME;
        final String appVersion = Contants.APP_VERSION;

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the correct MWS endpoint.
         ************************************************************************/
        // US
        config.setServiceURL("https://mws.amazonservices.com/Products/2011-10-01");
        // UK
        // config.setServiceURL("https://mws.amazonservices.co.uk/");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de/");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr/");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it/");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp/");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn/");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca/");
        // India
        // config.setServiceURL("https://mws.amazonservices.in/");

        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service        
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

        /************************************************************************
         * Uncomment to try out Mock Service that simulates Marketplace Web Service 
         * responses without calling Marketplace Web Service  service.
         *
         * Responses are loaded from local XML files. You can tweak XML files to
         * experiment with various outputs during development
         *
         * XML files available under com/amazonaws/mws/mock tree
         *
         ***********************************************************************/
        // MarketplaceWebService service = new MarketplaceWebServiceMock();

        /************************************************************************
         * Setup request parameters and uncomment invoke to try out 
         * sample for Get Feed Submission Count 
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all 
         * Marketplace Web Service calls.
         ***********************************************************************/
        final String sellerId = Contants.SELLER_ID;
        final String sellerDevAuthToken = Contants.MWS_Auth_Token;

        ListMatchingProductsRequest request = new ListMatchingProductsRequest();
        request.setSellerId(sellerId);
        request.setMWSAuthToken(sellerDevAuthToken);
//        request.setMarketplace(Contants.MARKETPLACE_ID_US);
        request.setQuery("bell");
        request.setMarketplaceId(Contants.MARKETPLACE_ID_US);
        request.setQueryContextId("tools");
        
        
        //request.setMWSAuthToken(sellerDevAuthToken);

        // @TODO: set request parameters here

        invokeListMatchingProducts(service, request);

    }



    /**
     * Get Feed Submission Count  request sample
     * returns the number of feeds matching all of the specified criteria
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static ListMatchingProductsResponse invokeListMatchingProducts(MarketplaceWebService service, ListMatchingProductsRequest request) {
        try {
        	service.setEndpoint("https://mws.amazonservices.com/Products/2011-10-01");
            ListMatchingProductsResponse response = service.listMatchingProducts(request);
            

            System.out.println ("ListMatchingProducts Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    ListMatchingProductsResponse");
            System.out.println();
            if (response.isSetListMatchingProductsResult()) {
                System.out.print("        GetFeedSubmissionCountResult");
                System.out.println();
//                GetFeedSubmissionCountResult  getFeedSubmissionCountResult = response.getGetFeedSubmissionCountResult();
//                if (getFeedSubmissionCountResult.isSetCount()) {
//                    System.out.print("            Count");
//                    System.out.println();
//                    System.out.print("                " + getFeedSubmissionCountResult.getCount());
//                    System.out.println();
//                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();
            return response;

        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            return null;
        }
    }
    
    
    /**
     * Get Feed Submission Count  request sample
     * returns the number of feeds matching all of the specified criteria
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static ListMatchingProductsResponse invokeGetMatchingProductForId(MarketplaceWebService service, GetMatchingProductForIdRequest request) {
        try {
        	service.setEndpoint("https://mws.amazonservices.com/Products/2011-10-01");
            ListMatchingProductsResponse response = service.getMatchingProductForId(request);
            

            System.out.println ("GetMatchingProductForId Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    ListMatchingProductsResponse");
            System.out.println();
            if (response.isSetListMatchingProductsResult()) {
                System.out.print("        GetFeedSubmissionCountResult");
                System.out.println();
//                GetFeedSubmissionCountResult  getFeedSubmissionCountResult = response.getGetFeedSubmissionCountResult();
//                if (getFeedSubmissionCountResult.isSetCount()) {
//                    System.out.print("            Count");
//                    System.out.println();
//                    System.out.print("                " + getFeedSubmissionCountResult.getCount());
//                    System.out.println();
//                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();
            return response;

        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            return null;
        }
    }

}
