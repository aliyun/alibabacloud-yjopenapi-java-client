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
 * ConsoleAdminGetOrderForms
 */
public class ConsoleAdminGetOrderForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String orderId = null;


  public ConsoleAdminGetOrderForms orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单号
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
    ConsoleAdminGetOrderForms consoleAdminGetOrderForms = (ConsoleAdminGetOrderForms) o;
    return Objects.equals(this.orderId, consoleAdminGetOrderForms.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetOrderForms {");
    
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
