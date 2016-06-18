package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CarReservation;
import io.swagger.client.model.HotelReservation;
import io.swagger.client.model.FlightReservationBound;
import io.swagger.client.model.OtherReservation;
import java.util.*;
import io.swagger.client.model.FlightTicket;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Reservation   {
  
  private FlightTicket flightTickets = null;
  private List<FlightReservationBound> unticketedFlights = new ArrayList<FlightReservationBound>();
  private List<CarReservation> cars = new ArrayList<CarReservation>();
  private List<HotelReservation> hotels = new ArrayList<HotelReservation>();
  private List<OtherReservation> others = new ArrayList<OtherReservation>();

  
  /**
   * The flight itineraries with a ticket or transitional stored ticket (TST) in this reservation, and their prices.
   **/
  @ApiModelProperty(value = "The flight itineraries with a ticket or transitional stored ticket (TST) in this reservation, and their prices.")
  @JsonProperty("flight_tickets")
  public FlightTicket getFlightTickets() {
    return flightTickets;
  }
  public void setFlightTickets(FlightTicket flightTickets) {
    this.flightTickets = flightTickets;
  }

  
  /**
   * The flight itineraries in this reservation that have not yet been ticketed or priced.
   **/
  @ApiModelProperty(value = "The flight itineraries in this reservation that have not yet been ticketed or priced.")
  @JsonProperty("unticketed_flights")
  public List<FlightReservationBound> getUnticketedFlights() {
    return unticketedFlights;
  }
  public void setUnticketedFlights(List<FlightReservationBound> unticketedFlights) {
    this.unticketedFlights = unticketedFlights;
  }

  
  /**
   * The rental cars reserved.
   **/
  @ApiModelProperty(value = "The rental cars reserved.")
  @JsonProperty("cars")
  public List<CarReservation> getCars() {
    return cars;
  }
  public void setCars(List<CarReservation> cars) {
    this.cars = cars;
  }

  
  /**
   * The hotel room bookings in this reservation.
   **/
  @ApiModelProperty(value = "The hotel room bookings in this reservation.")
  @JsonProperty("hotels")
  public List<HotelReservation> getHotels() {
    return hotels;
  }
  public void setHotels(List<HotelReservation> hotels) {
    this.hotels = hotels;
  }

  
  /**
   * Free text information to represent other travel items that may be considered part of the travel itinerary in this reservation.
   **/
  @ApiModelProperty(value = "Free text information to represent other travel items that may be considered part of the travel itinerary in this reservation.")
  @JsonProperty("others")
  public List<OtherReservation> getOthers() {
    return others;
  }
  public void setOthers(List<OtherReservation> others) {
    this.others = others;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    flightTickets: ").append(StringUtil.toIndentedString(flightTickets)).append("\n");
    sb.append("    unticketedFlights: ").append(StringUtil.toIndentedString(unticketedFlights)).append("\n");
    sb.append("    cars: ").append(StringUtil.toIndentedString(cars)).append("\n");
    sb.append("    hotels: ").append(StringUtil.toIndentedString(hotels)).append("\n");
    sb.append("    others: ").append(StringUtil.toIndentedString(others)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
