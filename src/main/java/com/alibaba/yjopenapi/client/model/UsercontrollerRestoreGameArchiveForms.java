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
 * UsercontrollerRestoreGameArchiveForms
 */
public class UsercontrollerRestoreGameArchiveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String archiveId = null;


  public UsercontrollerRestoreGameArchiveForms accountId(String accountId) {
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

  public UsercontrollerRestoreGameArchiveForms gameId(String gameId) {
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

  public UsercontrollerRestoreGameArchiveForms archiveId(String archiveId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerRestoreGameArchiveForms usercontrollerRestoreGameArchiveForms = (UsercontrollerRestoreGameArchiveForms) o;
    return Objects.equals(this.accountId, usercontrollerRestoreGameArchiveForms.accountId) &&
        Objects.equals(this.gameId, usercontrollerRestoreGameArchiveForms.gameId) &&
        Objects.equals(this.archiveId, usercontrollerRestoreGameArchiveForms.archiveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, archiveId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerRestoreGameArchiveForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",archiveId: ").append(toIndentedString(archiveId));
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
