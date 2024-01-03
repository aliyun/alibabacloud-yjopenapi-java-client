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

  private String gameId = null;


  private String gameName = null;


  private Long platformType = null;


  public ConsoleAdminListGamesResultModelDataList gameId(String gameId) {
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

  public ConsoleAdminListGamesResultModelDataList gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

   /**
   * Get gameName
   * @return gameName
  **/
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public ConsoleAdminListGamesResultModelDataList platformType(Long platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public Long getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Long platformType) {
    this.platformType = platformType;
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
    return Objects.equals(this.gameId, consoleAdminListGamesResultModelDataList.gameId) &&
        Objects.equals(this.gameName, consoleAdminListGamesResultModelDataList.gameName) &&
        Objects.equals(this.platformType, consoleAdminListGamesResultModelDataList.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameName, platformType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGamesResultModelDataList {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameName: ").append(toIndentedString(gameName));
    sb.append(",platformType: ").append(toIndentedString(platformType));
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
