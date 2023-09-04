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
 * MultiplayDemoQueryMultiPlayResultModelConfig
 */
public class MultiplayDemoQueryMultiPlayResultModelConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer maxToken = null;


  private Integer offlineTimeout = null;


  private Boolean forbidJoin = null;


  private Integer hostTimeout = null;


  private Integer connectTimeout = null;


  private Integer inputTimeout = null;


  public MultiplayDemoQueryMultiPlayResultModelConfig maxToken(Integer maxToken) {
    this.maxToken = maxToken;
    return this;
  }

   /**
   * Get maxToken
   * @return maxToken
  **/
  public Integer getMaxToken() {
    return maxToken;
  }

  public void setMaxToken(Integer maxToken) {
    this.maxToken = maxToken;
  }

  public MultiplayDemoQueryMultiPlayResultModelConfig offlineTimeout(Integer offlineTimeout) {
    this.offlineTimeout = offlineTimeout;
    return this;
  }

   /**
   * Get offlineTimeout
   * @return offlineTimeout
  **/
  public Integer getOfflineTimeout() {
    return offlineTimeout;
  }

  public void setOfflineTimeout(Integer offlineTimeout) {
    this.offlineTimeout = offlineTimeout;
  }

  public MultiplayDemoQueryMultiPlayResultModelConfig forbidJoin(Boolean forbidJoin) {
    this.forbidJoin = forbidJoin;
    return this;
  }

   /**
   * Get forbidJoin
   * @return forbidJoin
  **/
  public Boolean getForbidJoin() {
    return forbidJoin;
  }

  public void setForbidJoin(Boolean forbidJoin) {
    this.forbidJoin = forbidJoin;
  }

  public MultiplayDemoQueryMultiPlayResultModelConfig hostTimeout(Integer hostTimeout) {
    this.hostTimeout = hostTimeout;
    return this;
  }

   /**
   * Get hostTimeout
   * @return hostTimeout
  **/
  public Integer getHostTimeout() {
    return hostTimeout;
  }

  public void setHostTimeout(Integer hostTimeout) {
    this.hostTimeout = hostTimeout;
  }

  public MultiplayDemoQueryMultiPlayResultModelConfig connectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * Get connectTimeout
   * @return connectTimeout
  **/
  public Integer getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public MultiplayDemoQueryMultiPlayResultModelConfig inputTimeout(Integer inputTimeout) {
    this.inputTimeout = inputTimeout;
    return this;
  }

   /**
   * Get inputTimeout
   * @return inputTimeout
  **/
  public Integer getInputTimeout() {
    return inputTimeout;
  }

  public void setInputTimeout(Integer inputTimeout) {
    this.inputTimeout = inputTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplayDemoQueryMultiPlayResultModelConfig multiplayDemoQueryMultiPlayResultModelConfig = (MultiplayDemoQueryMultiPlayResultModelConfig) o;
    return Objects.equals(this.maxToken, multiplayDemoQueryMultiPlayResultModelConfig.maxToken) &&
        Objects.equals(this.offlineTimeout, multiplayDemoQueryMultiPlayResultModelConfig.offlineTimeout) &&
        Objects.equals(this.forbidJoin, multiplayDemoQueryMultiPlayResultModelConfig.forbidJoin) &&
        Objects.equals(this.hostTimeout, multiplayDemoQueryMultiPlayResultModelConfig.hostTimeout) &&
        Objects.equals(this.connectTimeout, multiplayDemoQueryMultiPlayResultModelConfig.connectTimeout) &&
        Objects.equals(this.inputTimeout, multiplayDemoQueryMultiPlayResultModelConfig.inputTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxToken, offlineTimeout, forbidJoin, hostTimeout, connectTimeout, inputTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayDemoQueryMultiPlayResultModelConfig {");
    
    sb.append(",maxToken: ").append(toIndentedString(maxToken));
    sb.append(",offlineTimeout: ").append(toIndentedString(offlineTimeout));
    sb.append(",forbidJoin: ").append(toIndentedString(forbidJoin));
    sb.append(",hostTimeout: ").append(toIndentedString(hostTimeout));
    sb.append(",connectTimeout: ").append(toIndentedString(connectTimeout));
    sb.append(",inputTimeout: ").append(toIndentedString(inputTimeout));
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
