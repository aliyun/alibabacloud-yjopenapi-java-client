/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveJoinPartyResultModel;
import java.io.Serializable;
/**
 * InteractiveJoinPartyResult
 */
public class InteractiveJoinPartyResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msgCode = null;


  private String msgInfo = null;


  private InteractiveJoinPartyResultModel model = null;


  public InteractiveJoinPartyResult msgCode(String msgCode) {
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

  public InteractiveJoinPartyResult msgInfo(String msgInfo) {
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

  public InteractiveJoinPartyResult model(InteractiveJoinPartyResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public InteractiveJoinPartyResultModel getModel() {
    return model;
  }

  public void setModel(InteractiveJoinPartyResultModel model) {
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
    InteractiveJoinPartyResult interactiveJoinPartyResult = (InteractiveJoinPartyResult) o;
    return Objects.equals(this.msgCode, interactiveJoinPartyResult.msgCode) &&
        Objects.equals(this.msgInfo, interactiveJoinPartyResult.msgInfo) &&
        Objects.equals(this.model, interactiveJoinPartyResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgCode, msgInfo, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveJoinPartyResult {");
    
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
