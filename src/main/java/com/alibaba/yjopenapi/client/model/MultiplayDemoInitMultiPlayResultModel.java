/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayDemoInitMultiPlayResultModelTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayDemoInitMultiPlayResultModel
 */
public class MultiplayDemoInitMultiPlayResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String creatorTokenId = null;


  private List<MultiplayDemoInitMultiPlayResultModelTokens> tokens = null;


  private Long dataVer = null;


  private String mpId = null;


  public MultiplayDemoInitMultiPlayResultModel creatorTokenId(String creatorTokenId) {
    this.creatorTokenId = creatorTokenId;
    return this;
  }

   /**
   * Get creatorTokenId
   * @return creatorTokenId
  **/
  public String getCreatorTokenId() {
    return creatorTokenId;
  }

  public void setCreatorTokenId(String creatorTokenId) {
    this.creatorTokenId = creatorTokenId;
  }

  public MultiplayDemoInitMultiPlayResultModel tokens(List<MultiplayDemoInitMultiPlayResultModelTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayDemoInitMultiPlayResultModel addTokensItem(MultiplayDemoInitMultiPlayResultModelTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayDemoInitMultiPlayResultModelTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public List<MultiplayDemoInitMultiPlayResultModelTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayDemoInitMultiPlayResultModelTokens> tokens) {
    this.tokens = tokens;
  }

  public MultiplayDemoInitMultiPlayResultModel dataVer(Long dataVer) {
    this.dataVer = dataVer;
    return this;
  }

   /**
   * Get dataVer
   * @return dataVer
  **/
  public Long getDataVer() {
    return dataVer;
  }

  public void setDataVer(Long dataVer) {
    this.dataVer = dataVer;
  }

  public MultiplayDemoInitMultiPlayResultModel mpId(String mpId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoInitMultiPlayResultModel multiplayDemoInitMultiPlayResultModel = (MultiplayDemoInitMultiPlayResultModel) o;
    return Objects.equals(this.creatorTokenId, multiplayDemoInitMultiPlayResultModel.creatorTokenId) &&
        Objects.equals(this.tokens, multiplayDemoInitMultiPlayResultModel.tokens) &&
        Objects.equals(this.dataVer, multiplayDemoInitMultiPlayResultModel.dataVer) &&
        Objects.equals(this.mpId, multiplayDemoInitMultiPlayResultModel.mpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorTokenId, tokens, dataVer, mpId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoInitMultiPlayResultModel {");
    
    sb.append(",creatorTokenId: ").append(toIndentedString(creatorTokenId));
    sb.append(",tokens: ").append(toIndentedString(tokens));
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
    sb.append(",mpId: ").append(toIndentedString(mpId));
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
