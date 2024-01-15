/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.LiveQueryStatusResultModelLiveListConfig;
import java.io.Serializable;
/**
 * LiveQueryStatusResultModelLiveList
 */
public class LiveQueryStatusResultModelLiveList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String streamKey = null;


  private String serverUrl = null;


  private String message = null;


  private String liveId = null;


  private LiveQueryStatusResultModelLiveListConfig config = null;


  private String status = null;


  public LiveQueryStatusResultModelLiveList streamKey(String streamKey) {
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

  public LiveQueryStatusResultModelLiveList serverUrl(String serverUrl) {
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

  public LiveQueryStatusResultModelLiveList message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LiveQueryStatusResultModelLiveList liveId(String liveId) {
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

  public LiveQueryStatusResultModelLiveList config(LiveQueryStatusResultModelLiveListConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public LiveQueryStatusResultModelLiveListConfig getConfig() {
    return config;
  }

  public void setConfig(LiveQueryStatusResultModelLiveListConfig config) {
    this.config = config;
  }

  public LiveQueryStatusResultModelLiveList status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
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
    LiveQueryStatusResultModelLiveList liveQueryStatusResultModelLiveList = (LiveQueryStatusResultModelLiveList) o;
    return Objects.equals(this.streamKey, liveQueryStatusResultModelLiveList.streamKey) &&
        Objects.equals(this.serverUrl, liveQueryStatusResultModelLiveList.serverUrl) &&
        Objects.equals(this.message, liveQueryStatusResultModelLiveList.message) &&
        Objects.equals(this.liveId, liveQueryStatusResultModelLiveList.liveId) &&
        Objects.equals(this.config, liveQueryStatusResultModelLiveList.config) &&
        Objects.equals(this.status, liveQueryStatusResultModelLiveList.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamKey, serverUrl, message, liveId, config, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveQueryStatusResultModelLiveList {");
    
    sb.append(",streamKey: ").append(toIndentedString(streamKey));
    sb.append(",serverUrl: ").append(toIndentedString(serverUrl));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",liveId: ").append(toIndentedString(liveId));
    sb.append(",config: ").append(toIndentedString(config));
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
