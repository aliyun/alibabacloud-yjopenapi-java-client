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

  private Long queueNum = null;


  private String response = null;


  private String requestId = null;


  private String executedList = null;


  private String executionResult = null;


  private List<AiGetPromptResultModelResources> resources = null;


  private String status = null;


  public AiGetPromptResultModel queueNum(Long queueNum) {
    this.queueNum = queueNum;
    return this;
  }

   /**
   * Get queueNum
   * @return queueNum
  **/
  public Long getQueueNum() {
    return queueNum;
  }

  public void setQueueNum(Long queueNum) {
    this.queueNum = queueNum;
  }

  public AiGetPromptResultModel response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
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

  public AiGetPromptResultModel executedList(String executedList) {
    this.executedList = executedList;
    return this;
  }

   /**
   * Get executedList
   * @return executedList
  **/
  public String getExecutedList() {
    return executedList;
  }

  public void setExecutedList(String executedList) {
    this.executedList = executedList;
  }

  public AiGetPromptResultModel executionResult(String executionResult) {
    this.executionResult = executionResult;
    return this;
  }

   /**
   * Get executionResult
   * @return executionResult
  **/
  public String getExecutionResult() {
    return executionResult;
  }

  public void setExecutionResult(String executionResult) {
    this.executionResult = executionResult;
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

  public AiGetPromptResultModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    return Objects.equals(this.queueNum, aiGetPromptResultModel.queueNum) &&
        Objects.equals(this.response, aiGetPromptResultModel.response) &&
        Objects.equals(this.requestId, aiGetPromptResultModel.requestId) &&
        Objects.equals(this.executedList, aiGetPromptResultModel.executedList) &&
        Objects.equals(this.executionResult, aiGetPromptResultModel.executionResult) &&
        Objects.equals(this.resources, aiGetPromptResultModel.resources) &&
        Objects.equals(this.status, aiGetPromptResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueNum, response, requestId, executedList, executionResult, resources, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGetPromptResultModel {");
    
    sb.append(",queueNum: ").append(toIndentedString(queueNum));
    sb.append(",response: ").append(toIndentedString(response));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",executedList: ").append(toIndentedString(executedList));
    sb.append(",executionResult: ").append(toIndentedString(executionResult));
    sb.append(",resources: ").append(toIndentedString(resources));
    sb.append(",status: ").append(toIndentedString(status));
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
