/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiListModelsResultModelModelList;
import java.io.Serializable;
/**
 * AiListModelsResultModel
 */
public class AiListModelsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private AiListModelsResultModelModelList modelList = null;


  private String requestId = null;


  public AiListModelsResultModel modelList(AiListModelsResultModelModelList modelList) {
    this.modelList = modelList;
    return this;
  }

   /**
   * Get modelList
   * @return modelList
  **/
  public AiListModelsResultModelModelList getModelList() {
    return modelList;
  }

  public void setModelList(AiListModelsResultModelModelList modelList) {
    this.modelList = modelList;
  }

  public AiListModelsResultModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiListModelsResultModel aiListModelsResultModel = (AiListModelsResultModel) o;
    return Objects.equals(this.modelList, aiListModelsResultModel.modelList) &&
        Objects.equals(this.requestId, aiListModelsResultModel.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelList, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiListModelsResultModel {");
    
    sb.append(",modelList: ").append(toIndentedString(modelList));
    sb.append(",requestId: ").append(toIndentedString(requestId));
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
