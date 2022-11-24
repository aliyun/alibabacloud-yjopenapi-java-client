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
 * MultiplayInitResultModelTokens
 */
public class MultiplayInitResultModelTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String tokenId = null;


  private Integer controlId = null;


  private String accountId = null;


  private String session = null;


  public MultiplayInitResultModelTokens tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * 用户联机标识Id
   * @return tokenId
  **/
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public MultiplayInitResultModelTokens controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * 控制位
   * @return controlId
  **/
  public Integer getControlId() {
    return controlId;
  }

  public void setControlId(Integer controlId) {
    this.controlId = controlId;
  }

  public MultiplayInitResultModelTokens accountId(String accountId) {
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

  public MultiplayInitResultModelTokens session(String session) {
    this.session = session;
    return this;
  }

   /**
   * 当前用户连接session
   * @return session
  **/
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayInitResultModelTokens multiplayInitResultModelTokens = (MultiplayInitResultModelTokens) o;
    return Objects.equals(this.tokenId, multiplayInitResultModelTokens.tokenId) &&
        Objects.equals(this.controlId, multiplayInitResultModelTokens.controlId) &&
        Objects.equals(this.accountId, multiplayInitResultModelTokens.accountId) &&
        Objects.equals(this.session, multiplayInitResultModelTokens.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, controlId, accountId, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitResultModelTokens {");
    
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",controlId: ").append(toIndentedString(controlId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",session: ").append(toIndentedString(session));
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
