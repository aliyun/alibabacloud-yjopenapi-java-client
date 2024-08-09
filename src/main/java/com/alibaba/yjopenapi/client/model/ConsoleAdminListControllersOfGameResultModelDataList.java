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

  private String bgPic = null;


  private String ctltype = null;


  private String name = null;


  private String id = null;


  private Integer type = null;


  private Integer priority = null;


  private String config = null;


  public ConsoleAdminListControllersOfGameResultModelDataList bgPic(String bgPic) {
    this.bgPic = bgPic;
    return this;
  }

   /**
   * Get bgPic
   * @return bgPic
  **/
  public String getBgPic() {
    return bgPic;
  }

  public void setBgPic(String bgPic) {
    this.bgPic = bgPic;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList ctltype(String ctltype) {
    this.ctltype = ctltype;
    return this;
  }

   /**
   * Get ctltype
   * @return ctltype
  **/
  public String getCtltype() {
    return ctltype;
  }

  public void setCtltype(String ctltype) {
    this.ctltype = ctltype;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ConsoleAdminListControllersOfGameResultModelDataList config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
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
    ConsoleAdminListControllersOfGameResultModelDataList consoleAdminListControllersOfGameResultModelDataList = (ConsoleAdminListControllersOfGameResultModelDataList) o;
    return Objects.equals(this.bgPic, consoleAdminListControllersOfGameResultModelDataList.bgPic) &&
        Objects.equals(this.ctltype, consoleAdminListControllersOfGameResultModelDataList.ctltype) &&
        Objects.equals(this.name, consoleAdminListControllersOfGameResultModelDataList.name) &&
        Objects.equals(this.id, consoleAdminListControllersOfGameResultModelDataList.id) &&
        Objects.equals(this.type, consoleAdminListControllersOfGameResultModelDataList.type) &&
        Objects.equals(this.priority, consoleAdminListControllersOfGameResultModelDataList.priority) &&
        Objects.equals(this.config, consoleAdminListControllersOfGameResultModelDataList.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgPic, ctltype, name, id, type, priority, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleAdminListControllersOfGameResultModelDataList {");
    
    sb.append(",bgPic: ").append(toIndentedString(bgPic));
    sb.append(",ctltype: ").append(toIndentedString(ctltype));
    sb.append(",name: ").append(toIndentedString(name));
    sb.append(",id: ").append(toIndentedString(id));
    sb.append(",type: ").append(toIndentedString(type));
    sb.append(",priority: ").append(toIndentedString(priority));
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
