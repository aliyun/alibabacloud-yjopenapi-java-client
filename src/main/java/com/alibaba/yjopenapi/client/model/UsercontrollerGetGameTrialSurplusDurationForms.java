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
 * UsercontrollerGetGameTrialSurplusDurationForms
 */
public class UsercontrollerGetGameTrialSurplusDurationForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String projectId = null;


  public UsercontrollerGetGameTrialSurplusDurationForms accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 账号id
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UsercontrollerGetGameTrialSurplusDurationForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public UsercontrollerGetGameTrialSurplusDurationForms projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerGetGameTrialSurplusDurationForms usercontrollerGetGameTrialSurplusDurationForms = (UsercontrollerGetGameTrialSurplusDurationForms) o;
    return Objects.equals(this.accountId, usercontrollerGetGameTrialSurplusDurationForms.accountId) &&
        Objects.equals(this.gameId, usercontrollerGetGameTrialSurplusDurationForms.gameId) &&
        Objects.equals(this.projectId, usercontrollerGetGameTrialSurplusDurationForms.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetGameTrialSurplusDurationForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",projectId: ").append(toIndentedString(projectId));
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
