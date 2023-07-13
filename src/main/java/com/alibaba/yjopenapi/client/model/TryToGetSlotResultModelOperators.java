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

  private String operatorIp = null;


  private String operatorEnname = null;


  private String operatorCnName = null;


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

  public TryToGetSlotResultModelOperators operatorEnname(String operatorEnname) {
    this.operatorEnname = operatorEnname;
    return this;
  }

   /**
   * 运营商英文名称
   * @return operatorEnname
  **/
  public String getOperatorEnname() {
    return operatorEnname;
  }

  public void setOperatorEnname(String operatorEnname) {
    this.operatorEnname = operatorEnname;
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
    return Objects.equals(this.operatorIp, tryToGetSlotResultModelOperators.operatorIp) &&
        Objects.equals(this.operatorEnname, tryToGetSlotResultModelOperators.operatorEnname) &&
        Objects.equals(this.operatorCnName, tryToGetSlotResultModelOperators.operatorCnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorIp, operatorEnname, operatorCnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotResultModelOperators {");
    
    sb.append(",operatorIp: ").append(toIndentedString(operatorIp));
    sb.append(",operatorEnname: ").append(toIndentedString(operatorEnname));
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
