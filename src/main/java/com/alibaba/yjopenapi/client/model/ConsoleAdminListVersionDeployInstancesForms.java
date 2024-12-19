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
 * ConsoleAdminListVersionDeployInstancesForms
 */
public class ConsoleAdminListVersionDeployInstancesForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectId = null;


  private String gameId = null;


  private String versionId = null;


  private String deployStatus = null;


  public ConsoleAdminListVersionDeployInstancesForms projectId(String projectId) {
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

  public ConsoleAdminListVersionDeployInstancesForms gameId(String gameId) {
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

  public ConsoleAdminListVersionDeployInstancesForms versionId(String versionId) {
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

  public ConsoleAdminListVersionDeployInstancesForms deployStatus(String deployStatus) {
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
    ConsoleAdminListVersionDeployInstancesForms consoleAdminListVersionDeployInstancesForms = (ConsoleAdminListVersionDeployInstancesForms) o;
    return Objects.equals(this.projectId, consoleAdminListVersionDeployInstancesForms.projectId) &&
        Objects.equals(this.gameId, consoleAdminListVersionDeployInstancesForms.gameId) &&
        Objects.equals(this.versionId, consoleAdminListVersionDeployInstancesForms.versionId) &&
        Objects.equals(this.deployStatus, consoleAdminListVersionDeployInstancesForms.deployStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, gameId, versionId, deployStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListVersionDeployInstancesForms {");
    
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",versionId: ").append(toIndentedString(versionId));
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
