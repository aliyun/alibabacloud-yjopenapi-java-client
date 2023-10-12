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
 * GetPairResult
 */
public class GetPairResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String expired = null;


  private String code = null;


  private String message = null;


  private String token = null;


  private String accessSecret = null;


  public GetPairResult expired(String expired) {
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

  public GetPairResult code(String code) {
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

  public GetPairResult message(String message) {
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

  public GetPairResult token(String token) {
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

  public GetPairResult accessSecret(String accessSecret) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPairResult getPairResult = (GetPairResult) o;
    return Objects.equals(this.expired, getPairResult.expired) &&
        Objects.equals(this.code, getPairResult.code) &&
        Objects.equals(this.message, getPairResult.message) &&
        Objects.equals(this.token, getPairResult.token) &&
        Objects.equals(this.accessSecret, getPairResult.accessSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expired, code, message, token, accessSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPairResult {");
    
    sb.append(",expired: ").append(toIndentedString(expired));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",token: ").append(toIndentedString(token));
    sb.append(",accessSecret: ").append(toIndentedString(accessSecret));
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
