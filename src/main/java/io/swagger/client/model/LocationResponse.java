package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.CityInformation;
import io.swagger.client.model.AirportInformation;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class LocationResponse   {
  
  private CityInformation city = null;
  private List<AirportInformation> airports = new ArrayList<AirportInformation>();

  
  /**
   * Information for any IATA city code which corresponds to the provided code
   **/
  @ApiModelProperty(value = "Information for any IATA city code which corresponds to the provided code")
  @JsonProperty("city")
  public CityInformation getCity() {
    return city;
  }
  public void setCity(CityInformation city) {
    this.city = city;
  }

  
  /**
   * Information for any IATA airport located in the provided IATA city code or which corresponds to the provided code
   **/
  @ApiModelProperty(value = "Information for any IATA airport located in the provided IATA city code or which corresponds to the provided code")
  @JsonProperty("airports")
  public List<AirportInformation> getAirports() {
    return airports;
  }
  public void setAirports(List<AirportInformation> airports) {
    this.airports = airports;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResponse {\n");
    
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    airports: ").append(StringUtil.toIndentedString(airports)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
