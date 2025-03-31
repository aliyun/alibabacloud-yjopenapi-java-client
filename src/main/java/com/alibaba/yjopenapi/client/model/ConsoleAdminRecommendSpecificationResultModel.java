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
 * ConsoleAdminRecommendSpecificationResultModel
 */
public class ConsoleAdminRecommendSpecificationResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String specificationCnName = null;


  private String specificationValueCode = null;


  private String specificationName = null;


  private String specificationAttributeCode = null;


  public ConsoleAdminRecommendSpecificationResultModel specificationCnName(String specificationCnName) {
    this.specificationCnName = specificationCnName;
    return this;
  }

   /**
   * Get specificationCnName
   * @return specificationCnName
  **/
  public String getSpecificationCnName() {
    return specificationCnName;
  }

  public void setSpecificationCnName(String specificationCnName) {
    this.specificationCnName = specificationCnName;
  }

  public ConsoleAdminRecommendSpecificationResultModel specificationValueCode(String specificationValueCode) {
    this.specificationValueCode = specificationValueCode;
    return this;
  }

   /**
   * Get specificationValueCode
   * @return specificationValueCode
  **/
  public String getSpecificationValueCode() {
    return specificationValueCode;
  }

  public void setSpecificationValueCode(String specificationValueCode) {
    this.specificationValueCode = specificationValueCode;
  }

  public ConsoleAdminRecommendSpecificationResultModel specificationName(String specificationName) {
    this.specificationName = specificationName;
    return this;
  }

   /**
   * Get specificationName
   * @return specificationName
  **/
  public String getSpecificationName() {
    return specificationName;
  }

  public void setSpecificationName(String specificationName) {
    this.specificationName = specificationName;
  }

  public ConsoleAdminRecommendSpecificationResultModel specificationAttributeCode(String specificationAttributeCode) {
    this.specificationAttributeCode = specificationAttributeCode;
    return this;
  }

   /**
   * Get specificationAttributeCode
   * @return specificationAttributeCode
  **/
  public String getSpecificationAttributeCode() {
    return specificationAttributeCode;
  }

  public void setSpecificationAttributeCode(String specificationAttributeCode) {
    this.specificationAttributeCode = specificationAttributeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminRecommendSpecificationResultModel consoleAdminRecommendSpecificationResultModel = (ConsoleAdminRecommendSpecificationResultModel) o;
    return Objects.equals(this.specificationCnName, consoleAdminRecommendSpecificationResultModel.specificationCnName) &&
        Objects.equals(this.specificationValueCode, consoleAdminRecommendSpecificationResultModel.specificationValueCode) &&
        Objects.equals(this.specificationName, consoleAdminRecommendSpecificationResultModel.specificationName) &&
        Objects.equals(this.specificationAttributeCode, consoleAdminRecommendSpecificationResultModel.specificationAttributeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specificationCnName, specificationValueCode, specificationName, specificationAttributeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminRecommendSpecificationResultModel {");
    
    sb.append(",specificationCnName: ").append(toIndentedString(specificationCnName));
    sb.append(",specificationValueCode: ").append(toIndentedString(specificationValueCode));
    sb.append(",specificationName: ").append(toIndentedString(specificationName));
    sb.append(",specificationAttributeCode: ").append(toIndentedString(specificationAttributeCode));
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
