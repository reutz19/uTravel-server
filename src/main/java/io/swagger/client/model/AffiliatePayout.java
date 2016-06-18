package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Amount;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AffiliatePayout   {
  
  private Amount CPC = null;
  private Amount CPA = null;
  private Amount CPS = null;

  
  /**
   * See https://en.wikipedia.org/wiki/Pay_per_click for commission earned when the provided deep link is clicked
   **/
  @ApiModelProperty(value = "See https://en.wikipedia.org/wiki/Pay_per_click for commission earned when the provided deep link is clicked")
  @JsonProperty("CPC")
  public Amount getCPC() {
    return CPC;
  }
  public void setCPC(Amount CPC) {
    this.CPC = CPC;
  }

  
  /**
   * See https://en.wikipedia.org/wiki/Cost_per_action for commission earned for a given action from the provided deep link
   **/
  @ApiModelProperty(value = "See https://en.wikipedia.org/wiki/Cost_per_action for commission earned for a given action from the provided deep link")
  @JsonProperty("CPA")
  public Amount getCPA() {
    return CPA;
  }
  public void setCPA(Amount CPA) {
    this.CPA = CPA;
  }

  
  /**
   * See https://en.wikipedia.org/wiki/Pay_per_sale for commission earned as a result of a booking made from the provided deep link
   **/
  @ApiModelProperty(value = "See https://en.wikipedia.org/wiki/Pay_per_sale for commission earned as a result of a booking made from the provided deep link")
  @JsonProperty("CPS")
  public Amount getCPS() {
    return CPS;
  }
  public void setCPS(Amount CPS) {
    this.CPS = CPS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliatePayout {\n");
    
    sb.append("    CPC: ").append(StringUtil.toIndentedString(CPC)).append("\n");
    sb.append("    CPA: ").append(StringUtil.toIndentedString(CPA)).append("\n");
    sb.append("    CPS: ").append(StringUtil.toIndentedString(CPS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
