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
 * MultiplayDemoCloseMultiPlayResultModel
 */
public class MultiplayDemoCloseMultiPlayResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long dataVer = null;


  public MultiplayDemoCloseMultiPlayResultModel dataVer(Long dataVer) {
    this.dataVer = dataVer;
    return this;
  }

   /**
   * Get dataVer
   * @return dataVer
  **/
  public Long getDataVer() {
    return dataVer;
  }

  public void setDataVer(Long dataVer) {
    this.dataVer = dataVer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoCloseMultiPlayResultModel multiplayDemoCloseMultiPlayResultModel = (MultiplayDemoCloseMultiPlayResultModel) o;
    return Objects.equals(this.dataVer, multiplayDemoCloseMultiPlayResultModel.dataVer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoCloseMultiPlayResultModel {");
    
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
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
