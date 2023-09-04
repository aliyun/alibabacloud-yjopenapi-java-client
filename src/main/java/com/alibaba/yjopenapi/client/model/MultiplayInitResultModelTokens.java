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

  private String accountId = null;


  private String tokenId = null;


  private String session = null;


  private String controlId = null;


  private String name4 = null;


  public MultiplayInitResultModelTokens accountId(String accountId) {
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

  public MultiplayInitResultModelTokens tokenId(String tokenId) {
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

  public MultiplayInitResultModelTokens session(String session) {
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

  public MultiplayInitResultModelTokens controlId(String controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * Get controlId
   * @return controlId
  **/
  public String getControlId() {
    return controlId;
  }

  public void setControlId(String controlId) {
    this.controlId = controlId;
  }

  public MultiplayInitResultModelTokens name4(String name4) {
    this.name4 = name4;
    return this;
  }

   /**
   * Get name4
   * @return name4
  **/
  public String getName4() {
    return name4;
  }

  public void setName4(String name4) {
    this.name4 = name4;
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
    return Objects.equals(this.accountId, multiplayInitResultModelTokens.accountId) &&
        Objects.equals(this.tokenId, multiplayInitResultModelTokens.tokenId) &&
        Objects.equals(this.session, multiplayInitResultModelTokens.session) &&
        Objects.equals(this.controlId, multiplayInitResultModelTokens.controlId) &&
        Objects.equals(this.name4, multiplayInitResultModelTokens.name4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, tokenId, session, controlId, name4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitResultModelTokens {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",session: ").append(toIndentedString(session));
    sb.append(",controlId: ").append(toIndentedString(controlId));
    sb.append(",name4: ").append(toIndentedString(name4));
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
