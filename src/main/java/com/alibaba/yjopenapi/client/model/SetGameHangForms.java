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
 * SetGameHangForms
 */
public class SetGameHangForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSession = null;


  private String appKey = null;


  private Long duration = null;


  private Boolean kickInTheGame = null;


  public SetGameHangForms gameSession(String gameSession) {
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

  public SetGameHangForms appKey(String appKey) {
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

  public SetGameHangForms duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 挂机时长
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SetGameHangForms kickInTheGame(Boolean kickInTheGame) {
    this.kickInTheGame = kickInTheGame;
    return this;
  }

   /**
   * 是否踢出游戏中用户
   * @return kickInTheGame
  **/
  public Boolean getKickInTheGame() {
    return kickInTheGame;
  }

  public void setKickInTheGame(Boolean kickInTheGame) {
    this.kickInTheGame = kickInTheGame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetGameHangForms setGameHangForms = (SetGameHangForms) o;
    return Objects.equals(this.gameSession, setGameHangForms.gameSession) &&
        Objects.equals(this.appKey, setGameHangForms.appKey) &&
        Objects.equals(this.duration, setGameHangForms.duration) &&
        Objects.equals(this.kickInTheGame, setGameHangForms.kickInTheGame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSession, appKey, duration, kickInTheGame);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGameHangForms {");
    
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",duration: ").append(toIndentedString(duration));
    sb.append(",kickInTheGame: ").append(toIndentedString(kickInTheGame));
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
