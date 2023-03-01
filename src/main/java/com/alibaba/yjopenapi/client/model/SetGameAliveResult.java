/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.SetGameAliveResultModel;
import java.io.Serializable;
/**
 * SetGameAliveResult
 */
public class SetGameAliveResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean success = null;


  private SetGameAliveResultModel model = null;


  public SetGameAliveResult success(Boolean success) {
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

  public SetGameAliveResult model(SetGameAliveResultModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public SetGameAliveResultModel getModel() {
    return model;
  }

  public void setModel(SetGameAliveResultModel model) {
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
    SetGameAliveResult setGameAliveResult = (SetGameAliveResult) o;
    return Objects.equals(this.success, setGameAliveResult.success) &&
        Objects.equals(this.model, setGameAliveResult.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetGameAliveResult {");
    
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
