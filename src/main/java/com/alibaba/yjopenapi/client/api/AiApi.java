/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.AiBatchUpdateKbVersionResult;
import com.alibaba.yjopenapi.client.model.AiCancelQueueResult;
import com.alibaba.yjopenapi.client.model.AiCreateNpcRoleFormsKnowledgeBases;
import com.alibaba.yjopenapi.client.model.AiCreateNpcRoleResult;
import com.alibaba.yjopenapi.client.model.AiDeleteModelsResult;
import com.alibaba.yjopenapi.client.model.AiGetPromptResult;
import com.alibaba.yjopenapi.client.model.AiGetQueueResult;
import com.alibaba.yjopenapi.client.model.AiListModelsResult;
import com.alibaba.yjopenapi.client.model.AiPromptFormsResources;
import com.alibaba.yjopenapi.client.model.AiPromptResult;
import com.alibaba.yjopenapi.client.model.AiUpdateModelsResult;
import com.alibaba.yjopenapi.client.model.AiUpdateNpcRoleFormsKnowledgeBases;
import com.alibaba.yjopenapi.client.model.AiUpdateNpcRoleResult;
import com.alibaba.yjopenapi.client.model.AiUploadModelsResult;

import com.alibaba.yjopenapi.client.model.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AiApi {
    private ApiClient apiClient;
    private Configuration configuration;

    public AiApi() {
        this(new ApiClient(), Configuration.getDefaultConfiguration());
    }

    public AiApi(ApiClient apiClient, Configuration configuration) {
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
     * Build call for batchUpdateKbVersion
     * @param varForms AiBatchUpdateKbVersionForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call batchUpdateKbVersionCall(AiBatchUpdateKbVersionForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/batchUpdateKbVersion";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("roleIds", varForms.getRoleIds());
        localVarFormParams.put("kbId", varForms.getKbId());
        localVarFormParams.put("kbVersionId", varForms.getKbVersionId());
        localVarFormParams.put("operator", varForms.getOperator());

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
    
    private com.squareup.okhttp.Call batchUpdateKbVersionValidateBeforeCall(AiBatchUpdateKbVersionForms varForms) throws ApiException {
        // verify the required parameter 'roleIds' is set
        if (varForms.getRoleIds() == null) {
            throw new ApiException("Missing the required parameter 'roleIds' when calling batchUpdateKbVersion(Async)");
        }
        // verify the required parameter 'kbId' is set
        if (varForms.getKbId() == null) {
            throw new ApiException("Missing the required parameter 'kbId' when calling batchUpdateKbVersion(Async)");
        }
        // verify the required parameter 'kbVersionId' is set
        if (varForms.getKbVersionId() == null) {
            throw new ApiException("Missing the required parameter 'kbVersionId' when calling batchUpdateKbVersion(Async)");
        }
        // verify the required parameter 'operator' is set
        if (varForms.getOperator() == null) {
            throw new ApiException("Missing the required parameter 'operator' when calling batchUpdateKbVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = batchUpdateKbVersionCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms AiBatchUpdateKbVersionForms
     * @return AiBatchUpdateKbVersionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiBatchUpdateKbVersionResult batchUpdateKbVersion(AiBatchUpdateKbVersionForms varForms) throws ApiException {
        ApiResponse<AiBatchUpdateKbVersionResult> resp = batchUpdateKbVersionWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms AiBatchUpdateKbVersionForms
     * @return ApiResponse&lt;AiBatchUpdateKbVersionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiBatchUpdateKbVersionResult> batchUpdateKbVersionWithHttpInfo(AiBatchUpdateKbVersionForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = batchUpdateKbVersionValidateBeforeCall(varForms);
        return apiClient.execute(call, AiBatchUpdateKbVersionResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms AiBatchUpdateKbVersionForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchUpdateKbVersionAsync(AiBatchUpdateKbVersionForms varForms, final ApiCallback<AiBatchUpdateKbVersionResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = batchUpdateKbVersionValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiBatchUpdateKbVersionResult.class, callback);
        return call;
    }
    /**
     * Build call for cancelQueue
     * @param varForms AiCancelQueueForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelQueueCall(AiCancelQueueForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/cancelQueue";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("requestId", varForms.getRequestId());

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
    
    private com.squareup.okhttp.Call cancelQueueValidateBeforeCall(AiCancelQueueForms varForms) throws ApiException {
        // verify the required parameter 'requestId' is set
        if (varForms.getRequestId() == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling cancelQueue(Async)");
        }
        
        com.squareup.okhttp.Call call = cancelQueueCall(varForms);
        return call;
    }

    /**
     * 
     * 取消排队
     * @param varForms AiCancelQueueForms
     * @return AiCancelQueueResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiCancelQueueResult cancelQueue(AiCancelQueueForms varForms) throws ApiException {
        ApiResponse<AiCancelQueueResult> resp = cancelQueueWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 取消排队
     * @param varForms AiCancelQueueForms
     * @return ApiResponse&lt;AiCancelQueueResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiCancelQueueResult> cancelQueueWithHttpInfo(AiCancelQueueForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = cancelQueueValidateBeforeCall(varForms);
        return apiClient.execute(call, AiCancelQueueResult.class);
    }

    /**
     *  (asynchronously)
     * 取消排队
     * @param varForms AiCancelQueueForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelQueueAsync(AiCancelQueueForms varForms, final ApiCallback<AiCancelQueueResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = cancelQueueValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiCancelQueueResult.class, callback);
        return call;
    }
    /**
     * Build call for createNpcRole
     * @param varForms AiCreateNpcRoleForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNpcRoleCall(AiCreateNpcRoleForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/createNpcRole";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("name", varForms.getName());
        localVarFormParams.put("description", varForms.getDescription());
        localVarFormParams.put("figureId", varForms.getFigureId());
        localVarFormParams.put("voiceId", varForms.getVoiceId());
        localVarFormParams.put("characters", varForms.getCharacters());
        localVarFormParams.put("greetings", varForms.getGreetings());
        localVarFormParams.put("guidance", varForms.getGuidance());
        if (varForms.getKnowledgeBases() != null) {
            localVarFormParams.put("knowledgeBases", varForms.getKnowledgeBases());
        }
        if (varForms.getPluginIds() != null) {
            localVarFormParams.put("pluginIds", varForms.getPluginIds());
        }
        localVarFormParams.put("shortMemoryRound", varForms.getShortMemoryRound());
        localVarFormParams.put("tenantId", varForms.getTenantId());
        localVarFormParams.put("operator", varForms.getOperator());
        localVarFormParams.put("llmModelId", varForms.getLlmModelId());

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
    
    private com.squareup.okhttp.Call createNpcRoleValidateBeforeCall(AiCreateNpcRoleForms varForms) throws ApiException {
        // verify the required parameter 'name' is set
        if (varForms.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'description' is set
        if (varForms.getDescription() == null) {
            throw new ApiException("Missing the required parameter 'description' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'figureId' is set
        if (varForms.getFigureId() == null) {
            throw new ApiException("Missing the required parameter 'figureId' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'voiceId' is set
        if (varForms.getVoiceId() == null) {
            throw new ApiException("Missing the required parameter 'voiceId' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'characters' is set
        if (varForms.getCharacters() == null) {
            throw new ApiException("Missing the required parameter 'characters' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'greetings' is set
        if (varForms.getGreetings() == null) {
            throw new ApiException("Missing the required parameter 'greetings' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'guidance' is set
        if (varForms.getGuidance() == null) {
            throw new ApiException("Missing the required parameter 'guidance' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'shortMemoryRound' is set
        if (varForms.getShortMemoryRound() == null) {
            throw new ApiException("Missing the required parameter 'shortMemoryRound' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'tenantId' is set
        if (varForms.getTenantId() == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'operator' is set
        if (varForms.getOperator() == null) {
            throw new ApiException("Missing the required parameter 'operator' when calling createNpcRole(Async)");
        }
        // verify the required parameter 'llmModelId' is set
        if (varForms.getLlmModelId() == null) {
            throw new ApiException("Missing the required parameter 'llmModelId' when calling createNpcRole(Async)");
        }
        
        com.squareup.okhttp.Call call = createNpcRoleCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms AiCreateNpcRoleForms
     * @return AiCreateNpcRoleResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiCreateNpcRoleResult createNpcRole(AiCreateNpcRoleForms varForms) throws ApiException {
        ApiResponse<AiCreateNpcRoleResult> resp = createNpcRoleWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms AiCreateNpcRoleForms
     * @return ApiResponse&lt;AiCreateNpcRoleResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiCreateNpcRoleResult> createNpcRoleWithHttpInfo(AiCreateNpcRoleForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = createNpcRoleValidateBeforeCall(varForms);
        return apiClient.execute(call, AiCreateNpcRoleResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms AiCreateNpcRoleForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNpcRoleAsync(AiCreateNpcRoleForms varForms, final ApiCallback<AiCreateNpcRoleResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = createNpcRoleValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiCreateNpcRoleResult.class, callback);
        return call;
    }
    /**
     * Build call for deleteModels
     * @param varForms AiDeleteModelsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteModelsCall(AiDeleteModelsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/deleteModels";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("resourceId", varForms.getResourceId());

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
    
    private com.squareup.okhttp.Call deleteModelsValidateBeforeCall(AiDeleteModelsForms varForms) throws ApiException {
        // verify the required parameter 'resourceId' is set
        if (varForms.getResourceId() == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling deleteModels(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteModelsCall(varForms);
        return call;
    }

    /**
     * 
     *  删除私有模型
     * @param varForms AiDeleteModelsForms
     * @return AiDeleteModelsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiDeleteModelsResult deleteModels(AiDeleteModelsForms varForms) throws ApiException {
        ApiResponse<AiDeleteModelsResult> resp = deleteModelsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     *  删除私有模型
     * @param varForms AiDeleteModelsForms
     * @return ApiResponse&lt;AiDeleteModelsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiDeleteModelsResult> deleteModelsWithHttpInfo(AiDeleteModelsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = deleteModelsValidateBeforeCall(varForms);
        return apiClient.execute(call, AiDeleteModelsResult.class);
    }

    /**
     *  (asynchronously)
     *  删除私有模型
     * @param varForms AiDeleteModelsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteModelsAsync(AiDeleteModelsForms varForms, final ApiCallback<AiDeleteModelsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = deleteModelsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiDeleteModelsResult.class, callback);
        return call;
    }
    /**
     * Build call for getPrompt
     * @param varForms AiGetPromptForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPromptCall(AiGetPromptForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/getPrompt";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("requestId", varForms.getRequestId());

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
    
    private com.squareup.okhttp.Call getPromptValidateBeforeCall(AiGetPromptForms varForms) throws ApiException {
        // verify the required parameter 'requestId' is set
        if (varForms.getRequestId() == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling getPrompt(Async)");
        }
        
        com.squareup.okhttp.Call call = getPromptCall(varForms);
        return call;
    }

    /**
     * 
     *  查询推理结果
     * @param varForms AiGetPromptForms
     * @return AiGetPromptResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiGetPromptResult getPrompt(AiGetPromptForms varForms) throws ApiException {
        ApiResponse<AiGetPromptResult> resp = getPromptWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     *  查询推理结果
     * @param varForms AiGetPromptForms
     * @return ApiResponse&lt;AiGetPromptResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiGetPromptResult> getPromptWithHttpInfo(AiGetPromptForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getPromptValidateBeforeCall(varForms);
        return apiClient.execute(call, AiGetPromptResult.class);
    }

    /**
     *  (asynchronously)
     *  查询推理结果
     * @param varForms AiGetPromptForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPromptAsync(AiGetPromptForms varForms, final ApiCallback<AiGetPromptResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getPromptValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiGetPromptResult.class, callback);
        return call;
    }
    /**
     * Build call for getQueue
     * @param varForms AiGetQueueForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getQueueCall(AiGetQueueForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/getQueue";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("requestId", varForms.getRequestId());

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
    
    private com.squareup.okhttp.Call getQueueValidateBeforeCall(AiGetQueueForms varForms) throws ApiException {
        // verify the required parameter 'requestId' is set
        if (varForms.getRequestId() == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling getQueue(Async)");
        }
        
        com.squareup.okhttp.Call call = getQueueCall(varForms);
        return call;
    }

    /**
     * 
     *  查询排队
     * @param varForms AiGetQueueForms
     * @return AiGetQueueResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiGetQueueResult getQueue(AiGetQueueForms varForms) throws ApiException {
        ApiResponse<AiGetQueueResult> resp = getQueueWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     *  查询排队
     * @param varForms AiGetQueueForms
     * @return ApiResponse&lt;AiGetQueueResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiGetQueueResult> getQueueWithHttpInfo(AiGetQueueForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = getQueueValidateBeforeCall(varForms);
        return apiClient.execute(call, AiGetQueueResult.class);
    }

    /**
     *  (asynchronously)
     *  查询排队
     * @param varForms AiGetQueueForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getQueueAsync(AiGetQueueForms varForms, final ApiCallback<AiGetQueueResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = getQueueValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiGetQueueResult.class, callback);
        return call;
    }
    /**
     * Build call for listModels
     * @param varForms AiListModelsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listModelsCall(AiListModelsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/listModels";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (varForms.getModelType() != null) {
            localVarFormParams.put("modelType", varForms.getModelType());
        }
        if (varForms.getModelFileType() != null) {
            localVarFormParams.put("modelFileType", varForms.getModelFileType());
        }
        if (varForms.getModelSeries() != null) {
            localVarFormParams.put("modelSeries", varForms.getModelSeries());
        }
        if (varForms.getModelFileName() != null) {
            localVarFormParams.put("modelFileName", varForms.getModelFileName());
        }
        localVarFormParams.put("pageNumber", varForms.getPageNumber());
        localVarFormParams.put("pageSize", varForms.getPageSize());

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
    
    private com.squareup.okhttp.Call listModelsValidateBeforeCall(AiListModelsForms varForms) throws ApiException {
        // verify the required parameter 'pageNumber' is set
        if (varForms.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling listModels(Async)");
        }
        // verify the required parameter 'pageSize' is set
        if (varForms.getPageSize() == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling listModels(Async)");
        }
        
        com.squareup.okhttp.Call call = listModelsCall(varForms);
        return call;
    }

    /**
     * 
     *  查看私有模型列表
     * @param varForms AiListModelsForms
     * @return AiListModelsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiListModelsResult listModels(AiListModelsForms varForms) throws ApiException {
        ApiResponse<AiListModelsResult> resp = listModelsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     *  查看私有模型列表
     * @param varForms AiListModelsForms
     * @return ApiResponse&lt;AiListModelsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiListModelsResult> listModelsWithHttpInfo(AiListModelsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = listModelsValidateBeforeCall(varForms);
        return apiClient.execute(call, AiListModelsResult.class);
    }

    /**
     *  (asynchronously)
     *  查看私有模型列表
     * @param varForms AiListModelsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listModelsAsync(AiListModelsForms varForms, final ApiCallback<AiListModelsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = listModelsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiListModelsResult.class, callback);
        return call;
    }
    /**
     * Build call for prompt
     * @param varForms AiPromptForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call promptCall(AiPromptForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/prompt";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("sceneType", varForms.getSceneType());
        localVarFormParams.put("promptParam", varForms.getPromptParam());
        if (varForms.getResources() != null) {
            localVarFormParams.put("resources", varForms.getResources());
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
    
    private com.squareup.okhttp.Call promptValidateBeforeCall(AiPromptForms varForms) throws ApiException {
        // verify the required parameter 'sceneType' is set
        if (varForms.getSceneType() == null) {
            throw new ApiException("Missing the required parameter 'sceneType' when calling prompt(Async)");
        }
        // verify the required parameter 'promptParam' is set
        if (varForms.getPromptParam() == null) {
            throw new ApiException("Missing the required parameter 'promptParam' when calling prompt(Async)");
        }
        
        com.squareup.okhttp.Call call = promptCall(varForms);
        return call;
    }

    /**
     * 
     *  场景化推理
     * @param varForms AiPromptForms
     * @return AiPromptResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiPromptResult prompt(AiPromptForms varForms) throws ApiException {
        ApiResponse<AiPromptResult> resp = promptWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     *  场景化推理
     * @param varForms AiPromptForms
     * @return ApiResponse&lt;AiPromptResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiPromptResult> promptWithHttpInfo(AiPromptForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = promptValidateBeforeCall(varForms);
        return apiClient.execute(call, AiPromptResult.class);
    }

    /**
     *  (asynchronously)
     *  场景化推理
     * @param varForms AiPromptForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call promptAsync(AiPromptForms varForms, final ApiCallback<AiPromptResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = promptValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiPromptResult.class, callback);
        return call;
    }
    /**
     * Build call for updateModels
     * @param varForms AiUpdateModelsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateModelsCall(AiUpdateModelsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/updateModels";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("resourceId", varForms.getResourceId());
        localVarFormParams.put("desc", varForms.getDesc());

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
    
    private com.squareup.okhttp.Call updateModelsValidateBeforeCall(AiUpdateModelsForms varForms) throws ApiException {
        // verify the required parameter 'resourceId' is set
        if (varForms.getResourceId() == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling updateModels(Async)");
        }
        // verify the required parameter 'desc' is set
        if (varForms.getDesc() == null) {
            throw new ApiException("Missing the required parameter 'desc' when calling updateModels(Async)");
        }
        
        com.squareup.okhttp.Call call = updateModelsCall(varForms);
        return call;
    }

    /**
     * 
     * 修改私有模型信息
     * @param varForms AiUpdateModelsForms
     * @return AiUpdateModelsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiUpdateModelsResult updateModels(AiUpdateModelsForms varForms) throws ApiException {
        ApiResponse<AiUpdateModelsResult> resp = updateModelsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 修改私有模型信息
     * @param varForms AiUpdateModelsForms
     * @return ApiResponse&lt;AiUpdateModelsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiUpdateModelsResult> updateModelsWithHttpInfo(AiUpdateModelsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = updateModelsValidateBeforeCall(varForms);
        return apiClient.execute(call, AiUpdateModelsResult.class);
    }

    /**
     *  (asynchronously)
     * 修改私有模型信息
     * @param varForms AiUpdateModelsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateModelsAsync(AiUpdateModelsForms varForms, final ApiCallback<AiUpdateModelsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = updateModelsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiUpdateModelsResult.class, callback);
        return call;
    }
    /**
     * Build call for updateNpcRole
     * @param varForms AiUpdateNpcRoleForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateNpcRoleCall(AiUpdateNpcRoleForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/updateNpcRole";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("id", varForms.getId());
        localVarFormParams.put("name", varForms.getName());
        localVarFormParams.put("description", varForms.getDescription());
        localVarFormParams.put("figureId", varForms.getFigureId());
        localVarFormParams.put("voiceId", varForms.getVoiceId());
        localVarFormParams.put("characters", varForms.getCharacters());
        localVarFormParams.put("greetings", varForms.getGreetings());
        localVarFormParams.put("guidance", varForms.getGuidance());
        if (varForms.getKnowledgeBases() != null) {
            localVarFormParams.put("knowledgeBases", varForms.getKnowledgeBases());
        }
        if (varForms.getPluginIds() != null) {
            localVarFormParams.put("pluginIds", varForms.getPluginIds());
        }
        localVarFormParams.put("shortMemoryRound", varForms.getShortMemoryRound());
        localVarFormParams.put("operator", varForms.getOperator());
        localVarFormParams.put("llmModelId", varForms.getLlmModelId());

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
    
    private com.squareup.okhttp.Call updateNpcRoleValidateBeforeCall(AiUpdateNpcRoleForms varForms) throws ApiException {
        // verify the required parameter 'id' is set
        if (varForms.getId() == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'name' is set
        if (varForms.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'description' is set
        if (varForms.getDescription() == null) {
            throw new ApiException("Missing the required parameter 'description' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'figureId' is set
        if (varForms.getFigureId() == null) {
            throw new ApiException("Missing the required parameter 'figureId' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'voiceId' is set
        if (varForms.getVoiceId() == null) {
            throw new ApiException("Missing the required parameter 'voiceId' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'characters' is set
        if (varForms.getCharacters() == null) {
            throw new ApiException("Missing the required parameter 'characters' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'greetings' is set
        if (varForms.getGreetings() == null) {
            throw new ApiException("Missing the required parameter 'greetings' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'guidance' is set
        if (varForms.getGuidance() == null) {
            throw new ApiException("Missing the required parameter 'guidance' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'shortMemoryRound' is set
        if (varForms.getShortMemoryRound() == null) {
            throw new ApiException("Missing the required parameter 'shortMemoryRound' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'operator' is set
        if (varForms.getOperator() == null) {
            throw new ApiException("Missing the required parameter 'operator' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'llmModelId' is set
        if (varForms.getLlmModelId() == null) {
            throw new ApiException("Missing the required parameter 'llmModelId' when calling updateNpcRole(Async)");
        }
        
        com.squareup.okhttp.Call call = updateNpcRoleCall(varForms);
        return call;
    }

    /**
     * 
     * 
     * @param varForms AiUpdateNpcRoleForms
     * @return AiUpdateNpcRoleResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiUpdateNpcRoleResult updateNpcRole(AiUpdateNpcRoleForms varForms) throws ApiException {
        ApiResponse<AiUpdateNpcRoleResult> resp = updateNpcRoleWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param varForms AiUpdateNpcRoleForms
     * @return ApiResponse&lt;AiUpdateNpcRoleResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiUpdateNpcRoleResult> updateNpcRoleWithHttpInfo(AiUpdateNpcRoleForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = updateNpcRoleValidateBeforeCall(varForms);
        return apiClient.execute(call, AiUpdateNpcRoleResult.class);
    }

    /**
     *  (asynchronously)
     * 
     * @param varForms AiUpdateNpcRoleForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateNpcRoleAsync(AiUpdateNpcRoleForms varForms, final ApiCallback<AiUpdateNpcRoleResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = updateNpcRoleValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiUpdateNpcRoleResult.class, callback);
        return call;
    }
    /**
     * Build call for uploadModels
     * @param varForms AiUploadModelsForms
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadModelsCall(AiUploadModelsForms varForms) throws ApiException {
        
        // create path and map variables
        String localVarPath = "/ai/uploadModels";

        Map<String, String> localVarQueryParams = new HashMap<String, String>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("modelType", varForms.getModelType());
        localVarFormParams.put("modelFileType", varForms.getModelFileType());
        localVarFormParams.put("modelSeries", varForms.getModelSeries());
        localVarFormParams.put("modelFileName", varForms.getModelFileName());
        localVarFormParams.put("desc", varForms.getDesc());
        localVarFormParams.put("url", varForms.getUrl());

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
    
    private com.squareup.okhttp.Call uploadModelsValidateBeforeCall(AiUploadModelsForms varForms) throws ApiException {
        // verify the required parameter 'modelType' is set
        if (varForms.getModelType() == null) {
            throw new ApiException("Missing the required parameter 'modelType' when calling uploadModels(Async)");
        }
        // verify the required parameter 'modelFileType' is set
        if (varForms.getModelFileType() == null) {
            throw new ApiException("Missing the required parameter 'modelFileType' when calling uploadModels(Async)");
        }
        // verify the required parameter 'modelSeries' is set
        if (varForms.getModelSeries() == null) {
            throw new ApiException("Missing the required parameter 'modelSeries' when calling uploadModels(Async)");
        }
        // verify the required parameter 'modelFileName' is set
        if (varForms.getModelFileName() == null) {
            throw new ApiException("Missing the required parameter 'modelFileName' when calling uploadModels(Async)");
        }
        // verify the required parameter 'desc' is set
        if (varForms.getDesc() == null) {
            throw new ApiException("Missing the required parameter 'desc' when calling uploadModels(Async)");
        }
        // verify the required parameter 'url' is set
        if (varForms.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling uploadModels(Async)");
        }
        
        com.squareup.okhttp.Call call = uploadModelsCall(varForms);
        return call;
    }

    /**
     * 
     * 上传私有模型
     * @param varForms AiUploadModelsForms
     * @return AiUploadModelsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AiUploadModelsResult uploadModels(AiUploadModelsForms varForms) throws ApiException {
        ApiResponse<AiUploadModelsResult> resp = uploadModelsWithHttpInfo(varForms);
        return resp.getData();
    }

    /**
     * 
     * 上传私有模型
     * @param varForms AiUploadModelsForms
     * @return ApiResponse&lt;AiUploadModelsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AiUploadModelsResult> uploadModelsWithHttpInfo(AiUploadModelsForms varForms) throws ApiException {
        com.squareup.okhttp.Call call = uploadModelsValidateBeforeCall(varForms);
        return apiClient.execute(call, AiUploadModelsResult.class);
    }

    /**
     *  (asynchronously)
     * 上传私有模型
     * @param varForms AiUploadModelsForms
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadModelsAsync(AiUploadModelsForms varForms, final ApiCallback<AiUploadModelsResult> callback) throws ApiException {

        com.squareup.okhttp.Call call = uploadModelsValidateBeforeCall(varForms);
        apiClient.executeAsync(call, AiUploadModelsResult.class, callback);
        return call;
    }
}
