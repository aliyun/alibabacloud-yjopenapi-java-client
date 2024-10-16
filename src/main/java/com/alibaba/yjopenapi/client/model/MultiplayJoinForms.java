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
 * MultiplayJoinForms
 */
public class MultiplayJoinForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private String accountId = null;


  private Integer controlId = null;


  public MultiplayJoinForms mpId(String mpId) {
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

  public MultiplayJoinForms accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public MultiplayJoinForms controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * Get controlId
   * @return controlId
  **/
  public Integer getControlId() {
    return controlId;
  }

  public void setControlId(Integer controlId) {
    this.controlId = controlId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayJoinForms multiplayJoinForms = (MultiplayJoinForms) o;
    return Objects.equals(this.mpId, multiplayJoinForms.mpId) &&
        Objects.equals(this.accountId, multiplayJoinForms.accountId) &&
        Objects.equals(this.controlId, multiplayJoinForms.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, accountId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayJoinForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",controlId: ").append(toIndentedString(controlId));
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
