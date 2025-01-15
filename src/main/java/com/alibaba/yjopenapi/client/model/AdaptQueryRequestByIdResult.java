/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AdaptQueryRequestByIdResultModel;
import java.io.Serializable;
/**
 * AdaptQueryRequestByIdResult
 */
public class AdaptQueryRequestByIdResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private AdaptQueryRequestByIdResultModel model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public AdaptQueryRequestByIdResult success(Boolean success) {
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

  public AdaptQueryRequestByIdResult model(AdaptQueryRequestByIdResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public AdaptQueryRequestByIdResultModel getModel() {
    return model;
  }

  public void setModel(AdaptQueryRequestByIdResultModel model) {
    this.model = model;
  }

  public AdaptQueryRequestByIdResult msgInfo(String msgInfo) {
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

  public AdaptQueryRequestByIdResult msgCode(String msgCode) {
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
    AdaptQueryRequestByIdResult adaptQueryRequestByIdResult = (AdaptQueryRequestByIdResult) o;
    return Objects.equals(this.success, adaptQueryRequestByIdResult.success) &&
        Objects.equals(this.model, adaptQueryRequestByIdResult.model) &&
        Objects.equals(this.msgInfo, adaptQueryRequestByIdResult.msgInfo) &&
        Objects.equals(this.msgCode, adaptQueryRequestByIdResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptQueryRequestByIdResult {");
    
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
