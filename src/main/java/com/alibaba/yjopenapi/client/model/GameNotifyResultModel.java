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
 * GameNotifyResultModel
 */
public class GameNotifyResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSession = null;


  private Boolean success = null;


  private String code = null;


  private String message = null;


  public GameNotifyResultModel gameSession(String gameSession) {
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

  public GameNotifyResultModel success(Boolean success) {
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

  public GameNotifyResultModel code(String code) {
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

  public GameNotifyResultModel message(String message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameNotifyResultModel gameNotifyResultModel = (GameNotifyResultModel) o;
    return Objects.equals(this.gameSession, gameNotifyResultModel.gameSession) &&
        Objects.equals(this.success, gameNotifyResultModel.success) &&
        Objects.equals(this.code, gameNotifyResultModel.code) &&
        Objects.equals(this.message, gameNotifyResultModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSession, success, code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameNotifyResultModel {");
    
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",success: ").append(toIndentedString(success));
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
