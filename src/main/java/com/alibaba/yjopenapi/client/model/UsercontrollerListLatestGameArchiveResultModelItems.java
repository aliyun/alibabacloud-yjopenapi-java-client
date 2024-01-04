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
 * UsercontrollerListLatestGameArchiveResultModelItems
 */
public class UsercontrollerListLatestGameArchiveResultModelItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameId = null;


  private String accountId = null;


  private Long archiveTime = null;


  private Integer tagStatus = null;


  private String archiveId = null;


  public UsercontrollerListLatestGameArchiveResultModelItems gameId(String gameId) {
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

  public UsercontrollerListLatestGameArchiveResultModelItems accountId(String accountId) {
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

  public UsercontrollerListLatestGameArchiveResultModelItems archiveTime(Long archiveTime) {
    this.archiveTime = archiveTime;
    return this;
  }

   /**
   * Get archiveTime
   * @return archiveTime
  **/
  public Long getArchiveTime() {
    return archiveTime;
  }

  public void setArchiveTime(Long archiveTime) {
    this.archiveTime = archiveTime;
  }

  public UsercontrollerListLatestGameArchiveResultModelItems tagStatus(Integer tagStatus) {
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

  public UsercontrollerListLatestGameArchiveResultModelItems archiveId(String archiveId) {
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
    UsercontrollerListLatestGameArchiveResultModelItems usercontrollerListLatestGameArchiveResultModelItems = (UsercontrollerListLatestGameArchiveResultModelItems) o;
    return Objects.equals(this.gameId, usercontrollerListLatestGameArchiveResultModelItems.gameId) &&
        Objects.equals(this.accountId, usercontrollerListLatestGameArchiveResultModelItems.accountId) &&
        Objects.equals(this.archiveTime, usercontrollerListLatestGameArchiveResultModelItems.archiveTime) &&
        Objects.equals(this.tagStatus, usercontrollerListLatestGameArchiveResultModelItems.tagStatus) &&
        Objects.equals(this.archiveId, usercontrollerListLatestGameArchiveResultModelItems.archiveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, accountId, archiveTime, tagStatus, archiveId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerListLatestGameArchiveResultModelItems {");
    
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",archiveTime: ").append(toIndentedString(archiveTime));
    sb.append(",tagStatus: ").append(toIndentedString(tagStatus));
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
