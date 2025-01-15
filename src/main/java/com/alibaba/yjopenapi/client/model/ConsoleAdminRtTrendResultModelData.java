/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminRtTrendResultModelDataData;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminRtTrendResultModelData
 */
public class ConsoleAdminRtTrendResultModelData implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<ConsoleAdminRtTrendResultModelDataData> data = null;


  private String indicatorType = null;


  private String maxValue = null;


  private String name = null;


  public ConsoleAdminRtTrendResultModelData data(List<ConsoleAdminRtTrendResultModelDataData> data) {
    this.data = data;
    return this;
  }

  public ConsoleAdminRtTrendResultModelData addDataItem(ConsoleAdminRtTrendResultModelDataData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ConsoleAdminRtTrendResultModelDataData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<ConsoleAdminRtTrendResultModelDataData> getData() {
    return data;
  }

  public void setData(List<ConsoleAdminRtTrendResultModelDataData> data) {
    this.data = data;
  }

  public ConsoleAdminRtTrendResultModelData indicatorType(String indicatorType) {
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

  public ConsoleAdminRtTrendResultModelData maxValue(String maxValue) {
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

  public ConsoleAdminRtTrendResultModelData name(String name) {
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
    ConsoleAdminRtTrendResultModelData consoleAdminRtTrendResultModelData = (ConsoleAdminRtTrendResultModelData) o;
    return Objects.equals(this.data, consoleAdminRtTrendResultModelData.data) &&
        Objects.equals(this.indicatorType, consoleAdminRtTrendResultModelData.indicatorType) &&
        Objects.equals(this.maxValue, consoleAdminRtTrendResultModelData.maxValue) &&
        Objects.equals(this.name, consoleAdminRtTrendResultModelData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, indicatorType, maxValue, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtTrendResultModelData {");
    
    sb.append(",data: ").append(toIndentedString(data));
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
