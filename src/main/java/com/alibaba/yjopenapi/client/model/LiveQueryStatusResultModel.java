/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.LiveQueryStatusResultModelLiveList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * LiveQueryStatusResultModel
 */
public class LiveQueryStatusResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<LiveQueryStatusResultModelLiveList> liveList = null;


  public LiveQueryStatusResultModel liveList(List<LiveQueryStatusResultModelLiveList> liveList) {
    this.liveList = liveList;
    return this;
  }

  public LiveQueryStatusResultModel addLiveListItem(LiveQueryStatusResultModelLiveList liveListItem) {
    if (this.liveList == null) {
      this.liveList = new ArrayList<LiveQueryStatusResultModelLiveList>();
    }
    this.liveList.add(liveListItem);
    return this;
  }

   /**
   * Get liveList
   * @return liveList
  **/
  public List<LiveQueryStatusResultModelLiveList> getLiveList() {
    return liveList;
  }

  public void setLiveList(List<LiveQueryStatusResultModelLiveList> liveList) {
    this.liveList = liveList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveQueryStatusResultModel liveQueryStatusResultModel = (LiveQueryStatusResultModel) o;
    return Objects.equals(this.liveList, liveQueryStatusResultModel.liveList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveQueryStatusResultModel {");
    
    sb.append(",liveList: ").append(toIndentedString(liveList));
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
