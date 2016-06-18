package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightReservationBookingInfo   {
  
  private String travelClass = null;
  private String bookingCode = null;
  private String airlineRecordLocator = null;
  private String status = null;

  
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
   * 6 character identifier of this travel record on the airline's system. May be the same as the global record locator.
   **/
  @ApiModelProperty(required = true, value = "6 character identifier of this travel record on the airline's system. May be the same as the global record locator.")
  @JsonProperty("airline_record_locator")
  public String getAirlineRecordLocator() {
    return airlineRecordLocator;
  }
  public void setAirlineRecordLocator(String airlineRecordLocator) {
    this.airlineRecordLocator = airlineRecordLocator;
  }

  
  /**
   * An enumeration to represent the reservation status for this seat on this flight. For example: CONFIRMED, CANCELLED, RESCHEDULED, FLIGHT_CANCELLED, WAITLISTED.
   **/
  @ApiModelProperty(required = true, value = "An enumeration to represent the reservation status for this seat on this flight. For example: CONFIRMED, CANCELLED, RESCHEDULED, FLIGHT_CANCELLED, WAITLISTED.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightReservationBookingInfo {\n");
    
    sb.append("    travelClass: ").append(StringUtil.toIndentedString(travelClass)).append("\n");
    sb.append("    bookingCode: ").append(StringUtil.toIndentedString(bookingCode)).append("\n");
    sb.append("    airlineRecordLocator: ").append(StringUtil.toIndentedString(airlineRecordLocator)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
