/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveModifySeatsResultModelPlayerList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * 获取结果
 */
public class InteractiveModifySeatsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<InteractiveModifySeatsResultModelPlayerList> playerList = null;


  private String extInfo = null;


  public InteractiveModifySeatsResultModel playerList(List<InteractiveModifySeatsResultModelPlayerList> playerList) {
    this.playerList = playerList;
    return this;
  }

  public InteractiveModifySeatsResultModel addPlayerListItem(InteractiveModifySeatsResultModelPlayerList playerListItem) {
    if (this.playerList == null) {
      this.playerList = new ArrayList<InteractiveModifySeatsResultModelPlayerList>();
    }
    this.playerList.add(playerListItem);
    return this;
  }

   /**
   * Get playerList
   * @return playerList
  **/
  public List<InteractiveModifySeatsResultModelPlayerList> getPlayerList() {
    return playerList;
  }

  public void setPlayerList(List<InteractiveModifySeatsResultModelPlayerList> playerList) {
    this.playerList = playerList;
  }

  public InteractiveModifySeatsResultModel extInfo(String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveModifySeatsResultModel interactiveModifySeatsResultModel = (InteractiveModifySeatsResultModel) o;
    return Objects.equals(this.playerList, interactiveModifySeatsResultModel.playerList) &&
        Objects.equals(this.extInfo, interactiveModifySeatsResultModel.extInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerList, extInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveModifySeatsResultModel {");
    
    sb.append(",playerList: ").append(toIndentedString(playerList));
    sb.append(",extInfo: ").append(toIndentedString(extInfo));
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
