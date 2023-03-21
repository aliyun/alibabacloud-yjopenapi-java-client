/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.InteractiveGetPartyFormsConfig;
import java.io.Serializable;
/**
 * InteractiveGetPartyForms
 */
public class InteractiveGetPartyForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String mixGameId = null;


  private String userId = null;


  private Integer reConnect = null;


  private String projectId = null;


  private InteractiveGetPartyFormsConfig config = null;


  public InteractiveGetPartyForms mixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
    return this;
  }

   /**
   * 游戏ID
   * @return mixGameId
  **/
  public String getMixGameId() {
    return mixGameId;
  }

  public void setMixGameId(String mixGameId) {
    this.mixGameId = mixGameId;
  }

  public InteractiveGetPartyForms userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InteractiveGetPartyForms reConnect(Integer reConnect) {
    this.reConnect = reConnect;
    return this;
  }

   /**
   * Get reConnect
   * @return reConnect
  **/
  public Integer getReConnect() {
    return reConnect;
  }

  public void setReConnect(Integer reConnect) {
    this.reConnect = reConnect;
  }

  public InteractiveGetPartyForms projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目
   * @return projectId
  **/
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public InteractiveGetPartyForms config(InteractiveGetPartyFormsConfig config) {
    this.config = config;
    return this;
  }

   /**
   * 派对配置
   * @return config
  **/
  public InteractiveGetPartyFormsConfig getConfig() {
    return config;
  }

  public void setConfig(InteractiveGetPartyFormsConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveGetPartyForms interactiveGetPartyForms = (InteractiveGetPartyForms) o;
    return Objects.equals(this.mixGameId, interactiveGetPartyForms.mixGameId) &&
        Objects.equals(this.userId, interactiveGetPartyForms.userId) &&
        Objects.equals(this.reConnect, interactiveGetPartyForms.reConnect) &&
        Objects.equals(this.projectId, interactiveGetPartyForms.projectId) &&
        Objects.equals(this.config, interactiveGetPartyForms.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mixGameId, userId, reConnect, projectId, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveGetPartyForms {");
    
    sb.append(",mixGameId: ").append(toIndentedString(mixGameId));
    sb.append(",userId: ").append(toIndentedString(userId));
    sb.append(",reConnect: ").append(toIndentedString(reConnect));
    sb.append(",projectId: ").append(toIndentedString(projectId));
    sb.append(",config: ").append(toIndentedString(config));
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
