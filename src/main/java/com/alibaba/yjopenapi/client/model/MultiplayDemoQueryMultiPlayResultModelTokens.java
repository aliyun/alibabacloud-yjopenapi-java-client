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
 * MultiplayDemoQueryMultiPlayResultModelTokens
 */
public class MultiplayDemoQueryMultiPlayResultModelTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String tokenId = null;


  private Long offlineTs = null;


  private String session = null;


  private Boolean admin = null;


  private Integer controlId = null;


  public MultiplayDemoQueryMultiPlayResultModelTokens accountId(String accountId) {
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

  public MultiplayDemoQueryMultiPlayResultModelTokens tokenId(String tokenId) {
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

  public MultiplayDemoQueryMultiPlayResultModelTokens offlineTs(Long offlineTs) {
    this.offlineTs = offlineTs;
    return this;
  }

   /**
   * Get offlineTs
   * @return offlineTs
  **/
  public Long getOfflineTs() {
    return offlineTs;
  }

  public void setOfflineTs(Long offlineTs) {
    this.offlineTs = offlineTs;
  }

  public MultiplayDemoQueryMultiPlayResultModelTokens session(String session) {
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

  public MultiplayDemoQueryMultiPlayResultModelTokens admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public MultiplayDemoQueryMultiPlayResultModelTokens controlId(Integer controlId) {
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
    MultiplayDemoQueryMultiPlayResultModelTokens multiplayDemoQueryMultiPlayResultModelTokens = (MultiplayDemoQueryMultiPlayResultModelTokens) o;
    return Objects.equals(this.accountId, multiplayDemoQueryMultiPlayResultModelTokens.accountId) &&
        Objects.equals(this.tokenId, multiplayDemoQueryMultiPlayResultModelTokens.tokenId) &&
        Objects.equals(this.offlineTs, multiplayDemoQueryMultiPlayResultModelTokens.offlineTs) &&
        Objects.equals(this.session, multiplayDemoQueryMultiPlayResultModelTokens.session) &&
        Objects.equals(this.admin, multiplayDemoQueryMultiPlayResultModelTokens.admin) &&
        Objects.equals(this.controlId, multiplayDemoQueryMultiPlayResultModelTokens.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, tokenId, offlineTs, session, admin, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoQueryMultiPlayResultModelTokens {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",offlineTs: ").append(toIndentedString(offlineTs));
    sb.append(",session: ").append(toIndentedString(session));
    sb.append(",admin: ").append(toIndentedString(admin));
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
