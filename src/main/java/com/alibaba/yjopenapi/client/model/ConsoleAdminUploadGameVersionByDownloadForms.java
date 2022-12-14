/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.ConsoleAdminUploadGameVersionByDownloadDownloadType;
import java.io.Serializable;
/**
 * ConsoleAdminUploadGameVersionByDownloadForms
 */
public class ConsoleAdminUploadGameVersionByDownloadForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String hash = null;


  private String gameId = null;


  private ConsoleAdminUploadGameVersionByDownloadDownloadType downloadType = null;


  private String versionName = null;


  public ConsoleAdminUploadGameVersionByDownloadForms hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * 文件MD5校验值
   * @return hash
  **/
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public ConsoleAdminUploadGameVersionByDownloadForms gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏id
   * @return gameId
  **/
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public ConsoleAdminUploadGameVersionByDownloadForms downloadType(ConsoleAdminUploadGameVersionByDownloadDownloadType downloadType) {
    this.downloadType = downloadType;
    return this;
  }

   /**
   * 下载方式
   * @return downloadType
  **/
  public ConsoleAdminUploadGameVersionByDownloadDownloadType getDownloadType() {
    return downloadType;
  }

  public void setDownloadType(ConsoleAdminUploadGameVersionByDownloadDownloadType downloadType) {
    this.downloadType = downloadType;
  }

  public ConsoleAdminUploadGameVersionByDownloadForms versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * 自定义版本名称
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminUploadGameVersionByDownloadForms consoleAdminUploadGameVersionByDownloadForms = (ConsoleAdminUploadGameVersionByDownloadForms) o;
    return Objects.equals(this.hash, consoleAdminUploadGameVersionByDownloadForms.hash) &&
        Objects.equals(this.gameId, consoleAdminUploadGameVersionByDownloadForms.gameId) &&
        Objects.equals(this.downloadType, consoleAdminUploadGameVersionByDownloadForms.downloadType) &&
        Objects.equals(this.versionName, consoleAdminUploadGameVersionByDownloadForms.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, gameId, downloadType, versionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminUploadGameVersionByDownloadForms {");
    
    sb.append(",hash: ").append(toIndentedString(hash));
    sb.append(",gameId: ").append(toIndentedString(gameId));
    sb.append(",downloadType: ").append(toIndentedString(downloadType));
    sb.append(",versionName: ").append(toIndentedString(versionName));
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
