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
 * AiDeleteModelsResultModel
 */
public class AiDeleteModelsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String requestId = null;


  private Boolean success = null;


  public AiDeleteModelsResultModel requestId(String requestId) {
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

  public AiDeleteModelsResultModel success(Boolean success) {
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
    AiDeleteModelsResultModel aiDeleteModelsResultModel = (AiDeleteModelsResultModel) o;
    return Objects.equals(this.requestId, aiDeleteModelsResultModel.requestId) &&
        Objects.equals(this.success, aiDeleteModelsResultModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDeleteModelsResultModel {");
    
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
