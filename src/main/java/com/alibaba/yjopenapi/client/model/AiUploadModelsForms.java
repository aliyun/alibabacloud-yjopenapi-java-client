/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiUploadModelsFormsModelFiles;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiUploadModelsForms
 */
public class AiUploadModelsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String modelType = null;


  private String modelName = null;


  private String modelFilePath = null;


  private List<AiUploadModelsFormsModelFiles> modelFiles = new ArrayList<AiUploadModelsFormsModelFiles>();


  private String desc = null;


  private String modelFileType = null;


  public AiUploadModelsForms modelType(String modelType) {
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

  public AiUploadModelsForms modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public AiUploadModelsForms modelFilePath(String modelFilePath) {
    this.modelFilePath = modelFilePath;
    return this;
  }

   /**
   * Get modelFilePath
   * @return modelFilePath
  **/
  public String getModelFilePath() {
    return modelFilePath;
  }

  public void setModelFilePath(String modelFilePath) {
    this.modelFilePath = modelFilePath;
  }

  public AiUploadModelsForms modelFiles(List<AiUploadModelsFormsModelFiles> modelFiles) {
    this.modelFiles = modelFiles;
    return this;
  }

  public AiUploadModelsForms addModelFilesItem(AiUploadModelsFormsModelFiles modelFilesItem) {
    this.modelFiles.add(modelFilesItem);
    return this;
  }

   /**
   * Get modelFiles
   * @return modelFiles
  **/
  public List<AiUploadModelsFormsModelFiles> getModelFiles() {
    return modelFiles;
  }

  public void setModelFiles(List<AiUploadModelsFormsModelFiles> modelFiles) {
    this.modelFiles = modelFiles;
  }

  public AiUploadModelsForms desc(String desc) {
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

  public AiUploadModelsForms modelFileType(String modelFileType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiUploadModelsForms aiUploadModelsForms = (AiUploadModelsForms) o;
    return Objects.equals(this.modelType, aiUploadModelsForms.modelType) &&
        Objects.equals(this.modelName, aiUploadModelsForms.modelName) &&
        Objects.equals(this.modelFilePath, aiUploadModelsForms.modelFilePath) &&
        Objects.equals(this.modelFiles, aiUploadModelsForms.modelFiles) &&
        Objects.equals(this.desc, aiUploadModelsForms.desc) &&
        Objects.equals(this.modelFileType, aiUploadModelsForms.modelFileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelType, modelName, modelFilePath, modelFiles, desc, modelFileType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUploadModelsForms {");
    
    sb.append(",modelType: ").append(toIndentedString(modelType));
    sb.append(",modelName: ").append(toIndentedString(modelName));
    sb.append(",modelFilePath: ").append(toIndentedString(modelFilePath));
    sb.append(",modelFiles: ").append(toIndentedString(modelFiles));
    sb.append(",desc: ").append(toIndentedString(desc));
    sb.append(",modelFileType: ").append(toIndentedString(modelFileType));
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
