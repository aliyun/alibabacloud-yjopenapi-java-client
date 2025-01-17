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
 * ConsoleAdminActivateDeploymentForms
 */
public class ConsoleAdminActivateDeploymentForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String projectId = null;


  private String versionId = null;


  private Integer maxConcurrency = null;


  public ConsoleAdminActivateDeploymentForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public ConsoleAdminActivateDeploymentForms projectId(String projectId) {
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

  public ConsoleAdminActivateDeploymentForms versionId(String versionId) {
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

  public ConsoleAdminActivateDeploymentForms maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * Get maxConcurrency
   * @return maxConcurrency
  **/
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminActivateDeploymentForms consoleAdminActivateDeploymentForms = (ConsoleAdminActivateDeploymentForms) o;
    return Objects.equals(this.gameId, consoleAdminActivateDeploymentForms.gameId) &&
        Objects.equals(this.projectId, consoleAdminActivateDeploymentForms.projectId) &&
        Objects.equals(this.versionId, consoleAdminActivateDeploymentForms.versionId) &&
        Objects.equals(this.maxConcurrency, consoleAdminActivateDeploymentForms.maxConcurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, projectId, versionId, maxConcurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminActivateDeploymentForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",maxConcurrency: ").append(toIndentedString(maxConcurrency));
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
