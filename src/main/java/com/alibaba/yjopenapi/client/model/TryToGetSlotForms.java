/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.TryToGetSlotFormsStartParam;
import java.io.Serializable;
/**
 * TryToGetSlotForms
 */
public class TryToGetSlotForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String appKey = null;


  private String regionId = null;


  private Boolean reConnect = null;


  private String bizParam = null;


  private String clientIp = null;


  private String tags = null;


  private Integer userLevel = null;


  private Integer codec = null;


  private Integer resolution = null;


  private Integer bitRate = null;


  private Integer fps = null;


  private String gameCmdParam = null;


  private TryToGetSlotFormsStartParam startParam = null;


  public TryToGetSlotForms accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 用户id，给到Paas平台和SDK，两者保持一致，全局唯一
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TryToGetSlotForms gameId(String gameId) {
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

  public TryToGetSlotForms appKey(String appKey) {
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

  public TryToGetSlotForms regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 需要调度的区域
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public TryToGetSlotForms reConnect(Boolean reConnect) {
    this.reConnect = reConnect;
    return this;
  }

   /**
   * false代表不使用断线重连，开启新游戏
   * @return reConnect
  **/
  public Boolean getReConnect() {
    return reConnect;
  }

  public void setReConnect(Boolean reConnect) {
    this.reConnect = reConnect;
  }

  public TryToGetSlotForms bizParam(String bizParam) {
    this.bizParam = bizParam;
    return this;
  }

   /**
   * 端侧从Paas sdk获取的调度业务参数
   * @return bizParam
  **/
  public String getBizParam() {
    return bizParam;
  }

  public void setBizParam(String bizParam) {
    this.bizParam = bizParam;
  }

  public TryToGetSlotForms clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * App端公网ip
   * @return clientIp
  **/
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public TryToGetSlotForms tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * 标签之间用半角逗号分隔
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public TryToGetSlotForms userLevel(Integer userLevel) {
    this.userLevel = userLevel;
    return this;
  }

   /**
   * 调度等级
   * @return userLevel
  **/
  public Integer getUserLevel() {
    return userLevel;
  }

  public void setUserLevel(Integer userLevel) {
    this.userLevel = userLevel;
  }

  public TryToGetSlotForms codec(Integer codec) {
    this.codec = codec;
    return this;
  }

   /**
   * 编码
   * @return codec
  **/
  public Integer getCodec() {
    return codec;
  }

  public void setCodec(Integer codec) {
    this.codec = codec;
  }

  public TryToGetSlotForms resolution(Integer resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * 画质
   * @return resolution
  **/
  public Integer getResolution() {
    return resolution;
  }

  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }

  public TryToGetSlotForms bitRate(Integer bitRate) {
    this.bitRate = bitRate;
    return this;
  }

   /**
   * 码率
   * @return bitRate
  **/
  public Integer getBitRate() {
    return bitRate;
  }

  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }

  public TryToGetSlotForms fps(Integer fps) {
    this.fps = fps;
    return this;
  }

   /**
   * 帧率
   * @return fps
  **/
  public Integer getFps() {
    return fps;
  }

  public void setFps(Integer fps) {
    this.fps = fps;
  }

  public TryToGetSlotForms gameCmdParam(String gameCmdParam) {
    this.gameCmdParam = gameCmdParam;
    return this;
  }

   /**
   * 启动命令，透传至ISV用于启动游戏
   * @return gameCmdParam
  **/
  public String getGameCmdParam() {
    return gameCmdParam;
  }

  public void setGameCmdParam(String gameCmdParam) {
    this.gameCmdParam = gameCmdParam;
  }

  public TryToGetSlotForms startParam(TryToGetSlotFormsStartParam startParam) {
    this.startParam = startParam;
    return this;
  }

   /**
   * 游戏启动设置参数
   * @return startParam
  **/
  public TryToGetSlotFormsStartParam getStartParam() {
    return startParam;
  }

  public void setStartParam(TryToGetSlotFormsStartParam startParam) {
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
    TryToGetSlotForms tryToGetSlotForms = (TryToGetSlotForms) o;
    return Objects.equals(this.accountId, tryToGetSlotForms.accountId) &&
        Objects.equals(this.gameId, tryToGetSlotForms.gameId) &&
        Objects.equals(this.appKey, tryToGetSlotForms.appKey) &&
        Objects.equals(this.regionId, tryToGetSlotForms.regionId) &&
        Objects.equals(this.reConnect, tryToGetSlotForms.reConnect) &&
        Objects.equals(this.bizParam, tryToGetSlotForms.bizParam) &&
        Objects.equals(this.clientIp, tryToGetSlotForms.clientIp) &&
        Objects.equals(this.tags, tryToGetSlotForms.tags) &&
        Objects.equals(this.userLevel, tryToGetSlotForms.userLevel) &&
        Objects.equals(this.codec, tryToGetSlotForms.codec) &&
        Objects.equals(this.resolution, tryToGetSlotForms.resolution) &&
        Objects.equals(this.bitRate, tryToGetSlotForms.bitRate) &&
        Objects.equals(this.fps, tryToGetSlotForms.fps) &&
        Objects.equals(this.gameCmdParam, tryToGetSlotForms.gameCmdParam) &&
        Objects.equals(this.startParam, tryToGetSlotForms.startParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, appKey, regionId, reConnect, bizParam, clientIp, tags, userLevel, codec, resolution, bitRate, fps, gameCmdParam, startParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",reConnect: ").append(toIndentedString(reConnect));
    sb.append(",bizParam: ").append(toIndentedString(bizParam));
    sb.append(",clientIp: ").append(toIndentedString(clientIp));
    sb.append(",tags: ").append(toIndentedString(tags));
    sb.append(",userLevel: ").append(toIndentedString(userLevel));
    sb.append(",codec: ").append(toIndentedString(codec));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",bitRate: ").append(toIndentedString(bitRate));
    sb.append(",fps: ").append(toIndentedString(fps));
    sb.append(",gameCmdParam: ").append(toIndentedString(gameCmdParam));
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
