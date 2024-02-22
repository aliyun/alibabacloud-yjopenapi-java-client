/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.TryToGetSlotsFormsRequests;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * TryToGetSlotsForms
 */
public class TryToGetSlotsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String appKey = null;


  private Boolean parallelSchedule = null;


  private List<TryToGetSlotsFormsRequests> requests = new ArrayList<TryToGetSlotsFormsRequests>();


  public TryToGetSlotsForms appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public TryToGetSlotsForms parallelSchedule(Boolean parallelSchedule) {
    this.parallelSchedule = parallelSchedule;
    return this;
  }

   /**
   * Get parallelSchedule
   * @return parallelSchedule
  **/
  public Boolean getParallelSchedule() {
    return parallelSchedule;
  }

  public void setParallelSchedule(Boolean parallelSchedule) {
    this.parallelSchedule = parallelSchedule;
  }

  public TryToGetSlotsForms requests(List<TryToGetSlotsFormsRequests> requests) {
    this.requests = requests;
    return this;
  }

  public TryToGetSlotsForms addRequestsItem(TryToGetSlotsFormsRequests requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  public List<TryToGetSlotsFormsRequests> getRequests() {
    return requests;
  }

  public void setRequests(List<TryToGetSlotsFormsRequests> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TryToGetSlotsForms tryToGetSlotsForms = (TryToGetSlotsForms) o;
    return Objects.equals(this.appKey, tryToGetSlotsForms.appKey) &&
        Objects.equals(this.parallelSchedule, tryToGetSlotsForms.parallelSchedule) &&
        Objects.equals(this.requests, tryToGetSlotsForms.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, parallelSchedule, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TryToGetSlotsForms {");
    
    sb.append(",appKey: ").append(toIndentedString(appKey));
    sb.append(",parallelSchedule: ").append(toIndentedString(parallelSchedule));
    sb.append(",requests: ").append(toIndentedString(requests));
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
