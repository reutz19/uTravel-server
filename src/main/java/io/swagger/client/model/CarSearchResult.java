package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Vehicle;
import io.swagger.client.model.Company;
import io.swagger.client.model.Geolocation;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarSearchResult   {
  
  private Company provider = null;
  private Geolocation location = null;
  private String airport = null;
  private List<Vehicle> cars = new ArrayList<Vehicle>();

  
  /**
   * Details of the car company offering this rental.
   **/
  @ApiModelProperty(required = true, value = "Details of the car company offering this rental.")
  @JsonProperty("provider")
  public Company getProvider() {
    return provider;
  }
  public void setProvider(Company provider) {
    this.provider = provider;
  }

  
  /**
   * This car rental company's approximate geolocation. The exact quality of this parameter depends on the provider but it's usually quite accurate.
   **/
  @ApiModelProperty(value = "This car rental company's approximate geolocation. The exact quality of this parameter depends on the provider but it's usually quite accurate.")
  @JsonProperty("location")
  public Geolocation getLocation() {
    return location;
  }
  public void setLocation(Geolocation location) {
    this.location = location;
  }

  
  /**
   * The exact quality of this parameter depends on the provider but it's usually quite accurate.
   **/
  @ApiModelProperty(value = "The exact quality of this parameter depends on the provider but it's usually quite accurate.")
  @JsonProperty("airport")
  public String getAirport() {
    return airport;
  }
  public void setAirport(String airport) {
    this.airport = airport;
  }

  
  /**
   * Further details about each of the vehicles offered by this car rental provider.
   **/
  @ApiModelProperty(value = "Further details about each of the vehicles offered by this car rental provider.")
  @JsonProperty("cars")
  public List<Vehicle> getCars() {
    return cars;
  }
  public void setCars(List<Vehicle> cars) {
    this.cars = cars;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarSearchResult {\n");
    
    sb.append("    provider: ").append(StringUtil.toIndentedString(provider)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    airport: ").append(StringUtil.toIndentedString(airport)).append("\n");
    sb.append("    cars: ").append(StringUtil.toIndentedString(cars)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
