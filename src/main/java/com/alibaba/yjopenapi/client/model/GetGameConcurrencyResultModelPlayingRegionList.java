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
 * GetGameConcurrencyResultModelPlayingRegionList
 */
public class GetGameConcurrencyResultModelPlayingRegionList implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long ccu = null;


  private String regionId = null;


  public GetGameConcurrencyResultModelPlayingRegionList ccu(Long ccu) {
    this.ccu = ccu;
    return this;
  }

   /**
   * 当前游戏指定region游戏中人数
   * @return ccu
  **/
  public Long getCcu() {
    return ccu;
  }

  public void setCcu(Long ccu) {
    this.ccu = ccu;
  }

  public GetGameConcurrencyResultModelPlayingRegionList regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 当前统计的regionId
   * @return regionId
  **/
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGameConcurrencyResultModelPlayingRegionList getGameConcurrencyResultModelPlayingRegionList = (GetGameConcurrencyResultModelPlayingRegionList) o;
    return Objects.equals(this.ccu, getGameConcurrencyResultModelPlayingRegionList.ccu) &&
        Objects.equals(this.regionId, getGameConcurrencyResultModelPlayingRegionList.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccu, regionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGameConcurrencyResultModelPlayingRegionList {");
    
    sb.append(",ccu: ").append(toIndentedString(ccu));
    sb.append(",regionId: ").append(toIndentedString(regionId));
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
