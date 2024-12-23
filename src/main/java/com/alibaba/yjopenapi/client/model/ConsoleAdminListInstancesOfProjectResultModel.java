/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListInstancesOfProjectResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListInstancesOfProjectResultModel
 */
public class ConsoleAdminListInstancesOfProjectResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer maxResult = null;


  private String nextToken = null;


  private List<ConsoleAdminListInstancesOfProjectResultModelDataList> dataList = null;


  private Integer count = null;


  public ConsoleAdminListInstancesOfProjectResultModel maxResult(Integer maxResult) {
    this.maxResult = maxResult;
    return this;
  }

   /**
   * Get maxResult
   * @return maxResult
  **/
  public Integer getMaxResult() {
    return maxResult;
  }

  public void setMaxResult(Integer maxResult) {
    this.maxResult = maxResult;
  }

  public ConsoleAdminListInstancesOfProjectResultModel nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ConsoleAdminListInstancesOfProjectResultModel dataList(List<ConsoleAdminListInstancesOfProjectResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListInstancesOfProjectResultModel addDataListItem(ConsoleAdminListInstancesOfProjectResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListInstancesOfProjectResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListInstancesOfProjectResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListInstancesOfProjectResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListInstancesOfProjectResultModel count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
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
    ConsoleAdminListInstancesOfProjectResultModel consoleAdminListInstancesOfProjectResultModel = (ConsoleAdminListInstancesOfProjectResultModel) o;
    return Objects.equals(this.maxResult, consoleAdminListInstancesOfProjectResultModel.maxResult) &&
        Objects.equals(this.nextToken, consoleAdminListInstancesOfProjectResultModel.nextToken) &&
        Objects.equals(this.dataList, consoleAdminListInstancesOfProjectResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListInstancesOfProjectResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResult, nextToken, dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListInstancesOfProjectResultModel {");
    
    sb.append(",maxResult: ").append(toIndentedString(maxResult));
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
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
