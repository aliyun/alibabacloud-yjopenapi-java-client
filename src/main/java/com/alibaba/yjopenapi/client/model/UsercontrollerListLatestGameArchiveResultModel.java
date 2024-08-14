/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontrollerListLatestGameArchiveResultModelItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * UsercontrollerListLatestGameArchiveResultModel
 */
public class UsercontrollerListLatestGameArchiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer pageNumber = null;


  private String requestId = null;


  private Integer pageSize = null;


  private Integer totalCount = null;


  private List<UsercontrollerListLatestGameArchiveResultModelItems> items = null;


  public UsercontrollerListLatestGameArchiveResultModel pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public UsercontrollerListLatestGameArchiveResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public UsercontrollerListLatestGameArchiveResultModel pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public UsercontrollerListLatestGameArchiveResultModel totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public UsercontrollerListLatestGameArchiveResultModel items(List<UsercontrollerListLatestGameArchiveResultModelItems> items) {
    this.items = items;
    return this;
  }

  public UsercontrollerListLatestGameArchiveResultModel addItemsItem(UsercontrollerListLatestGameArchiveResultModelItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<UsercontrollerListLatestGameArchiveResultModelItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<UsercontrollerListLatestGameArchiveResultModelItems> getItems() {
    return items;
  }

  public void setItems(List<UsercontrollerListLatestGameArchiveResultModelItems> items) {
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
    UsercontrollerListLatestGameArchiveResultModel usercontrollerListLatestGameArchiveResultModel = (UsercontrollerListLatestGameArchiveResultModel) o;
    return Objects.equals(this.pageNumber, usercontrollerListLatestGameArchiveResultModel.pageNumber) &&
        Objects.equals(this.requestId, usercontrollerListLatestGameArchiveResultModel.requestId) &&
        Objects.equals(this.pageSize, usercontrollerListLatestGameArchiveResultModel.pageSize) &&
        Objects.equals(this.totalCount, usercontrollerListLatestGameArchiveResultModel.totalCount) &&
        Objects.equals(this.items, usercontrollerListLatestGameArchiveResultModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, requestId, pageSize, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerListLatestGameArchiveResultModel {");
    
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",requestId: ").append(toIndentedString(requestId));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",totalCount: ").append(toIndentedString(totalCount));
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
