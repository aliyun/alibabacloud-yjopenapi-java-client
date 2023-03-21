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
 * 扩展信息
 */
public class InteractiveJoinPartyResultExtInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer returnDataType = null;


  public InteractiveJoinPartyResultExtInfo returnDataType(Integer returnDataType) {
    this.returnDataType = returnDataType;
    return this;
  }

   /**
   * Get returnDataType
   * @return returnDataType
  **/
  public Integer getReturnDataType() {
    return returnDataType;
  }

  public void setReturnDataType(Integer returnDataType) {
    this.returnDataType = returnDataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveJoinPartyResultExtInfo interactiveJoinPartyResultExtInfo = (InteractiveJoinPartyResultExtInfo) o;
    return Objects.equals(this.returnDataType, interactiveJoinPartyResultExtInfo.returnDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnDataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveJoinPartyResultExtInfo {");
    
    sb.append(",returnDataType: ").append(toIndentedString(returnDataType));
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
