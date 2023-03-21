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
 * InteractiveKickOutUserResultModelPlayerList
 */
public class InteractiveKickOutUserResultModelPlayerList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String userId = null;


  private Integer seatId = null;


  private Integer controlId = null;


  public InteractiveKickOutUserResultModelPlayerList userId(String userId) {
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

  public InteractiveKickOutUserResultModelPlayerList seatId(Integer seatId) {
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

  public InteractiveKickOutUserResultModelPlayerList controlId(Integer controlId) {
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
    InteractiveKickOutUserResultModelPlayerList interactiveKickOutUserResultModelPlayerList = (InteractiveKickOutUserResultModelPlayerList) o;
    return Objects.equals(this.userId, interactiveKickOutUserResultModelPlayerList.userId) &&
        Objects.equals(this.seatId, interactiveKickOutUserResultModelPlayerList.seatId) &&
        Objects.equals(this.controlId, interactiveKickOutUserResultModelPlayerList.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, seatId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveKickOutUserResultModelPlayerList {");
    
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
