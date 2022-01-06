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
 * LegalTag properties
 */
@ApiModel(description = "LegalTag properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:53:58.989Z")
public class LegalTagProperties {
  @SerializedName("contractId")
  private String contractId = null;

  @SerializedName("countryOfOrigin")
  private List<String> countryOfOrigin = new ArrayList<String>();

  @SerializedName("dataType")
  private String dataType = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("exportClassification")
  private String exportClassification = null;

  @SerializedName("originator")
  private String originator = null;

  @SerializedName("personalData")
  private String personalData = null;

  @SerializedName("securityClassification")
  private String securityClassification = null;

  public LegalTagProperties contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * The Id of the physical contract associated with the data being ingested.
   * @return contractId
  **/
  @ApiModelProperty(example = "No Contract Related", required = true, value = "The Id of the physical contract associated with the data being ingested.")
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public LegalTagProperties countryOfOrigin(List<String> countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

  public LegalTagProperties addCountryOfOriginItem(String countryOfOriginItem) {
    this.countryOfOrigin.add(countryOfOriginItem);
    return this;
  }

   /**
   * The ISO Alpha 2 country code(s) of where the data relates to.
   * @return countryOfOrigin
  **/
  @ApiModelProperty(example = "\"US\"", required = true, value = "The ISO Alpha 2 country code(s) of where the data relates to.")
  public List<String> getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(List<String> countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public LegalTagProperties dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The type of data being ingested.
   * @return dataType
  **/
  @ApiModelProperty(example = "Third Party Data", required = true, value = "The type of data being ingested.")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public LegalTagProperties expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The optional expiration date of the contract in the format YYYY-MM-DD
   * @return expirationDate
  **/
  @ApiModelProperty(example = "2025-12-25", required = true, value = "The optional expiration date of the contract in the format YYYY-MM-DD")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public LegalTagProperties exportClassification(String exportClassification) {
    this.exportClassification = exportClassification;
    return this;
  }

   /**
   * The ECCN value of the data if one applies.
   * @return exportClassification
  **/
  @ApiModelProperty(example = "EAR99", required = true, value = "The ECCN value of the data if one applies.")
  public String getExportClassification() {
    return exportClassification;
  }

  public void setExportClassification(String exportClassification) {
    this.exportClassification = exportClassification;
  }

  public LegalTagProperties originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * The company who owns the data.
   * @return originator
  **/
  @ApiModelProperty(example = "Contoso", required = true, value = "The company who owns the data.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public LegalTagProperties personalData(String personalData) {
    this.personalData = personalData;
    return this;
  }

   /**
   * Whether the data contains any personally identifiable data.
   * @return personalData
  **/
  @ApiModelProperty(example = "No Personal Data", required = true, value = "Whether the data contains any personally identifiable data.")
  public String getPersonalData() {
    return personalData;
  }

  public void setPersonalData(String personalData) {
    this.personalData = personalData;
  }

  public LegalTagProperties securityClassification(String securityClassification) {
    this.securityClassification = securityClassification;
    return this;
  }

   /**
   * The security classification of the data.
   * @return securityClassification
  **/
  @ApiModelProperty(example = "Private", required = true, value = "The security classification of the data.")
  public String getSecurityClassification() {
    return securityClassification;
  }

  public void setSecurityClassification(String securityClassification) {
    this.securityClassification = securityClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTagProperties legalTagProperties = (LegalTagProperties) o;
    return Objects.equals(this.contractId, legalTagProperties.contractId) &&
        Objects.equals(this.countryOfOrigin, legalTagProperties.countryOfOrigin) &&
        Objects.equals(this.dataType, legalTagProperties.dataType) &&
        Objects.equals(this.expirationDate, legalTagProperties.expirationDate) &&
        Objects.equals(this.exportClassification, legalTagProperties.exportClassification) &&
        Objects.equals(this.originator, legalTagProperties.originator) &&
        Objects.equals(this.personalData, legalTagProperties.personalData) &&
        Objects.equals(this.securityClassification, legalTagProperties.securityClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, countryOfOrigin, dataType, expirationDate, exportClassification, originator, personalData, securityClassification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTagProperties {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    exportClassification: ").append(toIndentedString(exportClassification)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    securityClassification: ").append(toIndentedString(securityClassification)).append("\n");
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

