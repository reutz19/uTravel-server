package uTravel.server.resultModel;

import uTravel.server.resultModel.MixSearchBound;

import io.swagger.client.StringUtil;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class MixSearchItinerary   {
  
  private MixSearchBound outbound = null;
  private MixSearchBound inbound = null;

  
  /**
   * The bound container for the flight information for bringing the traveler from the origin airport to the destination airport
   **/
  @ApiModelProperty(required = true, value = "The bound container for the flight/train information for bringing the traveler from the origin airport/train station to the destination airport/train station")
  @JsonProperty("outbound")
  public MixSearchBound getOutbound() {
    return outbound;
  }
  public void setOutbound(MixSearchBound outbound) {
    this.outbound = outbound;
  }

  
  /**
   * The bound container for the flight/train information for bringing the traveler from the destination airport to the origin airport
   **/
  @ApiModelProperty(value = "The bound container for the flight/train information for bringing the traveler from the destination airport/train station to the origin airport/train station")
  @JsonProperty("inbound")
  public MixSearchBound getInbound() {
    return inbound;
  }
  public void setInbound(MixSearchBound inbound) {
    this.inbound = inbound;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixSearchItinerary {\n");
    
    sb.append("    outbound: ").append(StringUtil.toIndentedString(outbound)).append("\n");
    sb.append("    inbound: ").append(StringUtil.toIndentedString(inbound)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
