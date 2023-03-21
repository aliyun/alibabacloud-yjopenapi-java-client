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
 * InteractiveKickOutUserForms
 */
public class InteractiveKickOutUserForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String userId = null;


  private String kickOutReason = null;


  public InteractiveKickOutUserForms partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * 派对id
   * @return partyId
  **/
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public InteractiveKickOutUserForms userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户Id
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InteractiveKickOutUserForms kickOutReason(String kickOutReason) {
    this.kickOutReason = kickOutReason;
    return this;
  }

   /**
   * 踢出原因
   * @return kickOutReason
  **/
  public String getKickOutReason() {
    return kickOutReason;
  }

  public void setKickOutReason(String kickOutReason) {
    this.kickOutReason = kickOutReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveKickOutUserForms interactiveKickOutUserForms = (InteractiveKickOutUserForms) o;
    return Objects.equals(this.partyId, interactiveKickOutUserForms.partyId) &&
        Objects.equals(this.userId, interactiveKickOutUserForms.userId) &&
        Objects.equals(this.kickOutReason, interactiveKickOutUserForms.kickOutReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, userId, kickOutReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveKickOutUserForms {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",userId: ").append(toIndentedString(userId));
    sb.append(",kickOutReason: ").append(toIndentedString(kickOutReason));
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
