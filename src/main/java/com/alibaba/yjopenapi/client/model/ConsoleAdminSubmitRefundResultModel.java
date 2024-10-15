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
 * ConsoleAdminSubmitRefundResultModel
 */
public class ConsoleAdminSubmitRefundResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String refundOrderId = null;


  private Boolean submitSuccess = null;


  public ConsoleAdminSubmitRefundResultModel refundOrderId(String refundOrderId) {
    this.refundOrderId = refundOrderId;
    return this;
  }

   /**
   * refundOrderId
   * @return refundOrderId
  **/
  public String getRefundOrderId() {
    return refundOrderId;
  }

  public void setRefundOrderId(String refundOrderId) {
    this.refundOrderId = refundOrderId;
  }

  public ConsoleAdminSubmitRefundResultModel submitSuccess(Boolean submitSuccess) {
    this.submitSuccess = submitSuccess;
    return this;
  }

   /**
   * 是否提交成功
   * @return submitSuccess
  **/
  public Boolean getSubmitSuccess() {
    return submitSuccess;
  }

  public void setSubmitSuccess(Boolean submitSuccess) {
    this.submitSuccess = submitSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminSubmitRefundResultModel consoleAdminSubmitRefundResultModel = (ConsoleAdminSubmitRefundResultModel) o;
    return Objects.equals(this.refundOrderId, consoleAdminSubmitRefundResultModel.refundOrderId) &&
        Objects.equals(this.submitSuccess, consoleAdminSubmitRefundResultModel.submitSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundOrderId, submitSuccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminSubmitRefundResultModel {");
    
    sb.append(",refundOrderId: ").append(toIndentedString(refundOrderId));
    sb.append(",submitSuccess: ").append(toIndentedString(submitSuccess));
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
