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
 * SetGameAliveForms
 */
public class SetGameAliveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSession = null;


  private String appKey = null;


  private Long keepAlive = null;


  public SetGameAliveForms gameSession(String gameSession) {
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

  public SetGameAliveForms appKey(String appKey) {
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

  public SetGameAliveForms keepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
    return this;
  }

   /**
   * 游戏可运行时长
   * @return keepAlive
  **/
  public Long getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(Long keepAlive) {
    this.keepAlive = keepAlive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetGameAliveForms setGameAliveForms = (SetGameAliveForms) o;
    return Objects.equals(this.gameSession, setGameAliveForms.gameSession) &&
        Objects.equals(this.appKey, setGameAliveForms.appKey) &&
        Objects.equals(this.keepAlive, setGameAliveForms.keepAlive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSession, appKey, keepAlive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGameAliveForms {");
    
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",keepAlive: ").append(toIndentedString(keepAlive));
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
