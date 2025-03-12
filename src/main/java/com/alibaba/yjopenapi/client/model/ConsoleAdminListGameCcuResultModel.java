/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGameCcuResultModelItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListGameCcuResultModel
 */
public class ConsoleAdminListGameCcuResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer pageNumber = null;


  private Integer pageSize = null;


  private Long totalCount = null;


  private List<ConsoleAdminListGameCcuResultModelItems> items = null;


  public ConsoleAdminListGameCcuResultModel pageNumber(Integer pageNumber) {
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

  public ConsoleAdminListGameCcuResultModel pageSize(Integer pageSize) {
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

  public ConsoleAdminListGameCcuResultModel totalCount(Long totalCount) {
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

  public ConsoleAdminListGameCcuResultModel items(List<ConsoleAdminListGameCcuResultModelItems> items) {
    this.items = items;
    return this;
  }

  public ConsoleAdminListGameCcuResultModel addItemsItem(ConsoleAdminListGameCcuResultModelItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ConsoleAdminListGameCcuResultModelItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<ConsoleAdminListGameCcuResultModelItems> getItems() {
    return items;
  }

  public void setItems(List<ConsoleAdminListGameCcuResultModelItems> items) {
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
    ConsoleAdminListGameCcuResultModel consoleAdminListGameCcuResultModel = (ConsoleAdminListGameCcuResultModel) o;
    return Objects.equals(this.pageNumber, consoleAdminListGameCcuResultModel.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminListGameCcuResultModel.pageSize) &&
        Objects.equals(this.totalCount, consoleAdminListGameCcuResultModel.totalCount) &&
        Objects.equals(this.items, consoleAdminListGameCcuResultModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameCcuResultModel {");
    
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
