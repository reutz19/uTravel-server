package uTravel.server.resultModel;

import uTravel.server.resultModel.MixSearchPrice;
import uTravel.server.resultModel.MixSearchItinerary;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class MixSearchResult   {
  
  //TODO: change List<MixSearchItinerary> to a single itinerary
  private List<MixSearchItinerary> itineraries = new ArrayList<MixSearchItinerary>();
  private MixSearchPrice fare = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("itineraries")
  public List<MixSearchItinerary> getItineraries() {
    return itineraries;
  }
  public void setItineraries(List<MixSearchItinerary> itineraries) {
    this.itineraries = itineraries;
  }

  
  /**
   * The price and fare information which applies to all itineraries in this response
   **/
  @ApiModelProperty(required = true, value = "The price and fare information which applies to all itineraries in this response")
  @JsonProperty("fare")
  public MixSearchPrice getFare() {
    return fare;
  }
  public void setFare(MixSearchPrice fare) {
    this.fare = fare;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixSearchResult {\n");
    
    sb.append("    itineraries: ").append(StringUtil.toIndentedString(itineraries)).append("\n");
    sb.append("    fare: ").append(StringUtil.toIndentedString(fare)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
