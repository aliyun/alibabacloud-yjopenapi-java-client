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
 * AiListModelsResultModelModelListItems
 */
public class AiListModelsResultModelModelListItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private String modelSeries = null;


  private String modelType = null;


  private String modelFileType = null;


  private String modelFileName = null;


  private String url = null;


  private String desc = null;


  public AiListModelsResultModelModelListItems modelSeries(String modelSeries) {
    this.modelSeries = modelSeries;
    return this;
  }

   /**
   * Get modelSeries
   * @return modelSeries
  **/
  public String getModelSeries() {
    return modelSeries;
  }

  public void setModelSeries(String modelSeries) {
    this.modelSeries = modelSeries;
  }

  public AiListModelsResultModelModelListItems modelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  public String getModelType() {
    return modelType;
  }

  public void setModelType(String modelType) {
    this.modelType = modelType;
  }

  public AiListModelsResultModelModelListItems modelFileType(String modelFileType) {
    this.modelFileType = modelFileType;
    return this;
  }

   /**
   * Get modelFileType
   * @return modelFileType
  **/
  public String getModelFileType() {
    return modelFileType;
  }

  public void setModelFileType(String modelFileType) {
    this.modelFileType = modelFileType;
  }

  public AiListModelsResultModelModelListItems modelFileName(String modelFileName) {
    this.modelFileName = modelFileName;
    return this;
  }

   /**
   * Get modelFileName
   * @return modelFileName
  **/
  public String getModelFileName() {
    return modelFileName;
  }

  public void setModelFileName(String modelFileName) {
    this.modelFileName = modelFileName;
  }

  public AiListModelsResultModelModelListItems url(String url) {
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

  public AiListModelsResultModelModelListItems desc(String desc) {
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
    AiListModelsResultModelModelListItems aiListModelsResultModelModelListItems = (AiListModelsResultModelModelListItems) o;
    return Objects.equals(this.modelSeries, aiListModelsResultModelModelListItems.modelSeries) &&
        Objects.equals(this.modelType, aiListModelsResultModelModelListItems.modelType) &&
        Objects.equals(this.modelFileType, aiListModelsResultModelModelListItems.modelFileType) &&
        Objects.equals(this.modelFileName, aiListModelsResultModelModelListItems.modelFileName) &&
        Objects.equals(this.url, aiListModelsResultModelModelListItems.url) &&
        Objects.equals(this.desc, aiListModelsResultModelModelListItems.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelSeries, modelType, modelFileType, modelFileName, url, desc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiListModelsResultModelModelListItems {");
    
    sb.append(",modelSeries: ").append(toIndentedString(modelSeries));
    sb.append(",modelType: ").append(toIndentedString(modelType));
    sb.append(",modelFileType: ").append(toIndentedString(modelFileType));
    sb.append(",modelFileName: ").append(toIndentedString(modelFileName));
    sb.append(",url: ").append(toIndentedString(url));
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
