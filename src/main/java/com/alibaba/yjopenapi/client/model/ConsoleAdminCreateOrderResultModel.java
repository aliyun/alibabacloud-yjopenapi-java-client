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
 * ConsoleAdminCreateOrderResultModel
 */
public class ConsoleAdminCreateOrderResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String instanceId = null;


  private String orderId = null;


  public ConsoleAdminCreateOrderResultModel instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 实例ID
   * @return instanceId
  **/
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ConsoleAdminCreateOrderResultModel orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单ID
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateOrderResultModel consoleAdminCreateOrderResultModel = (ConsoleAdminCreateOrderResultModel) o;
    return Objects.equals(this.instanceId, consoleAdminCreateOrderResultModel.instanceId) &&
        Objects.equals(this.orderId, consoleAdminCreateOrderResultModel.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateOrderResultModel {");
    
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",orderId: ").append(toIndentedString(orderId));
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
