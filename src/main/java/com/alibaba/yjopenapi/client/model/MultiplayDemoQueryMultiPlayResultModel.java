/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayDemoQueryMultiPlayResultModelConfig;
import com.alibaba.yjopenapi.client.model.MultiplayDemoQueryMultiPlayResultModelTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayDemoQueryMultiPlayResultModel
 */
public class MultiplayDemoQueryMultiPlayResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nextTokenId = null;


  private String creatorTokenId = null;


  private Long endTs = null;


  private List<MultiplayDemoQueryMultiPlayResultModelTokens> tokens = null;


  private Long dataVer = null;


  private String mpId = null;


  private MultiplayDemoQueryMultiPlayResultModelConfig config = null;


  public MultiplayDemoQueryMultiPlayResultModel nextTokenId(String nextTokenId) {
    this.nextTokenId = nextTokenId;
    return this;
  }

   /**
   * Get nextTokenId
   * @return nextTokenId
  **/
  public String getNextTokenId() {
    return nextTokenId;
  }

  public void setNextTokenId(String nextTokenId) {
    this.nextTokenId = nextTokenId;
  }

  public MultiplayDemoQueryMultiPlayResultModel creatorTokenId(String creatorTokenId) {
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

  public MultiplayDemoQueryMultiPlayResultModel endTs(Long endTs) {
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

  public MultiplayDemoQueryMultiPlayResultModel tokens(List<MultiplayDemoQueryMultiPlayResultModelTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayDemoQueryMultiPlayResultModel addTokensItem(MultiplayDemoQueryMultiPlayResultModelTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayDemoQueryMultiPlayResultModelTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  public List<MultiplayDemoQueryMultiPlayResultModelTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayDemoQueryMultiPlayResultModelTokens> tokens) {
    this.tokens = tokens;
  }

  public MultiplayDemoQueryMultiPlayResultModel dataVer(Long dataVer) {
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

  public MultiplayDemoQueryMultiPlayResultModel mpId(String mpId) {
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

  public MultiplayDemoQueryMultiPlayResultModel config(MultiplayDemoQueryMultiPlayResultModelConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public MultiplayDemoQueryMultiPlayResultModelConfig getConfig() {
    return config;
  }

  public void setConfig(MultiplayDemoQueryMultiPlayResultModelConfig config) {
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
    MultiplayDemoQueryMultiPlayResultModel multiplayDemoQueryMultiPlayResultModel = (MultiplayDemoQueryMultiPlayResultModel) o;
    return Objects.equals(this.nextTokenId, multiplayDemoQueryMultiPlayResultModel.nextTokenId) &&
        Objects.equals(this.creatorTokenId, multiplayDemoQueryMultiPlayResultModel.creatorTokenId) &&
        Objects.equals(this.endTs, multiplayDemoQueryMultiPlayResultModel.endTs) &&
        Objects.equals(this.tokens, multiplayDemoQueryMultiPlayResultModel.tokens) &&
        Objects.equals(this.dataVer, multiplayDemoQueryMultiPlayResultModel.dataVer) &&
        Objects.equals(this.mpId, multiplayDemoQueryMultiPlayResultModel.mpId) &&
        Objects.equals(this.config, multiplayDemoQueryMultiPlayResultModel.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextTokenId, creatorTokenId, endTs, tokens, dataVer, mpId, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoQueryMultiPlayResultModel {");
    
    sb.append(",nextTokenId: ").append(toIndentedString(nextTokenId));
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
