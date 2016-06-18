package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class RailStationAutocompleteResponse   {
  
  private String value = null;
  private String label = null;

  
  /**
   * The unique identifier of the station. You can use this as an input parameter for a rail search.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the station. You can use this as an input parameter for a rail search.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The full name of the station, in UTF-8 format.
   **/
  @ApiModelProperty(required = true, value = "The full name of the station, in UTF-8 format.")
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
    sb.append("class RailStationAutocompleteResponse {\n");
    
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
