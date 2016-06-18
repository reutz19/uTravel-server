package uTravel.server.resultModel;

import io.swagger.client.StringUtil;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class MixSearchPrice   {
  
  private String totalPrice = null;
  
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
  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixSearchPrice {\n");
    
    sb.append("    totalPrice: ").append(StringUtil.toIndentedString(totalPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
