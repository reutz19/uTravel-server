package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Message   {
  
  private String severity = null;
  private String type = null;
  private String message = null;

  
  /**
   * An indicator of the importance of this message as part of the flow. May be ERROR or INFO.
   **/
  @ApiModelProperty(required = true, value = "An indicator of the importance of this message as part of the flow. May be ERROR or INFO.")
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  
  /**
   * An indicator of the source or type of message that has been generated. May be USER or SYSTEM.
   **/
  @ApiModelProperty(required = true, value = "An indicator of the source or type of message that has been generated. May be USER or SYSTEM.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * A free text message that provides more information.
   **/
  @ApiModelProperty(required = true, value = "A free text message that provides more information.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    severity: ").append(StringUtil.toIndentedString(severity)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
