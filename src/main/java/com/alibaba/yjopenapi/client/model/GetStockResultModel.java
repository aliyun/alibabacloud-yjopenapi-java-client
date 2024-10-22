/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.GetStockResultModelInstanceStockList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * GetStockResultModel
 */
public class GetStockResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private Long currentTime = null;


  private String code = null;


  private String requestId = null;


  private Boolean success = null;


  private String message = null;


  private Integer quotaTotal = null;


  private Integer usedTotal = null;


  private String projectId = null;


  private Integer availableTotal = null;


  private List<GetStockResultModelInstanceStockList> instanceStockList = null;


  public GetStockResultModel gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Paas平台游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public GetStockResultModel currentTime(Long currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * 当前毫秒时间戳
   * @return currentTime
  **/
  public Long getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(Long currentTime) {
    this.currentTime = currentTime;
  }

  public GetStockResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 返回码
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetStockResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求链路唯一标示
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GetStockResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 调度执行结果
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public GetStockResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 返回信息
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetStockResultModel quotaTotal(Integer quotaTotal) {
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * 总路数
   * @return quotaTotal
  **/
  public Integer getQuotaTotal() {
    return quotaTotal;
  }

  public void setQuotaTotal(Integer quotaTotal) {
    this.quotaTotal = quotaTotal;
  }

  public GetStockResultModel usedTotal(Integer usedTotal) {
    this.usedTotal = usedTotal;
    return this;
  }

   /**
   * 已使用路数
   * @return usedTotal
  **/
  public Integer getUsedTotal() {
    return usedTotal;
  }

  public void setUsedTotal(Integer usedTotal) {
    this.usedTotal = usedTotal;
  }

  public GetStockResultModel projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 游戏归属的项目Id
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GetStockResultModel availableTotal(Integer availableTotal) {
    this.availableTotal = availableTotal;
    return this;
  }

   /**
   * 可用剩余路数
   * @return availableTotal
  **/
  public Integer getAvailableTotal() {
    return availableTotal;
  }

  public void setAvailableTotal(Integer availableTotal) {
    this.availableTotal = availableTotal;
  }

  public GetStockResultModel instanceStockList(List<GetStockResultModelInstanceStockList> instanceStockList) {
    this.instanceStockList = instanceStockList;
    return this;
  }

  public GetStockResultModel addInstanceStockListItem(GetStockResultModelInstanceStockList instanceStockListItem) {
    if (this.instanceStockList == null) {
      this.instanceStockList = new ArrayList<GetStockResultModelInstanceStockList>();
    }
    this.instanceStockList.add(instanceStockListItem);
    return this;
  }

   /**
   * Get instanceStockList
   * @return instanceStockList
  **/
  public List<GetStockResultModelInstanceStockList> getInstanceStockList() {
    return instanceStockList;
  }

  public void setInstanceStockList(List<GetStockResultModelInstanceStockList> instanceStockList) {
    this.instanceStockList = instanceStockList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStockResultModel getStockResultModel = (GetStockResultModel) o;
    return Objects.equals(this.gameId, getStockResultModel.gameId) &&
        Objects.equals(this.currentTime, getStockResultModel.currentTime) &&
        Objects.equals(this.code, getStockResultModel.code) &&
        Objects.equals(this.requestId, getStockResultModel.requestId) &&
        Objects.equals(this.success, getStockResultModel.success) &&
        Objects.equals(this.message, getStockResultModel.message) &&
        Objects.equals(this.quotaTotal, getStockResultModel.quotaTotal) &&
        Objects.equals(this.usedTotal, getStockResultModel.usedTotal) &&
        Objects.equals(this.projectId, getStockResultModel.projectId) &&
        Objects.equals(this.availableTotal, getStockResultModel.availableTotal) &&
        Objects.equals(this.instanceStockList, getStockResultModel.instanceStockList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, currentTime, code, requestId, success, message, quotaTotal, usedTotal, projectId, availableTotal, instanceStockList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStockResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",currentTime: ").append(toIndentedString(currentTime));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",quotaTotal: ").append(toIndentedString(quotaTotal));
    sb.append(",usedTotal: ").append(toIndentedString(usedTotal));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",availableTotal: ").append(toIndentedString(availableTotal));
    sb.append(",instanceStockList: ").append(toIndentedString(instanceStockList));
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
