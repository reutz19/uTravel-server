package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Geolocation;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AirportInformation   {
  
  private String code = null;
  private String name = null;
  private String cityCode = null;
  private String cityName = null;
  private String state = null;
  private String country = null;
  private Geolocation location = null;
  private Integer aircraftMovements = null;
  private String timezone = null;

  
  /**
   * The 3 letter IATA airport code of this given airport. You can use this as an input parameter for a low-fare flight search, to get more specific results than the city code, but inspiration search works best using the city code.
   **/
  @ApiModelProperty(required = true, value = "The 3 letter IATA airport code of this given airport. You can use this as an input parameter for a low-fare flight search, to get more specific results than the city code, but inspiration search works best using the city code.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * The name of this airport, in UTF-8 format
   **/
  @ApiModelProperty(required = true, value = "The name of this airport, in UTF-8 format")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The three letter IATA city code of the city in which this airport is located.
   **/
  @ApiModelProperty(required = true, value = "The three letter IATA city code of the city in which this airport is located.")
  @JsonProperty("city_code")
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  
  /**
   * The English name of the city in which this airport is located
   **/
  @ApiModelProperty(required = true, value = "The English name of the city in which this airport is located")
  @JsonProperty("city_name")
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  
  /**
   * The state code of this city, if applicable
   **/
  @ApiModelProperty(value = "The state code of this city, if applicable")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) in which this city can be found.
   **/
  @ApiModelProperty(required = true, value = "The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) in which this city can be found.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * An object containing the longitude and latitude of the given airport.
   **/
  @ApiModelProperty(required = true, value = "An object containing the longitude and latitude of the given airport.")
  @JsonProperty("location")
  public Geolocation getLocation() {
    return location;
  }
  public void setLocation(Geolocation location) {
    this.location = location;
  }

  
  /**
   * The annual number of aircraft movements at that airport.
   **/
  @ApiModelProperty(value = "The annual number of aircraft movements at that airport.")
  @JsonProperty("aircraft_movements")
  public Integer getAircraftMovements() {
    return aircraftMovements;
  }
  public void setAircraftMovements(Integer aircraftMovements) {
    this.aircraftMovements = aircraftMovements;
  }

  
  /**
   * The [Olson format](http://en.wikipedia.org/wiki/List_of_tz_database_time_zones) name of the timezone in which this airport is located
   **/
  @ApiModelProperty(required = true, value = "The [Olson format](http://en.wikipedia.org/wiki/List_of_tz_database_time_zones) name of the timezone in which this airport is located")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportInformation {\n");
    
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    cityCode: ").append(StringUtil.toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(StringUtil.toIndentedString(cityName)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    aircraftMovements: ").append(StringUtil.toIndentedString(aircraftMovements)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
