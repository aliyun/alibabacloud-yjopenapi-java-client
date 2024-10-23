/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetGameInstanceContainerRatioFormsGames;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminGetGameInstanceContainerRatioForms
 */
public class ConsoleAdminGetGameInstanceContainerRatioForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String commodityInstanceId = null;


  private List<ConsoleAdminGetGameInstanceContainerRatioFormsGames> games = new ArrayList<ConsoleAdminGetGameInstanceContainerRatioFormsGames>();


  public ConsoleAdminGetGameInstanceContainerRatioForms commodityInstanceId(String commodityInstanceId) {
    this.commodityInstanceId = commodityInstanceId;
    return this;
  }

   /**
   * Get commodityInstanceId
   * @return commodityInstanceId
  **/
  public String getCommodityInstanceId() {
    return commodityInstanceId;
  }

  public void setCommodityInstanceId(String commodityInstanceId) {
    this.commodityInstanceId = commodityInstanceId;
  }

  public ConsoleAdminGetGameInstanceContainerRatioForms games(List<ConsoleAdminGetGameInstanceContainerRatioFormsGames> games) {
    this.games = games;
    return this;
  }

  public ConsoleAdminGetGameInstanceContainerRatioForms addGamesItem(ConsoleAdminGetGameInstanceContainerRatioFormsGames gamesItem) {
    this.games.add(gamesItem);
    return this;
  }

   /**
   * Get games
   * @return games
  **/
  public List<ConsoleAdminGetGameInstanceContainerRatioFormsGames> getGames() {
    return games;
  }

  public void setGames(List<ConsoleAdminGetGameInstanceContainerRatioFormsGames> games) {
    this.games = games;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameInstanceContainerRatioForms consoleAdminGetGameInstanceContainerRatioForms = (ConsoleAdminGetGameInstanceContainerRatioForms) o;
    return Objects.equals(this.commodityInstanceId, consoleAdminGetGameInstanceContainerRatioForms.commodityInstanceId) &&
        Objects.equals(this.games, consoleAdminGetGameInstanceContainerRatioForms.games);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityInstanceId, games);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameInstanceContainerRatioForms {");
    
    sb.append(",commodityInstanceId: ").append(toIndentedString(commodityInstanceId));
    sb.append(",games: ").append(toIndentedString(games));
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
