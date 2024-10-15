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
 * MultiplayInitFormsTokens
 */
public class MultiplayInitFormsTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private Integer controlId = null;


  public MultiplayInitFormsTokens accountId(String accountId) {
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

  public MultiplayInitFormsTokens controlId(Integer controlId) {
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
    MultiplayInitFormsTokens multiplayInitFormsTokens = (MultiplayInitFormsTokens) o;
    return Objects.equals(this.accountId, multiplayInitFormsTokens.accountId) &&
        Objects.equals(this.controlId, multiplayInitFormsTokens.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitFormsTokens {");
    
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
