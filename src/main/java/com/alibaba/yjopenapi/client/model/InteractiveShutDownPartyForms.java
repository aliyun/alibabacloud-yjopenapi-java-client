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
 * InteractiveShutDownPartyForms
 */
public class InteractiveShutDownPartyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String shutDownReason = null;


  public InteractiveShutDownPartyForms partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * 派对id
   * @return partyId
  **/
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public InteractiveShutDownPartyForms shutDownReason(String shutDownReason) {
    this.shutDownReason = shutDownReason;
    return this;
  }

   /**
   * 关闭原因
   * @return shutDownReason
  **/
  public String getShutDownReason() {
    return shutDownReason;
  }

  public void setShutDownReason(String shutDownReason) {
    this.shutDownReason = shutDownReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveShutDownPartyForms interactiveShutDownPartyForms = (InteractiveShutDownPartyForms) o;
    return Objects.equals(this.partyId, interactiveShutDownPartyForms.partyId) &&
        Objects.equals(this.shutDownReason, interactiveShutDownPartyForms.shutDownReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, shutDownReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveShutDownPartyForms {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",shutDownReason: ").append(toIndentedString(shutDownReason));
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
