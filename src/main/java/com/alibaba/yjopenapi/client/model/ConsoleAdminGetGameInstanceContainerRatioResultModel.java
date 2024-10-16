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
 * ConsoleAdminGetGameInstanceContainerRatioResultModel
 */
public class ConsoleAdminGetGameInstanceContainerRatioResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixId = null;


  private String mixVersionId = null;


  private String containerRatio = null;


  public ConsoleAdminGetGameInstanceContainerRatioResultModel mixId(String mixId) {
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

  public ConsoleAdminGetGameInstanceContainerRatioResultModel mixVersionId(String mixVersionId) {
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

  public ConsoleAdminGetGameInstanceContainerRatioResultModel containerRatio(String containerRatio) {
    this.containerRatio = containerRatio;
    return this;
  }

   /**
   * Get containerRatio
   * @return containerRatio
  **/
  public String getContainerRatio() {
    return containerRatio;
  }

  public void setContainerRatio(String containerRatio) {
    this.containerRatio = containerRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameInstanceContainerRatioResultModel consoleAdminGetGameInstanceContainerRatioResultModel = (ConsoleAdminGetGameInstanceContainerRatioResultModel) o;
    return Objects.equals(this.mixId, consoleAdminGetGameInstanceContainerRatioResultModel.mixId) &&
        Objects.equals(this.mixVersionId, consoleAdminGetGameInstanceContainerRatioResultModel.mixVersionId) &&
        Objects.equals(this.containerRatio, consoleAdminGetGameInstanceContainerRatioResultModel.containerRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixId, mixVersionId, containerRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameInstanceContainerRatioResultModel {");
    
    sb.append(",mixId: ").append(toIndentedString(mixId));
    sb.append(",mixVersionId: ").append(toIndentedString(mixVersionId));
    sb.append(",containerRatio: ").append(toIndentedString(containerRatio));
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
