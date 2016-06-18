package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.AffiliateFlightSearchPrice;
import io.swagger.client.model.AffiliatePayout;
import io.swagger.client.model.FlightSearchBound;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AffiliateSearchResult   {
  
  private FlightSearchBound outbound = null;
  private FlightSearchBound inbound = null;
  private AffiliateFlightSearchPrice fare = null;
  private AffiliatePayout payout = null;
  private String airline = null;
  private String deepLink = null;

  
  /**
   * The flight from the origin to the destination
   **/
  @ApiModelProperty(required = true, value = "The flight from the origin to the destination")
  @JsonProperty("outbound")
  public FlightSearchBound getOutbound() {
    return outbound;
  }
  public void setOutbound(FlightSearchBound outbound) {
    this.outbound = outbound;
  }

  
  /**
   * The return flight from the destination to the origin
   **/
  @ApiModelProperty(value = "The return flight from the destination to the origin")
  @JsonProperty("inbound")
  public FlightSearchBound getInbound() {
    return inbound;
  }
  public void setInbound(FlightSearchBound inbound) {
    this.inbound = inbound;
  }

  
  /**
   * The price and fare information which applies to all itineraries in this response
   **/
  @ApiModelProperty(required = true, value = "The price and fare information which applies to all itineraries in this response")
  @JsonProperty("fare")
  public AffiliateFlightSearchPrice getFare() {
    return fare;
  }
  public void setFare(AffiliateFlightSearchPrice fare) {
    this.fare = fare;
  }

  
  /**
   * Details of the amount of payout that the affiliate will received per click or if this flight is sold
   **/
  @ApiModelProperty(required = true, value = "Details of the amount of payout that the affiliate will received per click or if this flight is sold")
  @JsonProperty("payout")
  public AffiliatePayout getPayout() {
    return payout;
  }
  public void setPayout(AffiliatePayout payout) {
    this.payout = payout;
  }

  
  /**
   * The 2 character alphanumeric IATA airline code of the airline that is selling this result
   **/
  @ApiModelProperty(required = true, value = "The 2 character alphanumeric IATA airline code of the airline that is selling this result")
  @JsonProperty("airline")
  public String getAirline() {
    return airline;
  }
  public void setAirline(String airline) {
    this.airline = airline;
  }

  
  /**
   * A link to the page from which this result can be purchased from the affiliate
   **/
  @ApiModelProperty(required = true, value = "A link to the page from which this result can be purchased from the affiliate")
  @JsonProperty("deep_link")
  public String getDeepLink() {
    return deepLink;
  }
  public void setDeepLink(String deepLink) {
    this.deepLink = deepLink;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliateSearchResult {\n");
    
    sb.append("    outbound: ").append(StringUtil.toIndentedString(outbound)).append("\n");
    sb.append("    inbound: ").append(StringUtil.toIndentedString(inbound)).append("\n");
    sb.append("    fare: ").append(StringUtil.toIndentedString(fare)).append("\n");
    sb.append("    payout: ").append(StringUtil.toIndentedString(payout)).append("\n");
    sb.append("    airline: ").append(StringUtil.toIndentedString(airline)).append("\n");
    sb.append("    deepLink: ").append(StringUtil.toIndentedString(deepLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
