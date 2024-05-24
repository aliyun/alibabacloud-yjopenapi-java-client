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
 * ConsoleAdminListGameCcuResultModelItems
 */
public class ConsoleAdminListGameCcuResultModelItems implements Serializable {
  private static final long serialVersionUID = 1L;

  private String ccuValue = null;


  private String gameName = null;


  private String mixGameId = null;


  public ConsoleAdminListGameCcuResultModelItems ccuValue(String ccuValue) {
    this.ccuValue = ccuValue;
    return this;
  }

   /**
   * Get ccuValue
   * @return ccuValue
  **/
  public String getCcuValue() {
    return ccuValue;
  }

  public void setCcuValue(String ccuValue) {
    this.ccuValue = ccuValue;
  }

  public ConsoleAdminListGameCcuResultModelItems gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

   /**
   * Get gameName
   * @return gameName
  **/
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public ConsoleAdminListGameCcuResultModelItems mixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
    return this;
  }

   /**
   * Get mixGameId
   * @return mixGameId
  **/
  public String getMixGameId() {
    return mixGameId;
  }

  public void setMixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListGameCcuResultModelItems consoleAdminListGameCcuResultModelItems = (ConsoleAdminListGameCcuResultModelItems) o;
    return Objects.equals(this.ccuValue, consoleAdminListGameCcuResultModelItems.ccuValue) &&
        Objects.equals(this.gameName, consoleAdminListGameCcuResultModelItems.gameName) &&
        Objects.equals(this.mixGameId, consoleAdminListGameCcuResultModelItems.mixGameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccuValue, gameName, mixGameId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListGameCcuResultModelItems {");
    
    sb.append(",ccuValue: ").append(toIndentedString(ccuValue));
    sb.append(",gameName: ").append(toIndentedString(gameName));
    sb.append(",mixGameId: ").append(toIndentedString(mixGameId));
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
