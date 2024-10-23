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
 * ConsoleAdminListInstancesOfProjectForms
 */
public class ConsoleAdminListInstancesOfProjectForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextToken = null;


  private Integer maxResult = null;


  private String projectId = null;


  public ConsoleAdminListInstancesOfProjectForms nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ConsoleAdminListInstancesOfProjectForms maxResult(Integer maxResult) {
    this.maxResult = maxResult;
    return this;
  }

   /**
   * Get maxResult
   * @return maxResult
  **/
  public Integer getMaxResult() {
    return maxResult;
  }

  public void setMaxResult(Integer maxResult) {
    this.maxResult = maxResult;
  }

  public ConsoleAdminListInstancesOfProjectForms projectId(String projectId) {
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
    ConsoleAdminListInstancesOfProjectForms consoleAdminListInstancesOfProjectForms = (ConsoleAdminListInstancesOfProjectForms) o;
    return Objects.equals(this.nextToken, consoleAdminListInstancesOfProjectForms.nextToken) &&
        Objects.equals(this.maxResult, consoleAdminListInstancesOfProjectForms.maxResult) &&
        Objects.equals(this.projectId, consoleAdminListInstancesOfProjectForms.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, maxResult, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListInstancesOfProjectForms {");
    
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",maxResult: ").append(toIndentedString(maxResult));
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
