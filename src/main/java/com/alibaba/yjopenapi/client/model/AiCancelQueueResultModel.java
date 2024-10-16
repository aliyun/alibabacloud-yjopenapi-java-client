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
 * AiCancelQueueResultModel
 */
public class AiCancelQueueResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msg = null;


  private String requestId = null;


  private Boolean success = null;


  public AiCancelQueueResultModel msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public AiCancelQueueResultModel requestId(String requestId) {
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

  public AiCancelQueueResultModel success(Boolean success) {
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
    AiCancelQueueResultModel aiCancelQueueResultModel = (AiCancelQueueResultModel) o;
    return Objects.equals(this.msg, aiCancelQueueResultModel.msg) &&
        Objects.equals(this.requestId, aiCancelQueueResultModel.requestId) &&
        Objects.equals(this.success, aiCancelQueueResultModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, requestId, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiCancelQueueResultModel {");
    
    sb.append(",msg: ").append(toIndentedString(msg));
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
