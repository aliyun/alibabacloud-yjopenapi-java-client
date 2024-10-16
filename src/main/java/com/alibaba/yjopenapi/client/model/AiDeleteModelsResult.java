/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiDeleteModelsResultModel;
import java.io.Serializable;
/**
 * AiDeleteModelsResult
 */
public class AiDeleteModelsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private AiDeleteModelsResultModel model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public AiDeleteModelsResult success(Boolean success) {
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

  public AiDeleteModelsResult model(AiDeleteModelsResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public AiDeleteModelsResultModel getModel() {
    return model;
  }

  public void setModel(AiDeleteModelsResultModel model) {
    this.model = model;
  }

  public AiDeleteModelsResult msgInfo(String msgInfo) {
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

  public AiDeleteModelsResult msgCode(String msgCode) {
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
    AiDeleteModelsResult aiDeleteModelsResult = (AiDeleteModelsResult) o;
    return Objects.equals(this.success, aiDeleteModelsResult.success) &&
        Objects.equals(this.model, aiDeleteModelsResult.model) &&
        Objects.equals(this.msgInfo, aiDeleteModelsResult.msgInfo) &&
        Objects.equals(this.msgCode, aiDeleteModelsResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDeleteModelsResult {");
    
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
