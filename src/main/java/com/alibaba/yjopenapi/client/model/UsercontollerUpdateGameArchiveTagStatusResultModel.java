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
 * UsercontollerUpdateGameArchiveTagStatusResultModel
 */
public class UsercontollerUpdateGameArchiveTagStatusResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer status = null;


  public UsercontollerUpdateGameArchiveTagStatusResultModel status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 状态
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
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
    UsercontollerUpdateGameArchiveTagStatusResultModel usercontollerUpdateGameArchiveTagStatusResultModel = (UsercontollerUpdateGameArchiveTagStatusResultModel) o;
    return Objects.equals(this.status, usercontollerUpdateGameArchiveTagStatusResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerUpdateGameArchiveTagStatusResultModel {");
    
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
