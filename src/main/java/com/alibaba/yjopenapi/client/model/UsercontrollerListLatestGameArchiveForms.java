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
 * UsercontrollerListLatestGameArchiveForms
 */
public class UsercontrollerListLatestGameArchiveForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountId = null;


  private String gameId = null;


  private Integer pageSize = null;


  private Integer pageNumber = null;


  private Integer tagStatus = null;


  public UsercontrollerListLatestGameArchiveForms accountId(String accountId) {
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

  public UsercontrollerListLatestGameArchiveForms gameId(String gameId) {
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

  public UsercontrollerListLatestGameArchiveForms pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public UsercontrollerListLatestGameArchiveForms pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public UsercontrollerListLatestGameArchiveForms tagStatus(Integer tagStatus) {
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
    UsercontrollerListLatestGameArchiveForms usercontrollerListLatestGameArchiveForms = (UsercontrollerListLatestGameArchiveForms) o;
    return Objects.equals(this.accountId, usercontrollerListLatestGameArchiveForms.accountId) &&
        Objects.equals(this.gameId, usercontrollerListLatestGameArchiveForms.gameId) &&
        Objects.equals(this.pageSize, usercontrollerListLatestGameArchiveForms.pageSize) &&
        Objects.equals(this.pageNumber, usercontrollerListLatestGameArchiveForms.pageNumber) &&
        Objects.equals(this.tagStatus, usercontrollerListLatestGameArchiveForms.tagStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, gameId, pageSize, pageNumber, tagStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerListLatestGameArchiveForms {");
    
    sb.append(",accountId: ").append(toIndentedString(accountId));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",pageSize: ").append(toIndentedString(pageSize));
    sb.append(",pageNumber: ").append(toIndentedString(pageNumber));
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
