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
 * TryToGetSlotsFormsRequestsStartParam
 */
public class TryToGetSlotsFormsRequestsStartParam implements Serializable {
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


  public TryToGetSlotsFormsRequestsStartParam scheduleUserLevels(String scheduleUserLevels) {
    this.scheduleUserLevels = scheduleUserLevels;
    return this;
  }

   /**
   * Get scheduleUserLevels
   * @return scheduleUserLevels
  **/
  public String getScheduleUserLevels() {
    return scheduleUserLevels;
  }

  public void setScheduleUserLevels(String scheduleUserLevels) {
    this.scheduleUserLevels = scheduleUserLevels;
  }

  public TryToGetSlotsFormsRequestsStartParam keepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
    return this;
  }

   /**
   * Get keepAlive
   * @return keepAlive
  **/
  public Long getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
  }

  public TryToGetSlotsFormsRequestsStartParam deviceResolution(String deviceResolution) {
    this.deviceResolution = deviceResolution;
    return this;
  }

   /**
   * Get deviceResolution
   * @return deviceResolution
  **/
  public String getDeviceResolution() {
    return deviceResolution;
  }

  public void setDeviceResolution(String deviceResolution) {
    this.deviceResolution = deviceResolution;
  }

  public TryToGetSlotsFormsRequestsStartParam deviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
    return this;
  }

   /**
   * Get deviceDpi
   * @return deviceDpi
  **/
  public Integer getDeviceDpi() {
    return deviceDpi;
  }

  public void setDeviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
  }

  public TryToGetSlotsFormsRequestsStartParam archiveUrl(String archiveUrl) {
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

  public TryToGetSlotsFormsRequestsStartParam gameInput(String gameInput) {
    this.gameInput = gameInput;
    return this;
  }

   /**
   * Get gameInput
   * @return gameInput
  **/
  public String getGameInput() {
    return gameInput;
  }

  public void setGameInput(String gameInput) {
    this.gameInput = gameInput;
  }

  public TryToGetSlotsFormsRequestsStartParam resolution(String resolution) {
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

  public TryToGetSlotsFormsRequestsStartParam keepDisconnectAlive(Long keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
    return this;
  }

   /**
   * Get keepDisconnectAlive
   * @return keepDisconnectAlive
  **/
  public Long getKeepDisconnectAlive() {
    return keepDisconnectAlive;
  }

  public void setKeepDisconnectAlive(Long keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
  }

  public TryToGetSlotsFormsRequestsStartParam appChannel(String appChannel) {
    this.appChannel = appChannel;
    return this;
  }

   /**
   * Get appChannel
   * @return appChannel
  **/
  public String getAppChannel() {
    return appChannel;
  }

  public void setAppChannel(String appChannel) {
    this.appChannel = appChannel;
  }

  public TryToGetSlotsFormsRequestsStartParam deviceDpr(Integer deviceDpr) {
    this.deviceDpr = deviceDpr;
    return this;
  }

   /**
   * Get deviceDpr
   * @return deviceDpr
  **/
  public Integer getDeviceDpr() {
    return deviceDpr;
  }

  public void setDeviceDpr(Integer deviceDpr) {
    this.deviceDpr = deviceDpr;
  }

  public TryToGetSlotsFormsRequestsStartParam cloudInit(String cloudInit) {
    this.cloudInit = cloudInit;
    return this;
  }

   /**
   * Get cloudInit
   * @return cloudInit
  **/
  public String getCloudInit() {
    return cloudInit;
  }

  public void setCloudInit(String cloudInit) {
    this.cloudInit = cloudInit;
  }

  public TryToGetSlotsFormsRequestsStartParam scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  public Integer getScriptId() {
    return scriptId;
  }

  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  public TryToGetSlotsFormsRequestsStartParam bitRateSelfAdaption(Integer bitRateSelfAdaption) {
    this.bitRateSelfAdaption = bitRateSelfAdaption;
    return this;
  }

   /**
   * Get bitRateSelfAdaption
   * @return bitRateSelfAdaption
  **/
  public Integer getBitRateSelfAdaption() {
    return bitRateSelfAdaption;
  }

  public void setBitRateSelfAdaption(Integer bitRateSelfAdaption) {
    this.bitRateSelfAdaption = bitRateSelfAdaption;
  }

  public TryToGetSlotsFormsRequestsStartParam keepNoPlayAlive(Long keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
    return this;
  }

   /**
   * Get keepNoPlayAlive
   * @return keepNoPlayAlive
  **/
  public Long getKeepNoPlayAlive() {
    return keepNoPlayAlive;
  }

  public void setKeepNoPlayAlive(Long keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
  }

  public TryToGetSlotsFormsRequestsStartParam ssaid(String ssaid) {
    this.ssaid = ssaid;
    return this;
  }

   /**
   * Get ssaid
   * @return ssaid
  **/
  public String getSsaid() {
    return ssaid;
  }

  public void setSsaid(String ssaid) {
    this.ssaid = ssaid;
  }

  public TryToGetSlotsFormsRequestsStartParam archiveMd5(String archiveMd5) {
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

  public TryToGetSlotsFormsRequestsStartParam sysDeviceId(String sysDeviceId) {
    this.sysDeviceId = sysDeviceId;
    return this;
  }

   /**
   * Get sysDeviceId
   * @return sysDeviceId
  **/
  public String getSysDeviceId() {
    return sysDeviceId;
  }

  public void setSysDeviceId(String sysDeviceId) {
    this.sysDeviceId = sysDeviceId;
  }

  public TryToGetSlotsFormsRequestsStartParam deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Get deviceModel
   * @return deviceModel
  **/
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public TryToGetSlotsFormsRequestsStartParam deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

   /**
   * Get deviceBrand
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
    TryToGetSlotsFormsRequestsStartParam tryToGetSlotsFormsRequestsStartParam = (TryToGetSlotsFormsRequestsStartParam) o;
    return Objects.equals(this.scheduleUserLevels, tryToGetSlotsFormsRequestsStartParam.scheduleUserLevels) &&
        Objects.equals(this.keepAlive, tryToGetSlotsFormsRequestsStartParam.keepAlive) &&
        Objects.equals(this.deviceResolution, tryToGetSlotsFormsRequestsStartParam.deviceResolution) &&
        Objects.equals(this.deviceDpi, tryToGetSlotsFormsRequestsStartParam.deviceDpi) &&
        Objects.equals(this.archiveUrl, tryToGetSlotsFormsRequestsStartParam.archiveUrl) &&
        Objects.equals(this.gameInput, tryToGetSlotsFormsRequestsStartParam.gameInput) &&
        Objects.equals(this.resolution, tryToGetSlotsFormsRequestsStartParam.resolution) &&
        Objects.equals(this.keepDisconnectAlive, tryToGetSlotsFormsRequestsStartParam.keepDisconnectAlive) &&
        Objects.equals(this.appChannel, tryToGetSlotsFormsRequestsStartParam.appChannel) &&
        Objects.equals(this.deviceDpr, tryToGetSlotsFormsRequestsStartParam.deviceDpr) &&
        Objects.equals(this.cloudInit, tryToGetSlotsFormsRequestsStartParam.cloudInit) &&
        Objects.equals(this.scriptId, tryToGetSlotsFormsRequestsStartParam.scriptId) &&
        Objects.equals(this.bitRateSelfAdaption, tryToGetSlotsFormsRequestsStartParam.bitRateSelfAdaption) &&
        Objects.equals(this.keepNoPlayAlive, tryToGetSlotsFormsRequestsStartParam.keepNoPlayAlive) &&
        Objects.equals(this.ssaid, tryToGetSlotsFormsRequestsStartParam.ssaid) &&
        Objects.equals(this.archiveMd5, tryToGetSlotsFormsRequestsStartParam.archiveMd5) &&
        Objects.equals(this.sysDeviceId, tryToGetSlotsFormsRequestsStartParam.sysDeviceId) &&
        Objects.equals(this.deviceModel, tryToGetSlotsFormsRequestsStartParam.deviceModel) &&
        Objects.equals(this.deviceBrand, tryToGetSlotsFormsRequestsStartParam.deviceBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleUserLevels, keepAlive, deviceResolution, deviceDpi, archiveUrl, gameInput, resolution, keepDisconnectAlive, appChannel, deviceDpr, cloudInit, scriptId, bitRateSelfAdaption, keepNoPlayAlive, ssaid, archiveMd5, sysDeviceId, deviceModel, deviceBrand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotsFormsRequestsStartParam {");
    
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
