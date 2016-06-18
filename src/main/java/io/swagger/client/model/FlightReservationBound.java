package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.FlightReservationSegment;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightReservationBound   {
  
  private List<FlightReservationSegment> flights = new ArrayList<FlightReservationSegment>();

  
  /**
   * The individual flights that make up this itinerary. These flights are presented in the order required to fly from the origin to the destination, and the array of flights represents a connection.
   **/
  @ApiModelProperty(required = true, value = "The individual flights that make up this itinerary. These flights are presented in the order required to fly from the origin to the destination, and the array of flights represents a connection.")
  @JsonProperty("flights")
  public List<FlightReservationSegment> getFlights() {
    return flights;
  }
  public void setFlights(List<FlightReservationSegment> flights) {
    this.flights = flights;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightReservationBound {\n");
    
    sb.append("    flights: ").append(StringUtil.toIndentedString(flights)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
