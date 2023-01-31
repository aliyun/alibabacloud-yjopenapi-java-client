/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.BatchStopGameResult;
import com.alibaba.yjopenapi.client.model.GetGameConcurrencyResult;
import com.alibaba.yjopenapi.client.model.GetStockResult;
import com.alibaba.yjopenapi.client.model.GetStopGameTokenResult;
import com.alibaba.yjopenapi.client.model.QuerySessionStatusResult;
import com.alibaba.yjopenapi.client.model.StopGameResult;
import com.alibaba.yjopenapi.client.model.TryToGetSlotFormsStartParam;
import com.alibaba.yjopenapi.client.model.TryToGetSlotResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DispatchApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public DispatchApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public DispatchApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for batchStopGame
     * @param varForms BatchStopGameForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call batchStopGameCall(BatchStopGameForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/batchStopGame";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("token", varForms.getToken());
        if (varForms.getReason() != null) {
            localVarFormParams.put("reason", varForms.getReason());
        }
        if (varForms.getTrackInfo() != null) {
            localVarFormParams.put("trackInfo", varForms.getTrackInfo());
        }
        if (varForms.getTags() != null) {
            localVarFormParams.put("tags", varForms.getTags());
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
    
    private com.squareup.okhttp.Call batchStopGameValidateBeforeCall(BatchStopGameForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling batchStopGame(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling batchStopGame(Async)");
        }
        // verify the required parameter 'token' is set
        if (varForms.getToken() == null) {
            throw new ApiException("Missing the required parameter 'token' when calling batchStopGame(Async)");
        }
        
        com.squareup.okhttp.Call call = batchStopGameCall(varForms);
        return call;
    }

    /**
     * 
     * 游戏下全量踢下线，异步接口
     * @param varForms BatchStopGameForms
     * @return BatchStopGameResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BatchStopGameResult batchStopGame(BatchStopGameForms varForms) throws ApiException {
        ApiResponse<BatchStopGameResult> resp = batchStopGameWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 游戏下全量踢下线，异步接口
     * @param varForms BatchStopGameForms
     * @return ApiResponse&lt;BatchStopGameResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchStopGameResult> batchStopGameWithHttpInfo(BatchStopGameForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = batchStopGameValidateBeforeCall(varForms);
        return apiClient.execute(call, BatchStopGameResult.class);
    }

    /**
     *  (asynchronously)
     * 游戏下全量踢下线，异步接口
     * @param varForms BatchStopGameForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchStopGameAsync(BatchStopGameForms varForms, final ApiCallback<BatchStopGameResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = batchStopGameValidateBeforeCall(varForms);
        apiClient.executeAsync(call, BatchStopGameResult.class, callback);
        return call;
    }
    /**
     * Build call for getGameConcurrency
     * @param varForms GetGameConcurrencyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGameConcurrencyCall(GetGameConcurrencyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/getGameConcurrency";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());
        if (varForms.getQueryQueueConcurrency() != null) {
            localVarFormParams.put("queryQueueConcurrency", varForms.getQueryQueueConcurrency());
        }
        if (varForms.getQueueUserLevel() != null) {
            localVarFormParams.put("queueUserLevel", varForms.getQueueUserLevel());
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
    
    private com.squareup.okhttp.Call getGameConcurrencyValidateBeforeCall(GetGameConcurrencyForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling getGameConcurrency(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling getGameConcurrency(Async)");
        }
        
        com.squareup.okhttp.Call call = getGameConcurrencyCall(varForms);
        return call;
    }

    /**
     * 
     * 调用GetGameConcurrency获取游戏当前并发数
     * @param varForms GetGameConcurrencyForms
     * @return GetGameConcurrencyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetGameConcurrencyResult getGameConcurrency(GetGameConcurrencyForms varForms) throws ApiException {
        ApiResponse<GetGameConcurrencyResult> resp = getGameConcurrencyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 调用GetGameConcurrency获取游戏当前并发数
     * @param varForms GetGameConcurrencyForms
     * @return ApiResponse&lt;GetGameConcurrencyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetGameConcurrencyResult> getGameConcurrencyWithHttpInfo(GetGameConcurrencyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getGameConcurrencyValidateBeforeCall(varForms);
        return apiClient.execute(call, GetGameConcurrencyResult.class);
    }

    /**
     *  (asynchronously)
     * 调用GetGameConcurrency获取游戏当前并发数
     * @param varForms GetGameConcurrencyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGameConcurrencyAsync(GetGameConcurrencyForms varForms, final ApiCallback<GetGameConcurrencyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getGameConcurrencyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, GetGameConcurrencyResult.class, callback);
        return call;
    }
    /**
     * Build call for getStock
     * @param varForms GetStockForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockCall(GetStockForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/getStock";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getGameId() != null) {
            localVarFormParams.put("gameId", varForms.getGameId());
        }
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("type", varForms.getType());

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
    
    private com.squareup.okhttp.Call getStockValidateBeforeCall(GetStockForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling getStock(Async)");
        }
        // verify the required parameter 'type' is set
        if (varForms.getType() == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getStock(Async)");
        }
        
        com.squareup.okhttp.Call call = getStockCall(varForms);
        return call;
    }

    /**
     * 
     * 调用GetStock获取游戏当前库存
     * @param varForms GetStockForms
     * @return GetStockResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetStockResult getStock(GetStockForms varForms) throws ApiException {
        ApiResponse<GetStockResult> resp = getStockWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 调用GetStock获取游戏当前库存
     * @param varForms GetStockForms
     * @return ApiResponse&lt;GetStockResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetStockResult> getStockWithHttpInfo(GetStockForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getStockValidateBeforeCall(varForms);
        return apiClient.execute(call, GetStockResult.class);
    }

    /**
     *  (asynchronously)
     * 调用GetStock获取游戏当前库存
     * @param varForms GetStockForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockAsync(GetStockForms varForms, final ApiCallback<GetStockResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getStockValidateBeforeCall(varForms);
        apiClient.executeAsync(call, GetStockResult.class, callback);
        return call;
    }
    /**
     * Build call for getStopGameToken
     * @param varForms GetStopGameTokenForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStopGameTokenCall(GetStopGameTokenForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/getStopGameToken";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());

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
    
    private com.squareup.okhttp.Call getStopGameTokenValidateBeforeCall(GetStopGameTokenForms varForms) throws ApiException {
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling getStopGameToken(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling getStopGameToken(Async)");
        }
        
        com.squareup.okhttp.Call call = getStopGameTokenCall(varForms);
        return call;
    }

    /**
     * 
     * 全量踢下线获取token
     * @param varForms GetStopGameTokenForms
     * @return GetStopGameTokenResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetStopGameTokenResult getStopGameToken(GetStopGameTokenForms varForms) throws ApiException {
        ApiResponse<GetStopGameTokenResult> resp = getStopGameTokenWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 全量踢下线获取token
     * @param varForms GetStopGameTokenForms
     * @return ApiResponse&lt;GetStopGameTokenResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetStopGameTokenResult> getStopGameTokenWithHttpInfo(GetStopGameTokenForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getStopGameTokenValidateBeforeCall(varForms);
        return apiClient.execute(call, GetStopGameTokenResult.class);
    }

    /**
     *  (asynchronously)
     * 全量踢下线获取token
     * @param varForms GetStopGameTokenForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStopGameTokenAsync(GetStopGameTokenForms varForms, final ApiCallback<GetStopGameTokenResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getStopGameTokenValidateBeforeCall(varForms);
        apiClient.executeAsync(call, GetStopGameTokenResult.class, callback);
        return call;
    }
    /**
     * Build call for querySessionStatus
     * @param varForms QuerySessionStatusForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call querySessionStatusCall(QuerySessionStatusForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/querySessionStatus";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("appKey", varForms.getAppKey());

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
    
    private com.squareup.okhttp.Call querySessionStatusValidateBeforeCall(QuerySessionStatusForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling querySessionStatus(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling querySessionStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = querySessionStatusCall(varForms);
        return call;
    }

    /**
     * 
     * 查询会话当前状态
     * @param varForms QuerySessionStatusForms
     * @return QuerySessionStatusResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuerySessionStatusResult querySessionStatus(QuerySessionStatusForms varForms) throws ApiException {
        ApiResponse<QuerySessionStatusResult> resp = querySessionStatusWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询会话当前状态
     * @param varForms QuerySessionStatusForms
     * @return ApiResponse&lt;QuerySessionStatusResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuerySessionStatusResult> querySessionStatusWithHttpInfo(QuerySessionStatusForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = querySessionStatusValidateBeforeCall(varForms);
        return apiClient.execute(call, QuerySessionStatusResult.class);
    }

    /**
     *  (asynchronously)
     * 查询会话当前状态
     * @param varForms QuerySessionStatusForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call querySessionStatusAsync(QuerySessionStatusForms varForms, final ApiCallback<QuerySessionStatusResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = querySessionStatusValidateBeforeCall(varForms);
        apiClient.executeAsync(call, QuerySessionStatusResult.class, callback);
        return call;
    }
    /**
     * Build call for stopGame
     * @param varForms StopGameForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopGameCall(StopGameForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/stopGame";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
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
    
    private com.squareup.okhttp.Call stopGameValidateBeforeCall(StopGameForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling stopGame(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling stopGame(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling stopGame(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling stopGame(Async)");
        }
        
        com.squareup.okhttp.Call call = stopGameCall(varForms);
        return call;
    }

    /**
     * 
     * 服务端发起，停止某个用户的某个游戏的某个会话
     * @param varForms StopGameForms
     * @return StopGameResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StopGameResult stopGame(StopGameForms varForms) throws ApiException {
        ApiResponse<StopGameResult> resp = stopGameWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 服务端发起，停止某个用户的某个游戏的某个会话
     * @param varForms StopGameForms
     * @return ApiResponse&lt;StopGameResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StopGameResult> stopGameWithHttpInfo(StopGameForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = stopGameValidateBeforeCall(varForms);
        return apiClient.execute(call, StopGameResult.class);
    }

    /**
     *  (asynchronously)
     * 服务端发起，停止某个用户的某个游戏的某个会话
     * @param varForms StopGameForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopGameAsync(StopGameForms varForms, final ApiCallback<StopGameResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = stopGameValidateBeforeCall(varForms);
        apiClient.executeAsync(call, StopGameResult.class, callback);
        return call;
    }
    /**
     * Build call for tryToGetSlot
     * @param varForms TryToGetSlotForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tryToGetSlotCall(TryToGetSlotForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/tryToGetSlot";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());
        if (varForms.getRegionId() != null) {
            localVarFormParams.put("regionId", varForms.getRegionId());
        }
        if (varForms.getReConnect() != null) {
            localVarFormParams.put("reConnect", varForms.getReConnect());
        }
        if (varForms.getBizParam() != null) {
            localVarFormParams.put("bizParam", varForms.getBizParam());
        }
        if (varForms.getClientIp() != null) {
            localVarFormParams.put("clientIp", varForms.getClientIp());
        }
        if (varForms.getTags() != null) {
            localVarFormParams.put("tags", varForms.getTags());
        }
        if (varForms.getUserLevel() != null) {
            localVarFormParams.put("userLevel", varForms.getUserLevel());
        }
        if (varForms.getCodec() != null) {
            localVarFormParams.put("codec", varForms.getCodec());
        }
        if (varForms.getResolution() != null) {
            localVarFormParams.put("resolution", varForms.getResolution());
        }
        if (varForms.getBitRate() != null) {
            localVarFormParams.put("bitRate", varForms.getBitRate());
        }
        if (varForms.getFps() != null) {
            localVarFormParams.put("fps", varForms.getFps());
        }
        if (varForms.getGameCmdParam() != null) {
            localVarFormParams.put("gameCmdParam", varForms.getGameCmdParam());
        }
        if (varForms.getStartParam() != null) {
            localVarFormParams.put("startParam", varForms.getStartParam());
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
    
    private com.squareup.okhttp.Call tryToGetSlotValidateBeforeCall(TryToGetSlotForms varForms) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling tryToGetSlot(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling tryToGetSlot(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling tryToGetSlot(Async)");
        }
        
        com.squareup.okhttp.Call call = tryToGetSlotCall(varForms);
        return call;
    }

    /**
     * 
     * 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。
     * @param varForms TryToGetSlotForms
     * @return TryToGetSlotResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TryToGetSlotResult tryToGetSlot(TryToGetSlotForms varForms) throws ApiException {
        ApiResponse<TryToGetSlotResult> resp = tryToGetSlotWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。
     * @param varForms TryToGetSlotForms
     * @return ApiResponse&lt;TryToGetSlotResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TryToGetSlotResult> tryToGetSlotWithHttpInfo(TryToGetSlotForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = tryToGetSlotValidateBeforeCall(varForms);
        return apiClient.execute(call, TryToGetSlotResult.class);
    }

    /**
     *  (asynchronously)
     * 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。
     * @param varForms TryToGetSlotForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tryToGetSlotAsync(TryToGetSlotForms varForms, final ApiCallback<TryToGetSlotResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = tryToGetSlotValidateBeforeCall(varForms);
        apiClient.executeAsync(call, TryToGetSlotResult.class, callback);
        return call;
    }
}
