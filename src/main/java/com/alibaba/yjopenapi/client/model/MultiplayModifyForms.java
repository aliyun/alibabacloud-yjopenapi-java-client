/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayModifyFormsTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayModifyForms
 */
public class MultiplayModifyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private List<MultiplayModifyFormsTokens> tokens = null;


  public MultiplayModifyForms mpId(String mpId) {
    this.mpId = mpId;
    return this;
  }

   /**
   * Get mpId
   * @return mpId
  **/
  public String getMpId() {
    return mpId;
  }

  public void setMpId(String mpId) {
    this.mpId = mpId;
  }

  public MultiplayModifyForms tokens(List<MultiplayModifyFormsTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayModifyForms addTokensItem(MultiplayModifyFormsTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayModifyFormsTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public List<MultiplayModifyFormsTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayModifyFormsTokens> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayModifyForms multiplayModifyForms = (MultiplayModifyForms) o;
    return Objects.equals(this.mpId, multiplayModifyForms.mpId) &&
        Objects.equals(this.tokens, multiplayModifyForms.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayModifyForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",tokens: ").append(toIndentedString(tokens));
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
