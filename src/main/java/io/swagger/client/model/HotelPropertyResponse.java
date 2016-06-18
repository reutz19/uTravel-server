package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Amenity;
import io.swagger.client.model.Geolocation;
import io.swagger.client.model.Address;
import io.swagger.client.model.Award;
import io.swagger.client.model.Amount;
import io.swagger.client.model.HotelRoom;
import java.util.*;
import io.swagger.client.model.Image;
import io.swagger.client.model.Contact;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class HotelPropertyResponse   {
  
  private String propertyCode = null;
  private String propertyName = null;
  private Geolocation location = null;
  private Address address = null;
  private Amount totalPrice = null;
  private Amount minDailyRate = null;
  private List<Contact> contacts = new ArrayList<Contact>();
  private List<Amenity> amenities = new ArrayList<Amenity>();
  private List<Award> awards = new ArrayList<Award>();
  private List<Image> images = new ArrayList<Image>();
  private List<HotelRoom> rooms = new ArrayList<HotelRoom>();

  
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
   * This hotel's approximate geolocation.
   **/
  @ApiModelProperty(required = true, value = "This hotel's approximate geolocation.")
  @JsonProperty("location")
  public Geolocation getLocation() {
    return location;
  }
  public void setLocation(Geolocation location) {
    this.location = location;
  }

  
  /**
   * This hotel's postal address.
   **/
  @ApiModelProperty(value = "This hotel's postal address.")
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  
  /**
   * The lowest price of a stay, from the given check in date to the given check out date.
   **/
  @ApiModelProperty(required = true, value = "The lowest price of a stay, from the given check in date to the given check out date.")
  @JsonProperty("total_price")
  public Amount getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  /**
   * The lowest price per day that the hotel offers between the given check-in and check-out dates. Extra taxes may apply to this rate.
   **/
  @ApiModelProperty(required = true, value = "The lowest price per day that the hotel offers between the given check-in and check-out dates. Extra taxes may apply to this rate.")
  @JsonProperty("min_daily_rate")
  public Amount getMinDailyRate() {
    return minDailyRate;
  }
  public void setMinDailyRate(Amount minDailyRate) {
    this.minDailyRate = minDailyRate;
  }

  
  /**
   * An array of contact objects to tell the user how to contact the hotel. Typically includes a phone and fax number
   **/
  @ApiModelProperty(value = "An array of contact objects to tell the user how to contact the hotel. Typically includes a phone and fax number")
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  
  /**
   * An array of amenity objects to the user what facilities this hotel might provide, such as a pool or parking. \nIf this array is empty, it does not necessarily mean that there are no amenities available at this hotel, it could also mean that the hotel does not list their amenities in our search!
   **/
  @ApiModelProperty(value = "An array of amenity objects to the user what facilities this hotel might provide, such as a pool or parking. \nIf this array is empty, it does not necessarily mean that there are no amenities available at this hotel, it could also mean that the hotel does not list their amenities in our search!")
  @JsonProperty("amenities")
  public List<Amenity> getAmenities() {
    return amenities;
  }
  public void setAmenities(List<Amenity> amenities) {
    this.amenities = amenities;
  }

  
  /**
   * An array of hotel award objects to give the user an expectation of the service quality at this hotel. This can be used to indicate, for example, the star rating of a hotel. If this array is empty, it does not necessarily mean that the hotel has no awards, it could simply mean that they didn't tell us about them!
   **/
  @ApiModelProperty(value = "An array of hotel award objects to give the user an expectation of the service quality at this hotel. This can be used to indicate, for example, the star rating of a hotel. If this array is empty, it does not necessarily mean that the hotel has no awards, it could simply mean that they didn't tell us about them!")
  @JsonProperty("awards")
  public List<Award> getAwards() {
    return awards;
  }
  public void setAwards(List<Award> awards) {
    this.awards = awards;
  }

  
  /**
   * A selection of image objects, showing pictures of the hotel building, the entrance or some rooms, to give an indication of what to expect at this hotel.
   **/
  @ApiModelProperty(value = "A selection of image objects, showing pictures of the hotel building, the entrance or some rooms, to give an indication of what to expect at this hotel.")
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  
  /**
   * Information on currently available rooms at this hotel.
   **/
  @ApiModelProperty(value = "Information on currently available rooms at this hotel.")
  @JsonProperty("rooms")
  public List<HotelRoom> getRooms() {
    return rooms;
  }
  public void setRooms(List<HotelRoom> rooms) {
    this.rooms = rooms;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPropertyResponse {\n");
    
    sb.append("    propertyCode: ").append(StringUtil.toIndentedString(propertyCode)).append("\n");
    sb.append("    propertyName: ").append(StringUtil.toIndentedString(propertyName)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    address: ").append(StringUtil.toIndentedString(address)).append("\n");
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("    minDailyRate: ").append(StringUtil.toIndentedString(minDailyRate)).append("\n");
    sb.append("    contacts: ").append(StringUtil.toIndentedString(contacts)).append("\n");
    sb.append("    amenities: ").append(StringUtil.toIndentedString(amenities)).append("\n");
    sb.append("    awards: ").append(StringUtil.toIndentedString(awards)).append("\n");
    sb.append("    images: ").append(StringUtil.toIndentedString(images)).append("\n");
    sb.append("    rooms: ").append(StringUtil.toIndentedString(rooms)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
