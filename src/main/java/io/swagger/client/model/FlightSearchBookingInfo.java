package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightSearchBookingInfo   {
  
  private String travelClass = null;
  private String cabinCode = null;
  private String bookingCode = null;
  private String seatsRemaining = null;
  private String fareFamily = null;
  private String fareBasis = null;

  
  /**
   * The cabin class offered on this flight. An enumeration that will read either ECONOMY, PREMIUM_ECONOMY, BUSINESS or FIRST
   **/
  @ApiModelProperty(required = true, value = "The cabin class offered on this flight. An enumeration that will read either ECONOMY, PREMIUM_ECONOMY, BUSINESS or FIRST")
  @JsonProperty("travel_class")
  public String getTravelClass() {
    return travelClass;
  }
  public void setTravelClass(String travelClass) {
    this.travelClass = travelClass;
  }

  
  /**
   * A single character encoding of the travel_class, generally only available on responses from affiliates.
   **/
  @ApiModelProperty(value = "A single character encoding of the travel_class, generally only available on responses from affiliates.")
  @JsonProperty("cabin_code")
  public String getCabinCode() {
    return cabinCode;
  }
  public void setCabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
  }

  
  /**
   * The Reservation Booking Designator code that determines the quality and terms of the flight offered for the given price. A single letter from A..Z
   **/
  @ApiModelProperty(required = true, value = "The Reservation Booking Designator code that determines the quality and terms of the flight offered for the given price. A single letter from A..Z")
  @JsonProperty("booking_code")
  public String getBookingCode() {
    return bookingCode;
  }
  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  
  /**
   * The minimum number of seats that are still available for this price at the time of search. If the value is a 4 or above, there are often more than this number of seats still available.
   **/
  @ApiModelProperty(required = true, value = "The minimum number of seats that are still available for this price at the time of search. If the value is a 4 or above, there are often more than this number of seats still available.")
  @JsonProperty("seats_remaining")
  public String getSeatsRemaining() {
    return seatsRemaining;
  }
  public void setSeatsRemaining(String seatsRemaining) {
    this.seatsRemaining = seatsRemaining;
  }

  
  /**
   * Enumeration of the type of fare which this airline is providing, eg. VALUE. This is generally only available for affiliate responses.
   **/
  @ApiModelProperty(value = "Enumeration of the type of fare which this airline is providing, eg. VALUE. This is generally only available for affiliate responses.")
  @JsonProperty("fare_family")
  public String getFareFamily() {
    return fareFamily;
  }
  public void setFareFamily(String fareFamily) {
    this.fareFamily = fareFamily;
  }

  
  /**
   * See https://en.wikipedia.org/wiki/Fare_basis_code for the fare being offered.
   **/
  @ApiModelProperty(value = "See https://en.wikipedia.org/wiki/Fare_basis_code for the fare being offered.")
  @JsonProperty("fare_basis")
  public String getFareBasis() {
    return fareBasis;
  }
  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchBookingInfo {\n");
    
    sb.append("    travelClass: ").append(StringUtil.toIndentedString(travelClass)).append("\n");
    sb.append("    cabinCode: ").append(StringUtil.toIndentedString(cabinCode)).append("\n");
    sb.append("    bookingCode: ").append(StringUtil.toIndentedString(bookingCode)).append("\n");
    sb.append("    seatsRemaining: ").append(StringUtil.toIndentedString(seatsRemaining)).append("\n");
    sb.append("    fareFamily: ").append(StringUtil.toIndentedString(fareFamily)).append("\n");
    sb.append("    fareBasis: ").append(StringUtil.toIndentedString(fareBasis)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
