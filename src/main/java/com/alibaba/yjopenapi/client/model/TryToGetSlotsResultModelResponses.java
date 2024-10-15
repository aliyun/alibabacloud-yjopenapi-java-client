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
 * TryToGetSlotsResultModelResponses
 */
public class TryToGetSlotsResultModelResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String accountId = null;


  private String code = null;


  private String regionId = null;


  private Boolean success = null;


  private String message = null;


  private String slotData = null;


  private String gameSession = null;


  public TryToGetSlotsResultModelResponses gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public TryToGetSlotsResultModelResponses accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TryToGetSlotsResultModelResponses code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TryToGetSlotsResultModelResponses regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public TryToGetSlotsResultModelResponses success(Boolean success) {
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

  public TryToGetSlotsResultModelResponses message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TryToGetSlotsResultModelResponses slotData(String slotData) {
    this.slotData = slotData;
    return this;
  }

   /**
   * Get slotData
   * @return slotData
  **/
  public String getSlotData() {
    return slotData;
  }

  public void setSlotData(String slotData) {
    this.slotData = slotData;
  }

  public TryToGetSlotsResultModelResponses gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * Get gameSession
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
    TryToGetSlotsResultModelResponses tryToGetSlotsResultModelResponses = (TryToGetSlotsResultModelResponses) o;
    return Objects.equals(this.gameId, tryToGetSlotsResultModelResponses.gameId) &&
        Objects.equals(this.accountId, tryToGetSlotsResultModelResponses.accountId) &&
        Objects.equals(this.code, tryToGetSlotsResultModelResponses.code) &&
        Objects.equals(this.regionId, tryToGetSlotsResultModelResponses.regionId) &&
        Objects.equals(this.success, tryToGetSlotsResultModelResponses.success) &&
        Objects.equals(this.message, tryToGetSlotsResultModelResponses.message) &&
        Objects.equals(this.slotData, tryToGetSlotsResultModelResponses.slotData) &&
        Objects.equals(this.gameSession, tryToGetSlotsResultModelResponses.gameSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, accountId, code, regionId, success, message, slotData, gameSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotsResultModelResponses {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",slotData: ").append(toIndentedString(slotData));
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
