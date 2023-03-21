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
 * InteractiveGetPartyFormsConfig
 */
public class InteractiveGetPartyFormsConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer ownerDisconnectKeepAliveTime = null;


  private Integer joinerDisconnectKeepAliveTime = null;


  private Integer noActionKeepAliveTime = null;


  public InteractiveGetPartyFormsConfig ownerDisconnectKeepAliveTime(Integer ownerDisconnectKeepAliveTime) {
    this.ownerDisconnectKeepAliveTime = ownerDisconnectKeepAliveTime;
    return this;
  }

   /**
   * 派对创建者断线保活时间
   * @return ownerDisconnectKeepAliveTime
  **/
  public Integer getOwnerDisconnectKeepAliveTime() {
    return ownerDisconnectKeepAliveTime;
  }

  public void setOwnerDisconnectKeepAliveTime(Integer ownerDisconnectKeepAliveTime) {
    this.ownerDisconnectKeepAliveTime = ownerDisconnectKeepAliveTime;
  }

  public InteractiveGetPartyFormsConfig joinerDisconnectKeepAliveTime(Integer joinerDisconnectKeepAliveTime) {
    this.joinerDisconnectKeepAliveTime = joinerDisconnectKeepAliveTime;
    return this;
  }

   /**
   * 加入派对玩家断线保活时间
   * @return joinerDisconnectKeepAliveTime
  **/
  public Integer getJoinerDisconnectKeepAliveTime() {
    return joinerDisconnectKeepAliveTime;
  }

  public void setJoinerDisconnectKeepAliveTime(Integer joinerDisconnectKeepAliveTime) {
    this.joinerDisconnectKeepAliveTime = joinerDisconnectKeepAliveTime;
  }

  public InteractiveGetPartyFormsConfig noActionKeepAliveTime(Integer noActionKeepAliveTime) {
    this.noActionKeepAliveTime = noActionKeepAliveTime;
    return this;
  }

   /**
   * 无操作保活时间
   * @return noActionKeepAliveTime
  **/
  public Integer getNoActionKeepAliveTime() {
    return noActionKeepAliveTime;
  }

  public void setNoActionKeepAliveTime(Integer noActionKeepAliveTime) {
    this.noActionKeepAliveTime = noActionKeepAliveTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveGetPartyFormsConfig interactiveGetPartyFormsConfig = (InteractiveGetPartyFormsConfig) o;
    return Objects.equals(this.ownerDisconnectKeepAliveTime, interactiveGetPartyFormsConfig.ownerDisconnectKeepAliveTime) &&
        Objects.equals(this.joinerDisconnectKeepAliveTime, interactiveGetPartyFormsConfig.joinerDisconnectKeepAliveTime) &&
        Objects.equals(this.noActionKeepAliveTime, interactiveGetPartyFormsConfig.noActionKeepAliveTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerDisconnectKeepAliveTime, joinerDisconnectKeepAliveTime, noActionKeepAliveTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyFormsConfig {");
    
    sb.append(",ownerDisconnectKeepAliveTime: ").append(toIndentedString(ownerDisconnectKeepAliveTime));
    sb.append(",joinerDisconnectKeepAliveTime: ").append(toIndentedString(joinerDisconnectKeepAliveTime));
    sb.append(",noActionKeepAliveTime: ").append(toIndentedString(noActionKeepAliveTime));
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
