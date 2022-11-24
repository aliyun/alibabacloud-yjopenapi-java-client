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
 * ConsoleAdminCreateProjectResultModel
 */
public class ConsoleAdminCreateProjectResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectId = null;


  public ConsoleAdminCreateProjectResultModel projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateProjectResultModel consoleAdminCreateProjectResultModel = (ConsoleAdminCreateProjectResultModel) o;
    return Objects.equals(this.projectId, consoleAdminCreateProjectResultModel.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateProjectResultModel {");
    
    sb.append(",projectId: ").append(toIndentedString(projectId));
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
