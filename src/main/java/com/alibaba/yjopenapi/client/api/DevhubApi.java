/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.DevHubDownloadGameLogOverResult;
import com.alibaba.yjopenapi.client.model.DevHubQueryGameProjectResult;
import com.alibaba.yjopenapi.client.model.DevHubQueryGameProjectVersionResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevhubApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public DevhubApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public DevhubApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for downloadGameLogOver
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadGameLogOverCall() throws ApiException {
        
        // create path and map variables
        String localVarPath = "/devHub/downloadGameLogOver";

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
    
    private com.squareup.okhttp.Call downloadGameLogOverValidateBeforeCall() throws ApiException {
        
        com.squareup.okhttp.Call call = downloadGameLogOverCall();
        return call;
    }

    /**
     * 
     * downloadGameLogOver
     * @return DevHubDownloadGameLogOverResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DevHubDownloadGameLogOverResult downloadGameLogOver() throws ApiException {
        ApiResponse<DevHubDownloadGameLogOverResult> resp = downloadGameLogOverWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * downloadGameLogOver
     * @return ApiResponse&lt;DevHubDownloadGameLogOverResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DevHubDownloadGameLogOverResult> downloadGameLogOverWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = downloadGameLogOverValidateBeforeCall();
        return apiClient.execute(call, DevHubDownloadGameLogOverResult.class);
    }

    /**
     *  (asynchronously)
     * downloadGameLogOver
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadGameLogOverAsync(final ApiCallback<DevHubDownloadGameLogOverResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = downloadGameLogOverValidateBeforeCall();
        apiClient.executeAsync(call, DevHubDownloadGameLogOverResult.class, callback);
        return call;
    }
    /**
     * Build call for queryGameProject
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryGameProjectCall() throws ApiException {
        
        // create path and map variables
        String localVarPath = "/devHub/queryGameProject";

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
    
    private com.squareup.okhttp.Call queryGameProjectValidateBeforeCall() throws ApiException {
        
        com.squareup.okhttp.Call call = queryGameProjectCall();
        return call;
    }

    /**
     * 
     * openapiDevhubQueryGameProject
     * @return DevHubQueryGameProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DevHubQueryGameProjectResult queryGameProject() throws ApiException {
        ApiResponse<DevHubQueryGameProjectResult> resp = queryGameProjectWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * openapiDevhubQueryGameProject
     * @return ApiResponse&lt;DevHubQueryGameProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DevHubQueryGameProjectResult> queryGameProjectWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = queryGameProjectValidateBeforeCall();
        return apiClient.execute(call, DevHubQueryGameProjectResult.class);
    }

    /**
     *  (asynchronously)
     * openapiDevhubQueryGameProject
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryGameProjectAsync(final ApiCallback<DevHubQueryGameProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryGameProjectValidateBeforeCall();
        apiClient.executeAsync(call, DevHubQueryGameProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for queryGameProjectVersion
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryGameProjectVersionCall() throws ApiException {
        
        // create path and map variables
        String localVarPath = "/devHub/queryGameProjectVersion";

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
    
    private com.squareup.okhttp.Call queryGameProjectVersionValidateBeforeCall() throws ApiException {
        
        com.squareup.okhttp.Call call = queryGameProjectVersionCall();
        return call;
    }

    /**
     * 
     * queryGameProjectVersion
     * @return DevHubQueryGameProjectVersionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DevHubQueryGameProjectVersionResult queryGameProjectVersion() throws ApiException {
        ApiResponse<DevHubQueryGameProjectVersionResult> resp = queryGameProjectVersionWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * queryGameProjectVersion
     * @return ApiResponse&lt;DevHubQueryGameProjectVersionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DevHubQueryGameProjectVersionResult> queryGameProjectVersionWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = queryGameProjectVersionValidateBeforeCall();
        return apiClient.execute(call, DevHubQueryGameProjectVersionResult.class);
    }

    /**
     *  (asynchronously)
     * queryGameProjectVersion
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryGameProjectVersionAsync(final ApiCallback<DevHubQueryGameProjectVersionResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryGameProjectVersionValidateBeforeCall();
        apiClient.executeAsync(call, DevHubQueryGameProjectVersionResult.class, callback);
        return call;
    }
}
