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
 * InteractiveGetPartyStatusForms
 */
public class InteractiveGetPartyStatusForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  public InteractiveGetPartyStatusForms partyId(String partyId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveGetPartyStatusForms interactiveGetPartyStatusForms = (InteractiveGetPartyStatusForms) o;
    return Objects.equals(this.partyId, interactiveGetPartyStatusForms.partyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyStatusForms {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
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
