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
 * AdaptQueryRequestByIdForms
 */
public class AdaptQueryRequestByIdForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id = null;


  public AdaptQueryRequestByIdForms id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 适配请求id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptQueryRequestByIdForms adaptQueryRequestByIdForms = (AdaptQueryRequestByIdForms) o;
    return Objects.equals(this.id, adaptQueryRequestByIdForms.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptQueryRequestByIdForms {");
    
    sb.append(",id: ").append(toIndentedString(id));
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
