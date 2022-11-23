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
 * MultiplayJoinResultModel
 */
public class MultiplayJoinResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String dataVer = null;


  private String tokenId = null;


  private String session = null;


  public MultiplayJoinResultModel dataVer(String dataVer) {
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

  public MultiplayJoinResultModel tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * 加入人令牌Id
   * @return tokenId
  **/
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public MultiplayJoinResultModel session(String session) {
    this.session = session;
    return this;
  }

   /**
   * 加入者sessionId
   * @return session
  **/
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayJoinResultModel multiplayJoinResultModel = (MultiplayJoinResultModel) o;
    return Objects.equals(this.dataVer, multiplayJoinResultModel.dataVer) &&
        Objects.equals(this.tokenId, multiplayJoinResultModel.tokenId) &&
        Objects.equals(this.session, multiplayJoinResultModel.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVer, tokenId, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayJoinResultModel {");
    
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",session: ").append(toIndentedString(session));
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
