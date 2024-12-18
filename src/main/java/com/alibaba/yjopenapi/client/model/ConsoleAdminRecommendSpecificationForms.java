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
 * ConsoleAdminRecommendSpecificationForms
 */
public class ConsoleAdminRecommendSpecificationForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String gameVersionId = null;


  private Integer platformType = null;


  public ConsoleAdminRecommendSpecificationForms gameId(String gameId) {
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

  public ConsoleAdminRecommendSpecificationForms gameVersionId(String gameVersionId) {
    this.gameVersionId = gameVersionId;
    return this;
  }

   /**
   * Get gameVersionId
   * @return gameVersionId
  **/
  public String getGameVersionId() {
    return gameVersionId;
  }

  public void setGameVersionId(String gameVersionId) {
    this.gameVersionId = gameVersionId;
  }

  public ConsoleAdminRecommendSpecificationForms platformType(Integer platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public Integer getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Integer platformType) {
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
    ConsoleAdminRecommendSpecificationForms consoleAdminRecommendSpecificationForms = (ConsoleAdminRecommendSpecificationForms) o;
    return Objects.equals(this.gameId, consoleAdminRecommendSpecificationForms.gameId) &&
        Objects.equals(this.gameVersionId, consoleAdminRecommendSpecificationForms.gameVersionId) &&
        Objects.equals(this.platformType, consoleAdminRecommendSpecificationForms.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameVersionId, platformType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRecommendSpecificationForms {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",gameVersionId: ").append(toIndentedString(gameVersionId));
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
