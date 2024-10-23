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
 * GetStockResultModelInstanceStockList
 */
public class GetStockResultModelInstanceStockList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String instanceId = null;


  private Integer instanceGameAvailableTotal = null;


  private Integer instanceTotal = null;


  private Integer instanceAvailableTotal = null;


  private Integer instanceGameTotal = null;


  private Integer instanceUsedTotal = null;


  private Integer instanceGameUsedTotal = null;


  private String instanceRegionId = null;


  private Integer instanceUserLevel = null;


  public GetStockResultModelInstanceStockList instanceId(String instanceId) {
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

  public GetStockResultModelInstanceStockList instanceGameAvailableTotal(Integer instanceGameAvailableTotal) {
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

  public GetStockResultModelInstanceStockList instanceTotal(Integer instanceTotal) {
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

  public GetStockResultModelInstanceStockList instanceAvailableTotal(Integer instanceAvailableTotal) {
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

  public GetStockResultModelInstanceStockList instanceGameTotal(Integer instanceGameTotal) {
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

  public GetStockResultModelInstanceStockList instanceUsedTotal(Integer instanceUsedTotal) {
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

  public GetStockResultModelInstanceStockList instanceGameUsedTotal(Integer instanceGameUsedTotal) {
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

  public GetStockResultModelInstanceStockList instanceRegionId(String instanceRegionId) {
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

  public GetStockResultModelInstanceStockList instanceUserLevel(Integer instanceUserLevel) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStockResultModelInstanceStockList getStockResultModelInstanceStockList = (GetStockResultModelInstanceStockList) o;
    return Objects.equals(this.instanceId, getStockResultModelInstanceStockList.instanceId) &&
        Objects.equals(this.instanceGameAvailableTotal, getStockResultModelInstanceStockList.instanceGameAvailableTotal) &&
        Objects.equals(this.instanceTotal, getStockResultModelInstanceStockList.instanceTotal) &&
        Objects.equals(this.instanceAvailableTotal, getStockResultModelInstanceStockList.instanceAvailableTotal) &&
        Objects.equals(this.instanceGameTotal, getStockResultModelInstanceStockList.instanceGameTotal) &&
        Objects.equals(this.instanceUsedTotal, getStockResultModelInstanceStockList.instanceUsedTotal) &&
        Objects.equals(this.instanceGameUsedTotal, getStockResultModelInstanceStockList.instanceGameUsedTotal) &&
        Objects.equals(this.instanceRegionId, getStockResultModelInstanceStockList.instanceRegionId) &&
        Objects.equals(this.instanceUserLevel, getStockResultModelInstanceStockList.instanceUserLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, instanceGameAvailableTotal, instanceTotal, instanceAvailableTotal, instanceGameTotal, instanceUsedTotal, instanceGameUsedTotal, instanceRegionId, instanceUserLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStockResultModelInstanceStockList {");
    
    sb.append(",instanceId: ").append(toIndentedString(instanceId));
    sb.append(",instanceGameAvailableTotal: ").append(toIndentedString(instanceGameAvailableTotal));
    sb.append(",instanceTotal: ").append(toIndentedString(instanceTotal));
    sb.append(",instanceAvailableTotal: ").append(toIndentedString(instanceAvailableTotal));
    sb.append(",instanceGameTotal: ").append(toIndentedString(instanceGameTotal));
    sb.append(",instanceUsedTotal: ").append(toIndentedString(instanceUsedTotal));
    sb.append(",instanceGameUsedTotal: ").append(toIndentedString(instanceGameUsedTotal));
    sb.append(",instanceRegionId: ").append(toIndentedString(instanceRegionId));
    sb.append(",instanceUserLevel: ").append(toIndentedString(instanceUserLevel));
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
