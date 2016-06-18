package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Airport   {
  
  private String airport = null;
  private String terminal = null;

  
  /**
   * The 3 character IATA code of the airport in question for this flight
   **/
  @ApiModelProperty(required = true, value = "The 3 character IATA code of the airport in question for this flight")
  @JsonProperty("airport")
  public String getAirport() {
    return airport;
  }
  public void setAirport(String airport) {
    this.airport = airport;
  }

  
  /**
   * The terminal identifier at which this flight will arrive or depart in the given airport
   **/
  @ApiModelProperty(value = "The terminal identifier at which this flight will arrive or depart in the given airport")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airport {\n");
    
    sb.append("    airport: ").append(StringUtil.toIndentedString(airport)).append("\n");
    sb.append("    terminal: ").append(StringUtil.toIndentedString(terminal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
