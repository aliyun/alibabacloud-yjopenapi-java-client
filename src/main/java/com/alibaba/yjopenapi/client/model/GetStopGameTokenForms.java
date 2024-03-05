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
 * GetStopGameTokenForms
 */
public class GetStopGameTokenForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String appKey = null;


  public GetStopGameTokenForms gameId(String gameId) {
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

  public GetStopGameTokenForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Paas平台AK(应用的AK，非服务端AK)
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStopGameTokenForms getStopGameTokenForms = (GetStopGameTokenForms) o;
    return Objects.equals(this.gameId, getStopGameTokenForms.gameId) &&
        Objects.equals(this.appKey, getStopGameTokenForms.appKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, appKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStopGameTokenForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",appKey: ").append(toIndentedString(appKey));
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
