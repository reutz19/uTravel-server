package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightTrafficSearchResult   {
  
  private String destination = null;
  private Integer flights = null;
  private Integer travelers = null;

  
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
   * Number of flights from origin to destination during the search period provided
   **/
  @ApiModelProperty(required = true, value = "Number of flights from origin to destination during the search period provided")
  @JsonProperty("flights")
  public Integer getFlights() {
    return flights;
  }
  public void setFlights(Integer flights) {
    this.flights = flights;
  }

  
  /**
   * Number of passengers from origin to destination during the search period provided
   **/
  @ApiModelProperty(required = true, value = "Number of passengers from origin to destination during the search period provided")
  @JsonProperty("travelers")
  public Integer getTravelers() {
    return travelers;
  }
  public void setTravelers(Integer travelers) {
    this.travelers = travelers;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightTrafficSearchResult {\n");
    
    sb.append("    destination: ").append(StringUtil.toIndentedString(destination)).append("\n");
    sb.append("    flights: ").append(StringUtil.toIndentedString(flights)).append("\n");
    sb.append("    travelers: ").append(StringUtil.toIndentedString(travelers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
