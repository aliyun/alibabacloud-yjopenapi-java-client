/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
/**
 * ConsoleAdminQueryAdaptResultByVersionIdResultModel
 */
public class ConsoleAdminQueryAdaptResultByVersionIdResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String adaptFileSourceName = null;


  private String dictFrameRate = null;


  private String dictMachineTypeVm = null;


  private Integer containerType = null;


  private Integer sandbox = null;


  private Integer platformType = null;


  private Integer priority = null;


  private String resolution = null;


  private String adaptFileSource = null;


  private Integer required = null;


  private Integer maxConcurrency = null;


  private Integer state = null;


  private Integer pipelineType = null;


  private String dictPicQuality = null;


  private String dictIsvName = null;


  private Map<String, String> calculationEvaluation = null;


  public ConsoleAdminQueryAdaptResultByVersionIdResultModel adaptFileSourceName(String adaptFileSourceName) {
    this.adaptFileSourceName = adaptFileSourceName;
    return this;
  }

   /**
   * Get adaptFileSourceName
   * @return adaptFileSourceName
  **/
  public String getAdaptFileSourceName() {
    return adaptFileSourceName;
  }

  public void setAdaptFileSourceName(String adaptFileSourceName) {
    this.adaptFileSourceName = adaptFileSourceName;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel dictFrameRate(String dictFrameRate) {
    this.dictFrameRate = dictFrameRate;
    return this;
  }

   /**
   * Get dictFrameRate
   * @return dictFrameRate
  **/
  public String getDictFrameRate() {
    return dictFrameRate;
  }

  public void setDictFrameRate(String dictFrameRate) {
    this.dictFrameRate = dictFrameRate;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel dictMachineTypeVm(String dictMachineTypeVm) {
    this.dictMachineTypeVm = dictMachineTypeVm;
    return this;
  }

   /**
   * Get dictMachineTypeVm
   * @return dictMachineTypeVm
  **/
  public String getDictMachineTypeVm() {
    return dictMachineTypeVm;
  }

  public void setDictMachineTypeVm(String dictMachineTypeVm) {
    this.dictMachineTypeVm = dictMachineTypeVm;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel containerType(Integer containerType) {
    this.containerType = containerType;
    return this;
  }

   /**
   * Get containerType
   * @return containerType
  **/
  public Integer getContainerType() {
    return containerType;
  }

  public void setContainerType(Integer containerType) {
    this.containerType = containerType;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel sandbox(Integer sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  public Integer getSandbox() {
    return sandbox;
  }

  public void setSandbox(Integer sandbox) {
    this.sandbox = sandbox;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel platformType(Integer platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public Integer getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Integer platformType) {
    this.platformType = platformType;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel adaptFileSource(String adaptFileSource) {
    this.adaptFileSource = adaptFileSource;
    return this;
  }

   /**
   * Get adaptFileSource
   * @return adaptFileSource
  **/
  public String getAdaptFileSource() {
    return adaptFileSource;
  }

  public void setAdaptFileSource(String adaptFileSource) {
    this.adaptFileSource = adaptFileSource;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel required(Integer required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  public Integer getRequired() {
    return required;
  }

  public void setRequired(Integer required) {
    this.required = required;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * Get maxConcurrency
   * @return maxConcurrency
  **/
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel pipelineType(Integer pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

   /**
   * Get pipelineType
   * @return pipelineType
  **/
  public Integer getPipelineType() {
    return pipelineType;
  }

  public void setPipelineType(Integer pipelineType) {
    this.pipelineType = pipelineType;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel dictPicQuality(String dictPicQuality) {
    this.dictPicQuality = dictPicQuality;
    return this;
  }

   /**
   * Get dictPicQuality
   * @return dictPicQuality
  **/
  public String getDictPicQuality() {
    return dictPicQuality;
  }

  public void setDictPicQuality(String dictPicQuality) {
    this.dictPicQuality = dictPicQuality;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel dictIsvName(String dictIsvName) {
    this.dictIsvName = dictIsvName;
    return this;
  }

   /**
   * Get dictIsvName
   * @return dictIsvName
  **/
  public String getDictIsvName() {
    return dictIsvName;
  }

  public void setDictIsvName(String dictIsvName) {
    this.dictIsvName = dictIsvName;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel calculationEvaluation(Map<String, String> calculationEvaluation) {
    this.calculationEvaluation = calculationEvaluation;
    return this;
  }

  public ConsoleAdminQueryAdaptResultByVersionIdResultModel putCalculationEvaluationItem(String key, String calculationEvaluationItem) {
    if (this.calculationEvaluation == null) {
      this.calculationEvaluation = new HashMap<String, String>();
    }
    this.calculationEvaluation.put(key, calculationEvaluationItem);
    return this;
  }

   /**
   * Get calculationEvaluation
   * @return calculationEvaluation
  **/
  public Map<String, String> getCalculationEvaluation() {
    return calculationEvaluation;
  }

  public void setCalculationEvaluation(Map<String, String> calculationEvaluation) {
    this.calculationEvaluation = calculationEvaluation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminQueryAdaptResultByVersionIdResultModel consoleAdminQueryAdaptResultByVersionIdResultModel = (ConsoleAdminQueryAdaptResultByVersionIdResultModel) o;
    return Objects.equals(this.adaptFileSourceName, consoleAdminQueryAdaptResultByVersionIdResultModel.adaptFileSourceName) &&
        Objects.equals(this.dictFrameRate, consoleAdminQueryAdaptResultByVersionIdResultModel.dictFrameRate) &&
        Objects.equals(this.dictMachineTypeVm, consoleAdminQueryAdaptResultByVersionIdResultModel.dictMachineTypeVm) &&
        Objects.equals(this.containerType, consoleAdminQueryAdaptResultByVersionIdResultModel.containerType) &&
        Objects.equals(this.sandbox, consoleAdminQueryAdaptResultByVersionIdResultModel.sandbox) &&
        Objects.equals(this.platformType, consoleAdminQueryAdaptResultByVersionIdResultModel.platformType) &&
        Objects.equals(this.priority, consoleAdminQueryAdaptResultByVersionIdResultModel.priority) &&
        Objects.equals(this.resolution, consoleAdminQueryAdaptResultByVersionIdResultModel.resolution) &&
        Objects.equals(this.adaptFileSource, consoleAdminQueryAdaptResultByVersionIdResultModel.adaptFileSource) &&
        Objects.equals(this.required, consoleAdminQueryAdaptResultByVersionIdResultModel.required) &&
        Objects.equals(this.maxConcurrency, consoleAdminQueryAdaptResultByVersionIdResultModel.maxConcurrency) &&
        Objects.equals(this.state, consoleAdminQueryAdaptResultByVersionIdResultModel.state) &&
        Objects.equals(this.pipelineType, consoleAdminQueryAdaptResultByVersionIdResultModel.pipelineType) &&
        Objects.equals(this.dictPicQuality, consoleAdminQueryAdaptResultByVersionIdResultModel.dictPicQuality) &&
        Objects.equals(this.dictIsvName, consoleAdminQueryAdaptResultByVersionIdResultModel.dictIsvName) &&
        Objects.equals(this.calculationEvaluation, consoleAdminQueryAdaptResultByVersionIdResultModel.calculationEvaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptFileSourceName, dictFrameRate, dictMachineTypeVm, containerType, sandbox, platformType, priority, resolution, adaptFileSource, required, maxConcurrency, state, pipelineType, dictPicQuality, dictIsvName, calculationEvaluation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminQueryAdaptResultByVersionIdResultModel {");
    
    sb.append(",adaptFileSourceName: ").append(toIndentedString(adaptFileSourceName));
    sb.append(",dictFrameRate: ").append(toIndentedString(dictFrameRate));
    sb.append(",dictMachineTypeVm: ").append(toIndentedString(dictMachineTypeVm));
    sb.append(",containerType: ").append(toIndentedString(containerType));
    sb.append(",sandbox: ").append(toIndentedString(sandbox));
    sb.append(",platformType: ").append(toIndentedString(platformType));
    sb.append(",priority: ").append(toIndentedString(priority));
    sb.append(",resolution: ").append(toIndentedString(resolution));
    sb.append(",adaptFileSource: ").append(toIndentedString(adaptFileSource));
    sb.append(",required: ").append(toIndentedString(required));
    sb.append(",maxConcurrency: ").append(toIndentedString(maxConcurrency));
    sb.append(",state: ").append(toIndentedString(state));
    sb.append(",pipelineType: ").append(toIndentedString(pipelineType));
    sb.append(",dictPicQuality: ").append(toIndentedString(dictPicQuality));
    sb.append(",dictIsvName: ").append(toIndentedString(dictIsvName));
    sb.append(",calculationEvaluation: ").append(toIndentedString(calculationEvaluation));
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
