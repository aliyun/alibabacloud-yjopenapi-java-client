/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.LiveStartGameLiveFormsConfig;
import java.io.Serializable;
/**
 * LiveStartGameLiveForms
 */
public class LiveStartGameLiveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private String gameSession = null;


  private String serverUrl = null;


  private String streamKey = null;


  private LiveStartGameLiveFormsConfig config = null;


  public LiveStartGameLiveForms appKey(String appKey) {
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

  public LiveStartGameLiveForms gameSession(String gameSession) {
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

  public LiveStartGameLiveForms serverUrl(String serverUrl) {
    this.serverUrl = serverUrl;
    return this;
  }

   /**
   * Get serverUrl
   * @return serverUrl
  **/
  public String getServerUrl() {
    return serverUrl;
  }

  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  public LiveStartGameLiveForms streamKey(String streamKey) {
    this.streamKey = streamKey;
    return this;
  }

   /**
   * Get streamKey
   * @return streamKey
  **/
  public String getStreamKey() {
    return streamKey;
  }

  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }

  public LiveStartGameLiveForms config(LiveStartGameLiveFormsConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public LiveStartGameLiveFormsConfig getConfig() {
    return config;
  }

  public void setConfig(LiveStartGameLiveFormsConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStartGameLiveForms liveStartGameLiveForms = (LiveStartGameLiveForms) o;
    return Objects.equals(this.appKey, liveStartGameLiveForms.appKey) &&
        Objects.equals(this.gameSession, liveStartGameLiveForms.gameSession) &&
        Objects.equals(this.serverUrl, liveStartGameLiveForms.serverUrl) &&
        Objects.equals(this.streamKey, liveStartGameLiveForms.streamKey) &&
        Objects.equals(this.config, liveStartGameLiveForms.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, gameSession, serverUrl, streamKey, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStartGameLiveForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",serverUrl: ").append(toIndentedString(serverUrl));
    sb.append(",streamKey: ").append(toIndentedString(streamKey));
    sb.append(",config: ").append(toIndentedString(config));
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
