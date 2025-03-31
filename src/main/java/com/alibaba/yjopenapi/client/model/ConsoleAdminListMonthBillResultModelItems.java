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
 * ConsoleAdminListMonthBillResultModelItems
 */
public class ConsoleAdminListMonthBillResultModelItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private String latestPaidTime = null;


  private String tenantName = null;


  private Long tenantId = null;


  private String billStatus = null;


  private String accountingPeriod = null;


  private String billOutgoingTime = null;


  private Long cashPayAmount = null;


  public ConsoleAdminListMonthBillResultModelItems latestPaidTime(String latestPaidTime) {
    this.latestPaidTime = latestPaidTime;
    return this;
  }

   /**
   * 到期还款日期
   * @return latestPaidTime
  **/
  public String getLatestPaidTime() {
    return latestPaidTime;
  }

  public void setLatestPaidTime(String latestPaidTime) {
    this.latestPaidTime = latestPaidTime;
  }

  public ConsoleAdminListMonthBillResultModelItems tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * 租户名称
   * @return tenantName
  **/
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public ConsoleAdminListMonthBillResultModelItems tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID
   * @return tenantId
  **/
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public ConsoleAdminListMonthBillResultModelItems billStatus(String billStatus) {
    this.billStatus = billStatus;
    return this;
  }

   /**
   * 账单状态
   * @return billStatus
  **/
  public String getBillStatus() {
    return billStatus;
  }

  public void setBillStatus(String billStatus) {
    this.billStatus = billStatus;
  }

  public ConsoleAdminListMonthBillResultModelItems accountingPeriod(String accountingPeriod) {
    this.accountingPeriod = accountingPeriod;
    return this;
  }

   /**
   * 账期
   * @return accountingPeriod
  **/
  public String getAccountingPeriod() {
    return accountingPeriod;
  }

  public void setAccountingPeriod(String accountingPeriod) {
    this.accountingPeriod = accountingPeriod;
  }

  public ConsoleAdminListMonthBillResultModelItems billOutgoingTime(String billOutgoingTime) {
    this.billOutgoingTime = billOutgoingTime;
    return this;
  }

   /**
   * 已出账的日期
   * @return billOutgoingTime
  **/
  public String getBillOutgoingTime() {
    return billOutgoingTime;
  }

  public void setBillOutgoingTime(String billOutgoingTime) {
    this.billOutgoingTime = billOutgoingTime;
  }

  public ConsoleAdminListMonthBillResultModelItems cashPayAmount(Long cashPayAmount) {
    this.cashPayAmount = cashPayAmount;
    return this;
  }

   /**
   * 消费金额
   * @return cashPayAmount
  **/
  public Long getCashPayAmount() {
    return cashPayAmount;
  }

  public void setCashPayAmount(Long cashPayAmount) {
    this.cashPayAmount = cashPayAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListMonthBillResultModelItems consoleAdminListMonthBillResultModelItems = (ConsoleAdminListMonthBillResultModelItems) o;
    return Objects.equals(this.latestPaidTime, consoleAdminListMonthBillResultModelItems.latestPaidTime) &&
        Objects.equals(this.tenantName, consoleAdminListMonthBillResultModelItems.tenantName) &&
        Objects.equals(this.tenantId, consoleAdminListMonthBillResultModelItems.tenantId) &&
        Objects.equals(this.billStatus, consoleAdminListMonthBillResultModelItems.billStatus) &&
        Objects.equals(this.accountingPeriod, consoleAdminListMonthBillResultModelItems.accountingPeriod) &&
        Objects.equals(this.billOutgoingTime, consoleAdminListMonthBillResultModelItems.billOutgoingTime) &&
        Objects.equals(this.cashPayAmount, consoleAdminListMonthBillResultModelItems.cashPayAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestPaidTime, tenantName, tenantId, billStatus, accountingPeriod, billOutgoingTime, cashPayAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListMonthBillResultModelItems {");
    
    sb.append(",latestPaidTime: ").append(toIndentedString(latestPaidTime));
    sb.append(",tenantName: ").append(toIndentedString(tenantName));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",billStatus: ").append(toIndentedString(billStatus));
    sb.append(",accountingPeriod: ").append(toIndentedString(accountingPeriod));
    sb.append(",billOutgoingTime: ").append(toIndentedString(billOutgoingTime));
    sb.append(",cashPayAmount: ").append(toIndentedString(cashPayAmount));
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
