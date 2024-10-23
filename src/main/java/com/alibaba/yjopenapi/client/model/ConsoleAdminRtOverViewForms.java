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
 * ConsoleAdminRtOverViewForms
 */
public class ConsoleAdminRtOverViewForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixGameIds = null;


  private String projectIds = null;


  private Long queryTimeStart = null;


  private Long queryTimeEnd = null;


  public ConsoleAdminRtOverViewForms mixGameIds(String mixGameIds) {
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

  public ConsoleAdminRtOverViewForms projectIds(String projectIds) {
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

  public ConsoleAdminRtOverViewForms queryTimeStart(Long queryTimeStart) {
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

  public ConsoleAdminRtOverViewForms queryTimeEnd(Long queryTimeEnd) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminRtOverViewForms consoleAdminRtOverViewForms = (ConsoleAdminRtOverViewForms) o;
    return Objects.equals(this.mixGameIds, consoleAdminRtOverViewForms.mixGameIds) &&
        Objects.equals(this.projectIds, consoleAdminRtOverViewForms.projectIds) &&
        Objects.equals(this.queryTimeStart, consoleAdminRtOverViewForms.queryTimeStart) &&
        Objects.equals(this.queryTimeEnd, consoleAdminRtOverViewForms.queryTimeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixGameIds, projectIds, queryTimeStart, queryTimeEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtOverViewForms {");
    
    sb.append(",mixGameIds: ").append(toIndentedString(mixGameIds));
    sb.append(",projectIds: ").append(toIndentedString(projectIds));
    sb.append(",queryTimeStart: ").append(toIndentedString(queryTimeStart));
    sb.append(",queryTimeEnd: ").append(toIndentedString(queryTimeEnd));
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
