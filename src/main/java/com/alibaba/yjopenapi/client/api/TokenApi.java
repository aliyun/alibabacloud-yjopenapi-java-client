/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

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
     * ????????????????????????
     * @return GetTripleResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTripleResult getTriple() throws ApiException {
        ApiResponse<GetTripleResult> resp = getTripleWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * ????????????????????????
     * @return ApiResponse&lt;GetTripleResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTripleResult> getTripleWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getTripleValidateBeforeCall();
        return apiClient.execute(call, GetTripleResult.class);
    }

    /**
     *  (asynchronously)
     * ????????????????????????
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
