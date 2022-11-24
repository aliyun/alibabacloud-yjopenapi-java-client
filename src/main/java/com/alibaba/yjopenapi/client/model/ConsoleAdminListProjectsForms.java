/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
/**
 * ConsoleAdminListProjectsForms
 */
public class ConsoleAdminListProjectsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextToken = null;


  private Integer maxResults = null;


  public ConsoleAdminListProjectsForms nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * 标记当前开始读取的位置
   * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ConsoleAdminListProjectsForms maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * 本次读取的最大数据记录数量
   * @return maxResults
  **/
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListProjectsForms consoleAdminListProjectsForms = (ConsoleAdminListProjectsForms) o;
    return Objects.equals(this.nextToken, consoleAdminListProjectsForms.nextToken) &&
        Objects.equals(this.maxResults, consoleAdminListProjectsForms.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, maxResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListProjectsForms {");
    
    sb.append(",nextToken: ").append(toIndentedString(nextToken));
    sb.append(",maxResults: ").append(toIndentedString(maxResults));
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
