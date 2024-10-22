/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.TryToGetSlotResultModelOperators;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * TryToGetSlotResultModel
 */
public class TryToGetSlotResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String accountId = null;


  private String country = null;


  private String code = null;


  private String province = null;


  private String regionId = null;


  private String city = null;


  private List<TryToGetSlotResultModelOperators> operators = null;


  private Boolean success = null;


  private String message = null;


  private String slotData = null;


  private String gameSession = null;


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

  public TryToGetSlotResultModel country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 调度资源所在国家
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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

  public TryToGetSlotResultModel province(String province) {
    this.province = province;
    return this;
  }

   /**
   * 调度资源所在省份
   * @return province
  **/
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
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

  public TryToGetSlotResultModel city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 调度资源所在城市
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TryToGetSlotResultModel operators(List<TryToGetSlotResultModelOperators> operators) {
    this.operators = operators;
    return this;
  }

  public TryToGetSlotResultModel addOperatorsItem(TryToGetSlotResultModelOperators operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<TryToGetSlotResultModelOperators>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * 调度资源运营商信息
   * @return operators
  **/
  public List<TryToGetSlotResultModelOperators> getOperators() {
    return operators;
  }

  public void setOperators(List<TryToGetSlotResultModelOperators> operators) {
    this.operators = operators;
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

  public TryToGetSlotResultModel slotData(String slotData) {
    this.slotData = slotData;
    return this;
  }

   /**
   * 调度结果集
   * @return slotData
  **/
  public String getSlotData() {
    return slotData;
  }

  public void setSlotData(String slotData) {
    this.slotData = slotData;
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
        Objects.equals(this.accountId, tryToGetSlotResultModel.accountId) &&
        Objects.equals(this.country, tryToGetSlotResultModel.country) &&
        Objects.equals(this.code, tryToGetSlotResultModel.code) &&
        Objects.equals(this.province, tryToGetSlotResultModel.province) &&
        Objects.equals(this.regionId, tryToGetSlotResultModel.regionId) &&
        Objects.equals(this.city, tryToGetSlotResultModel.city) &&
        Objects.equals(this.operators, tryToGetSlotResultModel.operators) &&
        Objects.equals(this.success, tryToGetSlotResultModel.success) &&
        Objects.equals(this.message, tryToGetSlotResultModel.message) &&
        Objects.equals(this.slotData, tryToGetSlotResultModel.slotData) &&
        Objects.equals(this.gameSession, tryToGetSlotResultModel.gameSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, accountId, country, code, province, regionId, city, operators, success, message, slotData, gameSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",country: ").append(toIndentedString(country));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",province: ").append(toIndentedString(province));
    sb.append(",regionId: ").append(toIndentedString(regionId));
    sb.append(",city: ").append(toIndentedString(city));
    sb.append(",operators: ").append(toIndentedString(operators));
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
