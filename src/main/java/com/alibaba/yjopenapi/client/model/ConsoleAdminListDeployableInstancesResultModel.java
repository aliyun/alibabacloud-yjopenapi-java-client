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

  private Long totalCount = null;


  private Long pageNumber = null;


  private Long pageSize = null;


  private List<ConsoleAdminListDeployableInstancesResultModelDataList> dataList = null;


  public ConsoleAdminListDeployableInstancesResultModel totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 本次请求条件下的数据总量
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public ConsoleAdminListDeployableInstancesResultModel pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 表示当前调用返回读取到的位置
   * @return pageNumber
  **/
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConsoleAdminListDeployableInstancesResultModel pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 本次请求所返回的最大记录条数
   * @return pageSize
  **/
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
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
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListDeployableInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListDeployableInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
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
    return Objects.equals(this.totalCount, consoleAdminListDeployableInstancesResultModel.totalCount) &&
        Objects.equals(this.pageNumber, consoleAdminListDeployableInstancesResultModel.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminListDeployableInstancesResultModel.pageSize) &&
        Objects.equals(this.dataList, consoleAdminListDeployableInstancesResultModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageNumber, pageSize, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListDeployableInstancesResultModel {");
    
    sb.append(",totalCount: ").append(toIndentedString(totalCount));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",dataList: ").append(toIndentedString(dataList));
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
