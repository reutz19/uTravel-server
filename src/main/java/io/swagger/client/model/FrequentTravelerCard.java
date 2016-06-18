package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class FrequentTravelerCard   {
  
  private String issuerType = null;
  private String companyCode = null;
  private String cardNumber = null;

  
  /**
   * The type of organization that issued the card. This is an enumeration, possible values are AIRLINE, HOTEL_CHAIN, RENTAL_CAR_PROVIDER, RAILWAY.
   **/
  @ApiModelProperty(required = true, value = "The type of organization that issued the card. This is an enumeration, possible values are AIRLINE, HOTEL_CHAIN, RENTAL_CAR_PROVIDER, RAILWAY.")
  @JsonProperty("issuer_type")
  public String getIssuerType() {
    return issuerType;
  }
  public void setIssuerType(String issuerType) {
    this.issuerType = issuerType;
  }

  
  /**
   * The identifying code of the issuer, within the context of its type. For example: BA (and if the issuer type is AIRLINE, this indicates BA=British Airways).
   **/
  @ApiModelProperty(required = true, value = "The identifying code of the issuer, within the context of its type. For example: BA (and if the issuer type is AIRLINE, this indicates BA=British Airways).")
  @JsonProperty("company_code")
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  
  /**
   * The identifying number (or string) marked on the card. For example: 12345678.
   **/
  @ApiModelProperty(required = true, value = "The identifying number (or string) marked on the card. For example: 12345678.")
  @JsonProperty("card_number")
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravelerCard {\n");
    
    sb.append("    issuerType: ").append(StringUtil.toIndentedString(issuerType)).append("\n");
    sb.append("    companyCode: ").append(StringUtil.toIndentedString(companyCode)).append("\n");
    sb.append("    cardNumber: ").append(StringUtil.toIndentedString(cardNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
