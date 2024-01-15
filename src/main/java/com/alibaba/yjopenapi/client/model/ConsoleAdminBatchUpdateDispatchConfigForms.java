/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminBatchUpdateDispatchConfigFormsConfigList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminBatchUpdateDispatchConfigForms
 */
public class ConsoleAdminBatchUpdateDispatchConfigForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixProjectId = null;


  private String instanceId = null;


  private String appName = null;


  private List<ConsoleAdminBatchUpdateDispatchConfigFormsConfigList> configList = new ArrayList<ConsoleAdminBatchUpdateDispatchConfigFormsConfigList>();


  public ConsoleAdminBatchUpdateDispatchConfigForms mixProjectId(String mixProjectId) {
    this.mixProjectId = mixProjectId;
    return this;
  }

   /**
   * 项目id(混淆)
   * @return mixProjectId
  **/
  public String getMixProjectId() {
    return mixProjectId;
  }

  public void setMixProjectId(String mixProjectId) {
    this.mixProjectId = mixProjectId;
  }

  public ConsoleAdminBatchUpdateDispatchConfigForms instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 实例id
   * @return instanceId
  **/
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ConsoleAdminBatchUpdateDispatchConfigForms appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * 接入方唯一标识
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConsoleAdminBatchUpdateDispatchConfigForms configList(List<ConsoleAdminBatchUpdateDispatchConfigFormsConfigList> configList) {
    this.configList = configList;
    return this;
  }

  public ConsoleAdminBatchUpdateDispatchConfigForms addConfigListItem(ConsoleAdminBatchUpdateDispatchConfigFormsConfigList configListItem) {
    this.configList.add(configListItem);
    return this;
  }

   /**
   * Get configList
   * @return configList
  **/
  public List<ConsoleAdminBatchUpdateDispatchConfigFormsConfigList> getConfigList() {
    return configList;
  }

  public void setConfigList(List<ConsoleAdminBatchUpdateDispatchConfigFormsConfigList> configList) {
    this.configList = configList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminBatchUpdateDispatchConfigForms consoleAdminBatchUpdateDispatchConfigForms = (ConsoleAdminBatchUpdateDispatchConfigForms) o;
    return Objects.equals(this.mixProjectId, consoleAdminBatchUpdateDispatchConfigForms.mixProjectId) &&
        Objects.equals(this.instanceId, consoleAdminBatchUpdateDispatchConfigForms.instanceId) &&
        Objects.equals(this.appName, consoleAdminBatchUpdateDispatchConfigForms.appName) &&
        Objects.equals(this.configList, consoleAdminBatchUpdateDispatchConfigForms.configList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixProjectId, instanceId, appName, configList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminBatchUpdateDispatchConfigForms {");
    
    sb.append(",mixProjectId: ").append(toIndentedString(mixProjectId));
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",appName: ").append(toIndentedString(appName));
    sb.append(",configList: ").append(toIndentedString(configList));
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
