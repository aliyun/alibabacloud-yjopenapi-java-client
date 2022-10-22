/*
 * 
 * YuanJing OpenAPI SDK
 *
 * OpenAPI spec version: 1.0.20221015-beta
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
/**
 * 实例库存信息
 */
public class GetStockResultInstanceStockList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String instanceId = null;


  private String instanceRegionId = null;


  private Integer instanceUserLevel = null;


  private Integer instanceTotal = null;


  private Integer instanceUsedTotal = null;


  private Integer instanceAvailableTotal = null;


  private Integer instanceGameTotal = null;


  private Integer instanceGameUsedTotal = null;


  private Integer instanceGameAvailableTotal = null;


  public GetStockResultInstanceStockList instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 实例id
   * @return instanceId
  **/
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public GetStockResultInstanceStockList instanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
    return this;
  }

   /**
   * 实例大区ID
   * @return instanceRegionId
  **/
  public String getInstanceRegionId() {
    return instanceRegionId;
  }

  public void setInstanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
  }

  public GetStockResultInstanceStockList instanceUserLevel(Integer instanceUserLevel) {
    this.instanceUserLevel = instanceUserLevel;
    return this;
  }

   /**
   * 实例调度等级
   * @return instanceUserLevel
  **/
  public Integer getInstanceUserLevel() {
    return instanceUserLevel;
  }

  public void setInstanceUserLevel(Integer instanceUserLevel) {
    this.instanceUserLevel = instanceUserLevel;
  }

  public GetStockResultInstanceStockList instanceTotal(Integer instanceTotal) {
    this.instanceTotal = instanceTotal;
    return this;
  }

   /**
   * 实例总路数
   * @return instanceTotal
  **/
  public Integer getInstanceTotal() {
    return instanceTotal;
  }

  public void setInstanceTotal(Integer instanceTotal) {
    this.instanceTotal = instanceTotal;
  }

  public GetStockResultInstanceStockList instanceUsedTotal(Integer instanceUsedTotal) {
    this.instanceUsedTotal = instanceUsedTotal;
    return this;
  }

   /**
   * 实例已用路数
   * @return instanceUsedTotal
  **/
  public Integer getInstanceUsedTotal() {
    return instanceUsedTotal;
  }

  public void setInstanceUsedTotal(Integer instanceUsedTotal) {
    this.instanceUsedTotal = instanceUsedTotal;
  }

  public GetStockResultInstanceStockList instanceAvailableTotal(Integer instanceAvailableTotal) {
    this.instanceAvailableTotal = instanceAvailableTotal;
    return this;
  }

   /**
   * 实例可用路数
   * @return instanceAvailableTotal
  **/
  public Integer getInstanceAvailableTotal() {
    return instanceAvailableTotal;
  }

  public void setInstanceAvailableTotal(Integer instanceAvailableTotal) {
    this.instanceAvailableTotal = instanceAvailableTotal;
  }

  public GetStockResultInstanceStockList instanceGameTotal(Integer instanceGameTotal) {
    this.instanceGameTotal = instanceGameTotal;
    return this;
  }

   /**
   * 实例配置游戏总路数
   * @return instanceGameTotal
  **/
  public Integer getInstanceGameTotal() {
    return instanceGameTotal;
  }

  public void setInstanceGameTotal(Integer instanceGameTotal) {
    this.instanceGameTotal = instanceGameTotal;
  }

  public GetStockResultInstanceStockList instanceGameUsedTotal(Integer instanceGameUsedTotal) {
    this.instanceGameUsedTotal = instanceGameUsedTotal;
    return this;
  }

   /**
   * 实例游戏当前已使用路数
   * @return instanceGameUsedTotal
  **/
  public Integer getInstanceGameUsedTotal() {
    return instanceGameUsedTotal;
  }

  public void setInstanceGameUsedTotal(Integer instanceGameUsedTotal) {
    this.instanceGameUsedTotal = instanceGameUsedTotal;
  }

  public GetStockResultInstanceStockList instanceGameAvailableTotal(Integer instanceGameAvailableTotal) {
    this.instanceGameAvailableTotal = instanceGameAvailableTotal;
    return this;
  }

   /**
   * 实例游戏当前可使用路数
   * @return instanceGameAvailableTotal
  **/
  public Integer getInstanceGameAvailableTotal() {
    return instanceGameAvailableTotal;
  }

  public void setInstanceGameAvailableTotal(Integer instanceGameAvailableTotal) {
    this.instanceGameAvailableTotal = instanceGameAvailableTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStockResultInstanceStockList getStockResultInstanceStockList = (GetStockResultInstanceStockList) o;
    return Objects.equals(this.instanceId, getStockResultInstanceStockList.instanceId) &&
        Objects.equals(this.instanceRegionId, getStockResultInstanceStockList.instanceRegionId) &&
        Objects.equals(this.instanceUserLevel, getStockResultInstanceStockList.instanceUserLevel) &&
        Objects.equals(this.instanceTotal, getStockResultInstanceStockList.instanceTotal) &&
        Objects.equals(this.instanceUsedTotal, getStockResultInstanceStockList.instanceUsedTotal) &&
        Objects.equals(this.instanceAvailableTotal, getStockResultInstanceStockList.instanceAvailableTotal) &&
        Objects.equals(this.instanceGameTotal, getStockResultInstanceStockList.instanceGameTotal) &&
        Objects.equals(this.instanceGameUsedTotal, getStockResultInstanceStockList.instanceGameUsedTotal) &&
        Objects.equals(this.instanceGameAvailableTotal, getStockResultInstanceStockList.instanceGameAvailableTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, instanceRegionId, instanceUserLevel, instanceTotal, instanceUsedTotal, instanceAvailableTotal, instanceGameTotal, instanceGameUsedTotal, instanceGameAvailableTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStockResultInstanceStockList {");
    
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",instanceRegionId: ").append(toIndentedString(instanceRegionId));
    sb.append(",instanceUserLevel: ").append(toIndentedString(instanceUserLevel));
    sb.append(",instanceTotal: ").append(toIndentedString(instanceTotal));
    sb.append(",instanceUsedTotal: ").append(toIndentedString(instanceUsedTotal));
    sb.append(",instanceAvailableTotal: ").append(toIndentedString(instanceAvailableTotal));
    sb.append(",instanceGameTotal: ").append(toIndentedString(instanceGameTotal));
    sb.append(",instanceGameUsedTotal: ").append(toIndentedString(instanceGameUsedTotal));
    sb.append(",instanceGameAvailableTotal: ").append(toIndentedString(instanceGameAvailableTotal));
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
