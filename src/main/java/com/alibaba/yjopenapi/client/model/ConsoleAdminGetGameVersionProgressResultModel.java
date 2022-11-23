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

  private String event = null;


  private String status = null;


  private String description = null;


  private Map<String, String> extra = null;


  public ConsoleAdminGetGameVersionProgressResultModel event(String event) {
    this.event = event;
    return this;
  }

   /**
   * 当前所处阶段
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
   * 当前状态
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsoleAdminGetGameVersionProgressResultModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminGetGameVersionProgressResultModel consoleAdminGetGameVersionProgressResultModel = (ConsoleAdminGetGameVersionProgressResultModel) o;
    return Objects.equals(this.event, consoleAdminGetGameVersionProgressResultModel.event) &&
        Objects.equals(this.status, consoleAdminGetGameVersionProgressResultModel.status) &&
        Objects.equals(this.description, consoleAdminGetGameVersionProgressResultModel.description) &&
        Objects.equals(this.extra, consoleAdminGetGameVersionProgressResultModel.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, status, description, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminGetGameVersionProgressResultModel {");
    
    sb.append(",event: ").append(toIndentedString(event));
    sb.append(",status: ").append(toIndentedString(status));
    sb.append(",description: ").append(toIndentedString(description));
    sb.append(",extra: ").append(toIndentedString(extra));
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
