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
 * LiveStopGameLiveForms
 */
public class LiveStopGameLiveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private String gameSession = null;


  private String liveId = null;


  public LiveStopGameLiveForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public LiveStopGameLiveForms gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * Get gameSession
   * @return gameSession
  **/
  public String getGameSession() {
    return gameSession;
  }

  public void setGameSession(String gameSession) {
    this.gameSession = gameSession;
  }

  public LiveStopGameLiveForms liveId(String liveId) {
    this.liveId = liveId;
    return this;
  }

   /**
   * Get liveId
   * @return liveId
  **/
  public String getLiveId() {
    return liveId;
  }

  public void setLiveId(String liveId) {
    this.liveId = liveId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStopGameLiveForms liveStopGameLiveForms = (LiveStopGameLiveForms) o;
    return Objects.equals(this.appKey, liveStopGameLiveForms.appKey) &&
        Objects.equals(this.gameSession, liveStopGameLiveForms.gameSession) &&
        Objects.equals(this.liveId, liveStopGameLiveForms.liveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, gameSession, liveId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStopGameLiveForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",liveId: ").append(toIndentedString(liveId));
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
