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
 * ConsoleAdminListGameVersionsResultModelDataList
 */
public class ConsoleAdminListGameVersionsResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  private String adaptState = null;


  private Long adaptFinishTime = null;


  private String versionName = null;


  public ConsoleAdminListGameVersionsResultModelDataList versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ConsoleAdminListGameVersionsResultModelDataList adaptState(String adaptState) {
    this.adaptState = adaptState;
    return this;
  }

   /**
   * Get adaptState
   * @return adaptState
  **/
  public String getAdaptState() {
    return adaptState;
  }

  public void setAdaptState(String adaptState) {
    this.adaptState = adaptState;
  }

  public ConsoleAdminListGameVersionsResultModelDataList adaptFinishTime(Long adaptFinishTime) {
    this.adaptFinishTime = adaptFinishTime;
    return this;
  }

   /**
   * Get adaptFinishTime
   * @return adaptFinishTime
  **/
  public Long getAdaptFinishTime() {
    return adaptFinishTime;
  }

  public void setAdaptFinishTime(Long adaptFinishTime) {
    this.adaptFinishTime = adaptFinishTime;
  }

  public ConsoleAdminListGameVersionsResultModelDataList versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * Get versionName
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGameVersionsResultModelDataList consoleAdminListGameVersionsResultModelDataList = (ConsoleAdminListGameVersionsResultModelDataList) o;
    return Objects.equals(this.versionId, consoleAdminListGameVersionsResultModelDataList.versionId) &&
        Objects.equals(this.adaptState, consoleAdminListGameVersionsResultModelDataList.adaptState) &&
        Objects.equals(this.adaptFinishTime, consoleAdminListGameVersionsResultModelDataList.adaptFinishTime) &&
        Objects.equals(this.versionName, consoleAdminListGameVersionsResultModelDataList.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, adaptState, adaptFinishTime, versionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameVersionsResultModelDataList {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",adaptState: ").append(toIndentedString(adaptState));
    sb.append(",adaptFinishTime: ").append(toIndentedString(adaptFinishTime));
    sb.append(",versionName: ").append(toIndentedString(versionName));
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
