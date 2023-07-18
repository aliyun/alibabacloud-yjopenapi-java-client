/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGameDeployDetailsOfProjectModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListGameDeployDetailsOfProjectModel
 */
public class ConsoleAdminListGameDeployDetailsOfProjectModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long count = null;


  private List<ConsoleAdminListGameDeployDetailsOfProjectModelDataList> dataList = null;


  public ConsoleAdminListGameDeployDetailsOfProjectModel count(Long count) {
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

  public ConsoleAdminListGameDeployDetailsOfProjectModel dataList(List<ConsoleAdminListGameDeployDetailsOfProjectModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectModel addDataListItem(ConsoleAdminListGameDeployDetailsOfProjectModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListGameDeployDetailsOfProjectModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListGameDeployDetailsOfProjectModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListGameDeployDetailsOfProjectModelDataList> dataList) {
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
    ConsoleAdminListGameDeployDetailsOfProjectModel consoleAdminListGameDeployDetailsOfProjectModel = (ConsoleAdminListGameDeployDetailsOfProjectModel) o;
    return Objects.equals(this.count, consoleAdminListGameDeployDetailsOfProjectModel.count) &&
        Objects.equals(this.dataList, consoleAdminListGameDeployDetailsOfProjectModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameDeployDetailsOfProjectModel {");
    
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
