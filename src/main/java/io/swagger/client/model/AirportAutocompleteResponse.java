package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AirportAutocompleteResponse   {
  
  private String value = null;
  private String label = null;

  
  /**
   * The 3 letter IATA location code of the given city or airport. You can use this as an input parameter for a flight low-fare or inspiration search.
   **/
  @ApiModelProperty(required = true, value = "The 3 letter IATA location code of the given city or airport. You can use this as an input parameter for a flight low-fare or inspiration search.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The name of this airport, in UTF-8 format, prefixed with the name of the city if it is not already incorporated in the name of the airport, and appended with the location's IATA code (as in value), enclosed in square brackets.
   **/
  @ApiModelProperty(required = true, value = "The name of this airport, in UTF-8 format, prefixed with the name of the city if it is not already incorporated in the name of the airport, and appended with the location's IATA code (as in value), enclosed in square brackets.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportAutocompleteResponse {\n");
    
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
