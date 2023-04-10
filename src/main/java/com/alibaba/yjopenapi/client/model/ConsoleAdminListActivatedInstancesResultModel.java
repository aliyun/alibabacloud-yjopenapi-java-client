/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListActivatedInstancesResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListActivatedInstancesResultModel
 */
public class ConsoleAdminListActivatedInstancesResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long count = null;


  private List<ConsoleAdminListActivatedInstancesResultModelDataList> dataList = null;


  public ConsoleAdminListActivatedInstancesResultModel count(Long count) {
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

  public ConsoleAdminListActivatedInstancesResultModel dataList(List<ConsoleAdminListActivatedInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListActivatedInstancesResultModel addDataListItem(ConsoleAdminListActivatedInstancesResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListActivatedInstancesResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListActivatedInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListActivatedInstancesResultModelDataList> dataList) {
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
    ConsoleAdminListActivatedInstancesResultModel consoleAdminListActivatedInstancesResultModel = (ConsoleAdminListActivatedInstancesResultModel) o;
    return Objects.equals(this.count, consoleAdminListActivatedInstancesResultModel.count) &&
        Objects.equals(this.dataList, consoleAdminListActivatedInstancesResultModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivatedInstancesResultModel {");
    
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
