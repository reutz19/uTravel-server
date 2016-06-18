package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class OtherReservationBookingInfo   {
  
  private String status = null;

  
  /**
   * An enumeration to represent the reservation status for this hotel reservation. For example: CONFIRMED, CANCELLED, REQUESTED, REJECTED, PENDING_CANCELLATION, PENDING_CONFIRMATION.
   **/
  @ApiModelProperty(required = true, value = "An enumeration to represent the reservation status for this hotel reservation. For example: CONFIRMED, CANCELLED, REQUESTED, REJECTED, PENDING_CANCELLATION, PENDING_CONFIRMATION.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherReservationBookingInfo {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
