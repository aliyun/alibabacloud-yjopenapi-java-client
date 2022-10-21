/*
 * 
 * YuanJing OpenAPI SDK
 *
 * OpenAPI spec version: 1.0.20221015-beta
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

  private String resolution = null;


  private String pictureQuality = null;


  private Integer keepAlive = null;


  private Integer keepDisconnectAlive = null;


  private Integer keepNoPlayAlive = null;


  private String deviceBrand = null;


  private String deviceModel = null;


  private Integer deviceDpi = null;


  private Integer deviceDpr = null;


  private String deviceResolution = null;


  private String gameInput = null;


  private Integer scriptId = null;


  private Integer bitRateSelfAdaption = null;


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

  public TryToGetSlotFormsStartParam pictureQuality(String pictureQuality) {
    this.pictureQuality = pictureQuality;
    return this;
  }

   /**
   * 画质
   * @return pictureQuality
  **/
  public String getPictureQuality() {
    return pictureQuality;
  }

  public void setPictureQuality(String pictureQuality) {
    this.pictureQuality = pictureQuality;
  }

  public TryToGetSlotFormsStartParam keepAlive(Integer keepAlive) {
    this.keepAlive = keepAlive;
    return this;
  }

   /**
   * 控制游戏运行时长
   * @return keepAlive
  **/
  public Integer getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(Integer keepAlive) {
    this.keepAlive = keepAlive;
  }

  public TryToGetSlotFormsStartParam keepDisconnectAlive(Integer keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
    return this;
  }

   /**
   * 游戏中设备掉线后会话保活时长
   * @return keepDisconnectAlive
  **/
  public Integer getKeepDisconnectAlive() {
    return keepDisconnectAlive;
  }

  public void setKeepDisconnectAlive(Integer keepDisconnectAlive) {
    this.keepDisconnectAlive = keepDisconnectAlive;
  }

  public TryToGetSlotFormsStartParam keepNoPlayAlive(Integer keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
    return this;
  }

   /**
   * 游戏中无操作时会话保活时长
   * @return keepNoPlayAlive
  **/
  public Integer getKeepNoPlayAlive() {
    return keepNoPlayAlive;
  }

  public void setKeepNoPlayAlive(Integer keepNoPlayAlive) {
    this.keepNoPlayAlive = keepNoPlayAlive;
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

  public TryToGetSlotFormsStartParam deviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
    return this;
  }

   /**
   * 设备DPI
   * @return deviceDpi
  **/
  public Integer getDeviceDpi() {
    return deviceDpi;
  }

  public void setDeviceDpi(Integer deviceDpi) {
    this.deviceDpi = deviceDpi;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotFormsStartParam tryToGetSlotFormsStartParam = (TryToGetSlotFormsStartParam) o;
    return Objects.equals(this.resolution, tryToGetSlotFormsStartParam.resolution) &&
        Objects.equals(this.pictureQuality, tryToGetSlotFormsStartParam.pictureQuality) &&
        Objects.equals(this.keepAlive, tryToGetSlotFormsStartParam.keepAlive) &&
        Objects.equals(this.keepDisconnectAlive, tryToGetSlotFormsStartParam.keepDisconnectAlive) &&
        Objects.equals(this.keepNoPlayAlive, tryToGetSlotFormsStartParam.keepNoPlayAlive) &&
        Objects.equals(this.deviceBrand, tryToGetSlotFormsStartParam.deviceBrand) &&
        Objects.equals(this.deviceModel, tryToGetSlotFormsStartParam.deviceModel) &&
        Objects.equals(this.deviceDpi, tryToGetSlotFormsStartParam.deviceDpi) &&
        Objects.equals(this.deviceDpr, tryToGetSlotFormsStartParam.deviceDpr) &&
        Objects.equals(this.deviceResolution, tryToGetSlotFormsStartParam.deviceResolution) &&
        Objects.equals(this.gameInput, tryToGetSlotFormsStartParam.gameInput) &&
        Objects.equals(this.scriptId, tryToGetSlotFormsStartParam.scriptId) &&
        Objects.equals(this.bitRateSelfAdaption, tryToGetSlotFormsStartParam.bitRateSelfAdaption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, pictureQuality, keepAlive, keepDisconnectAlive, keepNoPlayAlive, deviceBrand, deviceModel, deviceDpi, deviceDpr, deviceResolution, gameInput, scriptId, bitRateSelfAdaption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotFormsStartParam {");
    
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",pictureQuality: ").append(toIndentedString(pictureQuality));
    sb.append(",keepAlive: ").append(toIndentedString(keepAlive));
    sb.append(",keepDisconnectAlive: ").append(toIndentedString(keepDisconnectAlive));
    sb.append(",keepNoPlayAlive: ").append(toIndentedString(keepNoPlayAlive));
    sb.append(",deviceBrand: ").append(toIndentedString(deviceBrand));
    sb.append(",deviceModel: ").append(toIndentedString(deviceModel));
    sb.append(",deviceDpi: ").append(toIndentedString(deviceDpi));
    sb.append(",deviceDpr: ").append(toIndentedString(deviceDpr));
    sb.append(",deviceResolution: ").append(toIndentedString(deviceResolution));
    sb.append(",gameInput: ").append(toIndentedString(gameInput));
    sb.append(",scriptId: ").append(toIndentedString(scriptId));
    sb.append(",bitRateSelfAdaption: ").append(toIndentedString(bitRateSelfAdaption));
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
