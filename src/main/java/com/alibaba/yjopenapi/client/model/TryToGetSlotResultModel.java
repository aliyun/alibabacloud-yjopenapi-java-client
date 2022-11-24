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
 * TryToGetSlotResultModel
 */
public class TryToGetSlotResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String gameSession = null;


  private String regionId = null;


  private String accountId = null;


  private String code = null;


  private String message = null;


  private Boolean success = null;


  public TryToGetSlotResultModel gameId(String gameId) {
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

  public TryToGetSlotResultModel gameSession(String gameSession) {
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

  public TryToGetSlotResultModel regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 分配的region
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public TryToGetSlotResultModel accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 用户id，给到Paas平台和SDK，两者保持一致，全局唯一
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TryToGetSlotResultModel code(String code) {
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

  public TryToGetSlotResultModel message(String message) {
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

  public TryToGetSlotResultModel success(Boolean success) {
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
    TryToGetSlotResultModel tryToGetSlotResultModel = (TryToGetSlotResultModel) o;
    return Objects.equals(this.gameId, tryToGetSlotResultModel.gameId) &&
        Objects.equals(this.gameSession, tryToGetSlotResultModel.gameSession) &&
        Objects.equals(this.regionId, tryToGetSlotResultModel.regionId) &&
        Objects.equals(this.accountId, tryToGetSlotResultModel.accountId) &&
        Objects.equals(this.code, tryToGetSlotResultModel.code) &&
        Objects.equals(this.message, tryToGetSlotResultModel.message) &&
        Objects.equals(this.success, tryToGetSlotResultModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameSession, regionId, accountId, code, message, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
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
