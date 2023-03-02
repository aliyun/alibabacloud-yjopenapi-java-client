/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * UsercontollerGetGameTrialSurplusDurationResultModel
 */
public class UsercontollerGetGameTrialSurplusDurationResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses = null;


  public UsercontollerGetGameTrialSurplusDurationResultModel trialPolicyResponses(List<UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses) {
    this.trialPolicyResponses = trialPolicyResponses;
    return this;
  }

  public UsercontollerGetGameTrialSurplusDurationResultModel addTrialPolicyResponsesItem(UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses trialPolicyResponsesItem) {
    if (this.trialPolicyResponses == null) {
      this.trialPolicyResponses = new ArrayList<UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses>();
    }
    this.trialPolicyResponses.add(trialPolicyResponsesItem);
    return this;
  }

   /**
   * 命中的策略列表
   * @return trialPolicyResponses
  **/
  public List<UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> getTrialPolicyResponses() {
    return trialPolicyResponses;
  }

  public void setTrialPolicyResponses(List<UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses> trialPolicyResponses) {
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
    UsercontollerGetGameTrialSurplusDurationResultModel usercontollerGetGameTrialSurplusDurationResultModel = (UsercontollerGetGameTrialSurplusDurationResultModel) o;
    return Objects.equals(this.trialPolicyResponses, usercontollerGetGameTrialSurplusDurationResultModel.trialPolicyResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialPolicyResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerGetGameTrialSurplusDurationResultModel {");
    
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
