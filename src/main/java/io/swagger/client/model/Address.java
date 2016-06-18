package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Address   {
  
  private String line1 = null;
  private String city = null;
  private String region = null;
  private String postalCode = null;
  private String country = null;

  
  /**
   * The first line of this place's address. Generally represents the basic street address.
   **/
  @ApiModelProperty(required = true, value = "The first line of this place's address. Generally represents the basic street address.")
  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  
  /**
   * The town or city in which place is located.
   **/
  @ApiModelProperty(required = true, value = "The town or city in which place is located.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * The state or region code in which the place is located.
   **/
  @ApiModelProperty(value = "The state or region code in which the place is located.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * The postal or zip code of this address.
   **/
  @ApiModelProperty(value = "The postal or zip code of this address.")
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of this address.
   **/
  @ApiModelProperty(required = true, value = "The [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of this address.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    line1: ").append(StringUtil.toIndentedString(line1)).append("\n");
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    region: ").append(StringUtil.toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(StringUtil.toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
