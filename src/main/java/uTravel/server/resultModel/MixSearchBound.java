package uTravel.server.resultModel;

import io.swagger.client.StringUtil;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class MixSearchBound   {
  
  private List<MixSearchSegment> segments = new ArrayList<MixSearchSegment>();
  private String duration = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Segments")
  public List<MixSearchSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<MixSearchSegment> segments) {
    this.segments = segments;
  }
  
  public void addSegment(MixSearchSegment segment) {
	    this.segments.add(segment);
  }
  
  /**
   * The duration of this bound, including layover time, expressed in the format hh:mm
   **/
  @ApiModelProperty(value = "The duration of this bound, including layover time, expressed in the format hh:mm")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixSearchBound {\n");
    
    sb.append("    flights: ").append(StringUtil.toIndentedString(segments)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
