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
 * ClientNotifyForms
 */
public class ClientNotifyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private String gameSession = null;


  private String value = null;


  public ClientNotifyForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public ClientNotifyForms gameSession(String gameSession) {
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

  public ClientNotifyForms value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
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
    ClientNotifyForms clientNotifyForms = (ClientNotifyForms) o;
    return Objects.equals(this.appKey, clientNotifyForms.appKey) &&
        Objects.equals(this.gameSession, clientNotifyForms.gameSession) &&
        Objects.equals(this.value, clientNotifyForms.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, gameSession, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientNotifyForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
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
