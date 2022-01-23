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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ApplicantResponse;
import org.openapitools.client.model.EmploymentHistoryList;

/**
 * Personally Identifiable Information
 */
@ApiModel(description = "Personally Identifiable Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class PIIList {
  public static final String SERIALIZED_NAME_APPLICANT_INFORMATION = "applicantInformation";
  @SerializedName(SERIALIZED_NAME_APPLICANT_INFORMATION)
  private ApplicantResponse applicantInformation;

  public static final String SERIALIZED_NAME_EMPLOYMENT_HISTORY = "employmentHistory";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_HISTORY)
  private List<EmploymentHistoryList> employmentHistory = null;


  public PIIList applicantInformation(ApplicantResponse applicantInformation) {
    
    this.applicantInformation = applicantInformation;
    return this;
  }

   /**
   * Get applicantInformation
   * @return applicantInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantResponse getApplicantInformation() {
    return applicantInformation;
  }


  public void setApplicantInformation(ApplicantResponse applicantInformation) {
    this.applicantInformation = applicantInformation;
  }


  public PIIList employmentHistory(List<EmploymentHistoryList> employmentHistory) {
    
    this.employmentHistory = employmentHistory;
    return this;
  }

  public PIIList addEmploymentHistoryItem(EmploymentHistoryList employmentHistoryItem) {
    if (this.employmentHistory == null) {
      this.employmentHistory = new ArrayList<EmploymentHistoryList>();
    }
    this.employmentHistory.add(employmentHistoryItem);
    return this;
  }

   /**
   * contains consumers employer information
   * @return employmentHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "contains consumers employer information")

  public List<EmploymentHistoryList> getEmploymentHistory() {
    return employmentHistory;
  }


  public void setEmploymentHistory(List<EmploymentHistoryList> employmentHistory) {
    this.employmentHistory = employmentHistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PIIList piIList = (PIIList) o;
    return Objects.equals(this.applicantInformation, piIList.applicantInformation) &&
        Objects.equals(this.employmentHistory, piIList.employmentHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantInformation, employmentHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PIIList {\n");
    sb.append("    applicantInformation: ").append(toIndentedString(applicantInformation)).append("\n");
    sb.append("    employmentHistory: ").append(toIndentedString(employmentHistory)).append("\n");
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
