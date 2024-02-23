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
 * ConsoleAdminQueryAdaptResultByVersionIdResultModel
 */
public class ConsoleAdminQueryAdaptResultByVersionIdResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer state = null;


  private Integer maxConcurrency = null;


  public ConsoleAdminQueryAdaptResultByVersionIdResultModel state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * -1：已下线 0:待适配 1:适配中 2:适配完成 3:适配失败
   * @return state
  **/
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * Get maxConcurrency
   * @return maxConcurrency
  **/
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminQueryAdaptResultByVersionIdResultModel consoleAdminQueryAdaptResultByVersionIdResultModel = (ConsoleAdminQueryAdaptResultByVersionIdResultModel) o;
    return Objects.equals(this.state, consoleAdminQueryAdaptResultByVersionIdResultModel.state) &&
        Objects.equals(this.maxConcurrency, consoleAdminQueryAdaptResultByVersionIdResultModel.maxConcurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, maxConcurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminQueryAdaptResultByVersionIdResultModel {");
    
    sb.append(",state: ").append(toIndentedString(state));
    sb.append(",maxConcurrency: ").append(toIndentedString(maxConcurrency));
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
