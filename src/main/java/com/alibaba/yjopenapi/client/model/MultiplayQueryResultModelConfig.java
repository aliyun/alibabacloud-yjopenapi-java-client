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
 * MultiplayQueryResultModelConfig
 */
public class MultiplayQueryResultModelConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer maxToken = null;


  private Integer hostTimeout = null;


  private Integer connectTimeout = null;


  private Integer inputTimeout = null;


  public MultiplayQueryResultModelConfig maxToken(Integer maxToken) {
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

  public MultiplayQueryResultModelConfig hostTimeout(Integer hostTimeout) {
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

  public MultiplayQueryResultModelConfig connectTimeout(Integer connectTimeout) {
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

  public MultiplayQueryResultModelConfig inputTimeout(Integer inputTimeout) {
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
    MultiplayQueryResultModelConfig multiplayQueryResultModelConfig = (MultiplayQueryResultModelConfig) o;
    return Objects.equals(this.maxToken, multiplayQueryResultModelConfig.maxToken) &&
        Objects.equals(this.hostTimeout, multiplayQueryResultModelConfig.hostTimeout) &&
        Objects.equals(this.connectTimeout, multiplayQueryResultModelConfig.connectTimeout) &&
        Objects.equals(this.inputTimeout, multiplayQueryResultModelConfig.inputTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxToken, hostTimeout, connectTimeout, inputTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayQueryResultModelConfig {");
    
    sb.append(",maxToken: ").append(toIndentedString(maxToken));
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
