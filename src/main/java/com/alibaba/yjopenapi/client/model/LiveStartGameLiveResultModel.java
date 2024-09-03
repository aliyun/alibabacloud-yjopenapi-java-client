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
 * LiveStartGameLiveResultModel
 */
public class LiveStartGameLiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean data = null;


  private String liveId = null;


  private String status = null;


  public LiveStartGameLiveResultModel data(Boolean data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public Boolean getData() {
    return data;
  }

  public void setData(Boolean data) {
    this.data = data;
  }

  public LiveStartGameLiveResultModel liveId(String liveId) {
    this.liveId = liveId;
    return this;
  }

   /**
   * Get liveId
   * @return liveId
  **/
  public String getLiveId() {
    return liveId;
  }

  public void setLiveId(String liveId) {
    this.liveId = liveId;
  }

  public LiveStartGameLiveResultModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStartGameLiveResultModel liveStartGameLiveResultModel = (LiveStartGameLiveResultModel) o;
    return Objects.equals(this.data, liveStartGameLiveResultModel.data) &&
        Objects.equals(this.liveId, liveStartGameLiveResultModel.liveId) &&
        Objects.equals(this.status, liveStartGameLiveResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, liveId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStartGameLiveResultModel {");
    
    sb.append(",data: ").append(toIndentedString(data));
    sb.append(",liveId: ").append(toIndentedString(liveId));
    sb.append(",status: ").append(toIndentedString(status));
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
