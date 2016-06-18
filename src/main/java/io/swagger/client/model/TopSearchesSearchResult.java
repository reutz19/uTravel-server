package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class TopSearchesSearchResult   {
  
  private String destination = null;
  private Integer searches = null;
  private Integer searchesPriorYear = null;

  
  /**
   * The IATA code of the city or airport to which the traveler may go, from the provided origin
   **/
  @ApiModelProperty(required = true, value = "The IATA code of the city or airport to which the traveler may go, from the provided origin")
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  
  /**
   * Average number of daily searches for the destination during the search period provided
   **/
  @ApiModelProperty(required = true, value = "Average number of daily searches for the destination during the search period provided")
  @JsonProperty("searches")
  public Integer getSearches() {
    return searches;
  }
  public void setSearches(Integer searches) {
    this.searches = searches;
  }

  
  /**
   * Prior year average number of daily searches for the destination during the search period provided
   **/
  @ApiModelProperty(required = true, value = "Prior year average number of daily searches for the destination during the search period provided")
  @JsonProperty("searches_prior_year")
  public Integer getSearchesPriorYear() {
    return searchesPriorYear;
  }
  public void setSearchesPriorYear(Integer searchesPriorYear) {
    this.searchesPriorYear = searchesPriorYear;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopSearchesSearchResult {\n");
    
    sb.append("    destination: ").append(StringUtil.toIndentedString(destination)).append("\n");
    sb.append("    searches: ").append(StringUtil.toIndentedString(searches)).append("\n");
    sb.append("    searchesPriorYear: ").append(StringUtil.toIndentedString(searchesPriorYear)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
