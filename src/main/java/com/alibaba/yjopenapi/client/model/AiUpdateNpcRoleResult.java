/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
/**
 * AiUpdateNpcRoleResult
 */
public class AiUpdateNpcRoleResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private Map<String, String> model = null;


  private String msgInfo = null;


  private String msgCode = null;


  public AiUpdateNpcRoleResult success(Boolean success) {
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

  public AiUpdateNpcRoleResult model(Map<String, String> model) {
    this.model = model;
    return this;
  }

  public AiUpdateNpcRoleResult putModelItem(String key, String modelItem) {
    if (this.model == null) {
      this.model = new HashMap<String, String>();
    }
    this.model.put(key, modelItem);
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public Map<String, String> getModel() {
    return model;
  }

  public void setModel(Map<String, String> model) {
    this.model = model;
  }

  public AiUpdateNpcRoleResult msgInfo(String msgInfo) {
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

  public AiUpdateNpcRoleResult msgCode(String msgCode) {
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
    AiUpdateNpcRoleResult aiUpdateNpcRoleResult = (AiUpdateNpcRoleResult) o;
    return Objects.equals(this.success, aiUpdateNpcRoleResult.success) &&
        Objects.equals(this.model, aiUpdateNpcRoleResult.model) &&
        Objects.equals(this.msgInfo, aiUpdateNpcRoleResult.msgInfo) &&
        Objects.equals(this.msgCode, aiUpdateNpcRoleResult.msgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model, msgInfo, msgCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUpdateNpcRoleResult {");
    
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
