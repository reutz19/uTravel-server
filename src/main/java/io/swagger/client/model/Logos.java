package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Logos   {
  
  private String small = null;
  private String medium = null;

  
  /**
   * URL to logo of resolution 27x27px
   **/
  @ApiModelProperty(value = "URL to logo of resolution 27x27px")
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }
  public void setSmall(String small) {
    this.small = small;
  }

  
  /**
   * URL to logo of resolution 60x60px
   **/
  @ApiModelProperty(value = "URL to logo of resolution 60x60px")
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }
  public void setMedium(String medium) {
    this.medium = medium;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logos {\n");
    
    sb.append("    small: ").append(StringUtil.toIndentedString(small)).append("\n");
    sb.append("    medium: ").append(StringUtil.toIndentedString(medium)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
