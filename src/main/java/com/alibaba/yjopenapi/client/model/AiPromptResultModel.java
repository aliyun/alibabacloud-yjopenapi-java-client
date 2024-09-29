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


  private String response = null;


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

  public AiPromptResultModel response(String response) {
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
        Objects.equals(this.response, aiPromptResultModel.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptResultModel {");
    
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",response: ").append(toIndentedString(response));
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
