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
 * ConsoleAdminListVersionDeployInstancesModelDataList
 */
public class ConsoleAdminListVersionDeployInstancesModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String cloudGameInstanceId = null;


  private String cloudGameInstanceName = null;


  public ConsoleAdminListVersionDeployInstancesModelDataList cloudGameInstanceId(String cloudGameInstanceId) {
    this.cloudGameInstanceId = cloudGameInstanceId;
    return this;
  }

   /**
   * 实例ID
   * @return cloudGameInstanceId
  **/
  public String getCloudGameInstanceId() {
    return cloudGameInstanceId;
  }

  public void setCloudGameInstanceId(String cloudGameInstanceId) {
    this.cloudGameInstanceId = cloudGameInstanceId;
  }

  public ConsoleAdminListVersionDeployInstancesModelDataList cloudGameInstanceName(String cloudGameInstanceName) {
    this.cloudGameInstanceName = cloudGameInstanceName;
    return this;
  }

   /**
   * 实例名称
   * @return cloudGameInstanceName
  **/
  public String getCloudGameInstanceName() {
    return cloudGameInstanceName;
  }

  public void setCloudGameInstanceName(String cloudGameInstanceName) {
    this.cloudGameInstanceName = cloudGameInstanceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListVersionDeployInstancesModelDataList consoleAdminListVersionDeployInstancesModelDataList = (ConsoleAdminListVersionDeployInstancesModelDataList) o;
    return Objects.equals(this.cloudGameInstanceId, consoleAdminListVersionDeployInstancesModelDataList.cloudGameInstanceId) &&
        Objects.equals(this.cloudGameInstanceName, consoleAdminListVersionDeployInstancesModelDataList.cloudGameInstanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudGameInstanceId, cloudGameInstanceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListVersionDeployInstancesModelDataList {");
    
    sb.append(",cloudGameInstanceId: ").append(toIndentedString(cloudGameInstanceId));
    sb.append(",cloudGameInstanceName: ").append(toIndentedString(cloudGameInstanceName));
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
