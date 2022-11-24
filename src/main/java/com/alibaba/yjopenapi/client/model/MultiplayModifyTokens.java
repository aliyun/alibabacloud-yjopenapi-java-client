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
 * MultiplayModifyTokens
 */
public class MultiplayModifyTokens implements Serializable {
  private static final long serialVersionUID = 1L;

  private String tokenId = null;


  private Integer controlId = null;


  public MultiplayModifyTokens tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * 令牌Id
   * @return tokenId
  **/
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public MultiplayModifyTokens controlId(Integer controlId) {
    this.controlId = controlId;
    return this;
  }

   /**
   * 控制位Id
   * @return controlId
  **/
  public Integer getControlId() {
    return controlId;
  }

  public void setControlId(Integer controlId) {
    this.controlId = controlId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayModifyTokens multiplayModifyTokens = (MultiplayModifyTokens) o;
    return Objects.equals(this.tokenId, multiplayModifyTokens.tokenId) &&
        Objects.equals(this.controlId, multiplayModifyTokens.controlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, controlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayModifyTokens {");
    
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",controlId: ").append(toIndentedString(controlId));
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
