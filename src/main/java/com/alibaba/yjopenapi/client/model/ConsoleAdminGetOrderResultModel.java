/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetOrderResultModelAttributeList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminGetOrderResultModel
 */
public class ConsoleAdminGetOrderResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String orderType = null;


  private String orderId = null;


  private List<ConsoleAdminGetOrderResultModelAttributeList> attributeList = null;


  private String chargeType = null;


  private Long discountAmount = null;


  private Long creditPayAmount = null;


  private Long downgradeRefundAmount = null;


  private Long downgradeCreditRefundAmount = null;


  private String discountDetail = null;


  private String promotionName = null;


  private String instanceId = null;


  private Long payAmount = null;


  private String tenantName = null;


  private String commodityCode = null;


  private Boolean autoRenew = null;


  private String currency = null;


  private Long startTime = null;


  private Long downgradeBalanceRefundAmount = null;


  private String primaryPriceType = null;


  private Long finishTime = null;


  private Long amount = null;


  private Integer quantity = null;


  private Long deliveryEndTime = null;


  private Long refundTime = null;


  private String buyDurationUnit = null;


  private String primaryChargeItemCode = null;


  private String payUserId = null;


  private String categoryCode = null;


  private Long buyDuration = null;


  private Long balancePayAmount = null;


  private Long actualPayAmount = null;


  private Long createTime = null;


  private Long tenantId = null;


  private Long paymentEndTime = null;


  private String buyType = null;


  private Long voucherPayAmount = null;


  private String buyerUserId = null;


  private Long endTime = null;


  private String commodityName = null;


  private String status = null;


  public ConsoleAdminGetOrderResultModel orderType(String orderType) {
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

  public ConsoleAdminGetOrderResultModel orderId(String orderId) {
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

  public ConsoleAdminGetOrderResultModel attributeList(List<ConsoleAdminGetOrderResultModelAttributeList> attributeList) {
    this.attributeList = attributeList;
    return this;
  }

  public ConsoleAdminGetOrderResultModel addAttributeListItem(ConsoleAdminGetOrderResultModelAttributeList attributeListItem) {
    if (this.attributeList == null) {
      this.attributeList = new ArrayList<ConsoleAdminGetOrderResultModelAttributeList>();
    }
    this.attributeList.add(attributeListItem);
    return this;
  }

   /**
   * 配置详情
   * @return attributeList
  **/
  public List<ConsoleAdminGetOrderResultModelAttributeList> getAttributeList() {
    return attributeList;
  }

  public void setAttributeList(List<ConsoleAdminGetOrderResultModelAttributeList> attributeList) {
    this.attributeList = attributeList;
  }

  public ConsoleAdminGetOrderResultModel chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * 付费方式
   * @return chargeType
  **/
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ConsoleAdminGetOrderResultModel discountAmount(Long discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额（单位：分）
   * @return discountAmount
  **/
  public Long getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Long discountAmount) {
    this.discountAmount = discountAmount;
  }

  public ConsoleAdminGetOrderResultModel creditPayAmount(Long creditPayAmount) {
    this.creditPayAmount = creditPayAmount;
    return this;
  }

   /**
   * 信控支付金额（单位：分）
   * @return creditPayAmount
  **/
  public Long getCreditPayAmount() {
    return creditPayAmount;
  }

  public void setCreditPayAmount(Long creditPayAmount) {
    this.creditPayAmount = creditPayAmount;
  }

  public ConsoleAdminGetOrderResultModel downgradeRefundAmount(Long downgradeRefundAmount) {
    this.downgradeRefundAmount = downgradeRefundAmount;
    return this;
  }

   /**
   * 降配退款金额
   * @return downgradeRefundAmount
  **/
  public Long getDowngradeRefundAmount() {
    return downgradeRefundAmount;
  }

  public void setDowngradeRefundAmount(Long downgradeRefundAmount) {
    this.downgradeRefundAmount = downgradeRefundAmount;
  }

  public ConsoleAdminGetOrderResultModel downgradeCreditRefundAmount(Long downgradeCreditRefundAmount) {
    this.downgradeCreditRefundAmount = downgradeCreditRefundAmount;
    return this;
  }

   /**
   * 降配信控应退款金额
   * @return downgradeCreditRefundAmount
  **/
  public Long getDowngradeCreditRefundAmount() {
    return downgradeCreditRefundAmount;
  }

  public void setDowngradeCreditRefundAmount(Long downgradeCreditRefundAmount) {
    this.downgradeCreditRefundAmount = downgradeCreditRefundAmount;
  }

  public ConsoleAdminGetOrderResultModel discountDetail(String discountDetail) {
    this.discountDetail = discountDetail;
    return this;
  }

   /**
   * 优惠详细信息
   * @return discountDetail
  **/
  public String getDiscountDetail() {
    return discountDetail;
  }

  public void setDiscountDetail(String discountDetail) {
    this.discountDetail = discountDetail;
  }

  public ConsoleAdminGetOrderResultModel promotionName(String promotionName) {
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 优惠名称
   * @return promotionName
  **/
  public String getPromotionName() {
    return promotionName;
  }

  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }

  public ConsoleAdminGetOrderResultModel instanceId(String instanceId) {
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

  public ConsoleAdminGetOrderResultModel payAmount(Long payAmount) {
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 应付金额（单位：分）
   * @return payAmount
  **/
  public Long getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(Long payAmount) {
    this.payAmount = payAmount;
  }

  public ConsoleAdminGetOrderResultModel tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * 租户名称
   * @return tenantName
  **/
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public ConsoleAdminGetOrderResultModel commodityCode(String commodityCode) {
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

  public ConsoleAdminGetOrderResultModel autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * 是否自动续费
   * @return autoRenew
  **/
  public Boolean getAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ConsoleAdminGetOrderResultModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 币种
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ConsoleAdminGetOrderResultModel startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间
   * @return startTime
  **/
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public ConsoleAdminGetOrderResultModel downgradeBalanceRefundAmount(Long downgradeBalanceRefundAmount) {
    this.downgradeBalanceRefundAmount = downgradeBalanceRefundAmount;
    return this;
  }

   /**
   * 降配现金应退款金额
   * @return downgradeBalanceRefundAmount
  **/
  public Long getDowngradeBalanceRefundAmount() {
    return downgradeBalanceRefundAmount;
  }

  public void setDowngradeBalanceRefundAmount(Long downgradeBalanceRefundAmount) {
    this.downgradeBalanceRefundAmount = downgradeBalanceRefundAmount;
  }

  public ConsoleAdminGetOrderResultModel primaryPriceType(String primaryPriceType) {
    this.primaryPriceType = primaryPriceType;
    return this;
  }

   /**
   * 主计费项价格类型
   * @return primaryPriceType
  **/
  public String getPrimaryPriceType() {
    return primaryPriceType;
  }

  public void setPrimaryPriceType(String primaryPriceType) {
    this.primaryPriceType = primaryPriceType;
  }

  public ConsoleAdminGetOrderResultModel finishTime(Long finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * 订单完成时间
   * @return finishTime
  **/
  public Long getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(Long finishTime) {
    this.finishTime = finishTime;
  }

  public ConsoleAdminGetOrderResultModel amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 订单总金额（单位：分）
   * @return amount
  **/
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public ConsoleAdminGetOrderResultModel quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 数量
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ConsoleAdminGetOrderResultModel deliveryEndTime(Long deliveryEndTime) {
    this.deliveryEndTime = deliveryEndTime;
    return this;
  }

   /**
   * 发货完成时间
   * @return deliveryEndTime
  **/
  public Long getDeliveryEndTime() {
    return deliveryEndTime;
  }

  public void setDeliveryEndTime(Long deliveryEndTime) {
    this.deliveryEndTime = deliveryEndTime;
  }

  public ConsoleAdminGetOrderResultModel refundTime(Long refundTime) {
    this.refundTime = refundTime;
    return this;
  }

   /**
   * 售中退款时间
   * @return refundTime
  **/
  public Long getRefundTime() {
    return refundTime;
  }

  public void setRefundTime(Long refundTime) {
    this.refundTime = refundTime;
  }

  public ConsoleAdminGetOrderResultModel buyDurationUnit(String buyDurationUnit) {
    this.buyDurationUnit = buyDurationUnit;
    return this;
  }

   /**
   * 购买时长单位
   * @return buyDurationUnit
  **/
  public String getBuyDurationUnit() {
    return buyDurationUnit;
  }

  public void setBuyDurationUnit(String buyDurationUnit) {
    this.buyDurationUnit = buyDurationUnit;
  }

  public ConsoleAdminGetOrderResultModel primaryChargeItemCode(String primaryChargeItemCode) {
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

  public ConsoleAdminGetOrderResultModel payUserId(String payUserId) {
    this.payUserId = payUserId;
    return this;
  }

   /**
   * 支付用户ID
   * @return payUserId
  **/
  public String getPayUserId() {
    return payUserId;
  }

  public void setPayUserId(String payUserId) {
    this.payUserId = payUserId;
  }

  public ConsoleAdminGetOrderResultModel categoryCode(String categoryCode) {
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

  public ConsoleAdminGetOrderResultModel buyDuration(Long buyDuration) {
    this.buyDuration = buyDuration;
    return this;
  }

   /**
   * 购买时长
   * @return buyDuration
  **/
  public Long getBuyDuration() {
    return buyDuration;
  }

  public void setBuyDuration(Long buyDuration) {
    this.buyDuration = buyDuration;
  }

  public ConsoleAdminGetOrderResultModel balancePayAmount(Long balancePayAmount) {
    this.balancePayAmount = balancePayAmount;
    return this;
  }

   /**
   * 余额支付金额（单位：分）
   * @return balancePayAmount
  **/
  public Long getBalancePayAmount() {
    return balancePayAmount;
  }

  public void setBalancePayAmount(Long balancePayAmount) {
    this.balancePayAmount = balancePayAmount;
  }

  public ConsoleAdminGetOrderResultModel actualPayAmount(Long actualPayAmount) {
    this.actualPayAmount = actualPayAmount;
    return this;
  }

   /**
   * 实付金额（单位：分）
   * @return actualPayAmount
  **/
  public Long getActualPayAmount() {
    return actualPayAmount;
  }

  public void setActualPayAmount(Long actualPayAmount) {
    this.actualPayAmount = actualPayAmount;
  }

  public ConsoleAdminGetOrderResultModel createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 订单创建时间
   * @return createTime
  **/
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public ConsoleAdminGetOrderResultModel tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID
   * @return tenantId
  **/
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public ConsoleAdminGetOrderResultModel paymentEndTime(Long paymentEndTime) {
    this.paymentEndTime = paymentEndTime;
    return this;
  }

   /**
   * 支付完成时间
   * @return paymentEndTime
  **/
  public Long getPaymentEndTime() {
    return paymentEndTime;
  }

  public void setPaymentEndTime(Long paymentEndTime) {
    this.paymentEndTime = paymentEndTime;
  }

  public ConsoleAdminGetOrderResultModel buyType(String buyType) {
    this.buyType = buyType;
    return this;
  }

   /**
   * 售卖类型
   * @return buyType
  **/
  public String getBuyType() {
    return buyType;
  }

  public void setBuyType(String buyType) {
    this.buyType = buyType;
  }

  public ConsoleAdminGetOrderResultModel voucherPayAmount(Long voucherPayAmount) {
    this.voucherPayAmount = voucherPayAmount;
    return this;
  }

   /**
   * 代金券抵扣金额（单位：分）
   * @return voucherPayAmount
  **/
  public Long getVoucherPayAmount() {
    return voucherPayAmount;
  }

  public void setVoucherPayAmount(Long voucherPayAmount) {
    this.voucherPayAmount = voucherPayAmount;
  }

  public ConsoleAdminGetOrderResultModel buyerUserId(String buyerUserId) {
    this.buyerUserId = buyerUserId;
    return this;
  }

   /**
   * 下单用户ID
   * @return buyerUserId
  **/
  public String getBuyerUserId() {
    return buyerUserId;
  }

  public void setBuyerUserId(String buyerUserId) {
    this.buyerUserId = buyerUserId;
  }

  public ConsoleAdminGetOrderResultModel endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 截止时间
   * @return endTime
  **/
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public ConsoleAdminGetOrderResultModel commodityName(String commodityName) {
    this.commodityName = commodityName;
    return this;
  }

   /**
   * 商品名称
   * @return commodityName
  **/
  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }

  public ConsoleAdminGetOrderResultModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 订单状态
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetOrderResultModel consoleAdminGetOrderResultModel = (ConsoleAdminGetOrderResultModel) o;
    return Objects.equals(this.orderType, consoleAdminGetOrderResultModel.orderType) &&
        Objects.equals(this.orderId, consoleAdminGetOrderResultModel.orderId) &&
        Objects.equals(this.attributeList, consoleAdminGetOrderResultModel.attributeList) &&
        Objects.equals(this.chargeType, consoleAdminGetOrderResultModel.chargeType) &&
        Objects.equals(this.discountAmount, consoleAdminGetOrderResultModel.discountAmount) &&
        Objects.equals(this.creditPayAmount, consoleAdminGetOrderResultModel.creditPayAmount) &&
        Objects.equals(this.downgradeRefundAmount, consoleAdminGetOrderResultModel.downgradeRefundAmount) &&
        Objects.equals(this.downgradeCreditRefundAmount, consoleAdminGetOrderResultModel.downgradeCreditRefundAmount) &&
        Objects.equals(this.discountDetail, consoleAdminGetOrderResultModel.discountDetail) &&
        Objects.equals(this.promotionName, consoleAdminGetOrderResultModel.promotionName) &&
        Objects.equals(this.instanceId, consoleAdminGetOrderResultModel.instanceId) &&
        Objects.equals(this.payAmount, consoleAdminGetOrderResultModel.payAmount) &&
        Objects.equals(this.tenantName, consoleAdminGetOrderResultModel.tenantName) &&
        Objects.equals(this.commodityCode, consoleAdminGetOrderResultModel.commodityCode) &&
        Objects.equals(this.autoRenew, consoleAdminGetOrderResultModel.autoRenew) &&
        Objects.equals(this.currency, consoleAdminGetOrderResultModel.currency) &&
        Objects.equals(this.startTime, consoleAdminGetOrderResultModel.startTime) &&
        Objects.equals(this.downgradeBalanceRefundAmount, consoleAdminGetOrderResultModel.downgradeBalanceRefundAmount) &&
        Objects.equals(this.primaryPriceType, consoleAdminGetOrderResultModel.primaryPriceType) &&
        Objects.equals(this.finishTime, consoleAdminGetOrderResultModel.finishTime) &&
        Objects.equals(this.amount, consoleAdminGetOrderResultModel.amount) &&
        Objects.equals(this.quantity, consoleAdminGetOrderResultModel.quantity) &&
        Objects.equals(this.deliveryEndTime, consoleAdminGetOrderResultModel.deliveryEndTime) &&
        Objects.equals(this.refundTime, consoleAdminGetOrderResultModel.refundTime) &&
        Objects.equals(this.buyDurationUnit, consoleAdminGetOrderResultModel.buyDurationUnit) &&
        Objects.equals(this.primaryChargeItemCode, consoleAdminGetOrderResultModel.primaryChargeItemCode) &&
        Objects.equals(this.payUserId, consoleAdminGetOrderResultModel.payUserId) &&
        Objects.equals(this.categoryCode, consoleAdminGetOrderResultModel.categoryCode) &&
        Objects.equals(this.buyDuration, consoleAdminGetOrderResultModel.buyDuration) &&
        Objects.equals(this.balancePayAmount, consoleAdminGetOrderResultModel.balancePayAmount) &&
        Objects.equals(this.actualPayAmount, consoleAdminGetOrderResultModel.actualPayAmount) &&
        Objects.equals(this.createTime, consoleAdminGetOrderResultModel.createTime) &&
        Objects.equals(this.tenantId, consoleAdminGetOrderResultModel.tenantId) &&
        Objects.equals(this.paymentEndTime, consoleAdminGetOrderResultModel.paymentEndTime) &&
        Objects.equals(this.buyType, consoleAdminGetOrderResultModel.buyType) &&
        Objects.equals(this.voucherPayAmount, consoleAdminGetOrderResultModel.voucherPayAmount) &&
        Objects.equals(this.buyerUserId, consoleAdminGetOrderResultModel.buyerUserId) &&
        Objects.equals(this.endTime, consoleAdminGetOrderResultModel.endTime) &&
        Objects.equals(this.commodityName, consoleAdminGetOrderResultModel.commodityName) &&
        Objects.equals(this.status, consoleAdminGetOrderResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, orderId, attributeList, chargeType, discountAmount, creditPayAmount, downgradeRefundAmount, downgradeCreditRefundAmount, discountDetail, promotionName, instanceId, payAmount, tenantName, commodityCode, autoRenew, currency, startTime, downgradeBalanceRefundAmount, primaryPriceType, finishTime, amount, quantity, deliveryEndTime, refundTime, buyDurationUnit, primaryChargeItemCode, payUserId, categoryCode, buyDuration, balancePayAmount, actualPayAmount, createTime, tenantId, paymentEndTime, buyType, voucherPayAmount, buyerUserId, endTime, commodityName, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetOrderResultModel {");
    
    sb.append(",orderType: ").append(toIndentedString(orderType));
    sb.append(",orderId: ").append(toIndentedString(orderId));
    sb.append(",attributeList: ").append(toIndentedString(attributeList));
    sb.append(",chargeType: ").append(toIndentedString(chargeType));
    sb.append(",discountAmount: ").append(toIndentedString(discountAmount));
    sb.append(",creditPayAmount: ").append(toIndentedString(creditPayAmount));
    sb.append(",downgradeRefundAmount: ").append(toIndentedString(downgradeRefundAmount));
    sb.append(",downgradeCreditRefundAmount: ").append(toIndentedString(downgradeCreditRefundAmount));
    sb.append(",discountDetail: ").append(toIndentedString(discountDetail));
    sb.append(",promotionName: ").append(toIndentedString(promotionName));
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",payAmount: ").append(toIndentedString(payAmount));
    sb.append(",tenantName: ").append(toIndentedString(tenantName));
    sb.append(",commodityCode: ").append(toIndentedString(commodityCode));
    sb.append(",autoRenew: ").append(toIndentedString(autoRenew));
    sb.append(",currency: ").append(toIndentedString(currency));
    sb.append(",startTime: ").append(toIndentedString(startTime));
    sb.append(",downgradeBalanceRefundAmount: ").append(toIndentedString(downgradeBalanceRefundAmount));
    sb.append(",primaryPriceType: ").append(toIndentedString(primaryPriceType));
    sb.append(",finishTime: ").append(toIndentedString(finishTime));
    sb.append(",amount: ").append(toIndentedString(amount));
    sb.append(",quantity: ").append(toIndentedString(quantity));
    sb.append(",deliveryEndTime: ").append(toIndentedString(deliveryEndTime));
    sb.append(",refundTime: ").append(toIndentedString(refundTime));
    sb.append(",buyDurationUnit: ").append(toIndentedString(buyDurationUnit));
    sb.append(",primaryChargeItemCode: ").append(toIndentedString(primaryChargeItemCode));
    sb.append(",payUserId: ").append(toIndentedString(payUserId));
    sb.append(",categoryCode: ").append(toIndentedString(categoryCode));
    sb.append(",buyDuration: ").append(toIndentedString(buyDuration));
    sb.append(",balancePayAmount: ").append(toIndentedString(balancePayAmount));
    sb.append(",actualPayAmount: ").append(toIndentedString(actualPayAmount));
    sb.append(",createTime: ").append(toIndentedString(createTime));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",paymentEndTime: ").append(toIndentedString(paymentEndTime));
    sb.append(",buyType: ").append(toIndentedString(buyType));
    sb.append(",voucherPayAmount: ").append(toIndentedString(voucherPayAmount));
    sb.append(",buyerUserId: ").append(toIndentedString(buyerUserId));
    sb.append(",endTime: ").append(toIndentedString(endTime));
    sb.append(",commodityName: ").append(toIndentedString(commodityName));
    sb.append(",status: ").append(toIndentedString(status));
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
