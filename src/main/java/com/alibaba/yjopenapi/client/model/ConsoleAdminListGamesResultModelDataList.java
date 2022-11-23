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
 * ConsoleAdminListGamesResultModelDataList
 */
public class ConsoleAdminListGamesResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long platformType = null;


  private String gameName = null;


  private String gameId = null;


  public ConsoleAdminListGamesResultModelDataList platformType(Long platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * 平台类型
   * @return platformType
  **/
  public Long getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Long platformType) {
    this.platformType = platformType;
  }

  public ConsoleAdminListGamesResultModelDataList gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

   /**
   * 游戏名称
   * @return gameName
  **/
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public ConsoleAdminListGamesResultModelDataList gameId(String gameId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGamesResultModelDataList consoleAdminListGamesResultModelDataList = (ConsoleAdminListGamesResultModelDataList) o;
    return Objects.equals(this.platformType, consoleAdminListGamesResultModelDataList.platformType) &&
        Objects.equals(this.gameName, consoleAdminListGamesResultModelDataList.gameName) &&
        Objects.equals(this.gameId, consoleAdminListGamesResultModelDataList.gameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformType, gameName, gameId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGamesResultModelDataList {");
    
    sb.append(",platformType: ").append(toIndentedString(platformType));
    sb.append(",gameName: ").append(toIndentedString(gameName));
    sb.append(",gameId: ").append(toIndentedString(gameId));
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
