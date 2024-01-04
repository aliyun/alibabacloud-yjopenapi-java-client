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
 * AdaptQueryRequestByIdResultModel
 */
public class AdaptQueryRequestByIdResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer state = null;


  public AdaptQueryRequestByIdResultModel state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * 状态0:待适配 1:适配中 2:适配完成 3:适配失败
   * @return state
  **/
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptQueryRequestByIdResultModel adaptQueryRequestByIdResultModel = (AdaptQueryRequestByIdResultModel) o;
    return Objects.equals(this.state, adaptQueryRequestByIdResultModel.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptQueryRequestByIdResultModel {");
    
    sb.append(",state: ").append(toIndentedString(state));
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
