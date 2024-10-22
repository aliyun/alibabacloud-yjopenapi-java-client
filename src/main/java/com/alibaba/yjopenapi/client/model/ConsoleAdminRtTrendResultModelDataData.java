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
 * ConsoleAdminRtTrendResultModelDataData
 */
public class ConsoleAdminRtTrendResultModelDataData implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long timeStamp = null;


  private String value = null;


  public ConsoleAdminRtTrendResultModelDataData timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  public Long getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ConsoleAdminRtTrendResultModelDataData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminRtTrendResultModelDataData consoleAdminRtTrendResultModelDataData = (ConsoleAdminRtTrendResultModelDataData) o;
    return Objects.equals(this.timeStamp, consoleAdminRtTrendResultModelDataData.timeStamp) &&
        Objects.equals(this.value, consoleAdminRtTrendResultModelDataData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtTrendResultModelDataData {");
    
    sb.append(",timeStamp: ").append(toIndentedString(timeStamp));
    sb.append(",value: ").append(toIndentedString(value));
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
