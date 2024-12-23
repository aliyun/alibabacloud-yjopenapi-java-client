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
 * StopPreopenContainerForms
 */
public class StopPreopenContainerForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private String gameId = null;


  private Integer numberOfBatches = null;


  public StopPreopenContainerForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * 云游戏项目appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public StopPreopenContainerForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 云游戏平台游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public StopPreopenContainerForms numberOfBatches(Integer numberOfBatches) {
    this.numberOfBatches = numberOfBatches;
    return this;
  }

   /**
   * Get numberOfBatches
   * @return numberOfBatches
  **/
  public Integer getNumberOfBatches() {
    return numberOfBatches;
  }

  public void setNumberOfBatches(Integer numberOfBatches) {
    this.numberOfBatches = numberOfBatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopPreopenContainerForms stopPreopenContainerForms = (StopPreopenContainerForms) o;
    return Objects.equals(this.appKey, stopPreopenContainerForms.appKey) &&
        Objects.equals(this.gameId, stopPreopenContainerForms.gameId) &&
        Objects.equals(this.numberOfBatches, stopPreopenContainerForms.numberOfBatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, gameId, numberOfBatches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopPreopenContainerForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",numberOfBatches: ").append(toIndentedString(numberOfBatches));
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
