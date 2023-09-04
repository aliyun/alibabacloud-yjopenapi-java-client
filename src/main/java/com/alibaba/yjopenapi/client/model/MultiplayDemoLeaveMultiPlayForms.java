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
 * MultiplayDemoLeaveMultiPlayForms
 */
public class MultiplayDemoLeaveMultiPlayForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private String tokenIds = null;


  private Boolean kickOut = null;


  private String reason = null;


  private String openAk = null;


  private String openSk = null;


  public MultiplayDemoLeaveMultiPlayForms mpId(String mpId) {
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

  public MultiplayDemoLeaveMultiPlayForms tokenIds(String tokenIds) {
    this.tokenIds = tokenIds;
    return this;
  }

   /**
   * Get tokenIds
   * @return tokenIds
  **/
  public String getTokenIds() {
    return tokenIds;
  }

  public void setTokenIds(String tokenIds) {
    this.tokenIds = tokenIds;
  }

  public MultiplayDemoLeaveMultiPlayForms kickOut(Boolean kickOut) {
    this.kickOut = kickOut;
    return this;
  }

   /**
   * Get kickOut
   * @return kickOut
  **/
  public Boolean getKickOut() {
    return kickOut;
  }

  public void setKickOut(Boolean kickOut) {
    this.kickOut = kickOut;
  }

  public MultiplayDemoLeaveMultiPlayForms reason(String reason) {
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

  public MultiplayDemoLeaveMultiPlayForms openAk(String openAk) {
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

  public MultiplayDemoLeaveMultiPlayForms openSk(String openSk) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoLeaveMultiPlayForms multiplayDemoLeaveMultiPlayForms = (MultiplayDemoLeaveMultiPlayForms) o;
    return Objects.equals(this.mpId, multiplayDemoLeaveMultiPlayForms.mpId) &&
        Objects.equals(this.tokenIds, multiplayDemoLeaveMultiPlayForms.tokenIds) &&
        Objects.equals(this.kickOut, multiplayDemoLeaveMultiPlayForms.kickOut) &&
        Objects.equals(this.reason, multiplayDemoLeaveMultiPlayForms.reason) &&
        Objects.equals(this.openAk, multiplayDemoLeaveMultiPlayForms.openAk) &&
        Objects.equals(this.openSk, multiplayDemoLeaveMultiPlayForms.openSk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, tokenIds, kickOut, reason, openAk, openSk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoLeaveMultiPlayForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",tokenIds: ").append(toIndentedString(tokenIds));
    sb.append(",kickOut: ").append(toIndentedString(kickOut));
    sb.append(",reason: ").append(toIndentedString(reason));
    sb.append(",openAk: ").append(toIndentedString(openAk));
    sb.append(",openSk: ").append(toIndentedString(openSk));
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
