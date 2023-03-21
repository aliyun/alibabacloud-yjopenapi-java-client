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
 * InteractiveJoinPartyForms
 */
public class InteractiveJoinPartyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String userId = null;


  private Integer seatId = null;


  private Integer controlId = null;


  private Integer reConnect = null;


  public InteractiveJoinPartyForms partyId(String partyId) {
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

  public InteractiveJoinPartyForms userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InteractiveJoinPartyForms seatId(Integer seatId) {
    this.seatId = seatId;
    return this;
  }

   /**
   * 派对坐次
   * @return seatId
  **/
  public Integer getSeatId() {
    return seatId;
  }

  public void setSeatId(Integer seatId) {
    this.seatId = seatId;
  }

  public InteractiveJoinPartyForms controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * 项目
   * @return controlId
  **/
  public Integer getControlId() {
    return controlId;
  }

  public void setControlId(Integer controlId) {
    this.controlId = controlId;
  }

  public InteractiveJoinPartyForms reConnect(Integer reConnect) {
    this.reConnect = reConnect;
    return this;
  }

   /**
   * Get reConnect
   * @return reConnect
  **/
  public Integer getReConnect() {
    return reConnect;
  }

  public void setReConnect(Integer reConnect) {
    this.reConnect = reConnect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveJoinPartyForms interactiveJoinPartyForms = (InteractiveJoinPartyForms) o;
    return Objects.equals(this.partyId, interactiveJoinPartyForms.partyId) &&
        Objects.equals(this.userId, interactiveJoinPartyForms.userId) &&
        Objects.equals(this.seatId, interactiveJoinPartyForms.seatId) &&
        Objects.equals(this.controlId, interactiveJoinPartyForms.controlId) &&
        Objects.equals(this.reConnect, interactiveJoinPartyForms.reConnect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, userId, seatId, controlId, reConnect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveJoinPartyForms {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",userId: ").append(toIndentedString(userId));
    sb.append(",seatId: ").append(toIndentedString(seatId));
    sb.append(",controlId: ").append(toIndentedString(controlId));
    sb.append(",reConnect: ").append(toIndentedString(reConnect));
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
