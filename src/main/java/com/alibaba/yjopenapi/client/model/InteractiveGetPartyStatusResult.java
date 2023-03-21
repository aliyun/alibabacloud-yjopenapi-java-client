/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyStatusResultModel;
import java.io.Serializable;
/**
 * InteractiveGetPartyStatusResult
 */
public class InteractiveGetPartyStatusResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msgCode = null;


  private String msgInfo = null;


  private InteractiveGetPartyStatusResultModel model = null;


  public InteractiveGetPartyStatusResult msgCode(String msgCode) {
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

  public InteractiveGetPartyStatusResult msgInfo(String msgInfo) {
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

  public InteractiveGetPartyStatusResult model(InteractiveGetPartyStatusResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public InteractiveGetPartyStatusResultModel getModel() {
    return model;
  }

  public void setModel(InteractiveGetPartyStatusResultModel model) {
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
    InteractiveGetPartyStatusResult interactiveGetPartyStatusResult = (InteractiveGetPartyStatusResult) o;
    return Objects.equals(this.msgCode, interactiveGetPartyStatusResult.msgCode) &&
        Objects.equals(this.msgInfo, interactiveGetPartyStatusResult.msgInfo) &&
        Objects.equals(this.model, interactiveGetPartyStatusResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgCode, msgInfo, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyStatusResult {");
    
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
