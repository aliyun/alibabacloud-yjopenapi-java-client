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
 * AiUpdateNpcRoleFormsKnowledgeBases
 */
public class AiUpdateNpcRoleFormsKnowledgeBases implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long knowledgeBaseVersionId = null;


  private Long knowledgeBaseId = null;


  public AiUpdateNpcRoleFormsKnowledgeBases knowledgeBaseVersionId(Long knowledgeBaseVersionId) {
    this.knowledgeBaseVersionId = knowledgeBaseVersionId;
    return this;
  }

   /**
   * Get knowledgeBaseVersionId
   * @return knowledgeBaseVersionId
  **/
  public Long getKnowledgeBaseVersionId() {
    return knowledgeBaseVersionId;
  }

  public void setKnowledgeBaseVersionId(Long knowledgeBaseVersionId) {
    this.knowledgeBaseVersionId = knowledgeBaseVersionId;
  }

  public AiUpdateNpcRoleFormsKnowledgeBases knowledgeBaseId(Long knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
    return this;
  }

   /**
   * Get knowledgeBaseId
   * @return knowledgeBaseId
  **/
  public Long getKnowledgeBaseId() {
    return knowledgeBaseId;
  }

  public void setKnowledgeBaseId(Long knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiUpdateNpcRoleFormsKnowledgeBases aiUpdateNpcRoleFormsKnowledgeBases = (AiUpdateNpcRoleFormsKnowledgeBases) o;
    return Objects.equals(this.knowledgeBaseVersionId, aiUpdateNpcRoleFormsKnowledgeBases.knowledgeBaseVersionId) &&
        Objects.equals(this.knowledgeBaseId, aiUpdateNpcRoleFormsKnowledgeBases.knowledgeBaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeBaseVersionId, knowledgeBaseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiUpdateNpcRoleFormsKnowledgeBases {");
    
    sb.append(",knowledgeBaseVersionId: ").append(toIndentedString(knowledgeBaseVersionId));
    sb.append(",knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId));
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
