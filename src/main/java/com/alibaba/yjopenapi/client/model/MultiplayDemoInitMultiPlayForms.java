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
 * MultiplayDemoInitMultiPlayForms
 */
public class MultiplayDemoInitMultiPlayForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String gameSession = null;


  private String appKey = null;


  private String config = null;


  private String schedulerConfig = null;


  private String tokens = null;


  private String openAk = null;


  private String openSk = null;


  private String accountId = null;


  public MultiplayDemoInitMultiPlayForms gameId(String gameId) {
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

  public MultiplayDemoInitMultiPlayForms gameSession(String gameSession) {
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

  public MultiplayDemoInitMultiPlayForms appKey(String appKey) {
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

  public MultiplayDemoInitMultiPlayForms config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public MultiplayDemoInitMultiPlayForms schedulerConfig(String schedulerConfig) {
    this.schedulerConfig = schedulerConfig;
    return this;
  }

   /**
   * Get schedulerConfig
   * @return schedulerConfig
  **/
  public String getSchedulerConfig() {
    return schedulerConfig;
  }

  public void setSchedulerConfig(String schedulerConfig) {
    this.schedulerConfig = schedulerConfig;
  }

  public MultiplayDemoInitMultiPlayForms tokens(String tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public String getTokens() {
    return tokens;
  }

  public void setTokens(String tokens) {
    this.tokens = tokens;
  }

  public MultiplayDemoInitMultiPlayForms openAk(String openAk) {
    this.openAk = openAk;
    return this;
  }

   /**
   * Get openAk
   * @return openAk
  **/
  public String getOpenAk() {
    return openAk;
  }

  public void setOpenAk(String openAk) {
    this.openAk = openAk;
  }

  public MultiplayDemoInitMultiPlayForms openSk(String openSk) {
    this.openSk = openSk;
    return this;
  }

   /**
   * Get openSk
   * @return openSk
  **/
  public String getOpenSk() {
    return openSk;
  }

  public void setOpenSk(String openSk) {
    this.openSk = openSk;
  }

  public MultiplayDemoInitMultiPlayForms accountId(String accountId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoInitMultiPlayForms multiplayDemoInitMultiPlayForms = (MultiplayDemoInitMultiPlayForms) o;
    return Objects.equals(this.gameId, multiplayDemoInitMultiPlayForms.gameId) &&
        Objects.equals(this.gameSession, multiplayDemoInitMultiPlayForms.gameSession) &&
        Objects.equals(this.appKey, multiplayDemoInitMultiPlayForms.appKey) &&
        Objects.equals(this.config, multiplayDemoInitMultiPlayForms.config) &&
        Objects.equals(this.schedulerConfig, multiplayDemoInitMultiPlayForms.schedulerConfig) &&
        Objects.equals(this.tokens, multiplayDemoInitMultiPlayForms.tokens) &&
        Objects.equals(this.openAk, multiplayDemoInitMultiPlayForms.openAk) &&
        Objects.equals(this.openSk, multiplayDemoInitMultiPlayForms.openSk) &&
        Objects.equals(this.accountId, multiplayDemoInitMultiPlayForms.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameSession, appKey, config, schedulerConfig, tokens, openAk, openSk, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoInitMultiPlayForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",config: ").append(toIndentedString(config));
    sb.append(",schedulerConfig: ").append(toIndentedString(schedulerConfig));
    sb.append(",tokens: ").append(toIndentedString(tokens));
    sb.append(",openAk: ").append(toIndentedString(openAk));
    sb.append(",openSk: ").append(toIndentedString(openSk));
    sb.append(",accountId: ").append(toIndentedString(accountId));
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
