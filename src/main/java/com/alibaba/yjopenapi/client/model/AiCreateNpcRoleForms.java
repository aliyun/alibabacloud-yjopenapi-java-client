/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiCreateNpcRoleFormsKnowledgeBases;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiCreateNpcRoleForms
 */
public class AiCreateNpcRoleForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name = null;


  private String description = null;


  private Long figureId = null;


  private Long voiceId = null;


  private String characters = null;


  private String greetings = null;


  private List<String> guidance = new ArrayList<String>();


  private List<AiCreateNpcRoleFormsKnowledgeBases> knowledgeBases = new ArrayList<AiCreateNpcRoleFormsKnowledgeBases>();


  private List<Long> pluginIds = null;


  private Integer shortMemoryRound = null;


  private Long tenantId = null;


  private String operator = null;


  public AiCreateNpcRoleForms name(String name) {
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

  public AiCreateNpcRoleForms description(String description) {
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

  public AiCreateNpcRoleForms figureId(Long figureId) {
    this.figureId = figureId;
    return this;
  }

   /**
   * Get figureId
   * @return figureId
  **/
  public Long getFigureId() {
    return figureId;
  }

  public void setFigureId(Long figureId) {
    this.figureId = figureId;
  }

  public AiCreateNpcRoleForms voiceId(Long voiceId) {
    this.voiceId = voiceId;
    return this;
  }

   /**
   * Get voiceId
   * @return voiceId
  **/
  public Long getVoiceId() {
    return voiceId;
  }

  public void setVoiceId(Long voiceId) {
    this.voiceId = voiceId;
  }

  public AiCreateNpcRoleForms characters(String characters) {
    this.characters = characters;
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  public String getCharacters() {
    return characters;
  }

  public void setCharacters(String characters) {
    this.characters = characters;
  }

  public AiCreateNpcRoleForms greetings(String greetings) {
    this.greetings = greetings;
    return this;
  }

   /**
   * Get greetings
   * @return greetings
  **/
  public String getGreetings() {
    return greetings;
  }

  public void setGreetings(String greetings) {
    this.greetings = greetings;
  }

  public AiCreateNpcRoleForms guidance(List<String> guidance) {
    this.guidance = guidance;
    return this;
  }

  public AiCreateNpcRoleForms addGuidanceItem(String guidanceItem) {
    this.guidance.add(guidanceItem);
    return this;
  }

   /**
   * Get guidance
   * @return guidance
  **/
  public List<String> getGuidance() {
    return guidance;
  }

  public void setGuidance(List<String> guidance) {
    this.guidance = guidance;
  }

  public AiCreateNpcRoleForms knowledgeBases(List<AiCreateNpcRoleFormsKnowledgeBases> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
    return this;
  }

  public AiCreateNpcRoleForms addKnowledgeBasesItem(AiCreateNpcRoleFormsKnowledgeBases knowledgeBasesItem) {
    this.knowledgeBases.add(knowledgeBasesItem);
    return this;
  }

   /**
   * Get knowledgeBases
   * @return knowledgeBases
  **/
  public List<AiCreateNpcRoleFormsKnowledgeBases> getKnowledgeBases() {
    return knowledgeBases;
  }

  public void setKnowledgeBases(List<AiCreateNpcRoleFormsKnowledgeBases> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
  }

  public AiCreateNpcRoleForms pluginIds(List<Long> pluginIds) {
    this.pluginIds = pluginIds;
    return this;
  }

  public AiCreateNpcRoleForms addPluginIdsItem(Long pluginIdsItem) {
    if (this.pluginIds == null) {
      this.pluginIds = new ArrayList<Long>();
    }
    this.pluginIds.add(pluginIdsItem);
    return this;
  }

   /**
   * Get pluginIds
   * @return pluginIds
  **/
  public List<Long> getPluginIds() {
    return pluginIds;
  }

  public void setPluginIds(List<Long> pluginIds) {
    this.pluginIds = pluginIds;
  }

  public AiCreateNpcRoleForms shortMemoryRound(Integer shortMemoryRound) {
    this.shortMemoryRound = shortMemoryRound;
    return this;
  }

   /**
   * Get shortMemoryRound
   * @return shortMemoryRound
  **/
  public Integer getShortMemoryRound() {
    return shortMemoryRound;
  }

  public void setShortMemoryRound(Integer shortMemoryRound) {
    this.shortMemoryRound = shortMemoryRound;
  }

  public AiCreateNpcRoleForms tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public AiCreateNpcRoleForms operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiCreateNpcRoleForms aiCreateNpcRoleForms = (AiCreateNpcRoleForms) o;
    return Objects.equals(this.name, aiCreateNpcRoleForms.name) &&
        Objects.equals(this.description, aiCreateNpcRoleForms.description) &&
        Objects.equals(this.figureId, aiCreateNpcRoleForms.figureId) &&
        Objects.equals(this.voiceId, aiCreateNpcRoleForms.voiceId) &&
        Objects.equals(this.characters, aiCreateNpcRoleForms.characters) &&
        Objects.equals(this.greetings, aiCreateNpcRoleForms.greetings) &&
        Objects.equals(this.guidance, aiCreateNpcRoleForms.guidance) &&
        Objects.equals(this.knowledgeBases, aiCreateNpcRoleForms.knowledgeBases) &&
        Objects.equals(this.pluginIds, aiCreateNpcRoleForms.pluginIds) &&
        Objects.equals(this.shortMemoryRound, aiCreateNpcRoleForms.shortMemoryRound) &&
        Objects.equals(this.tenantId, aiCreateNpcRoleForms.tenantId) &&
        Objects.equals(this.operator, aiCreateNpcRoleForms.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, figureId, voiceId, characters, greetings, guidance, knowledgeBases, pluginIds, shortMemoryRound, tenantId, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiCreateNpcRoleForms {");
    
    sb.append(",name: ").append(toIndentedString(name));
    sb.append(",description: ").append(toIndentedString(description));
    sb.append(",figureId: ").append(toIndentedString(figureId));
    sb.append(",voiceId: ").append(toIndentedString(voiceId));
    sb.append(",characters: ").append(toIndentedString(characters));
    sb.append(",greetings: ").append(toIndentedString(greetings));
    sb.append(",guidance: ").append(toIndentedString(guidance));
    sb.append(",knowledgeBases: ").append(toIndentedString(knowledgeBases));
    sb.append(",pluginIds: ").append(toIndentedString(pluginIds));
    sb.append(",shortMemoryRound: ").append(toIndentedString(shortMemoryRound));
    sb.append(",tenantId: ").append(toIndentedString(tenantId));
    sb.append(",operator: ").append(toIndentedString(operator));
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
