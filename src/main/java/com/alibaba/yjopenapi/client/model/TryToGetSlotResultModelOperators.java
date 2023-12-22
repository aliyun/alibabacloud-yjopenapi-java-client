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
 * TryToGetSlotResultModelOperators
 */
public class TryToGetSlotResultModelOperators implements Serializable {
  private static final long serialVersionUID = 1L;

  private String operatorEnName = null;


  private String operatorIp = null;


  private String operatorCnName = null;


  public TryToGetSlotResultModelOperators operatorEnName(String operatorEnName) {
    this.operatorEnName = operatorEnName;
    return this;
  }

   /**
   * 运营商英文名称
   * @return operatorEnName
  **/
  public String getOperatorEnName() {
    return operatorEnName;
  }

  public void setOperatorEnName(String operatorEnName) {
    this.operatorEnName = operatorEnName;
  }

  public TryToGetSlotResultModelOperators operatorIp(String operatorIp) {
    this.operatorIp = operatorIp;
    return this;
  }

   /**
   * 运营商IP
   * @return operatorIp
  **/
  public String getOperatorIp() {
    return operatorIp;
  }

  public void setOperatorIp(String operatorIp) {
    this.operatorIp = operatorIp;
  }

  public TryToGetSlotResultModelOperators operatorCnName(String operatorCnName) {
    this.operatorCnName = operatorCnName;
    return this;
  }

   /**
   * 运营商中文名称
   * @return operatorCnName
  **/
  public String getOperatorCnName() {
    return operatorCnName;
  }

  public void setOperatorCnName(String operatorCnName) {
    this.operatorCnName = operatorCnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotResultModelOperators tryToGetSlotResultModelOperators = (TryToGetSlotResultModelOperators) o;
    return Objects.equals(this.operatorEnName, tryToGetSlotResultModelOperators.operatorEnName) &&
        Objects.equals(this.operatorIp, tryToGetSlotResultModelOperators.operatorIp) &&
        Objects.equals(this.operatorCnName, tryToGetSlotResultModelOperators.operatorCnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorEnName, operatorIp, operatorCnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotResultModelOperators {");
    
    sb.append(",operatorEnName: ").append(toIndentedString(operatorEnName));
    sb.append(",operatorIp: ").append(toIndentedString(operatorIp));
    sb.append(",operatorCnName: ").append(toIndentedString(operatorCnName));
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
