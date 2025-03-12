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
 * BatchStopGameResultModel
 */
public class BatchStopGameResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String trackInfo = null;


  private String code = null;


  private String requestId = null;


  private Boolean success = null;


  private String message = null;


  private String projectId = null;


  public BatchStopGameResultModel gameId(String gameId) {
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

  public BatchStopGameResultModel trackInfo(String trackInfo) {
    this.trackInfo = trackInfo;
    return this;
  }

   /**
   * 批量停止的回传trackInfo
   * @return trackInfo
  **/
  public String getTrackInfo() {
    return trackInfo;
  }

  public void setTrackInfo(String trackInfo) {
    this.trackInfo = trackInfo;
  }

  public BatchStopGameResultModel code(String code) {
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

  public BatchStopGameResultModel requestId(String requestId) {
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

  public BatchStopGameResultModel success(Boolean success) {
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

  public BatchStopGameResultModel message(String message) {
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

  public BatchStopGameResultModel projectId(String projectId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStopGameResultModel batchStopGameResultModel = (BatchStopGameResultModel) o;
    return Objects.equals(this.gameId, batchStopGameResultModel.gameId) &&
        Objects.equals(this.trackInfo, batchStopGameResultModel.trackInfo) &&
        Objects.equals(this.code, batchStopGameResultModel.code) &&
        Objects.equals(this.requestId, batchStopGameResultModel.requestId) &&
        Objects.equals(this.success, batchStopGameResultModel.success) &&
        Objects.equals(this.message, batchStopGameResultModel.message) &&
        Objects.equals(this.projectId, batchStopGameResultModel.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, trackInfo, code, requestId, success, message, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStopGameResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",trackInfo: ").append(toIndentedString(trackInfo));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",message: ").append(toIndentedString(message));
    sb.append(",projectId: ").append(toIndentedString(projectId));
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
