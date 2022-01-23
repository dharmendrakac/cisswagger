/*
 * cis-verification-cpd-service
 * This document consists of unecrypted version of  Experian Verify service endpoints. This service returns standard payroll data Report which has paycheck, employer, employee PII, grosspay and other information.
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.Applicant;

/**
 * Personally Identifiable Information
 */
@ApiModel(description = "Personally Identifiable Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class PII {
  public static final String SERIALIZED_NAME_APPLICANT_INFORMATION = "applicantInformation";
  @SerializedName(SERIALIZED_NAME_APPLICANT_INFORMATION)
  private Applicant applicantInformation;


  public PII applicantInformation(Applicant applicantInformation) {
    
    this.applicantInformation = applicantInformation;
    return this;
  }

   /**
   * Get applicantInformation
   * @return applicantInformation
  **/
  @ApiModelProperty(required = true, value = "")

  public Applicant getApplicantInformation() {
    return applicantInformation;
  }


  public void setApplicantInformation(Applicant applicantInformation) {
    this.applicantInformation = applicantInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PII PII = (PII) o;
    return Objects.equals(this.applicantInformation, PII.applicantInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PII {\n");
    sb.append("    applicantInformation: ").append(toIndentedString(applicantInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
