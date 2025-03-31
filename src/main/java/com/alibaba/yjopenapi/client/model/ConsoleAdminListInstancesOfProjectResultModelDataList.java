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
 * ConsoleAdminListInstancesOfProjectResultModelDataList
 */
public class ConsoleAdminListInstancesOfProjectResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String commoditySpecificationCnName = null;


  private String bandwidthChargeType = null;


  private Integer effectiveTime = null;


  private String platformType = null;


  private String paymentType = null;


  private String token = null;


  private Integer expireTime = null;


  private String commodityInstanceName = null;


  private String commodityInstanceId = null;


  private String region = null;


  private String projectName = null;


  private String projectId = null;


  private String containerCount = null;


  private String status = null;


  private String tradeChannel = null;


  public ConsoleAdminListInstancesOfProjectResultModelDataList commoditySpecificationCnName(String commoditySpecificationCnName) {
    this.commoditySpecificationCnName = commoditySpecificationCnName;
    return this;
  }

   /**
   * Get commoditySpecificationCnName
   * @return commoditySpecificationCnName
  **/
  public String getCommoditySpecificationCnName() {
    return commoditySpecificationCnName;
  }

  public void setCommoditySpecificationCnName(String commoditySpecificationCnName) {
    this.commoditySpecificationCnName = commoditySpecificationCnName;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList bandwidthChargeType(String bandwidthChargeType) {
    this.bandwidthChargeType = bandwidthChargeType;
    return this;
  }

   /**
   * Get bandwidthChargeType
   * @return bandwidthChargeType
  **/
  public String getBandwidthChargeType() {
    return bandwidthChargeType;
  }

  public void setBandwidthChargeType(String bandwidthChargeType) {
    this.bandwidthChargeType = bandwidthChargeType;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList effectiveTime(Integer effectiveTime) {
    this.effectiveTime = effectiveTime;
    return this;
  }

   /**
   * Get effectiveTime
   * @return effectiveTime
  **/
  public Integer getEffectiveTime() {
    return effectiveTime;
  }

  public void setEffectiveTime(Integer effectiveTime) {
    this.effectiveTime = effectiveTime;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList expireTime(Integer expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Get expireTime
   * @return expireTime
  **/
  public Integer getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList commodityInstanceName(String commodityInstanceName) {
    this.commodityInstanceName = commodityInstanceName;
    return this;
  }

   /**
   * Get commodityInstanceName
   * @return commodityInstanceName
  **/
  public String getCommodityInstanceName() {
    return commodityInstanceName;
  }

  public void setCommodityInstanceName(String commodityInstanceName) {
    this.commodityInstanceName = commodityInstanceName;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList commodityInstanceId(String commodityInstanceId) {
    this.commodityInstanceId = commodityInstanceId;
    return this;
  }

   /**
   * Get commodityInstanceId
   * @return commodityInstanceId
  **/
  public String getCommodityInstanceId() {
    return commodityInstanceId;
  }

  public void setCommodityInstanceId(String commodityInstanceId) {
    this.commodityInstanceId = commodityInstanceId;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList containerCount(String containerCount) {
    this.containerCount = containerCount;
    return this;
  }

   /**
   * Get containerCount
   * @return containerCount
  **/
  public String getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(String containerCount) {
    this.containerCount = containerCount;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsoleAdminListInstancesOfProjectResultModelDataList tradeChannel(String tradeChannel) {
    this.tradeChannel = tradeChannel;
    return this;
  }

   /**
   * Get tradeChannel
   * @return tradeChannel
  **/
  public String getTradeChannel() {
    return tradeChannel;
  }

  public void setTradeChannel(String tradeChannel) {
    this.tradeChannel = tradeChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListInstancesOfProjectResultModelDataList consoleAdminListInstancesOfProjectResultModelDataList = (ConsoleAdminListInstancesOfProjectResultModelDataList) o;
    return Objects.equals(this.commoditySpecificationCnName, consoleAdminListInstancesOfProjectResultModelDataList.commoditySpecificationCnName) &&
        Objects.equals(this.bandwidthChargeType, consoleAdminListInstancesOfProjectResultModelDataList.bandwidthChargeType) &&
        Objects.equals(this.effectiveTime, consoleAdminListInstancesOfProjectResultModelDataList.effectiveTime) &&
        Objects.equals(this.platformType, consoleAdminListInstancesOfProjectResultModelDataList.platformType) &&
        Objects.equals(this.paymentType, consoleAdminListInstancesOfProjectResultModelDataList.paymentType) &&
        Objects.equals(this.token, consoleAdminListInstancesOfProjectResultModelDataList.token) &&
        Objects.equals(this.expireTime, consoleAdminListInstancesOfProjectResultModelDataList.expireTime) &&
        Objects.equals(this.commodityInstanceName, consoleAdminListInstancesOfProjectResultModelDataList.commodityInstanceName) &&
        Objects.equals(this.commodityInstanceId, consoleAdminListInstancesOfProjectResultModelDataList.commodityInstanceId) &&
        Objects.equals(this.region, consoleAdminListInstancesOfProjectResultModelDataList.region) &&
        Objects.equals(this.projectName, consoleAdminListInstancesOfProjectResultModelDataList.projectName) &&
        Objects.equals(this.projectId, consoleAdminListInstancesOfProjectResultModelDataList.projectId) &&
        Objects.equals(this.containerCount, consoleAdminListInstancesOfProjectResultModelDataList.containerCount) &&
        Objects.equals(this.status, consoleAdminListInstancesOfProjectResultModelDataList.status) &&
        Objects.equals(this.tradeChannel, consoleAdminListInstancesOfProjectResultModelDataList.tradeChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commoditySpecificationCnName, bandwidthChargeType, effectiveTime, platformType, paymentType, token, expireTime, commodityInstanceName, commodityInstanceId, region, projectName, projectId, containerCount, status, tradeChannel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListInstancesOfProjectResultModelDataList {");
    
    sb.append(",commoditySpecificationCnName: ").append(toIndentedString(commoditySpecificationCnName));
    sb.append(",bandwidthChargeType: ").append(toIndentedString(bandwidthChargeType));
    sb.append(",effectiveTime: ").append(toIndentedString(effectiveTime));
    sb.append(",platformType: ").append(toIndentedString(platformType));
    sb.append(",paymentType: ").append(toIndentedString(paymentType));
    sb.append(",token: ").append(toIndentedString(token));
    sb.append(",expireTime: ").append(toIndentedString(expireTime));
    sb.append(",commodityInstanceName: ").append(toIndentedString(commodityInstanceName));
    sb.append(",commodityInstanceId: ").append(toIndentedString(commodityInstanceId));
    sb.append(",region: ").append(toIndentedString(region));
    sb.append(",projectName: ").append(toIndentedString(projectName));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",containerCount: ").append(toIndentedString(containerCount));
    sb.append(",status: ").append(toIndentedString(status));
    sb.append(",tradeChannel: ").append(toIndentedString(tradeChannel));
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
