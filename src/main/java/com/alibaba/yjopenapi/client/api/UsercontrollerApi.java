/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.UsercontollerDeleteGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontollerGetGameTrialSurplusDurationResult;
import com.alibaba.yjopenapi.client.model.UsercontollerListLatestGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontollerRestoreGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontollerUpdateGameArchiveTagStatusResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsercontrollerApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public UsercontrollerApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public UsercontrollerApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for deleteGameArchive
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteGameArchiveCall(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/deleteGameArchive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("archiveId", varForms.getArchiveId());

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
    
    private com.squareup.okhttp.Call deleteGameArchiveValidateBeforeCall(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteGameArchive(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling deleteGameArchive(Async)");
        }
        // verify the required parameter 'archiveId' is set
        if (varForms.getArchiveId() == null) {
            throw new ApiException("Missing the required parameter 'archiveId' when calling deleteGameArchive(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteGameArchiveCall(varForms);
        return call;
    }

    /**
     * 
     * 根据存档id删除存档纪录
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @return UsercontollerDeleteGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontollerDeleteGameArchiveResult deleteGameArchive(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontollerDeleteGameArchiveResult> resp = deleteGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 根据存档id删除存档纪录
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @return ApiResponse&lt;UsercontollerDeleteGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontollerDeleteGameArchiveResult> deleteGameArchiveWithHttpInfo(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontollerDeleteGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 根据存档id删除存档纪录
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteGameArchiveAsync(UsercontrollerDeleteGameArchiveForms varForms, final ApiCallback<UsercontollerDeleteGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontollerDeleteGameArchiveResult.class, callback);
        return call;
    }
    /**
     * Build call for getGameTrialSurplusDuration
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGameTrialSurplusDurationCall(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/getGameTrialSurplusDuration";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("projectId", varForms.getProjectId());

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
    
    private com.squareup.okhttp.Call getGameTrialSurplusDurationValidateBeforeCall(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getGameTrialSurplusDuration(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling getGameTrialSurplusDuration(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getGameTrialSurplusDuration(Async)");
        }
        
        com.squareup.okhttp.Call call = getGameTrialSurplusDurationCall(varForms);
        return call;
    }

    /**
     * 
     * 查询剩余试玩游戏时长
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @return UsercontollerGetGameTrialSurplusDurationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontollerGetGameTrialSurplusDurationResult getGameTrialSurplusDuration(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        ApiResponse<UsercontollerGetGameTrialSurplusDurationResult> resp = getGameTrialSurplusDurationWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询剩余试玩游戏时长
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @return ApiResponse&lt;UsercontollerGetGameTrialSurplusDurationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontollerGetGameTrialSurplusDurationResult> getGameTrialSurplusDurationWithHttpInfo(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getGameTrialSurplusDurationValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontollerGetGameTrialSurplusDurationResult.class);
    }

    /**
     *  (asynchronously)
     * 查询剩余试玩游戏时长
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGameTrialSurplusDurationAsync(UsercontrollerGetGameTrialSurplusDurationForms varForms, final ApiCallback<UsercontollerGetGameTrialSurplusDurationResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getGameTrialSurplusDurationValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontollerGetGameTrialSurplusDurationResult.class, callback);
        return call;
    }
    /**
     * Build call for listLatestGameArchive
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listLatestGameArchiveCall(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/listLatestGameArchive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        if (varForms.getPageSize() != null) {
            localVarFormParams.put("pageSize", varForms.getPageSize());
        }
        if (varForms.getPageNumber() != null) {
            localVarFormParams.put("pageNumber", varForms.getPageNumber());
        }
        if (varForms.getTagStatus() != null) {
            localVarFormParams.put("tagStatus", varForms.getTagStatus());
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
    
    private com.squareup.okhttp.Call listLatestGameArchiveValidateBeforeCall(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listLatestGameArchive(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling listLatestGameArchive(Async)");
        }
        
        com.squareup.okhttp.Call call = listLatestGameArchiveCall(varForms);
        return call;
    }

    /**
     * 
     * 查询用户正常状态的最新存档纪录，按照存档时间倒序
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @return UsercontollerListLatestGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontollerListLatestGameArchiveResult listLatestGameArchive(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontollerListLatestGameArchiveResult> resp = listLatestGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询用户正常状态的最新存档纪录，按照存档时间倒序
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @return ApiResponse&lt;UsercontollerListLatestGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontollerListLatestGameArchiveResult> listLatestGameArchiveWithHttpInfo(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listLatestGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontollerListLatestGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 查询用户正常状态的最新存档纪录，按照存档时间倒序
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listLatestGameArchiveAsync(UsercontrollerListLatestGameArchiveForms varForms, final ApiCallback<UsercontollerListLatestGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listLatestGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontollerListLatestGameArchiveResult.class, callback);
        return call;
    }
    /**
     * Build call for restoreGameArchive
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call restoreGameArchiveCall(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/restoreGameArchive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("archiveId", varForms.getArchiveId());

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
    
    private com.squareup.okhttp.Call restoreGameArchiveValidateBeforeCall(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling restoreGameArchive(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling restoreGameArchive(Async)");
        }
        // verify the required parameter 'archiveId' is set
        if (varForms.getArchiveId() == null) {
            throw new ApiException("Missing the required parameter 'archiveId' when calling restoreGameArchive(Async)");
        }
        
        com.squareup.okhttp.Call call = restoreGameArchiveCall(varForms);
        return call;
    }

    /**
     * 
     * 将指定的存档ID恢复为最新存档
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @return UsercontollerRestoreGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontollerRestoreGameArchiveResult restoreGameArchive(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontollerRestoreGameArchiveResult> resp = restoreGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 将指定的存档ID恢复为最新存档
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @return ApiResponse&lt;UsercontollerRestoreGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontollerRestoreGameArchiveResult> restoreGameArchiveWithHttpInfo(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = restoreGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontollerRestoreGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 将指定的存档ID恢复为最新存档
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restoreGameArchiveAsync(UsercontrollerRestoreGameArchiveForms varForms, final ApiCallback<UsercontollerRestoreGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = restoreGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontollerRestoreGameArchiveResult.class, callback);
        return call;
    }
    /**
     * Build call for updateGameArchiveTagStatus
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateGameArchiveTagStatusCall(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/updateGameArchiveTagStatus";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("archiveId", varForms.getArchiveId());
        localVarFormParams.put("tagStatus", varForms.getTagStatus());

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
    
    private com.squareup.okhttp.Call updateGameArchiveTagStatusValidateBeforeCall(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling updateGameArchiveTagStatus(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling updateGameArchiveTagStatus(Async)");
        }
        // verify the required parameter 'archiveId' is set
        if (varForms.getArchiveId() == null) {
            throw new ApiException("Missing the required parameter 'archiveId' when calling updateGameArchiveTagStatus(Async)");
        }
        // verify the required parameter 'tagStatus' is set
        if (varForms.getTagStatus() == null) {
            throw new ApiException("Missing the required parameter 'tagStatus' when calling updateGameArchiveTagStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = updateGameArchiveTagStatusCall(varForms);
        return call;
    }

    /**
     * 
     * 更新存档打标状态
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @return UsercontollerUpdateGameArchiveTagStatusResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontollerUpdateGameArchiveTagStatusResult updateGameArchiveTagStatus(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        ApiResponse<UsercontollerUpdateGameArchiveTagStatusResult> resp = updateGameArchiveTagStatusWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 更新存档打标状态
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @return ApiResponse&lt;UsercontollerUpdateGameArchiveTagStatusResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontollerUpdateGameArchiveTagStatusResult> updateGameArchiveTagStatusWithHttpInfo(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = updateGameArchiveTagStatusValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontollerUpdateGameArchiveTagStatusResult.class);
    }

    /**
     *  (asynchronously)
     * 更新存档打标状态
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateGameArchiveTagStatusAsync(UsercontrollerUpdateGameArchiveTagStatusForms varForms, final ApiCallback<UsercontollerUpdateGameArchiveTagStatusResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = updateGameArchiveTagStatusValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontollerUpdateGameArchiveTagStatusResult.class, callback);
        return call;
    }
}
