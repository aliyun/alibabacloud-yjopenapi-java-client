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
 * ConsoleAdminListGameCcuForms
 */
public class ConsoleAdminListGameCcuForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixGameIds = null;


  private String projectIds = null;


  private Long queryTimeStart = null;


  private Long queryTimeEnd = null;


  private Integer pageNumber = null;


  private Integer pageSize = null;


  public ConsoleAdminListGameCcuForms mixGameIds(String mixGameIds) {
    this.mixGameIds = mixGameIds;
    return this;
  }

   /**
   * Get mixGameIds
   * @return mixGameIds
  **/
  public String getMixGameIds() {
    return mixGameIds;
  }

  public void setMixGameIds(String mixGameIds) {
    this.mixGameIds = mixGameIds;
  }

  public ConsoleAdminListGameCcuForms projectIds(String projectIds) {
    this.projectIds = projectIds;
    return this;
  }

   /**
   * Get projectIds
   * @return projectIds
  **/
  public String getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(String projectIds) {
    this.projectIds = projectIds;
  }

  public ConsoleAdminListGameCcuForms queryTimeStart(Long queryTimeStart) {
    this.queryTimeStart = queryTimeStart;
    return this;
  }

   /**
   * Get queryTimeStart
   * @return queryTimeStart
  **/
  public Long getQueryTimeStart() {
    return queryTimeStart;
  }

  public void setQueryTimeStart(Long queryTimeStart) {
    this.queryTimeStart = queryTimeStart;
  }

  public ConsoleAdminListGameCcuForms queryTimeEnd(Long queryTimeEnd) {
    this.queryTimeEnd = queryTimeEnd;
    return this;
  }

   /**
   * Get queryTimeEnd
   * @return queryTimeEnd
  **/
  public Long getQueryTimeEnd() {
    return queryTimeEnd;
  }

  public void setQueryTimeEnd(Long queryTimeEnd) {
    this.queryTimeEnd = queryTimeEnd;
  }

  public ConsoleAdminListGameCcuForms pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConsoleAdminListGameCcuForms pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGameCcuForms consoleAdminListGameCcuForms = (ConsoleAdminListGameCcuForms) o;
    return Objects.equals(this.mixGameIds, consoleAdminListGameCcuForms.mixGameIds) &&
        Objects.equals(this.projectIds, consoleAdminListGameCcuForms.projectIds) &&
        Objects.equals(this.queryTimeStart, consoleAdminListGameCcuForms.queryTimeStart) &&
        Objects.equals(this.queryTimeEnd, consoleAdminListGameCcuForms.queryTimeEnd) &&
        Objects.equals(this.pageNumber, consoleAdminListGameCcuForms.pageNumber) &&
        Objects.equals(this.pageSize, consoleAdminListGameCcuForms.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixGameIds, projectIds, queryTimeStart, queryTimeEnd, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameCcuForms {");
    
    sb.append(",mixGameIds: ").append(toIndentedString(mixGameIds));
    sb.append(",projectIds: ").append(toIndentedString(projectIds));
    sb.append(",queryTimeStart: ").append(toIndentedString(queryTimeStart));
    sb.append(",queryTimeEnd: ").append(toIndentedString(queryTimeEnd));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
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
