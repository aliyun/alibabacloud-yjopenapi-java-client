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
 * ConsoleAdminUploadGameVersionByDownloadDownloadType
 */
public class ConsoleAdminUploadGameVersionByDownloadDownloadType implements Serializable {
  private static final long serialVersionUID = 1L;

  private String type = null;


  private String gameUrl = null;


  public ConsoleAdminUploadGameVersionByDownloadDownloadType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 下载方式
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConsoleAdminUploadGameVersionByDownloadDownloadType gameUrl(String gameUrl) {
    this.gameUrl = gameUrl;
    return this;
  }

   /**
   * 游戏URL
   * @return gameUrl
  **/
  public String getGameUrl() {
    return gameUrl;
  }

  public void setGameUrl(String gameUrl) {
    this.gameUrl = gameUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminUploadGameVersionByDownloadDownloadType consoleAdminUploadGameVersionByDownloadDownloadType = (ConsoleAdminUploadGameVersionByDownloadDownloadType) o;
    return Objects.equals(this.type, consoleAdminUploadGameVersionByDownloadDownloadType.type) &&
        Objects.equals(this.gameUrl, consoleAdminUploadGameVersionByDownloadDownloadType.gameUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, gameUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminUploadGameVersionByDownloadDownloadType {");
    
    sb.append(",type: ").append(toIndentedString(type));
    sb.append(",gameUrl: ").append(toIndentedString(gameUrl));
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
