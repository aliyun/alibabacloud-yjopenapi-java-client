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
 * StopGameForms
 */
public class StopGameForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String appKey = null;


  private String gameSession = null;


  private String reason = null;


  public StopGameForms accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 用户id，给到Paas平台和SDK，两者保持一致，全局唯一
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public StopGameForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Paas平台部署的游戏Id
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public StopGameForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Paas平台AK(应用的AK，非服务端AK)
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public StopGameForms gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * 调度成功返回的GameSession
   * @return gameSession
  **/
  public String getGameSession() {
    return gameSession;
  }

  public void setGameSession(String gameSession) {
    this.gameSession = gameSession;
  }

  public StopGameForms reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * 端侧从Paas sdk获取的调度业务参数
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopGameForms stopGameForms = (StopGameForms) o;
    return Objects.equals(this.accountId, stopGameForms.accountId) &&
        Objects.equals(this.gameId, stopGameForms.gameId) &&
        Objects.equals(this.appKey, stopGameForms.appKey) &&
        Objects.equals(this.gameSession, stopGameForms.gameSession) &&
        Objects.equals(this.reason, stopGameForms.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, appKey, gameSession, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopGameForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",reason: ").append(toIndentedString(reason));
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
