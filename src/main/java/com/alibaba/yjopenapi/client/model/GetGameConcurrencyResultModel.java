/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.GetGameConcurrencyResultModelPlayingRegionList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * GetGameConcurrencyResultModel
 */
public class GetGameConcurrencyResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private Long currentTime = null;


  private List<GetGameConcurrencyResultModelPlayingRegionList> playingRegionList = null;


  private String code = null;


  private Long playingTotal = null;


  private Boolean success = null;


  private Long queuingTotal = null;


  private String message = null;


  private String projectId = null;


  public GetGameConcurrencyResultModel gameId(String gameId) {
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

  public GetGameConcurrencyResultModel currentTime(Long currentTime) {
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

  public GetGameConcurrencyResultModel playingRegionList(List<GetGameConcurrencyResultModelPlayingRegionList> playingRegionList) {
    this.playingRegionList = playingRegionList;
    return this;
  }

  public GetGameConcurrencyResultModel addPlayingRegionListItem(GetGameConcurrencyResultModelPlayingRegionList playingRegionListItem) {
    if (this.playingRegionList == null) {
      this.playingRegionList = new ArrayList<GetGameConcurrencyResultModelPlayingRegionList>();
    }
    this.playingRegionList.add(playingRegionListItem);
    return this;
  }

   /**
   * 当前游戏region维度游戏中人数统计
   * @return playingRegionList
  **/
  public List<GetGameConcurrencyResultModelPlayingRegionList> getPlayingRegionList() {
    return playingRegionList;
  }

  public void setPlayingRegionList(List<GetGameConcurrencyResultModelPlayingRegionList> playingRegionList) {
    this.playingRegionList = playingRegionList;
  }

  public GetGameConcurrencyResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetGameConcurrencyResultModel playingTotal(Long playingTotal) {
    this.playingTotal = playingTotal;
    return this;
  }

   /**
   * 当前游戏中人数
   * @return playingTotal
  **/
  public Long getPlayingTotal() {
    return playingTotal;
  }

  public void setPlayingTotal(Long playingTotal) {
    this.playingTotal = playingTotal;
  }

  public GetGameConcurrencyResultModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 查询结果
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public GetGameConcurrencyResultModel queuingTotal(Long queuingTotal) {
    this.queuingTotal = queuingTotal;
    return this;
  }

   /**
   * 当前排队人数
   * @return queuingTotal
  **/
  public Long getQueuingTotal() {
    return queuingTotal;
  }

  public void setQueuingTotal(Long queuingTotal) {
    this.queuingTotal = queuingTotal;
  }

  public GetGameConcurrencyResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 错误信息
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetGameConcurrencyResultModel projectId(String projectId) {
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
    GetGameConcurrencyResultModel getGameConcurrencyResultModel = (GetGameConcurrencyResultModel) o;
    return Objects.equals(this.gameId, getGameConcurrencyResultModel.gameId) &&
        Objects.equals(this.currentTime, getGameConcurrencyResultModel.currentTime) &&
        Objects.equals(this.playingRegionList, getGameConcurrencyResultModel.playingRegionList) &&
        Objects.equals(this.code, getGameConcurrencyResultModel.code) &&
        Objects.equals(this.playingTotal, getGameConcurrencyResultModel.playingTotal) &&
        Objects.equals(this.success, getGameConcurrencyResultModel.success) &&
        Objects.equals(this.queuingTotal, getGameConcurrencyResultModel.queuingTotal) &&
        Objects.equals(this.message, getGameConcurrencyResultModel.message) &&
        Objects.equals(this.projectId, getGameConcurrencyResultModel.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, currentTime, playingRegionList, code, playingTotal, success, queuingTotal, message, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGameConcurrencyResultModel {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",currentTime: ").append(toIndentedString(currentTime));
    sb.append(",playingRegionList: ").append(toIndentedString(playingRegionList));
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",playingTotal: ").append(toIndentedString(playingTotal));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",queuingTotal: ").append(toIndentedString(queuingTotal));
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
