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
 * MultiplayQueryResultModelTokens
 */
public class MultiplayQueryResultModelTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String tokenId = null;


  private String session = null;


  private Integer controlId = null;


  public MultiplayQueryResultModelTokens accountId(String accountId) {
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

  public MultiplayQueryResultModelTokens tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public MultiplayQueryResultModelTokens session(String session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }

  public MultiplayQueryResultModelTokens controlId(Integer controlId) {
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
    MultiplayQueryResultModelTokens multiplayQueryResultModelTokens = (MultiplayQueryResultModelTokens) o;
    return Objects.equals(this.accountId, multiplayQueryResultModelTokens.accountId) &&
        Objects.equals(this.tokenId, multiplayQueryResultModelTokens.tokenId) &&
        Objects.equals(this.session, multiplayQueryResultModelTokens.session) &&
        Objects.equals(this.controlId, multiplayQueryResultModelTokens.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, tokenId, session, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayQueryResultModelTokens {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",session: ").append(toIndentedString(session));
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
