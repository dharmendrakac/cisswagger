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
 * deposit details
 */
@ApiModel(description = "deposit details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:37:09.209394200+05:30[Asia/Calcutta]")
public class DeductionCodeList {
  /**
   * deposited amount for the pay period
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    FEDERAL_TAX("Federal tax"),
    
    STATE_TAX("State tax"),
    
    LOCAL_TAX("Local tax"),
    
    SOCIAL_SECURITY_TAX("Social security tax"),
    
    RETIREMENT_DEDUCTIONS("Retirement deductions"),
    
    GARNISHMENT_DEDUCTIONS("Garnishment deductions"),
    
    BENEFIT_DEDUCTIONS("Benefit deductions"),
    
    SUI_SDI_VPDI_TAX("SUI SDI VPDI tax"),
    
    OTHER_DEDUCTIONS("Other deductions");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name = NameEnum.FEDERAL_TAX;


  public DeductionCodeList name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * deposited amount for the pay period
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "deposited amount for the pay period")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionCodeList deductionCodeList = (DeductionCodeList) o;
    return Objects.equals(this.name, deductionCodeList.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionCodeList {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

