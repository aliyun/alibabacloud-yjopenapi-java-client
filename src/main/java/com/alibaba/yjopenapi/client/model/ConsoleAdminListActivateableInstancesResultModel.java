/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListActivateableInstancesResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListActivateableInstancesResultModel
 */
public class ConsoleAdminListActivateableInstancesResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<ConsoleAdminListActivateableInstancesResultModelDataList> dataList = null;


  private Long count = null;


  public ConsoleAdminListActivateableInstancesResultModel dataList(List<ConsoleAdminListActivateableInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListActivateableInstancesResultModel addDataListItem(ConsoleAdminListActivateableInstancesResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListActivateableInstancesResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListActivateableInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListActivateableInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListActivateableInstancesResultModel count(Long count) {
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
    ConsoleAdminListActivateableInstancesResultModel consoleAdminListActivateableInstancesResultModel = (ConsoleAdminListActivateableInstancesResultModel) o;
    return Objects.equals(this.dataList, consoleAdminListActivateableInstancesResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListActivateableInstancesResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListActivateableInstancesResultModel {");
    
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
