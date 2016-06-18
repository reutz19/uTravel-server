package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Vehicle;
import io.swagger.client.model.Company;
import io.swagger.client.model.CarReservationBookingInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarReservation   {
  
  private String id = null;
  private String pickUp = null;
  private String dropOff = null;
  private Company provider = null;
  private String origin = null;
  private Vehicle car = null;
  private List<String> travelerIds = new ArrayList<String>();
  private CarReservationBookingInfo bookingInfo = null;

  
  /**
   * Uniquely identifies this car rental reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this car rental reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Date on which the car rental will be collected from the car rental location. [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-ddTHH.
   **/
  @ApiModelProperty(required = true, value = "Date on which the car rental will be collected from the car rental location. [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-ddTHH.")
  @JsonProperty("pick_up")
  public String getPickUp() {
    return pickUp;
  }
  public void setPickUp(String pickUp) {
    this.pickUp = pickUp;
  }

  
  /**
   * Date at which the car rental will end and the car will be returned to the rental location. [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-ddTHH.
   **/
  @ApiModelProperty(required = true, value = "Date at which the car rental will end and the car will be returned to the rental location. [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-ddTHH.")
  @JsonProperty("drop_off")
  public String getDropOff() {
    return dropOff;
  }
  public void setDropOff(String dropOff) {
    this.dropOff = dropOff;
  }

  
  /**
   * Details of the car company offering this rental.
   **/
  @ApiModelProperty(required = true, value = "Details of the car company offering this rental.")
  @JsonProperty("provider")
  public Company getProvider() {
    return provider;
  }
  public void setProvider(Company provider) {
    this.provider = provider;
  }

  
  /**
   * This car rental company office location ID. If this is an airport location, this will be the airport's IATA code. Otherwise, this is a custom value provided by the car rental provider.
   **/
  @ApiModelProperty(required = true, value = "This car rental company office location ID. If this is an airport location, this will be the airport's IATA code. Otherwise, this is a custom value provided by the car rental provider.")
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  
  /**
   * A car information object giving further details about the vehicle provided for rental.
   **/
  @ApiModelProperty(required = true, value = "A car information object giving further details about the vehicle provided for rental.")
  @JsonProperty("car")
  public Vehicle getCar() {
    return car;
  }
  public void setCar(Vehicle car) {
    this.car = car;
  }

  
  /**
   * Traveler identifiers to indicate the travelers to whom this car rental applies. Generally, only drivers of the vehicle will be marked in this array.
   **/
  @ApiModelProperty(value = "Traveler identifiers to indicate the travelers to whom this car rental applies. Generally, only drivers of the vehicle will be marked in this array.")
  @JsonProperty("traveler_ids")
  public List<String> getTravelerIds() {
    return travelerIds;
  }
  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  
  /**
   * Additional details the status of this car rental reservation.
   **/
  @ApiModelProperty(value = "Additional details the status of this car rental reservation.")
  @JsonProperty("booking_info")
  public CarReservationBookingInfo getBookingInfo() {
    return bookingInfo;
  }
  public void setBookingInfo(CarReservationBookingInfo bookingInfo) {
    this.bookingInfo = bookingInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarReservation {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    pickUp: ").append(StringUtil.toIndentedString(pickUp)).append("\n");
    sb.append("    dropOff: ").append(StringUtil.toIndentedString(dropOff)).append("\n");
    sb.append("    provider: ").append(StringUtil.toIndentedString(provider)).append("\n");
    sb.append("    origin: ").append(StringUtil.toIndentedString(origin)).append("\n");
    sb.append("    car: ").append(StringUtil.toIndentedString(car)).append("\n");
    sb.append("    travelerIds: ").append(StringUtil.toIndentedString(travelerIds)).append("\n");
    sb.append("    bookingInfo: ").append(StringUtil.toIndentedString(bookingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
