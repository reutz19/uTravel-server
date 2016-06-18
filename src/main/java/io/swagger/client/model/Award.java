package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Award   {
  
  private String provider = null;
  private String rating = null;

  
  /**
   * The organization that issued the award. For example:. Local Star Rating, AAA.
   **/
  @ApiModelProperty(required = true, value = "The organization that issued the award. For example:. Local Star Rating, AAA.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The level of the award that was awarded on the provider's scale. For example: 4 or RECOMMENDED.
   **/
  @ApiModelProperty(required = true, value = "The level of the award that was awarded on the provider's scale. For example: 4 or RECOMMENDED.")
  @JsonProperty("rating")
  public String getRating() {
    return rating;
  }
  public void setRating(String rating) {
    this.rating = rating;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Award {\n");
    
    sb.append("    provider: ").append(StringUtil.toIndentedString(provider)).append("\n");
    sb.append("    rating: ").append(StringUtil.toIndentedString(rating)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
