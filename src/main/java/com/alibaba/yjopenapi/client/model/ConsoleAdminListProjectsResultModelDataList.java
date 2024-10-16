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
 * ConsoleAdminListProjectsResultModelDataList
 */
public class ConsoleAdminListProjectsResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectName = null;


  private String projectId = null;


  public ConsoleAdminListProjectsResultModelDataList projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ConsoleAdminListProjectsResultModelDataList projectId(String projectId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListProjectsResultModelDataList consoleAdminListProjectsResultModelDataList = (ConsoleAdminListProjectsResultModelDataList) o;
    return Objects.equals(this.projectName, consoleAdminListProjectsResultModelDataList.projectName) &&
        Objects.equals(this.projectId, consoleAdminListProjectsResultModelDataList.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListProjectsResultModelDataList {");
    
    sb.append(",projectName: ").append(toIndentedString(projectName));
    sb.append(",projectId: ").append(toIndentedString(projectId));
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
