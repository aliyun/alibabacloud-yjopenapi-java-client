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
 * ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList
 */
public class ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  private String autoActiveStatus = null;


  private String versionName = null;


  private String deployStatus = null;


  public ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList autoActiveStatus(String autoActiveStatus) {
    this.autoActiveStatus = autoActiveStatus;
    return this;
  }

   /**
   * Get autoActiveStatus
   * @return autoActiveStatus
  **/
  public String getAutoActiveStatus() {
    return autoActiveStatus;
  }

  public void setAutoActiveStatus(String autoActiveStatus) {
    this.autoActiveStatus = autoActiveStatus;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * Get versionName
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList deployStatus(String deployStatus) {
    this.deployStatus = deployStatus;
    return this;
  }

   /**
   * Get deployStatus
   * @return deployStatus
  **/
  public String getDeployStatus() {
    return deployStatus;
  }

  public void setDeployStatus(String deployStatus) {
    this.deployStatus = deployStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList consoleAdminListGameDeployDetailsOfProjectResultModelDataList = (ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList) o;
    return Objects.equals(this.versionId, consoleAdminListGameDeployDetailsOfProjectResultModelDataList.versionId) &&
        Objects.equals(this.autoActiveStatus, consoleAdminListGameDeployDetailsOfProjectResultModelDataList.autoActiveStatus) &&
        Objects.equals(this.versionName, consoleAdminListGameDeployDetailsOfProjectResultModelDataList.versionName) &&
        Objects.equals(this.deployStatus, consoleAdminListGameDeployDetailsOfProjectResultModelDataList.deployStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, autoActiveStatus, versionName, deployStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",autoActiveStatus: ").append(toIndentedString(autoActiveStatus));
    sb.append(",versionName: ").append(toIndentedString(versionName));
    sb.append(",deployStatus: ").append(toIndentedString(deployStatus));
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
