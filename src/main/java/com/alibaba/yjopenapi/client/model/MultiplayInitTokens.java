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
 * MultiplayInitTokens
 */
public class MultiplayInitTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private Integer controlId = null;


  public MultiplayInitTokens accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 用户Id
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public MultiplayInitTokens controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * 控制位Id
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
    MultiplayInitTokens multiplayInitTokens = (MultiplayInitTokens) o;
    return Objects.equals(this.accountId, multiplayInitTokens.accountId) &&
        Objects.equals(this.controlId, multiplayInitTokens.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitTokens {");
    
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
