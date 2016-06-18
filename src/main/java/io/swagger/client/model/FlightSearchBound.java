package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FlightSearchSegment;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightSearchBound   {
  
  private List<FlightSearchSegment> flights = new ArrayList<FlightSearchSegment>();
  private String duration = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flights")
  public List<FlightSearchSegment> getFlights() {
    return flights;
  }
  public void setFlights(List<FlightSearchSegment> flights) {
    this.flights = flights;
  }

  
  /**
   * The duration of this bound, including layover time, expressed in the format hh:mm
   **/
  @ApiModelProperty(value = "The duration of this bound, including layover time, expressed in the format hh:mm")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchBound {\n");
    
    sb.append("    flights: ").append(StringUtil.toIndentedString(flights)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
