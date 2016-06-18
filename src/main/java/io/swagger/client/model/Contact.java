package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Contact   {
  
  private String type = null;
  private String purpose = null;
  private String detail = null;

  
  /**
   * The method of contact, such as phone or fax.
   **/
  @ApiModelProperty(required = true, value = "The method of contact, such as phone or fax.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The reason or channel of that contact method. For example: HOME, EMERGENCY, MOBILE.
   **/
  @ApiModelProperty(value = "The reason or channel of that contact method. For example: HOME, EMERGENCY, MOBILE.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * How that contact should be used, eg. a phone number
   **/
  @ApiModelProperty(required = true, value = "How that contact should be used, eg. a phone number")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    purpose: ").append(StringUtil.toIndentedString(purpose)).append("\n");
    sb.append("    detail: ").append(StringUtil.toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
