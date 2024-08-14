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
 * ConsoleAdminListMonthBillForms
 */
public class ConsoleAdminListMonthBillForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountingPeriodFrom = null;


  private String accountingPeriodTo = null;


  private String status = null;


  private Integer pageNumber = null;


  private Integer pageSize = null;


  public ConsoleAdminListMonthBillForms accountingPeriodFrom(String accountingPeriodFrom) {
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

  public ConsoleAdminListMonthBillForms accountingPeriodTo(String accountingPeriodTo) {
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

  public ConsoleAdminListMonthBillForms status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 状态
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsoleAdminListMonthBillForms pageNumber(Integer pageNumber) {
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

  public ConsoleAdminListMonthBillForms pageSize(Integer pageSize) {
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
    ConsoleAdminListMonthBillForms consoleAdminListMonthBillForms = (ConsoleAdminListMonthBillForms) o;
    return Objects.equals(this.accountingPeriodFrom, consoleAdminListMonthBillForms.accountingPeriodFrom) &&
        Objects.equals(this.accountingPeriodTo, consoleAdminListMonthBillForms.accountingPeriodTo) &&
        Objects.equals(this.status, consoleAdminListMonthBillForms.status) &&
        Objects.equals(this.pageNumber, consoleAdminListMonthBillForms.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminListMonthBillForms.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingPeriodFrom, accountingPeriodTo, status, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListMonthBillForms {");
    
    sb.append(",accountingPeriodFrom: ").append(toIndentedString(accountingPeriodFrom));
    sb.append(",accountingPeriodTo: ").append(toIndentedString(accountingPeriodTo));
    sb.append(",status: ").append(toIndentedString(status));
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
