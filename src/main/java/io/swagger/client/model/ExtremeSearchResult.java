package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class ExtremeSearchResult   {
  
  private String destination = null;
  private String departureDate = null;
  private String returnDate = null;
  private String price = null;
  private String airline = null;

  
  /**
   * The IATA code of the city or airport to which the traveler may go, from the provided origin
   **/
  @ApiModelProperty(required = true, value = "The IATA code of the city or airport to which the traveler may go, from the provided origin")
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  
  /**
   * The date departure at the origin, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd, to go to the above destination
   **/
  @ApiModelProperty(value = "The date departure at the origin, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd, to go to the above destination")
  @JsonProperty("departure_date")
  public String getDepartureDate() {
    return departureDate;
  }
  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  
  /**
   * The date at which the flight from the destination to the origin will arrive at the origin. The date is in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd, in the local date of the origin
   **/
  @ApiModelProperty(value = "The date at which the flight from the destination to the origin will arrive at the origin. The date is in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd, in the local date of the origin")
  @JsonProperty("return_date")
  public String getReturnDate() {
    return returnDate;
  }
  public void setReturnDate(String returnDate) {
    this.returnDate = returnDate;
  }

  
  /**
   * The minimum total price for one adult passenger for a round trip from the origin to the destination and back. Always a string, formatted correctly for the provided currency
   **/
  @ApiModelProperty(required = true, value = "The minimum total price for one adult passenger for a round trip from the origin to the destination and back. Always a string, formatted correctly for the provided currency")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  
  /**
   * The 2 character alphanumeric IATA airline code of the airline that is responsible for selling the traveler this flight - also known as the Validating Carrier.
   **/
  @ApiModelProperty(value = "The 2 character alphanumeric IATA airline code of the airline that is responsible for selling the traveler this flight - also known as the Validating Carrier.")
  @JsonProperty("airline")
  public String getAirline() {
    return airline;
  }
  public void setAirline(String airline) {
    this.airline = airline;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtremeSearchResult {\n");
    
    sb.append("    destination: ").append(StringUtil.toIndentedString(destination)).append("\n");
    sb.append("    departureDate: ").append(StringUtil.toIndentedString(departureDate)).append("\n");
    sb.append("    returnDate: ").append(StringUtil.toIndentedString(returnDate)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    airline: ").append(StringUtil.toIndentedString(airline)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
