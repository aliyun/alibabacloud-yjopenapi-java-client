/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.AdaptCreateAndSubmitAllResult;
import com.alibaba.yjopenapi.client.model.AdaptQueryRequestByIdResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdaptApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public AdaptApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public AdaptApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for createAndSubmitAll
     * @param varForms AdaptCreateAndSubmitAllForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAndSubmitAllCall(AdaptCreateAndSubmitAllForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/adapt/createAndSubmitAll";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getGameId() != null) {
            localVarFormParams.put("gameId", varForms.getGameId());
        }
        if (varForms.getGameName() != null) {
            localVarFormParams.put("gameName", varForms.getGameName());
        }
        if (varForms.getGameVersionId() != null) {
            localVarFormParams.put("gameVersionId", varForms.getGameVersionId());
        }
        if (varForms.getGameVersion() != null) {
            localVarFormParams.put("gameVersion", varForms.getGameVersion());
        }
        if (varForms.getResolutionList() != null) {
            localVarFormParams.put("resolutionList", varForms.getResolutionList());
        }
        if (varForms.getFrameRateList() != null) {
            localVarFormParams.put("frameRateList", varForms.getFrameRateList());
        }
        localVarFormParams.put("platformType", varForms.getPlatformType());
        localVarFormParams.put("sourcePlatform", varForms.getSourcePlatform());
        localVarFormParams.put("records", varForms.getRecords());
        localVarFormParams.put("mixGameVersionId", varForms.getMixGameVersionId());
        localVarFormParams.put("mixGameId", varForms.getMixGameId());

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
    
    private com.squareup.okhttp.Call createAndSubmitAllValidateBeforeCall(AdaptCreateAndSubmitAllForms varForms) throws ApiException {
        // verify the required parameter 'platformType' is set
        if (varForms.getPlatformType() == null) {
            throw new ApiException("Missing the required parameter 'platformType' when calling createAndSubmitAll(Async)");
        }
        // verify the required parameter 'sourcePlatform' is set
        if (varForms.getSourcePlatform() == null) {
            throw new ApiException("Missing the required parameter 'sourcePlatform' when calling createAndSubmitAll(Async)");
        }
        // verify the required parameter 'records' is set
        if (varForms.getRecords() == null) {
            throw new ApiException("Missing the required parameter 'records' when calling createAndSubmitAll(Async)");
        }
        // verify the required parameter 'mixGameVersionId' is set
        if (varForms.getMixGameVersionId() == null) {
            throw new ApiException("Missing the required parameter 'mixGameVersionId' when calling createAndSubmitAll(Async)");
        }
        // verify the required parameter 'mixGameId' is set
        if (varForms.getMixGameId() == null) {
            throw new ApiException("Missing the required parameter 'mixGameId' when calling createAndSubmitAll(Async)");
        }
        
        com.squareup.okhttp.Call call = createAndSubmitAllCall(varForms);
        return call;
    }

    /**
     * 
     * createAndSubmitAll
     * @param varForms AdaptCreateAndSubmitAllForms
     * @return AdaptCreateAndSubmitAllResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdaptCreateAndSubmitAllResult createAndSubmitAll(AdaptCreateAndSubmitAllForms varForms) throws ApiException {
        ApiResponse<AdaptCreateAndSubmitAllResult> resp = createAndSubmitAllWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * createAndSubmitAll
     * @param varForms AdaptCreateAndSubmitAllForms
     * @return ApiResponse&lt;AdaptCreateAndSubmitAllResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdaptCreateAndSubmitAllResult> createAndSubmitAllWithHttpInfo(AdaptCreateAndSubmitAllForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = createAndSubmitAllValidateBeforeCall(varForms);
        return apiClient.execute(call, AdaptCreateAndSubmitAllResult.class);
    }

    /**
     *  (asynchronously)
     * createAndSubmitAll
     * @param varForms AdaptCreateAndSubmitAllForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAndSubmitAllAsync(AdaptCreateAndSubmitAllForms varForms, final ApiCallback<AdaptCreateAndSubmitAllResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = createAndSubmitAllValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AdaptCreateAndSubmitAllResult.class, callback);
        return call;
    }
    /**
     * Build call for queryRequestById
     * @param varForms AdaptQueryRequestByIdForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryRequestByIdCall(AdaptQueryRequestByIdForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/adapt/queryRequestById";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("id", varForms.getId());

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
    
    private com.squareup.okhttp.Call queryRequestByIdValidateBeforeCall(AdaptQueryRequestByIdForms varForms) throws ApiException {
        // verify the required parameter 'id' is set
        if (varForms.getId() == null) {
            throw new ApiException("Missing the required parameter 'id' when calling queryRequestById(Async)");
        }
        
        com.squareup.okhttp.Call call = queryRequestByIdCall(varForms);
        return call;
    }

    /**
     * 
     * queryRequestById
     * @param varForms AdaptQueryRequestByIdForms
     * @return AdaptQueryRequestByIdResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdaptQueryRequestByIdResult queryRequestById(AdaptQueryRequestByIdForms varForms) throws ApiException {
        ApiResponse<AdaptQueryRequestByIdResult> resp = queryRequestByIdWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * queryRequestById
     * @param varForms AdaptQueryRequestByIdForms
     * @return ApiResponse&lt;AdaptQueryRequestByIdResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdaptQueryRequestByIdResult> queryRequestByIdWithHttpInfo(AdaptQueryRequestByIdForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = queryRequestByIdValidateBeforeCall(varForms);
        return apiClient.execute(call, AdaptQueryRequestByIdResult.class);
    }

    /**
     *  (asynchronously)
     * queryRequestById
     * @param varForms AdaptQueryRequestByIdForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryRequestByIdAsync(AdaptQueryRequestByIdForms varForms, final ApiCallback<AdaptQueryRequestByIdResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = queryRequestByIdValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AdaptQueryRequestByIdResult.class, callback);
        return call;
    }
}
