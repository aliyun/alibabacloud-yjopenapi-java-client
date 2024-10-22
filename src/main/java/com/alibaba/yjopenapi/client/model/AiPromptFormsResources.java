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
 * AiPromptFormsResources
 */
public class AiPromptFormsResources implements Serializable {
  private static final long serialVersionUID = 1L;

  private String fileName = null;


  private String url = null;


  public AiPromptFormsResources fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AiPromptFormsResources url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptFormsResources aiPromptFormsResources = (AiPromptFormsResources) o;
    return Objects.equals(this.fileName, aiPromptFormsResources.fileName) &&
        Objects.equals(this.url, aiPromptFormsResources.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptFormsResources {");
    
    sb.append(",fileName: ").append(toIndentedString(fileName));
    sb.append(",url: ").append(toIndentedString(url));
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
