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
 * ConsoleAdminListProjectsResultDataList
 */
public class ConsoleAdminListProjectsResultDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectId = null;


  private String projectName = null;


  public ConsoleAdminListProjectsResultDataList projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ConsoleAdminListProjectsResultDataList projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * 项目名称
   * @return projectName
  **/
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListProjectsResultDataList consoleAdminListProjectsResultDataList = (ConsoleAdminListProjectsResultDataList) o;
    return Objects.equals(this.projectId, consoleAdminListProjectsResultDataList.projectId) &&
        Objects.equals(this.projectName, consoleAdminListProjectsResultDataList.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListProjectsResultDataList {");
    
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",projectName: ").append(toIndentedString(projectName));
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
