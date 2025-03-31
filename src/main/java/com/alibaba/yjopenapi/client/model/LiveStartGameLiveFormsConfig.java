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
 * LiveStartGameLiveFormsConfig
 */
public class LiveStartGameLiveFormsConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer frameRate = null;


  private Integer bitrate = null;


  private String resolution = null;


  public LiveStartGameLiveFormsConfig frameRate(Integer frameRate) {
    this.frameRate = frameRate;
    return this;
  }

   /**
   * Get frameRate
   * @return frameRate
  **/
  public Integer getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(Integer frameRate) {
    this.frameRate = frameRate;
  }

  public LiveStartGameLiveFormsConfig bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * Get bitrate
   * @return bitrate
  **/
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public LiveStartGameLiveFormsConfig resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStartGameLiveFormsConfig liveStartGameLiveFormsConfig = (LiveStartGameLiveFormsConfig) o;
    return Objects.equals(this.frameRate, liveStartGameLiveFormsConfig.frameRate) &&
        Objects.equals(this.bitrate, liveStartGameLiveFormsConfig.bitrate) &&
        Objects.equals(this.resolution, liveStartGameLiveFormsConfig.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameRate, bitrate, resolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStartGameLiveFormsConfig {");
    
    sb.append(",frameRate: ").append(toIndentedString(frameRate));
    sb.append(",bitrate: ").append(toIndentedString(bitrate));
    sb.append(",resolution: ").append(toIndentedString(resolution));
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
