package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.LowFareSearchResult;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class LowFareSearchResponse   {
  
  private String currency = null;
  private List<LowFareSearchResult> results = new ArrayList<LowFareSearchResult>();

  
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
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<LowFareSearchResult> getResults() {
    return results;
  }
  public void setResults(List<LowFareSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowFareSearchResponse {\n");
    
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
