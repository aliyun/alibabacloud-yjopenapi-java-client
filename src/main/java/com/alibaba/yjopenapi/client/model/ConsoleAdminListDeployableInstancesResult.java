/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListDeployableInstancesResultModel;
import java.io.Serializable;
/**
 * ConsoleAdminListDeployableInstancesResult
 */
public class ConsoleAdminListDeployableInstancesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private ConsoleAdminListDeployableInstancesResultModel model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public ConsoleAdminListDeployableInstancesResult success(Boolean success) {
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

  public ConsoleAdminListDeployableInstancesResult model(ConsoleAdminListDeployableInstancesResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public ConsoleAdminListDeployableInstancesResultModel getModel() {
    return model;
  }

  public void setModel(ConsoleAdminListDeployableInstancesResultModel model) {
    this.model = model;
  }

  public ConsoleAdminListDeployableInstancesResult msgInfo(String msgInfo) {
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

  public ConsoleAdminListDeployableInstancesResult msgCode(String msgCode) {
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
    ConsoleAdminListDeployableInstancesResult consoleAdminListDeployableInstancesResult = (ConsoleAdminListDeployableInstancesResult) o;
    return Objects.equals(this.success, consoleAdminListDeployableInstancesResult.success) &&
        Objects.equals(this.model, consoleAdminListDeployableInstancesResult.model) &&
        Objects.equals(this.msgInfo, consoleAdminListDeployableInstancesResult.msgInfo) &&
        Objects.equals(this.msgCode, consoleAdminListDeployableInstancesResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListDeployableInstancesResult {");
    
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
