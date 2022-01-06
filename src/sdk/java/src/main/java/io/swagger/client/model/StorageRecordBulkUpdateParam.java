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
import io.swagger.client.model.StoragePatchOperation;
import io.swagger.client.model.StorageRecordQuery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Patch update input information
 */
@ApiModel(description = "Patch update input information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:44:08.388Z")
public class StorageRecordBulkUpdateParam {
  @SerializedName("query")
  private StorageRecordQuery query = null;

  @SerializedName("ops")
  private List<StoragePatchOperation> ops = new ArrayList<StoragePatchOperation>();

  public StorageRecordBulkUpdateParam query(StorageRecordQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Patch update query information
   * @return query
  **/
  @ApiModelProperty(required = true, value = "Patch update query information")
  public StorageRecordQuery getQuery() {
    return query;
  }

  public void setQuery(StorageRecordQuery query) {
    this.query = query;
  }

  public StorageRecordBulkUpdateParam ops(List<StoragePatchOperation> ops) {
    this.ops = ops;
    return this;
  }

  public StorageRecordBulkUpdateParam addOpsItem(StoragePatchOperation opsItem) {
    this.ops.add(opsItem);
    return this;
  }

   /**
   * List of operations for records pathc update
   * @return ops
  **/
  @ApiModelProperty(required = true, value = "List of operations for records pathc update")
  public List<StoragePatchOperation> getOps() {
    return ops;
  }

  public void setOps(List<StoragePatchOperation> ops) {
    this.ops = ops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageRecordBulkUpdateParam storageRecordBulkUpdateParam = (StorageRecordBulkUpdateParam) o;
    return Objects.equals(this.query, storageRecordBulkUpdateParam.query) &&
        Objects.equals(this.ops, storageRecordBulkUpdateParam.ops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, ops);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageRecordBulkUpdateParam {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
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

