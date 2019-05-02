/*
 * stex.com rest API description
 * This is API you can use to connect your application to stex.com exchange and utilize all available features. All requests should go to the https://api3.stex.com followed by the one of the endpoint described below. The enpoints placed inside the /public section do not require authentication, all others requests should be authenticated with credentials you can get in your profile at https://app.stex.com/en/profile We also have a web-socket API present that has a number of advantages and is recommended way to connect to get the updates of the trading information To test API using this tool, please specify https://apidocs.stex.com/oauth2-redirect.html as Redirect URL in your API v3 client at https://app.stex.com/en/profile/settings 
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.pseq.stex.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Candle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class Candle {

  @JsonProperty("time")

  private Integer time = null;

  @JsonProperty("open")

  private String open = null;

  @JsonProperty("close")

  private String close = null;

  @JsonProperty("low")

  private String low = null;

  @JsonProperty("high")

  private String high = null;

  @JsonProperty("volume")

  private String volume = null;
  public Candle time(Integer time) {
    this.time = time;
    return this;
  }

  

  /**
  * Timestamp in milliseconds
  * @return time
  **/
  @Schema(example = "1538737692000", description = "Timestamp in milliseconds")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }
  public Candle open(String open) {
    this.open = open;
    return this;
  }

  

  /**
  * Candle open price
  * @return open
  **/
  @Schema(example = "0.012285", description = "Candle open price")
  public String getOpen() {
    return open;
  }
  public void setOpen(String open) {
    this.open = open;
  }
  public Candle close(String close) {
    this.close = close;
    return this;
  }

  

  /**
  * Candle close price
  * @return close
  **/
  @Schema(example = "0.022276", description = "Candle close price")
  public String getClose() {
    return close;
  }
  public void setClose(String close) {
    this.close = close;
  }
  public Candle low(String low) {
    this.low = low;
    return this;
  }

  

  /**
  * Candle lowest price
  * @return low
  **/
  @Schema(example = "0.002276", description = "Candle lowest price")
  public String getLow() {
    return low;
  }
  public void setLow(String low) {
    this.low = low;
  }
  public Candle high(String high) {
    this.high = high;
    return this;
  }

  

  /**
  * Candle highest price
  * @return high
  **/
  @Schema(example = "0.032276", description = "Candle highest price")
  public String getHigh() {
    return high;
  }
  public void setHigh(String high) {
    this.high = high;
  }
  public Candle volume(String volume) {
    this.volume = volume;
    return this;
  }

  

  /**
  * Tradig voume during candle period
  * @return volume
  **/
  @Schema(example = "6.456001", description = "Tradig voume during candle period")
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candle candle = (Candle) o;
    return Objects.equals(this.time, candle.time) &&
        Objects.equals(this.open, candle.open) &&
        Objects.equals(this.close, candle.close) &&
        Objects.equals(this.low, candle.low) &&
        Objects.equals(this.high, candle.high) &&
        Objects.equals(this.volume, candle.volume);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(time, open, close, low, high, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candle {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
