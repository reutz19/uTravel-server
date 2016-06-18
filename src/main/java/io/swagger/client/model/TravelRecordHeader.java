package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TravelRecordHeader   {
  
  private String creationOfficeId = null;
  private String ownerOfficeId = null;

  
  /**
   * 9 character Amadeus office identifier of the travel agency that created this travel record. An office ID may be considered as equivalent to a [PCC](https://en.wikipedia.org/wiki/Pseudo_city_code) in other reservation systems.
   **/
  @ApiModelProperty(required = true, value = "9 character Amadeus office identifier of the travel agency that created this travel record. An office ID may be considered as equivalent to a [PCC](https://en.wikipedia.org/wiki/Pseudo_city_code) in other reservation systems.")
  @JsonProperty("creation_office_id")
  public String getCreationOfficeId() {
    return creationOfficeId;
  }
  public void setCreationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
  }

  
  /**
   * 9 character Amadeus office identifier of the travel agency that owns and manages this travel record.
   **/
  @ApiModelProperty(required = true, value = "9 character Amadeus office identifier of the travel agency that owns and manages this travel record.")
  @JsonProperty("owner_office_id")
  public String getOwnerOfficeId() {
    return ownerOfficeId;
  }
  public void setOwnerOfficeId(String ownerOfficeId) {
    this.ownerOfficeId = ownerOfficeId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRecordHeader {\n");
    
    sb.append("    creationOfficeId: ").append(StringUtil.toIndentedString(creationOfficeId)).append("\n");
    sb.append("    ownerOfficeId: ").append(StringUtil.toIndentedString(ownerOfficeId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
