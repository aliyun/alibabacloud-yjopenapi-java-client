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

  private String tokenId = null;


  private String session = null;


  private String dataVer = null;


  public MultiplayJoinResultModel tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
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
   * Get session
   * @return session
  **/
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }

  public MultiplayJoinResultModel dataVer(String dataVer) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayJoinResultModel multiplayJoinResultModel = (MultiplayJoinResultModel) o;
    return Objects.equals(this.tokenId, multiplayJoinResultModel.tokenId) &&
        Objects.equals(this.session, multiplayJoinResultModel.session) &&
        Objects.equals(this.dataVer, multiplayJoinResultModel.dataVer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, session, dataVer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayJoinResultModel {");
    
    sb.append(",tokenId: ").append(toIndentedString(tokenId));
    sb.append(",session: ").append(toIndentedString(session));
    sb.append(",dataVer: ").append(toIndentedString(dataVer));
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
