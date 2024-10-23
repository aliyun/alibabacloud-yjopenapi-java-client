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
 * ConsoleAdminQueryAdaptResultByVersionIdForms
 */
public class ConsoleAdminQueryAdaptResultByVersionIdForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixVersionId = null;


  public ConsoleAdminQueryAdaptResultByVersionIdForms mixVersionId(String mixVersionId) {
    this.mixVersionId = mixVersionId;
    return this;
  }

   /**
   * Get mixVersionId
   * @return mixVersionId
  **/
  public String getMixVersionId() {
    return mixVersionId;
  }

  public void setMixVersionId(String mixVersionId) {
    this.mixVersionId = mixVersionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminQueryAdaptResultByVersionIdForms consoleAdminQueryAdaptResultByVersionIdForms = (ConsoleAdminQueryAdaptResultByVersionIdForms) o;
    return Objects.equals(this.mixVersionId, consoleAdminQueryAdaptResultByVersionIdForms.mixVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixVersionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminQueryAdaptResultByVersionIdForms {");
    
    sb.append(",mixVersionId: ").append(toIndentedString(mixVersionId));
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
