/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListActivatedInstancesResultModel;
import java.io.Serializable;
/**
 * ConsoleAdminListActivatedInstancesResult
 */
public class ConsoleAdminListActivatedInstancesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private ConsoleAdminListActivatedInstancesResultModel model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public ConsoleAdminListActivatedInstancesResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ConsoleAdminListActivatedInstancesResult model(ConsoleAdminListActivatedInstancesResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public ConsoleAdminListActivatedInstancesResultModel getModel() {
    return model;
  }

  public void setModel(ConsoleAdminListActivatedInstancesResultModel model) {
    this.model = model;
  }

  public ConsoleAdminListActivatedInstancesResult msgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
    return this;
  }

   /**
   * Get msgInfo
   * @return msgInfo
  **/
  public String getMsgInfo() {
    return msgInfo;
  }

  public void setMsgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
  }

  public ConsoleAdminListActivatedInstancesResult msgCode(String msgCode) {
    this.msgCode = msgCode;
    return this;
  }

   /**
   * Get msgCode
   * @return msgCode
  **/
  public String getMsgCode() {
    return msgCode;
  }

  public void setMsgCode(String msgCode) {
    this.msgCode = msgCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListActivatedInstancesResult consoleAdminListActivatedInstancesResult = (ConsoleAdminListActivatedInstancesResult) o;
    return Objects.equals(this.success, consoleAdminListActivatedInstancesResult.success) &&
        Objects.equals(this.model, consoleAdminListActivatedInstancesResult.model) &&
        Objects.equals(this.msgInfo, consoleAdminListActivatedInstancesResult.msgInfo) &&
        Objects.equals(this.msgCode, consoleAdminListActivatedInstancesResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivatedInstancesResult {");
    
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",model: ").append(toIndentedString(model));
    sb.append(",msgInfo: ").append(toIndentedString(msgInfo));
    sb.append(",msgCode: ").append(toIndentedString(msgCode));
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
