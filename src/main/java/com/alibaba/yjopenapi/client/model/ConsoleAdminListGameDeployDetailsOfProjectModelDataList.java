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
 * ConsoleAdminListGameDeployDetailsOfProjectModelDataList
 */
public class ConsoleAdminListGameDeployDetailsOfProjectModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  private String versionName = null;


  private String deployStatus = null;


  private String autoActiveStatus = null;


  public ConsoleAdminListGameDeployDetailsOfProjectModelDataList versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * 版本ID
   * @return versionId
  **/
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectModelDataList versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * 版本名称
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectModelDataList deployStatus(String deployStatus) {
    this.deployStatus = deployStatus;
    return this;
  }

   /**
   * 版本部署状态
   * @return deployStatus
  **/
  public String getDeployStatus() {
    return deployStatus;
  }

  public void setDeployStatus(String deployStatus) {
    this.deployStatus = deployStatus;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectModelDataList autoActiveStatus(String autoActiveStatus) {
    this.autoActiveStatus = autoActiveStatus;
    return this;
  }

   /**
   * 版本待自动激活状态
   * @return autoActiveStatus
  **/
  public String getAutoActiveStatus() {
    return autoActiveStatus;
  }

  public void setAutoActiveStatus(String autoActiveStatus) {
    this.autoActiveStatus = autoActiveStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGameDeployDetailsOfProjectModelDataList consoleAdminListGameDeployDetailsOfProjectModelDataList = (ConsoleAdminListGameDeployDetailsOfProjectModelDataList) o;
    return Objects.equals(this.versionId, consoleAdminListGameDeployDetailsOfProjectModelDataList.versionId) &&
        Objects.equals(this.versionName, consoleAdminListGameDeployDetailsOfProjectModelDataList.versionName) &&
        Objects.equals(this.deployStatus, consoleAdminListGameDeployDetailsOfProjectModelDataList.deployStatus) &&
        Objects.equals(this.autoActiveStatus, consoleAdminListGameDeployDetailsOfProjectModelDataList.autoActiveStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, versionName, deployStatus, autoActiveStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameDeployDetailsOfProjectModelDataList {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",versionName: ").append(toIndentedString(versionName));
    sb.append(",deployStatus: ").append(toIndentedString(deployStatus));
    sb.append(",autoActiveStatus: ").append(toIndentedString(autoActiveStatus));
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
