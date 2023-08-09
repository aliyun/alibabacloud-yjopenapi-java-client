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
 * UsercontollerGetUserGameArchiveResultModelModel
 */
public class UsercontollerGetUserGameArchiveResultModelModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long gameId = null;


  private String gameSessionId = null;


  private Long tenantId = null;


  private Long projectId = null;


  private Long gmtCreate = null;


  public UsercontollerGetUserGameArchiveResultModelModel gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏ID
   * @return gameId
  **/
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public UsercontollerGetUserGameArchiveResultModelModel gameSessionId(String gameSessionId) {
    this.gameSessionId = gameSessionId;
    return this;
  }

   /**
   * 游戏会话ID
   * @return gameSessionId
  **/
  public String getGameSessionId() {
    return gameSessionId;
  }

  public void setGameSessionId(String gameSessionId) {
    this.gameSessionId = gameSessionId;
  }

  public UsercontollerGetUserGameArchiveResultModelModel tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID
   * @return tenantId
  **/
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public UsercontollerGetUserGameArchiveResultModelModel projectId(Long projectId) {
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

  public UsercontollerGetUserGameArchiveResultModelModel gmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 存档生成时间
   * @return gmtCreate
  **/
  public Long getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontollerGetUserGameArchiveResultModelModel usercontollerGetUserGameArchiveResultModelModel = (UsercontollerGetUserGameArchiveResultModelModel) o;
    return Objects.equals(this.gameId, usercontollerGetUserGameArchiveResultModelModel.gameId) &&
        Objects.equals(this.gameSessionId, usercontollerGetUserGameArchiveResultModelModel.gameSessionId) &&
        Objects.equals(this.tenantId, usercontollerGetUserGameArchiveResultModelModel.tenantId) &&
        Objects.equals(this.projectId, usercontollerGetUserGameArchiveResultModelModel.projectId) &&
        Objects.equals(this.gmtCreate, usercontollerGetUserGameArchiveResultModelModel.gmtCreate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameSessionId, tenantId, projectId, gmtCreate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerGetUserGameArchiveResultModelModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameSessionId: ").append(toIndentedString(gameSessionId));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",gmtCreate: ").append(toIndentedString(gmtCreate));
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
