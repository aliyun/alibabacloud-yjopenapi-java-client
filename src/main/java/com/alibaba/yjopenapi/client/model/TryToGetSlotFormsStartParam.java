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
 * TryToGetSlotFormsStartParam
 */
public class TryToGetSlotFormsStartParam implements Serializable {
  private static final long serialVersionUID = 1L;

  private String scheduleUserLevels = null;


  private Long keepAlive = null;


  private String deviceResolution = null;


  private Integer deviceDpi = null;


  private String archiveUrl = null;


  private String gameInput = null;


  private String resolution = null;


  private Long keepDisconnectAlive = null;


  private String appChannel = null;


  private Integer deviceDpr = null;


  private String cloudInit = null;


  private Integer scriptId = null;


  private Integer bitRateSelfAdaption = null;


  private Long keepNoPlayAlive = null;


  private String ssaid = null;


  private String archiveMd5 = null;


  private String sysDeviceId = null;


  private String deviceModel = null;


  private String deviceBrand = null;


  public TryToGetSlotFormsStartParam scheduleUserLevels(String scheduleUserLevels) {
    this.scheduleUserLevels = scheduleUserLevels;
    return this;
  }

   /**
   * 游戏调度实例等级
   * @return scheduleUserLevels
  **/
  public String getScheduleUserLevels() {
    return scheduleUserLevels;
  }

  public void setScheduleUserLevels(String scheduleUserLevels) {
    this.scheduleUserLevels = scheduleUserLevels;
  }

