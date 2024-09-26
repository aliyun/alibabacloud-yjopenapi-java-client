/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListGameDeployDetailsOfProjectResultModel
 */
public class ConsoleAdminListGameDeployDetailsOfProjectResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextToken = null;


  private Integer maxResults = null;


  private List<ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList> dataList = null;


  private Long count = null;


  public ConsoleAdminListGameDeployDetailsOfProjectResultModel nextToken(String nextToken) {
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

  public ConsoleAdminListGameDeployDetailsOfProjectResultModel maxResults(Integer maxResults) {
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

  public ConsoleAdminListGameDeployDetailsOfProjectResultModel dataList(List<ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectResultModel addDataListItem(ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListGameDeployDetailsOfProjectResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListGameDeployDetailsOfProjectResultModel count(Long count) {
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
    ConsoleAdminListGameDeployDetailsOfProjectResultModel consoleAdminListGameDeployDetailsOfProjectResultModel = (ConsoleAdminListGameDeployDetailsOfProjectResultModel) o;
    return Objects.equals(this.nextToken, consoleAdminListGameDeployDetailsOfProjectResultModel.nextToken) &&
        Objects.equals(this.maxResults, consoleAdminListGameDeployDetailsOfProjectResultModel.maxResults) &&
        Objects.equals(this.dataList, consoleAdminListGameDeployDetailsOfProjectResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListGameDeployDetailsOfProjectResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, maxResults, dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameDeployDetailsOfProjectResultModel {");
    
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
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