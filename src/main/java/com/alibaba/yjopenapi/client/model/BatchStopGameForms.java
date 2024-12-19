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
 * BatchStopGameForms
 */
public class BatchStopGameForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String appKey = null;


  private String token = null;


  private String reason = null;


  private String trackInfo = null;


  private String tags = null;


  public BatchStopGameForms gameId(String gameId) {
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

  public BatchStopGameForms appKey(String appKey) {
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

  public BatchStopGameForms token(String token) {
    this.token = token;
    return this;
  }

   /**
   * 通过接口获取的token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public BatchStopGameForms reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * 踢人的原因，会透传到sdk侧
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public BatchStopGameForms trackInfo(String trackInfo) {
    this.trackInfo = trackInfo;
    return this;
  }

   /**
   * TrackInfo，回传消息
   * @return trackInfo
  **/
  public String getTrackInfo() {
    return trackInfo;
  }

  public void setTrackInfo(String trackInfo) {
    this.trackInfo = trackInfo;
  }

  public BatchStopGameForms tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * 支持多标签传输
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStopGameForms batchStopGameForms = (BatchStopGameForms) o;
    return Objects.equals(this.gameId, batchStopGameForms.gameId) &&
        Objects.equals(this.appKey, batchStopGameForms.appKey) &&
        Objects.equals(this.token, batchStopGameForms.token) &&
        Objects.equals(this.reason, batchStopGameForms.reason) &&
        Objects.equals(this.trackInfo, batchStopGameForms.trackInfo) &&
        Objects.equals(this.tags, batchStopGameForms.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, appKey, token, reason, trackInfo, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStopGameForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",token: ").append(toIndentedString(token));
    sb.append(",reason: ").append(toIndentedString(reason));
    sb.append(",trackInfo: ").append(toIndentedString(trackInfo));
    sb.append(",tags: ").append(toIndentedString(tags));
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
