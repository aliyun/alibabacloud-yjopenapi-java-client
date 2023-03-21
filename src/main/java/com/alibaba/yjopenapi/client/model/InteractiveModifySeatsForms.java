/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveModifySeatsFormsModifySeats;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * InteractiveModifySeatsForms
 */
public class InteractiveModifySeatsForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String partyId = null;


  private String operator = null;


  private List<InteractiveModifySeatsFormsModifySeats> modifySeats = new ArrayList<InteractiveModifySeatsFormsModifySeats>();


  public InteractiveModifySeatsForms partyId(String partyId) {
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

  public InteractiveModifySeatsForms operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * 操作者
   * @return operator
  **/
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public InteractiveModifySeatsForms modifySeats(List<InteractiveModifySeatsFormsModifySeats> modifySeats) {
    this.modifySeats = modifySeats;
    return this;
  }

  public InteractiveModifySeatsForms addModifySeatsItem(InteractiveModifySeatsFormsModifySeats modifySeatsItem) {
    this.modifySeats.add(modifySeatsItem);
    return this;
  }

   /**
   * Get modifySeats
   * @return modifySeats
  **/
  public List<InteractiveModifySeatsFormsModifySeats> getModifySeats() {
    return modifySeats;
  }

  public void setModifySeats(List<InteractiveModifySeatsFormsModifySeats> modifySeats) {
    this.modifySeats = modifySeats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveModifySeatsForms interactiveModifySeatsForms = (InteractiveModifySeatsForms) o;
    return Objects.equals(this.partyId, interactiveModifySeatsForms.partyId) &&
        Objects.equals(this.operator, interactiveModifySeatsForms.operator) &&
        Objects.equals(this.modifySeats, interactiveModifySeatsForms.modifySeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, operator, modifySeats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveModifySeatsForms {");
    
    sb.append(",partyId: ").append(toIndentedString(partyId));
    sb.append(",operator: ").append(toIndentedString(operator));
    sb.append(",modifySeats: ").append(toIndentedString(modifySeats));
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
