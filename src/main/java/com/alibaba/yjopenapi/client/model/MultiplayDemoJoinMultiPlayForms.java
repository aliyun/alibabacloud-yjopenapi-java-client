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
 * MultiplayDemoJoinMultiPlayForms
 */
public class MultiplayDemoJoinMultiPlayForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private Integer controlId = null;


  private String openAk = null;


  private String openSk = null;


  private String accountId = null;


  public MultiplayDemoJoinMultiPlayForms mpId(String mpId) {
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

  public MultiplayDemoJoinMultiPlayForms controlId(Integer controlId) {
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

  public MultiplayDemoJoinMultiPlayForms openAk(String openAk) {
    this.openAk = openAk;
    return this;
  }

   /**
   * Get openAk
   * @return openAk
  **/
  public String getOpenAk() {
    return openAk;
  }

  public void setOpenAk(String openAk) {
    this.openAk = openAk;
  }

  public MultiplayDemoJoinMultiPlayForms openSk(String openSk) {
    this.openSk = openSk;
    return this;
  }

   /**
   * Get openSk
   * @return openSk
  **/
  public String getOpenSk() {
    return openSk;
  }

  public void setOpenSk(String openSk) {
    this.openSk = openSk;
  }

  public MultiplayDemoJoinMultiPlayForms accountId(String accountId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoJoinMultiPlayForms multiplayDemoJoinMultiPlayForms = (MultiplayDemoJoinMultiPlayForms) o;
    return Objects.equals(this.mpId, multiplayDemoJoinMultiPlayForms.mpId) &&
        Objects.equals(this.controlId, multiplayDemoJoinMultiPlayForms.controlId) &&
        Objects.equals(this.openAk, multiplayDemoJoinMultiPlayForms.openAk) &&
        Objects.equals(this.openSk, multiplayDemoJoinMultiPlayForms.openSk) &&
        Objects.equals(this.accountId, multiplayDemoJoinMultiPlayForms.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, controlId, openAk, openSk, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoJoinMultiPlayForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",controlId: ").append(toIndentedString(controlId));
    sb.append(",openAk: ").append(toIndentedString(openAk));
    sb.append(",openSk: ").append(toIndentedString(openSk));
    sb.append(",accountId: ").append(toIndentedString(accountId));
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
