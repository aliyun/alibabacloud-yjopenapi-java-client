/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.MultiplayCloseResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoCloseMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoInitMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoJoinMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoLeaveMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoModifyMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayDemoQueryMultiPlayResult;
import com.alibaba.yjopenapi.client.model.MultiplayInitFormsConfig;
import com.alibaba.yjopenapi.client.model.MultiplayInitFormsTokens;
import com.alibaba.yjopenapi.client.model.MultiplayInitResult;
import com.alibaba.yjopenapi.client.model.MultiplayJoinResult;
import com.alibaba.yjopenapi.client.model.MultiplayLeaveResult;
import com.alibaba.yjopenapi.client.model.MultiplayModifyFormsTokens;
import com.alibaba.yjopenapi.client.model.MultiplayModifyResult;
import com.alibaba.yjopenapi.client.model.MultiplayQueryResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiplayApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public MultiplayApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public MultiplayApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for close
     * @param varForms MultiplayCloseForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call closeCall(MultiplayCloseForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/close/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mpId", varForms.getMpId());
        if (varForms.getReason() != null) {
            localVarFormParams.put("reason", varForms.getReason());
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
    
    private com.squareup.okhttp.Call closeValidateBeforeCall(MultiplayCloseForms varForms) throws ApiException {
        // verify the required parameter 'mpId' is set
        if (varForms.getMpId() == null) {
            throw new ApiException("Missing the required parameter 'mpId' when calling close(Async)");
        }
        
        com.squareup.okhttp.Call call = closeCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayCloseForms
     * @return MultiplayCloseResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayCloseResult close(MultiplayCloseForms varForms) throws ApiException {
        ApiResponse<MultiplayCloseResult> resp = closeWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayCloseForms
     * @return ApiResponse&lt;MultiplayCloseResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayCloseResult> closeWithHttpInfo(MultiplayCloseForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = closeValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayCloseResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayCloseForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call closeAsync(MultiplayCloseForms varForms, final ApiCallback<MultiplayCloseResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = closeValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayCloseResult.class, callback);
        return call;
    }
    /**
     * Build call for demoCloseMultiPlay
     * @param varForms MultiplayDemoCloseMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoCloseMultiPlayCall(MultiplayDemoCloseMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoCloseMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getMpId() != null) {
            localVarFormParams.put("mpId", varForms.getMpId());
        }
        if (varForms.getReason() != null) {
            localVarFormParams.put("reason", varForms.getReason());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
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
    
    private com.squareup.okhttp.Call demoCloseMultiPlayValidateBeforeCall(MultiplayDemoCloseMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoCloseMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机demo关闭联机
     * @param varForms MultiplayDemoCloseMultiPlayForms
     * @return MultiplayDemoCloseMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoCloseMultiPlayResult demoCloseMultiPlay(MultiplayDemoCloseMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoCloseMultiPlayResult> resp = demoCloseMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机demo关闭联机
     * @param varForms MultiplayDemoCloseMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoCloseMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoCloseMultiPlayResult> demoCloseMultiPlayWithHttpInfo(MultiplayDemoCloseMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoCloseMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoCloseMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机demo关闭联机
     * @param varForms MultiplayDemoCloseMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoCloseMultiPlayAsync(MultiplayDemoCloseMultiPlayForms varForms, final ApiCallback<MultiplayDemoCloseMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoCloseMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoCloseMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for demoInitMultiPlay
     * @param varForms MultiplayDemoInitMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoInitMultiPlayCall(MultiplayDemoInitMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoInitMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getGameId() != null) {
            localVarFormParams.put("gameId", varForms.getGameId());
        }
        if (varForms.getGameSession() != null) {
            localVarFormParams.put("gameSession", varForms.getGameSession());
        }
        if (varForms.getAppKey() != null) {
            localVarFormParams.put("appKey", varForms.getAppKey());
        }
        if (varForms.getConfig() != null) {
            localVarFormParams.put("config", varForms.getConfig());
        }
        if (varForms.getSchedulerConfig() != null) {
            localVarFormParams.put("schedulerConfig", varForms.getSchedulerConfig());
        }
        if (varForms.getTokens() != null) {
            localVarFormParams.put("tokens", varForms.getTokens());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
        }
        if (varForms.getAccountId() != null) {
            localVarFormParams.put("accountId", varForms.getAccountId());
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
    
    private com.squareup.okhttp.Call demoInitMultiPlayValidateBeforeCall(MultiplayDemoInitMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoInitMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机demo初始化联机
     * @param varForms MultiplayDemoInitMultiPlayForms
     * @return MultiplayDemoInitMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoInitMultiPlayResult demoInitMultiPlay(MultiplayDemoInitMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoInitMultiPlayResult> resp = demoInitMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机demo初始化联机
     * @param varForms MultiplayDemoInitMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoInitMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoInitMultiPlayResult> demoInitMultiPlayWithHttpInfo(MultiplayDemoInitMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoInitMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoInitMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机demo初始化联机
     * @param varForms MultiplayDemoInitMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoInitMultiPlayAsync(MultiplayDemoInitMultiPlayForms varForms, final ApiCallback<MultiplayDemoInitMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoInitMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoInitMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for demoJoinMultiPlay
     * @param varForms MultiplayDemoJoinMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoJoinMultiPlayCall(MultiplayDemoJoinMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoJoinMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getMpId() != null) {
            localVarFormParams.put("mpId", varForms.getMpId());
        }
        if (varForms.getControlId() != null) {
            localVarFormParams.put("controlId", varForms.getControlId());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
        }
        if (varForms.getAccountId() != null) {
            localVarFormParams.put("accountId", varForms.getAccountId());
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
    
    private com.squareup.okhttp.Call demoJoinMultiPlayValidateBeforeCall(MultiplayDemoJoinMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoJoinMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机Demo加入联机接口
     * @param varForms MultiplayDemoJoinMultiPlayForms
     * @return MultiplayDemoJoinMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoJoinMultiPlayResult demoJoinMultiPlay(MultiplayDemoJoinMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoJoinMultiPlayResult> resp = demoJoinMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机Demo加入联机接口
     * @param varForms MultiplayDemoJoinMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoJoinMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoJoinMultiPlayResult> demoJoinMultiPlayWithHttpInfo(MultiplayDemoJoinMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoJoinMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoJoinMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机Demo加入联机接口
     * @param varForms MultiplayDemoJoinMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoJoinMultiPlayAsync(MultiplayDemoJoinMultiPlayForms varForms, final ApiCallback<MultiplayDemoJoinMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoJoinMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoJoinMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for demoLeaveMultiPlay
     * @param varForms MultiplayDemoLeaveMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoLeaveMultiPlayCall(MultiplayDemoLeaveMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoLeaveMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getMpId() != null) {
            localVarFormParams.put("mpId", varForms.getMpId());
        }
        if (varForms.getTokenIds() != null) {
            localVarFormParams.put("tokenIds", varForms.getTokenIds());
        }
        if (varForms.getKickOut() != null) {
            localVarFormParams.put("kickOut", varForms.getKickOut());
        }
        if (varForms.getReason() != null) {
            localVarFormParams.put("reason", varForms.getReason());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
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
    
    private com.squareup.okhttp.Call demoLeaveMultiPlayValidateBeforeCall(MultiplayDemoLeaveMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoLeaveMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机demo离开联机
     * @param varForms MultiplayDemoLeaveMultiPlayForms
     * @return MultiplayDemoLeaveMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoLeaveMultiPlayResult demoLeaveMultiPlay(MultiplayDemoLeaveMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoLeaveMultiPlayResult> resp = demoLeaveMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机demo离开联机
     * @param varForms MultiplayDemoLeaveMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoLeaveMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoLeaveMultiPlayResult> demoLeaveMultiPlayWithHttpInfo(MultiplayDemoLeaveMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoLeaveMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoLeaveMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机demo离开联机
     * @param varForms MultiplayDemoLeaveMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoLeaveMultiPlayAsync(MultiplayDemoLeaveMultiPlayForms varForms, final ApiCallback<MultiplayDemoLeaveMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoLeaveMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoLeaveMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for demoModifyMultiPlay
     * @param varForms MultiplayDemoModifyMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoModifyMultiPlayCall(MultiplayDemoModifyMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoModifyMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getMpId() != null) {
            localVarFormParams.put("mpId", varForms.getMpId());
        }
        if (varForms.getTokens() != null) {
            localVarFormParams.put("tokens", varForms.getTokens());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
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
    
    private com.squareup.okhttp.Call demoModifyMultiPlayValidateBeforeCall(MultiplayDemoModifyMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoModifyMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机demo修改联机
     * @param varForms MultiplayDemoModifyMultiPlayForms
     * @return MultiplayDemoModifyMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoModifyMultiPlayResult demoModifyMultiPlay(MultiplayDemoModifyMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoModifyMultiPlayResult> resp = demoModifyMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机demo修改联机
     * @param varForms MultiplayDemoModifyMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoModifyMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoModifyMultiPlayResult> demoModifyMultiPlayWithHttpInfo(MultiplayDemoModifyMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoModifyMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoModifyMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机demo修改联机
     * @param varForms MultiplayDemoModifyMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoModifyMultiPlayAsync(MultiplayDemoModifyMultiPlayForms varForms, final ApiCallback<MultiplayDemoModifyMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoModifyMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoModifyMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for demoQueryMultiPlay
     * @param varForms MultiplayDemoQueryMultiPlayForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call demoQueryMultiPlayCall(MultiplayDemoQueryMultiPlayForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/demoQueryMultiPlay";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getMpId() != null) {
            localVarFormParams.put("mpId", varForms.getMpId());
        }
        if (varForms.getOpenAk() != null) {
            localVarFormParams.put("openAk", varForms.getOpenAk());
        }
        if (varForms.getOpenSk() != null) {
            localVarFormParams.put("openSk", varForms.getOpenSk());
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
    
    private com.squareup.okhttp.Call demoQueryMultiPlayValidateBeforeCall(MultiplayDemoQueryMultiPlayForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = demoQueryMultiPlayCall(varForms);
        return call;
    }

    /**
     * 
     * 联机demo查询联机接口
     * @param varForms MultiplayDemoQueryMultiPlayForms
     * @return MultiplayDemoQueryMultiPlayResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayDemoQueryMultiPlayResult demoQueryMultiPlay(MultiplayDemoQueryMultiPlayForms varForms) throws ApiException {
        ApiResponse<MultiplayDemoQueryMultiPlayResult> resp = demoQueryMultiPlayWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 联机demo查询联机接口
     * @param varForms MultiplayDemoQueryMultiPlayForms
     * @return ApiResponse&lt;MultiplayDemoQueryMultiPlayResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayDemoQueryMultiPlayResult> demoQueryMultiPlayWithHttpInfo(MultiplayDemoQueryMultiPlayForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = demoQueryMultiPlayValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayDemoQueryMultiPlayResult.class);
    }

    /**
     *  (asynchronously)
     * 联机demo查询联机接口
     * @param varForms MultiplayDemoQueryMultiPlayForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call demoQueryMultiPlayAsync(MultiplayDemoQueryMultiPlayForms varForms, final ApiCallback<MultiplayDemoQueryMultiPlayResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = demoQueryMultiPlayValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayDemoQueryMultiPlayResult.class, callback);
        return call;
    }
    /**
     * Build call for init
     * @param varForms MultiplayInitForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call initCall(MultiplayInitForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/init/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("appKey", varForms.getAppKey());
        if (varForms.getConfig() != null) {
            localVarFormParams.put("config", varForms.getConfig());
        }
        if (varForms.getTokens() != null) {
            localVarFormParams.put("tokens", varForms.getTokens());
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
    
    private com.squareup.okhttp.Call initValidateBeforeCall(MultiplayInitForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling init(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling init(Async)");
        }
        
        com.squareup.okhttp.Call call = initCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayInitForms
     * @return MultiplayInitResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayInitResult init(MultiplayInitForms varForms) throws ApiException {
        ApiResponse<MultiplayInitResult> resp = initWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayInitForms
     * @return ApiResponse&lt;MultiplayInitResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayInitResult> initWithHttpInfo(MultiplayInitForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = initValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayInitResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayInitForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call initAsync(MultiplayInitForms varForms, final ApiCallback<MultiplayInitResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = initValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayInitResult.class, callback);
        return call;
    }
    /**
     * Build call for join
     * @param varForms MultiplayJoinForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call joinCall(MultiplayJoinForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/join/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mpId", varForms.getMpId());
        localVarFormParams.put("accountId", varForms.getAccountId());
        if (varForms.getControlId() != null) {
            localVarFormParams.put("controlId", varForms.getControlId());
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
    
    private com.squareup.okhttp.Call joinValidateBeforeCall(MultiplayJoinForms varForms) throws ApiException {
        // verify the required parameter 'mpId' is set
        if (varForms.getMpId() == null) {
            throw new ApiException("Missing the required parameter 'mpId' when calling join(Async)");
        }
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling join(Async)");
        }
        
        com.squareup.okhttp.Call call = joinCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayJoinForms
     * @return MultiplayJoinResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayJoinResult join(MultiplayJoinForms varForms) throws ApiException {
        ApiResponse<MultiplayJoinResult> resp = joinWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayJoinForms
     * @return ApiResponse&lt;MultiplayJoinResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayJoinResult> joinWithHttpInfo(MultiplayJoinForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = joinValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayJoinResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayJoinForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call joinAsync(MultiplayJoinForms varForms, final ApiCallback<MultiplayJoinResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = joinValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayJoinResult.class, callback);
        return call;
    }
    /**
     * Build call for leave
     * @param varForms MultiplayLeaveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call leaveCall(MultiplayLeaveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/leave/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mpId", varForms.getMpId());
        localVarFormParams.put("kickOut", varForms.getKickOut());
        if (varForms.getReason() != null) {
            localVarFormParams.put("reason", varForms.getReason());
        }
        localVarFormParams.put("tokenIds", varForms.getTokenIds());

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
    
    private com.squareup.okhttp.Call leaveValidateBeforeCall(MultiplayLeaveForms varForms) throws ApiException {
        // verify the required parameter 'mpId' is set
        if (varForms.getMpId() == null) {
            throw new ApiException("Missing the required parameter 'mpId' when calling leave(Async)");
        }
        // verify the required parameter 'kickOut' is set
        if (varForms.getKickOut() == null) {
            throw new ApiException("Missing the required parameter 'kickOut' when calling leave(Async)");
        }
        // verify the required parameter 'tokenIds' is set
        if (varForms.getTokenIds() == null) {
            throw new ApiException("Missing the required parameter 'tokenIds' when calling leave(Async)");
        }
        
        com.squareup.okhttp.Call call = leaveCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayLeaveForms
     * @return MultiplayLeaveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayLeaveResult leave(MultiplayLeaveForms varForms) throws ApiException {
        ApiResponse<MultiplayLeaveResult> resp = leaveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayLeaveForms
     * @return ApiResponse&lt;MultiplayLeaveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayLeaveResult> leaveWithHttpInfo(MultiplayLeaveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = leaveValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayLeaveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayLeaveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call leaveAsync(MultiplayLeaveForms varForms, final ApiCallback<MultiplayLeaveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = leaveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayLeaveResult.class, callback);
        return call;
    }
    /**
     * Build call for modify
     * @param varForms MultiplayModifyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyCall(MultiplayModifyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/modify/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mpId", varForms.getMpId());
        if (varForms.getTokens() != null) {
            localVarFormParams.put("tokens", varForms.getTokens());
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
    
    private com.squareup.okhttp.Call modifyValidateBeforeCall(MultiplayModifyForms varForms) throws ApiException {
        // verify the required parameter 'mpId' is set
        if (varForms.getMpId() == null) {
            throw new ApiException("Missing the required parameter 'mpId' when calling modify(Async)");
        }
        
        com.squareup.okhttp.Call call = modifyCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayModifyForms
     * @return MultiplayModifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayModifyResult modify(MultiplayModifyForms varForms) throws ApiException {
        ApiResponse<MultiplayModifyResult> resp = modifyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayModifyForms
     * @return ApiResponse&lt;MultiplayModifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayModifyResult> modifyWithHttpInfo(MultiplayModifyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = modifyValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayModifyResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayModifyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyAsync(MultiplayModifyForms varForms, final ApiCallback<MultiplayModifyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = modifyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayModifyResult.class, callback);
        return call;
    }
    /**
     * Build call for query
     * @param varForms MultiplayQueryForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryCall(MultiplayQueryForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/query/v2";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mpId", varForms.getMpId());

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
    
    private com.squareup.okhttp.Call queryValidateBeforeCall(MultiplayQueryForms varForms) throws ApiException {
        // verify the required parameter 'mpId' is set
        if (varForms.getMpId() == null) {
            throw new ApiException("Missing the required parameter 'mpId' when calling query(Async)");
        }
        
        com.squareup.okhttp.Call call = queryCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms MultiplayQueryForms
     * @return MultiplayQueryResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiplayQueryResult query(MultiplayQueryForms varForms) throws ApiException {
        ApiResponse<MultiplayQueryResult> resp = queryWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms MultiplayQueryForms
     * @return ApiResponse&lt;MultiplayQueryResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiplayQueryResult> queryWithHttpInfo(MultiplayQueryForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = queryValidateBeforeCall(varForms);
        return apiClient.execute(call, MultiplayQueryResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms MultiplayQueryForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryAsync(MultiplayQueryForms varForms, final ApiCallback<MultiplayQueryResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryValidateBeforeCall(varForms);
        apiClient.executeAsync(call, MultiplayQueryResult.class, callback);
        return call;
    }
}
