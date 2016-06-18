package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Logos;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarrierInfo   {
  
  private Logos logos = null;
  private String name = null;

  
  /**
   * Logos of the airline in a variety of sizes
   **/
  @ApiModelProperty(required = true, value = "Logos of the airline in a variety of sizes")
  @JsonProperty("logos")
  public Logos getLogos() {
    return logos;
  }
  public void setLogos(Logos logos) {
    this.logos = logos;
  }

  
  /**
   * Display name of the airline
   **/
  @ApiModelProperty(required = true, value = "Display name of the airline")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierInfo {\n");
    
    sb.append("    logos: ").append(StringUtil.toIndentedString(logos)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
