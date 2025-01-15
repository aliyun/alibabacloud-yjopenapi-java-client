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
 * ConsoleAdminGetOrderResultModelAttributeList
 */
public class ConsoleAdminGetOrderResultModelAttributeList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String attributeCode = null;


  private Long timeStart = null;


  private String attributeValueName = null;


  private Long timeTo = null;


  private Integer attributeValue = null;


  private String attributeName = null;


  private Long attributeValueCode = null;


  private String timeUnit = null;


  public ConsoleAdminGetOrderResultModelAttributeList attributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Get attributeCode
   * @return attributeCode
  **/
  public String getAttributeCode() {
    return attributeCode;
  }

  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }

  public ConsoleAdminGetOrderResultModelAttributeList timeStart(Long timeStart) {
    this.timeStart = timeStart;
    return this;
  }

   /**
   * Get timeStart
   * @return timeStart
  **/
  public Long getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(Long timeStart) {
    this.timeStart = timeStart;
  }

  public ConsoleAdminGetOrderResultModelAttributeList attributeValueName(String attributeValueName) {
    this.attributeValueName = attributeValueName;
    return this;
  }

   /**
   * Get attributeValueName
   * @return attributeValueName
  **/
  public String getAttributeValueName() {
    return attributeValueName;
  }

  public void setAttributeValueName(String attributeValueName) {
    this.attributeValueName = attributeValueName;
  }

  public ConsoleAdminGetOrderResultModelAttributeList timeTo(Long timeTo) {
    this.timeTo = timeTo;
    return this;
  }

   /**
   * Get timeTo
   * @return timeTo
  **/
  public Long getTimeTo() {
    return timeTo;
  }

  public void setTimeTo(Long timeTo) {
    this.timeTo = timeTo;
  }

  public ConsoleAdminGetOrderResultModelAttributeList attributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * Get attributeValue
   * @return attributeValue
  **/
  public Integer getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
  }

  public ConsoleAdminGetOrderResultModelAttributeList attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public ConsoleAdminGetOrderResultModelAttributeList attributeValueCode(Long attributeValueCode) {
    this.attributeValueCode = attributeValueCode;
    return this;
  }

   /**
   * Get attributeValueCode
   * @return attributeValueCode
  **/
  public Long getAttributeValueCode() {
    return attributeValueCode;
  }

  public void setAttributeValueCode(Long attributeValueCode) {
    this.attributeValueCode = attributeValueCode;
  }

  public ConsoleAdminGetOrderResultModelAttributeList timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
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
    ConsoleAdminGetOrderResultModelAttributeList consoleAdminGetOrderResultModelAttributeList = (ConsoleAdminGetOrderResultModelAttributeList) o;
    return Objects.equals(this.attributeCode, consoleAdminGetOrderResultModelAttributeList.attributeCode) &&
        Objects.equals(this.timeStart, consoleAdminGetOrderResultModelAttributeList.timeStart) &&
        Objects.equals(this.attributeValueName, consoleAdminGetOrderResultModelAttributeList.attributeValueName) &&
        Objects.equals(this.timeTo, consoleAdminGetOrderResultModelAttributeList.timeTo) &&
        Objects.equals(this.attributeValue, consoleAdminGetOrderResultModelAttributeList.attributeValue) &&
        Objects.equals(this.attributeName, consoleAdminGetOrderResultModelAttributeList.attributeName) &&
        Objects.equals(this.attributeValueCode, consoleAdminGetOrderResultModelAttributeList.attributeValueCode) &&
        Objects.equals(this.timeUnit, consoleAdminGetOrderResultModelAttributeList.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeCode, timeStart, attributeValueName, timeTo, attributeValue, attributeName, attributeValueCode, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetOrderResultModelAttributeList {");
    
    sb.append(",attributeCode: ").append(toIndentedString(attributeCode));
    sb.append(",timeStart: ").append(toIndentedString(timeStart));
    sb.append(",attributeValueName: ").append(toIndentedString(attributeValueName));
    sb.append(",timeTo: ").append(toIndentedString(timeTo));
    sb.append(",attributeValue: ").append(toIndentedString(attributeValue));
    sb.append(",attributeName: ").append(toIndentedString(attributeName));
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
