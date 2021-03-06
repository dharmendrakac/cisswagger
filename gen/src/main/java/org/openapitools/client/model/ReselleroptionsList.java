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
import org.openapitools.client.model.Customfield1;
import org.openapitools.client.model.Customfield2;
import org.openapitools.client.model.Customfield3;
import org.openapitools.client.model.Customfield4;
import org.openapitools.client.model.Customfield5;

/**
 * ReselleroptionsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class ReselleroptionsList {
  public static final String SERIALIZED_NAME_LABEL1 = "label1";
  @SerializedName(SERIALIZED_NAME_LABEL1)
  private Customfield1 label1;

  public static final String SERIALIZED_NAME_LABEL2 = "label2";
  @SerializedName(SERIALIZED_NAME_LABEL2)
  private Customfield2 label2;

  public static final String SERIALIZED_NAME_LABEL3 = "label3";
  @SerializedName(SERIALIZED_NAME_LABEL3)
  private Customfield3 label3;

  public static final String SERIALIZED_NAME_LABEL4 = "label4";
  @SerializedName(SERIALIZED_NAME_LABEL4)
  private Customfield4 label4;

  public static final String SERIALIZED_NAME_LABEL5 = "label5";
  @SerializedName(SERIALIZED_NAME_LABEL5)
  private Customfield5 label5;


  public ReselleroptionsList label1(Customfield1 label1) {
    
    this.label1 = label1;
    return this;
  }

   /**
   * Get label1
   * @return label1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customfield1 getLabel1() {
    return label1;
  }


  public void setLabel1(Customfield1 label1) {
    this.label1 = label1;
  }


  public ReselleroptionsList label2(Customfield2 label2) {
    
    this.label2 = label2;
    return this;
  }

   /**
   * Get label2
   * @return label2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customfield2 getLabel2() {
    return label2;
  }


  public void setLabel2(Customfield2 label2) {
    this.label2 = label2;
  }


  public ReselleroptionsList label3(Customfield3 label3) {
    
    this.label3 = label3;
    return this;
  }

   /**
   * Get label3
   * @return label3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customfield3 getLabel3() {
    return label3;
  }


  public void setLabel3(Customfield3 label3) {
    this.label3 = label3;
  }


  public ReselleroptionsList label4(Customfield4 label4) {
    
    this.label4 = label4;
    return this;
  }

   /**
   * Get label4
   * @return label4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customfield4 getLabel4() {
    return label4;
  }


  public void setLabel4(Customfield4 label4) {
    this.label4 = label4;
  }


  public ReselleroptionsList label5(Customfield5 label5) {
    
    this.label5 = label5;
    return this;
  }

   /**
   * Get label5
   * @return label5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customfield5 getLabel5() {
    return label5;
  }


  public void setLabel5(Customfield5 label5) {
    this.label5 = label5;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReselleroptionsList reselleroptionsList = (ReselleroptionsList) o;
    return Objects.equals(this.label1, reselleroptionsList.label1) &&
        Objects.equals(this.label2, reselleroptionsList.label2) &&
        Objects.equals(this.label3, reselleroptionsList.label3) &&
        Objects.equals(this.label4, reselleroptionsList.label4) &&
        Objects.equals(this.label5, reselleroptionsList.label5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label1, label2, label3, label4, label5);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReselleroptionsList {\n");
    sb.append("    label1: ").append(toIndentedString(label1)).append("\n");
    sb.append("    label2: ").append(toIndentedString(label2)).append("\n");
    sb.append("    label3: ").append(toIndentedString(label3)).append("\n");
    sb.append("    label4: ").append(toIndentedString(label4)).append("\n");
    sb.append("    label5: ").append(toIndentedString(label5)).append("\n");
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

