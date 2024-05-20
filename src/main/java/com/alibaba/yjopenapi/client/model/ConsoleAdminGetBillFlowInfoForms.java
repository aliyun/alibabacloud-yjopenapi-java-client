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
 * ConsoleAdminGetBillFlowInfoForms
 */
public class ConsoleAdminGetBillFlowInfoForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountingPeriodFrom = null;


  private String accountingPeriodTo = null;


  private String commodityCode = null;


  private String tenantId = null;


  private String orderId = null;


  private String status = null;


  private String consumeType = null;


  private String billType = null;


  private Integer pageNumber = null;


  private Integer pageSize = null;


  public ConsoleAdminGetBillFlowInfoForms accountingPeriodFrom(String accountingPeriodFrom) {
    this.accountingPeriodFrom = accountingPeriodFrom;
    return this;
  }

   /**
   * Get accountingPeriodFrom
   * @return accountingPeriodFrom
  **/
  public String getAccountingPeriodFrom() {
    return accountingPeriodFrom;
  }

  public void setAccountingPeriodFrom(String accountingPeriodFrom) {
    this.accountingPeriodFrom = accountingPeriodFrom;
  }

  public ConsoleAdminGetBillFlowInfoForms accountingPeriodTo(String accountingPeriodTo) {
    this.accountingPeriodTo = accountingPeriodTo;
    return this;
  }

   /**
   * Get accountingPeriodTo
   * @return accountingPeriodTo
  **/
  public String getAccountingPeriodTo() {
    return accountingPeriodTo;
  }

  public void setAccountingPeriodTo(String accountingPeriodTo) {
    this.accountingPeriodTo = accountingPeriodTo;
  }

  public ConsoleAdminGetBillFlowInfoForms commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * Get commodityCode
   * @return commodityCode
  **/
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public ConsoleAdminGetBillFlowInfoForms tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ConsoleAdminGetBillFlowInfoForms orderId(String orderId) {
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

  public ConsoleAdminGetBillFlowInfoForms status(String status) {
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

  public ConsoleAdminGetBillFlowInfoForms consumeType(String consumeType) {
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

  public ConsoleAdminGetBillFlowInfoForms billType(String billType) {
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

  public ConsoleAdminGetBillFlowInfoForms pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConsoleAdminGetBillFlowInfoForms pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetBillFlowInfoForms consoleAdminGetBillFlowInfoForms = (ConsoleAdminGetBillFlowInfoForms) o;
    return Objects.equals(this.accountingPeriodFrom, consoleAdminGetBillFlowInfoForms.accountingPeriodFrom) &&
        Objects.equals(this.accountingPeriodTo, consoleAdminGetBillFlowInfoForms.accountingPeriodTo) &&
        Objects.equals(this.commodityCode, consoleAdminGetBillFlowInfoForms.commodityCode) &&
        Objects.equals(this.tenantId, consoleAdminGetBillFlowInfoForms.tenantId) &&
        Objects.equals(this.orderId, consoleAdminGetBillFlowInfoForms.orderId) &&
        Objects.equals(this.status, consoleAdminGetBillFlowInfoForms.status) &&
        Objects.equals(this.consumeType, consoleAdminGetBillFlowInfoForms.consumeType) &&
        Objects.equals(this.billType, consoleAdminGetBillFlowInfoForms.billType) &&
        Objects.equals(this.pageNumber, consoleAdminGetBillFlowInfoForms.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminGetBillFlowInfoForms.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingPeriodFrom, accountingPeriodTo, commodityCode, tenantId, orderId, status, consumeType, billType, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetBillFlowInfoForms {");
    
    sb.append(",accountingPeriodFrom: ").append(toIndentedString(accountingPeriodFrom));
    sb.append(",accountingPeriodTo: ").append(toIndentedString(accountingPeriodTo));
    sb.append(",commodityCode: ").append(toIndentedString(commodityCode));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",orderId: ").append(toIndentedString(orderId));
    sb.append(",status: ").append(toIndentedString(status));
    sb.append(",consumeType: ").append(toIndentedString(consumeType));
    sb.append(",billType: ").append(toIndentedString(billType));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
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
