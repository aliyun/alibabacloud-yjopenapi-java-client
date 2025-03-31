/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminRtTrendResultModelData;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminRtTrendResultModel
 */
public class ConsoleAdminRtTrendResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<ConsoleAdminRtTrendResultModelData> data = null;


  private String maxValue = null;


  public ConsoleAdminRtTrendResultModel data(List<ConsoleAdminRtTrendResultModelData> data) {
    this.data = data;
    return this;
  }

  public ConsoleAdminRtTrendResultModel addDataItem(ConsoleAdminRtTrendResultModelData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ConsoleAdminRtTrendResultModelData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<ConsoleAdminRtTrendResultModelData> getData() {
    return data;
  }

  public void setData(List<ConsoleAdminRtTrendResultModelData> data) {
    this.data = data;
  }

  public ConsoleAdminRtTrendResultModel maxValue(String maxValue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminRtTrendResultModel consoleAdminRtTrendResultModel = (ConsoleAdminRtTrendResultModel) o;
    return Objects.equals(this.data, consoleAdminRtTrendResultModel.data) &&
        Objects.equals(this.maxValue, consoleAdminRtTrendResultModel.maxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, maxValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtTrendResultModel {");
    
    sb.append(",data: ").append(toIndentedString(data));
    sb.append(",maxValue: ").append(toIndentedString(maxValue));
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
