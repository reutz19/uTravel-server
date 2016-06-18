package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Reservation;
import io.swagger.client.model.Message;
import java.util.*;
import io.swagger.client.model.Traveler;
import io.swagger.client.model.TravelRecordHeader;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TravelRecordResponse   {
  
  private String recordLocator = null;
  private TravelRecordHeader header = null;
  private List<Message> messages = new ArrayList<Message>();
  private List<Traveler> travelers = new ArrayList<Traveler>();
  private Reservation reservation = null;

  
  /**
   * 6 character identifier of this travel record on the Amadeus system.
   **/
  @ApiModelProperty(required = true, value = "6 character identifier of this travel record on the Amadeus system.")
  @JsonProperty("record_locator")
  public String getRecordLocator() {
    return recordLocator;
  }
  public void setRecordLocator(String recordLocator) {
    this.recordLocator = recordLocator;
  }

  
  /**
   * Summarized metadata on the record that has been retrieved.
   **/
  @ApiModelProperty(value = "Summarized metadata on the record that has been retrieved.")
  @JsonProperty("header")
  public TravelRecordHeader getHeader() {
    return header;
  }
  public void setHeader(TravelRecordHeader header) {
    this.header = header;
  }

  
  /**
   * Functional or technical messages associated with the retrieval of this travel record.
   **/
  @ApiModelProperty(value = "Functional or technical messages associated with the retrieval of this travel record.")
  @JsonProperty("messages")
  public List<Message> getMessages() {
    return messages;
  }
  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  
  /**
   * Information about each traveler who may be included as part of this travel record.
   **/
  @ApiModelProperty(value = "Information about each traveler who may be included as part of this travel record.")
  @JsonProperty("travelers")
  public List<Traveler> getTravelers() {
    return travelers;
  }
  public void setTravelers(List<Traveler> travelers) {
    this.travelers = travelers;
  }

  
  /**
   * Details about the itineraries that have been reserved as part of this travel record.
   **/
  @ApiModelProperty(value = "Details about the itineraries that have been reserved as part of this travel record.")
  @JsonProperty("reservation")
  public Reservation getReservation() {
    return reservation;
  }
  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRecordResponse {\n");
    
    sb.append("    recordLocator: ").append(StringUtil.toIndentedString(recordLocator)).append("\n");
    sb.append("    header: ").append(StringUtil.toIndentedString(header)).append("\n");
    sb.append("    messages: ").append(StringUtil.toIndentedString(messages)).append("\n");
    sb.append("    travelers: ").append(StringUtil.toIndentedString(travelers)).append("\n");
    sb.append("    reservation: ").append(StringUtil.toIndentedString(reservation)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
