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

/**
 * contains consumers employer information
 */
@ApiModel(description = "contains consumers employer information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class ResellerInfo {
  public static final String SERIALIZED_NAME_END_USER_NAME = "endUserName";
  @SerializedName(SERIALIZED_NAME_END_USER_NAME)
  private String endUserName;


  public ResellerInfo endUserName(String endUserName) {
    
    this.endUserName = endUserName;
    return this;
  }

   /**
   * reseller endusername
   * @return endUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reseller endusername")

  public String getEndUserName() {
    return endUserName;
  }


  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResellerInfo resellerInfo = (ResellerInfo) o;
    return Objects.equals(this.endUserName, resellerInfo.endUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResellerInfo {\n");
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
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

