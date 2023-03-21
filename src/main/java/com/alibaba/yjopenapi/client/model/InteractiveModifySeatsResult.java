/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveModifySeatsResultModel;
import java.io.Serializable;
/**
 * InteractiveModifySeatsResult
 */
public class InteractiveModifySeatsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String msgCode = null;


  private String msgInfo = null;


  private InteractiveModifySeatsResultModel model = null;


  public InteractiveModifySeatsResult msgCode(String msgCode) {
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

  public InteractiveModifySeatsResult msgInfo(String msgInfo) {
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

  public InteractiveModifySeatsResult model(InteractiveModifySeatsResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public InteractiveModifySeatsResultModel getModel() {
    return model;
  }

  public void setModel(InteractiveModifySeatsResultModel model) {
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
    InteractiveModifySeatsResult interactiveModifySeatsResult = (InteractiveModifySeatsResult) o;
    return Objects.equals(this.msgCode, interactiveModifySeatsResult.msgCode) &&
        Objects.equals(this.msgInfo, interactiveModifySeatsResult.msgInfo) &&
        Objects.equals(this.model, interactiveModifySeatsResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgCode, msgInfo, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveModifySeatsResult {");
    
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
