/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.InteractiveGetPartyFormsConfig;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyResult;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyStatusResult;
import com.alibaba.yjopenapi.client.model.InteractiveJoinPartyResult;
import com.alibaba.yjopenapi.client.model.InteractiveKickOutUserResult;
import com.alibaba.yjopenapi.client.model.InteractiveModifySeatsFormsModifySeats;
import com.alibaba.yjopenapi.client.model.InteractiveModifySeatsResult;
import com.alibaba.yjopenapi.client.model.InteractiveShutDownPartyResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InteractiveApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public InteractiveApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public InteractiveApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for getParty
     * @param varForms InteractiveGetPartyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPartyCall(InteractiveGetPartyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/getParty";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("mixGameId", varForms.getMixGameId());
        localVarFormParams.put("userId", varForms.getUserId());
        localVarFormParams.put("reConnect", varForms.getReConnect());
        localVarFormParams.put("projectId", varForms.getProjectId());
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
    
    private com.squareup.okhttp.Call getPartyValidateBeforeCall(InteractiveGetPartyForms varForms) throws ApiException {
        // verify the required parameter 'mixGameId' is set
        if (varForms.getMixGameId() == null) {
            throw new ApiException("Missing the required parameter 'mixGameId' when calling getParty(Async)");
        }
        // verify the required parameter 'userId' is set
        if (varForms.getUserId() == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getParty(Async)");
        }
        // verify the required parameter 'reConnect' is set
        if (varForms.getReConnect() == null) {
            throw new ApiException("Missing the required parameter 'reConnect' when calling getParty(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getParty(Async)");
        }
        
        com.squareup.okhttp.Call call = getPartyCall(varForms);
        return call;
    }

    /**
     * 
     * 获取派对
     * @param varForms InteractiveGetPartyForms
     * @return InteractiveGetPartyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveGetPartyResult getParty(InteractiveGetPartyForms varForms) throws ApiException {
        ApiResponse<InteractiveGetPartyResult> resp = getPartyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 获取派对
     * @param varForms InteractiveGetPartyForms
     * @return ApiResponse&lt;InteractiveGetPartyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveGetPartyResult> getPartyWithHttpInfo(InteractiveGetPartyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getPartyValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveGetPartyResult.class);
    }

    /**
     *  (asynchronously)
     * 获取派对
     * @param varForms InteractiveGetPartyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPartyAsync(InteractiveGetPartyForms varForms, final ApiCallback<InteractiveGetPartyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getPartyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveGetPartyResult.class, callback);
        return call;
    }
    /**
     * Build call for getPartyStatus
     * @param varForms InteractiveGetPartyStatusForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPartyStatusCall(InteractiveGetPartyStatusForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/getPartyStatus";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("partyId", varForms.getPartyId());

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
    
    private com.squareup.okhttp.Call getPartyStatusValidateBeforeCall(InteractiveGetPartyStatusForms varForms) throws ApiException {
        // verify the required parameter 'partyId' is set
        if (varForms.getPartyId() == null) {
            throw new ApiException("Missing the required parameter 'partyId' when calling getPartyStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = getPartyStatusCall(varForms);
        return call;
    }

    /**
     * 
     * 查询派对游戏状态
     * @param varForms InteractiveGetPartyStatusForms
     * @return InteractiveGetPartyStatusResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveGetPartyStatusResult getPartyStatus(InteractiveGetPartyStatusForms varForms) throws ApiException {
        ApiResponse<InteractiveGetPartyStatusResult> resp = getPartyStatusWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询派对游戏状态
     * @param varForms InteractiveGetPartyStatusForms
     * @return ApiResponse&lt;InteractiveGetPartyStatusResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveGetPartyStatusResult> getPartyStatusWithHttpInfo(InteractiveGetPartyStatusForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getPartyStatusValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveGetPartyStatusResult.class);
    }

    /**
     *  (asynchronously)
     * 查询派对游戏状态
     * @param varForms InteractiveGetPartyStatusForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPartyStatusAsync(InteractiveGetPartyStatusForms varForms, final ApiCallback<InteractiveGetPartyStatusResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getPartyStatusValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveGetPartyStatusResult.class, callback);
        return call;
    }
    /**
     * Build call for joinParty
     * @param varForms InteractiveJoinPartyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call joinPartyCall(InteractiveJoinPartyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/joinParty";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("partyId", varForms.getPartyId());
        localVarFormParams.put("userId", varForms.getUserId());
        localVarFormParams.put("seatId", varForms.getSeatId());
        localVarFormParams.put("controlId", varForms.getControlId());
        localVarFormParams.put("reConnect", varForms.getReConnect());

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
    
    private com.squareup.okhttp.Call joinPartyValidateBeforeCall(InteractiveJoinPartyForms varForms) throws ApiException {
        // verify the required parameter 'partyId' is set
        if (varForms.getPartyId() == null) {
            throw new ApiException("Missing the required parameter 'partyId' when calling joinParty(Async)");
        }
        // verify the required parameter 'userId' is set
        if (varForms.getUserId() == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling joinParty(Async)");
        }
        // verify the required parameter 'seatId' is set
        if (varForms.getSeatId() == null) {
            throw new ApiException("Missing the required parameter 'seatId' when calling joinParty(Async)");
        }
        // verify the required parameter 'controlId' is set
        if (varForms.getControlId() == null) {
            throw new ApiException("Missing the required parameter 'controlId' when calling joinParty(Async)");
        }
        // verify the required parameter 'reConnect' is set
        if (varForms.getReConnect() == null) {
            throw new ApiException("Missing the required parameter 'reConnect' when calling joinParty(Async)");
        }
        
        com.squareup.okhttp.Call call = joinPartyCall(varForms);
        return call;
    }

    /**
     * 
     * 加入分配席位
     * @param varForms InteractiveJoinPartyForms
     * @return InteractiveJoinPartyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveJoinPartyResult joinParty(InteractiveJoinPartyForms varForms) throws ApiException {
        ApiResponse<InteractiveJoinPartyResult> resp = joinPartyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 加入分配席位
     * @param varForms InteractiveJoinPartyForms
     * @return ApiResponse&lt;InteractiveJoinPartyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveJoinPartyResult> joinPartyWithHttpInfo(InteractiveJoinPartyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = joinPartyValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveJoinPartyResult.class);
    }

    /**
     *  (asynchronously)
     * 加入分配席位
     * @param varForms InteractiveJoinPartyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call joinPartyAsync(InteractiveJoinPartyForms varForms, final ApiCallback<InteractiveJoinPartyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = joinPartyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveJoinPartyResult.class, callback);
        return call;
    }
    /**
     * Build call for kickOutUser
     * @param varForms InteractiveKickOutUserForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call kickOutUserCall(InteractiveKickOutUserForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/kickOutUser";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("partyId", varForms.getPartyId());
        localVarFormParams.put("userId", varForms.getUserId());
        if (varForms.getKickOutReason() != null) {
            localVarFormParams.put("kickOutReason", varForms.getKickOutReason());
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
    
    private com.squareup.okhttp.Call kickOutUserValidateBeforeCall(InteractiveKickOutUserForms varForms) throws ApiException {
        // verify the required parameter 'partyId' is set
        if (varForms.getPartyId() == null) {
            throw new ApiException("Missing the required parameter 'partyId' when calling kickOutUser(Async)");
        }
        // verify the required parameter 'userId' is set
        if (varForms.getUserId() == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling kickOutUser(Async)");
        }
        
        com.squareup.okhttp.Call call = kickOutUserCall(varForms);
        return call;
    }

    /**
     * 
     * 踢出派对
     * @param varForms InteractiveKickOutUserForms
     * @return InteractiveKickOutUserResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveKickOutUserResult kickOutUser(InteractiveKickOutUserForms varForms) throws ApiException {
        ApiResponse<InteractiveKickOutUserResult> resp = kickOutUserWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 踢出派对
     * @param varForms InteractiveKickOutUserForms
     * @return ApiResponse&lt;InteractiveKickOutUserResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveKickOutUserResult> kickOutUserWithHttpInfo(InteractiveKickOutUserForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = kickOutUserValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveKickOutUserResult.class);
    }

    /**
     *  (asynchronously)
     * 踢出派对
     * @param varForms InteractiveKickOutUserForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call kickOutUserAsync(InteractiveKickOutUserForms varForms, final ApiCallback<InteractiveKickOutUserResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = kickOutUserValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveKickOutUserResult.class, callback);
        return call;
    }
    /**
     * Build call for modifySeats
     * @param varForms InteractiveModifySeatsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifySeatsCall(InteractiveModifySeatsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/modifySeats";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("partyId", varForms.getPartyId());
        localVarFormParams.put("operator", varForms.getOperator());
        localVarFormParams.put("modifySeats", varForms.getModifySeats());

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
    
    private com.squareup.okhttp.Call modifySeatsValidateBeforeCall(InteractiveModifySeatsForms varForms) throws ApiException {
        // verify the required parameter 'partyId' is set
        if (varForms.getPartyId() == null) {
            throw new ApiException("Missing the required parameter 'partyId' when calling modifySeats(Async)");
        }
        // verify the required parameter 'operator' is set
        if (varForms.getOperator() == null) {
            throw new ApiException("Missing the required parameter 'operator' when calling modifySeats(Async)");
        }
        // verify the required parameter 'modifySeats' is set
        if (varForms.getModifySeats() == null) {
            throw new ApiException("Missing the required parameter 'modifySeats' when calling modifySeats(Async)");
        }
        
        com.squareup.okhttp.Call call = modifySeatsCall(varForms);
        return call;
    }

    /**
     * 
     * 修改席位
     * @param varForms InteractiveModifySeatsForms
     * @return InteractiveModifySeatsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveModifySeatsResult modifySeats(InteractiveModifySeatsForms varForms) throws ApiException {
        ApiResponse<InteractiveModifySeatsResult> resp = modifySeatsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 修改席位
     * @param varForms InteractiveModifySeatsForms
     * @return ApiResponse&lt;InteractiveModifySeatsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveModifySeatsResult> modifySeatsWithHttpInfo(InteractiveModifySeatsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = modifySeatsValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveModifySeatsResult.class);
    }

    /**
     *  (asynchronously)
     * 修改席位
     * @param varForms InteractiveModifySeatsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifySeatsAsync(InteractiveModifySeatsForms varForms, final ApiCallback<InteractiveModifySeatsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = modifySeatsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveModifySeatsResult.class, callback);
        return call;
    }
    /**
     * Build call for shutDownParty
     * @param varForms InteractiveShutDownPartyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shutDownPartyCall(InteractiveShutDownPartyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/interactive/shutDownParty";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("partyId", varForms.getPartyId());
        if (varForms.getShutDownReason() != null) {
            localVarFormParams.put("shutDownReason", varForms.getShutDownReason());
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
    
    private com.squareup.okhttp.Call shutDownPartyValidateBeforeCall(InteractiveShutDownPartyForms varForms) throws ApiException {
        // verify the required parameter 'partyId' is set
        if (varForms.getPartyId() == null) {
            throw new ApiException("Missing the required parameter 'partyId' when calling shutDownParty(Async)");
        }
        
        com.squareup.okhttp.Call call = shutDownPartyCall(varForms);
        return call;
    }

    /**
     * 
     * 关闭派对
     * @param varForms InteractiveShutDownPartyForms
     * @return InteractiveShutDownPartyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InteractiveShutDownPartyResult shutDownParty(InteractiveShutDownPartyForms varForms) throws ApiException {
        ApiResponse<InteractiveShutDownPartyResult> resp = shutDownPartyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 关闭派对
     * @param varForms InteractiveShutDownPartyForms
     * @return ApiResponse&lt;InteractiveShutDownPartyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InteractiveShutDownPartyResult> shutDownPartyWithHttpInfo(InteractiveShutDownPartyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = shutDownPartyValidateBeforeCall(varForms);
        return apiClient.execute(call, InteractiveShutDownPartyResult.class);
    }

    /**
     *  (asynchronously)
     * 关闭派对
     * @param varForms InteractiveShutDownPartyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shutDownPartyAsync(InteractiveShutDownPartyForms varForms, final ApiCallback<InteractiveShutDownPartyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = shutDownPartyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, InteractiveShutDownPartyResult.class, callback);
        return call;
    }
}
