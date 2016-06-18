package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CarSearchResult;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarSearchResponse   {
  
  private List<CarSearchResult> results = new ArrayList<CarSearchResult>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<CarSearchResult> getResults() {
    return results;
  }
  public void setResults(List<CarSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarSearchResponse {\n");
    
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
