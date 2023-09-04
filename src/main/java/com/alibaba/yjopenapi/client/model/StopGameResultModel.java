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
 * StopGameResultModel
 */
public class StopGameResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String code = null;


  private Boolean success = null;


  private String message = null;


  private String gameSession = null;


  public StopGameResultModel gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Paas平台游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public StopGameResultModel code(String code) {
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

  public StopGameResultModel success(Boolean success) {
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

  public StopGameResultModel message(String message) {
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

  public StopGameResultModel gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * 会话标识
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
    StopGameResultModel stopGameResultModel = (StopGameResultModel) o;
    return Objects.equals(this.gameId, stopGameResultModel.gameId) &&
        Objects.equals(this.code, stopGameResultModel.code) &&
        Objects.equals(this.success, stopGameResultModel.success) &&
        Objects.equals(this.message, stopGameResultModel.message) &&
        Objects.equals(this.gameSession, stopGameResultModel.gameSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, code, success, message, gameSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopGameResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",code: ").append(toIndentedString(code));
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
