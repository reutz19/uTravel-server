package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.OtherReservationBookingInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class OtherReservation   {
  
  private String id = null;
  private String date = null;
  private String location = null;
  private String description = null;
  private List<String> travelerIds = new ArrayList<String>();
  private OtherReservationBookingInfo bookingInfo = null;

  
  /**
   * Uniquely identifies this other reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this other reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Date on which this other reservation will begin, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "Date on which this other reservation will begin, in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * A 3 letter IATA code that identifies where this other reservation will occur.
   **/
  @ApiModelProperty(required = true, value = "A 3 letter IATA code that identifies where this other reservation will occur.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   * A free-text description of this reservation, that will inform you of its functional meaning.
   **/
  @ApiModelProperty(value = "A free-text description of this reservation, that will inform you of its functional meaning.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Traveler identifiers to indicate the travelers to whom this reservation applies.
   **/
  @ApiModelProperty(required = true, value = "Traveler identifiers to indicate the travelers to whom this reservation applies.")
  @JsonProperty("traveler_ids")
  public List<String> getTravelerIds() {
    return travelerIds;
  }
  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  
  /**
   * The status of this reservation.
   **/
  @ApiModelProperty(required = true, value = "The status of this reservation.")
  @JsonProperty("booking_info")
  public OtherReservationBookingInfo getBookingInfo() {
    return bookingInfo;
  }
  public void setBookingInfo(OtherReservationBookingInfo bookingInfo) {
    this.bookingInfo = bookingInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherReservation {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    travelerIds: ").append(StringUtil.toIndentedString(travelerIds)).append("\n");
    sb.append("    bookingInfo: ").append(StringUtil.toIndentedString(bookingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
