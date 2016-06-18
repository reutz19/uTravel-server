package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.FareRestrictions;
import io.swagger.client.model.Fare;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FlightSearchPrice   {
  
  private String totalPrice = null;
  private Fare pricePerAdult = null;
  private Fare pricePerChild = null;
  private Fare pricePerInfant = null;
  private FareRestrictions restrictions = null;

  
  /**
   * The total price for all the requested passengers for this flight
   **/
  @ApiModelProperty(required = true, value = "The total price for all the requested passengers for this flight")
  @JsonProperty("total_price")
  public String getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  /**
   * The per-passenger fare for each adult on this flight
   **/
  @ApiModelProperty(required = true, value = "The per-passenger fare for each adult on this flight")
  @JsonProperty("price_per_adult")
  public Fare getPricePerAdult() {
    return pricePerAdult;
  }
  public void setPricePerAdult(Fare pricePerAdult) {
    this.pricePerAdult = pricePerAdult;
  }

  
  /**
   * The per-passenger fare for each child on this flight
   **/
  @ApiModelProperty(value = "The per-passenger fare for each child on this flight")
  @JsonProperty("price_per_child")
  public Fare getPricePerChild() {
    return pricePerChild;
  }
  public void setPricePerChild(Fare pricePerChild) {
    this.pricePerChild = pricePerChild;
  }

  
  /**
   * The per-passenger fare for each infant on this flight
   **/
  @ApiModelProperty(value = "The per-passenger fare for each infant on this flight")
  @JsonProperty("price_per_infant")
  public Fare getPricePerInfant() {
    return pricePerInfant;
  }
  public void setPricePerInfant(Fare pricePerInfant) {
    this.pricePerInfant = pricePerInfant;
  }

  
  /**
   * The restrictions associated with this fare
   **/
  @ApiModelProperty(required = true, value = "The restrictions associated with this fare")
  @JsonProperty("restrictions")
  public FareRestrictions getRestrictions() {
    return restrictions;
  }
  public void setRestrictions(FareRestrictions restrictions) {
    this.restrictions = restrictions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchPrice {\n");
    
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("    pricePerAdult: ").append(StringUtil.toIndentedString(pricePerAdult)).append("\n");
    sb.append("    pricePerChild: ").append(StringUtil.toIndentedString(pricePerChild)).append("\n");
    sb.append("    pricePerInfant: ").append(StringUtil.toIndentedString(pricePerInfant)).append("\n");
    sb.append("    restrictions: ").append(StringUtil.toIndentedString(restrictions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
