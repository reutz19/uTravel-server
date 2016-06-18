package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class HotelReservationBookingInfo   {
  
  private String reservationCode = null;
  private String status = null;

  
  /**
   * The identifier of this reservation in the hotel chain's system. This should be provided at the check-in desk to identify your reservation.
   **/
  @ApiModelProperty(required = true, value = "The identifier of this reservation in the hotel chain's system. This should be provided at the check-in desk to identify your reservation.")
  @JsonProperty("reservation_code")
  public String getReservationCode() {
    return reservationCode;
  }
  public void setReservationCode(String reservationCode) {
    this.reservationCode = reservationCode;
  }

  
  /**
   * An enumeration to represent the reservation status for this hotel reservation. For example: CONFIRMED, CANCELLED, REQUESTED.
   **/
  @ApiModelProperty(required = true, value = "An enumeration to represent the reservation status for this hotel reservation. For example: CONFIRMED, CANCELLED, REQUESTED.")
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
    sb.append("class HotelReservationBookingInfo {\n");
    
    sb.append("    reservationCode: ").append(StringUtil.toIndentedString(reservationCode)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
