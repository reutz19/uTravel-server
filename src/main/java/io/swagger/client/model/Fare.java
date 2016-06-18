package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Fare   {
  
  private String totalFare = null;
  private String tax = null;

  
  /**
   * The total price, including taxes per-passenger, for this passenger type, for this itinerary. Always a string, formatted correctly for the given currency
   **/
  @ApiModelProperty(required = true, value = "The total price, including taxes per-passenger, for this passenger type, for this itinerary. Always a string, formatted correctly for the given currency")
  @JsonProperty("total_fare")
  public String getTotalFare() {
    return totalFare;
  }
  public void setTotalFare(String totalFare) {
    this.totalFare = totalFare;
  }

  
  /**
   * The tax applied per-passenger, for this passenger type, for this itinerary. Some of this tax may be refundable in the event of cancellation.
   **/
  @ApiModelProperty(required = true, value = "The tax applied per-passenger, for this passenger type, for this itinerary. Some of this tax may be refundable in the event of cancellation.")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fare {\n");
    
    sb.append("    totalFare: ").append(StringUtil.toIndentedString(totalFare)).append("\n");
    sb.append("    tax: ").append(StringUtil.toIndentedString(tax)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
