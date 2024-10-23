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
 * AiGetQueueResultModel
 */
public class AiGetQueueResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String queueNum = null;


  private String requestId = null;


  private String status = null;


  public AiGetQueueResultModel queueNum(String queueNum) {
    this.queueNum = queueNum;
    return this;
  }

   /**
   * Get queueNum
   * @return queueNum
  **/
  public String getQueueNum() {
    return queueNum;
  }

  public void setQueueNum(String queueNum) {
    this.queueNum = queueNum;
  }

  public AiGetQueueResultModel requestId(String requestId) {
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

  public AiGetQueueResultModel status(String status) {
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
    AiGetQueueResultModel aiGetQueueResultModel = (AiGetQueueResultModel) o;
    return Objects.equals(this.queueNum, aiGetQueueResultModel.queueNum) &&
        Objects.equals(this.requestId, aiGetQueueResultModel.requestId) &&
        Objects.equals(this.status, aiGetQueueResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueNum, requestId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGetQueueResultModel {");
    
    sb.append(",queueNum: ").append(toIndentedString(queueNum));
    sb.append(",requestId: ").append(toIndentedString(requestId));
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
