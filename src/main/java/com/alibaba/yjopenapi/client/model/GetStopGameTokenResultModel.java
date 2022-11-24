/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
/**
 * GetStopGameTokenResultModel
 */
public class GetStopGameTokenResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String requestId = null;


  private String token = null;


  private Long expireTime = null;


  private String code = null;


  private String message = null;


  private Boolean success = null;


  public GetStopGameTokenResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求链路唯一标示
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GetStopGameTokenResultModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public GetStopGameTokenResultModel expireTime(Long expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 当前token失效时间
   * @return expireTime
  **/
  public Long getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }

  public GetStopGameTokenResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 返回码
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetStopGameTokenResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 返回信息
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetStopGameTokenResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 调度执行结果
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStopGameTokenResultModel getStopGameTokenResultModel = (GetStopGameTokenResultModel) o;
    return Objects.equals(this.requestId, getStopGameTokenResultModel.requestId) &&
        Objects.equals(this.token, getStopGameTokenResultModel.token) &&
        Objects.equals(this.expireTime, getStopGameTokenResultModel.expireTime) &&
        Objects.equals(this.code, getStopGameTokenResultModel.code) &&
        Objects.equals(this.message, getStopGameTokenResultModel.message) &&
        Objects.equals(this.success, getStopGameTokenResultModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, token, expireTime, code, message, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStopGameTokenResultModel {");
    
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",token: ").append(toIndentedString(token));
    sb.append(",expireTime: ").append(toIndentedString(expireTime));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",success: ").append(toIndentedString(success));
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
