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
 * 获取结果
 */
public class InteractiveGetPartyResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String extInfo = null;


  public InteractiveGetPartyResultModel partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * 派对Id
   * @return partyId
  **/
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public InteractiveGetPartyResultModel extInfo(String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveGetPartyResultModel interactiveGetPartyResultModel = (InteractiveGetPartyResultModel) o;
    return Objects.equals(this.partyId, interactiveGetPartyResultModel.partyId) &&
        Objects.equals(this.extInfo, interactiveGetPartyResultModel.extInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, extInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyResultModel {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",extInfo: ").append(toIndentedString(extInfo));
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
