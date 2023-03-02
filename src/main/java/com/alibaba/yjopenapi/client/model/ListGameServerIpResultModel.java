/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ListGameServerIpResultModel
 */
public class ListGameServerIpResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextToken = null;


  private Long pageSize = null;


  private List<String> ipList = null;


  private Long totalCount = null;


  public ListGameServerIpResultModel nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * 分页游标
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListGameServerIpResultModel pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页大小
   * @return pageSize
  **/
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListGameServerIpResultModel ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public ListGameServerIpResultModel addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<String>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * ip列表
   * @return ipList
  **/
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public ListGameServerIpResultModel totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总大小
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGameServerIpResultModel listGameServerIpResultModel = (ListGameServerIpResultModel) o;
    return Objects.equals(this.nextToken, listGameServerIpResultModel.nextToken) &&
        Objects.equals(this.pageSize, listGameServerIpResultModel.pageSize) &&
        Objects.equals(this.ipList, listGameServerIpResultModel.ipList) &&
        Objects.equals(this.totalCount, listGameServerIpResultModel.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, pageSize, ipList, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGameServerIpResultModel {");
    
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",ipList: ").append(toIndentedString(ipList));
    sb.append(",totalCount: ").append(toIndentedString(totalCount));
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
