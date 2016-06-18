package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.TopDestinationsSearchResult;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TopDestinationsSearchResponse   {
  
  private String period = null;
  private String origin = null;
  private List<TopDestinationsSearchResult> results = new ArrayList<TopDestinationsSearchResult>();

  
  /**
   * The date period, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format YYYY-MM or YYYY
   **/
  @ApiModelProperty(required = true, value = "The date period, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date format YYYY-MM or YYYY")
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  
  /**
   * IATA code
   **/
  @ApiModelProperty(required = true, value = "IATA code")
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("results")
  public List<TopDestinationsSearchResult> getResults() {
    return results;
  }
  public void setResults(List<TopDestinationsSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopDestinationsSearchResponse {\n");
    
    sb.append("    period: ").append(StringUtil.toIndentedString(period)).append("\n");
    sb.append("    origin: ").append(StringUtil.toIndentedString(origin)).append("\n");
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
