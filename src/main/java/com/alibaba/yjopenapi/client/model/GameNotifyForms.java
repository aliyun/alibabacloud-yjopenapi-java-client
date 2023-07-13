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
 * GameNotifyForms
 */
public class GameNotifyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSession = null;


  private String appKey = null;


  private String type = null;


  private String value = null;


  public GameNotifyForms gameSession(String gameSession) {
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

  public GameNotifyForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * 项目应用AK
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GameNotifyForms type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 通知类型
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GameNotifyForms value(String value) {
    this.value = value;
    return this;
  }

   /**
   * 通知值
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameNotifyForms gameNotifyForms = (GameNotifyForms) o;
    return Objects.equals(this.gameSession, gameNotifyForms.gameSession) &&
        Objects.equals(this.appKey, gameNotifyForms.appKey) &&
        Objects.equals(this.type, gameNotifyForms.type) &&
        Objects.equals(this.value, gameNotifyForms.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSession, appKey, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameNotifyForms {");
    
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",type: ").append(toIndentedString(type));
    sb.append(",value: ").append(toIndentedString(value));
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
