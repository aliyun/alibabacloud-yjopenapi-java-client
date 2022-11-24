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
 * MultiplayInitConfig
 */
public class MultiplayInitConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer maxToken = null;


  private Integer hostTimeout = null;


  private Integer connectTimeout = null;


  private Integer inputTimeout = null;


  public MultiplayInitConfig maxToken(Integer maxToken) {
    this.maxToken = maxToken;
    return this;
  }

   /**
   * 联机最多能进的人数
   * @return maxToken
  **/
  public Integer getMaxToken() {
    return maxToken;
  }

  public void setMaxToken(Integer maxToken) {
    this.maxToken = maxToken;
  }

  public MultiplayInitConfig hostTimeout(Integer hostTimeout) {
    this.hostTimeout = hostTimeout;
    return this;
  }

   /**
   * 联机主机断连超时时间
   * @return hostTimeout
  **/
  public Integer getHostTimeout() {
    return hostTimeout;
  }

  public void setHostTimeout(Integer hostTimeout) {
    this.hostTimeout = hostTimeout;
  }

  public MultiplayInitConfig connectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * 联机从机玩家断连超时时间
   * @return connectTimeout
  **/
  public Integer getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public MultiplayInitConfig inputTimeout(Integer inputTimeout) {
    this.inputTimeout = inputTimeout;
    return this;
  }

   /**
   * 联机从机无操作超时时间
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
    MultiplayInitConfig multiplayInitConfig = (MultiplayInitConfig) o;
    return Objects.equals(this.maxToken, multiplayInitConfig.maxToken) &&
        Objects.equals(this.hostTimeout, multiplayInitConfig.hostTimeout) &&
        Objects.equals(this.connectTimeout, multiplayInitConfig.connectTimeout) &&
        Objects.equals(this.inputTimeout, multiplayInitConfig.inputTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxToken, hostTimeout, connectTimeout, inputTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiplayInitConfig {");
    
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
