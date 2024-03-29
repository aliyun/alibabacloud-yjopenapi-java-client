/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.ConsoleAdminActivateDeploymentResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminAdaptGameVersionResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminAddGameToProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminCreateGameResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminCreateProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminDeleteGameResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminDeleteGameVersionResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminDeleteProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetGameVersionProgressResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetGameVersionResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListActivateableInstancesResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListActivatedInstancesResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListControllersOfGameResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListDeployableInstancesResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGameDeployDetailsOfProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGameVersionsResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGamesResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListInstancesOfProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListProjectsResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListVersionDeployInstancesResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminRemoveGameFromProjectResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminSubmitDeploymentResult;
import com.alibaba.yjopenapi.client.model.ConsoleAdminUploadGameVersionByDownloadDownloadType;
import com.alibaba.yjopenapi.client.model.ConsoleAdminUploadGameVersionByDownloadResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsoleAdminApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public ConsoleAdminApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public ConsoleAdminApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for activateDeployment
     * @param varForms ConsoleAdminActivateDeploymentForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call activateDeploymentCall(ConsoleAdminActivateDeploymentForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/activateDeployment";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("projectId", varForms.getProjectId());
        localVarFormParams.put("versionId", varForms.getVersionId());
        if (varForms.getMaxConcurrency() != null) {
            localVarFormParams.put("maxConcurrency", varForms.getMaxConcurrency());
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
    
    private com.squareup.okhttp.Call activateDeploymentValidateBeforeCall(ConsoleAdminActivateDeploymentForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling activateDeployment(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling activateDeployment(Async)");
        }
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling activateDeployment(Async)");
        }
        
        com.squareup.okhttp.Call call = activateDeploymentCall(varForms);
        return call;
    }

    /**
     * 
     * 激活已部署成功的游戏版本的部署
     * @param varForms ConsoleAdminActivateDeploymentForms
     * @return ConsoleAdminActivateDeploymentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminActivateDeploymentResult activateDeployment(ConsoleAdminActivateDeploymentForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminActivateDeploymentResult> resp = activateDeploymentWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 激活已部署成功的游戏版本的部署
     * @param varForms ConsoleAdminActivateDeploymentForms
     * @return ApiResponse&lt;ConsoleAdminActivateDeploymentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminActivateDeploymentResult> activateDeploymentWithHttpInfo(ConsoleAdminActivateDeploymentForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = activateDeploymentValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminActivateDeploymentResult.class);
    }

    /**
     *  (asynchronously)
     * 激活已部署成功的游戏版本的部署
     * @param varForms ConsoleAdminActivateDeploymentForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call activateDeploymentAsync(ConsoleAdminActivateDeploymentForms varForms, final ApiCallback<ConsoleAdminActivateDeploymentResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = activateDeploymentValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminActivateDeploymentResult.class, callback);
        return call;
    }
    /**
     * Build call for adaptGameVersion
     * @param varForms ConsoleAdminAdaptGameVersionForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call adaptGameVersionCall(ConsoleAdminAdaptGameVersionForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/adaptGameVersion";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("versionId", varForms.getVersionId());

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
    
    private com.squareup.okhttp.Call adaptGameVersionValidateBeforeCall(ConsoleAdminAdaptGameVersionForms varForms) throws ApiException {
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling adaptGameVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = adaptGameVersionCall(varForms);
        return call;
    }

    /**
     * 
     * 发起游戏版本适配
     * @param varForms ConsoleAdminAdaptGameVersionForms
     * @return ConsoleAdminAdaptGameVersionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminAdaptGameVersionResult adaptGameVersion(ConsoleAdminAdaptGameVersionForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminAdaptGameVersionResult> resp = adaptGameVersionWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 发起游戏版本适配
     * @param varForms ConsoleAdminAdaptGameVersionForms
     * @return ApiResponse&lt;ConsoleAdminAdaptGameVersionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminAdaptGameVersionResult> adaptGameVersionWithHttpInfo(ConsoleAdminAdaptGameVersionForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = adaptGameVersionValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminAdaptGameVersionResult.class);
    }

    /**
     *  (asynchronously)
     * 发起游戏版本适配
     * @param varForms ConsoleAdminAdaptGameVersionForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call adaptGameVersionAsync(ConsoleAdminAdaptGameVersionForms varForms, final ApiCallback<ConsoleAdminAdaptGameVersionResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = adaptGameVersionValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminAdaptGameVersionResult.class, callback);
        return call;
    }
    /**
     * Build call for addGameToProject
     * @param varForms ConsoleAdminAddGameToProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addGameToProjectCall(ConsoleAdminAddGameToProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/addGameToProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("projectId", varForms.getProjectId());
        localVarFormParams.put("gameId", varForms.getGameId());

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
    
    private com.squareup.okhttp.Call addGameToProjectValidateBeforeCall(ConsoleAdminAddGameToProjectForms varForms) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling addGameToProject(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling addGameToProject(Async)");
        }
        
        com.squareup.okhttp.Call call = addGameToProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 将游戏添加到项目
     * @param varForms ConsoleAdminAddGameToProjectForms
     * @return ConsoleAdminAddGameToProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminAddGameToProjectResult addGameToProject(ConsoleAdminAddGameToProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminAddGameToProjectResult> resp = addGameToProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 将游戏添加到项目
     * @param varForms ConsoleAdminAddGameToProjectForms
     * @return ApiResponse&lt;ConsoleAdminAddGameToProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminAddGameToProjectResult> addGameToProjectWithHttpInfo(ConsoleAdminAddGameToProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = addGameToProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminAddGameToProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 将游戏添加到项目
     * @param varForms ConsoleAdminAddGameToProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addGameToProjectAsync(ConsoleAdminAddGameToProjectForms varForms, final ApiCallback<ConsoleAdminAddGameToProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = addGameToProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminAddGameToProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for createGame
     * @param varForms ConsoleAdminCreateGameForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createGameCall(ConsoleAdminCreateGameForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/createGame";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameName", varForms.getGameName());
        localVarFormParams.put("platformType", varForms.getPlatformType());

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
    
    private com.squareup.okhttp.Call createGameValidateBeforeCall(ConsoleAdminCreateGameForms varForms) throws ApiException {
        // verify the required parameter 'gameName' is set
        if (varForms.getGameName() == null) {
            throw new ApiException("Missing the required parameter 'gameName' when calling createGame(Async)");
        }
        // verify the required parameter 'platformType' is set
        if (varForms.getPlatformType() == null) {
            throw new ApiException("Missing the required parameter 'platformType' when calling createGame(Async)");
        }
        
        com.squareup.okhttp.Call call = createGameCall(varForms);
        return call;
    }

    /**
     * 
     * 创建游戏
     * @param varForms ConsoleAdminCreateGameForms
     * @return ConsoleAdminCreateGameResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminCreateGameResult createGame(ConsoleAdminCreateGameForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminCreateGameResult> resp = createGameWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 创建游戏
     * @param varForms ConsoleAdminCreateGameForms
     * @return ApiResponse&lt;ConsoleAdminCreateGameResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminCreateGameResult> createGameWithHttpInfo(ConsoleAdminCreateGameForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = createGameValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminCreateGameResult.class);
    }

    /**
     *  (asynchronously)
     * 创建游戏
     * @param varForms ConsoleAdminCreateGameForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createGameAsync(ConsoleAdminCreateGameForms varForms, final ApiCallback<ConsoleAdminCreateGameResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = createGameValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminCreateGameResult.class, callback);
        return call;
    }
    /**
     * Build call for createProject
     * @param varForms ConsoleAdminCreateProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createProjectCall(ConsoleAdminCreateProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/createProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("projectName", varForms.getProjectName());

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
    
    private com.squareup.okhttp.Call createProjectValidateBeforeCall(ConsoleAdminCreateProjectForms varForms) throws ApiException {
        // verify the required parameter 'projectName' is set
        if (varForms.getProjectName() == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling createProject(Async)");
        }
        
        com.squareup.okhttp.Call call = createProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 创建项目
     * @param varForms ConsoleAdminCreateProjectForms
     * @return ConsoleAdminCreateProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminCreateProjectResult createProject(ConsoleAdminCreateProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminCreateProjectResult> resp = createProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 创建项目
     * @param varForms ConsoleAdminCreateProjectForms
     * @return ApiResponse&lt;ConsoleAdminCreateProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminCreateProjectResult> createProjectWithHttpInfo(ConsoleAdminCreateProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = createProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminCreateProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 创建项目
     * @param varForms ConsoleAdminCreateProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProjectAsync(ConsoleAdminCreateProjectForms varForms, final ApiCallback<ConsoleAdminCreateProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = createProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminCreateProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for deleteGame
     * @param varForms ConsoleAdminDeleteGameForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteGameCall(ConsoleAdminDeleteGameForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/deleteGame";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());

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
    
    private com.squareup.okhttp.Call deleteGameValidateBeforeCall(ConsoleAdminDeleteGameForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling deleteGame(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteGameCall(varForms);
        return call;
    }

    /**
     * 
     * 删除指定的游戏
     * @param varForms ConsoleAdminDeleteGameForms
     * @return ConsoleAdminDeleteGameResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminDeleteGameResult deleteGame(ConsoleAdminDeleteGameForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminDeleteGameResult> resp = deleteGameWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 删除指定的游戏
     * @param varForms ConsoleAdminDeleteGameForms
     * @return ApiResponse&lt;ConsoleAdminDeleteGameResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminDeleteGameResult> deleteGameWithHttpInfo(ConsoleAdminDeleteGameForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteGameValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminDeleteGameResult.class);
    }

    /**
     *  (asynchronously)
     * 删除指定的游戏
     * @param varForms ConsoleAdminDeleteGameForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteGameAsync(ConsoleAdminDeleteGameForms varForms, final ApiCallback<ConsoleAdminDeleteGameResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteGameValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminDeleteGameResult.class, callback);
        return call;
    }
    /**
     * Build call for deleteGameVersion
     * @param varForms ConsoleAdminDeleteGameVersionForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteGameVersionCall(ConsoleAdminDeleteGameVersionForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/deleteGameVersion";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("versionId", varForms.getVersionId());

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
    
    private com.squareup.okhttp.Call deleteGameVersionValidateBeforeCall(ConsoleAdminDeleteGameVersionForms varForms) throws ApiException {
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling deleteGameVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteGameVersionCall(varForms);
        return call;
    }

    /**
     * 
     * 发起游戏版本适配
     * @param varForms ConsoleAdminDeleteGameVersionForms
     * @return ConsoleAdminDeleteGameVersionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminDeleteGameVersionResult deleteGameVersion(ConsoleAdminDeleteGameVersionForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminDeleteGameVersionResult> resp = deleteGameVersionWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 发起游戏版本适配
     * @param varForms ConsoleAdminDeleteGameVersionForms
     * @return ApiResponse&lt;ConsoleAdminDeleteGameVersionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminDeleteGameVersionResult> deleteGameVersionWithHttpInfo(ConsoleAdminDeleteGameVersionForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteGameVersionValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminDeleteGameVersionResult.class);
    }

    /**
     *  (asynchronously)
     * 发起游戏版本适配
     * @param varForms ConsoleAdminDeleteGameVersionForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteGameVersionAsync(ConsoleAdminDeleteGameVersionForms varForms, final ApiCallback<ConsoleAdminDeleteGameVersionResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteGameVersionValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminDeleteGameVersionResult.class, callback);
        return call;
    }
    /**
     * Build call for deleteProject
     * @param varForms ConsoleAdminDeleteProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteProjectCall(ConsoleAdminDeleteProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/deleteProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
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
    
    private com.squareup.okhttp.Call deleteProjectValidateBeforeCall(ConsoleAdminDeleteProjectForms varForms) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling deleteProject(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 删除指定的项目
     * @param varForms ConsoleAdminDeleteProjectForms
     * @return ConsoleAdminDeleteProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminDeleteProjectResult deleteProject(ConsoleAdminDeleteProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminDeleteProjectResult> resp = deleteProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 删除指定的项目
     * @param varForms ConsoleAdminDeleteProjectForms
     * @return ApiResponse&lt;ConsoleAdminDeleteProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminDeleteProjectResult> deleteProjectWithHttpInfo(ConsoleAdminDeleteProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminDeleteProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 删除指定的项目
     * @param varForms ConsoleAdminDeleteProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProjectAsync(ConsoleAdminDeleteProjectForms varForms, final ApiCallback<ConsoleAdminDeleteProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminDeleteProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for getGameVersion
     * @param varForms ConsoleAdminGetGameVersionForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGameVersionCall(ConsoleAdminGetGameVersionForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/getGameVersion";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("versionId", varForms.getVersionId());

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
    
    private com.squareup.okhttp.Call getGameVersionValidateBeforeCall(ConsoleAdminGetGameVersionForms varForms) throws ApiException {
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling getGameVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = getGameVersionCall(varForms);
        return call;
    }

    /**
     * 
     * 获取单个游戏版本信息
     * @param varForms ConsoleAdminGetGameVersionForms
     * @return ConsoleAdminGetGameVersionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminGetGameVersionResult getGameVersion(ConsoleAdminGetGameVersionForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminGetGameVersionResult> resp = getGameVersionWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 获取单个游戏版本信息
     * @param varForms ConsoleAdminGetGameVersionForms
     * @return ApiResponse&lt;ConsoleAdminGetGameVersionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminGetGameVersionResult> getGameVersionWithHttpInfo(ConsoleAdminGetGameVersionForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getGameVersionValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminGetGameVersionResult.class);
    }

    /**
     *  (asynchronously)
     * 获取单个游戏版本信息
     * @param varForms ConsoleAdminGetGameVersionForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGameVersionAsync(ConsoleAdminGetGameVersionForms varForms, final ApiCallback<ConsoleAdminGetGameVersionResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getGameVersionValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminGetGameVersionResult.class, callback);
        return call;
    }
    /**
     * Build call for getGameVersionProgress
     * @param varForms ConsoleAdminGetGameVersionProgressForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGameVersionProgressCall(ConsoleAdminGetGameVersionProgressForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/getGameVersionProgress";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("taskId", varForms.getTaskId());

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
    
    private com.squareup.okhttp.Call getGameVersionProgressValidateBeforeCall(ConsoleAdminGetGameVersionProgressForms varForms) throws ApiException {
        // verify the required parameter 'taskId' is set
        if (varForms.getTaskId() == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling getGameVersionProgress(Async)");
        }
        
        com.squareup.okhttp.Call call = getGameVersionProgressCall(varForms);
        return call;
    }

    /**
     * 
     * 查询版本处理进度（包含上传、适配、部署）
     * @param varForms ConsoleAdminGetGameVersionProgressForms
     * @return ConsoleAdminGetGameVersionProgressResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminGetGameVersionProgressResult getGameVersionProgress(ConsoleAdminGetGameVersionProgressForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminGetGameVersionProgressResult> resp = getGameVersionProgressWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询版本处理进度（包含上传、适配、部署）
     * @param varForms ConsoleAdminGetGameVersionProgressForms
     * @return ApiResponse&lt;ConsoleAdminGetGameVersionProgressResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminGetGameVersionProgressResult> getGameVersionProgressWithHttpInfo(ConsoleAdminGetGameVersionProgressForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getGameVersionProgressValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminGetGameVersionProgressResult.class);
    }

    /**
     *  (asynchronously)
     * 查询版本处理进度（包含上传、适配、部署）
     * @param varForms ConsoleAdminGetGameVersionProgressForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGameVersionProgressAsync(ConsoleAdminGetGameVersionProgressForms varForms, final ApiCallback<ConsoleAdminGetGameVersionProgressResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getGameVersionProgressValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminGetGameVersionProgressResult.class, callback);
        return call;
    }
    /**
     * Build call for listActivateableInstances
     * @param varForms ConsoleAdminListActivateableInstancesForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listActivateableInstancesCall(ConsoleAdminListActivateableInstancesForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listActivateableInstances";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("projectId", varForms.getProjectId());
        localVarFormParams.put("versionId", varForms.getVersionId());

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
    
    private com.squareup.okhttp.Call listActivateableInstancesValidateBeforeCall(ConsoleAdminListActivateableInstancesForms varForms) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listActivateableInstances(Async)");
        }
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling listActivateableInstances(Async)");
        }
        
        com.squareup.okhttp.Call call = listActivateableInstancesCall(varForms);
        return call;
    }

    /**
     * 
     * 指定项目和游戏版本，获取可激活且可调度的实例及调度配置
     * @param varForms ConsoleAdminListActivateableInstancesForms
     * @return ConsoleAdminListActivateableInstancesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListActivateableInstancesResult listActivateableInstances(ConsoleAdminListActivateableInstancesForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListActivateableInstancesResult> resp = listActivateableInstancesWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 指定项目和游戏版本，获取可激活且可调度的实例及调度配置
     * @param varForms ConsoleAdminListActivateableInstancesForms
     * @return ApiResponse&lt;ConsoleAdminListActivateableInstancesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListActivateableInstancesResult> listActivateableInstancesWithHttpInfo(ConsoleAdminListActivateableInstancesForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listActivateableInstancesValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListActivateableInstancesResult.class);
    }

    /**
     *  (asynchronously)
     * 指定项目和游戏版本，获取可激活且可调度的实例及调度配置
     * @param varForms ConsoleAdminListActivateableInstancesForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listActivateableInstancesAsync(ConsoleAdminListActivateableInstancesForms varForms, final ApiCallback<ConsoleAdminListActivateableInstancesResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listActivateableInstancesValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListActivateableInstancesResult.class, callback);
        return call;
    }
    /**
     * Build call for listActivatedInstances
     * @param varForms ConsoleAdminListActivatedInstancesForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listActivatedInstancesCall(ConsoleAdminListActivatedInstancesForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listActivatedInstances";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
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
    
    private com.squareup.okhttp.Call listActivatedInstancesValidateBeforeCall(ConsoleAdminListActivatedInstancesForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling listActivatedInstances(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listActivatedInstances(Async)");
        }
        
        com.squareup.okhttp.Call call = listActivatedInstancesCall(varForms);
        return call;
    }

    /**
     * 
     * 指定项目和游戏，获取已激活版本的可调度实例及调度配置
     * @param varForms ConsoleAdminListActivatedInstancesForms
     * @return ConsoleAdminListActivatedInstancesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListActivatedInstancesResult listActivatedInstances(ConsoleAdminListActivatedInstancesForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListActivatedInstancesResult> resp = listActivatedInstancesWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 指定项目和游戏，获取已激活版本的可调度实例及调度配置
     * @param varForms ConsoleAdminListActivatedInstancesForms
     * @return ApiResponse&lt;ConsoleAdminListActivatedInstancesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListActivatedInstancesResult> listActivatedInstancesWithHttpInfo(ConsoleAdminListActivatedInstancesForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listActivatedInstancesValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListActivatedInstancesResult.class);
    }

    /**
     *  (asynchronously)
     * 指定项目和游戏，获取已激活版本的可调度实例及调度配置
     * @param varForms ConsoleAdminListActivatedInstancesForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listActivatedInstancesAsync(ConsoleAdminListActivatedInstancesForms varForms, final ApiCallback<ConsoleAdminListActivatedInstancesResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listActivatedInstancesValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListActivatedInstancesResult.class, callback);
        return call;
    }
    /**
     * Build call for listControllersOfGame
     * @param varForms ConsoleAdminListControllersOfGameForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listControllersOfGameCall(ConsoleAdminListControllersOfGameForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listControllersOfGame";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
        }
        if (varForms.getMaxResults() != null) {
            localVarFormParams.put("maxResults", varForms.getMaxResults());
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
    
    private com.squareup.okhttp.Call listControllersOfGameValidateBeforeCall(ConsoleAdminListControllersOfGameForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling listControllersOfGame(Async)");
        }
        
        com.squareup.okhttp.Call call = listControllersOfGameCall(varForms);
        return call;
    }

    /**
     * 
     * 获取单个游戏关联的控制器列表
     * @param varForms ConsoleAdminListControllersOfGameForms
     * @return ConsoleAdminListControllersOfGameResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListControllersOfGameResult listControllersOfGame(ConsoleAdminListControllersOfGameForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListControllersOfGameResult> resp = listControllersOfGameWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 获取单个游戏关联的控制器列表
     * @param varForms ConsoleAdminListControllersOfGameForms
     * @return ApiResponse&lt;ConsoleAdminListControllersOfGameResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListControllersOfGameResult> listControllersOfGameWithHttpInfo(ConsoleAdminListControllersOfGameForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listControllersOfGameValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListControllersOfGameResult.class);
    }

    /**
     *  (asynchronously)
     * 获取单个游戏关联的控制器列表
     * @param varForms ConsoleAdminListControllersOfGameForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listControllersOfGameAsync(ConsoleAdminListControllersOfGameForms varForms, final ApiCallback<ConsoleAdminListControllersOfGameResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listControllersOfGameValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListControllersOfGameResult.class, callback);
        return call;
    }
    /**
     * Build call for listDeployableInstances
     * @param varForms ConsoleAdminListDeployableInstancesForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDeployableInstancesCall(ConsoleAdminListDeployableInstancesForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listDeployableInstances";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("versionId", varForms.getVersionId());
        localVarFormParams.put("projectId", varForms.getProjectId());
        if (varForms.getPageSize() != null) {
            localVarFormParams.put("pageSize", varForms.getPageSize());
        }
        if (varForms.getPageNumber() != null) {
            localVarFormParams.put("pageNumber", varForms.getPageNumber());
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
    
    private com.squareup.okhttp.Call listDeployableInstancesValidateBeforeCall(ConsoleAdminListDeployableInstancesForms varForms) throws ApiException {
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling listDeployableInstances(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listDeployableInstances(Async)");
        }
        
        com.squareup.okhttp.Call call = listDeployableInstancesCall(varForms);
        return call;
    }

    /**
     * 
     * 指定项目和游戏版本，获取可以部署的实例
     * @param varForms ConsoleAdminListDeployableInstancesForms
     * @return ConsoleAdminListDeployableInstancesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListDeployableInstancesResult listDeployableInstances(ConsoleAdminListDeployableInstancesForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListDeployableInstancesResult> resp = listDeployableInstancesWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 指定项目和游戏版本，获取可以部署的实例
     * @param varForms ConsoleAdminListDeployableInstancesForms
     * @return ApiResponse&lt;ConsoleAdminListDeployableInstancesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListDeployableInstancesResult> listDeployableInstancesWithHttpInfo(ConsoleAdminListDeployableInstancesForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listDeployableInstancesValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListDeployableInstancesResult.class);
    }

    /**
     *  (asynchronously)
     * 指定项目和游戏版本，获取可以部署的实例
     * @param varForms ConsoleAdminListDeployableInstancesForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDeployableInstancesAsync(ConsoleAdminListDeployableInstancesForms varForms, final ApiCallback<ConsoleAdminListDeployableInstancesResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listDeployableInstancesValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListDeployableInstancesResult.class, callback);
        return call;
    }
    /**
     * Build call for listGameDeployDetailsOfProject
     * @param varForms ConsoleAdminListGameDeployDetailsOfProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGameDeployDetailsOfProjectCall(ConsoleAdminListGameDeployDetailsOfProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listGameDeployDetailsOfProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getProjectId() != null) {
            localVarFormParams.put("projectId", varForms.getProjectId());
        }
        if (varForms.getGameId() != null) {
            localVarFormParams.put("gameId", varForms.getGameId());
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
    
    private com.squareup.okhttp.Call listGameDeployDetailsOfProjectValidateBeforeCall(ConsoleAdminListGameDeployDetailsOfProjectForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = listGameDeployDetailsOfProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 获取项目下游戏部署版本信息
     * @param varForms ConsoleAdminListGameDeployDetailsOfProjectForms
     * @return ConsoleAdminListGameDeployDetailsOfProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListGameDeployDetailsOfProjectResult listGameDeployDetailsOfProject(ConsoleAdminListGameDeployDetailsOfProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListGameDeployDetailsOfProjectResult> resp = listGameDeployDetailsOfProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 获取项目下游戏部署版本信息
     * @param varForms ConsoleAdminListGameDeployDetailsOfProjectForms
     * @return ApiResponse&lt;ConsoleAdminListGameDeployDetailsOfProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListGameDeployDetailsOfProjectResult> listGameDeployDetailsOfProjectWithHttpInfo(ConsoleAdminListGameDeployDetailsOfProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listGameDeployDetailsOfProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListGameDeployDetailsOfProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 获取项目下游戏部署版本信息
     * @param varForms ConsoleAdminListGameDeployDetailsOfProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGameDeployDetailsOfProjectAsync(ConsoleAdminListGameDeployDetailsOfProjectForms varForms, final ApiCallback<ConsoleAdminListGameDeployDetailsOfProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listGameDeployDetailsOfProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListGameDeployDetailsOfProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for listGameVersions
     * @param varForms ConsoleAdminListGameVersionsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGameVersionsCall(ConsoleAdminListGameVersionsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listGameVersions";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
        }
        if (varForms.getMaxResults() != null) {
            localVarFormParams.put("maxResults", varForms.getMaxResults());
        }
        localVarFormParams.put("gameId", varForms.getGameId());

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
    
    private com.squareup.okhttp.Call listGameVersionsValidateBeforeCall(ConsoleAdminListGameVersionsForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling listGameVersions(Async)");
        }
        
        com.squareup.okhttp.Call call = listGameVersionsCall(varForms);
        return call;
    }

    /**
     * 
     * 分页获取游戏版本列表
     * @param varForms ConsoleAdminListGameVersionsForms
     * @return ConsoleAdminListGameVersionsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListGameVersionsResult listGameVersions(ConsoleAdminListGameVersionsForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListGameVersionsResult> resp = listGameVersionsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 分页获取游戏版本列表
     * @param varForms ConsoleAdminListGameVersionsForms
     * @return ApiResponse&lt;ConsoleAdminListGameVersionsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListGameVersionsResult> listGameVersionsWithHttpInfo(ConsoleAdminListGameVersionsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listGameVersionsValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListGameVersionsResult.class);
    }

    /**
     *  (asynchronously)
     * 分页获取游戏版本列表
     * @param varForms ConsoleAdminListGameVersionsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGameVersionsAsync(ConsoleAdminListGameVersionsForms varForms, final ApiCallback<ConsoleAdminListGameVersionsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listGameVersionsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListGameVersionsResult.class, callback);
        return call;
    }
    /**
     * Build call for listGames
     * @param varForms ConsoleAdminListGamesForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGamesCall(ConsoleAdminListGamesForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listGames";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
        }
        if (varForms.getMaxResults() != null) {
            localVarFormParams.put("maxResults", varForms.getMaxResults());
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
    
    private com.squareup.okhttp.Call listGamesValidateBeforeCall(ConsoleAdminListGamesForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = listGamesCall(varForms);
        return call;
    }

    /**
     * 
     * 分页获取游戏列表
     * @param varForms ConsoleAdminListGamesForms
     * @return ConsoleAdminListGamesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListGamesResult listGames(ConsoleAdminListGamesForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListGamesResult> resp = listGamesWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 分页获取游戏列表
     * @param varForms ConsoleAdminListGamesForms
     * @return ApiResponse&lt;ConsoleAdminListGamesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListGamesResult> listGamesWithHttpInfo(ConsoleAdminListGamesForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listGamesValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListGamesResult.class);
    }

    /**
     *  (asynchronously)
     * 分页获取游戏列表
     * @param varForms ConsoleAdminListGamesForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGamesAsync(ConsoleAdminListGamesForms varForms, final ApiCallback<ConsoleAdminListGamesResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listGamesValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListGamesResult.class, callback);
        return call;
    }
    /**
     * Build call for listInstancesOfProject
     * @param varForms ConsoleAdminListInstancesOfProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInstancesOfProjectCall(ConsoleAdminListInstancesOfProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listInstancesOfProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
        }
        if (varForms.getMaxResult() != null) {
            localVarFormParams.put("maxResult", varForms.getMaxResult());
        }
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
    
    private com.squareup.okhttp.Call listInstancesOfProjectValidateBeforeCall(ConsoleAdminListInstancesOfProjectForms varForms) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listInstancesOfProject(Async)");
        }
        
        com.squareup.okhttp.Call call = listInstancesOfProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 分页获取项目中的实例
     * @param varForms ConsoleAdminListInstancesOfProjectForms
     * @return ConsoleAdminListInstancesOfProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListInstancesOfProjectResult listInstancesOfProject(ConsoleAdminListInstancesOfProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListInstancesOfProjectResult> resp = listInstancesOfProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 分页获取项目中的实例
     * @param varForms ConsoleAdminListInstancesOfProjectForms
     * @return ApiResponse&lt;ConsoleAdminListInstancesOfProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListInstancesOfProjectResult> listInstancesOfProjectWithHttpInfo(ConsoleAdminListInstancesOfProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listInstancesOfProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListInstancesOfProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 分页获取项目中的实例
     * @param varForms ConsoleAdminListInstancesOfProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInstancesOfProjectAsync(ConsoleAdminListInstancesOfProjectForms varForms, final ApiCallback<ConsoleAdminListInstancesOfProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listInstancesOfProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListInstancesOfProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for listProjects
     * @param varForms ConsoleAdminListProjectsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listProjectsCall(ConsoleAdminListProjectsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listProjects";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
        }
        if (varForms.getMaxResults() != null) {
            localVarFormParams.put("maxResults", varForms.getMaxResults());
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
    
    private com.squareup.okhttp.Call listProjectsValidateBeforeCall(ConsoleAdminListProjectsForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = listProjectsCall(varForms);
        return call;
    }

    /**
     * 
     * 分页获取项目列表
     * @param varForms ConsoleAdminListProjectsForms
     * @return ConsoleAdminListProjectsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListProjectsResult listProjects(ConsoleAdminListProjectsForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListProjectsResult> resp = listProjectsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 分页获取项目列表
     * @param varForms ConsoleAdminListProjectsForms
     * @return ApiResponse&lt;ConsoleAdminListProjectsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListProjectsResult> listProjectsWithHttpInfo(ConsoleAdminListProjectsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listProjectsValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListProjectsResult.class);
    }

    /**
     *  (asynchronously)
     * 分页获取项目列表
     * @param varForms ConsoleAdminListProjectsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listProjectsAsync(ConsoleAdminListProjectsForms varForms, final ApiCallback<ConsoleAdminListProjectsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listProjectsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListProjectsResult.class, callback);
        return call;
    }
    /**
     * Build call for listVersionDeployInstances
     * @param varForms ConsoleAdminListVersionDeployInstancesForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listVersionDeployInstancesCall(ConsoleAdminListVersionDeployInstancesForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/listVersionDeployInstances";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getProjectId() != null) {
            localVarFormParams.put("projectId", varForms.getProjectId());
        }
        if (varForms.getGameId() != null) {
            localVarFormParams.put("gameId", varForms.getGameId());
        }
        if (varForms.getVersionId() != null) {
            localVarFormParams.put("versionId", varForms.getVersionId());
        }
        if (varForms.getDeployStatus() != null) {
            localVarFormParams.put("deployStatus", varForms.getDeployStatus());
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
    
    private com.squareup.okhttp.Call listVersionDeployInstancesValidateBeforeCall(ConsoleAdminListVersionDeployInstancesForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = listVersionDeployInstancesCall(varForms);
        return call;
    }

    /**
     * 
     * 获取项目下游戏版本的部署实例信息
     * @param varForms ConsoleAdminListVersionDeployInstancesForms
     * @return ConsoleAdminListVersionDeployInstancesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminListVersionDeployInstancesResult listVersionDeployInstances(ConsoleAdminListVersionDeployInstancesForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminListVersionDeployInstancesResult> resp = listVersionDeployInstancesWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 获取项目下游戏版本的部署实例信息
     * @param varForms ConsoleAdminListVersionDeployInstancesForms
     * @return ApiResponse&lt;ConsoleAdminListVersionDeployInstancesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminListVersionDeployInstancesResult> listVersionDeployInstancesWithHttpInfo(ConsoleAdminListVersionDeployInstancesForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listVersionDeployInstancesValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminListVersionDeployInstancesResult.class);
    }

    /**
     *  (asynchronously)
     * 获取项目下游戏版本的部署实例信息
     * @param varForms ConsoleAdminListVersionDeployInstancesForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listVersionDeployInstancesAsync(ConsoleAdminListVersionDeployInstancesForms varForms, final ApiCallback<ConsoleAdminListVersionDeployInstancesResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listVersionDeployInstancesValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminListVersionDeployInstancesResult.class, callback);
        return call;
    }
    /**
     * Build call for removeGameFromProject
     * @param varForms ConsoleAdminRemoveGameFromProjectForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeGameFromProjectCall(ConsoleAdminRemoveGameFromProjectForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/removeGameFromProject";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("projectId", varForms.getProjectId());
        localVarFormParams.put("gameId", varForms.getGameId());

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
    
    private com.squareup.okhttp.Call removeGameFromProjectValidateBeforeCall(ConsoleAdminRemoveGameFromProjectForms varForms) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling removeGameFromProject(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling removeGameFromProject(Async)");
        }
        
        com.squareup.okhttp.Call call = removeGameFromProjectCall(varForms);
        return call;
    }

    /**
     * 
     * 将游戏移出项目
     * @param varForms ConsoleAdminRemoveGameFromProjectForms
     * @return ConsoleAdminRemoveGameFromProjectResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminRemoveGameFromProjectResult removeGameFromProject(ConsoleAdminRemoveGameFromProjectForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminRemoveGameFromProjectResult> resp = removeGameFromProjectWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 将游戏移出项目
     * @param varForms ConsoleAdminRemoveGameFromProjectForms
     * @return ApiResponse&lt;ConsoleAdminRemoveGameFromProjectResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminRemoveGameFromProjectResult> removeGameFromProjectWithHttpInfo(ConsoleAdminRemoveGameFromProjectForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = removeGameFromProjectValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminRemoveGameFromProjectResult.class);
    }

    /**
     *  (asynchronously)
     * 将游戏移出项目
     * @param varForms ConsoleAdminRemoveGameFromProjectForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeGameFromProjectAsync(ConsoleAdminRemoveGameFromProjectForms varForms, final ApiCallback<ConsoleAdminRemoveGameFromProjectResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = removeGameFromProjectValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminRemoveGameFromProjectResult.class, callback);
        return call;
    }
    /**
     * Build call for submitDeployment
     * @param varForms ConsoleAdminSubmitDeploymentForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitDeploymentCall(ConsoleAdminSubmitDeploymentForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/submitDeployment";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("projectId", varForms.getProjectId());
        localVarFormParams.put("versionId", varForms.getVersionId());
        localVarFormParams.put("cloudGameInstanceIds", varForms.getCloudGameInstanceIds());
        localVarFormParams.put("operationType", varForms.getOperationType());

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
    
    private com.squareup.okhttp.Call submitDeploymentValidateBeforeCall(ConsoleAdminSubmitDeploymentForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling submitDeployment(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (varForms.getProjectId() == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling submitDeployment(Async)");
        }
        // verify the required parameter 'versionId' is set
        if (varForms.getVersionId() == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling submitDeployment(Async)");
        }
        // verify the required parameter 'cloudGameInstanceIds' is set
        if (varForms.getCloudGameInstanceIds() == null) {
            throw new ApiException("Missing the required parameter 'cloudGameInstanceIds' when calling submitDeployment(Async)");
        }
        // verify the required parameter 'operationType' is set
        if (varForms.getOperationType() == null) {
            throw new ApiException("Missing the required parameter 'operationType' when calling submitDeployment(Async)");
        }
        
        com.squareup.okhttp.Call call = submitDeploymentCall(varForms);
        return call;
    }

    /**
     * 
     * 提交游戏版本的部署请求
     * @param varForms ConsoleAdminSubmitDeploymentForms
     * @return ConsoleAdminSubmitDeploymentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminSubmitDeploymentResult submitDeployment(ConsoleAdminSubmitDeploymentForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminSubmitDeploymentResult> resp = submitDeploymentWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 提交游戏版本的部署请求
     * @param varForms ConsoleAdminSubmitDeploymentForms
     * @return ApiResponse&lt;ConsoleAdminSubmitDeploymentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminSubmitDeploymentResult> submitDeploymentWithHttpInfo(ConsoleAdminSubmitDeploymentForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = submitDeploymentValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminSubmitDeploymentResult.class);
    }

    /**
     *  (asynchronously)
     * 提交游戏版本的部署请求
     * @param varForms ConsoleAdminSubmitDeploymentForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitDeploymentAsync(ConsoleAdminSubmitDeploymentForms varForms, final ApiCallback<ConsoleAdminSubmitDeploymentResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = submitDeploymentValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminSubmitDeploymentResult.class, callback);
        return call;
    }
    /**
     * Build call for uploadGameVersionByDownload
     * @param varForms ConsoleAdminUploadGameVersionByDownloadForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadGameVersionByDownloadCall(ConsoleAdminUploadGameVersionByDownloadForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/consoleAdmin/uploadGameVersionByDownload";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("hash", varForms.getHash());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("downloadType", varForms.getDownloadType());
        localVarFormParams.put("versionName", varForms.getVersionName());

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
    
    private com.squareup.okhttp.Call uploadGameVersionByDownloadValidateBeforeCall(ConsoleAdminUploadGameVersionByDownloadForms varForms) throws ApiException {
        // verify the required parameter 'hash' is set
        if (varForms.getHash() == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling uploadGameVersionByDownload(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling uploadGameVersionByDownload(Async)");
        }
        // verify the required parameter 'downloadType' is set
        if (varForms.getDownloadType() == null) {
            throw new ApiException("Missing the required parameter 'downloadType' when calling uploadGameVersionByDownload(Async)");
        }
        // verify the required parameter 'versionName' is set
        if (varForms.getVersionName() == null) {
            throw new ApiException("Missing the required parameter 'versionName' when calling uploadGameVersionByDownload(Async)");
        }
        
        com.squareup.okhttp.Call call = uploadGameVersionByDownloadCall(varForms);
        return call;
    }

    /**
     * 
     * 一键上传：文件上传接口，用远程下载的方式生成新版本
     * @param varForms ConsoleAdminUploadGameVersionByDownloadForms
     * @return ConsoleAdminUploadGameVersionByDownloadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConsoleAdminUploadGameVersionByDownloadResult uploadGameVersionByDownload(ConsoleAdminUploadGameVersionByDownloadForms varForms) throws ApiException {
        ApiResponse<ConsoleAdminUploadGameVersionByDownloadResult> resp = uploadGameVersionByDownloadWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 一键上传：文件上传接口，用远程下载的方式生成新版本
     * @param varForms ConsoleAdminUploadGameVersionByDownloadForms
     * @return ApiResponse&lt;ConsoleAdminUploadGameVersionByDownloadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConsoleAdminUploadGameVersionByDownloadResult> uploadGameVersionByDownloadWithHttpInfo(ConsoleAdminUploadGameVersionByDownloadForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = uploadGameVersionByDownloadValidateBeforeCall(varForms);
        return apiClient.execute(call, ConsoleAdminUploadGameVersionByDownloadResult.class);
    }

    /**
     *  (asynchronously)
     * 一键上传：文件上传接口，用远程下载的方式生成新版本
     * @param varForms ConsoleAdminUploadGameVersionByDownloadForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadGameVersionByDownloadAsync(ConsoleAdminUploadGameVersionByDownloadForms varForms, final ApiCallback<ConsoleAdminUploadGameVersionByDownloadResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = uploadGameVersionByDownloadValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ConsoleAdminUploadGameVersionByDownloadResult.class, callback);
        return call;
    }
}
