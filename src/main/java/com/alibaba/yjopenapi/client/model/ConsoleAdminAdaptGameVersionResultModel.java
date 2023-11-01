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
 * ConsoleAdminAdaptGameVersionResultModel
 */
public class ConsoleAdminAdaptGameVersionResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String versionId = null;


  public ConsoleAdminAdaptGameVersionResultModel versionId(String versionId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminAdaptGameVersionResultModel consoleAdminAdaptGameVersionResultModel = (ConsoleAdminAdaptGameVersionResultModel) o;
    return Objects.equals(this.versionId, consoleAdminAdaptGameVersionResultModel.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminAdaptGameVersionResultModel {");
    
    sb.append(",versionId: ").append(toIndentedString(versionId));
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
