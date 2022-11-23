/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayInitConfig;
import com.alibaba.yjopenapi.client.model.MultiplayInitTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayInitForms
 */
public class MultiplayInitForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSession = null;


  private String appKey = null;


  private MultiplayInitConfig config = null;


  private List<MultiplayInitTokens> tokens = null;


  public MultiplayInitForms gameSession(String gameSession) {
    this.gameSession = gameSession;
    return this;
  }

   /**
   * 游戏会话Id
   * @return gameSession
  **/
  public String getGameSession() {
    return gameSession;
  }

  public void setGameSession(String gameSession) {
    this.gameSession = gameSession;
  }

  public MultiplayInitForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * 分配的项目ak
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public MultiplayInitForms config(MultiplayInitConfig config) {
    this.config = config;
    return this;
  }

   /**
   * 联机基础配置
   * @return config
  **/
  public MultiplayInitConfig getConfig() {
    return config;
  }

  public void setConfig(MultiplayInitConfig config) {
    this.config = config;
  }

  public MultiplayInitForms tokens(List<MultiplayInitTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayInitForms addTokensItem(MultiplayInitTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayInitTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public List<MultiplayInitTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayInitTokens> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayInitForms multiplayInitForms = (MultiplayInitForms) o;
    return Objects.equals(this.gameSession, multiplayInitForms.gameSession) &&
        Objects.equals(this.appKey, multiplayInitForms.appKey) &&
        Objects.equals(this.config, multiplayInitForms.config) &&
        Objects.equals(this.tokens, multiplayInitForms.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSession, appKey, config, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitForms {");
    
    sb.append(",gameSession: ").append(toIndentedString(gameSession));
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",config: ").append(toIndentedString(config));
    sb.append(",tokens: ").append(toIndentedString(tokens));
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
