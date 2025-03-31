/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO;
import java.io.Serializable;
/**
 * UsercontrollerGetUserGameArchiveResultModel
 */
public class UsercontrollerGetUserGameArchiveResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO = null;


  private String downloadUrl = null;


  private String objectMD5 = null;


  public UsercontrollerGetUserGameArchiveResultModel userGameArchiveDTO(UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO) {
    this.userGameArchiveDTO = userGameArchiveDTO;
    return this;
  }

   /**
   * Get userGameArchiveDTO
   * @return userGameArchiveDTO
  **/
  public UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO getUserGameArchiveDTO() {
    return userGameArchiveDTO;
  }

  public void setUserGameArchiveDTO(UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO userGameArchiveDTO) {
    this.userGameArchiveDTO = userGameArchiveDTO;
  }

  public UsercontrollerGetUserGameArchiveResultModel downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public UsercontrollerGetUserGameArchiveResultModel objectMD5(String objectMD5) {
    this.objectMD5 = objectMD5;
    return this;
  }

   /**
   * Get objectMD5
   * @return objectMD5
  **/
  public String getObjectMD5() {
    return objectMD5;
  }

  public void setObjectMD5(String objectMD5) {
    this.objectMD5 = objectMD5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerGetUserGameArchiveResultModel usercontrollerGetUserGameArchiveResultModel = (UsercontrollerGetUserGameArchiveResultModel) o;
    return Objects.equals(this.userGameArchiveDTO, usercontrollerGetUserGameArchiveResultModel.userGameArchiveDTO) &&
        Objects.equals(this.downloadUrl, usercontrollerGetUserGameArchiveResultModel.downloadUrl) &&
        Objects.equals(this.objectMD5, usercontrollerGetUserGameArchiveResultModel.objectMD5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGameArchiveDTO, downloadUrl, objectMD5);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetUserGameArchiveResultModel {");
    
    sb.append(",userGameArchiveDTO: ").append(toIndentedString(userGameArchiveDTO));
    sb.append(",downloadUrl: ").append(toIndentedString(downloadUrl));
    sb.append(",objectMD5: ").append(toIndentedString(objectMD5));
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
