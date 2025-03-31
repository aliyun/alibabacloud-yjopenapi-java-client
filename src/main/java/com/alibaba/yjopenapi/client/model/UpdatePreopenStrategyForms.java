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
 * UpdatePreopenStrategyForms
 */
public class UpdatePreopenStrategyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private String gameId = null;


  private String preStartCmd = null;


  public UpdatePreopenStrategyForms appKey(String appKey) {
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

  public UpdatePreopenStrategyForms gameId(String gameId) {
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

  public UpdatePreopenStrategyForms preStartCmd(String preStartCmd) {
    this.preStartCmd = preStartCmd;
    return this;
  }

   /**
   * Get preStartCmd
   * @return preStartCmd
  **/
  public String getPreStartCmd() {
    return preStartCmd;
  }

  public void setPreStartCmd(String preStartCmd) {
    this.preStartCmd = preStartCmd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePreopenStrategyForms updatePreopenStrategyForms = (UpdatePreopenStrategyForms) o;
    return Objects.equals(this.appKey, updatePreopenStrategyForms.appKey) &&
        Objects.equals(this.gameId, updatePreopenStrategyForms.gameId) &&
        Objects.equals(this.preStartCmd, updatePreopenStrategyForms.preStartCmd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, gameId, preStartCmd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePreopenStrategyForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",preStartCmd: ").append(toIndentedString(preStartCmd));
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
