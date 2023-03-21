/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveJoinPartyResultExtInfo;
import com.alibaba.yjopenapi.client.model.InteractiveJoinPartyResultModelPlayerList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * 获取结果
 */
public class InteractiveJoinPartyResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<InteractiveJoinPartyResultModelPlayerList> playerList = null;


  private InteractiveJoinPartyResultExtInfo extInfo = null;


  public InteractiveJoinPartyResultModel playerList(List<InteractiveJoinPartyResultModelPlayerList> playerList) {
    this.playerList = playerList;
    return this;
  }

  public InteractiveJoinPartyResultModel addPlayerListItem(InteractiveJoinPartyResultModelPlayerList playerListItem) {
    if (this.playerList == null) {
      this.playerList = new ArrayList<InteractiveJoinPartyResultModelPlayerList>();
    }
    this.playerList.add(playerListItem);
    return this;
  }

   /**
   * Get playerList
   * @return playerList
  **/
  public List<InteractiveJoinPartyResultModelPlayerList> getPlayerList() {
    return playerList;
  }

  public void setPlayerList(List<InteractiveJoinPartyResultModelPlayerList> playerList) {
    this.playerList = playerList;
  }

  public InteractiveJoinPartyResultModel extInfo(InteractiveJoinPartyResultExtInfo extInfo) {
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  public InteractiveJoinPartyResultExtInfo getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(InteractiveJoinPartyResultExtInfo extInfo) {
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
    InteractiveJoinPartyResultModel interactiveJoinPartyResultModel = (InteractiveJoinPartyResultModel) o;
    return Objects.equals(this.playerList, interactiveJoinPartyResultModel.playerList) &&
        Objects.equals(this.extInfo, interactiveJoinPartyResultModel.extInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerList, extInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveJoinPartyResultModel {");
    
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
