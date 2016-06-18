package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class PeriodRate   {
  
  private String startDate = null;
  private String endDate = null;
  private String currency = null;
  private String amount = null;

  
  /**
   * The start date of this rate, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "The start date of this rate, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The date on which this rate ends, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "The date on which this rate ends, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format yyyy-MM-dd.")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  
  /**
   * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code of this rate.
   **/
  @ApiModelProperty(required = true, value = "[ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code of this rate.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Total amount in the given currency per day of this rate, formatted appropriately. For example: 194.99.
   **/
  @ApiModelProperty(required = true, value = "Total amount in the given currency per day of this rate, formatted appropriately. For example: 194.99.")
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
    sb.append("class PeriodRate {\n");
    
    sb.append("    startDate: ").append(StringUtil.toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(StringUtil.toIndentedString(endDate)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
