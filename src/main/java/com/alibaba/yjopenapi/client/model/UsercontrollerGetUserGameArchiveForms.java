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
 * UsercontrollerGetUserGameArchiveForms
 */
public class UsercontrollerGetUserGameArchiveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String userId = null;


  private Long gameId = null;


  private Long projectId = null;


  public UsercontrollerGetUserGameArchiveForms userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户id
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UsercontrollerGetUserGameArchiveForms gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏Id
   * @return gameId
  **/
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public UsercontrollerGetUserGameArchiveForms projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
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
    UsercontrollerGetUserGameArchiveForms usercontrollerGetUserGameArchiveForms = (UsercontrollerGetUserGameArchiveForms) o;
    return Objects.equals(this.userId, usercontrollerGetUserGameArchiveForms.userId) &&
        Objects.equals(this.gameId, usercontrollerGetUserGameArchiveForms.gameId) &&
        Objects.equals(this.projectId, usercontrollerGetUserGameArchiveForms.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, gameId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetUserGameArchiveForms {");
    
    sb.append(",userId: ").append(toIndentedString(userId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
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
