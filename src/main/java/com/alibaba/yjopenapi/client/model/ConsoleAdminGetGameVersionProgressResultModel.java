/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
/**
 * ConsoleAdminGetGameVersionProgressResultModel
 */
public class ConsoleAdminGetGameVersionProgressResultModel implements Serializable {
  private static final long serialVersionUID = 1L;

  private Map<String, String> extra = null;


  private String description = null;


  private String event = null;


  private String status = null;


  public ConsoleAdminGetGameVersionProgressResultModel extra(Map<String, String> extra) {
    this.extra = extra;
    return this;
  }

  public ConsoleAdminGetGameVersionProgressResultModel putExtraItem(String key, String extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<String, String>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * 提供不固定的额外信息
   * @return extra
  **/
  public Map<String, String> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, String> extra) {
    this.extra = extra;
  }

  public ConsoleAdminGetGameVersionProgressResultModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConsoleAdminGetGameVersionProgressResultModel event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public ConsoleAdminGetGameVersionProgressResultModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameVersionProgressResultModel consoleAdminGetGameVersionProgressResultModel = (ConsoleAdminGetGameVersionProgressResultModel) o;
    return Objects.equals(this.extra, consoleAdminGetGameVersionProgressResultModel.extra) &&
        Objects.equals(this.description, consoleAdminGetGameVersionProgressResultModel.description) &&
        Objects.equals(this.event, consoleAdminGetGameVersionProgressResultModel.event) &&
        Objects.equals(this.status, consoleAdminGetGameVersionProgressResultModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, description, event, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameVersionProgressResultModel {");
    
    sb.append(",extra: ").append(toIndentedString(extra));
    sb.append(",description: ").append(toIndentedString(description));
    sb.append(",event: ").append(toIndentedString(event));
    sb.append(",status: ").append(toIndentedString(status));
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
