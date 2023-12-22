/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.TryToGetSlotsFormsRequestsStartParam;
import java.io.Serializable;
/**
 * TryToGetSlotsFormsRequests
 */
public class TryToGetSlotsFormsRequests implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private Integer fps = null;


  private Boolean reConnect = null;


  private Integer resolution = null;


  private String tags = null;


  private String gameCmdParam = null;


  private String accountId = null;


  private Integer codec = null;


  private Integer userLevel = null;


  private TryToGetSlotsFormsRequestsStartParam startParam = null;


  private String regionId = null;


  private Integer bitRate = null;


  private String clientIp = null;


  private String bizParam = null;


  public TryToGetSlotsFormsRequests gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public TryToGetSlotsFormsRequests fps(Integer fps) {
    this.fps = fps;
    return this;
  }

   /**
   * Get fps
   * @return fps
  **/
  public Integer getFps() {
    return fps;
  }

  public void setFps(Integer fps) {
    this.fps = fps;
  }

  public TryToGetSlotsFormsRequests reConnect(Boolean reConnect) {
    this.reConnect = reConnect;
    return this;
  }

   /**
   * Get reConnect
   * @return reConnect
  **/
  public Boolean getReConnect() {
    return reConnect;
  }

  public void setReConnect(Boolean reConnect) {
    this.reConnect = reConnect;
  }

  public TryToGetSlotsFormsRequests resolution(Integer resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  public Integer getResolution() {
    return resolution;
  }

  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }

  public TryToGetSlotsFormsRequests tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public TryToGetSlotsFormsRequests gameCmdParam(String gameCmdParam) {
    this.gameCmdParam = gameCmdParam;
    return this;
  }

   /**
   * Get gameCmdParam
   * @return gameCmdParam
  **/
  public String getGameCmdParam() {
    return gameCmdParam;
  }

  public void setGameCmdParam(String gameCmdParam) {
    this.gameCmdParam = gameCmdParam;
  }

  public TryToGetSlotsFormsRequests accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TryToGetSlotsFormsRequests codec(Integer codec) {
    this.codec = codec;
    return this;
  }

   /**
   * Get codec
   * @return codec
  **/
  public Integer getCodec() {
    return codec;
  }

  public void setCodec(Integer codec) {
    this.codec = codec;
  }

  public TryToGetSlotsFormsRequests userLevel(Integer userLevel) {
    this.userLevel = userLevel;
    return this;
  }

   /**
   * Get userLevel
   * @return userLevel
  **/
  public Integer getUserLevel() {
    return userLevel;
  }

  public void setUserLevel(Integer userLevel) {
    this.userLevel = userLevel;
  }

  public TryToGetSlotsFormsRequests startParam(TryToGetSlotsFormsRequestsStartParam startParam) {
    this.startParam = startParam;
    return this;
  }

   /**
   * Get startParam
   * @return startParam
  **/
  public TryToGetSlotsFormsRequestsStartParam getStartParam() {
    return startParam;
  }

  public void setStartParam(TryToGetSlotsFormsRequestsStartParam startParam) {
    this.startParam = startParam;
  }

  public TryToGetSlotsFormsRequests regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public TryToGetSlotsFormsRequests bitRate(Integer bitRate) {
    this.bitRate = bitRate;
    return this;
  }

   /**
   * Get bitRate
   * @return bitRate
  **/
  public Integer getBitRate() {
    return bitRate;
  }

  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }

  public TryToGetSlotsFormsRequests clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public TryToGetSlotsFormsRequests bizParam(String bizParam) {
    this.bizParam = bizParam;
    return this;
  }

   /**
   * Get bizParam
   * @return bizParam
  **/
  public String getBizParam() {
    return bizParam;
  }

  public void setBizParam(String bizParam) {
    this.bizParam = bizParam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotsFormsRequests tryToGetSlotsFormsRequests = (TryToGetSlotsFormsRequests) o;
    return Objects.equals(this.gameId, tryToGetSlotsFormsRequests.gameId) &&
        Objects.equals(this.fps, tryToGetSlotsFormsRequests.fps) &&
        Objects.equals(this.reConnect, tryToGetSlotsFormsRequests.reConnect) &&
        Objects.equals(this.resolution, tryToGetSlotsFormsRequests.resolution) &&
        Objects.equals(this.tags, tryToGetSlotsFormsRequests.tags) &&
        Objects.equals(this.gameCmdParam, tryToGetSlotsFormsRequests.gameCmdParam) &&
        Objects.equals(this.accountId, tryToGetSlotsFormsRequests.accountId) &&
        Objects.equals(this.codec, tryToGetSlotsFormsRequests.codec) &&
        Objects.equals(this.userLevel, tryToGetSlotsFormsRequests.userLevel) &&
        Objects.equals(this.startParam, tryToGetSlotsFormsRequests.startParam) &&
        Objects.equals(this.regionId, tryToGetSlotsFormsRequests.regionId) &&
        Objects.equals(this.bitRate, tryToGetSlotsFormsRequests.bitRate) &&
        Objects.equals(this.clientIp, tryToGetSlotsFormsRequests.clientIp) &&
        Objects.equals(this.bizParam, tryToGetSlotsFormsRequests.bizParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, fps, reConnect, resolution, tags, gameCmdParam, accountId, codec, userLevel, startParam, regionId, bitRate, clientIp, bizParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotsFormsRequests {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",fps: ").append(toIndentedString(fps));
    sb.append(",reConnect: ").append(toIndentedString(reConnect));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",tags: ").append(toIndentedString(tags));
    sb.append(",gameCmdParam: ").append(toIndentedString(gameCmdParam));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",codec: ").append(toIndentedString(codec));
    sb.append(",userLevel: ").append(toIndentedString(userLevel));
    sb.append(",startParam: ").append(toIndentedString(startParam));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",bitRate: ").append(toIndentedString(bitRate));
    sb.append(",clientIp: ").append(toIndentedString(clientIp));
    sb.append(",bizParam: ").append(toIndentedString(bizParam));
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
