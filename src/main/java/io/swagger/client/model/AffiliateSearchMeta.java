package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CarrierMeta;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AffiliateSearchMeta   {
  
  private CarrierMeta carriers = null;

  
  /**
   * A map of meta information for each of the airlines involved in the response
   **/
  @ApiModelProperty(required = true, value = "A map of meta information for each of the airlines involved in the response")
  @JsonProperty("carriers")
  public CarrierMeta getCarriers() {
    return carriers;
  }
  public void setCarriers(CarrierMeta carriers) {
    this.carriers = carriers;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliateSearchMeta {\n");
    
    sb.append("    carriers: ").append(StringUtil.toIndentedString(carriers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
