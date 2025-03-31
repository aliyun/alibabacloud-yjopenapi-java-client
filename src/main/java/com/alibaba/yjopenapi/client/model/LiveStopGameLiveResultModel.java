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
 * LiveStopGameLiveResultModel
 */
public class LiveStopGameLiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean data = null;


  public LiveStopGameLiveResultModel data(Boolean data) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStopGameLiveResultModel liveStopGameLiveResultModel = (LiveStopGameLiveResultModel) o;
    return Objects.equals(this.data, liveStopGameLiveResultModel.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStopGameLiveResultModel {");
    
    sb.append(",data: ").append(toIndentedString(data));
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
