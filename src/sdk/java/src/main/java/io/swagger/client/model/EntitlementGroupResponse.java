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
import io.swagger.client.model.EntitlementGroupProperties;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EntitlementGroupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:53:58.989Z")
public class EntitlementGroupResponse {
  @SerializedName("desId")
  private String desId = null;

  @SerializedName("memberEmail")
  private String memberEmail = null;

  @SerializedName("groups")
  private List<EntitlementGroupProperties> groups = null;

  public EntitlementGroupResponse desId(String desId) {
    this.desId = desId;
    return this;
  }

   /**
   * Get desId
   * @return desId
  **/
  @ApiModelProperty(value = "")
  public String getDesId() {
    return desId;
  }

  public void setDesId(String desId) {
    this.desId = desId;
  }

  public EntitlementGroupResponse memberEmail(String memberEmail) {
    this.memberEmail = memberEmail;
    return this;
  }

   /**
   * Get memberEmail
   * @return memberEmail
  **/
  @ApiModelProperty(value = "")
  public String getMemberEmail() {
    return memberEmail;
  }

  public void setMemberEmail(String memberEmail) {
    this.memberEmail = memberEmail;
  }

  public EntitlementGroupResponse groups(List<EntitlementGroupProperties> groups) {
    this.groups = groups;
    return this;
  }

  public EntitlementGroupResponse addGroupsItem(EntitlementGroupProperties groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<EntitlementGroupProperties>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A collection of groups.
   * @return groups
  **/
  @ApiModelProperty(value = "A collection of groups.")
  public List<EntitlementGroupProperties> getGroups() {
    return groups;
  }

  public void setGroups(List<EntitlementGroupProperties> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementGroupResponse entitlementGroupResponse = (EntitlementGroupResponse) o;
    return Objects.equals(this.desId, entitlementGroupResponse.desId) &&
        Objects.equals(this.memberEmail, entitlementGroupResponse.memberEmail) &&
        Objects.equals(this.groups, entitlementGroupResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desId, memberEmail, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementGroupResponse {\n");
    
    sb.append("    desId: ").append(toIndentedString(desId)).append("\n");
    sb.append("    memberEmail: ").append(toIndentedString(memberEmail)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

