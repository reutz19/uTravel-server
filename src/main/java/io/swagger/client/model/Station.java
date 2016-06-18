package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Station   {
  
  private String stationCode = null;
  private String stationName = null;

  
  /**
   * ID of this rail station
   **/
  @ApiModelProperty(required = true, value = "ID of this rail station")
  @JsonProperty("station_code")
  public String getStationCode() {
    return stationCode;
  }
  public void setStationCode(String stationCode) {
    this.stationCode = stationCode;
  }

  
  /**
   * Full name of this rail station.
   **/
  @ApiModelProperty(required = true, value = "Full name of this rail station.")
  @JsonProperty("station_name")
  public String getStationName() {
    return stationName;
  }
  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    stationCode: ").append(StringUtil.toIndentedString(stationCode)).append("\n");
    sb.append("    stationName: ").append(StringUtil.toIndentedString(stationName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
