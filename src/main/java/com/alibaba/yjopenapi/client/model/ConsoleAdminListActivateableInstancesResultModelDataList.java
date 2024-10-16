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
 * ConsoleAdminListActivateableInstancesResultModelDataList
 */
public class ConsoleAdminListActivateableInstancesResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String cloudGameInstanceId = null;


  private String cloudGameInstanceName = null;


  private Integer containerCount = null;


  private Integer maxConcurrency = null;


  public ConsoleAdminListActivateableInstancesResultModelDataList cloudGameInstanceId(String cloudGameInstanceId) {
    this.cloudGameInstanceId = cloudGameInstanceId;
    return this;
  }

   /**
   * Get cloudGameInstanceId
   * @return cloudGameInstanceId
  **/
  public String getCloudGameInstanceId() {
    return cloudGameInstanceId;
  }

  public void setCloudGameInstanceId(String cloudGameInstanceId) {
    this.cloudGameInstanceId = cloudGameInstanceId;
  }

  public ConsoleAdminListActivateableInstancesResultModelDataList cloudGameInstanceName(String cloudGameInstanceName) {
    this.cloudGameInstanceName = cloudGameInstanceName;
    return this;
  }

   /**
   * Get cloudGameInstanceName
   * @return cloudGameInstanceName
  **/
  public String getCloudGameInstanceName() {
    return cloudGameInstanceName;
  }

  public void setCloudGameInstanceName(String cloudGameInstanceName) {
    this.cloudGameInstanceName = cloudGameInstanceName;
  }

  public ConsoleAdminListActivateableInstancesResultModelDataList containerCount(Integer containerCount) {
    this.containerCount = containerCount;
    return this;
  }

   /**
   * Get containerCount
   * @return containerCount
  **/
  public Integer getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(Integer containerCount) {
    this.containerCount = containerCount;
  }

  public ConsoleAdminListActivateableInstancesResultModelDataList maxConcurrency(Integer maxConcurrency) {
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
    ConsoleAdminListActivateableInstancesResultModelDataList consoleAdminListActivateableInstancesResultModelDataList = (ConsoleAdminListActivateableInstancesResultModelDataList) o;
    return Objects.equals(this.cloudGameInstanceId, consoleAdminListActivateableInstancesResultModelDataList.cloudGameInstanceId) &&
        Objects.equals(this.cloudGameInstanceName, consoleAdminListActivateableInstancesResultModelDataList.cloudGameInstanceName) &&
        Objects.equals(this.containerCount, consoleAdminListActivateableInstancesResultModelDataList.containerCount) &&
        Objects.equals(this.maxConcurrency, consoleAdminListActivateableInstancesResultModelDataList.maxConcurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudGameInstanceId, cloudGameInstanceName, containerCount, maxConcurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivateableInstancesResultModelDataList {");
    
    sb.append(",cloudGameInstanceId: ").append(toIndentedString(cloudGameInstanceId));
    sb.append(",cloudGameInstanceName: ").append(toIndentedString(cloudGameInstanceName));
    sb.append(",containerCount: ").append(toIndentedString(containerCount));
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
