/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListControllersOfGameResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListControllersOfGameResultModel
 */
public class ConsoleAdminListControllersOfGameResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long count = null;


  private String nextToken = null;


  private Integer maxResults = null;


  private List<ConsoleAdminListControllersOfGameResultModelDataList> dataList = null;


  public ConsoleAdminListControllersOfGameResultModel count(Long count) {
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

  public ConsoleAdminListControllersOfGameResultModel nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ConsoleAdminListControllersOfGameResultModel maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * 本次请求所返回的最大记录条数
   * @return maxResults
  **/
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ConsoleAdminListControllersOfGameResultModel dataList(List<ConsoleAdminListControllersOfGameResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListControllersOfGameResultModel addDataListItem(ConsoleAdminListControllersOfGameResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListControllersOfGameResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListControllersOfGameResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListControllersOfGameResultModelDataList> dataList) {
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
    ConsoleAdminListControllersOfGameResultModel consoleAdminListControllersOfGameResultModel = (ConsoleAdminListControllersOfGameResultModel) o;
    return Objects.equals(this.count, consoleAdminListControllersOfGameResultModel.count) &&
        Objects.equals(this.nextToken, consoleAdminListControllersOfGameResultModel.nextToken) &&
        Objects.equals(this.maxResults, consoleAdminListControllersOfGameResultModel.maxResults) &&
        Objects.equals(this.dataList, consoleAdminListControllersOfGameResultModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, nextToken, maxResults, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListControllersOfGameResultModel {");
    
    sb.append(",count: ").append(toIndentedString(count));
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
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
