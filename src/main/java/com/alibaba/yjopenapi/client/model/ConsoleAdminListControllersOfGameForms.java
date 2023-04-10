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
 * ConsoleAdminListControllersOfGameForms
 */
public class ConsoleAdminListControllersOfGameForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String nextToken = null;


  private String maxResults = null;


  public ConsoleAdminListControllersOfGameForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏id
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public ConsoleAdminListControllersOfGameForms nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * 标记当前开始读取的位置
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ConsoleAdminListControllersOfGameForms maxResults(String maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * 本次读取的最大数据记录数量
   * @return maxResults
  **/
  public String getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(String maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListControllersOfGameForms consoleAdminListControllersOfGameForms = (ConsoleAdminListControllersOfGameForms) o;
    return Objects.equals(this.gameId, consoleAdminListControllersOfGameForms.gameId) &&
        Objects.equals(this.nextToken, consoleAdminListControllersOfGameForms.nextToken) &&
        Objects.equals(this.maxResults, consoleAdminListControllersOfGameForms.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, nextToken, maxResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListControllersOfGameForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
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
