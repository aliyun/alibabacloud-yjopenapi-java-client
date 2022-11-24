/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGamesResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListGamesResultModel
 */
public class ConsoleAdminListGamesResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long count = null;


  private Integer maxResults = null;


  private String nextToken = null;


  private List<ConsoleAdminListGamesResultModelDataList> dataList = null;


  public ConsoleAdminListGamesResultModel count(Long count) {
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

  public ConsoleAdminListGamesResultModel maxResults(Integer maxResults) {
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

  public ConsoleAdminListGamesResultModel nextToken(String nextToken) {
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

  public ConsoleAdminListGamesResultModel dataList(List<ConsoleAdminListGamesResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListGamesResultModel addDataListItem(ConsoleAdminListGamesResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListGamesResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 数据列表
   * @return dataList
  **/
  public List<ConsoleAdminListGamesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListGamesResultModelDataList> dataList) {
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
    ConsoleAdminListGamesResultModel consoleAdminListGamesResultModel = (ConsoleAdminListGamesResultModel) o;
    return Objects.equals(this.count, consoleAdminListGamesResultModel.count) &&
        Objects.equals(this.maxResults, consoleAdminListGamesResultModel.maxResults) &&
        Objects.equals(this.nextToken, consoleAdminListGamesResultModel.nextToken) &&
        Objects.equals(this.dataList, consoleAdminListGamesResultModel.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, maxResults, nextToken, dataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGamesResultModel {");
    
    sb.append(",count: ").append(toIndentedString(count));
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
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
