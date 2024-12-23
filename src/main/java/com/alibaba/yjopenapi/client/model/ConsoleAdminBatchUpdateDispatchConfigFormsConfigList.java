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
 * ConsoleAdminBatchUpdateDispatchConfigFormsConfigList
 */
public class ConsoleAdminBatchUpdateDispatchConfigFormsConfigList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixGameId = null;


  private Integer exclusiveConcurrency = null;


  private String maxConcurrencyPercent = null;


  private String exclusiveConcurrencyPercent = null;


  private Integer priority = null;


  private Integer maxConcurrency = null;


  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList mixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
    return this;
  }

   /**
   * 编码游戏id
   * @return mixGameId
  **/
  public String getMixGameId() {
    return mixGameId;
  }

  public void setMixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
  }

  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList exclusiveConcurrency(Integer exclusiveConcurrency) {
    this.exclusiveConcurrency = exclusiveConcurrency;
    return this;
  }

   /**
   * 独占并发数
   * @return exclusiveConcurrency
  **/
  public Integer getExclusiveConcurrency() {
    return exclusiveConcurrency;
  }

  public void setExclusiveConcurrency(Integer exclusiveConcurrency) {
    this.exclusiveConcurrency = exclusiveConcurrency;
  }

  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList maxConcurrencyPercent(String maxConcurrencyPercent) {
    this.maxConcurrencyPercent = maxConcurrencyPercent;
    return this;
  }

   /**
   * 最大并发百分比-Double类型[0.0,1.0]
   * @return maxConcurrencyPercent
  **/
  public String getMaxConcurrencyPercent() {
    return maxConcurrencyPercent;
  }

  public void setMaxConcurrencyPercent(String maxConcurrencyPercent) {
    this.maxConcurrencyPercent = maxConcurrencyPercent;
  }

  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList exclusiveConcurrencyPercent(String exclusiveConcurrencyPercent) {
    this.exclusiveConcurrencyPercent = exclusiveConcurrencyPercent;
    return this;
  }

   /**
   * 独占并发百分比--Double类型[0.0,1.0]
   * @return exclusiveConcurrencyPercent
  **/
  public String getExclusiveConcurrencyPercent() {
    return exclusiveConcurrencyPercent;
  }

  public void setExclusiveConcurrencyPercent(String exclusiveConcurrencyPercent) {
    this.exclusiveConcurrencyPercent = exclusiveConcurrencyPercent;
  }

  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 调度等级
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ConsoleAdminBatchUpdateDispatchConfigFormsConfigList maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * 最大并发数
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
    ConsoleAdminBatchUpdateDispatchConfigFormsConfigList consoleAdminBatchUpdateDispatchConfigFormsConfigList = (ConsoleAdminBatchUpdateDispatchConfigFormsConfigList) o;
    return Objects.equals(this.mixGameId, consoleAdminBatchUpdateDispatchConfigFormsConfigList.mixGameId) &&
        Objects.equals(this.exclusiveConcurrency, consoleAdminBatchUpdateDispatchConfigFormsConfigList.exclusiveConcurrency) &&
        Objects.equals(this.maxConcurrencyPercent, consoleAdminBatchUpdateDispatchConfigFormsConfigList.maxConcurrencyPercent) &&
        Objects.equals(this.exclusiveConcurrencyPercent, consoleAdminBatchUpdateDispatchConfigFormsConfigList.exclusiveConcurrencyPercent) &&
        Objects.equals(this.priority, consoleAdminBatchUpdateDispatchConfigFormsConfigList.priority) &&
        Objects.equals(this.maxConcurrency, consoleAdminBatchUpdateDispatchConfigFormsConfigList.maxConcurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixGameId, exclusiveConcurrency, maxConcurrencyPercent, exclusiveConcurrencyPercent, priority, maxConcurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminBatchUpdateDispatchConfigFormsConfigList {");
    
    sb.append(",mixGameId: ").append(toIndentedString(mixGameId));
    sb.append(",exclusiveConcurrency: ").append(toIndentedString(exclusiveConcurrency));
    sb.append(",maxConcurrencyPercent: ").append(toIndentedString(maxConcurrencyPercent));
    sb.append(",exclusiveConcurrencyPercent: ").append(toIndentedString(exclusiveConcurrencyPercent));
    sb.append(",priority: ").append(toIndentedString(priority));
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
