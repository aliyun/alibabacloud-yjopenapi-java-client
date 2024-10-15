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
 * AiUploadModelsResultModel
 */
public class AiUploadModelsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String resourceId = null;


  private String requestId = null;


  private Boolean success = null;


  public AiUploadModelsResultModel resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AiUploadModelsResultModel requestId(String requestId) {
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

  public AiUploadModelsResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiUploadModelsResultModel aiUploadModelsResultModel = (AiUploadModelsResultModel) o;
    return Objects.equals(this.resourceId, aiUploadModelsResultModel.resourceId) &&
        Objects.equals(this.requestId, aiUploadModelsResultModel.requestId) &&
        Objects.equals(this.success, aiUploadModelsResultModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, requestId, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUploadModelsResultModel {");
    
    sb.append(",resourceId: ").append(toIndentedString(resourceId));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",success: ").append(toIndentedString(success));
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
