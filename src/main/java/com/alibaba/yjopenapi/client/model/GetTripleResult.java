/*
 * 
 * YuanJing OpenAPI SDK
 *
 * OpenAPI spec version: 1.0.20221015-beta
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
/**
 * GetTripleResult
 */
public class GetTripleResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String token = null;


  private String accessKey = null;


  private String accessSecret = null;


  private String expired = null;


  private String code = null;


  private String message = null;


  public GetTripleResult token(String token) {
    this.token = token;
    return this;
  }

   /**
   * 临时token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public GetTripleResult accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * 临时accessKey
   * @return accessKey
  **/
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public GetTripleResult accessSecret(String accessSecret) {
    this.accessSecret = accessSecret;
    return this;
  }

   /**
   * 临时secretKey
   * @return accessSecret
  **/
  public String getAccessSecret() {
    return accessSecret;
  }

  public void setAccessSecret(String accessSecret) {
    this.accessSecret = accessSecret;
  }

  public GetTripleResult expired(String expired) {
    this.expired = expired;
    return this;
  }

   /**
   * token失效时间戳,单位:秒
   * @return expired
  **/
  public String getExpired() {
    return expired;
  }

  public void setExpired(String expired) {
    this.expired = expired;
  }

  public GetTripleResult code(String code) {
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

  public GetTripleResult message(String message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTripleResult getTripleResult = (GetTripleResult) o;
    return Objects.equals(this.token, getTripleResult.token) &&
        Objects.equals(this.accessKey, getTripleResult.accessKey) &&
        Objects.equals(this.accessSecret, getTripleResult.accessSecret) &&
        Objects.equals(this.expired, getTripleResult.expired) &&
        Objects.equals(this.code, getTripleResult.code) &&
        Objects.equals(this.message, getTripleResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, accessKey, accessSecret, expired, code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTripleResult {");
    
    sb.append(",token: ").append(toIndentedString(token));
    sb.append(",accessKey: ").append(toIndentedString(accessKey));
    sb.append(",accessSecret: ").append(toIndentedString(accessSecret));
    sb.append(",expired: ").append(toIndentedString(expired));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",message: ").append(toIndentedString(message));
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
