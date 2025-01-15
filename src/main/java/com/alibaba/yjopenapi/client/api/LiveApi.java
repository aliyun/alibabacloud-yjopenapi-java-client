/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.LiveQueryStatusResult;
import com.alibaba.yjopenapi.client.model.LiveStartGameLiveFormsConfig;
import com.alibaba.yjopenapi.client.model.LiveStartGameLiveResult;
import com.alibaba.yjopenapi.client.model.LiveStopGameLiveResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public LiveApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public LiveApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for queryStatus
     * @param varForms LiveQueryStatusForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryStatusCall(LiveQueryStatusForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/live/queryStatus";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
        if (varForms.getLiveId() != null) {
            localVarFormParams.put("liveId", varForms.getLiveId());
        }

        final List<String> localVarAccepts = Arrays.asList(
            "application/json"
        );
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final List<String> localVarContentTypes = Arrays.asList(
            "application/x-www-form-urlencoded"
        );
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String path = configuration.getScheme() + "://" + configuration.getHost() + localVarPath;
        return apiClient.buildCall(path, "POST", localVarQueryParams, localVarHeaderParams, localVarFormParams, configuration);
    }
    
    private com.squareup.okhttp.Call queryStatusValidateBeforeCall(LiveQueryStatusForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling queryStatus(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling queryStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = queryStatusCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms LiveQueryStatusForms
     * @return LiveQueryStatusResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveQueryStatusResult queryStatus(LiveQueryStatusForms varForms) throws ApiException {
        ApiResponse<LiveQueryStatusResult> resp = queryStatusWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms LiveQueryStatusForms
     * @return ApiResponse&lt;LiveQueryStatusResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveQueryStatusResult> queryStatusWithHttpInfo(LiveQueryStatusForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = queryStatusValidateBeforeCall(varForms);
        return apiClient.execute(call, LiveQueryStatusResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms LiveQueryStatusForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryStatusAsync(LiveQueryStatusForms varForms, final ApiCallback<LiveQueryStatusResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryStatusValidateBeforeCall(varForms);
        apiClient.executeAsync(call, LiveQueryStatusResult.class, callback);
        return call;
    }
    /**
     * Build call for startGameLive
     * @param varForms LiveStartGameLiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startGameLiveCall(LiveStartGameLiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/live/startGameLive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("serverUrl", varForms.getServerUrl());
        localVarFormParams.put("streamKey", varForms.getStreamKey());
        if (varForms.getConfig() != null) {
            localVarFormParams.put("config", varForms.getConfig());
        }

        final List<String> localVarAccepts = Arrays.asList(
            "application/json"
        );
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final List<String> localVarContentTypes = Arrays.asList(
            "application/x-www-form-urlencoded"
        );
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String path = configuration.getScheme() + "://" + configuration.getHost() + localVarPath;
        return apiClient.buildCall(path, "POST", localVarQueryParams, localVarHeaderParams, localVarFormParams, configuration);
    }
    
    private com.squareup.okhttp.Call startGameLiveValidateBeforeCall(LiveStartGameLiveForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling startGameLive(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling startGameLive(Async)");
        }
        // verify the required parameter 'serverUrl' is set
        if (varForms.getServerUrl() == null) {
            throw new ApiException("Missing the required parameter 'serverUrl' when calling startGameLive(Async)");
        }
        // verify the required parameter 'streamKey' is set
        if (varForms.getStreamKey() == null) {
            throw new ApiException("Missing the required parameter 'streamKey' when calling startGameLive(Async)");
        }
        
        com.squareup.okhttp.Call call = startGameLiveCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms LiveStartGameLiveForms
     * @return LiveStartGameLiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveStartGameLiveResult startGameLive(LiveStartGameLiveForms varForms) throws ApiException {
        ApiResponse<LiveStartGameLiveResult> resp = startGameLiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms LiveStartGameLiveForms
     * @return ApiResponse&lt;LiveStartGameLiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveStartGameLiveResult> startGameLiveWithHttpInfo(LiveStartGameLiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = startGameLiveValidateBeforeCall(varForms);
        return apiClient.execute(call, LiveStartGameLiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms LiveStartGameLiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startGameLiveAsync(LiveStartGameLiveForms varForms, final ApiCallback<LiveStartGameLiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = startGameLiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, LiveStartGameLiveResult.class, callback);
        return call;
    }
    /**
     * Build call for stopGameLive
     * @param varForms LiveStopGameLiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopGameLiveCall(LiveStopGameLiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/live/stopGameLive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
        if (varForms.getLiveId() != null) {
            localVarFormParams.put("liveId", varForms.getLiveId());
        }

        final List<String> localVarAccepts = Arrays.asList(
            "application/json"
        );
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final List<String> localVarContentTypes = Arrays.asList(
            "application/x-www-form-urlencoded"
        );
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String path = configuration.getScheme() + "://" + configuration.getHost() + localVarPath;
        return apiClient.buildCall(path, "POST", localVarQueryParams, localVarHeaderParams, localVarFormParams, configuration);
    }
    
    private com.squareup.okhttp.Call stopGameLiveValidateBeforeCall(LiveStopGameLiveForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling stopGameLive(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling stopGameLive(Async)");
        }
        
        com.squareup.okhttp.Call call = stopGameLiveCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms LiveStopGameLiveForms
     * @return LiveStopGameLiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveStopGameLiveResult stopGameLive(LiveStopGameLiveForms varForms) throws ApiException {
        ApiResponse<LiveStopGameLiveResult> resp = stopGameLiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms LiveStopGameLiveForms
     * @return ApiResponse&lt;LiveStopGameLiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveStopGameLiveResult> stopGameLiveWithHttpInfo(LiveStopGameLiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = stopGameLiveValidateBeforeCall(varForms);
        return apiClient.execute(call, LiveStopGameLiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms LiveStopGameLiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopGameLiveAsync(LiveStopGameLiveForms varForms, final ApiCallback<LiveStopGameLiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = stopGameLiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, LiveStopGameLiveResult.class, callback);
        return call;
    }
}
