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
 * ConsoleAdminCreateOrderFormsAttributeRequestList
 */
public class ConsoleAdminCreateOrderFormsAttributeRequestList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String attributeCode = null;


  private Integer attributeValue = null;


  private Long attributeValueCode = null;


  private String timeUnit = null;


  public ConsoleAdminCreateOrderFormsAttributeRequestList attributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * 属性编码
   * @return attributeCode
  **/
  public String getAttributeCode() {
    return attributeCode;
  }

  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }

  public ConsoleAdminCreateOrderFormsAttributeRequestList attributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * 属性值(区间型专用)
   * @return attributeValue
  **/
  public Integer getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
  }

  public ConsoleAdminCreateOrderFormsAttributeRequestList attributeValueCode(Long attributeValueCode) {
    this.attributeValueCode = attributeValueCode;
    return this;
  }

   /**
   * 属性值编码(枚举型，时长型 专用)
   * @return attributeValueCode
  **/
  public Long getAttributeValueCode() {
    return attributeValueCode;
  }

  public void setAttributeValueCode(Long attributeValueCode) {
    this.attributeValueCode = attributeValueCode;
  }

  public ConsoleAdminCreateOrderFormsAttributeRequestList timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * 时长单位
   * @return timeUnit
  **/
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateOrderFormsAttributeRequestList consoleAdminCreateOrderFormsAttributeRequestList = (ConsoleAdminCreateOrderFormsAttributeRequestList) o;
    return Objects.equals(this.attributeCode, consoleAdminCreateOrderFormsAttributeRequestList.attributeCode) &&
        Objects.equals(this.attributeValue, consoleAdminCreateOrderFormsAttributeRequestList.attributeValue) &&
        Objects.equals(this.attributeValueCode, consoleAdminCreateOrderFormsAttributeRequestList.attributeValueCode) &&
        Objects.equals(this.timeUnit, consoleAdminCreateOrderFormsAttributeRequestList.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeCode, attributeValue, attributeValueCode, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateOrderFormsAttributeRequestList {");
    
    sb.append(",attributeCode: ").append(toIndentedString(attributeCode));
    sb.append(",attributeValue: ").append(toIndentedString(attributeValue));
    sb.append(",attributeValueCode: ").append(toIndentedString(attributeValueCode));
    sb.append(",timeUnit: ").append(toIndentedString(timeUnit));
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
