/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiListModelsResultModelModelListItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiListModelsResultModelModelList
 */
public class AiListModelsResultModelModelList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String pageNumber = null;


  private String pageSize = null;


  private Long totalCount = null;


  private List<AiListModelsResultModelModelListItems> items = null;


  public AiListModelsResultModelModelList pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public AiListModelsResultModelModelList pageSize(String pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }

  public AiListModelsResultModelModelList totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public AiListModelsResultModelModelList items(List<AiListModelsResultModelModelListItems> items) {
    this.items = items;
    return this;
  }

  public AiListModelsResultModelModelList addItemsItem(AiListModelsResultModelModelListItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AiListModelsResultModelModelListItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<AiListModelsResultModelModelListItems> getItems() {
    return items;
  }

  public void setItems(List<AiListModelsResultModelModelListItems> items) {
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
    AiListModelsResultModelModelList aiListModelsResultModelModelList = (AiListModelsResultModelModelList) o;
    return Objects.equals(this.pageNumber, aiListModelsResultModelModelList.pageNumber) &&
        Objects.equals(this.pageSize, aiListModelsResultModelModelList.pageSize) &&
        Objects.equals(this.totalCount, aiListModelsResultModelModelList.totalCount) &&
        Objects.equals(this.items, aiListModelsResultModelModelList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiListModelsResultModelModelList {");
    
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
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
