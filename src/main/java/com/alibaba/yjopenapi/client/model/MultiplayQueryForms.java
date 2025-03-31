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
 * MultiplayQueryForms
 */
public class MultiplayQueryForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  public MultiplayQueryForms mpId(String mpId) {
    this.mpId = mpId;
    return this;
  }

   /**
   * Get mpId
   * @return mpId
  **/
  public String getMpId() {
    return mpId;
  }

  public void setMpId(String mpId) {
    this.mpId = mpId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayQueryForms multiplayQueryForms = (MultiplayQueryForms) o;
    return Objects.equals(this.mpId, multiplayQueryForms.mpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayQueryForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
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
