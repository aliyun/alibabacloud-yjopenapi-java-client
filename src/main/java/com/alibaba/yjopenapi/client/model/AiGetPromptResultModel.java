/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiGetPromptResultModelResources;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiGetPromptResultModel
 */
public class AiGetPromptResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String promptResult = null;


  private String requestId = null;


  private String promptResponse = null;


  private List<AiGetPromptResultModelResources> resources = null;


  public AiGetPromptResultModel promptResult(String promptResult) {
    this.promptResult = promptResult;
    return this;
  }

   /**
   * Get promptResult
   * @return promptResult
  **/
  public String getPromptResult() {
    return promptResult;
  }

  public void setPromptResult(String promptResult) {
    this.promptResult = promptResult;
  }

  public AiGetPromptResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public AiGetPromptResultModel promptResponse(String promptResponse) {
    this.promptResponse = promptResponse;
    return this;
  }

   /**
   * Get promptResponse
   * @return promptResponse
  **/
  public String getPromptResponse() {
    return promptResponse;
  }

  public void setPromptResponse(String promptResponse) {
    this.promptResponse = promptResponse;
  }

  public AiGetPromptResultModel resources(List<AiGetPromptResultModelResources> resources) {
    this.resources = resources;
    return this;
  }

  public AiGetPromptResultModel addResourcesItem(AiGetPromptResultModelResources resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<AiGetPromptResultModelResources>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  public List<AiGetPromptResultModelResources> getResources() {
    return resources;
  }

  public void setResources(List<AiGetPromptResultModelResources> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGetPromptResultModel aiGetPromptResultModel = (AiGetPromptResultModel) o;
    return Objects.equals(this.promptResult, aiGetPromptResultModel.promptResult) &&
        Objects.equals(this.requestId, aiGetPromptResultModel.requestId) &&
        Objects.equals(this.promptResponse, aiGetPromptResultModel.promptResponse) &&
        Objects.equals(this.resources, aiGetPromptResultModel.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptResult, requestId, promptResponse, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGetPromptResultModel {");
    
    sb.append(",promptResult: ").append(toIndentedString(promptResult));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",promptResponse: ").append(toIndentedString(promptResponse));
    sb.append(",resources: ").append(toIndentedString(resources));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString();
  }

}
