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
 * AiGetPromptForms
 */
public class AiGetPromptForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String requestId = null;


  public AiGetPromptForms requestId(String requestId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGetPromptForms aiGetPromptForms = (AiGetPromptForms) o;
    return Objects.equals(this.requestId, aiGetPromptForms.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGetPromptForms {");
    
    sb.append(",requestId: ").append(toIndentedString(requestId));
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