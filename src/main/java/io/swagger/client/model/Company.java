package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class Company   {
  
  private String companyCode = null;
  private String companyName = null;

  
  /**
   * The Amadeus 2-character company code of this provider.
   **/
  @ApiModelProperty(required = true, value = "The Amadeus 2-character company code of this provider.")
  @JsonProperty("company_code")
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  
  /**
   * The long name of the provider corresponding to the above code.
   **/
  @ApiModelProperty(required = true, value = "The long name of the provider corresponding to the above code.")
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    companyCode: ").append(StringUtil.toIndentedString(companyCode)).append("\n");
    sb.append("    companyName: ").append(StringUtil.toIndentedString(companyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
