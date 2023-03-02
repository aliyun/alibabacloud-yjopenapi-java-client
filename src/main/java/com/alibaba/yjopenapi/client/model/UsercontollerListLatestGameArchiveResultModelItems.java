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
 * UsercontollerListLatestGameArchiveResultModelItems
 */
public class UsercontollerListLatestGameArchiveResultModelItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private String archiveId = null;


  private Long archiveTime = null;


  private Integer tagStatus = null;


  public UsercontollerListLatestGameArchiveResultModelItems accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 用户ID
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UsercontollerListLatestGameArchiveResultModelItems gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏ID
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public UsercontollerListLatestGameArchiveResultModelItems archiveId(String archiveId) {
    this.archiveId = archiveId;
    return this;
  }

   /**
   * 存档ID
   * @return archiveId
  **/
  public String getArchiveId() {
    return archiveId;
  }

  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  public UsercontollerListLatestGameArchiveResultModelItems archiveTime(Long archiveTime) {
    this.archiveTime = archiveTime;
    return this;
  }

   /**
   * 存档时间，时间戳
   * @return archiveTime
  **/
  public Long getArchiveTime() {
    return archiveTime;
  }

  public void setArchiveTime(Long archiveTime) {
    this.archiveTime = archiveTime;
  }

  public UsercontollerListLatestGameArchiveResultModelItems tagStatus(Integer tagStatus) {
    this.tagStatus = tagStatus;
    return this;
  }

   /**
   * 打标状态
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
    UsercontollerListLatestGameArchiveResultModelItems usercontollerListLatestGameArchiveResultModelItems = (UsercontollerListLatestGameArchiveResultModelItems) o;
    return Objects.equals(this.accountId, usercontollerListLatestGameArchiveResultModelItems.accountId) &&
        Objects.equals(this.gameId, usercontollerListLatestGameArchiveResultModelItems.gameId) &&
        Objects.equals(this.archiveId, usercontollerListLatestGameArchiveResultModelItems.archiveId) &&
        Objects.equals(this.archiveTime, usercontollerListLatestGameArchiveResultModelItems.archiveTime) &&
        Objects.equals(this.tagStatus, usercontollerListLatestGameArchiveResultModelItems.tagStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, archiveId, archiveTime, tagStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerListLatestGameArchiveResultModelItems {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",archiveId: ").append(toIndentedString(archiveId));
    sb.append(",archiveTime: ").append(toIndentedString(archiveTime));
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
