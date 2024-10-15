/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
/**
 * AiPromptResultModel
 */
public class AiPromptResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String requestId = null;


  private String taskId = null;


  private String status = null;


  public AiPromptResultModel requestId(String requestId) {
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

  public AiPromptResultModel taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public AiPromptResultModel status(String status) {
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
    AiPromptResultModel aiPromptResultModel = (AiPromptResultModel) o;
    return Objects.equals(this.requestId, aiPromptResultModel.requestId) &&
        Objects.equals(this.taskId, aiPromptResultModel.taskId) &&
        Objects.equals(this.status, aiPromptResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, taskId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptResultModel {");
    
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",taskId: ").append(toIndentedString(taskId));
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
