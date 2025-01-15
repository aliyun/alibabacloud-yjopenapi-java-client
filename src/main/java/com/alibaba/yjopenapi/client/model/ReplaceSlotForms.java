/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ReplaceSlotFormsStartParam;
import java.io.Serializable;
/**
 * ReplaceSlotForms
 */
public class ReplaceSlotForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String replaceSession = null;


  private String accountId = null;


  private String gameId = null;


  private String appKey = null;


  private String bizParam = null;


  private String clientIp = null;


  private String tags = null;


  private Integer codec = null;


  private Integer resolution = null;


  private Integer bitRate = null;


  private Integer fps = null;


  private String gameCmdParam = null;


  private Integer userLevel = null;


  private ReplaceSlotFormsStartParam startParam = null;


  public ReplaceSlotForms replaceSession(String replaceSession) {
    this.replaceSession = replaceSession;
    return this;
  }

   /**
   * Get replaceSession
   * @return replaceSession
  **/
  public String getReplaceSession() {
    return replaceSession;
  }

  public void setReplaceSession(String replaceSession) {
    this.replaceSession = replaceSession;
  }

  public ReplaceSlotForms accountId(String accountId) {
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

  public ReplaceSlotForms gameId(String gameId) {
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

  public ReplaceSlotForms appKey(String appKey) {
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

  public ReplaceSlotForms bizParam(String bizParam) {
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

  public ReplaceSlotForms clientIp(String clientIp) {
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

  public ReplaceSlotForms tags(String tags) {
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

  public ReplaceSlotForms codec(Integer codec) {
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

  public ReplaceSlotForms resolution(Integer resolution) {
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

  public ReplaceSlotForms bitRate(Integer bitRate) {
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

  public ReplaceSlotForms fps(Integer fps) {
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

  public ReplaceSlotForms gameCmdParam(String gameCmdParam) {
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

  public ReplaceSlotForms userLevel(Integer userLevel) {
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

  public ReplaceSlotForms startParam(ReplaceSlotFormsStartParam startParam) {
    this.startParam = startParam;
    return this;
  }

   /**
   * Get startParam
   * @return startParam
  **/
  public ReplaceSlotFormsStartParam getStartParam() {
    return startParam;
  }

  public void setStartParam(ReplaceSlotFormsStartParam startParam) {
    this.startParam = startParam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceSlotForms replaceSlotForms = (ReplaceSlotForms) o;
    return Objects.equals(this.replaceSession, replaceSlotForms.replaceSession) &&
        Objects.equals(this.accountId, replaceSlotForms.accountId) &&
        Objects.equals(this.gameId, replaceSlotForms.gameId) &&
        Objects.equals(this.appKey, replaceSlotForms.appKey) &&
        Objects.equals(this.bizParam, replaceSlotForms.bizParam) &&
        Objects.equals(this.clientIp, replaceSlotForms.clientIp) &&
        Objects.equals(this.tags, replaceSlotForms.tags) &&
        Objects.equals(this.codec, replaceSlotForms.codec) &&
        Objects.equals(this.resolution, replaceSlotForms.resolution) &&
        Objects.equals(this.bitRate, replaceSlotForms.bitRate) &&
        Objects.equals(this.fps, replaceSlotForms.fps) &&
        Objects.equals(this.gameCmdParam, replaceSlotForms.gameCmdParam) &&
        Objects.equals(this.userLevel, replaceSlotForms.userLevel) &&
        Objects.equals(this.startParam, replaceSlotForms.startParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replaceSession, accountId, gameId, appKey, bizParam, clientIp, tags, codec, resolution, bitRate, fps, gameCmdParam, userLevel, startParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceSlotForms {");
    
    sb.append(",replaceSession: ").append(toIndentedString(replaceSession));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",bizParam: ").append(toIndentedString(bizParam));
    sb.append(",clientIp: ").append(toIndentedString(clientIp));
    sb.append(",tags: ").append(toIndentedString(tags));
    sb.append(",codec: ").append(toIndentedString(codec));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",bitRate: ").append(toIndentedString(bitRate));
    sb.append(",fps: ").append(toIndentedString(fps));
    sb.append(",gameCmdParam: ").append(toIndentedString(gameCmdParam));
    sb.append(",userLevel: ").append(toIndentedString(userLevel));
    sb.append(",startParam: ").append(toIndentedString(startParam));
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
