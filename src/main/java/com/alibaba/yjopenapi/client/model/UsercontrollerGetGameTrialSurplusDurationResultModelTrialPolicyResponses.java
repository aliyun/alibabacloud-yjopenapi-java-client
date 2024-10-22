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
 * UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses
 */
public class UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  private String policyType = null;


  private Long surplusDurationInSecond = null;


  public UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses policyType(String policyType) {
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

  public UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses surplusDurationInSecond(Long surplusDurationInSecond) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses usercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses = (UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses) o;
    return Objects.equals(this.policyType, usercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses.policyType) &&
        Objects.equals(this.surplusDurationInSecond, usercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses.surplusDurationInSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyType, surplusDurationInSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetGameTrialSurplusDurationResultModelTrialPolicyResponses {");
    
    sb.append(",policyType: ").append(toIndentedString(policyType));
    sb.append(",surplusDurationInSecond: ").append(toIndentedString(surplusDurationInSecond));
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
