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
 * GetStockForms
 */
public class GetStockForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String appKey = null;


  private String type = null;


  public GetStockForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Paas平台部署的游戏Id
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public GetStockForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * 查询库存类型
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GetStockForms type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 通过接口获取的token
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStockForms getStockForms = (GetStockForms) o;
    return Objects.equals(this.gameId, getStockForms.gameId) &&
        Objects.equals(this.appKey, getStockForms.appKey) &&
        Objects.equals(this.type, getStockForms.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, appKey, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStockForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",type: ").append(toIndentedString(type));
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
