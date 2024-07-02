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
 * ConsoleAdminListDeployableInstancesResultModelDataList
 */
public class ConsoleAdminListDeployableInstancesResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String cloudGameInstanceId = null;


  private String cloudGameInstanceName = null;


  public ConsoleAdminListDeployableInstancesResultModelDataList cloudGameInstanceId(String cloudGameInstanceId) {
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

  public ConsoleAdminListDeployableInstancesResultModelDataList cloudGameInstanceName(String cloudGameInstanceName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListDeployableInstancesResultModelDataList consoleAdminListDeployableInstancesResultModelDataList = (ConsoleAdminListDeployableInstancesResultModelDataList) o;
    return Objects.equals(this.cloudGameInstanceId, consoleAdminListDeployableInstancesResultModelDataList.cloudGameInstanceId) &&
        Objects.equals(this.cloudGameInstanceName, consoleAdminListDeployableInstancesResultModelDataList.cloudGameInstanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudGameInstanceId, cloudGameInstanceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListDeployableInstancesResultModelDataList {");
    
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
