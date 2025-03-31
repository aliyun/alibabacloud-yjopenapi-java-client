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
 * ConsoleAdminCreateGameForms
 */
public class ConsoleAdminCreateGameForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameName = null;


  private Long platformType = null;


  private Integer osType = null;


  public ConsoleAdminCreateGameForms gameName(String gameName) {
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

  public ConsoleAdminCreateGameForms platformType(Long platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  public Long getPlatformType() {
    return platformType;
  }

  public void setPlatformType(Long platformType) {
    this.platformType = platformType;
  }

  public ConsoleAdminCreateGameForms osType(Integer osType) {
    this.osType = osType;
    return this;
  }

   /**
   * Get osType
   * @return osType
  **/
  public Integer getOsType() {
    return osType;
  }

  public void setOsType(Integer osType) {
    this.osType = osType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminCreateGameForms consoleAdminCreateGameForms = (ConsoleAdminCreateGameForms) o;
    return Objects.equals(this.gameName, consoleAdminCreateGameForms.gameName) &&
        Objects.equals(this.platformType, consoleAdminCreateGameForms.platformType) &&
        Objects.equals(this.osType, consoleAdminCreateGameForms.osType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameName, platformType, osType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminCreateGameForms {");
    
    sb.append(",gameName: ").append(toIndentedString(gameName));
    sb.append(",platformType: ").append(toIndentedString(platformType));
    sb.append(",osType: ").append(toIndentedString(osType));
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
