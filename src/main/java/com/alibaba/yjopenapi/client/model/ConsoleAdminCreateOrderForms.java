/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminCreateOrderFormsAttributeRequestList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminCreateOrderForms
 */
public class ConsoleAdminCreateOrderForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String categoryCode = null;


  private String commodityCode = null;


  private String instanceId = null;


  private String primaryChargeItemCode = null;


  private List<ConsoleAdminCreateOrderFormsAttributeRequestList> attributeRequestList = new ArrayList<ConsoleAdminCreateOrderFormsAttributeRequestList>();


  private String orderType = null;


  private Boolean autoRenew = null;


  private String createOrderExtParams = null;


  public ConsoleAdminCreateOrderForms categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * 类目编码
   * @return categoryCode
  **/
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public ConsoleAdminCreateOrderForms commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * 商品编码
   * @return commodityCode
  **/
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public ConsoleAdminCreateOrderForms instanceId(String instanceId) {
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

  public ConsoleAdminCreateOrderForms primaryChargeItemCode(String primaryChargeItemCode) {
    this.primaryChargeItemCode = primaryChargeItemCode;
    return this;
  }

   /**
   * 主计费项编码
   * @return primaryChargeItemCode
  **/
  public String getPrimaryChargeItemCode() {
    return primaryChargeItemCode;
  }

  public void setPrimaryChargeItemCode(String primaryChargeItemCode) {
    this.primaryChargeItemCode = primaryChargeItemCode;
  }

  public ConsoleAdminCreateOrderForms attributeRequestList(List<ConsoleAdminCreateOrderFormsAttributeRequestList> attributeRequestList) {
    this.attributeRequestList = attributeRequestList;
    return this;
  }

  public ConsoleAdminCreateOrderForms addAttributeRequestListItem(ConsoleAdminCreateOrderFormsAttributeRequestList attributeRequestListItem) {
    this.attributeRequestList.add(attributeRequestListItem);
    return this;
  }

   /**
   * Get attributeRequestList
   * @return attributeRequestList
  **/
  public List<ConsoleAdminCreateOrderFormsAttributeRequestList> getAttributeRequestList() {
    return attributeRequestList;
  }

  public void setAttributeRequestList(List<ConsoleAdminCreateOrderFormsAttributeRequestList> attributeRequestList) {
    this.attributeRequestList = attributeRequestList;
  }

  public ConsoleAdminCreateOrderForms orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * 订单类型
   * @return orderType
  **/
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public ConsoleAdminCreateOrderForms autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * 是否开启自动续费
   * @return autoRenew
  **/
  public Boolean getAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ConsoleAdminCreateOrderForms createOrderExtParams(String createOrderExtParams) {
    this.createOrderExtParams = createOrderExtParams;
    return this;
  }

   /**
   * 下单扩展信息
   * @return createOrderExtParams
  **/
  public String getCreateOrderExtParams() {
    return createOrderExtParams;
  }

  public void setCreateOrderExtParams(String createOrderExtParams) {
    this.createOrderExtParams = createOrderExtParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateOrderForms consoleAdminCreateOrderForms = (ConsoleAdminCreateOrderForms) o;
    return Objects.equals(this.categoryCode, consoleAdminCreateOrderForms.categoryCode) &&
        Objects.equals(this.commodityCode, consoleAdminCreateOrderForms.commodityCode) &&
        Objects.equals(this.instanceId, consoleAdminCreateOrderForms.instanceId) &&
        Objects.equals(this.primaryChargeItemCode, consoleAdminCreateOrderForms.primaryChargeItemCode) &&
        Objects.equals(this.attributeRequestList, consoleAdminCreateOrderForms.attributeRequestList) &&
        Objects.equals(this.orderType, consoleAdminCreateOrderForms.orderType) &&
        Objects.equals(this.autoRenew, consoleAdminCreateOrderForms.autoRenew) &&
        Objects.equals(this.createOrderExtParams, consoleAdminCreateOrderForms.createOrderExtParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, commodityCode, instanceId, primaryChargeItemCode, attributeRequestList, orderType, autoRenew, createOrderExtParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateOrderForms {");
    
    sb.append(",categoryCode: ").append(toIndentedString(categoryCode));
    sb.append(",commodityCode: ").append(toIndentedString(commodityCode));
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",primaryChargeItemCode: ").append(toIndentedString(primaryChargeItemCode));
    sb.append(",attributeRequestList: ").append(toIndentedString(attributeRequestList));
    sb.append(",orderType: ").append(toIndentedString(orderType));
    sb.append(",autoRenew: ").append(toIndentedString(autoRenew));
    sb.append(",createOrderExtParams: ").append(toIndentedString(createOrderExtParams));
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
