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
 * UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses
 */
public class UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long surplusDurationInSecond = null;


  private String policyType = null;


  public UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses surplusDurationInSecond(Long surplusDurationInSecond) {
    this.surplusDurationInSecond = surplusDurationInSecond;
    return this;
  }

   /**
   * 剩余试玩时长
   * @return surplusDurationInSecond
  **/
  public Long getSurplusDurationInSecond() {
    return surplusDurationInSecond;
  }

  public void setSurplusDurationInSecond(Long surplusDurationInSecond) {
    this.surplusDurationInSecond = surplusDurationInSecond;
  }

  public UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * 策略类型
   * @return policyType
  **/
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses usercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses = (UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses) o;
    return Objects.equals(this.surplusDurationInSecond, usercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses.surplusDurationInSecond) &&
        Objects.equals(this.policyType, usercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surplusDurationInSecond, policyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses {");
    
    sb.append(",surplusDurationInSecond: ").append(toIndentedString(surplusDurationInSecond));
    sb.append(",policyType: ").append(toIndentedString(policyType));
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
