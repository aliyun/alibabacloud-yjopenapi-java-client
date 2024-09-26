/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminListVersionDeployInstancesResultModelDataList;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * ConsoleAdminListVersionDeployInstancesResultModel
 */
public class ConsoleAdminListVersionDeployInstancesResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextToken = null;


  private Integer maxResults = null;


  private List<ConsoleAdminListVersionDeployInstancesResultModelDataList> dataList = null;


  private Long count = null;


  public ConsoleAdminListVersionDeployInstancesResultModel nextToken(String nextToken) {
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

  public ConsoleAdminListVersionDeployInstancesResultModel maxResults(Integer maxResults) {
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

  public ConsoleAdminListVersionDeployInstancesResultModel dataList(List<ConsoleAdminListVersionDeployInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
    return this;
  }

  public ConsoleAdminListVersionDeployInstancesResultModel addDataListItem(ConsoleAdminListVersionDeployInstancesResultModelDataList dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<ConsoleAdminListVersionDeployInstancesResultModelDataList>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  public List<ConsoleAdminListVersionDeployInstancesResultModelDataList> getDataList() {
    return dataList;
  }

  public void setDataList(List<ConsoleAdminListVersionDeployInstancesResultModelDataList> dataList) {
    this.dataList = dataList;
  }

  public ConsoleAdminListVersionDeployInstancesResultModel count(Long count) {
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
    ConsoleAdminListVersionDeployInstancesResultModel consoleAdminListVersionDeployInstancesResultModel = (ConsoleAdminListVersionDeployInstancesResultModel) o;
    return Objects.equals(this.nextToken, consoleAdminListVersionDeployInstancesResultModel.nextToken) &&
        Objects.equals(this.maxResults, consoleAdminListVersionDeployInstancesResultModel.maxResults) &&
        Objects.equals(this.dataList, consoleAdminListVersionDeployInstancesResultModel.dataList) &&
        Objects.equals(this.count, consoleAdminListVersionDeployInstancesResultModel.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, maxResults, dataList, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListVersionDeployInstancesResultModel {");
    
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
