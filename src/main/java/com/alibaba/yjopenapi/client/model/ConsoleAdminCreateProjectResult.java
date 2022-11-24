/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminCreateProjectResultModel;
import java.io.Serializable;
/**
 * ConsoleAdminCreateProjectResult
 */
public class ConsoleAdminCreateProjectResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msgCode = null;


  private String msgInfo = null;


  private Boolean success = null;


  private ConsoleAdminCreateProjectResultModel model = null;


  public ConsoleAdminCreateProjectResult msgCode(String msgCode) {
    this.msgCode = msgCode;
    return this;
  }

   /**
   * 服务端状态码
   * @return msgCode
  **/
  public String getMsgCode() {
    return msgCode;
  }

  public void setMsgCode(String msgCode) {
    this.msgCode = msgCode;
  }

  public ConsoleAdminCreateProjectResult msgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
    return this;
  }

   /**
   * 服务端描述信息
   * @return msgInfo
  **/
  public String getMsgInfo() {
    return msgInfo;
  }

  public void setMsgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
  }

  public ConsoleAdminCreateProjectResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 是否成功
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ConsoleAdminCreateProjectResult model(ConsoleAdminCreateProjectResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public ConsoleAdminCreateProjectResultModel getModel() {
    return model;
  }

  public void setModel(ConsoleAdminCreateProjectResultModel model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateProjectResult consoleAdminCreateProjectResult = (ConsoleAdminCreateProjectResult) o;
    return Objects.equals(this.msgCode, consoleAdminCreateProjectResult.msgCode) &&
        Objects.equals(this.msgInfo, consoleAdminCreateProjectResult.msgInfo) &&
        Objects.equals(this.success, consoleAdminCreateProjectResult.success) &&
        Objects.equals(this.model, consoleAdminCreateProjectResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgCode, msgInfo, success, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateProjectResult {");
    
    sb.append(",msgCode: ").append(toIndentedString(msgCode));
    sb.append(",msgInfo: ").append(toIndentedString(msgInfo));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",model: ").append(toIndentedString(model));
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
