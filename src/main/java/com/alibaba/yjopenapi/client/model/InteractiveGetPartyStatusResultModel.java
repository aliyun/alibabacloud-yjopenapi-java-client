/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyStatusResultModelPlayList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * 获取结果
 */
public class InteractiveGetPartyStatusResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String mixGameId = null;


  private String creator = null;


  private Integer maxPlayerNum = null;


  private Integer currentPlayerNum = null;


  private Integer status = null;


  private String projectId = null;


  private List<InteractiveGetPartyStatusResultModelPlayList> playerList = null;


  public InteractiveGetPartyStatusResultModel partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * 派对Id
   * @return partyId
  **/
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public InteractiveGetPartyStatusResultModel mixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
    return this;
  }

   /**
   * 游戏Id
   * @return mixGameId
  **/
  public String getMixGameId() {
    return mixGameId;
  }

  public void setMixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
  }

  public InteractiveGetPartyStatusResultModel creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * 派对创建者
   * @return creator
  **/
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public InteractiveGetPartyStatusResultModel maxPlayerNum(Integer maxPlayerNum) {
    this.maxPlayerNum = maxPlayerNum;
    return this;
  }

   /**
   * 最大游戏人数
   * @return maxPlayerNum
  **/
  public Integer getMaxPlayerNum() {
    return maxPlayerNum;
  }

  public void setMaxPlayerNum(Integer maxPlayerNum) {
    this.maxPlayerNum = maxPlayerNum;
  }

  public InteractiveGetPartyStatusResultModel currentPlayerNum(Integer currentPlayerNum) {
    this.currentPlayerNum = currentPlayerNum;
    return this;
  }

   /**
   * 当前派对人数
   * @return currentPlayerNum
  **/
  public Integer getCurrentPlayerNum() {
    return currentPlayerNum;
  }

  public void setCurrentPlayerNum(Integer currentPlayerNum) {
    this.currentPlayerNum = currentPlayerNum;
  }

  public InteractiveGetPartyStatusResultModel status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 派对状态
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InteractiveGetPartyStatusResultModel projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 派对绑定项目ID
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public InteractiveGetPartyStatusResultModel playerList(List<InteractiveGetPartyStatusResultModelPlayList> playerList) {
    this.playerList = playerList;
    return this;
  }

  public InteractiveGetPartyStatusResultModel addPlayerListItem(InteractiveGetPartyStatusResultModelPlayList playerListItem) {
    if (this.playerList == null) {
      this.playerList = new ArrayList<InteractiveGetPartyStatusResultModelPlayList>();
    }
    this.playerList.add(playerListItem);
    return this;
  }

   /**
   * Get playerList
   * @return playerList
  **/
  public List<InteractiveGetPartyStatusResultModelPlayList> getPlayerList() {
    return playerList;
  }

  public void setPlayerList(List<InteractiveGetPartyStatusResultModelPlayList> playerList) {
    this.playerList = playerList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveGetPartyStatusResultModel interactiveGetPartyStatusResultModel = (InteractiveGetPartyStatusResultModel) o;
    return Objects.equals(this.partyId, interactiveGetPartyStatusResultModel.partyId) &&
        Objects.equals(this.mixGameId, interactiveGetPartyStatusResultModel.mixGameId) &&
        Objects.equals(this.creator, interactiveGetPartyStatusResultModel.creator) &&
        Objects.equals(this.maxPlayerNum, interactiveGetPartyStatusResultModel.maxPlayerNum) &&
        Objects.equals(this.currentPlayerNum, interactiveGetPartyStatusResultModel.currentPlayerNum) &&
        Objects.equals(this.status, interactiveGetPartyStatusResultModel.status) &&
        Objects.equals(this.projectId, interactiveGetPartyStatusResultModel.projectId) &&
        Objects.equals(this.playerList, interactiveGetPartyStatusResultModel.playerList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, mixGameId, creator, maxPlayerNum, currentPlayerNum, status, projectId, playerList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyStatusResultModel {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",mixGameId: ").append(toIndentedString(mixGameId));
    sb.append(",creator: ").append(toIndentedString(creator));
    sb.append(",maxPlayerNum: ").append(toIndentedString(maxPlayerNum));
    sb.append(",currentPlayerNum: ").append(toIndentedString(currentPlayerNum));
    sb.append(",status: ").append(toIndentedString(status));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",playerList: ").append(toIndentedString(playerList));
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
