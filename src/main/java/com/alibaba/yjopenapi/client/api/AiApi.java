/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.io.IOException;

import com.alibaba.yjopenapi.client.model.AiCreateNpcRoleFormsKnowledgeBases;
import com.alibaba.yjopenapi.client.model.AiCreateNpcRoleResult;
import com.alibaba.yjopenapi.client.model.AiUpdateNpcRoleFormsKnowledgeBases;
import com.alibaba.yjopenapi.client.model.AiUpdateNpcRoleResult;

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
        localVarFormParams.put("knowledgeBases", varForms.getKnowledgeBases());
        if (varForms.getPluginIds() != null) {
            localVarFormParams.put("pluginIds", varForms.getPluginIds());
        }
        localVarFormParams.put("shortMemoryRound", varForms.getShortMemoryRound());
        localVarFormParams.put("tenantId", varForms.getTenantId());
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
        // verify the required parameter 'knowledgeBases' is set
        if (varForms.getKnowledgeBases() == null) {
            throw new ApiException("Missing the required parameter 'knowledgeBases' when calling createNpcRole(Async)");
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
        localVarFormParams.put("knowledgeBases", varForms.getKnowledgeBases());
        if (varForms.getPluginIds() != null) {
            localVarFormParams.put("pluginIds", varForms.getPluginIds());
        }
        localVarFormParams.put("shortMemoryRound", varForms.getShortMemoryRound());
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
        // verify the required parameter 'knowledgeBases' is set
        if (varForms.getKnowledgeBases() == null) {
            throw new ApiException("Missing the required parameter 'knowledgeBases' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'shortMemoryRound' is set
        if (varForms.getShortMemoryRound() == null) {
            throw new ApiException("Missing the required parameter 'shortMemoryRound' when calling updateNpcRole(Async)");
        }
        // verify the required parameter 'operator' is set
        if (varForms.getOperator() == null) {
            throw new ApiException("Missing the required parameter 'operator' when calling updateNpcRole(Async)");
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
}