  public TryToGetSlotFormsStartParam keepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
    return this;
  }

   /**
   * 控制游戏运行时长
   * @return keepAlive
  **/
  public Long getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
  }

  public TryToGetSlotFormsStartParam deviceResolution(String deviceResolution) {
    this.deviceResolution = deviceResolution;
    return this;
  }

   /**
   * 设备分辨率
   * @return deviceResolution
  **/
  public String getDeviceResolution() {
    return deviceResolution;
  }

  public void setDeviceResolution(String deviceResolution) {
    this.deviceResolution = deviceResolution;
  }

  public TryToGetSlotFormsStartParam deviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
    return this;
  }

   /**
   * deviceDpi
   * @return deviceDpi
  **/
  public Integer getDeviceDpi() {
    return deviceDpi;
  }

  public void setDeviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
  }

  public TryToGetSlotFormsStartParam archiveUrl(String archiveUrl) {
    this.archiveUrl = archiveUrl;
    return this;
  }

   /**
   * Get archiveUrl
   * @return archiveUrl
  **/
  public String getArchiveUrl() {
    return archiveUrl;
  }

  public void setArchiveUrl(String archiveUrl) {
    this.archiveUrl = archiveUrl;
  }

  public TryToGetSlotFormsStartParam gameInput(String gameInput) {
    this.gameInput = gameInput;
    return this;
  }

   /**
   * 手游输入法控制
   * @return gameInput
  **/
  public String getGameInput() {
    return gameInput;
  }

  public void setGameInput(String gameInput) {
    this.gameInput = gameInput;
  }

  public TryToGetSlotFormsStartParam resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * 启动待缩放分辨率
   * @return resolution
  **/
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public TryToGetSlotFormsStartParam keepDisconnectAlive(Long keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
    return this;
  }

   /**
   * 游戏中设备掉线后会话保活时长
   * @return keepDisconnectAlive
  **/
  public Long getKeepDisconnectAlive() {
    return keepDisconnectAlive;
  }

  public void setKeepDisconnectAlive(Long keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
  }

  public TryToGetSlotFormsStartParam appChannel(String appChannel) {
    this.appChannel = appChannel;
    return this;
  }

   /**
   * 应用渠道
   * @return appChannel
  **/
  public String getAppChannel() {
    return appChannel;
  }

  public void setAppChannel(String appChannel) {
    this.appChannel = appChannel;
  }

  public TryToGetSlotFormsStartParam deviceDpr(Integer deviceDpr) {
    this.deviceDpr = deviceDpr;
    return this;
  }

   /**
   * 设备DPR
   * @return deviceDpr
  **/
  public Integer getDeviceDpr() {
    return deviceDpr;
  }

  public void setDeviceDpr(Integer deviceDpr) {
    this.deviceDpr = deviceDpr;
  }

  public TryToGetSlotFormsStartParam cloudInit(String cloudInit) {
    this.cloudInit = cloudInit;
    return this;
  }

   /**
   * 游戏初始化路径
   * @return cloudInit
  **/
  public String getCloudInit() {
    return cloudInit;
  }

  public void setCloudInit(String cloudInit) {
    this.cloudInit = cloudInit;
  }

  public TryToGetSlotFormsStartParam scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * 游戏脚本id
   * @return scriptId
  **/
  public Integer getScriptId() {
    return scriptId;
  }

  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  public TryToGetSlotFormsStartParam bitRateSelfAdaption(Integer bitRateSelfAdaption) {
    this.bitRateSelfAdaption = bitRateSelfAdaption;
    return this;
  }

   /**
   * 码率自适应开关
   * @return bitRateSelfAdaption
  **/
  public Integer getBitRateSelfAdaption() {
    return bitRateSelfAdaption;
  }

  public void setBitRateSelfAdaption(Integer bitRateSelfAdaption) {
    this.bitRateSelfAdaption = bitRateSelfAdaption;
  }

  public TryToGetSlotFormsStartParam keepNoPlayAlive(Long keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
    return this;
  }

   /**
   * 游戏中无操作时会话保活时长
   * @return keepNoPlayAlive
  **/
  public Long getKeepNoPlayAlive() {
    return keepNoPlayAlive;
  }

  public void setKeepNoPlayAlive(Long keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
  }

  public TryToGetSlotFormsStartParam ssaid(String ssaid) {
    this.ssaid = ssaid;
    return this;
  }

   /**
   * 设备号Android
   * @return ssaid
  **/
  public String getSsaid() {
    return ssaid;
  }

  public void setSsaid(String ssaid) {
    this.ssaid = ssaid;
  }

  public TryToGetSlotFormsStartParam archiveMd5(String archiveMd5) {
    this.archiveMd5 = archiveMd5;
    return this;
  }

   /**
   * Get archiveMd5
   * @return archiveMd5
  **/
  public String getArchiveMd5() {
    return archiveMd5;
  }

  public void setArchiveMd5(String archiveMd5) {
    this.archiveMd5 = archiveMd5;
  }

  public TryToGetSlotFormsStartParam sysDeviceId(String sysDeviceId) {
    this.sysDeviceId = sysDeviceId;
    return this;
  }

   /**
   * 设备id
   * @return sysDeviceId
  **/
  public String getSysDeviceId() {
    return sysDeviceId;
  }

  public void setSysDeviceId(String sysDeviceId) {
    this.sysDeviceId = sysDeviceId;
  }

  public TryToGetSlotFormsStartParam deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * 设备型号
   * @return deviceModel
  **/
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public TryToGetSlotFormsStartParam deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

   /**
   * 设备品牌
   * @return deviceBrand
  **/
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotFormsStartParam tryToGetSlotFormsStartParam = (TryToGetSlotFormsStartParam) o;
    return Objects.equals(this.scheduleUserLevels, tryToGetSlotFormsStartParam.scheduleUserLevels) &&
        Objects.equals(this.keepAlive, tryToGetSlotFormsStartParam.keepAlive) &&
        Objects.equals(this.deviceResolution, tryToGetSlotFormsStartParam.deviceResolution) &&
        Objects.equals(this.deviceDpi, tryToGetSlotFormsStartParam.deviceDpi) &&
        Objects.equals(this.archiveUrl, tryToGetSlotFormsStartParam.archiveUrl) &&
        Objects.equals(this.gameInput, tryToGetSlotFormsStartParam.gameInput) &&
        Objects.equals(this.resolution, tryToGetSlotFormsStartParam.resolution) &&
        Objects.equals(this.keepDisconnectAlive, tryToGetSlotFormsStartParam.keepDisconnectAlive) &&
        Objects.equals(this.appChannel, tryToGetSlotFormsStartParam.appChannel) &&
        Objects.equals(this.deviceDpr, tryToGetSlotFormsStartParam.deviceDpr) &&
        Objects.equals(this.cloudInit, tryToGetSlotFormsStartParam.cloudInit) &&
        Objects.equals(this.scriptId, tryToGetSlotFormsStartParam.scriptId) &&
        Objects.equals(this.bitRateSelfAdaption, tryToGetSlotFormsStartParam.bitRateSelfAdaption) &&
        Objects.equals(this.keepNoPlayAlive, tryToGetSlotFormsStartParam.keepNoPlayAlive) &&
        Objects.equals(this.ssaid, tryToGetSlotFormsStartParam.ssaid) &&
        Objects.equals(this.archiveMd5, tryToGetSlotFormsStartParam.archiveMd5) &&
        Objects.equals(this.sysDeviceId, tryToGetSlotFormsStartParam.sysDeviceId) &&
        Objects.equals(this.deviceModel, tryToGetSlotFormsStartParam.deviceModel) &&
        Objects.equals(this.deviceBrand, tryToGetSlotFormsStartParam.deviceBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleUserLevels, keepAlive, deviceResolution, deviceDpi, archiveUrl, gameInput, resolution, keepDisconnectAlive, appChannel, deviceDpr, cloudInit, scriptId, bitRateSelfAdaption, keepNoPlayAlive, ssaid, archiveMd5, sysDeviceId, deviceModel, deviceBrand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotFormsStartParam {");
    
    sb.append(",scheduleUserLevels: ").append(toIndentedString(scheduleUserLevels));
    sb.append(",keepAlive: ").append(toIndentedString(keepAlive));
    sb.append(",deviceResolution: ").append(toIndentedString(deviceResolution));
    sb.append(",deviceDpi: ").append(toIndentedString(deviceDpi));
    sb.append(",archiveUrl: ").append(toIndentedString(archiveUrl));
    sb.append(",gameInput: ").append(toIndentedString(gameInput));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",keepDisconnectAlive: ").append(toIndentedString(keepDisconnectAlive));
    sb.append(",appChannel: ").append(toIndentedString(appChannel));
    sb.append(",deviceDpr: ").append(toIndentedString(deviceDpr));
    sb.append(",cloudInit: ").append(toIndentedString(cloudInit));
    sb.append(",scriptId: ").append(toIndentedString(scriptId));
    sb.append(",bitRateSelfAdaption: ").append(toIndentedString(bitRateSelfAdaption));
    sb.append(",keepNoPlayAlive: ").append(toIndentedString(keepNoPlayAlive));
    sb.append(",ssaid: ").append(toIndentedString(ssaid));
    sb.append(",archiveMd5: ").append(toIndentedString(archiveMd5));
    sb.append(",sysDeviceId: ").append(toIndentedString(sysDeviceId));
    sb.append(",deviceModel: ").append(toIndentedString(deviceModel));
    sb.append(",deviceBrand: ").append(toIndentedString(deviceBrand));
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
