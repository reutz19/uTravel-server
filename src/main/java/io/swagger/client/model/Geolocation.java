package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Geolocation   {
  
  private BigDecimal latitude = null;
  private BigDecimal longitude = null;

  
  /**
   * The north-south coordinate of this location, in decimal degrees, between -90 and 90
   **/
  @ApiModelProperty(required = true, value = "The north-south coordinate of this location, in decimal degrees, between -90 and 90")
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  
  /**
   * The east-west coordinate of this location, in decimal degrees, between -180 and 180
   **/
  @ApiModelProperty(required = true, value = "The east-west coordinate of this location, in decimal degrees, between -180 and 180")
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geolocation {\n");
    
    sb.append("    latitude: ").append(StringUtil.toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(StringUtil.toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
