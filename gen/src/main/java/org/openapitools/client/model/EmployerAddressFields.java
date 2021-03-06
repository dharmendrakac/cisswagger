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
 * contains employer address data elements
 */
@ApiModel(description = "contains employer address data elements")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class EmployerAddressFields {
  public static final String SERIALIZED_NAME_LINE_ONE = "lineOne";
  @SerializedName(SERIALIZED_NAME_LINE_ONE)
  private String lineOne;

  public static final String SERIALIZED_NAME_LINE_TWO = "lineTwo";
  @SerializedName(SERIALIZED_NAME_LINE_TWO)
  private String lineTwo;

  public static final String SERIALIZED_NAME_LINE_THREE = "lineThree";
  @SerializedName(SERIALIZED_NAME_LINE_THREE)
  private String lineThree;

  public static final String SERIALIZED_NAME_CITY_NAME = "cityName";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;


  public EmployerAddressFields lineOne(String lineOne) {
    
    this.lineOne = lineOne;
    return this;
  }

   /**
   * employer address street address
   * @return lineOne
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address street address")

  public String getLineOne() {
    return lineOne;
  }


  public void setLineOne(String lineOne) {
    this.lineOne = lineOne;
  }


  public EmployerAddressFields lineTwo(String lineTwo) {
    
    this.lineTwo = lineTwo;
    return this;
  }

   /**
   * employer address street address
   * @return lineTwo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address street address")

  public String getLineTwo() {
    return lineTwo;
  }


  public void setLineTwo(String lineTwo) {
    this.lineTwo = lineTwo;
  }


  public EmployerAddressFields lineThree(String lineThree) {
    
    this.lineThree = lineThree;
    return this;
  }

   /**
   * employer address street address
   * @return lineThree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address street address")

  public String getLineThree() {
    return lineThree;
  }


  public void setLineThree(String lineThree) {
    this.lineThree = lineThree;
  }


  public EmployerAddressFields cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * employer address city field
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address city field")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public EmployerAddressFields state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * employer address postal code
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address postal code")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public EmployerAddressFields countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * employer address country code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address country code")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public EmployerAddressFields postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * employer address postal code
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "employer address postal code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerAddressFields employerAddressFields = (EmployerAddressFields) o;
    return Objects.equals(this.lineOne, employerAddressFields.lineOne) &&
        Objects.equals(this.lineTwo, employerAddressFields.lineTwo) &&
        Objects.equals(this.lineThree, employerAddressFields.lineThree) &&
        Objects.equals(this.cityName, employerAddressFields.cityName) &&
        Objects.equals(this.state, employerAddressFields.state) &&
        Objects.equals(this.countryCode, employerAddressFields.countryCode) &&
        Objects.equals(this.postalCode, employerAddressFields.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineOne, lineTwo, lineThree, cityName, state, countryCode, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerAddressFields {\n");
    sb.append("    lineOne: ").append(toIndentedString(lineOne)).append("\n");
    sb.append("    lineTwo: ").append(toIndentedString(lineTwo)).append("\n");
    sb.append("    lineThree: ").append(toIndentedString(lineThree)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

