package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.AffiliateSearchMeta;
import io.swagger.client.model.AffiliateSearchResult;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class AffiliateSearchResponse   {
  
  private AffiliateSearchMeta meta = null;
  private List<AffiliateSearchResult> results = new ArrayList<AffiliateSearchResult>();

  
  /**
   * Meta data about the results
   **/
  @ApiModelProperty(required = true, value = "Meta data about the results")
  @JsonProperty("meta")
  public AffiliateSearchMeta getMeta() {
    return meta;
  }
  public void setMeta(AffiliateSearchMeta meta) {
    this.meta = meta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<AffiliateSearchResult> getResults() {
    return results;
  }
  public void setResults(List<AffiliateSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliateSearchResponse {\n");
    
    sb.append("    meta: ").append(StringUtil.toIndentedString(meta)).append("\n");
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
