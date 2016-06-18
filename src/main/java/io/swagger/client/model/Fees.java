package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Fees   {
  
  private String serviceFees = null;
  private String creditcardFees = null;

  
  /**
   * The cost of any required service fees in addition to the total price
   **/
  @ApiModelProperty(value = "The cost of any required service fees in addition to the total price")
  @JsonProperty("service_fees")
  public String getServiceFees() {
    return serviceFees;
  }
  public void setServiceFees(String serviceFees) {
    this.serviceFees = serviceFees;
  }

  
  /**
   * The cost of any fees for common credit cards, such as Visa or Mastercard, in addition to the total price
   **/
  @ApiModelProperty(value = "The cost of any fees for common credit cards, such as Visa or Mastercard, in addition to the total price")
  @JsonProperty("creditcard_fees")
  public String getCreditcardFees() {
    return creditcardFees;
  }
  public void setCreditcardFees(String creditcardFees) {
    this.creditcardFees = creditcardFees;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fees {\n");
    
    sb.append("    serviceFees: ").append(StringUtil.toIndentedString(serviceFees)).append("\n");
    sb.append("    creditcardFees: ").append(StringUtil.toIndentedString(creditcardFees)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
