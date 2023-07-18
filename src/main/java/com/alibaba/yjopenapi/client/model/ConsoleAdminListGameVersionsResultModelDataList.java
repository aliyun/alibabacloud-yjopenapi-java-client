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


  private String versionName = null;


  private String adaptState = null;


  private Long adaptFinishTime = null;


  public ConsoleAdminListGameVersionsResultModelDataList versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * 版本id
   * @return versionId
  **/
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ConsoleAdminListGameVersionsResultModelDataList versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * 版本名称
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public ConsoleAdminListGameVersionsResultModelDataList adaptState(String adaptState) {
    this.adaptState = adaptState;
    return this;
  }

   /**
   * 适配评测状态
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
   * 适配评测完成时间戳
   * @return adaptFinishTime
  **/
  public Long getAdaptFinishTime() {
    return adaptFinishTime;
  }

  public void setAdaptFinishTime(Long adaptFinishTime) {
    this.adaptFinishTime = adaptFinishTime;
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
        Objects.equals(this.versionName, consoleAdminListGameVersionsResultModelDataList.versionName) &&
        Objects.equals(this.adaptState, consoleAdminListGameVersionsResultModelDataList.adaptState) &&
        Objects.equals(this.adaptFinishTime, consoleAdminListGameVersionsResultModelDataList.adaptFinishTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, versionName, adaptState, adaptFinishTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameVersionsResultModelDataList {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
    sb.append(",versionName: ").append(toIndentedString(versionName));
    sb.append(",adaptState: ").append(toIndentedString(adaptState));
    sb.append(",adaptFinishTime: ").append(toIndentedString(adaptFinishTime));
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
