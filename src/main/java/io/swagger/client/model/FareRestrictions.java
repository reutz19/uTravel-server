package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FareRestrictions   {
  
  private Boolean refundable = null;
  private Boolean changePenalties = null;

  
  /**
   * Indicates whether this fare is refundable under some circumstances. Note that a refund charge or penalty may apply
   **/
  @ApiModelProperty(required = true, value = "Indicates whether this fare is refundable under some circumstances. Note that a refund charge or penalty may apply")
  @JsonProperty("refundable")
  public Boolean getRefundable() {
    return refundable;
  }
  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }

  
  /**
   * Indicates whether this fare allows the itinerary to be changed under some circumstances. Note that a change fee or penalty may apply
   **/
  @ApiModelProperty(required = true, value = "Indicates whether this fare allows the itinerary to be changed under some circumstances. Note that a change fee or penalty may apply")
  @JsonProperty("change_penalties")
  public Boolean getChangePenalties() {
    return changePenalties;
  }
  public void setChangePenalties(Boolean changePenalties) {
    this.changePenalties = changePenalties;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareRestrictions {\n");
    
    sb.append("    refundable: ").append(StringUtil.toIndentedString(refundable)).append("\n");
    sb.append("    changePenalties: ").append(StringUtil.toIndentedString(changePenalties)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
