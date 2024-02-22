/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListDeployableInstancesResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListDeployableInstancesResultModel
 */
public class ConsoleAdminListDeployableInstancesResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long pageNumber = null;


  private List<ConsoleAdminListDeployableInstancesResultModelDataList> dataList = null;


  private Long pageSize = null;


  private Long totalCount = null;


  public ConsoleAdminListDeployableInstancesResultModel pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConsoleAdminListDeployableInstancesResultModel dataList(List<ConsoleAdminListDeployableInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListDeployableInstancesResultModel addDataListItem(ConsoleAdminListDeployableInstancesResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListDeployableInstancesResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListDeployableInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListDeployableInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListDeployableInstancesResultModel pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ConsoleAdminListDeployableInstancesResultModel totalCount(Long totalCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListDeployableInstancesResultModel consoleAdminListDeployableInstancesResultModel = (ConsoleAdminListDeployableInstancesResultModel) o;
    return Objects.equals(this.pageNumber, consoleAdminListDeployableInstancesResultModel.pageNumber) &&
        Objects.equals(this.dataList, consoleAdminListDeployableInstancesResultModel.dataList) &&
        Objects.equals(this.pageSize, consoleAdminListDeployableInstancesResultModel.pageSize) &&
        Objects.equals(this.totalCount, consoleAdminListDeployableInstancesResultModel.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, dataList, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListDeployableInstancesResultModel {");
    
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",dataList: ").append(toIndentedString(dataList));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
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
