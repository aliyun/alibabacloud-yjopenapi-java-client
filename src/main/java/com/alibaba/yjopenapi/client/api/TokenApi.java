/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.GetPairResult;
import com.alibaba.yjopenapi.client.model.GetTripleResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public TokenApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public TokenApi(ApiClient apiClient, Configuration configuration) {
        this.apiClient = apiClient;
        this.configuration = configuration;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Build call for getPair
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPairCall() throws ApiException {
        
        // create path and map variables
        String localVarPath = "/sts?type=pair";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final List<String> localVarAccepts = Arrays.asList(
            "application/json"
        );
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final List<String> localVarContentTypes = Arrays.asList(
            
        );
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String path = configuration.getScheme() + "://" + configuration.getHost() + localVarPath;
        return apiClient.buildCall(path, "POST", localVarQueryParams, localVarHeaderParams, localVarFormParams, configuration);
    }
    
    private com.squareup.okhttp.Call getPairValidateBeforeCall() throws ApiException {
        
        com.squareup.okhttp.Call call = getPairCall();
        return call;
    }

    /**
     * 
     * 获取临时安全令牌(二元组)
     * @return GetPairResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPairResult getPair() throws ApiException {
        ApiResponse<GetPairResult> resp = getPairWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * 获取临时安全令牌(二元组)
     * @return ApiResponse&lt;GetPairResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPairResult> getPairWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getPairValidateBeforeCall();
        return apiClient.execute(call, GetPairResult.class);
    }

    /**
     *  (asynchronously)
     * 获取临时安全令牌(二元组)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPairAsync(final ApiCallback<GetPairResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getPairValidateBeforeCall();
        apiClient.executeAsync(call, GetPairResult.class, callback);
        return call;
    }
    /**
     * Build call for getTriple
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTripleCall() throws ApiException {
        
        // create path and map variables
        String localVarPath = "/sts";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final List<String> localVarAccepts = Arrays.asList(
            "application/json"
        );
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final List<String> localVarContentTypes = Arrays.asList(
            
        );
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String path = configuration.getScheme() + "://" + configuration.getHost() + localVarPath;
        return apiClient.buildCall(path, "POST", localVarQueryParams, localVarHeaderParams, localVarFormParams, configuration);
    }
    
    private com.squareup.okhttp.Call getTripleValidateBeforeCall() throws ApiException {
        
        com.squareup.okhttp.Call call = getTripleCall();
        return call;
    }

    /**
     * 
     * 获取临时安全令牌
     * @return GetTripleResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTripleResult getTriple() throws ApiException {
        ApiResponse<GetTripleResult> resp = getTripleWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * 获取临时安全令牌
     * @return ApiResponse&lt;GetTripleResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTripleResult> getTripleWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getTripleValidateBeforeCall();
        return apiClient.execute(call, GetTripleResult.class);
    }

    /**
     *  (asynchronously)
     * 获取临时安全令牌
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTripleAsync(final ApiCallback<GetTripleResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getTripleValidateBeforeCall();
        apiClient.executeAsync(call, GetTripleResult.class, callback);
        return call;
    }
}
