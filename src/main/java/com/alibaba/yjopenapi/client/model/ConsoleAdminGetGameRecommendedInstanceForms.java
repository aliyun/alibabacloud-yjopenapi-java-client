/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetGameRecommendedInstanceFormsGame;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminGetGameRecommendedInstanceForms
 */
public class ConsoleAdminGetGameRecommendedInstanceForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private ConsoleAdminGetGameRecommendedInstanceFormsGame game = null;


  private List<String> commodityInstanceIds = new ArrayList<String>();


  public ConsoleAdminGetGameRecommendedInstanceForms game(ConsoleAdminGetGameRecommendedInstanceFormsGame game) {
    this.game = game;
    return this;
  }

   /**
   * Get game
   * @return game
  **/
  public ConsoleAdminGetGameRecommendedInstanceFormsGame getGame() {
    return game;
  }

  public void setGame(ConsoleAdminGetGameRecommendedInstanceFormsGame game) {
    this.game = game;
  }

  public ConsoleAdminGetGameRecommendedInstanceForms commodityInstanceIds(List<String> commodityInstanceIds) {
    this.commodityInstanceIds = commodityInstanceIds;
    return this;
  }

  public ConsoleAdminGetGameRecommendedInstanceForms addCommodityInstanceIdsItem(String commodityInstanceIdsItem) {
    this.commodityInstanceIds.add(commodityInstanceIdsItem);
    return this;
  }

   /**
   * Get commodityInstanceIds
   * @return commodityInstanceIds
  **/
  public List<String> getCommodityInstanceIds() {
    return commodityInstanceIds;
  }

  public void setCommodityInstanceIds(List<String> commodityInstanceIds) {
    this.commodityInstanceIds = commodityInstanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameRecommendedInstanceForms consoleAdminGetGameRecommendedInstanceForms = (ConsoleAdminGetGameRecommendedInstanceForms) o;
    return Objects.equals(this.game, consoleAdminGetGameRecommendedInstanceForms.game) &&
        Objects.equals(this.commodityInstanceIds, consoleAdminGetGameRecommendedInstanceForms.commodityInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(game, commodityInstanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameRecommendedInstanceForms {");
    
    sb.append(",game: ").append(toIndentedString(game));
    sb.append(",commodityInstanceIds: ").append(toIndentedString(commodityInstanceIds));
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
