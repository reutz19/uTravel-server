package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Infant;
import java.util.*;
import io.swagger.client.model.FrequentTravelerCard;
import io.swagger.client.model.Contact;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Traveler   {
  
  private String id = null;
  private String lastName = null;
  private String firstName = null;
  private String travelerType = null;
  private Infant infant = null;
  private String dateOfBirth = null;
  private List<Contact> contacts = new ArrayList<Contact>();
  private List<FrequentTravelerCard> frequentTravelerCards = new ArrayList<FrequentTravelerCard>();

  
  /**
   * Uniquely identifies this traveler in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this traveler in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The last name of the passenger, as entered by the agent, in upper-case. May include suffixes. For example: THACKSTON, KING III, LU.
   **/
  @ApiModelProperty(required = true, value = "The last name of the passenger, as entered by the agent, in upper-case. May include suffixes. For example: THACKSTON, KING III, LU.")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The first name of the passenger, as entered by the agent, in upper-case. May include middle names, initials or prefixes. The total combined length of the first name and last name must be between 2 and 57 characters. For example: ALEXANDRA, JOSE-ANTONIO MR, ELAINE T DR.
   **/
  @ApiModelProperty(required = true, value = "The first name of the passenger, as entered by the agent, in upper-case. May include middle names, initials or prefixes. The total combined length of the first name and last name must be between 2 and 57 characters. For example: ALEXANDRA, JOSE-ANTONIO MR, ELAINE T DR.")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Enumeration of the type of traveler. May be ADULT or CHILD.
   **/
  @ApiModelProperty(required = true, value = "Enumeration of the type of traveler. May be ADULT or CHILD.")
  @JsonProperty("traveler_type")
  public String getTravelerType() {
    return travelerType;
  }
  public void setTravelerType(String travelerType) {
    this.travelerType = travelerType;
  }

  
  /**
   * Details on any infant that may be sharing this seat with this traveler. Absence of this key indicates that no infant is traveling with this passenger. An empty object at this key indicated an anonymous infant is traveling with the passenger.
   **/
  @ApiModelProperty(value = "Details on any infant that may be sharing this seat with this traveler. Absence of this key indicates that no infant is traveling with this passenger. An empty object at this key indicated an anonymous infant is traveling with the passenger.")
  @JsonProperty("infant")
  public Infant getInfant() {
    return infant;
  }
  public void setInfant(Infant infant) {
    this.infant = infant;
  }

  
  /**
   * An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date indicating the birth date of the traveler, as provided by the agent. For example: 1972-02-19.
   **/
  @ApiModelProperty(value = "An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date indicating the birth date of the traveler, as provided by the agent. For example: 1972-02-19.")
  @JsonProperty("date_of_birth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   * Details on how to contact this traveler. At least one traveler in a travel-record will have a contact element.
   **/
  @ApiModelProperty(value = "Details on how to contact this traveler. At least one traveler in a travel-record will have a contact element.")
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  
  /**
   * Information regarding loyalty cards that the traveler would like to use to accrue benefits as part of this travel record. Where possible, the system will attempt to validate that the frequent traveler card is eligible for use in the context of this travel record.
   **/
  @ApiModelProperty(value = "Information regarding loyalty cards that the traveler would like to use to accrue benefits as part of this travel record. Where possible, the system will attempt to validate that the frequent traveler card is eligible for use in the context of this travel record.")
  @JsonProperty("frequent_traveler_cards")
  public List<FrequentTravelerCard> getFrequentTravelerCards() {
    return frequentTravelerCards;
  }
  public void setFrequentTravelerCards(List<FrequentTravelerCard> frequentTravelerCards) {
    this.frequentTravelerCards = frequentTravelerCards;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traveler {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    travelerType: ").append(StringUtil.toIndentedString(travelerType)).append("\n");
    sb.append("    infant: ").append(StringUtil.toIndentedString(infant)).append("\n");
    sb.append("    dateOfBirth: ").append(StringUtil.toIndentedString(dateOfBirth)).append("\n");
    sb.append("    contacts: ").append(StringUtil.toIndentedString(contacts)).append("\n");
    sb.append("    frequentTravelerCards: ").append(StringUtil.toIndentedString(frequentTravelerCards)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
