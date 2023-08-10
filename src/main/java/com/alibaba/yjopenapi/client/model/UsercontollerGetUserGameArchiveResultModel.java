/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontollerGetUserGameArchiveResultModelUserGameArchiveDTO;
import java.io.Serializable;
/**
 * UsercontollerGetUserGameArchiveResultModel
 */
public class UsercontollerGetUserGameArchiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private String downloadUrl = null;


  private String objectMD5 = null;


  private UsercontollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO = null;


  public UsercontollerGetUserGameArchiveResultModel downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接
   * @return downloadUrl
  **/
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public UsercontollerGetUserGameArchiveResultModel objectMD5(String objectMD5) {
    this.objectMD5 = objectMD5;
    return this;
  }

   /**
   * 存档MD5
   * @return objectMD5
  **/
  public String getObjectMD5() {
    return objectMD5;
  }

  public void setObjectMD5(String objectMD5) {
    this.objectMD5 = objectMD5;
  }

  public UsercontollerGetUserGameArchiveResultModel userGameArchiveDTO(UsercontollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO) {
    this.userGameArchiveDTO = userGameArchiveDTO;
    return this;
  }

   /**
   * Get userGameArchiveDTO
   * @return userGameArchiveDTO
  **/
  public UsercontollerGetUserGameArchiveResultModelUserGameArchiveDTO getUserGameArchiveDTO() {
    return userGameArchiveDTO;
  }

  public void setUserGameArchiveDTO(UsercontollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO) {
    this.userGameArchiveDTO = userGameArchiveDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontollerGetUserGameArchiveResultModel usercontollerGetUserGameArchiveResultModel = (UsercontollerGetUserGameArchiveResultModel) o;
    return Objects.equals(this.downloadUrl, usercontollerGetUserGameArchiveResultModel.downloadUrl) &&
        Objects.equals(this.objectMD5, usercontollerGetUserGameArchiveResultModel.objectMD5) &&
        Objects.equals(this.userGameArchiveDTO, usercontollerGetUserGameArchiveResultModel.userGameArchiveDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, objectMD5, userGameArchiveDTO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontollerGetUserGameArchiveResultModel {");
    
    sb.append(",downloadUrl: ").append(toIndentedString(downloadUrl));
    sb.append(",objectMD5: ").append(toIndentedString(objectMD5));
    sb.append(",userGameArchiveDTO: ").append(toIndentedString(userGameArchiveDTO));
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
