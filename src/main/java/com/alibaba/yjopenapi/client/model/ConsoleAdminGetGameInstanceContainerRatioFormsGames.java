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
 * ConsoleAdminGetGameInstanceContainerRatioFormsGames
 */
public class ConsoleAdminGetGameInstanceContainerRatioFormsGames implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixId = null;


  private String mixVersionId = null;


  public ConsoleAdminGetGameInstanceContainerRatioFormsGames mixId(String mixId) {
    this.mixId = mixId;
    return this;
  }

   /**
   * Get mixId
   * @return mixId
  **/
  public String getMixId() {
    return mixId;
  }

  public void setMixId(String mixId) {
    this.mixId = mixId;
  }

  public ConsoleAdminGetGameInstanceContainerRatioFormsGames mixVersionId(String mixVersionId) {
    this.mixVersionId = mixVersionId;
    return this;
  }

   /**
   * Get mixVersionId
   * @return mixVersionId
  **/
  public String getMixVersionId() {
    return mixVersionId;
  }

  public void setMixVersionId(String mixVersionId) {
    this.mixVersionId = mixVersionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameInstanceContainerRatioFormsGames consoleAdminGetGameInstanceContainerRatioFormsGames = (ConsoleAdminGetGameInstanceContainerRatioFormsGames) o;
    return Objects.equals(this.mixId, consoleAdminGetGameInstanceContainerRatioFormsGames.mixId) &&
        Objects.equals(this.mixVersionId, consoleAdminGetGameInstanceContainerRatioFormsGames.mixVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixId, mixVersionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameInstanceContainerRatioFormsGames {");
    
    sb.append(",mixId: ").append(toIndentedString(mixId));
    sb.append(",mixVersionId: ").append(toIndentedString(mixVersionId));
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
