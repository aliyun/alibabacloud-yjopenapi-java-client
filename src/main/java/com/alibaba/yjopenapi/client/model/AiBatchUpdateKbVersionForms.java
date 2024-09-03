/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiBatchUpdateKbVersionForms
 */
public class AiBatchUpdateKbVersionForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<Long> roleIds = new ArrayList<Long>();


  private Long kbId = null;


  private Long kbVersionId = null;


  private String operator = null;


  public AiBatchUpdateKbVersionForms roleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public AiBatchUpdateKbVersionForms addRoleIdsItem(Long roleIdsItem) {
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Get roleIds
   * @return roleIds
  **/
  public List<Long> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  public AiBatchUpdateKbVersionForms kbId(Long kbId) {
    this.kbId = kbId;
    return this;
  }

   /**
   * Get kbId
   * @return kbId
  **/
  public Long getKbId() {
    return kbId;
  }

  public void setKbId(Long kbId) {
    this.kbId = kbId;
  }

  public AiBatchUpdateKbVersionForms kbVersionId(Long kbVersionId) {
    this.kbVersionId = kbVersionId;
    return this;
  }

   /**
   * Get kbVersionId
   * @return kbVersionId
  **/
  public Long getKbVersionId() {
    return kbVersionId;
  }

  public void setKbVersionId(Long kbVersionId) {
    this.kbVersionId = kbVersionId;
  }

  public AiBatchUpdateKbVersionForms operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiBatchUpdateKbVersionForms aiBatchUpdateKbVersionForms = (AiBatchUpdateKbVersionForms) o;
    return Objects.equals(this.roleIds, aiBatchUpdateKbVersionForms.roleIds) &&
        Objects.equals(this.kbId, aiBatchUpdateKbVersionForms.kbId) &&
        Objects.equals(this.kbVersionId, aiBatchUpdateKbVersionForms.kbVersionId) &&
        Objects.equals(this.operator, aiBatchUpdateKbVersionForms.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleIds, kbId, kbVersionId, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBatchUpdateKbVersionForms {");
    
    sb.append(",roleIds: ").append(toIndentedString(roleIds));
    sb.append(",kbId: ").append(toIndentedString(kbId));
    sb.append(",kbVersionId: ").append(toIndentedString(kbVersionId));
    sb.append(",operator: ").append(toIndentedString(operator));
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
