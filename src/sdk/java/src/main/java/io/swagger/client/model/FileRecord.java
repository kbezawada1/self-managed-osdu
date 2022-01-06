/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileAcl;
import io.swagger.client.model.FileLegal;
import io.swagger.client.model.FileLinkList;
import io.swagger.client.model.Files;
import java.io.IOException;

/**
 * Metadata record.
 */
@ApiModel(description = "Metadata record.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:04:58.542Z")
public class FileRecord {
  @SerializedName("id")
  private String id = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("acl")
  private FileAcl acl = null;

  @SerializedName("legal")
  private FileLegal legal = null;

  @SerializedName("data")
  private Files data = null;

  @SerializedName("ancestry")
  private FileLinkList ancestry = null;

   /**
   * Unique identifier generated by the system for the file metadata record.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier generated by the system for the file metadata record.")
  public String getId() {
    return id;
  }

  public FileRecord kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of data being ingested. Must follow the naming convention:data-Partition-Id}:dataset-name}:record-type}:version}.
   * @return kind
  **/
  @ApiModelProperty(example = "osdu:wks:dataset--File.Generic:1.0.0", required = true, value = "Kind of data being ingested. Must follow the naming convention:data-Partition-Id}:dataset-name}:record-type}:version}.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public FileRecord acl(FileAcl acl) {
    this.acl = acl;
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @ApiModelProperty(required = true, value = "")
  public FileAcl getAcl() {
    return acl;
  }

  public void setAcl(FileAcl acl) {
    this.acl = acl;
  }

  public FileRecord legal(FileLegal legal) {
    this.legal = legal;
    return this;
  }

   /**
   * Get legal
   * @return legal
  **/
  @ApiModelProperty(required = true, value = "")
  public FileLegal getLegal() {
    return legal;
  }

  public void setLegal(FileLegal legal) {
    this.legal = legal;
  }

  public FileRecord data(Files data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public Files getData() {
    return data;
  }

  public void setData(Files data) {
    this.data = data;
  }

  public FileRecord ancestry(FileLinkList ancestry) {
    this.ancestry = ancestry;
    return this;
  }

   /**
   * Get ancestry
   * @return ancestry
  **/
  @ApiModelProperty(value = "")
  public FileLinkList getAncestry() {
    return ancestry;
  }

  public void setAncestry(FileLinkList ancestry) {
    this.ancestry = ancestry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRecord fileRecord = (FileRecord) o;
    return Objects.equals(this.id, fileRecord.id) &&
        Objects.equals(this.kind, fileRecord.kind) &&
        Objects.equals(this.acl, fileRecord.acl) &&
        Objects.equals(this.legal, fileRecord.legal) &&
        Objects.equals(this.data, fileRecord.data) &&
        Objects.equals(this.ancestry, fileRecord.ancestry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, acl, legal, data, ancestry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ancestry: ").append(toIndentedString(ancestry)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

