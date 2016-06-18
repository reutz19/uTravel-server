package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Geolocation;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CityInformation   {
  
  private String code = null;
  private String geonamesID = null;
  private String name = null;
  private String state = null;
  private String country = null;
  private Geolocation location = null;
  private String timezone = null;

  
  /**
   * The IATA code of this city. If you intend to make a flight search from the output of this call, I recommend using this as your input parameter as it generally gives the best results.
   **/
  @ApiModelProperty(required = true, value = "The IATA code of this city. If you intend to make a flight search from the output of this call, I recommend using this as your input parameter as it generally gives the best results.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * The ID of this city in the open-sourced Geonames DB
   **/
  @ApiModelProperty(required = true, value = "The ID of this city in the open-sourced Geonames DB")
  @JsonProperty("geonames_ID")
  public String getGeonamesID() {
    return geonamesID;
  }
  public void setGeonamesID(String geonamesID) {
    this.geonamesID = geonamesID;
  }

  
  /**
   * The name of this city, in English
   **/
  @ApiModelProperty(required = true, value = "The name of this city, in English")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
   * This city's approximate geolocation. The exact center of a city is often not an exact location, so be aware that this might not be exact.
   **/
  @ApiModelProperty(required = true, value = "This city's approximate geolocation. The exact center of a city is often not an exact location, so be aware that this might not be exact.")
  @JsonProperty("location")
  public Geolocation getLocation() {
    return location;
  }
  public void setLocation(Geolocation location) {
    this.location = location;
  }

  
  /**
   * The [Olson format](http://en.wikipedia.org/wiki/List_of_tz_database_time_zones) name of the timezone in which this city is located
   **/
  @ApiModelProperty(required = true, value = "The [Olson format](http://en.wikipedia.org/wiki/List_of_tz_database_time_zones) name of the timezone in which this city is located")
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
    sb.append("class CityInformation {\n");
    
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    geonamesID: ").append(StringUtil.toIndentedString(geonamesID)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
