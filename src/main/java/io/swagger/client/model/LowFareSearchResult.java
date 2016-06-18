package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FlightSearchPrice;
import java.util.*;
import io.swagger.client.model.FlightSearchItinerary;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class LowFareSearchResult   {
  
  private List<FlightSearchItinerary> itineraries = new ArrayList<FlightSearchItinerary>();
  private FlightSearchPrice fare = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("itineraries")
  public List<FlightSearchItinerary> getItineraries() {
    return itineraries;
  }
  public void setItineraries(List<FlightSearchItinerary> itineraries) {
    this.itineraries = itineraries;
  }

  
  /**
   * The price and fare information which applies to all itineraries in this response
   **/
  @ApiModelProperty(required = true, value = "The price and fare information which applies to all itineraries in this response")
  @JsonProperty("fare")
  public FlightSearchPrice getFare() {
    return fare;
  }
  public void setFare(FlightSearchPrice fare) {
    this.fare = fare;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowFareSearchResult {\n");
    
    sb.append("    itineraries: ").append(StringUtil.toIndentedString(itineraries)).append("\n");
    sb.append("    fare: ").append(StringUtil.toIndentedString(fare)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
