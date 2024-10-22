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
 * ConsoleAdminGetGameRecommendedInstanceResultModel
 */
public class ConsoleAdminGetGameRecommendedInstanceResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String commodityInstanceId = null;


  public ConsoleAdminGetGameRecommendedInstanceResultModel commodityInstanceId(String commodityInstanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameRecommendedInstanceResultModel consoleAdminGetGameRecommendedInstanceResultModel = (ConsoleAdminGetGameRecommendedInstanceResultModel) o;
    return Objects.equals(this.commodityInstanceId, consoleAdminGetGameRecommendedInstanceResultModel.commodityInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameRecommendedInstanceResultModel {");
    
    sb.append(",commodityInstanceId: ").append(toIndentedString(commodityInstanceId));
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
