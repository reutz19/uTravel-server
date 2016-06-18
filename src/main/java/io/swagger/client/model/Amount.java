package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Amount   {
  
  private String currency = null;
  private String amount = null;

  
  /**
   * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
   **/
  @ApiModelProperty(required = true, value = "[ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Total amount in the given currency, formatted appropriately. For example: 194.99
   **/
  @ApiModelProperty(required = true, value = "Total amount in the given currency, formatted appropriately. For example: 194.99")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
