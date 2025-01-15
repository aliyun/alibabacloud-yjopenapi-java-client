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
 * UsercontrollerUpdateGameArchiveTagStatusForms
 */
public class UsercontrollerUpdateGameArchiveTagStatusForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String archiveId = null;


  private Integer tagStatus = null;


  public UsercontrollerUpdateGameArchiveTagStatusForms accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UsercontrollerUpdateGameArchiveTagStatusForms gameId(String gameId) {
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

  public UsercontrollerUpdateGameArchiveTagStatusForms archiveId(String archiveId) {
    this.archiveId = archiveId;
    return this;
  }

   /**
   * Get archiveId
   * @return archiveId
  **/
  public String getArchiveId() {
    return archiveId;
  }

  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  public UsercontrollerUpdateGameArchiveTagStatusForms tagStatus(Integer tagStatus) {
    this.tagStatus = tagStatus;
    return this;
  }

   /**
   * Get tagStatus
   * @return tagStatus
  **/
  public Integer getTagStatus() {
    return tagStatus;
  }

  public void setTagStatus(Integer tagStatus) {
    this.tagStatus = tagStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerUpdateGameArchiveTagStatusForms usercontrollerUpdateGameArchiveTagStatusForms = (UsercontrollerUpdateGameArchiveTagStatusForms) o;
    return Objects.equals(this.accountId, usercontrollerUpdateGameArchiveTagStatusForms.accountId) &&
        Objects.equals(this.gameId, usercontrollerUpdateGameArchiveTagStatusForms.gameId) &&
        Objects.equals(this.archiveId, usercontrollerUpdateGameArchiveTagStatusForms.archiveId) &&
        Objects.equals(this.tagStatus, usercontrollerUpdateGameArchiveTagStatusForms.tagStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, archiveId, tagStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerUpdateGameArchiveTagStatusForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",archiveId: ").append(toIndentedString(archiveId));
    sb.append(",tagStatus: ").append(toIndentedString(tagStatus));
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
