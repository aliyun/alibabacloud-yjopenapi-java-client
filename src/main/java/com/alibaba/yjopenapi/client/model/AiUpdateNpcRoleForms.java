/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.alibaba.yjopenapi.client.model.AiUpdateNpcRoleFormsKnowledgeBases;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * AiUpdateNpcRoleForms
 */
public class AiUpdateNpcRoleForms implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id = null;


  private String name = null;


  private String description = null;


  private Long figureId = null;


  private Long voiceId = null;


  private String characters = null;


  private String greetings = null;


  private List<String> guidance = new ArrayList<String>();


  private List<AiUpdateNpcRoleFormsKnowledgeBases> knowledgeBases = new ArrayList<AiUpdateNpcRoleFormsKnowledgeBases>();


  private List<Long> pluginIds = null;


  private Integer shortMemoryRound = null;


  private String operator = null;


  public AiUpdateNpcRoleForms id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AiUpdateNpcRoleForms name(String name) {
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

  public AiUpdateNpcRoleForms description(String description) {
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

  public AiUpdateNpcRoleForms figureId(Long figureId) {
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

  public AiUpdateNpcRoleForms voiceId(Long voiceId) {
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

  public AiUpdateNpcRoleForms characters(String characters) {
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

  public AiUpdateNpcRoleForms greetings(String greetings) {
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

  public AiUpdateNpcRoleForms guidance(List<String> guidance) {
    this.guidance = guidance;
    return this;
  }

  public AiUpdateNpcRoleForms addGuidanceItem(String guidanceItem) {
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

  public AiUpdateNpcRoleForms knowledgeBases(List<AiUpdateNpcRoleFormsKnowledgeBases> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
    return this;
  }

  public AiUpdateNpcRoleForms addKnowledgeBasesItem(AiUpdateNpcRoleFormsKnowledgeBases knowledgeBasesItem) {
    this.knowledgeBases.add(knowledgeBasesItem);
    return this;
  }

   /**
   * Get knowledgeBases
   * @return knowledgeBases
  **/
  public List<AiUpdateNpcRoleFormsKnowledgeBases> getKnowledgeBases() {
    return knowledgeBases;
  }

  public void setKnowledgeBases(List<AiUpdateNpcRoleFormsKnowledgeBases> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
  }

  public AiUpdateNpcRoleForms pluginIds(List<Long> pluginIds) {
    this.pluginIds = pluginIds;
    return this;
  }

  public AiUpdateNpcRoleForms addPluginIdsItem(Long pluginIdsItem) {
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

  public AiUpdateNpcRoleForms shortMemoryRound(Integer shortMemoryRound) {
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

  public AiUpdateNpcRoleForms operator(String operator) {
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
    AiUpdateNpcRoleForms aiUpdateNpcRoleForms = (AiUpdateNpcRoleForms) o;
    return Objects.equals(this.id, aiUpdateNpcRoleForms.id) &&
        Objects.equals(this.name, aiUpdateNpcRoleForms.name) &&
        Objects.equals(this.description, aiUpdateNpcRoleForms.description) &&
        Objects.equals(this.figureId, aiUpdateNpcRoleForms.figureId) &&
        Objects.equals(this.voiceId, aiUpdateNpcRoleForms.voiceId) &&
        Objects.equals(this.characters, aiUpdateNpcRoleForms.characters) &&
        Objects.equals(this.greetings, aiUpdateNpcRoleForms.greetings) &&
        Objects.equals(this.guidance, aiUpdateNpcRoleForms.guidance) &&
        Objects.equals(this.knowledgeBases, aiUpdateNpcRoleForms.knowledgeBases) &&
        Objects.equals(this.pluginIds, aiUpdateNpcRoleForms.pluginIds) &&
        Objects.equals(this.shortMemoryRound, aiUpdateNpcRoleForms.shortMemoryRound) &&
        Objects.equals(this.operator, aiUpdateNpcRoleForms.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, figureId, voiceId, characters, greetings, guidance, knowledgeBases, pluginIds, shortMemoryRound, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUpdateNpcRoleForms {");
    
    sb.append(",id: ").append(toIndentedString(id));
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
