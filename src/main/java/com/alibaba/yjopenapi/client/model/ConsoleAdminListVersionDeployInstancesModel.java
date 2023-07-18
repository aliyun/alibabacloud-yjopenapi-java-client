/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListVersionDeployInstancesModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListVersionDeployInstancesModel
 */
public class ConsoleAdminListVersionDeployInstancesModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long count = null;


  private List<ConsoleAdminListVersionDeployInstancesModelDataList> dataList = null;


  public ConsoleAdminListVersionDeployInstancesModel count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * 总记录数
   * @return count
  **/
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ConsoleAdminListVersionDeployInstancesModel dataList(List<ConsoleAdminListVersionDeployInstancesModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListVersionDeployInstancesModel addDataListItem(ConsoleAdminListVersionDeployInstancesModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListVersionDeployInstancesModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListVersionDeployInstancesModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListVersionDeployInstancesModelDataList> dataList) {
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
    ConsoleAdminListVersionDeployInstancesModel consoleAdminListVersionDeployInstancesModel = (ConsoleAdminListVersionDeployInstancesModel) o;
    return Objects.equals(this.count, consoleAdminListVersionDeployInstancesModel.count) &&
        Objects.equals(this.dataList, consoleAdminListVersionDeployInstancesModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListVersionDeployInstancesModel {");
    
    sb.append(",count: ").append(toIndentedString(count));
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
