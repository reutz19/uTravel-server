package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Amenity   {
  
  private String amenity = null;
  private String otaCode = null;
  private String description = null;

  
  /**
   * [The amenity code](hotels-api-supported-amenities-filter)
   **/
  @ApiModelProperty(value = "[The amenity code](hotels-api-supported-amenities-filter)")
  @JsonProperty("amenity")
  public String getAmenity() {
    return amenity;
  }
  public void setAmenity(String amenity) {
    this.amenity = amenity;
  }

  
  /**
   * The [Open Travel Alliance](http://www.opentravel.org/) [Hotel Amenities Code](ota-hotel-amenity-code-table) for this amenity.
   **/
  @ApiModelProperty(value = "The [Open Travel Alliance](http://www.opentravel.org/) [Hotel Amenities Code](ota-hotel-amenity-code-table) for this amenity.")
  @JsonProperty("ota_code")
  public String getOtaCode() {
    return otaCode;
  }
  public void setOtaCode(String otaCode) {
    this.otaCode = otaCode;
  }

  
  /**
   * The decoded text description for this amenity code, where available.
   **/
  @ApiModelProperty(value = "The decoded text description for this amenity code, where available.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amenity {\n");
    
    sb.append("    amenity: ").append(StringUtil.toIndentedString(amenity)).append("\n");
    sb.append("    otaCode: ").append(StringUtil.toIndentedString(otaCode)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
