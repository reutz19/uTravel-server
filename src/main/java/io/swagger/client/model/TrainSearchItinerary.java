package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.TrainSearchSegment;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TrainSearchItinerary   {
  
  private List<TrainSearchSegment> trains = new ArrayList<TrainSearchSegment>();

  
  /**
   * The array of trains that will be required to complete the given itinerary. Since the cache currently only contains direct itineraries, there will be only one object in this array.
   **/
  @ApiModelProperty(required = true, value = "The array of trains that will be required to complete the given itinerary. Since the cache currently only contains direct itineraries, there will be only one object in this array.")
  @JsonProperty("trains")
  public List<TrainSearchSegment> getTrains() {
    return trains;
  }
  public void setTrains(List<TrainSearchSegment> trains) {
    this.trains = trains;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainSearchItinerary {\n");
    
    sb.append("    trains: ").append(StringUtil.toIndentedString(trains)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
