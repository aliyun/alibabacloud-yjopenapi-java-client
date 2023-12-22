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
 * ListGameServerIpForms
 */
public class ListGameServerIpForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long pageSize = null;


  private String nextToken = null;


  public ListGameServerIpForms pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页大小，默认100
   * @return pageSize
  **/
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListGameServerIpForms nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * 分页标识
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGameServerIpForms listGameServerIpForms = (ListGameServerIpForms) o;
    return Objects.equals(this.pageSize, listGameServerIpForms.pageSize) &&
        Objects.equals(this.nextToken, listGameServerIpForms.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGameServerIpForms {");
    
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
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
