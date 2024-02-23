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
 * MultiplayCloseForms
 */
public class MultiplayCloseForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private String reason = null;


  public MultiplayCloseForms mpId(String mpId) {
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

  public MultiplayCloseForms reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayCloseForms multiplayCloseForms = (MultiplayCloseForms) o;
    return Objects.equals(this.mpId, multiplayCloseForms.mpId) &&
        Objects.equals(this.reason, multiplayCloseForms.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayCloseForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",reason: ").append(toIndentedString(reason));
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
