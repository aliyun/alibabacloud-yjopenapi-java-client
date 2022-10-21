/*
 * 
 * YuanJing OpenAPI SDK
 *
 * OpenAPI spec version: 1.0.20221015-beta
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.StopGameResultModel;
import java.io.Serializable;
/**
 * StopGameResult
 */
public class StopGameResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private StopGameResultModel model = null;


  public StopGameResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public StopGameResult model(StopGameResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public StopGameResultModel getModel() {
    return model;
  }

  public void setModel(StopGameResultModel model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopGameResult stopGameResult = (StopGameResult) o;
    return Objects.equals(this.success, stopGameResult.success) &&
        Objects.equals(this.model, stopGameResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopGameResult {");
    
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",model: ").append(toIndentedString(model));
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
