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
 * QuerySessionStatusResultModel
 */
public class QuerySessionStatusResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String code = null;


  private String message = null;


  private String accountId = null;


  private Long dispatchTime = null;


  private Integer userLevel = null;


  private String regionId = null;


  private Boolean success = null;


  private Long tenantId = null;


  private Long stopTime = null;


  private Long playTime = null;


  private String projectId = null;


  private String gameSession = null;


  private String status = null;


  public QuerySessionStatusResultModel gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 会话归属的游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public QuerySessionStatusResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 返回码
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public QuerySessionStatusResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 返回信息
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public QuerySessionStatusResultModel accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 会话所属用户ID
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public QuerySessionStatusResultModel dispatchTime(Long dispatchTime) {
    this.dispatchTime = dispatchTime;
    return this;
  }

   /**
   * 会话调度毫秒时间戳
   * @return dispatchTime
  **/
  public Long getDispatchTime() {
    return dispatchTime;
  }

  public void setDispatchTime(Long dispatchTime) {
    this.dispatchTime = dispatchTime;
  }

  public QuerySessionStatusResultModel userLevel(Integer userLevel) {
    this.userLevel = userLevel;
    return this;
  }

   /**
   * 会话调度用户等级
   * @return userLevel
  **/
  public Integer getUserLevel() {
    return userLevel;
  }

  public void setUserLevel(Integer userLevel) {
    this.userLevel = userLevel;
  }

  public QuerySessionStatusResultModel regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 会话调度大区ID
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public QuerySessionStatusResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 是否成功
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public QuerySessionStatusResultModel tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 会话归属的租户ID
   * @return tenantId
  **/
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public QuerySessionStatusResultModel stopTime(Long stopTime) {
    this.stopTime = stopTime;
    return this;
  }

   /**
   * 会话停止毫秒时间戳
   * @return stopTime
  **/
  public Long getStopTime() {
    return stopTime;
  }

  public void setStopTime(Long stopTime) {
    this.stopTime = stopTime;
  }

  public QuerySessionStatusResultModel playTime(Long playTime) {
    this.playTime = playTime;
    return this;
  }

   /**
   * 用户开始游戏毫秒时间戳
   * @return playTime
  **/
  public Long getPlayTime() {
    return playTime;
  }

  public void setPlayTime(Long playTime) {
    this.playTime = playTime;
  }

  public QuerySessionStatusResultModel projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 会话归属的项目ID
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public QuerySessionStatusResultModel gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * 会话ID
   * @return gameSession
  **/
  public String getGameSession() {
    return gameSession;
  }

  public void setGameSession(String gameSession) {
    this.gameSession = gameSession;
  }

  public QuerySessionStatusResultModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 会话当前状态：STARTED: 运行中，STOPPED: 已停止
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySessionStatusResultModel querySessionStatusResultModel = (QuerySessionStatusResultModel) o;
    return Objects.equals(this.gameId, querySessionStatusResultModel.gameId) &&
        Objects.equals(this.code, querySessionStatusResultModel.code) &&
        Objects.equals(this.message, querySessionStatusResultModel.message) &&
        Objects.equals(this.accountId, querySessionStatusResultModel.accountId) &&
        Objects.equals(this.dispatchTime, querySessionStatusResultModel.dispatchTime) &&
        Objects.equals(this.userLevel, querySessionStatusResultModel.userLevel) &&
        Objects.equals(this.regionId, querySessionStatusResultModel.regionId) &&
        Objects.equals(this.success, querySessionStatusResultModel.success) &&
        Objects.equals(this.tenantId, querySessionStatusResultModel.tenantId) &&
        Objects.equals(this.stopTime, querySessionStatusResultModel.stopTime) &&
        Objects.equals(this.playTime, querySessionStatusResultModel.playTime) &&
        Objects.equals(this.projectId, querySessionStatusResultModel.projectId) &&
        Objects.equals(this.gameSession, querySessionStatusResultModel.gameSession) &&
        Objects.equals(this.status, querySessionStatusResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, code, message, accountId, dispatchTime, userLevel, regionId, success, tenantId, stopTime, playTime, projectId, gameSession, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySessionStatusResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",dispatchTime: ").append(toIndentedString(dispatchTime));
    sb.append(",userLevel: ").append(toIndentedString(userLevel));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",stopTime: ").append(toIndentedString(stopTime));
    sb.append(",playTime: ").append(toIndentedString(playTime));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",status: ").append(toIndentedString(status));
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
