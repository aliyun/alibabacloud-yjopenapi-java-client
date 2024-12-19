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
 * ConsoleAdminListDeployableInstancesForms
 */
public class ConsoleAdminListDeployableInstancesForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  private String projectId = null;


  private Long pageSize = null;


  private Long pageNumber = null;


  public ConsoleAdminListDeployableInstancesForms versionId(String versionId) {
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

  public ConsoleAdminListDeployableInstancesForms projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ConsoleAdminListDeployableInstancesForms pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ConsoleAdminListDeployableInstancesForms pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListDeployableInstancesForms consoleAdminListDeployableInstancesForms = (ConsoleAdminListDeployableInstancesForms) o;
    return Objects.equals(this.versionId, consoleAdminListDeployableInstancesForms.versionId) &&
        Objects.equals(this.projectId, consoleAdminListDeployableInstancesForms.projectId) &&
        Objects.equals(this.pageSize, consoleAdminListDeployableInstancesForms.pageSize) &&
        Objects.equals(this.pageNumber, consoleAdminListDeployableInstancesForms.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, projectId, pageSize, pageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListDeployableInstancesForms {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
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
