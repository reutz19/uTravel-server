package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.HashMap;
import io.swagger.client.model.CarrierInfo;
import java.util.Map;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class CarrierMeta extends HashMap<String, CarrierInfo>  {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierMeta {\n");
    sb.append("    ").append(StringUtil.toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
