package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Amount;
import io.swagger.client.model.PeriodRate;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class HotelRoom   {
  
  private String bookingCode = null;
  private String roomTypeCode = null;
  private String ratePlanCode = null;
  private Amount totalPrice = null;
  private List<PeriodRate> rates = new ArrayList<PeriodRate>();
  private List<String> descriptions = new ArrayList<String>();

  
  /**
   * The booking code identifies a product at the hotel. It can be used to book a room.
   **/
  @ApiModelProperty(required = true, value = "The booking code identifies a product at the hotel. It can be used to book a room.")
  @JsonProperty("booking_code")
  public String getBookingCode() {
    return bookingCode;
  }
  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  
  /**
   * A 3-letter code to identify a specific room type.
   **/
  @ApiModelProperty(value = "A 3-letter code to identify a specific room type.")
  @JsonProperty("room_type_code")
  public String getRoomTypeCode() {
    return roomTypeCode;
  }
  public void setRoomTypeCode(String roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }

  
  /**
   * A 3 letter code to designate different rates base on traveler type.
   **/
  @ApiModelProperty(value = "A 3 letter code to designate different rates base on traveler type.")
  @JsonProperty("rate_plan_code")
  public String getRatePlanCode() {
    return ratePlanCode;
  }
  public void setRatePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
  }

  
  /**
   * The total price of staying in this room from the given check-in date to the given check-out date
   **/
  @ApiModelProperty(value = "The total price of staying in this room from the given check-in date to the given check-out date")
  @JsonProperty("total_price")
  public Amount getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  /**
   * The total price of staying in this room from the given check-in date to the given check-out date
   **/
  @ApiModelProperty(value = "The total price of staying in this room from the given check-in date to the given check-out date")
  @JsonProperty("rates")
  public List<PeriodRate> getRates() {
    return rates;
  }
  public void setRates(List<PeriodRate> rates) {
    this.rates = rates;
  }

  
  /**
   * An array of description strings describing room and rate types features
   **/
  @ApiModelProperty(value = "An array of description strings describing room and rate types features")
  @JsonProperty("descriptions")
  public List<String> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoom {\n");
    
    sb.append("    bookingCode: ").append(StringUtil.toIndentedString(bookingCode)).append("\n");
    sb.append("    roomTypeCode: ").append(StringUtil.toIndentedString(roomTypeCode)).append("\n");
    sb.append("    ratePlanCode: ").append(StringUtil.toIndentedString(ratePlanCode)).append("\n");
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("    rates: ").append(StringUtil.toIndentedString(rates)).append("\n");
    sb.append("    descriptions: ").append(StringUtil.toIndentedString(descriptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
