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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Legal meta data like legal tags, relevant other countries, legal status.
 */
@ApiModel(description = "Legal meta data like legal tags, relevant other countries, legal status.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:53:58.989Z")
public class FileLegal {
  @SerializedName("legaltags")
  private List<String> legaltags = null;

  @SerializedName("otherRelevantDataCountries")
  private List<String> otherRelevantDataCountries = null;

  @SerializedName("status")
  private String status = null;

  public FileLegal legaltags(List<String> legaltags) {
    this.legaltags = legaltags;
    return this;
  }

  public FileLegal addLegaltagsItem(String legaltagsItem) {
    if (this.legaltags == null) {
      this.legaltags = new ArrayList<String>();
    }
    this.legaltags.add(legaltagsItem);
    return this;
  }

   /**
   * The list of legal tags, see compliance API.
   * @return legaltags
  **/
  @ApiModelProperty(value = "The list of legal tags, see compliance API.")
  public List<String> getLegaltags() {
    return legaltags;
  }

  public void setLegaltags(List<String> legaltags) {
    this.legaltags = legaltags;
  }

  public FileLegal otherRelevantDataCountries(List<String> otherRelevantDataCountries) {
    this.otherRelevantDataCountries = otherRelevantDataCountries;
    return this;
  }

  public FileLegal addOtherRelevantDataCountriesItem(String otherRelevantDataCountriesItem) {
    if (this.otherRelevantDataCountries == null) {
      this.otherRelevantDataCountries = new ArrayList<String>();
    }
    this.otherRelevantDataCountries.add(otherRelevantDataCountriesItem);
    return this;
  }

   /**
   * The list of other relevant data countries using the ISO 2-letter codes, see compliance API.
   * @return otherRelevantDataCountries
  **/
  @ApiModelProperty(value = "The list of other relevant data countries using the ISO 2-letter codes, see compliance API.")
  public List<String> getOtherRelevantDataCountries() {
    return otherRelevantDataCountries;
  }

  public void setOtherRelevantDataCountries(List<String> otherRelevantDataCountries) {
    this.otherRelevantDataCountries = otherRelevantDataCountries;
  }

  public FileLegal status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The legal status.
   * @return status
  **/
  @ApiModelProperty(value = "The legal status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLegal fileLegal = (FileLegal) o;
    return Objects.equals(this.legaltags, fileLegal.legaltags) &&
        Objects.equals(this.otherRelevantDataCountries, fileLegal.otherRelevantDataCountries) &&
        Objects.equals(this.status, fileLegal.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legaltags, otherRelevantDataCountries, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLegal {\n");
    
    sb.append("    legaltags: ").append(toIndentedString(legaltags)).append("\n");
    sb.append("    otherRelevantDataCountries: ").append(toIndentedString(otherRelevantDataCountries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

