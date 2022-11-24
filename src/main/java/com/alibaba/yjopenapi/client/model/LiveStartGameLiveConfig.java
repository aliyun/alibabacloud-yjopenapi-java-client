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
 * LiveStartGameLiveConfig
 */
public class LiveStartGameLiveConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private String resolution = null;


  private Integer frameRate = null;


  private Integer bitrate = null;


  public LiveStartGameLiveConfig resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * 分辨率
   * @return resolution
  **/
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public LiveStartGameLiveConfig frameRate(Integer frameRate) {
    this.frameRate = frameRate;
    return this;
  }

   /**
   * 帧率
   * @return frameRate
  **/
  public Integer getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(Integer frameRate) {
    this.frameRate = frameRate;
  }

  public LiveStartGameLiveConfig bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * 码率
   * @return bitrate
  **/
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStartGameLiveConfig liveStartGameLiveConfig = (LiveStartGameLiveConfig) o;
    return Objects.equals(this.resolution, liveStartGameLiveConfig.resolution) &&
        Objects.equals(this.frameRate, liveStartGameLiveConfig.frameRate) &&
        Objects.equals(this.bitrate, liveStartGameLiveConfig.bitrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, frameRate, bitrate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStartGameLiveConfig {");
    
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",frameRate: ").append(toIndentedString(frameRate));
    sb.append(",bitrate: ").append(toIndentedString(bitrate));
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
