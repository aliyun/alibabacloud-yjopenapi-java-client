/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.MultiplayInitResultModelTokens;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * MultiplayInitResultModel
 */
public class MultiplayInitResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mpId = null;


  private String dataVer = null;


  private String creatorTokenId = null;


  private List<MultiplayInitResultModelTokens> tokens = null;


  public MultiplayInitResultModel mpId(String mpId) {
    this.mpId = mpId;
    return this;
  }

   /**
   * 联机唯一Id
   * @return mpId
  **/
  public String getMpId() {
    return mpId;
  }

  public void setMpId(String mpId) {
    this.mpId = mpId;
  }

  public MultiplayInitResultModel dataVer(String dataVer) {
    this.dataVer = dataVer;
    return this;
  }

   /**
   * 当前联机数据版本号
   * @return dataVer
  **/
  public String getDataVer() {
    return dataVer;
  }

  public void setDataVer(String dataVer) {
    this.dataVer = dataVer;
  }

  public MultiplayInitResultModel creatorTokenId(String creatorTokenId) {
    this.creatorTokenId = creatorTokenId;
    return this;
  }

   /**
   * 创建者令牌Id
   * @return creatorTokenId
  **/
  public String getCreatorTokenId() {
    return creatorTokenId;
  }

  public void setCreatorTokenId(String creatorTokenId) {
    this.creatorTokenId = creatorTokenId;
  }

  public MultiplayInitResultModel tokens(List<MultiplayInitResultModelTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public MultiplayInitResultModel addTokensItem(MultiplayInitResultModelTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<MultiplayInitResultModelTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * 联机所有人员信息
   * @return tokens
  **/
  public List<MultiplayInitResultModelTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<MultiplayInitResultModelTokens> tokens) {
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
    MultiplayInitResultModel multiplayInitResultModel = (MultiplayInitResultModel) o;
    return Objects.equals(this.mpId, multiplayInitResultModel.mpId) &&
        Objects.equals(this.dataVer, multiplayInitResultModel.dataVer) &&
        Objects.equals(this.creatorTokenId, multiplayInitResultModel.creatorTokenId) &&
        Objects.equals(this.tokens, multiplayInitResultModel.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpId, dataVer, creatorTokenId, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitResultModel {");
    
    sb.append(",mpId: ").append(toIndentedString(mpId));
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
    sb.append(",creatorTokenId: ").append(toIndentedString(creatorTokenId));
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
