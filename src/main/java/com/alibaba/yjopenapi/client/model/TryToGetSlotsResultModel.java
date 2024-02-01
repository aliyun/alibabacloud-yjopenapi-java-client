/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.TryToGetSlotsResultModelResponses;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * TryToGetSlotsResultModel
 */
public class TryToGetSlotsResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String code = null;


  private Boolean success = null;


  private List<TryToGetSlotsResultModelResponses> responses = null;


  private String message = null;


  public TryToGetSlotsResultModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TryToGetSlotsResultModel success(Boolean success) {
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

  public TryToGetSlotsResultModel responses(List<TryToGetSlotsResultModelResponses> responses) {
    this.responses = responses;
    return this;
  }

  public TryToGetSlotsResultModel addResponsesItem(TryToGetSlotsResultModelResponses responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<TryToGetSlotsResultModelResponses>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  public List<TryToGetSlotsResultModelResponses> getResponses() {
    return responses;
  }

  public void setResponses(List<TryToGetSlotsResultModelResponses> responses) {
    this.responses = responses;
  }

  public TryToGetSlotsResultModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotsResultModel tryToGetSlotsResultModel = (TryToGetSlotsResultModel) o;
    return Objects.equals(this.code, tryToGetSlotsResultModel.code) &&
        Objects.equals(this.success, tryToGetSlotsResultModel.success) &&
        Objects.equals(this.responses, tryToGetSlotsResultModel.responses) &&
        Objects.equals(this.message, tryToGetSlotsResultModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, success, responses, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotsResultModel {");
    
    sb.append(",code: ").append(toIndentedString(code));
    sb.append(",success: ").append(toIndentedString(success));
    sb.append(",responses: ").append(toIndentedString(responses));
    sb.append(",message: ").append(toIndentedString(message));
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
