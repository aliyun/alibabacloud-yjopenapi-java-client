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
 * MultiplayDemoModifyMultiPlayForms
 */
public class MultiplayDemoModifyMultiPlayForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private String tokens = null;


  private String openAk = null;


  private String openSk = null;


  public MultiplayDemoModifyMultiPlayForms mpId(String mpId) {
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

  public MultiplayDemoModifyMultiPlayForms tokens(String tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public String getTokens() {
    return tokens;
  }

  public void setTokens(String tokens) {
    this.tokens = tokens;
  }

  public MultiplayDemoModifyMultiPlayForms openAk(String openAk) {
    this.openAk = openAk;
    return this;
  }

   /**
   * Get openAk
   * @return openAk
  **/
  public String getOpenAk() {
    return openAk;
  }

  public void setOpenAk(String openAk) {
    this.openAk = openAk;
  }

  public MultiplayDemoModifyMultiPlayForms openSk(String openSk) {
    this.openSk = openSk;
    return this;
  }

   /**
   * Get openSk
   * @return openSk
  **/
  public String getOpenSk() {
    return openSk;
  }

  public void setOpenSk(String openSk) {
    this.openSk = openSk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoModifyMultiPlayForms multiplayDemoModifyMultiPlayForms = (MultiplayDemoModifyMultiPlayForms) o;
    return Objects.equals(this.mpId, multiplayDemoModifyMultiPlayForms.mpId) &&
        Objects.equals(this.tokens, multiplayDemoModifyMultiPlayForms.tokens) &&
        Objects.equals(this.openAk, multiplayDemoModifyMultiPlayForms.openAk) &&
        Objects.equals(this.openSk, multiplayDemoModifyMultiPlayForms.openSk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, tokens, openAk, openSk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoModifyMultiPlayForms {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",tokens: ").append(toIndentedString(tokens));
    sb.append(",openAk: ").append(toIndentedString(openAk));
    sb.append(",openSk: ").append(toIndentedString(openSk));
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
