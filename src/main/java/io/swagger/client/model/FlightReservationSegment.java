package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FlightReservationBookingInfo;
import io.swagger.client.model.Airport;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightReservationSegment   {
  
  private String id = null;
  private String departsAt = null;
  private String arrivesAt = null;
  private Airport origin = null;
  private Airport destination = null;
  private String marketingAirline = null;
  private String operatingAirline = null;
  private String flightNumber = null;
  private List<String> travelerIds = new ArrayList<String>();
  private FlightReservationBookingInfo bookingInfo = null;

  
  /**
   * Uniquely identifies this flight in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this flight in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Date and time of departure at the origin, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)  date format yyyy-MM-ddTHH:mm in the local time at the origin airport
   **/
  @ApiModelProperty(required = true, value = "Date and time of departure at the origin, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)  date format yyyy-MM-ddTHH:mm in the local time at the origin airport")
  @JsonProperty("departs_at")
  public String getDepartsAt() {
    return departsAt;
  }
  public void setDepartsAt(String departsAt) {
    this.departsAt = departsAt;
  }

  
  /**
   * Date and time of departure at the destination, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)  date format yyyy-MM-ddTHH:mm in the local time at the destination airport
   **/
  @ApiModelProperty(required = true, value = "Date and time of departure at the destination, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)  date format yyyy-MM-ddTHH:mm in the local time at the destination airport")
  @JsonProperty("arrives_at")
  public String getArrivesAt() {
    return arrivesAt;
  }
  public void setArrivesAt(String arrivesAt) {
    this.arrivesAt = arrivesAt;
  }

  
  /**
   * Information on the origin airport, from which this flight departs
   **/
  @ApiModelProperty(required = true, value = "Information on the origin airport, from which this flight departs")
  @JsonProperty("origin")
  public Airport getOrigin() {
    return origin;
  }
  public void setOrigin(Airport origin) {
    this.origin = origin;
  }

  
  /**
   * Information on the destination airport, at which this flight arrives
   **/
  @ApiModelProperty(required = true, value = "Information on the destination airport, at which this flight arrives")
  @JsonProperty("destination")
  public Airport getDestination() {
    return destination;
  }
  public void setDestination(Airport destination) {
    this.destination = destination;
  }

  
  /**
   * The 2 character alphanumeric IATA airline code of the airline that is responsible for the traveller this flight
   **/
  @ApiModelProperty(required = true, value = "The 2 character alphanumeric IATA airline code of the airline that is responsible for the traveller this flight")
  @JsonProperty("marketing_airline")
  public String getMarketingAirline() {
    return marketingAirline;
  }
  public void setMarketingAirline(String marketingAirline) {
    this.marketingAirline = marketingAirline;
  }

  
  /**
   * The 2 character alphanumeric IATA airline code of the airline that is providing the aircraft for this flight. Note that in the USA, if the marketing and operating carrier are different, you are legally required to display this in your application.
   **/
  @ApiModelProperty(required = true, value = "The 2 character alphanumeric IATA airline code of the airline that is providing the aircraft for this flight. Note that in the USA, if the marketing and operating carrier are different, you are legally required to display this in your application.")
  @JsonProperty("operating_airline")
  public String getOperatingAirline() {
    return operatingAirline;
  }
  public void setOperatingAirline(String operatingAirline) {
    this.operatingAirline = operatingAirline;
  }

  
  /**
   * The identifier that the airline uses for this flight route. This is most commonly - but not always - a number. When combined with the airline and date, it identifies an individual aircraft's flight
   **/
  @ApiModelProperty(required = true, value = "The identifier that the airline uses for this flight route. This is most commonly - but not always - a number. When combined with the airline and date, it identifies an individual aircraft's flight")
  @JsonProperty("flight_number")
  public String getFlightNumber() {
    return flightNumber;
  }
  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  
  /**
   * Traveler identifiers to indicate the travelers to whom this ticket applies.
   **/
  @ApiModelProperty(required = true, value = "Traveler identifiers to indicate the travelers to whom this ticket applies.")
  @JsonProperty("traveler_ids")
  public List<String> getTravelerIds() {
    return travelerIds;
  }
  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  
  /**
   * A booking information object with additional details about how the quality of this flight at the given price.
   **/
  @ApiModelProperty(required = true, value = "A booking information object with additional details about how the quality of this flight at the given price.")
  @JsonProperty("booking_info")
  public FlightReservationBookingInfo getBookingInfo() {
    return bookingInfo;
  }
  public void setBookingInfo(FlightReservationBookingInfo bookingInfo) {
    this.bookingInfo = bookingInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightReservationSegment {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    departsAt: ").append(StringUtil.toIndentedString(departsAt)).append("\n");
    sb.append("    arrivesAt: ").append(StringUtil.toIndentedString(arrivesAt)).append("\n");
    sb.append("    origin: ").append(StringUtil.toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(StringUtil.toIndentedString(destination)).append("\n");
    sb.append("    marketingAirline: ").append(StringUtil.toIndentedString(marketingAirline)).append("\n");
    sb.append("    operatingAirline: ").append(StringUtil.toIndentedString(operatingAirline)).append("\n");
    sb.append("    flightNumber: ").append(StringUtil.toIndentedString(flightNumber)).append("\n");
    sb.append("    travelerIds: ").append(StringUtil.toIndentedString(travelerIds)).append("\n");
    sb.append("    bookingInfo: ").append(StringUtil.toIndentedString(bookingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
