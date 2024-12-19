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
 * GetGameConcurrencyForms
 */
public class GetGameConcurrencyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String appKey = null;


  private Boolean queryQueueConcurrency = null;


  private Integer queueUserLevel = null;


  public GetGameConcurrencyForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public GetGameConcurrencyForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * 云游戏项目应用AK
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GetGameConcurrencyForms queryQueueConcurrency(Boolean queryQueueConcurrency) {
    this.queryQueueConcurrency = queryQueueConcurrency;
    return this;
  }

   /**
   * 是否查询PaaS当前排队人数
   * @return queryQueueConcurrency
  **/
  public Boolean getQueryQueueConcurrency() {
    return queryQueueConcurrency;
  }

  public void setQueryQueueConcurrency(Boolean queryQueueConcurrency) {
    this.queryQueueConcurrency = queryQueueConcurrency;
  }

  public GetGameConcurrencyForms queueUserLevel(Integer queueUserLevel) {
    this.queueUserLevel = queueUserLevel;
    return this;
  }

   /**
   * 指定userLevel查询当前userLevel排队人数，不指定时，查询当前所有排队人数
   * @return queueUserLevel
  **/
  public Integer getQueueUserLevel() {
    return queueUserLevel;
  }

  public void setQueueUserLevel(Integer queueUserLevel) {
    this.queueUserLevel = queueUserLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGameConcurrencyForms getGameConcurrencyForms = (GetGameConcurrencyForms) o;
    return Objects.equals(this.gameId, getGameConcurrencyForms.gameId) &&
        Objects.equals(this.appKey, getGameConcurrencyForms.appKey) &&
        Objects.equals(this.queryQueueConcurrency, getGameConcurrencyForms.queryQueueConcurrency) &&
        Objects.equals(this.queueUserLevel, getGameConcurrencyForms.queueUserLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, appKey, queryQueueConcurrency, queueUserLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGameConcurrencyForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",queryQueueConcurrency: ").append(toIndentedString(queryQueueConcurrency));
    sb.append(",queueUserLevel: ").append(toIndentedString(queueUserLevel));
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
