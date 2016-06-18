package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FlightSearchBound;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightSearchItinerary   {
  
  private FlightSearchBound outbound = null;
  private FlightSearchBound inbound = null;

  
  /**
   * The bound container for the flight information for bringing the traveler from the origin airport to the destination airport
   **/
  @ApiModelProperty(required = true, value = "The bound container for the flight information for bringing the traveler from the origin airport to the destination airport")
  @JsonProperty("outbound")
  public FlightSearchBound getOutbound() {
    return outbound;
  }
  public void setOutbound(FlightSearchBound outbound) {
    this.outbound = outbound;
  }

  
  /**
   * The bound container for the flight information for bringing the traveler from the destination airport to the origin airport
   **/
  @ApiModelProperty(value = "The bound container for the flight information for bringing the traveler from the destination airport to the origin airport")
  @JsonProperty("inbound")
  public FlightSearchBound getInbound() {
    return inbound;
  }
  public void setInbound(FlightSearchBound inbound) {
    this.inbound = inbound;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchItinerary {\n");
    
    sb.append("    outbound: ").append(StringUtil.toIndentedString(outbound)).append("\n");
    sb.append("    inbound: ").append(StringUtil.toIndentedString(inbound)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
