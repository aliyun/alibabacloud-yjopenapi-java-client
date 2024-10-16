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
 * SetGameHangResultModel
 */
public class SetGameHangResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long duration = null;


  private String code = null;


  private Long startHangTimestamp = null;


  private Boolean success = null;


  private String message = null;


  private String gameSession = null;


  public SetGameHangResultModel duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 挂机时长，单位：秒
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SetGameHangResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 错误Code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SetGameHangResultModel startHangTimestamp(Long startHangTimestamp) {
    this.startHangTimestamp = startHangTimestamp;
    return this;
  }

   /**
   * 开始挂机毫秒时间戳
   * @return startHangTimestamp
  **/
  public Long getStartHangTimestamp() {
    return startHangTimestamp;
  }

  public void setStartHangTimestamp(Long startHangTimestamp) {
    this.startHangTimestamp = startHangTimestamp;
  }

  public SetGameHangResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 设置是否成功
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public SetGameHangResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 错误Message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SetGameHangResultModel gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * 会话ID
   * @return gameSession
  **/
  public String getGameSession() {
    return gameSession;
  }

  public void setGameSession(String gameSession) {
    this.gameSession = gameSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetGameHangResultModel setGameHangResultModel = (SetGameHangResultModel) o;
    return Objects.equals(this.duration, setGameHangResultModel.duration) &&
        Objects.equals(this.code, setGameHangResultModel.code) &&
        Objects.equals(this.startHangTimestamp, setGameHangResultModel.startHangTimestamp) &&
        Objects.equals(this.success, setGameHangResultModel.success) &&
        Objects.equals(this.message, setGameHangResultModel.message) &&
        Objects.equals(this.gameSession, setGameHangResultModel.gameSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, code, startHangTimestamp, success, message, gameSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGameHangResultModel {");
    
    sb.append(",duration: ").append(toIndentedString(duration));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",startHangTimestamp: ").append(toIndentedString(startHangTimestamp));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
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
