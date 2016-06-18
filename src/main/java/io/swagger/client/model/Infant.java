package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Infant   {
  
  private String lastName = null;
  private String firstName = null;
  private String dateOfBirth = null;

  
  /**
   * The last name of the infant, as entered by the agent, in upper-case. If no value is provided, the last name of the infant can generally be assumed to be the same as that of the traveler which whom they are associated.
   **/
  @ApiModelProperty(value = "The last name of the infant, as entered by the agent, in upper-case. If no value is provided, the last name of the infant can generally be assumed to be the same as that of the traveler which whom they are associated.")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The first name of the infant, as entered by the agent, in upper-case. May include middle names, initials or prefixes.
   **/
  @ApiModelProperty(value = "The first name of the infant, as entered by the agent, in upper-case. May include middle names, initials or prefixes.")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * An optional [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date indicating the birth date of the infant, as provided by the agent. For example: 1972-02-19.
   **/
  @ApiModelProperty(value = "An optional [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date indicating the birth date of the infant, as provided by the agent. For example: 1972-02-19.")
  @JsonProperty("date_of_birth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Infant {\n");
    
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    dateOfBirth: ").append(StringUtil.toIndentedString(dateOfBirth)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
