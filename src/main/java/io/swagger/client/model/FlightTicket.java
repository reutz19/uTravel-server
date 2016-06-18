package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FlightReservationBound;
import io.swagger.client.model.Amount;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightTicket   {
  
  private String id = null;
  private Amount price = null;
  private List<String> travelerIds = new ArrayList<String>();
  private List<FlightReservationBound> flightBounds = new ArrayList<FlightReservationBound>();

  
  /**
   * Uniquely identifies this ticket in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this ticket in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The cost of this ticket.
   **/
  @ApiModelProperty(required = true, value = "The cost of this ticket.")
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }
  public void setPrice(Amount price) {
    this.price = price;
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
   * The flight itinerary for this ticket.
   **/
  @ApiModelProperty(required = true, value = "The flight itinerary for this ticket.")
  @JsonProperty("flight_bounds")
  public List<FlightReservationBound> getFlightBounds() {
    return flightBounds;
  }
  public void setFlightBounds(List<FlightReservationBound> flightBounds) {
    this.flightBounds = flightBounds;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightTicket {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    travelerIds: ").append(StringUtil.toIndentedString(travelerIds)).append("\n");
    sb.append("    flightBounds: ").append(StringUtil.toIndentedString(flightBounds)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
