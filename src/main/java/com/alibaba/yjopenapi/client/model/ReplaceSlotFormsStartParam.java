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
 * ReplaceSlotFormsStartParam
 */
public class ReplaceSlotFormsStartParam implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long keepAlive = null;


  private String cloudInit = null;


  private String deviceResolution = null;


  private Integer deviceDpi = null;


  private String archiveUrl = null;


  private String gameInput = null;


  private String resolution = null;


  private Long keepDisconnectAlive = null;


  private String archiveId = null;


  private Long keepHoldAlive = null;


  private String appChannel = null;


  private Integer deviceDpr = null;


  private String scriptId = null;


  private String gameVersionId = null;


  private Integer bitRateSelfAdaption = null;


  private Long keepNoPlayAlive = null;


  private String ssaid = null;


  private String archiveMd5 = null;


  private String sysDeviceId = null;


  private String deviceModel = null;


  private String deviceBrand = null;


  public ReplaceSlotFormsStartParam keepAlive(Long keepAlive) {
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

  public ReplaceSlotFormsStartParam cloudInit(String cloudInit) {
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

  public ReplaceSlotFormsStartParam deviceResolution(String deviceResolution) {
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

  public ReplaceSlotFormsStartParam deviceDpi(Integer deviceDpi) {
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

  public ReplaceSlotFormsStartParam archiveUrl(String archiveUrl) {
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

  public ReplaceSlotFormsStartParam gameInput(String gameInput) {
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

  public ReplaceSlotFormsStartParam resolution(String resolution) {
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

  public ReplaceSlotFormsStartParam keepDisconnectAlive(Long keepDisconnectAlive) {
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

  public ReplaceSlotFormsStartParam archiveId(String archiveId) {
    this.archiveId = archiveId;
    return this;
  }

   /**
   * Get archiveId
   * @return archiveId
  **/
  public String getArchiveId() {
    return archiveId;
  }

  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  public ReplaceSlotFormsStartParam keepHoldAlive(Long keepHoldAlive) {
    this.keepHoldAlive = keepHoldAlive;
    return this;
  }

   /**
   * Get keepHoldAlive
   * @return keepHoldAlive
  **/
  public Long getKeepHoldAlive() {
    return keepHoldAlive;
  }

  public void setKeepHoldAlive(Long keepHoldAlive) {
    this.keepHoldAlive = keepHoldAlive;
  }

  public ReplaceSlotFormsStartParam appChannel(String appChannel) {
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

  public ReplaceSlotFormsStartParam deviceDpr(Integer deviceDpr) {
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

  public ReplaceSlotFormsStartParam scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  public String getScriptId() {
    return scriptId;
  }

  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  public ReplaceSlotFormsStartParam gameVersionId(String gameVersionId) {
    this.gameVersionId = gameVersionId;
    return this;
  }

   /**
   * Get gameVersionId
   * @return gameVersionId
  **/
  public String getGameVersionId() {
    return gameVersionId;
  }

  public void setGameVersionId(String gameVersionId) {
    this.gameVersionId = gameVersionId;
  }

  public ReplaceSlotFormsStartParam bitRateSelfAdaption(Integer bitRateSelfAdaption) {
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

  public ReplaceSlotFormsStartParam keepNoPlayAlive(Long keepNoPlayAlive) {
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

  public ReplaceSlotFormsStartParam ssaid(String ssaid) {
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

  public ReplaceSlotFormsStartParam archiveMd5(String archiveMd5) {
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

  public ReplaceSlotFormsStartParam sysDeviceId(String sysDeviceId) {
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

  public ReplaceSlotFormsStartParam deviceModel(String deviceModel) {
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

  public ReplaceSlotFormsStartParam deviceBrand(String deviceBrand) {
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
    ReplaceSlotFormsStartParam replaceSlotFormsStartParam = (ReplaceSlotFormsStartParam) o;
    return Objects.equals(this.keepAlive, replaceSlotFormsStartParam.keepAlive) &&
        Objects.equals(this.cloudInit, replaceSlotFormsStartParam.cloudInit) &&
        Objects.equals(this.deviceResolution, replaceSlotFormsStartParam.deviceResolution) &&
        Objects.equals(this.deviceDpi, replaceSlotFormsStartParam.deviceDpi) &&
        Objects.equals(this.archiveUrl, replaceSlotFormsStartParam.archiveUrl) &&
        Objects.equals(this.gameInput, replaceSlotFormsStartParam.gameInput) &&
        Objects.equals(this.resolution, replaceSlotFormsStartParam.resolution) &&
        Objects.equals(this.keepDisconnectAlive, replaceSlotFormsStartParam.keepDisconnectAlive) &&
        Objects.equals(this.archiveId, replaceSlotFormsStartParam.archiveId) &&
        Objects.equals(this.keepHoldAlive, replaceSlotFormsStartParam.keepHoldAlive) &&
        Objects.equals(this.appChannel, replaceSlotFormsStartParam.appChannel) &&
        Objects.equals(this.deviceDpr, replaceSlotFormsStartParam.deviceDpr) &&
        Objects.equals(this.scriptId, replaceSlotFormsStartParam.scriptId) &&
        Objects.equals(this.gameVersionId, replaceSlotFormsStartParam.gameVersionId) &&
        Objects.equals(this.bitRateSelfAdaption, replaceSlotFormsStartParam.bitRateSelfAdaption) &&
        Objects.equals(this.keepNoPlayAlive, replaceSlotFormsStartParam.keepNoPlayAlive) &&
        Objects.equals(this.ssaid, replaceSlotFormsStartParam.ssaid) &&
        Objects.equals(this.archiveMd5, replaceSlotFormsStartParam.archiveMd5) &&
        Objects.equals(this.sysDeviceId, replaceSlotFormsStartParam.sysDeviceId) &&
        Objects.equals(this.deviceModel, replaceSlotFormsStartParam.deviceModel) &&
        Objects.equals(this.deviceBrand, replaceSlotFormsStartParam.deviceBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepAlive, cloudInit, deviceResolution, deviceDpi, archiveUrl, gameInput, resolution, keepDisconnectAlive, archiveId, keepHoldAlive, appChannel, deviceDpr, scriptId, gameVersionId, bitRateSelfAdaption, keepNoPlayAlive, ssaid, archiveMd5, sysDeviceId, deviceModel, deviceBrand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceSlotFormsStartParam {");
    
    sb.append(",keepAlive: ").append(toIndentedString(keepAlive));
    sb.append(",cloudInit: ").append(toIndentedString(cloudInit));
    sb.append(",deviceResolution: ").append(toIndentedString(deviceResolution));
    sb.append(",deviceDpi: ").append(toIndentedString(deviceDpi));
    sb.append(",archiveUrl: ").append(toIndentedString(archiveUrl));
    sb.append(",gameInput: ").append(toIndentedString(gameInput));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",keepDisconnectAlive: ").append(toIndentedString(keepDisconnectAlive));
    sb.append(",archiveId: ").append(toIndentedString(archiveId));
    sb.append(",keepHoldAlive: ").append(toIndentedString(keepHoldAlive));
    sb.append(",appChannel: ").append(toIndentedString(appChannel));
    sb.append(",deviceDpr: ").append(toIndentedString(deviceDpr));
    sb.append(",scriptId: ").append(toIndentedString(scriptId));
    sb.append(",gameVersionId: ").append(toIndentedString(gameVersionId));
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
