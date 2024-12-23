/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayQueryResultModelConfig;
import com.alibaba.yjopenapi.client.model.MultiplayQueryResultModelTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayQueryResultModel
 */
public class MultiplayQueryResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String creatorTokenId = null;


  private Long endTs = null;


  private List<MultiplayQueryResultModelTokens> tokens = null;


  private String dataVer = null;


  private String mpId = null;


  private MultiplayQueryResultModelConfig config = null;


  public MultiplayQueryResultModel creatorTokenId(String creatorTokenId) {
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

  public MultiplayQueryResultModel endTs(Long endTs) {
    this.endTs = endTs;
    return this;
  }

   /**
   * Get endTs
   * @return endTs
  **/
  public Long getEndTs() {
    return endTs;
  }

  public void setEndTs(Long endTs) {
    this.endTs = endTs;
  }

  public MultiplayQueryResultModel tokens(List<MultiplayQueryResultModelTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayQueryResultModel addTokensItem(MultiplayQueryResultModelTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayQueryResultModelTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public List<MultiplayQueryResultModelTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayQueryResultModelTokens> tokens) {
    this.tokens = tokens;
  }

  public MultiplayQueryResultModel dataVer(String dataVer) {
    this.dataVer = dataVer;
    return this;
  }

   /**
   * Get dataVer
   * @return dataVer
  **/
  public String getDataVer() {
    return dataVer;
  }

  public void setDataVer(String dataVer) {
    this.dataVer = dataVer;
  }

  public MultiplayQueryResultModel mpId(String mpId) {
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

  public MultiplayQueryResultModel config(MultiplayQueryResultModelConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public MultiplayQueryResultModelConfig getConfig() {
    return config;
  }

  public void setConfig(MultiplayQueryResultModelConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayQueryResultModel multiplayQueryResultModel = (MultiplayQueryResultModel) o;
    return Objects.equals(this.creatorTokenId, multiplayQueryResultModel.creatorTokenId) &&
        Objects.equals(this.endTs, multiplayQueryResultModel.endTs) &&
        Objects.equals(this.tokens, multiplayQueryResultModel.tokens) &&
        Objects.equals(this.dataVer, multiplayQueryResultModel.dataVer) &&
        Objects.equals(this.mpId, multiplayQueryResultModel.mpId) &&
        Objects.equals(this.config, multiplayQueryResultModel.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorTokenId, endTs, tokens, dataVer, mpId, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayQueryResultModel {");
    
    sb.append(",creatorTokenId: ").append(toIndentedString(creatorTokenId));
    sb.append(",endTs: ").append(toIndentedString(endTs));
    sb.append(",tokens: ").append(toIndentedString(tokens));
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",config: ").append(toIndentedString(config));
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
