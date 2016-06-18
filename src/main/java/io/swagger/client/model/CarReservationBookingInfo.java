package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarReservationBookingInfo   {
  
  private String reservationCode = null;
  private String status = null;

  
  /**
   * The identifier of this reservation in the car rental provider's system. This should be provided at the rental office to identify your reservation.
   **/
  @ApiModelProperty(required = true, value = "The identifier of this reservation in the car rental provider's system. This should be provided at the rental office to identify your reservation.")
  @JsonProperty("reservation_code")
  public String getReservationCode() {
    return reservationCode;
  }
  public void setReservationCode(String reservationCode) {
    this.reservationCode = reservationCode;
  }

  
  /**
   * An enumeration to represent the reservation status for this car rental. For example: CONFIRMED, CANCELLED, REQUESTED, REJECTED, PENDING_CANCELLATION, PENDING_CONFIRMATION.
   **/
  @ApiModelProperty(required = true, value = "An enumeration to represent the reservation status for this car rental. For example: CONFIRMED, CANCELLED, REQUESTED, REJECTED, PENDING_CANCELLATION, PENDING_CONFIRMATION.")
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
    sb.append("class CarReservationBookingInfo {\n");
    
    sb.append("    reservationCode: ").append(StringUtil.toIndentedString(reservationCode)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
