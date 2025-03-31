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
 * ConsoleAdminRtOverViewResultModel
 */
public class ConsoleAdminRtOverViewResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String indicatorType = null;


  private String maxValue = null;


  private String name = null;


  public ConsoleAdminRtOverViewResultModel indicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

   /**
   * Get indicatorType
   * @return indicatorType
  **/
  public String getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
  }

  public ConsoleAdminRtOverViewResultModel maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }

  public ConsoleAdminRtOverViewResultModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminRtOverViewResultModel consoleAdminRtOverViewResultModel = (ConsoleAdminRtOverViewResultModel) o;
    return Objects.equals(this.indicatorType, consoleAdminRtOverViewResultModel.indicatorType) &&
        Objects.equals(this.maxValue, consoleAdminRtOverViewResultModel.maxValue) &&
        Objects.equals(this.name, consoleAdminRtOverViewResultModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorType, maxValue, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtOverViewResultModel {");
    
    sb.append(",indicatorType: ").append(toIndentedString(indicatorType));
    sb.append(",maxValue: ").append(toIndentedString(maxValue));
    sb.append(",name: ").append(toIndentedString(name));
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
