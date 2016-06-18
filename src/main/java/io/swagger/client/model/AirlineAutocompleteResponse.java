package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AirlineAutocompleteResponse   {
  
  private String value = null;
  private String label = null;

  
  /**
   * The 3 letter IATA airline code of the given airline. You can use this as a response filter for a flight low-fare or inspiration search.
   **/
  @ApiModelProperty(required = true, value = "The 3 letter IATA airline code of the given airline. You can use this as a response filter for a flight low-fare or inspiration search.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The official name of this airline, in UTF-8 format.
   **/
  @ApiModelProperty(required = true, value = "The official name of this airline, in UTF-8 format.")
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
    sb.append("class AirlineAutocompleteResponse {\n");
    
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
