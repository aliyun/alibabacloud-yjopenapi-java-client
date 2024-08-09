/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.BatchStopGameResult;
import com.alibaba.yjopenapi.client.model.CancelGameHangResult;
import com.alibaba.yjopenapi.client.model.ClientNotifyResult;
import com.alibaba.yjopenapi.client.model.GameNotifyResult;
import com.alibaba.yjopenapi.client.model.GetGameConcurrencyResult;
import com.alibaba.yjopenapi.client.model.GetStockResult;
import com.alibaba.yjopenapi.client.model.GetStopGameTokenResult;
import com.alibaba.yjopenapi.client.model.ListGameServerIpResult;
import com.alibaba.yjopenapi.client.model.QueryGameHangResult;
import com.alibaba.yjopenapi.client.model.QuerySessionStatusResult;
import com.alibaba.yjopenapi.client.model.ReplaceSlotFormsStartParam;
import com.alibaba.yjopenapi.client.model.ReplaceSlotResult;
import com.alibaba.yjopenapi.client.model.SetGameAliveResult;
import com.alibaba.yjopenapi.client.model.SetGameHangResult;
import com.alibaba.yjopenapi.client.model.StopGameResult;
import com.alibaba.yjopenapi.client.model.StopPreopenContainerResult;
import com.alibaba.yjopenapi.client.model.TryToGetSlotFormsStartParam;
import com.alibaba.yjopenapi.client.model.TryToGetSlotResult;
import com.alibaba.yjopenapi.client.model.TryToGetSlotsFormsRequests;
import com.alibaba.yjopenapi.client.model.TryToGetSlotsResult;
import com.alibaba.yjopenapi.client.model.UpdatePreopenStrategyResult;

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
     * 
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
     * 
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
     * 
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
     * Build call for cancelGameHang
     * @param varForms CancelGameHangForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelGameHangCall(CancelGameHangForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/cancelGameHang";

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
    
    private com.squareup.okhttp.Call cancelGameHangValidateBeforeCall(CancelGameHangForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling cancelGameHang(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling cancelGameHang(Async)");
        }
        
        com.squareup.okhttp.Call call = cancelGameHangCall(varForms);
        return call;
    }

    /**
     * 
     * 取消游戏挂机
     * @param varForms CancelGameHangForms
     * @return CancelGameHangResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelGameHangResult cancelGameHang(CancelGameHangForms varForms) throws ApiException {
        ApiResponse<CancelGameHangResult> resp = cancelGameHangWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 取消游戏挂机
     * @param varForms CancelGameHangForms
     * @return ApiResponse&lt;CancelGameHangResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelGameHangResult> cancelGameHangWithHttpInfo(CancelGameHangForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = cancelGameHangValidateBeforeCall(varForms);
        return apiClient.execute(call, CancelGameHangResult.class);
    }

    /**
     *  (asynchronously)
     * 取消游戏挂机
     * @param varForms CancelGameHangForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelGameHangAsync(CancelGameHangForms varForms, final ApiCallback<CancelGameHangResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = cancelGameHangValidateBeforeCall(varForms);
        apiClient.executeAsync(call, CancelGameHangResult.class, callback);
        return call;
    }
    /**
     * Build call for clientNotify
     * @param varForms ClientNotifyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call clientNotifyCall(ClientNotifyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/clientNotify";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("value", varForms.getValue());

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
    
    private com.squareup.okhttp.Call clientNotifyValidateBeforeCall(ClientNotifyForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling clientNotify(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling clientNotify(Async)");
        }
        // verify the required parameter 'value' is set
        if (varForms.getValue() == null) {
            throw new ApiException("Missing the required parameter 'value' when calling clientNotify(Async)");
        }
        
        com.squareup.okhttp.Call call = clientNotifyCall(varForms);
        return call;
    }

    /**
     * 
     * clientNotify
     * @param varForms ClientNotifyForms
     * @return ClientNotifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClientNotifyResult clientNotify(ClientNotifyForms varForms) throws ApiException {
        ApiResponse<ClientNotifyResult> resp = clientNotifyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * clientNotify
     * @param varForms ClientNotifyForms
     * @return ApiResponse&lt;ClientNotifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClientNotifyResult> clientNotifyWithHttpInfo(ClientNotifyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = clientNotifyValidateBeforeCall(varForms);
        return apiClient.execute(call, ClientNotifyResult.class);
    }

    /**
     *  (asynchronously)
     * clientNotify
     * @param varForms ClientNotifyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clientNotifyAsync(ClientNotifyForms varForms, final ApiCallback<ClientNotifyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = clientNotifyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ClientNotifyResult.class, callback);
        return call;
    }
    /**
     * Build call for gameNotify
     * @param varForms GameNotifyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gameNotifyCall(GameNotifyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/gameNotify";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("type", varForms.getType());
        if (varForms.getValue() != null) {
            localVarFormParams.put("value", varForms.getValue());
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
    
    private com.squareup.okhttp.Call gameNotifyValidateBeforeCall(GameNotifyForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling gameNotify(Async)");
        }
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling gameNotify(Async)");
        }
        // verify the required parameter 'type' is set
        if (varForms.getType() == null) {
            throw new ApiException("Missing the required parameter 'type' when calling gameNotify(Async)");
        }
        
        com.squareup.okhttp.Call call = gameNotifyCall(varForms);
        return call;
    }

    /**
     * 
     * 游戏通知接口
     * @param varForms GameNotifyForms
     * @return GameNotifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GameNotifyResult gameNotify(GameNotifyForms varForms) throws ApiException {
        ApiResponse<GameNotifyResult> resp = gameNotifyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 游戏通知接口
     * @param varForms GameNotifyForms
     * @return ApiResponse&lt;GameNotifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GameNotifyResult> gameNotifyWithHttpInfo(GameNotifyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = gameNotifyValidateBeforeCall(varForms);
        return apiClient.execute(call, GameNotifyResult.class);
    }

    /**
     *  (asynchronously)
     * 游戏通知接口
     * @param varForms GameNotifyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call gameNotifyAsync(GameNotifyForms varForms, final ApiCallback<GameNotifyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = gameNotifyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, GameNotifyResult.class, callback);
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
     * Build call for listGameServerIp
     * @param varForms ListGameServerIpForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGameServerIpCall(ListGameServerIpForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/listGameServerIp";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getPageSize() != null) {
            localVarFormParams.put("pageSize", varForms.getPageSize());
        }
        if (varForms.getNextToken() != null) {
            localVarFormParams.put("nextToken", varForms.getNextToken());
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
    
    private com.squareup.okhttp.Call listGameServerIpValidateBeforeCall(ListGameServerIpForms varForms) throws ApiException {
        
        com.squareup.okhttp.Call call = listGameServerIpCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms ListGameServerIpForms
     * @return ListGameServerIpResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListGameServerIpResult listGameServerIp(ListGameServerIpForms varForms) throws ApiException {
        ApiResponse<ListGameServerIpResult> resp = listGameServerIpWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms ListGameServerIpForms
     * @return ApiResponse&lt;ListGameServerIpResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListGameServerIpResult> listGameServerIpWithHttpInfo(ListGameServerIpForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listGameServerIpValidateBeforeCall(varForms);
        return apiClient.execute(call, ListGameServerIpResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms ListGameServerIpForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGameServerIpAsync(ListGameServerIpForms varForms, final ApiCallback<ListGameServerIpResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listGameServerIpValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ListGameServerIpResult.class, callback);
        return call;
    }
    /**
     * Build call for queryGameHang
     * @param varForms QueryGameHangForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryGameHangCall(QueryGameHangForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/queryGameHang";

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
    
    private com.squareup.okhttp.Call queryGameHangValidateBeforeCall(QueryGameHangForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling queryGameHang(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling queryGameHang(Async)");
        }
        
        com.squareup.okhttp.Call call = queryGameHangCall(varForms);
        return call;
    }

    /**
     * 
     * 查询游戏挂机状态
     * @param varForms QueryGameHangForms
     * @return QueryGameHangResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryGameHangResult queryGameHang(QueryGameHangForms varForms) throws ApiException {
        ApiResponse<QueryGameHangResult> resp = queryGameHangWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 查询游戏挂机状态
     * @param varForms QueryGameHangForms
     * @return ApiResponse&lt;QueryGameHangResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryGameHangResult> queryGameHangWithHttpInfo(QueryGameHangForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = queryGameHangValidateBeforeCall(varForms);
        return apiClient.execute(call, QueryGameHangResult.class);
    }

    /**
     *  (asynchronously)
     * 查询游戏挂机状态
     * @param varForms QueryGameHangForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryGameHangAsync(QueryGameHangForms varForms, final ApiCallback<QueryGameHangResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryGameHangValidateBeforeCall(varForms);
        apiClient.executeAsync(call, QueryGameHangResult.class, callback);
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
     * Build call for replaceSlot
     * @param varForms ReplaceSlotForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call replaceSlotCall(ReplaceSlotForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/replaceSlot";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("replaceSession", varForms.getReplaceSession());
        localVarFormParams.put("accountId", varForms.getAccountId());
        localVarFormParams.put("gameId", varForms.getGameId());
        localVarFormParams.put("appKey", varForms.getAppKey());
        if (varForms.getBizParam() != null) {
            localVarFormParams.put("bizParam", varForms.getBizParam());
        }
        if (varForms.getClientIp() != null) {
            localVarFormParams.put("clientIp", varForms.getClientIp());
        }
        if (varForms.getTags() != null) {
            localVarFormParams.put("tags", varForms.getTags());
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
        if (varForms.getUserLevel() != null) {
            localVarFormParams.put("userLevel", varForms.getUserLevel());
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
    
    private com.squareup.okhttp.Call replaceSlotValidateBeforeCall(ReplaceSlotForms varForms) throws ApiException {
        // verify the required parameter 'replaceSession' is set
        if (varForms.getReplaceSession() == null) {
            throw new ApiException("Missing the required parameter 'replaceSession' when calling replaceSlot(Async)");
        }
        // verify the required parameter 'accountId' is set
        if (varForms.getAccountId() == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceSlot(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling replaceSlot(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling replaceSlot(Async)");
        }
        
        com.squareup.okhttp.Call call = replaceSlotCall(varForms);
        return call;
    }

    /**
     * 
     * replaceSlot
     * @param varForms ReplaceSlotForms
     * @return ReplaceSlotResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReplaceSlotResult replaceSlot(ReplaceSlotForms varForms) throws ApiException {
        ApiResponse<ReplaceSlotResult> resp = replaceSlotWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * replaceSlot
     * @param varForms ReplaceSlotForms
     * @return ApiResponse&lt;ReplaceSlotResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReplaceSlotResult> replaceSlotWithHttpInfo(ReplaceSlotForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = replaceSlotValidateBeforeCall(varForms);
        return apiClient.execute(call, ReplaceSlotResult.class);
    }

    /**
     *  (asynchronously)
     * replaceSlot
     * @param varForms ReplaceSlotForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceSlotAsync(ReplaceSlotForms varForms, final ApiCallback<ReplaceSlotResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = replaceSlotValidateBeforeCall(varForms);
        apiClient.executeAsync(call, ReplaceSlotResult.class, callback);
        return call;
    }
    /**
     * Build call for setGameAlive
     * @param varForms SetGameAliveForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setGameAliveCall(SetGameAliveForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/setGameAlive";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("keepAlive", varForms.getKeepAlive());

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
    
    private com.squareup.okhttp.Call setGameAliveValidateBeforeCall(SetGameAliveForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling setGameAlive(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling setGameAlive(Async)");
        }
        // verify the required parameter 'keepAlive' is set
        if (varForms.getKeepAlive() == null) {
            throw new ApiException("Missing the required parameter 'keepAlive' when calling setGameAlive(Async)");
        }
        
        com.squareup.okhttp.Call call = setGameAliveCall(varForms);
        return call;
    }

    /**
     * 
     * 设置游戏可运行时长
     * @param varForms SetGameAliveForms
     * @return SetGameAliveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SetGameAliveResult setGameAlive(SetGameAliveForms varForms) throws ApiException {
        ApiResponse<SetGameAliveResult> resp = setGameAliveWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 设置游戏可运行时长
     * @param varForms SetGameAliveForms
     * @return ApiResponse&lt;SetGameAliveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SetGameAliveResult> setGameAliveWithHttpInfo(SetGameAliveForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = setGameAliveValidateBeforeCall(varForms);
        return apiClient.execute(call, SetGameAliveResult.class);
    }

    /**
     *  (asynchronously)
     * 设置游戏可运行时长
     * @param varForms SetGameAliveForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setGameAliveAsync(SetGameAliveForms varForms, final ApiCallback<SetGameAliveResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = setGameAliveValidateBeforeCall(varForms);
        apiClient.executeAsync(call, SetGameAliveResult.class, callback);
        return call;
    }
    /**
     * Build call for setGameHang
     * @param varForms SetGameHangForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setGameHangCall(SetGameHangForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/setGameHang";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("gameSession", varForms.getGameSession());
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("duration", varForms.getDuration());
        if (varForms.getKickInTheGame() != null) {
            localVarFormParams.put("kickInTheGame", varForms.getKickInTheGame());
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
    
    private com.squareup.okhttp.Call setGameHangValidateBeforeCall(SetGameHangForms varForms) throws ApiException {
        // verify the required parameter 'gameSession' is set
        if (varForms.getGameSession() == null) {
            throw new ApiException("Missing the required parameter 'gameSession' when calling setGameHang(Async)");
        }
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling setGameHang(Async)");
        }
        // verify the required parameter 'duration' is set
        if (varForms.getDuration() == null) {
            throw new ApiException("Missing the required parameter 'duration' when calling setGameHang(Async)");
        }
        
        com.squareup.okhttp.Call call = setGameHangCall(varForms);
        return call;
    }

    /**
     * 
     * 设置游戏挂机
     * @param varForms SetGameHangForms
     * @return SetGameHangResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SetGameHangResult setGameHang(SetGameHangForms varForms) throws ApiException {
        ApiResponse<SetGameHangResult> resp = setGameHangWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 设置游戏挂机
     * @param varForms SetGameHangForms
     * @return ApiResponse&lt;SetGameHangResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SetGameHangResult> setGameHangWithHttpInfo(SetGameHangForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = setGameHangValidateBeforeCall(varForms);
        return apiClient.execute(call, SetGameHangResult.class);
    }

    /**
     *  (asynchronously)
     * 设置游戏挂机
     * @param varForms SetGameHangForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setGameHangAsync(SetGameHangForms varForms, final ApiCallback<SetGameHangResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = setGameHangValidateBeforeCall(varForms);
        apiClient.executeAsync(call, SetGameHangResult.class, callback);
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
     * Build call for stopPreopenContainer
     * @param varForms StopPreopenContainerForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopPreopenContainerCall(StopPreopenContainerForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/stopPreopenContainer";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameId", varForms.getGameId());
        if (varForms.getNumberOfBatches() != null) {
            localVarFormParams.put("numberOfBatches", varForms.getNumberOfBatches());
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
    
    private com.squareup.okhttp.Call stopPreopenContainerValidateBeforeCall(StopPreopenContainerForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling stopPreopenContainer(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling stopPreopenContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = stopPreopenContainerCall(varForms);
        return call;
    }

    /**
     * 
     * 停止预开容器
     * @param varForms StopPreopenContainerForms
     * @return StopPreopenContainerResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StopPreopenContainerResult stopPreopenContainer(StopPreopenContainerForms varForms) throws ApiException {
        ApiResponse<StopPreopenContainerResult> resp = stopPreopenContainerWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 停止预开容器
     * @param varForms StopPreopenContainerForms
     * @return ApiResponse&lt;StopPreopenContainerResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StopPreopenContainerResult> stopPreopenContainerWithHttpInfo(StopPreopenContainerForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = stopPreopenContainerValidateBeforeCall(varForms);
        return apiClient.execute(call, StopPreopenContainerResult.class);
    }

    /**
     *  (asynchronously)
     * 停止预开容器
     * @param varForms StopPreopenContainerForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopPreopenContainerAsync(StopPreopenContainerForms varForms, final ApiCallback<StopPreopenContainerResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = stopPreopenContainerValidateBeforeCall(varForms);
        apiClient.executeAsync(call, StopPreopenContainerResult.class, callback);
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
    /**
     * Build call for tryToGetSlots
     * @param varForms TryToGetSlotsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tryToGetSlotsCall(TryToGetSlotsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/tryToGetSlots";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("parallelSchedule", varForms.getParallelSchedule());
        localVarFormParams.put("requests", varForms.getRequests());

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
    
    private com.squareup.okhttp.Call tryToGetSlotsValidateBeforeCall(TryToGetSlotsForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling tryToGetSlots(Async)");
        }
        // verify the required parameter 'parallelSchedule' is set
        if (varForms.getParallelSchedule() == null) {
            throw new ApiException("Missing the required parameter 'parallelSchedule' when calling tryToGetSlots(Async)");
        }
        // verify the required parameter 'requests' is set
        if (varForms.getRequests() == null) {
            throw new ApiException("Missing the required parameter 'requests' when calling tryToGetSlots(Async)");
        }
        
        com.squareup.okhttp.Call call = tryToGetSlotsCall(varForms);
        return call;
    }

    /**
     * 
     * tryToGetSlots
     * @param varForms TryToGetSlotsForms
     * @return TryToGetSlotsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TryToGetSlotsResult tryToGetSlots(TryToGetSlotsForms varForms) throws ApiException {
        ApiResponse<TryToGetSlotsResult> resp = tryToGetSlotsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * tryToGetSlots
     * @param varForms TryToGetSlotsForms
     * @return ApiResponse&lt;TryToGetSlotsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TryToGetSlotsResult> tryToGetSlotsWithHttpInfo(TryToGetSlotsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = tryToGetSlotsValidateBeforeCall(varForms);
        return apiClient.execute(call, TryToGetSlotsResult.class);
    }

    /**
     *  (asynchronously)
     * tryToGetSlots
     * @param varForms TryToGetSlotsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tryToGetSlotsAsync(TryToGetSlotsForms varForms, final ApiCallback<TryToGetSlotsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = tryToGetSlotsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, TryToGetSlotsResult.class, callback);
        return call;
    }
    /**
     * Build call for updatePreopenStrategy
     * @param varForms UpdatePreopenStrategyForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePreopenStrategyCall(UpdatePreopenStrategyForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/updatePreopenStrategy";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("appKey", varForms.getAppKey());
        localVarFormParams.put("gameId", varForms.getGameId());
        if (varForms.getPreStartCmd() != null) {
            localVarFormParams.put("preStartCmd", varForms.getPreStartCmd());
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
    
    private com.squareup.okhttp.Call updatePreopenStrategyValidateBeforeCall(UpdatePreopenStrategyForms varForms) throws ApiException {
        // verify the required parameter 'appKey' is set
        if (varForms.getAppKey() == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling updatePreopenStrategy(Async)");
        }
        // verify the required parameter 'gameId' is set
        if (varForms.getGameId() == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling updatePreopenStrategy(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePreopenStrategyCall(varForms);
        return call;
    }

    /**
     * 
     * 更新预开预起策略
     * @param varForms UpdatePreopenStrategyForms
     * @return UpdatePreopenStrategyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdatePreopenStrategyResult updatePreopenStrategy(UpdatePreopenStrategyForms varForms) throws ApiException {
        ApiResponse<UpdatePreopenStrategyResult> resp = updatePreopenStrategyWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 更新预开预起策略
     * @param varForms UpdatePreopenStrategyForms
     * @return ApiResponse&lt;UpdatePreopenStrategyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdatePreopenStrategyResult> updatePreopenStrategyWithHttpInfo(UpdatePreopenStrategyForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = updatePreopenStrategyValidateBeforeCall(varForms);
        return apiClient.execute(call, UpdatePreopenStrategyResult.class);
    }

    /**
     *  (asynchronously)
     * 更新预开预起策略
     * @param varForms UpdatePreopenStrategyForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePreopenStrategyAsync(UpdatePreopenStrategyForms varForms, final ApiCallback<UpdatePreopenStrategyResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = updatePreopenStrategyValidateBeforeCall(varForms);
        apiClient.executeAsync(call, UpdatePreopenStrategyResult.class, callback);
        return call;
    }
}
