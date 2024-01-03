/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayLeaveForms
 */
public class MultiplayLeaveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private Boolean kickOut = null;


  private String reason = null;


  private List<String> tokenIds = new ArrayList<String>();


  public MultiplayLeaveForms mpId(String mpId) {
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

  public MultiplayLeaveForms kickOut(Boolean kickOut) {
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

  public MultiplayLeaveForms reason(String reason) {
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

  public MultiplayLeaveForms tokenIds(List<String> tokenIds) {
    this.tokenIds = tokenIds;
    return this;
  }

  public MultiplayLeaveForms addTokenIdsItem(String tokenIdsItem) {
    this.tokenIds.add(tokenIdsItem);
    return this;
  }

   /**
   * Get tokenIds
   * @return tokenIds
  **/
  public List<String> getTokenIds() {
    return tokenIds;
  }

  public void setTokenIds(List<String> tokenIds) {
    this.tokenIds = tokenIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayLeaveForms multiplayLeaveForms = (MultiplayLeaveForms) o;
    return Objects.equals(this.mpId, multiplayLeaveForms.mpId) &&
        Objects.equals(this.kickOut, multiplayLeaveForms.kickOut) &&
        Objects.equals(this.reason, multiplayLeaveForms.reason) &&
        Objects.equals(this.tokenIds, multiplayLeaveForms.tokenIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, kickOut, reason, tokenIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayLeaveForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",kickOut: ").append(toIndentedString(kickOut));
    sb.append(",reason: ").append(toIndentedString(reason));
    sb.append(",tokenIds: ").append(toIndentedString(tokenIds));
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
