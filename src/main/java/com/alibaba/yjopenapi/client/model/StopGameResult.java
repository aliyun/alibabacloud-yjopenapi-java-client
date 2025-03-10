/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.StopGameResultModel;
import java.io.Serializable;
/**
 * StopGameResult
 */
public class StopGameResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private StopGameResultModel model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public StopGameResult success(Boolean success) {
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

  public StopGameResult model(StopGameResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public StopGameResultModel getModel() {
    return model;
  }

  public void setModel(StopGameResultModel model) {
    this.model = model;
  }

  public StopGameResult msgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
    return this;
  }

   /**
   * 错误信息
   * @return msgInfo
  **/
  public String getMsgInfo() {
    return msgInfo;
  }

  public void setMsgInfo(String msgInfo) {
    this.msgInfo = msgInfo;
  }

  public StopGameResult msgCode(String msgCode) {
    this.msgCode = msgCode;
    return this;
  }

   /**
   * 错误码
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
    StopGameResult stopGameResult = (StopGameResult) o;
    return Objects.equals(this.success, stopGameResult.success) &&
        Objects.equals(this.model, stopGameResult.model) &&
        Objects.equals(this.msgInfo, stopGameResult.msgInfo) &&
        Objects.equals(this.msgCode, stopGameResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopGameResult {");
    
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
