package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.RailService;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TrainScheduleSearchResult   {
  
  private String originStationId = null;
  private String date = null;
  private List<RailService> services = new ArrayList<RailService>();

  
  /**
   * Station ID of the origin station for this search.
   **/
  @ApiModelProperty(required = true, value = "Station ID of the origin station for this search.")
  @JsonProperty("origin_station_id")
  public String getOriginStationId() {
    return originStationId;
  }
  public void setOriginStationId(String originStationId) {
    this.originStationId = originStationId;
  }

  
  /**
   * The search date provided in the input.
   **/
  @ApiModelProperty(required = true, value = "The search date provided in the input.")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * Array to describe service to the destinations.
   **/
  @ApiModelProperty(required = true, value = "Array to describe service to the destinations.")
  @JsonProperty("services")
  public List<RailService> getServices() {
    return services;
  }
  public void setServices(List<RailService> services) {
    this.services = services;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainScheduleSearchResult {\n");
    
    sb.append("    originStationId: ").append(StringUtil.toIndentedString(originStationId)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    services: ").append(StringUtil.toIndentedString(services)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
