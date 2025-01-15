/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminGetBillFlowInfoResultModelItems;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminGetBillFlowInfoResultModel
 */
public class ConsoleAdminGetBillFlowInfoResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer pageNumber = null;


  private Integer pagesize = null;


  private Integer totalCount = null;


  private List<ConsoleAdminGetBillFlowInfoResultModelItems> items = null;


  public ConsoleAdminGetBillFlowInfoResultModel pageNumber(Integer pageNumber) {
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

  public ConsoleAdminGetBillFlowInfoResultModel pagesize(Integer pagesize) {
    this.pagesize = pagesize;
    return this;
  }

   /**
   * Get pagesize
   * @return pagesize
  **/
  public Integer getPagesize() {
    return pagesize;
  }

  public void setPagesize(Integer pagesize) {
    this.pagesize = pagesize;
  }

  public ConsoleAdminGetBillFlowInfoResultModel totalCount(Integer totalCount) {
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

  public ConsoleAdminGetBillFlowInfoResultModel items(List<ConsoleAdminGetBillFlowInfoResultModelItems> items) {
    this.items = items;
    return this;
  }

  public ConsoleAdminGetBillFlowInfoResultModel addItemsItem(ConsoleAdminGetBillFlowInfoResultModelItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ConsoleAdminGetBillFlowInfoResultModelItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<ConsoleAdminGetBillFlowInfoResultModelItems> getItems() {
    return items;
  }

  public void setItems(List<ConsoleAdminGetBillFlowInfoResultModelItems> items) {
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
    ConsoleAdminGetBillFlowInfoResultModel consoleAdminGetBillFlowInfoResultModel = (ConsoleAdminGetBillFlowInfoResultModel) o;
    return Objects.equals(this.pageNumber, consoleAdminGetBillFlowInfoResultModel.pageNumber) &&
        Objects.equals(this.pagesize, consoleAdminGetBillFlowInfoResultModel.pagesize) &&
        Objects.equals(this.totalCount, consoleAdminGetBillFlowInfoResultModel.totalCount) &&
        Objects.equals(this.items, consoleAdminGetBillFlowInfoResultModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pagesize, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetBillFlowInfoResultModel {");
    
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",pagesize: ").append(toIndentedString(pagesize));
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
