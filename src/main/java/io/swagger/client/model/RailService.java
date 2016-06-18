package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class RailService   {
  
  private String destinationStationId = null;
  private List<String> services = new ArrayList<String>();

  
  /**
   * ID of the destination rail station.
   **/
  @ApiModelProperty(required = true, value = "ID of the destination rail station.")
  @JsonProperty("destination_station_id")
  public String getDestinationStationId() {
    return destinationStationId;
  }
  public void setDestinationStationId(String destinationStationId) {
    this.destinationStationId = destinationStationId;
  }

  
  /**
   * An array of departure times at which trains depart from the origin station to this destination station. Times are in the ISO 8601 YYYY-MM-DDTHH:mm format.
   **/
  @ApiModelProperty(required = true, value = "An array of departure times at which trains depart from the origin station to this destination station. Times are in the ISO 8601 YYYY-MM-DDTHH:mm format.")
  @JsonProperty("services")
  public List<String> getServices() {
    return services;
  }
  public void setServices(List<String> services) {
    this.services = services;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailService {\n");
    
    sb.append("    destinationStationId: ").append(StringUtil.toIndentedString(destinationStationId)).append("\n");
    sb.append("    services: ").append(StringUtil.toIndentedString(services)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
