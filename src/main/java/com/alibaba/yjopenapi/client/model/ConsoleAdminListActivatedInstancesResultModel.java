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

  private List<ConsoleAdminListActivatedInstancesResultModelDataList> dataList = null;


  private Long count = null;


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
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListActivatedInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListActivatedInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListActivatedInstancesResultModel count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
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
    return Objects.equals(this.dataList, consoleAdminListActivatedInstancesResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListActivatedInstancesResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivatedInstancesResultModel {");
    
    sb.append(",dataList: ").append(toIndentedString(dataList));
    sb.append(",count: ").append(toIndentedString(count));
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
