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
 * ConsoleAdminRtTrendForms
 */
public class ConsoleAdminRtTrendForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String groupType = null;


  private String indicatorTypes = null;


  private String mixGameIds = null;


  private String projectIds = null;


  private Long queryTimeStart = null;


  private Long queryTimeEnd = null;


  public ConsoleAdminRtTrendForms groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public ConsoleAdminRtTrendForms indicatorTypes(String indicatorTypes) {
    this.indicatorTypes = indicatorTypes;
    return this;
  }

   /**
   * Get indicatorTypes
   * @return indicatorTypes
  **/
  public String getIndicatorTypes() {
    return indicatorTypes;
  }

  public void setIndicatorTypes(String indicatorTypes) {
    this.indicatorTypes = indicatorTypes;
  }

  public ConsoleAdminRtTrendForms mixGameIds(String mixGameIds) {
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

  public ConsoleAdminRtTrendForms projectIds(String projectIds) {
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

  public ConsoleAdminRtTrendForms queryTimeStart(Long queryTimeStart) {
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

  public ConsoleAdminRtTrendForms queryTimeEnd(Long queryTimeEnd) {
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
    ConsoleAdminRtTrendForms consoleAdminRtTrendForms = (ConsoleAdminRtTrendForms) o;
    return Objects.equals(this.groupType, consoleAdminRtTrendForms.groupType) &&
        Objects.equals(this.indicatorTypes, consoleAdminRtTrendForms.indicatorTypes) &&
        Objects.equals(this.mixGameIds, consoleAdminRtTrendForms.mixGameIds) &&
        Objects.equals(this.projectIds, consoleAdminRtTrendForms.projectIds) &&
        Objects.equals(this.queryTimeStart, consoleAdminRtTrendForms.queryTimeStart) &&
        Objects.equals(this.queryTimeEnd, consoleAdminRtTrendForms.queryTimeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupType, indicatorTypes, mixGameIds, projectIds, queryTimeStart, queryTimeEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRtTrendForms {");
    
    sb.append(",groupType: ").append(toIndentedString(groupType));
    sb.append(",indicatorTypes: ").append(toIndentedString(indicatorTypes));
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
