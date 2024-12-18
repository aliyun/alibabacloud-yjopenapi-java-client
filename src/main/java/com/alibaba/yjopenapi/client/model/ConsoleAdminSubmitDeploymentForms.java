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
 * ConsoleAdminSubmitDeploymentForms
 */
public class ConsoleAdminSubmitDeploymentForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String projectId = null;


  private String versionId = null;


  private String cloudGameInstanceIds = null;


  private String operationType = null;


  public ConsoleAdminSubmitDeploymentForms gameId(String gameId) {
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

  public ConsoleAdminSubmitDeploymentForms projectId(String projectId) {
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

  public ConsoleAdminSubmitDeploymentForms versionId(String versionId) {
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

  public ConsoleAdminSubmitDeploymentForms cloudGameInstanceIds(String cloudGameInstanceIds) {
    this.cloudGameInstanceIds = cloudGameInstanceIds;
    return this;
  }

   /**
   * Get cloudGameInstanceIds
   * @return cloudGameInstanceIds
  **/
  public String getCloudGameInstanceIds() {
    return cloudGameInstanceIds;
  }

  public void setCloudGameInstanceIds(String cloudGameInstanceIds) {
    this.cloudGameInstanceIds = cloudGameInstanceIds;
  }

  public ConsoleAdminSubmitDeploymentForms operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminSubmitDeploymentForms consoleAdminSubmitDeploymentForms = (ConsoleAdminSubmitDeploymentForms) o;
    return Objects.equals(this.gameId, consoleAdminSubmitDeploymentForms.gameId) &&
        Objects.equals(this.projectId, consoleAdminSubmitDeploymentForms.projectId) &&
        Objects.equals(this.versionId, consoleAdminSubmitDeploymentForms.versionId) &&
        Objects.equals(this.cloudGameInstanceIds, consoleAdminSubmitDeploymentForms.cloudGameInstanceIds) &&
        Objects.equals(this.operationType, consoleAdminSubmitDeploymentForms.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, projectId, versionId, cloudGameInstanceIds, operationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminSubmitDeploymentForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",cloudGameInstanceIds: ").append(toIndentedString(cloudGameInstanceIds));
    sb.append(",operationType: ").append(toIndentedString(operationType));
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
