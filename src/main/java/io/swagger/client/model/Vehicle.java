package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.VehicleInfo;
import io.swagger.client.model.Rate;
import io.swagger.client.model.Amount;
import io.swagger.client.model.Image;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Vehicle   {
  
  private VehicleInfo vehicleInfo = null;
  private Rate rates = null;
  private Amount estimatedTotal = null;
  private Image image = null;

  
  /**
   * More information about the type of vehicle on offer.
   **/
  @ApiModelProperty(required = true, value = "More information about the type of vehicle on offer.")
  @JsonProperty("vehicle_info")
  public VehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }
  public void setVehicleInfo(VehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }

  
  /**
   * Rates that will be applied during the duration of the car rental requested. These rates are generally not inclusive of tax and are used by the car rental company to compute the total cost at the end of the rental period.
   **/
  @ApiModelProperty(value = "Rates that will be applied during the duration of the car rental requested. These rates are generally not inclusive of tax and are used by the car rental company to compute the total cost at the end of the rental period.")
  @JsonProperty("rates")
  public Rate getRates() {
    return rates;
  }
  public void setRates(Rate rates) {
    this.rates = rates;
  }

  
  /**
   * The estimated total cost of the rental given the rental period and location provided, including all mandatory taxes and charges, and using a default set of rental options and restrictions defined by the car company.
   **/
  @ApiModelProperty(value = "The estimated total cost of the rental given the rental period and location provided, including all mandatory taxes and charges, and using a default set of rental options and restrictions defined by the car company.")
  @JsonProperty("estimated_total")
  public Amount getEstimatedTotal() {
    return estimatedTotal;
  }
  public void setEstimatedTotal(Amount estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
  }

  
  /**
   * An image to give an indication of what to expect when renting this vehicle.
   **/
  @ApiModelProperty(value = "An image to give an indication of what to expect when renting this vehicle.")
  @JsonProperty("image")
  public Image getImage() {
    return image;
  }
  public void setImage(Image image) {
    this.image = image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    vehicleInfo: ").append(StringUtil.toIndentedString(vehicleInfo)).append("\n");
    sb.append("    rates: ").append(StringUtil.toIndentedString(rates)).append("\n");
    sb.append("    estimatedTotal: ").append(StringUtil.toIndentedString(estimatedTotal)).append("\n");
    sb.append("    image: ").append(StringUtil.toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
