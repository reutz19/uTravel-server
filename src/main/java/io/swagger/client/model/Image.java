package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Image   {
  
  private String category = null;
  private Integer width = null;
  private Integer height = null;
  private String url = null;

  
  /**
   * The enumerated category of this image type. Common values include EXTERIOR, GUEST_ROOM, SUITE, LOBBY, RESTAURANT, LOUNGE, LOGO, MAP, MISC and UNKNOWN.
   **/
  @ApiModelProperty(value = "The enumerated category of this image type. Common values include EXTERIOR, GUEST_ROOM, SUITE, LOBBY, RESTAURANT, LOUNGE, LOGO, MAP, MISC and UNKNOWN.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * The pixel width of the image at the provided URL.
   **/
  @ApiModelProperty(value = "The pixel width of the image at the provided URL.")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * The pixel height of the image at the provided URL.
   **/
  @ApiModelProperty(value = "The pixel height of the image at the provided URL.")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   * The URL of the hotel image of this given category and size, for display.
   **/
  @ApiModelProperty(required = true, value = "The URL of the hotel image of this given category and size, for display.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
