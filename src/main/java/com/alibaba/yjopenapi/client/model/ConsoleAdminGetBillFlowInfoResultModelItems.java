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
 * ConsoleAdminGetBillFlowInfoResultModelItems
 */
public class ConsoleAdminGetBillFlowInfoResultModelItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long consumePeriodStartTime = null;


  private String totalUnclearAmount = null;


  private Long amount = null;


  private String orderId = null;


  private String billType = null;


  private String discountAmount = null;


  private Long actualTotalPayAmount = null;


  private String refundOrderId = null;


  private Long consumePeriodEndTime = null;


  private Long payAmount = null;


  private String tenantName = null;


  private String settlementStatus = null;


  private String voucherPayAmount = null;


  private String accountingPeriod = null;


  private String consumeType = null;


  private String commodityName = null;


  public ConsoleAdminGetBillFlowInfoResultModelItems consumePeriodStartTime(Long consumePeriodStartTime) {
    this.consumePeriodStartTime = consumePeriodStartTime;
    return this;
  }

   /**
   * Get consumePeriodStartTime
   * @return consumePeriodStartTime
  **/
  public Long getConsumePeriodStartTime() {
    return consumePeriodStartTime;
  }

  public void setConsumePeriodStartTime(Long consumePeriodStartTime) {
    this.consumePeriodStartTime = consumePeriodStartTime;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems totalUnclearAmount(String totalUnclearAmount) {
    this.totalUnclearAmount = totalUnclearAmount;
    return this;
  }

   /**
   * Get totalUnclearAmount
   * @return totalUnclearAmount
  **/
  public String getTotalUnclearAmount() {
    return totalUnclearAmount;
  }

  public void setTotalUnclearAmount(String totalUnclearAmount) {
    this.totalUnclearAmount = totalUnclearAmount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems billType(String billType) {
    this.billType = billType;
    return this;
  }

   /**
   * Get billType
   * @return billType
  **/
  public String getBillType() {
    return billType;
  }

  public void setBillType(String billType) {
    this.billType = billType;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems actualTotalPayAmount(Long actualTotalPayAmount) {
    this.actualTotalPayAmount = actualTotalPayAmount;
    return this;
  }

   /**
   * Get actualTotalPayAmount
   * @return actualTotalPayAmount
  **/
  public Long getActualTotalPayAmount() {
    return actualTotalPayAmount;
  }

  public void setActualTotalPayAmount(Long actualTotalPayAmount) {
    this.actualTotalPayAmount = actualTotalPayAmount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems refundOrderId(String refundOrderId) {
    this.refundOrderId = refundOrderId;
    return this;
  }

   /**
   * Get refundOrderId
   * @return refundOrderId
  **/
  public String getRefundOrderId() {
    return refundOrderId;
  }

  public void setRefundOrderId(String refundOrderId) {
    this.refundOrderId = refundOrderId;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems consumePeriodEndTime(Long consumePeriodEndTime) {
    this.consumePeriodEndTime = consumePeriodEndTime;
    return this;
  }

   /**
   * Get consumePeriodEndTime
   * @return consumePeriodEndTime
  **/
  public Long getConsumePeriodEndTime() {
    return consumePeriodEndTime;
  }

  public void setConsumePeriodEndTime(Long consumePeriodEndTime) {
    this.consumePeriodEndTime = consumePeriodEndTime;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems payAmount(Long payAmount) {
    this.payAmount = payAmount;
    return this;
  }

   /**
   * Get payAmount
   * @return payAmount
  **/
  public Long getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(Long payAmount) {
    this.payAmount = payAmount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems settlementStatus(String settlementStatus) {
    this.settlementStatus = settlementStatus;
    return this;
  }

   /**
   * Get settlementStatus
   * @return settlementStatus
  **/
  public String getSettlementStatus() {
    return settlementStatus;
  }

  public void setSettlementStatus(String settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems voucherPayAmount(String voucherPayAmount) {
    this.voucherPayAmount = voucherPayAmount;
    return this;
  }

   /**
   * Get voucherPayAmount
   * @return voucherPayAmount
  **/
  public String getVoucherPayAmount() {
    return voucherPayAmount;
  }

  public void setVoucherPayAmount(String voucherPayAmount) {
    this.voucherPayAmount = voucherPayAmount;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems accountingPeriod(String accountingPeriod) {
    this.accountingPeriod = accountingPeriod;
    return this;
  }

   /**
   * Get accountingPeriod
   * @return accountingPeriod
  **/
  public String getAccountingPeriod() {
    return accountingPeriod;
  }

  public void setAccountingPeriod(String accountingPeriod) {
    this.accountingPeriod = accountingPeriod;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems consumeType(String consumeType) {
    this.consumeType = consumeType;
    return this;
  }

   /**
   * Get consumeType
   * @return consumeType
  **/
  public String getConsumeType() {
    return consumeType;
  }

  public void setConsumeType(String consumeType) {
    this.consumeType = consumeType;
  }

  public ConsoleAdminGetBillFlowInfoResultModelItems commodityName(String commodityName) {
    this.commodityName = commodityName;
    return this;
  }

   /**
   * Get commodityName
   * @return commodityName
  **/
  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetBillFlowInfoResultModelItems consoleAdminGetBillFlowInfoResultModelItems = (ConsoleAdminGetBillFlowInfoResultModelItems) o;
    return Objects.equals(this.consumePeriodStartTime, consoleAdminGetBillFlowInfoResultModelItems.consumePeriodStartTime) &&
        Objects.equals(this.totalUnclearAmount, consoleAdminGetBillFlowInfoResultModelItems.totalUnclearAmount) &&
        Objects.equals(this.amount, consoleAdminGetBillFlowInfoResultModelItems.amount) &&
        Objects.equals(this.orderId, consoleAdminGetBillFlowInfoResultModelItems.orderId) &&
        Objects.equals(this.billType, consoleAdminGetBillFlowInfoResultModelItems.billType) &&
        Objects.equals(this.discountAmount, consoleAdminGetBillFlowInfoResultModelItems.discountAmount) &&
        Objects.equals(this.actualTotalPayAmount, consoleAdminGetBillFlowInfoResultModelItems.actualTotalPayAmount) &&
        Objects.equals(this.refundOrderId, consoleAdminGetBillFlowInfoResultModelItems.refundOrderId) &&
        Objects.equals(this.consumePeriodEndTime, consoleAdminGetBillFlowInfoResultModelItems.consumePeriodEndTime) &&
        Objects.equals(this.payAmount, consoleAdminGetBillFlowInfoResultModelItems.payAmount) &&
        Objects.equals(this.tenantName, consoleAdminGetBillFlowInfoResultModelItems.tenantName) &&
        Objects.equals(this.settlementStatus, consoleAdminGetBillFlowInfoResultModelItems.settlementStatus) &&
        Objects.equals(this.voucherPayAmount, consoleAdminGetBillFlowInfoResultModelItems.voucherPayAmount) &&
        Objects.equals(this.accountingPeriod, consoleAdminGetBillFlowInfoResultModelItems.accountingPeriod) &&
        Objects.equals(this.consumeType, consoleAdminGetBillFlowInfoResultModelItems.consumeType) &&
        Objects.equals(this.commodityName, consoleAdminGetBillFlowInfoResultModelItems.commodityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumePeriodStartTime, totalUnclearAmount, amount, orderId, billType, discountAmount, actualTotalPayAmount, refundOrderId, consumePeriodEndTime, payAmount, tenantName, settlementStatus, voucherPayAmount, accountingPeriod, consumeType, commodityName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetBillFlowInfoResultModelItems {");
    
    sb.append(",consumePeriodStartTime: ").append(toIndentedString(consumePeriodStartTime));
    sb.append(",totalUnclearAmount: ").append(toIndentedString(totalUnclearAmount));
    sb.append(",amount: ").append(toIndentedString(amount));
    sb.append(",orderId: ").append(toIndentedString(orderId));
    sb.append(",billType: ").append(toIndentedString(billType));
    sb.append(",discountAmount: ").append(toIndentedString(discountAmount));
    sb.append(",actualTotalPayAmount: ").append(toIndentedString(actualTotalPayAmount));
    sb.append(",refundOrderId: ").append(toIndentedString(refundOrderId));
    sb.append(",consumePeriodEndTime: ").append(toIndentedString(consumePeriodEndTime));
    sb.append(",payAmount: ").append(toIndentedString(payAmount));
    sb.append(",tenantName: ").append(toIndentedString(tenantName));
    sb.append(",settlementStatus: ").append(toIndentedString(settlementStatus));
    sb.append(",voucherPayAmount: ").append(toIndentedString(voucherPayAmount));
    sb.append(",accountingPeriod: ").append(toIndentedString(accountingPeriod));
    sb.append(",consumeType: ").append(toIndentedString(consumeType));
    sb.append(",commodityName: ").append(toIndentedString(commodityName));
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
