package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.ExtremeSearchResult;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class ExtremeSearchResponse   {
  
  private String origin = null;
  private String currency = null;
  private List<ExtremeSearchResult> results = new ArrayList<ExtremeSearchResult>();

  
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
   * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
   **/
  @ApiModelProperty(required = true, value = "[ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("results")
  public List<ExtremeSearchResult> getResults() {
    return results;
  }
  public void setResults(List<ExtremeSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtremeSearchResponse {\n");
    
    sb.append("    origin: ").append(StringUtil.toIndentedString(origin)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
