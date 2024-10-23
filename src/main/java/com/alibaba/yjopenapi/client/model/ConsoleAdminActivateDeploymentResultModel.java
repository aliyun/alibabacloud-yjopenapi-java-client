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
 * ConsoleAdminActivateDeploymentResultModel
 */
public class ConsoleAdminActivateDeploymentResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean activated = null;


  public ConsoleAdminActivateDeploymentResultModel activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  public Boolean getActivated() {
    return activated;
  }

  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminActivateDeploymentResultModel consoleAdminActivateDeploymentResultModel = (ConsoleAdminActivateDeploymentResultModel) o;
    return Objects.equals(this.activated, consoleAdminActivateDeploymentResultModel.activated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminActivateDeploymentResultModel {");
    
    sb.append(",activated: ").append(toIndentedString(activated));
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
