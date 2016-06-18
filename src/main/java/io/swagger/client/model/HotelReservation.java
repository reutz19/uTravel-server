package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.HotelReservationBookingInfo;
import io.swagger.client.model.Amount;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class HotelReservation   {
  
  private String id = null;
  private String checkIn = null;
  private String checkOut = null;
  private String propertyCode = null;
  private String propertyName = null;
  private Amount totalPrice = null;
  private List<String> travelerIds = new ArrayList<String>();
  private HotelReservationBookingInfo bookingInfo = null;

  
  /**
   * Uniquely identifies this hotel room reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this hotel room reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Date on which the guest will begin their stay in the hotel, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "Date on which the guest will begin their stay in the hotel, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.")
  @JsonProperty("check_in")
  public String getCheckIn() {
    return checkIn;
  }
  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  
  /**
   * Date on which the guest will end their stay in the hotel, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "Date on which the guest will end their stay in the hotel, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.")
  @JsonProperty("check_out")
  public String getCheckOut() {
    return checkOut;
  }
  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  
  /**
   * The 8 character property code of this given hotel. The first 2 characters of this code are the chain code that can be specified in the input. The remaining elements are proprietary to each hotel chain.
   **/
  @ApiModelProperty(required = true, value = "The 8 character property code of this given hotel. The first 2 characters of this code are the chain code that can be specified in the input. The remaining elements are proprietary to each hotel chain.")
  @JsonProperty("property_code")
  public String getPropertyCode() {
    return propertyCode;
  }
  public void setPropertyCode(String propertyCode) {
    this.propertyCode = propertyCode;
  }

  
  /**
   * The name of this hotel.
   **/
  @ApiModelProperty(required = true, value = "The name of this hotel.")
  @JsonProperty("property_name")
  public String getPropertyName() {
    return propertyName;
  }
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  
  /**
   * The total price of this stay, from the given check in date to the given check out date.
   **/
  @ApiModelProperty(value = "The total price of this stay, from the given check in date to the given check out date.")
  @JsonProperty("total_price")
  public Amount getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  /**
   * Traveler identifiers to indicate the travelers to whom this hotel room reservation applies. Generally all non-infant room occupants will be marked in this array.
   **/
  @ApiModelProperty(required = true, value = "Traveler identifiers to indicate the travelers to whom this hotel room reservation applies. Generally all non-infant room occupants will be marked in this array.")
  @JsonProperty("traveler_ids")
  public List<String> getTravelerIds() {
    return travelerIds;
  }
  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  
  /**
   * Additional details and status of this hotel room reservation.
   **/
  @ApiModelProperty(required = true, value = "Additional details and status of this hotel room reservation.")
  @JsonProperty("booking_info")
  public HotelReservationBookingInfo getBookingInfo() {
    return bookingInfo;
  }
  public void setBookingInfo(HotelReservationBookingInfo bookingInfo) {
    this.bookingInfo = bookingInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelReservation {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    checkIn: ").append(StringUtil.toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(StringUtil.toIndentedString(checkOut)).append("\n");
    sb.append("    propertyCode: ").append(StringUtil.toIndentedString(propertyCode)).append("\n");
    sb.append("    propertyName: ").append(StringUtil.toIndentedString(propertyName)).append("\n");
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("    travelerIds: ").append(StringUtil.toIndentedString(travelerIds)).append("\n");
    sb.append("    bookingInfo: ").append(StringUtil.toIndentedString(bookingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
