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
 * AiUpdateModelsForms
 */
public class AiUpdateModelsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String resourceId = null;


  private String desc = null;


  public AiUpdateModelsForms resourceId(String resourceId) {
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

  public AiUpdateModelsForms desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiUpdateModelsForms aiUpdateModelsForms = (AiUpdateModelsForms) o;
    return Objects.equals(this.resourceId, aiUpdateModelsForms.resourceId) &&
        Objects.equals(this.desc, aiUpdateModelsForms.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, desc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUpdateModelsForms {");
    
    sb.append(",resourceId: ").append(toIndentedString(resourceId));
    sb.append(",desc: ").append(toIndentedString(desc));
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
