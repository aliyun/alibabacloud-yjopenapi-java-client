/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * UsercontrollerGetGameTrialSurplusDurationResultModel
 */
public class UsercontrollerGetGameTrialSurplusDurationResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses = null;


  public UsercontrollerGetGameTrialSurplusDurationResultModel trialPolicyResponses(List<UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses) {
    this.trialPolicyResponses = trialPolicyResponses;
    return this;
  }

  public UsercontrollerGetGameTrialSurplusDurationResultModel addTrialPolicyResponsesItem(UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses trialPolicyResponsesItem) {
    if (this.trialPolicyResponses == null) {
      this.trialPolicyResponses = new ArrayList<UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses>();
    }
    this.trialPolicyResponses.add(trialPolicyResponsesItem);
    return this;
  }

   /**
   * Get trialPolicyResponses
   * @return trialPolicyResponses
  **/
  public List<UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> getTrialPolicyResponses() {
    return trialPolicyResponses;
  }

  public void setTrialPolicyResponses(List<UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses) {
    this.trialPolicyResponses = trialPolicyResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerGetGameTrialSurplusDurationResultModel usercontrollerGetGameTrialSurplusDurationResultModel = (UsercontrollerGetGameTrialSurplusDurationResultModel) o;
    return Objects.equals(this.trialPolicyResponses, usercontrollerGetGameTrialSurplusDurationResultModel.trialPolicyResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialPolicyResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetGameTrialSurplusDurationResultModel {");
    
    sb.append(",trialPolicyResponses: ").append(toIndentedString(trialPolicyResponses));
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
