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
 * ConsoleAdminUploadGameVersionByDownloadFormsDownloadType
 */
public class ConsoleAdminUploadGameVersionByDownloadFormsDownloadType implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameUrl = null;


  private String type = null;


  public ConsoleAdminUploadGameVersionByDownloadFormsDownloadType gameUrl(String gameUrl) {
    this.gameUrl = gameUrl;
    return this;
  }

   /**
   * Get gameUrl
   * @return gameUrl
  **/
  public String getGameUrl() {
    return gameUrl;
  }

  public void setGameUrl(String gameUrl) {
    this.gameUrl = gameUrl;
  }

  public ConsoleAdminUploadGameVersionByDownloadFormsDownloadType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminUploadGameVersionByDownloadFormsDownloadType consoleAdminUploadGameVersionByDownloadFormsDownloadType = (ConsoleAdminUploadGameVersionByDownloadFormsDownloadType) o;
    return Objects.equals(this.gameUrl, consoleAdminUploadGameVersionByDownloadFormsDownloadType.gameUrl) &&
        Objects.equals(this.type, consoleAdminUploadGameVersionByDownloadFormsDownloadType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameUrl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminUploadGameVersionByDownloadFormsDownloadType {");
    
    sb.append(",gameUrl: ").append(toIndentedString(gameUrl));
    sb.append(",type: ").append(toIndentedString(type));
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
