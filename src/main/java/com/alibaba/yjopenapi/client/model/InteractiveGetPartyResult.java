/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyResultModel;
import java.io.Serializable;
/**
 * InteractiveGetPartyResult
 */
public class InteractiveGetPartyResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msgCode = null;


  private String msgInfo = null;


  private InteractiveGetPartyResultModel model = null;


  public InteractiveGetPartyResult msgCode(String msgCode) {
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

  public InteractiveGetPartyResult msgInfo(String msgInfo) {
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

  public InteractiveGetPartyResult model(InteractiveGetPartyResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public InteractiveGetPartyResultModel getModel() {
    return model;
  }

  public void setModel(InteractiveGetPartyResultModel model) {
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
    InteractiveGetPartyResult interactiveGetPartyResult = (InteractiveGetPartyResult) o;
    return Objects.equals(this.msgCode, interactiveGetPartyResult.msgCode) &&
        Objects.equals(this.msgInfo, interactiveGetPartyResult.msgInfo) &&
        Objects.equals(this.model, interactiveGetPartyResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgCode, msgInfo, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyResult {");
    
    sb.append(",msgCode: ").append(toIndentedString(msgCode));
    sb.append(",msgInfo: ").append(toIndentedString(msgInfo));
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
