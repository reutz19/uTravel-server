package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.TrainScheduleSearchResult;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TrainScheduleSearchResponse   {
  
  private List<TrainScheduleSearchResult> results = new ArrayList<TrainScheduleSearchResult>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<TrainScheduleSearchResult> getResults() {
    return results;
  }
  public void setResults(List<TrainScheduleSearchResult> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainScheduleSearchResponse {\n");
    
    sb.append("    results: ").append(StringUtil.toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
