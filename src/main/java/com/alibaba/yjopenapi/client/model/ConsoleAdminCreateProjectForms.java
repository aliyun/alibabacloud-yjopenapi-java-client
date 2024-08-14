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
 * ConsoleAdminCreateProjectForms
 */
public class ConsoleAdminCreateProjectForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String projectName = null;


  public ConsoleAdminCreateProjectForms projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateProjectForms consoleAdminCreateProjectForms = (ConsoleAdminCreateProjectForms) o;
    return Objects.equals(this.projectName, consoleAdminCreateProjectForms.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateProjectForms {");
    
    sb.append(",projectName: ").append(toIndentedString(projectName));
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
