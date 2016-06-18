package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class VehicleInfo   {
  
  private String acrissCode = null;
  private String category = null;
  private String type = null;
  private String transmission = null;
  private Boolean airConditioning = null;
  private String fuel = null;

  
  /**
   * The 4 letter [ACRISS code](http://en.wikipedia.org/wiki/ACRISS_Car_Classification_Code) that defines the properties of vehicle being rented.
   **/
  @ApiModelProperty(required = true, value = "The 4 letter [ACRISS code](http://en.wikipedia.org/wiki/ACRISS_Car_Classification_Code) that defines the properties of vehicle being rented.")
  @JsonProperty("acriss_code")
  public String getAcrissCode() {
    return acrissCode;
  }
  public void setAcrissCode(String acrissCode) {
    this.acrissCode = acrissCode;
  }

  
  /**
   * The decoded ACRISS vehicle category (For example: Economy, Luxury, Standard).
   **/
  @ApiModelProperty(required = true, value = "The decoded ACRISS vehicle category (For example: Economy, Luxury, Standard).")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * The decoded ACRISS vehicle type, to let you know what kind of vehicle this is (For example: Van, SUV, Pickup).
   **/
  @ApiModelProperty(value = "The decoded ACRISS vehicle type, to let you know what kind of vehicle this is (For example: Van, SUV, Pickup).")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The decoded ACRISS transmission type, to let you know if this vehicle is Automatic or Manual Transmission (stick-shift).
   **/
  @ApiModelProperty(value = "The decoded ACRISS transmission type, to let you know if this vehicle is Automatic or Manual Transmission (stick-shift).")
  @JsonProperty("transmission")
  public String getTransmission() {
    return transmission;
  }
  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  
  /**
   * The decoded ACRISS air_conditioning information, to let you know if this vehicle has air conditioning
   **/
  @ApiModelProperty(value = "The decoded ACRISS air_conditioning information, to let you know if this vehicle has air conditioning")
  @JsonProperty("air_conditioning")
  public Boolean getAirConditioning() {
    return airConditioning;
  }
  public void setAirConditioning(Boolean airConditioning) {
    this.airConditioning = airConditioning;
  }

  
  /**
   * The decoded ACRISS fuel type, to let you know if this vehicle is hybrid, electric, etc.
   **/
  @ApiModelProperty(value = "The decoded ACRISS fuel type, to let you know if this vehicle is hybrid, electric, etc.")
  @JsonProperty("fuel")
  public String getFuel() {
    return fuel;
  }
  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleInfo {\n");
    
    sb.append("    acrissCode: ").append(StringUtil.toIndentedString(acrissCode)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    transmission: ").append(StringUtil.toIndentedString(transmission)).append("\n");
    sb.append("    airConditioning: ").append(StringUtil.toIndentedString(airConditioning)).append("\n");
    sb.append("    fuel: ").append(StringUtil.toIndentedString(fuel)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
