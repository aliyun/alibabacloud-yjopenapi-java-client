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
 * UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO
 */
public class UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String gameSessionId = null;


  private Long gmtCreate = null;


  public UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO gameSessionId(String gameSessionId) {
    this.gameSessionId = gameSessionId;
    return this;
  }

   /**
   * 游戏会话ID
   * @return gameSessionId
  **/
  public String getGameSessionId() {
    return gameSessionId;
  }

  public void setGameSessionId(String gameSessionId) {
    this.gameSessionId = gameSessionId;
  }

  public UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO gmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 存档生成时间
   * @return gmtCreate
  **/
  public Long getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO usercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO = (UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO) o;
    return Objects.equals(this.gameSessionId, usercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO.gameSessionId) &&
        Objects.equals(this.gmtCreate, usercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO.gmtCreate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameSessionId, gmtCreate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsercontrollerGetUserGameArchiveResultModelUserGameArchiveDTO {");
    
    sb.append(",gameSessionId: ").append(toIndentedString(gameSessionId));
    sb.append(",gmtCreate: ").append(toIndentedString(gmtCreate));
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
