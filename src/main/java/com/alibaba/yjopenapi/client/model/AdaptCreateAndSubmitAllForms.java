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
 * AdaptCreateAndSubmitAllForms
 */
public class AdaptCreateAndSubmitAllForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer gameId = null;


  private String gameName = null;


  private Integer gameVersionId = null;


  private String gameVersion = null;


  private String resolutionList = null;


  private String frameRateList = null;


  private Integer platformType = null;


  private Integer sourcePlatform = null;


  private String records = null;


  private String mixGameVersionId = null;


  private String mixGameId = null;


  public AdaptCreateAndSubmitAllForms gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public AdaptCreateAndSubmitAllForms gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

   /**
   * Get gameName
   * @return gameName
  **/
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public AdaptCreateAndSubmitAllForms gameVersionId(Integer gameVersionId) {
    this.gameVersionId = gameVersionId;
    return this;
  }

   /**
   * Get gameVersionId
   * @return gameVersionId
  **/
  public Integer getGameVersionId() {
    return gameVersionId;
  }

  public void setGameVersionId(Integer gameVersionId) {
    this.gameVersionId = gameVersionId;
  }

  public AdaptCreateAndSubmitAllForms gameVersion(String gameVersion) {
    this.gameVersion = gameVersion;
    return this;
  }

   /**
   * Get gameVersion
   * @return gameVersion
  **/
  public String getGameVersion() {
    return gameVersion;
  }

  public void setGameVersion(String gameVersion) {
    this.gameVersion = gameVersion;
  }

  public AdaptCreateAndSubmitAllForms resolutionList(String resolutionList) {
    this.resolutionList = resolutionList;
    return this;
  }

   /**
   * Get resolutionList
   * @return resolutionList
  **/
  public String getResolutionList() {
    return resolutionList;
  }

  public void setResolutionList(String resolutionList) {
    this.resolutionList = resolutionList;
  }

  public AdaptCreateAndSubmitAllForms frameRateList(String frameRateList) {
    this.frameRateList = frameRateList;
    return this;
  }

   /**
   * Get frameRateList
   * @return frameRateList
  **/
  public String getFrameRateList() {
    return frameRateList;
  }

  public void setFrameRateList(String frameRateList) {
    this.frameRateList = frameRateList;
  }

  public AdaptCreateAndSubmitAllForms platformType(Integer platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public Integer getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Integer platformType) {
    this.platformType = platformType;
  }

  public AdaptCreateAndSubmitAllForms sourcePlatform(Integer sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
    return this;
  }

   /**
   * Get sourcePlatform
   * @return sourcePlatform
  **/
  public Integer getSourcePlatform() {
    return sourcePlatform;
  }

  public void setSourcePlatform(Integer sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
  }

  public AdaptCreateAndSubmitAllForms records(String records) {
    this.records = records;
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public AdaptCreateAndSubmitAllForms mixGameVersionId(String mixGameVersionId) {
    this.mixGameVersionId = mixGameVersionId;
    return this;
  }

   /**
   * Get mixGameVersionId
   * @return mixGameVersionId
  **/
  public String getMixGameVersionId() {
    return mixGameVersionId;
  }

  public void setMixGameVersionId(String mixGameVersionId) {
    this.mixGameVersionId = mixGameVersionId;
  }

  public AdaptCreateAndSubmitAllForms mixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
    return this;
  }

   /**
   * Get mixGameId
   * @return mixGameId
  **/
  public String getMixGameId() {
    return mixGameId;
  }

  public void setMixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptCreateAndSubmitAllForms adaptCreateAndSubmitAllForms = (AdaptCreateAndSubmitAllForms) o;
    return Objects.equals(this.gameId, adaptCreateAndSubmitAllForms.gameId) &&
        Objects.equals(this.gameName, adaptCreateAndSubmitAllForms.gameName) &&
        Objects.equals(this.gameVersionId, adaptCreateAndSubmitAllForms.gameVersionId) &&
        Objects.equals(this.gameVersion, adaptCreateAndSubmitAllForms.gameVersion) &&
        Objects.equals(this.resolutionList, adaptCreateAndSubmitAllForms.resolutionList) &&
        Objects.equals(this.frameRateList, adaptCreateAndSubmitAllForms.frameRateList) &&
        Objects.equals(this.platformType, adaptCreateAndSubmitAllForms.platformType) &&
        Objects.equals(this.sourcePlatform, adaptCreateAndSubmitAllForms.sourcePlatform) &&
        Objects.equals(this.records, adaptCreateAndSubmitAllForms.records) &&
        Objects.equals(this.mixGameVersionId, adaptCreateAndSubmitAllForms.mixGameVersionId) &&
        Objects.equals(this.mixGameId, adaptCreateAndSubmitAllForms.mixGameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameName, gameVersionId, gameVersion, resolutionList, frameRateList, platformType, sourcePlatform, records, mixGameVersionId, mixGameId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptCreateAndSubmitAllForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameName: ").append(toIndentedString(gameName));
    sb.append(",gameVersionId: ").append(toIndentedString(gameVersionId));
    sb.append(",gameVersion: ").append(toIndentedString(gameVersion));
    sb.append(",resolutionList: ").append(toIndentedString(resolutionList));
    sb.append(",frameRateList: ").append(toIndentedString(frameRateList));
    sb.append(",platformType: ").append(toIndentedString(platformType));
    sb.append(",sourcePlatform: ").append(toIndentedString(sourcePlatform));
    sb.append(",records: ").append(toIndentedString(records));
    sb.append(",mixGameVersionId: ").append(toIndentedString(mixGameVersionId));
    sb.append(",mixGameId: ").append(toIndentedString(mixGameId));
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
