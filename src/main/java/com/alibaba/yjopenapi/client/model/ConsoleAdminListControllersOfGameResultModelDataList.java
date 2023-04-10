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
 * ConsoleAdminListControllersOfGameResultModelDataList
 */
public class ConsoleAdminListControllersOfGameResultModelDataList implements Serializable {
  private static final long serialVersionUID = 1L;

  private String id = null;


  private String name = null;


  private String bgPic = null;


  private String config = null;


  private Integer type = null;


  private String ctltype = null;


  private Integer priority = null;


  public ConsoleAdminListControllersOfGameResultModelDataList id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 控制器ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 名称
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList bgPic(String bgPic) {
    this.bgPic = bgPic;
    return this;
  }

   /**
   * 背景图
   * @return bgPic
  **/
  public String getBgPic() {
    return bgPic;
  }

  public void setBgPic(String bgPic) {
    this.bgPic = bgPic;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList config(String config) {
    this.config = config;
    return this;
  }

   /**
   * 配置
   * @return config
  **/
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * 方案类型
   * @return type
  **/
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList ctltype(String ctltype) {
    this.ctltype = ctltype;
    return this;
  }

   /**
   * 控制器类型
   * @return ctltype
  **/
  public String getCtltype() {
    return ctltype;
  }

  public void setCtltype(String ctltype) {
    this.ctltype = ctltype;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 优先级
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsoleAdminListControllersOfGameResultModelDataList consoleAdminListControllersOfGameResultModelDataList = (ConsoleAdminListControllersOfGameResultModelDataList) o;
    return Objects.equals(this.id, consoleAdminListControllersOfGameResultModelDataList.id) &&
        Objects.equals(this.name, consoleAdminListControllersOfGameResultModelDataList.name) &&
        Objects.equals(this.bgPic, consoleAdminListControllersOfGameResultModelDataList.bgPic) &&
        Objects.equals(this.config, consoleAdminListControllersOfGameResultModelDataList.config) &&
        Objects.equals(this.type, consoleAdminListControllersOfGameResultModelDataList.type) &&
        Objects.equals(this.ctltype, consoleAdminListControllersOfGameResultModelDataList.ctltype) &&
        Objects.equals(this.priority, consoleAdminListControllersOfGameResultModelDataList.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bgPic, config, type, ctltype, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListControllersOfGameResultModelDataList {");
    
    sb.append(",id: ").append(toIndentedString(id));
    sb.append(",name: ").append(toIndentedString(name));
    sb.append(",bgPic: ").append(toIndentedString(bgPic));
    sb.append(",config: ").append(toIndentedString(config));
    sb.append(",type: ").append(toIndentedString(type));
    sb.append(",ctltype: ").append(toIndentedString(ctltype));
    sb.append(",priority: ").append(toIndentedString(priority));
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
