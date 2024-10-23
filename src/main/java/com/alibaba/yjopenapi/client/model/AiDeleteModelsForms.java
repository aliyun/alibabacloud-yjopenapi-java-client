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
 * AiDeleteModelsForms
 */
public class AiDeleteModelsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String resourceId = null;


  public AiDeleteModelsForms resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiDeleteModelsForms aiDeleteModelsForms = (AiDeleteModelsForms) o;
    return Objects.equals(this.resourceId, aiDeleteModelsForms.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDeleteModelsForms {");
    
    sb.append(",resourceId: ").append(toIndentedString(resourceId));
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
