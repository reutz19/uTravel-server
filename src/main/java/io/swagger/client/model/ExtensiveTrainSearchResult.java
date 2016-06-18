package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Station;
import io.swagger.client.model.TrainSearchItinerary;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class ExtensiveTrainSearchResult   {
  
  private Station origin = null;
  private Station destination = null;
  private List<TrainSearchItinerary> itineraries = new ArrayList<TrainSearchItinerary>();

  
  /**
   * Station object with details about the origin station for this search.
   **/
  @ApiModelProperty(required = true, value = "Station object with details about the origin station for this search.")
  @JsonProperty("origin")
  public Station getOrigin() {
    return origin;
  }
  public void setOrigin(Station origin) {
    this.origin = origin;
  }

  
  /**
   * Station object with details about the destination station for this search.
   **/
  @ApiModelProperty(required = true, value = "Station object with details about the destination station for this search.")
  @JsonProperty("destination")
  public Station getDestination() {
    return destination;
  }
  public void setDestination(Station destination) {
    this.destination = destination;
  }

  
  /**
   * Routes from the origin to the destination.
   **/
  @ApiModelProperty(required = true, value = "Routes from the origin to the destination.")
  @JsonProperty("itineraries")
  public List<TrainSearchItinerary> getItineraries() {
    return itineraries;
  }
  public void setItineraries(List<TrainSearchItinerary> itineraries) {
    this.itineraries = itineraries;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensiveTrainSearchResult {\n");
    
    sb.append("    origin: ").append(StringUtil.toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(StringUtil.toIndentedString(destination)).append("\n");
    sb.append("    itineraries: ").append(StringUtil.toIndentedString(itineraries)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
