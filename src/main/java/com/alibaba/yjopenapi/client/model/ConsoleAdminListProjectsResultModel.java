/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListProjectsResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListProjectsResultModel
 */
public class ConsoleAdminListProjectsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer maxResults = null;


  private String nextToken = null;


  private List<ConsoleAdminListProjectsResultModelDataList> dataList = null;


  private Long count = null;


  public ConsoleAdminListProjectsResultModel maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ConsoleAdminListProjectsResultModel nextToken(String nextToken) {
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

  public ConsoleAdminListProjectsResultModel dataList(List<ConsoleAdminListProjectsResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListProjectsResultModel addDataListItem(ConsoleAdminListProjectsResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListProjectsResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListProjectsResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListProjectsResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListProjectsResultModel count(Long count) {
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
    ConsoleAdminListProjectsResultModel consoleAdminListProjectsResultModel = (ConsoleAdminListProjectsResultModel) o;
    return Objects.equals(this.maxResults, consoleAdminListProjectsResultModel.maxResults) &&
        Objects.equals(this.nextToken, consoleAdminListProjectsResultModel.nextToken) &&
        Objects.equals(this.dataList, consoleAdminListProjectsResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListProjectsResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, nextToken, dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListProjectsResultModel {");
    
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
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
