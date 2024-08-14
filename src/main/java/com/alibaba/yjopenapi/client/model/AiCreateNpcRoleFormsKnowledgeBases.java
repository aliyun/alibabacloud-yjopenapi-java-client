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
 * AiCreateNpcRoleFormsKnowledgeBases
 */
public class AiCreateNpcRoleFormsKnowledgeBases implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long knowledgeBaseVersionId = null;


  private Long knowledgeBaseId = null;


  public AiCreateNpcRoleFormsKnowledgeBases knowledgeBaseVersionId(Long knowledgeBaseVersionId) {
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

  public AiCreateNpcRoleFormsKnowledgeBases knowledgeBaseId(Long knowledgeBaseId) {
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
    AiCreateNpcRoleFormsKnowledgeBases aiCreateNpcRoleFormsKnowledgeBases = (AiCreateNpcRoleFormsKnowledgeBases) o;
    return Objects.equals(this.knowledgeBaseVersionId, aiCreateNpcRoleFormsKnowledgeBases.knowledgeBaseVersionId) &&
        Objects.equals(this.knowledgeBaseId, aiCreateNpcRoleFormsKnowledgeBases.knowledgeBaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeBaseVersionId, knowledgeBaseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiCreateNpcRoleFormsKnowledgeBases {");
    
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
