/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.MultiplayCloseResult;
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
        String localVarPath = "/multiplay/close";

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
     * Build call for init
     * @param varForms MultiplayInitForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call initCall(MultiplayInitForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/multiplay/init";

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
        String localVarPath = "/multiplay/join";

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
        String localVarPath = "/multiplay/leave";

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
        String localVarPath = "/multiplay/modify";

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
        String localVarPath = "/multiplay/query";

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
