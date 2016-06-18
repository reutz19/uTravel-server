package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Geolocation;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class RailStationResponse   {
  
  private String id = null;
  private String type = null;
  private String name = null;
  private String shortName = null;
  private String country = null;
  private Geolocation location = null;
  private String traffic = null;

  
  /**
   * The ID of this station, as provided in the request
   **/
  @ApiModelProperty(required = true, value = "The ID of this station, as provided in the request")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The type of code to which this station refers. Some codes represent agglomeration of multiple stations, whereas others represent an individual station. Possible values are AGGLOMERATION and STATION.
   **/
  @ApiModelProperty(required = true, value = "The type of code to which this station refers. Some codes represent agglomeration of multiple stations, whereas others represent an individual station. Possible values are AGGLOMERATION and STATION.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The name of this station.
   **/
  @ApiModelProperty(required = true, value = "The name of this station.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The shortened name of this station (20 characters max) which may be used in certain cases.
   **/
  @ApiModelProperty(required = true, value = "The shortened name of this station (20 characters max) which may be used in certain cases.")
  @JsonProperty("short_name")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   * The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) in which this station can be found.
   **/
  @ApiModelProperty(required = true, value = "The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) in which this station can be found.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * This stations's approximate geolocation.
   **/
  @ApiModelProperty(required = true, value = "This stations's approximate geolocation.")
  @JsonProperty("location")
  public Geolocation getLocation() {
    return location;
  }
  public void setLocation(Geolocation location) {
    this.location = location;
  }

  
  /**
   * An indication of the level of Intercity traffic passing through this station.
   **/
  @ApiModelProperty(required = true, value = "An indication of the level of Intercity traffic passing through this station.")
  @JsonProperty("traffic")
  public String getTraffic() {
    return traffic;
  }
  public void setTraffic(String traffic) {
    this.traffic = traffic;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailStationResponse {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(StringUtil.toIndentedString(shortName)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    traffic: ").append(StringUtil.toIndentedString(traffic)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
