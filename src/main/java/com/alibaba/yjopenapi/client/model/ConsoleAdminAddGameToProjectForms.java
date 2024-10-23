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
 * ConsoleAdminAddGameToProjectForms
 */
public class ConsoleAdminAddGameToProjectForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectId = null;


  private String gameId = null;


  public ConsoleAdminAddGameToProjectForms projectId(String projectId) {
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

  public ConsoleAdminAddGameToProjectForms gameId(String gameId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminAddGameToProjectForms consoleAdminAddGameToProjectForms = (ConsoleAdminAddGameToProjectForms) o;
    return Objects.equals(this.projectId, consoleAdminAddGameToProjectForms.projectId) &&
        Objects.equals(this.gameId, consoleAdminAddGameToProjectForms.gameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, gameId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminAddGameToProjectForms {");
    
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
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
