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
import com.pseq.stex.client.model.OrderbookAsk;
import com.pseq.stex.client.model.OrderbookBid;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Orderbook
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class Orderbook {

  @JsonProperty("ask")

  private List<OrderbookAsk> ask = null;

  @JsonProperty("bid")

  private List<OrderbookBid> bid = null;

  @JsonProperty("timestamp")

  private Integer timestamp = null;
  public Orderbook ask(List<OrderbookAsk> ask) {
    this.ask = ask;
    return this;
  }

  public Orderbook addAskItem(OrderbookAsk askItem) {
    if (this.ask == null) {
      this.ask = new ArrayList<OrderbookAsk>();
    }
    this.ask.add(askItem);
    return this;
  }

  /**
  * Get ask
  * @return ask
  **/
  @Schema(description = "")
  public List<OrderbookAsk> getAsk() {
    return ask;
  }
  public void setAsk(List<OrderbookAsk> ask) {
    this.ask = ask;
  }
  public Orderbook bid(List<OrderbookBid> bid) {
    this.bid = bid;
    return this;
  }

  public Orderbook addBidItem(OrderbookBid bidItem) {
    if (this.bid == null) {
      this.bid = new ArrayList<OrderbookBid>();
    }
    this.bid.add(bidItem);
    return this;
  }

  /**
  * Get bid
  * @return bid
  **/
  @Schema(description = "")
  public List<OrderbookBid> getBid() {
    return bid;
  }
  public void setBid(List<OrderbookBid> bid) {
    this.bid = bid;
  }
  public Orderbook timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  

  /**
  * Get timestamp
  * @return timestamp
  **/
  @Schema(example = "1538737692", description = "")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orderbook orderbook = (Orderbook) o;
    return Objects.equals(this.ask, orderbook.ask) &&
        Objects.equals(this.bid, orderbook.bid) &&
        Objects.equals(this.timestamp, orderbook.timestamp);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(ask, bid, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orderbook {\n");
    
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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