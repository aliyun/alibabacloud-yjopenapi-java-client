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
 * ConsoleAdminListActivateableInstancesForms
 */
public class ConsoleAdminListActivateableInstancesForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectId = null;


  private String versionId = null;


  public ConsoleAdminListActivateableInstancesForms projectId(String projectId) {
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

  public ConsoleAdminListActivateableInstancesForms versionId(String versionId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListActivateableInstancesForms consoleAdminListActivateableInstancesForms = (ConsoleAdminListActivateableInstancesForms) o;
    return Objects.equals(this.projectId, consoleAdminListActivateableInstancesForms.projectId) &&
        Objects.equals(this.versionId, consoleAdminListActivateableInstancesForms.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, versionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivateableInstancesForms {");
    
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",versionId: ").append(toIndentedString(versionId));
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
