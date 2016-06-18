package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.RestrictedRate;
import io.swagger.client.model.Amount;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TrainSearchPricing   {
  
  private String serviceClass = null;
  private String bookingCode = null;
  private String accomodation = null;
  private Amount totalPrice = null;
  private RestrictedRate rate = null;

  
  /**
   * A standard enumeration of the type of seat, bed or service the passenger can expect.
   **/
  @ApiModelProperty(required = true, value = "A standard enumeration of the type of seat, bed or service the passenger can expect.")
  @JsonProperty("service_class")
  public String getServiceClass() {
    return serviceClass;
  }
  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }

  
  /**
   * A code the identifies the type of booking class being used.
   **/
  @ApiModelProperty(required = true, value = "A code the identifies the type of booking class being used.")
  @JsonProperty("booking_code")
  public String getBookingCode() {
    return bookingCode;
  }
  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  
  /**
   * A standard enumeration of the mode in which the passenger is accommodated. For example: SEAT, BERTH, CABIN, CARGO, UNKNOWN.
   **/
  @ApiModelProperty(required = true, value = "A standard enumeration of the mode in which the passenger is accommodated. For example: SEAT, BERTH, CABIN, CARGO, UNKNOWN.")
  @JsonProperty("accomodation")
  public String getAccomodation() {
    return accomodation;
  }
  public void setAccomodation(String accomodation) {
    this.accomodation = accomodation;
  }

  
  /**
   * The total cost of this service.
   **/
  @ApiModelProperty(required = true, value = "The total cost of this service.")
  @JsonProperty("total_price")
  public Amount getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  /**
   * A rate identifying type of charge being levied for this service, and the restrictions that apply.
   **/
  @ApiModelProperty(required = true, value = "A rate identifying type of charge being levied for this service, and the restrictions that apply.")
  @JsonProperty("rate")
  public RestrictedRate getRate() {
    return rate;
  }
  public void setRate(RestrictedRate rate) {
    this.rate = rate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainSearchPricing {\n");
    
    sb.append("    serviceClass: ").append(StringUtil.toIndentedString(serviceClass)).append("\n");
    sb.append("    bookingCode: ").append(StringUtil.toIndentedString(bookingCode)).append("\n");
    sb.append("    accomodation: ").append(StringUtil.toIndentedString(accomodation)).append("\n");
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("    rate: ").append(StringUtil.toIndentedString(rate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
