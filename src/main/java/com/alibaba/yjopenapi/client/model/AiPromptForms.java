/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiPromptFormsResources;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiPromptForms
 */
public class AiPromptForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String sceneType = null;


  private String promptParam = null;


  private List<AiPromptFormsResources> resources = null;


  public AiPromptForms sceneType(String sceneType) {
    this.sceneType = sceneType;
    return this;
  }

   /**
   * Get sceneType
   * @return sceneType
  **/
  public String getSceneType() {
    return sceneType;
  }

  public void setSceneType(String sceneType) {
    this.sceneType = sceneType;
  }

  public AiPromptForms promptParam(String promptParam) {
    this.promptParam = promptParam;
    return this;
  }

   /**
   * Get promptParam
   * @return promptParam
  **/
  public String getPromptParam() {
    return promptParam;
  }

  public void setPromptParam(String promptParam) {
    this.promptParam = promptParam;
  }

  public AiPromptForms resources(List<AiPromptFormsResources> resources) {
    this.resources = resources;
    return this;
  }

  public AiPromptForms addResourcesItem(AiPromptFormsResources resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<AiPromptFormsResources>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  public List<AiPromptFormsResources> getResources() {
    return resources;
  }

  public void setResources(List<AiPromptFormsResources> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptForms aiPromptForms = (AiPromptForms) o;
    return Objects.equals(this.sceneType, aiPromptForms.sceneType) &&
        Objects.equals(this.promptParam, aiPromptForms.promptParam) &&
        Objects.equals(this.resources, aiPromptForms.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sceneType, promptParam, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptForms {");
    
    sb.append(",sceneType: ").append(toIndentedString(sceneType));
    sb.append(",promptParam: ").append(toIndentedString(promptParam));
    sb.append(",resources: ").append(toIndentedString(resources));
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
