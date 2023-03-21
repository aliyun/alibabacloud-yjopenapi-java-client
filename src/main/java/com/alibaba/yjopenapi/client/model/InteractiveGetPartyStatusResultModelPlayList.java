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
 * InteractiveGetPartyStatusResultModelPlayList
 */
public class InteractiveGetPartyStatusResultModelPlayList implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer userId = null;


  private Integer seatId = null;


  private Integer controlId = null;


  public InteractiveGetPartyStatusResultModelPlayList userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public InteractiveGetPartyStatusResultModelPlayList seatId(Integer seatId) {
    this.seatId = seatId;
    return this;
  }

   /**
   * 位次ID
   * @return seatId
  **/
  public Integer getSeatId() {
    return seatId;
  }

  public void setSeatId(Integer seatId) {
    this.seatId = seatId;
  }

  public InteractiveGetPartyStatusResultModelPlayList controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * 控制位ID
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
    InteractiveGetPartyStatusResultModelPlayList interactiveGetPartyStatusResultModelPlayList = (InteractiveGetPartyStatusResultModelPlayList) o;
    return Objects.equals(this.userId, interactiveGetPartyStatusResultModelPlayList.userId) &&
        Objects.equals(this.seatId, interactiveGetPartyStatusResultModelPlayList.seatId) &&
        Objects.equals(this.controlId, interactiveGetPartyStatusResultModelPlayList.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, seatId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyStatusResultModelPlayList {");
    
    sb.append(",userId: ").append(toIndentedString(userId));
    sb.append(",seatId: ").append(toIndentedString(seatId));
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
