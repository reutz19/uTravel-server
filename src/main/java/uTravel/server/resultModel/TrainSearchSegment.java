package uTravel.server.resultModel;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Station;
import io.swagger.client.model.TrainSearchPricing;
import io.swagger.client.model.Airport;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TrainSearchSegment extends MixSearchSegment   {
  
  private String departsAt = null;
  private String arrivesAt = null;
  private Station departureStation = null;
  private Airport arrivalStation = null;
  private String marketingCompany = null;
  private String operatingCompany = null;
  private String trainNumber = null;
  private String trainType = null;
  private List<TrainSearchPricing> prices = new ArrayList<TrainSearchPricing>();

  public TrainSearchSegment(io.swagger.client.model.TrainSearchSegment trainSearchSegment) {
	  departsAt = trainSearchSegment.getDepartsAt();
	  arrivesAt = trainSearchSegment.getArrivesAt();
	  departureStation = trainSearchSegment.getDepartureStation();
	  arrivalStation = trainSearchSegment.getArrivalStation();
	  marketingCompany = trainSearchSegment.getMarketingCompany();
	  operatingCompany = trainSearchSegment.getOperatingCompany();
	  trainNumber = trainSearchSegment.getTrainNumber();
	  trainType = trainSearchSegment.getTrainType();
	  prices = new ArrayList<TrainSearchPricing>();
	  prices.addAll(trainSearchSegment.getPrices());
  }
  
/**
   * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time of the train's departure in the local time zone of the departure station, in the format YYYY-MM-DDTHH:mm.
   **/
  @ApiModelProperty(required = true, value = "The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time of the train's departure in the local time zone of the departure station, in the format YYYY-MM-DDTHH:mm.")
  @JsonProperty("departs_at")
  public String getDepartsAt() {
    return departsAt;
  }
  public void setDepartsAt(String departsAt) {
    this.departsAt = departsAt;
  }

  
  /**
   * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time of the train's arrival in the local time zone of the arrival station, in the format YYYY-MM-DDTHH:mm.
   **/
  @ApiModelProperty(required = true, value = "The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time of the train's arrival in the local time zone of the arrival station, in the format YYYY-MM-DDTHH:mm.")
  @JsonProperty("arrives_at")
  public String getArrivesAt() {
    return arrivesAt;
  }
  public void setArrivesAt(String arrivesAt) {
    this.arrivesAt = arrivesAt;
  }

  
  /**
   * The station object representing the station at which the passenger should board this train in order to complete this part of the itinerary.
   **/
  @ApiModelProperty(required = true, value = "The station object representing the station at which the passenger should board this train in order to complete this part of the itinerary.")
  @JsonProperty("departure_station")
  public Station getDepartureStation() {
    return departureStation;
  }
  public void setDepartureStation(Station departureStation) {
    this.departureStation = departureStation;
  }

  
  /**
   * The station object representing the station at which the passenger should disembark this train in order to complete this part of the itinerary.
   **/
  @ApiModelProperty(required = true, value = "The station object representing the station at which the passenger should disembark this train in order to complete this part of the itinerary.")
  @JsonProperty("arrival_station")
  public Airport getArrivalStation() {
    return arrivalStation;
  }
  public void setArrivalStation(Airport arrivalStation) {
    this.arrivalStation = arrivalStation;
  }

  
  /**
   * The name of the train company selling this train journey. This is the name you should see printed on your ticket.
   **/
  @ApiModelProperty(required = true, value = "The name of the train company selling this train journey. This is the name you should see printed on your ticket.")
  @JsonProperty("marketing_company")
  public String getMarketingCompany() {
    return marketingCompany;
  }
  public void setMarketingCompany(String marketingCompany) {
    this.marketingCompany = marketingCompany;
  }

  
  /**
   * The name of the train company operating this train journey. This is the name you should see written on the train.
   **/
  @ApiModelProperty(required = true, value = "The name of the train company operating this train journey. This is the name you should see written on the train.")
  @JsonProperty("operating_company")
  public String getOperatingCompany() {
    return operatingCompany;
  }
  public void setOperatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
  }

  
  /**
   * The identifying number of this train service. Usually the marketing company will only operate on train per day with this train number.
   **/
  @ApiModelProperty(required = true, value = "The identifying number of this train service. Usually the marketing company will only operate on train per day with this train number.")
  @JsonProperty("train_number")
  public String getTrainNumber() {
    return trainNumber;
  }
  public void setTrainNumber(String trainNumber) {
    this.trainNumber = trainNumber;
  }

  
  /**
   * The type of train that you may expect for this journey. For example: InterCity, Regional...
   **/
  @ApiModelProperty(value = "The type of train that you may expect for this journey. For example: InterCity, Regional...")
  @JsonProperty("train_type")
  public String getTrainType() {
    return trainType;
  }
  public void setTrainType(String trainType) {
    this.trainType = trainType;
  }

  
  /**
   * Possible pricing for this train journey.
   **/
  @ApiModelProperty(required = true, value = "Possible pricing for this train journey.")
  @JsonProperty("prices")
  public List<TrainSearchPricing> getPrices() {
    return prices;
  }
  public void setPrices(List<TrainSearchPricing> prices) {
    this.prices = prices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainSearchSegment {\n");
    
    sb.append("    departsAt: ").append(StringUtil.toIndentedString(departsAt)).append("\n");
    sb.append("    arrivesAt: ").append(StringUtil.toIndentedString(arrivesAt)).append("\n");
    sb.append("    departureStation: ").append(StringUtil.toIndentedString(departureStation)).append("\n");
    sb.append("    arrivalStation: ").append(StringUtil.toIndentedString(arrivalStation)).append("\n");
    sb.append("    marketingCompany: ").append(StringUtil.toIndentedString(marketingCompany)).append("\n");
    sb.append("    operatingCompany: ").append(StringUtil.toIndentedString(operatingCompany)).append("\n");
    sb.append("    trainNumber: ").append(StringUtil.toIndentedString(trainNumber)).append("\n");
    sb.append("    trainType: ").append(StringUtil.toIndentedString(trainType)).append("\n");
    sb.append("    prices: ").append(StringUtil.toIndentedString(prices)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
