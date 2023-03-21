/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveKickOutUserResultModelPlayerList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * 获取结果
 */
public class InteractiveKickOutUserResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<InteractiveKickOutUserResultModelPlayerList> playerList = null;


  public InteractiveKickOutUserResultModel playerList(List<InteractiveKickOutUserResultModelPlayerList> playerList) {
    this.playerList = playerList;
    return this;
  }

  public InteractiveKickOutUserResultModel addPlayerListItem(InteractiveKickOutUserResultModelPlayerList playerListItem) {
    if (this.playerList == null) {
      this.playerList = new ArrayList<InteractiveKickOutUserResultModelPlayerList>();
    }
    this.playerList.add(playerListItem);
    return this;
  }

   /**
   * 派对Id
   * @return playerList
  **/
  public List<InteractiveKickOutUserResultModelPlayerList> getPlayerList() {
    return playerList;
  }

  public void setPlayerList(List<InteractiveKickOutUserResultModelPlayerList> playerList) {
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
    InteractiveKickOutUserResultModel interactiveKickOutUserResultModel = (InteractiveKickOutUserResultModel) o;
    return Objects.equals(this.playerList, interactiveKickOutUserResultModel.playerList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveKickOutUserResultModel {");
    
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
