/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListMonthBillResultModelItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListMonthBillResultModel
 */
public class ConsoleAdminListMonthBillResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer pageNumber = null;


  private Integer pageSize = null;


  private Long totalCount = null;


  private List<ConsoleAdminListMonthBillResultModelItems> items = null;


  public ConsoleAdminListMonthBillResultModel pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 页码
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConsoleAdminListMonthBillResultModel pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 没页数量
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ConsoleAdminListMonthBillResultModel totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总数量
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public ConsoleAdminListMonthBillResultModel items(List<ConsoleAdminListMonthBillResultModelItems> items) {
    this.items = items;
    return this;
  }

  public ConsoleAdminListMonthBillResultModel addItemsItem(ConsoleAdminListMonthBillResultModelItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ConsoleAdminListMonthBillResultModelItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 列表
   * @return items
  **/
  public List<ConsoleAdminListMonthBillResultModelItems> getItems() {
    return items;
  }

  public void setItems(List<ConsoleAdminListMonthBillResultModelItems> items) {
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
    ConsoleAdminListMonthBillResultModel consoleAdminListMonthBillResultModel = (ConsoleAdminListMonthBillResultModel) o;
    return Objects.equals(this.pageNumber, consoleAdminListMonthBillResultModel.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminListMonthBillResultModel.pageSize) &&
        Objects.equals(this.totalCount, consoleAdminListMonthBillResultModel.totalCount) &&
        Objects.equals(this.items, consoleAdminListMonthBillResultModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListMonthBillResultModel {");
    
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
