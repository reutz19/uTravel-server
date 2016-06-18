package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Amount;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Rate   {
  
  private String type = null;
  private Amount price = null;

  
  /**
   * The type or applicability period of rate being applied. For example: DAILY, WEEKLY, WEEKEND.
   **/
  @ApiModelProperty(required = true, value = "The type or applicability period of rate being applied. For example: DAILY, WEEKLY, WEEKEND.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The long name of the provider corresponding to the above code.
   **/
  @ApiModelProperty(required = true, value = "The long name of the provider corresponding to the above code.")
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }
  public void setPrice(Amount price) {
    this.price = price;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
