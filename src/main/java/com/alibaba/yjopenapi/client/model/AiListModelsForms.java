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
 * AiListModelsForms
 */
public class AiListModelsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String modelType = null;


  private String modelFileType = null;


  private String modelSeries = null;


  private String modelFileName = null;


  private Integer pageNumber = null;


  private Integer pageSize = null;


  public AiListModelsForms modelType(String modelType) {
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

  public AiListModelsForms modelFileType(String modelFileType) {
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

  public AiListModelsForms modelSeries(String modelSeries) {
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

  public AiListModelsForms modelFileName(String modelFileName) {
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

  public AiListModelsForms pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public AiListModelsForms pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiListModelsForms aiListModelsForms = (AiListModelsForms) o;
    return Objects.equals(this.modelType, aiListModelsForms.modelType) &&
        Objects.equals(this.modelFileType, aiListModelsForms.modelFileType) &&
        Objects.equals(this.modelSeries, aiListModelsForms.modelSeries) &&
        Objects.equals(this.modelFileName, aiListModelsForms.modelFileName) &&
        Objects.equals(this.pageNumber, aiListModelsForms.pageNumber) &&
        Objects.equals(this.pageSize, aiListModelsForms.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelType, modelFileType, modelSeries, modelFileName, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiListModelsForms {");
    
    sb.append(",modelType: ").append(toIndentedString(modelType));
    sb.append(",modelFileType: ").append(toIndentedString(modelFileType));
    sb.append(",modelSeries: ").append(toIndentedString(modelSeries));
    sb.append(",modelFileName: ").append(toIndentedString(modelFileName));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
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
