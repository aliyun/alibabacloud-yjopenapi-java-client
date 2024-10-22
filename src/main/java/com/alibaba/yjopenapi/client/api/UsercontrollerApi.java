/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.UsercontrollerDeleteGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontrollerGetGameTrialSurplusDurationResult;
import com.alibaba.yjopenapi.client.model.UsercontrollerGetUserGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontrollerListLatestGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontrollerRestoreGameArchiveResult;
import com.alibaba.yjopenapi.client.model.UsercontrollerUpdateGameArchiveTagStatusResult;

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
     * 
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @return UsercontrollerDeleteGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerDeleteGameArchiveResult deleteGameArchive(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontrollerDeleteGameArchiveResult> resp = deleteGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @return ApiResponse&lt;UsercontrollerDeleteGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerDeleteGameArchiveResult> deleteGameArchiveWithHttpInfo(UsercontrollerDeleteGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerDeleteGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerDeleteGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteGameArchiveAsync(UsercontrollerDeleteGameArchiveForms varForms, final ApiCallback<UsercontrollerDeleteGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerDeleteGameArchiveResult.class, callback);
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
     * 
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @return UsercontrollerGetGameTrialSurplusDurationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerGetGameTrialSurplusDurationResult getGameTrialSurplusDuration(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        ApiResponse<UsercontrollerGetGameTrialSurplusDurationResult> resp = getGameTrialSurplusDurationWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @return ApiResponse&lt;UsercontrollerGetGameTrialSurplusDurationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerGetGameTrialSurplusDurationResult> getGameTrialSurplusDurationWithHttpInfo(UsercontrollerGetGameTrialSurplusDurationForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getGameTrialSurplusDurationValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerGetGameTrialSurplusDurationResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerGetGameTrialSurplusDurationForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGameTrialSurplusDurationAsync(UsercontrollerGetGameTrialSurplusDurationForms varForms, final ApiCallback<UsercontrollerGetGameTrialSurplusDurationResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getGameTrialSurplusDurationValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerGetGameTrialSurplusDurationResult.class, callback);
        return call;
    }
    /**
     * Build call for getUserGameArchive
     * @param varForms UsercontrollerGetUserGameArchiveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserGameArchiveCall(UsercontrollerGetUserGameArchiveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/usercontroller/getUserGameArchive";

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
    
    private com.squareup.okhttp.Call getUserGameArchiveValidateBeforeCall(UsercontrollerGetUserGameArchiveForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getUserGameArchive(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling getUserGameArchive(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getUserGameArchive(Async)");
        }
        
        com.squareup.okhttp.Call call = getUserGameArchiveCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerGetUserGameArchiveForms
     * @return UsercontrollerGetUserGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerGetUserGameArchiveResult getUserGameArchive(UsercontrollerGetUserGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontrollerGetUserGameArchiveResult> resp = getUserGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerGetUserGameArchiveForms
     * @return ApiResponse&lt;UsercontrollerGetUserGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerGetUserGameArchiveResult> getUserGameArchiveWithHttpInfo(UsercontrollerGetUserGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getUserGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerGetUserGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerGetUserGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserGameArchiveAsync(UsercontrollerGetUserGameArchiveForms varForms, final ApiCallback<UsercontrollerGetUserGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getUserGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerGetUserGameArchiveResult.class, callback);
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
     * 
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @return UsercontrollerListLatestGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerListLatestGameArchiveResult listLatestGameArchive(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontrollerListLatestGameArchiveResult> resp = listLatestGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @return ApiResponse&lt;UsercontrollerListLatestGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerListLatestGameArchiveResult> listLatestGameArchiveWithHttpInfo(UsercontrollerListLatestGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listLatestGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerListLatestGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerListLatestGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listLatestGameArchiveAsync(UsercontrollerListLatestGameArchiveForms varForms, final ApiCallback<UsercontrollerListLatestGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listLatestGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerListLatestGameArchiveResult.class, callback);
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
     * 
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @return UsercontrollerRestoreGameArchiveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerRestoreGameArchiveResult restoreGameArchive(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        ApiResponse<UsercontrollerRestoreGameArchiveResult> resp = restoreGameArchiveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @return ApiResponse&lt;UsercontrollerRestoreGameArchiveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerRestoreGameArchiveResult> restoreGameArchiveWithHttpInfo(UsercontrollerRestoreGameArchiveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = restoreGameArchiveValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerRestoreGameArchiveResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerRestoreGameArchiveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restoreGameArchiveAsync(UsercontrollerRestoreGameArchiveForms varForms, final ApiCallback<UsercontrollerRestoreGameArchiveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = restoreGameArchiveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerRestoreGameArchiveResult.class, callback);
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
     * 
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @return UsercontrollerUpdateGameArchiveTagStatusResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsercontrollerUpdateGameArchiveTagStatusResult updateGameArchiveTagStatus(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        ApiResponse<UsercontrollerUpdateGameArchiveTagStatusResult> resp = updateGameArchiveTagStatusWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @return ApiResponse&lt;UsercontrollerUpdateGameArchiveTagStatusResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsercontrollerUpdateGameArchiveTagStatusResult> updateGameArchiveTagStatusWithHttpInfo(UsercontrollerUpdateGameArchiveTagStatusForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = updateGameArchiveTagStatusValidateBeforeCall(varForms);
        return apiClient.execute(call, UsercontrollerUpdateGameArchiveTagStatusResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms UsercontrollerUpdateGameArchiveTagStatusForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateGameArchiveTagStatusAsync(UsercontrollerUpdateGameArchiveTagStatusForms varForms, final ApiCallback<UsercontrollerUpdateGameArchiveTagStatusResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = updateGameArchiveTagStatusValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UsercontrollerUpdateGameArchiveTagStatusResult.class, callback);
        return call;
    }
}
