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
 * ConsoleAdminGetGameVersionResultModel
 */
public class ConsoleAdminGetGameVersionResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  private String versionName = null;


  public ConsoleAdminGetGameVersionResultModel versionId(String versionId) {
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

  public ConsoleAdminGetGameVersionResultModel versionName(String versionName) {
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
    ConsoleAdminGetGameVersionResultModel consoleAdminGetGameVersionResultModel = (ConsoleAdminGetGameVersionResultModel) o;
    return Objects.equals(this.versionId, consoleAdminGetGameVersionResultModel.versionId) &&
        Objects.equals(this.versionName, consoleAdminGetGameVersionResultModel.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, versionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameVersionResultModel {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
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
