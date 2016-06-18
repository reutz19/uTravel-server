package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class RestrictedRate   {
  
  private String rateCode = null;
  private String rateName = null;
  private String restrictions = null;

  
  /**
   * The unique identifier of this rate.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of this rate.")
  @JsonProperty("rate_code")
  public String getRateCode() {
    return rateCode;
  }
  public void setRateCode(String rateCode) {
    this.rateCode = rateCode;
  }

  
  /**
   * The name used by the company to describe this rate.
   **/
  @ApiModelProperty(required = true, value = "The name used by the company to describe this rate.")
  @JsonProperty("rate_name")
  public String getRateName() {
    return rateName;
  }
  public void setRateName(String rateName) {
    this.rateName = rateName;
  }

  
  /**
   * An enumeration of the type of restrictions associated with this rate.
   **/
  @ApiModelProperty(required = true, value = "An enumeration of the type of restrictions associated with this rate.")
  @JsonProperty("restrictions")
  public String getRestrictions() {
    return restrictions;
  }
  public void setRestrictions(String restrictions) {
    this.restrictions = restrictions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictedRate {\n");
    
    sb.append("    rateCode: ").append(StringUtil.toIndentedString(rateCode)).append("\n");
    sb.append("    rateName: ").append(StringUtil.toIndentedString(rateName)).append("\n");
    sb.append("    restrictions: ").append(StringUtil.toIndentedString(restrictions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
