/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontollerListLatestGameArchiveResultModelItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * UsercontollerListLatestGameArchiveResultModel
 */
public class UsercontollerListLatestGameArchiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer totalCount = null;


  private Integer pageSize = null;


  private Integer pageNumber = null;


  private String requestId = null;


  private List<UsercontollerListLatestGameArchiveResultModelItems> items = null;


  public UsercontollerListLatestGameArchiveResultModel totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总数
   * @return totalCount
  **/
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public UsercontollerListLatestGameArchiveResultModel pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页数量
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public UsercontollerListLatestGameArchiveResultModel pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 当前页码
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public UsercontollerListLatestGameArchiveResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * id of the request
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public UsercontollerListLatestGameArchiveResultModel items(List<UsercontollerListLatestGameArchiveResultModelItems> items) {
    this.items = items;
    return this;
  }

  public UsercontollerListLatestGameArchiveResultModel addItemsItem(UsercontollerListLatestGameArchiveResultModelItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<UsercontollerListLatestGameArchiveResultModelItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 存档数据列表
   * @return items
  **/
  public List<UsercontollerListLatestGameArchiveResultModelItems> getItems() {
    return items;
  }

  public void setItems(List<UsercontollerListLatestGameArchiveResultModelItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontollerListLatestGameArchiveResultModel usercontollerListLatestGameArchiveResultModel = (UsercontollerListLatestGameArchiveResultModel) o;
    return Objects.equals(this.totalCount, usercontollerListLatestGameArchiveResultModel.totalCount) &&
        Objects.equals(this.pageSize, usercontollerListLatestGameArchiveResultModel.pageSize) &&
        Objects.equals(this.pageNumber, usercontollerListLatestGameArchiveResultModel.pageNumber) &&
        Objects.equals(this.requestId, usercontollerListLatestGameArchiveResultModel.requestId) &&
        Objects.equals(this.items, usercontollerListLatestGameArchiveResultModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageSize, pageNumber, requestId, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerListLatestGameArchiveResultModel {");
    
    sb.append(",totalCount: ").append(toIndentedString(totalCount));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",items: ").append(toIndentedString(items));
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
