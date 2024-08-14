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
 * ConsoleAdminSubmitRefundForms
 */
public class ConsoleAdminSubmitRefundForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String commodityCode = null;


  private String instanceId = null;


  private String refundType = null;


  private String refundReason = null;


  private String refundReasonType = null;


  private String targetExpireTime = null;


  public ConsoleAdminSubmitRefundForms commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * 商品编码
   * @return commodityCode
  **/
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public ConsoleAdminSubmitRefundForms instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 实例ID
   * @return instanceId
  **/
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ConsoleAdminSubmitRefundForms refundType(String refundType) {
    this.refundType = refundType;
    return this;
  }

   /**
   * 退订类型
   * @return refundType
  **/
  public String getRefundType() {
    return refundType;
  }

  public void setRefundType(String refundType) {
    this.refundType = refundType;
  }

  public ConsoleAdminSubmitRefundForms refundReason(String refundReason) {
    this.refundReason = refundReason;
    return this;
  }

   /**
   * 退订理由
   * @return refundReason
  **/
  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }

  public ConsoleAdminSubmitRefundForms refundReasonType(String refundReasonType) {
    this.refundReasonType = refundReasonType;
    return this;
  }

   /**
   * 退订理由类型
   * @return refundReasonType
  **/
  public String getRefundReasonType() {
    return refundReasonType;
  }

  public void setRefundReasonType(String refundReasonType) {
    this.refundReasonType = refundReasonType;
  }

  public ConsoleAdminSubmitRefundForms targetExpireTime(String targetExpireTime) {
    this.targetExpireTime = targetExpireTime;
    return this;
  }

   /**
   * 退订后的过期时间 退续费场景使用
   * @return targetExpireTime
  **/
  public String getTargetExpireTime() {
    return targetExpireTime;
  }

  public void setTargetExpireTime(String targetExpireTime) {
    this.targetExpireTime = targetExpireTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminSubmitRefundForms consoleAdminSubmitRefundForms = (ConsoleAdminSubmitRefundForms) o;
    return Objects.equals(this.commodityCode, consoleAdminSubmitRefundForms.commodityCode) &&
        Objects.equals(this.instanceId, consoleAdminSubmitRefundForms.instanceId) &&
        Objects.equals(this.refundType, consoleAdminSubmitRefundForms.refundType) &&
        Objects.equals(this.refundReason, consoleAdminSubmitRefundForms.refundReason) &&
        Objects.equals(this.refundReasonType, consoleAdminSubmitRefundForms.refundReasonType) &&
        Objects.equals(this.targetExpireTime, consoleAdminSubmitRefundForms.targetExpireTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityCode, instanceId, refundType, refundReason, refundReasonType, targetExpireTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminSubmitRefundForms {");
    
    sb.append(",commodityCode: ").append(toIndentedString(commodityCode));
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",refundType: ").append(toIndentedString(refundType));
    sb.append(",refundReason: ").append(toIndentedString(refundReason));
    sb.append(",refundReasonType: ").append(toIndentedString(refundReasonType));
    sb.append(",targetExpireTime: ").append(toIndentedString(targetExpireTime));
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
