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
 * ConsoleAdminCreateGameResultModel
 */
public class ConsoleAdminCreateGameResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  public ConsoleAdminCreateGameResultModel gameId(String gameId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateGameResultModel consoleAdminCreateGameResultModel = (ConsoleAdminCreateGameResultModel) o;
    return Objects.equals(this.gameId, consoleAdminCreateGameResultModel.gameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateGameResultModel {");
    
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
