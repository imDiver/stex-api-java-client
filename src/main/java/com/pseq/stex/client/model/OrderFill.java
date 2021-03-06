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
import java.math.BigDecimal;

/**
 * OrderFill
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class OrderFill {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("buy_order_id")

  private Integer buyOrderId = null;

  @JsonProperty("sell_order_id")

  private Integer sellOrderId = null;

  @JsonProperty("price")

  private BigDecimal price = null;

  @JsonProperty("amount")

  private BigDecimal amount = null;
  /**
   * trade type BUY or SELL
   */
  public enum TradeTypeEnum {
    BUY("BUY"),
    SELL("SELL");

    private String value;

    TradeTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TradeTypeEnum fromValue(String text) {
      for (TradeTypeEnum b : TradeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("trade_type")

  private TradeTypeEnum tradeType = null;

  @JsonProperty("timestamp")

  private Integer timestamp = null;
  public OrderFill id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "658745", description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public OrderFill buyOrderId(Integer buyOrderId) {
    this.buyOrderId = buyOrderId;
    return this;
  }

  

  /**
  * Get buyOrderId
  * @return buyOrderId
  **/
  @Schema(example = "6587453", description = "")
  public Integer getBuyOrderId() {
    return buyOrderId;
  }
  public void setBuyOrderId(Integer buyOrderId) {
    this.buyOrderId = buyOrderId;
  }
  public OrderFill sellOrderId(Integer sellOrderId) {
    this.sellOrderId = sellOrderId;
    return this;
  }

  

  /**
  * Get sellOrderId
  * @return sellOrderId
  **/
  @Schema(example = "6587459", description = "")
  public Integer getSellOrderId() {
    return sellOrderId;
  }
  public void setSellOrderId(Integer sellOrderId) {
    this.sellOrderId = sellOrderId;
  }
  public OrderFill price(BigDecimal price) {
    this.price = price;
    return this;
  }

  

  /**
  * Get price
  * @return price
  **/
  @Schema(example = "0.012285", description = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  public OrderFill amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  

  /**
  * Get amount
  * @return amount
  **/
  @Schema(example = "6.35", description = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  public OrderFill tradeType(TradeTypeEnum tradeType) {
    this.tradeType = tradeType;
    return this;
  }

  

  /**
  * trade type BUY or SELL
  * @return tradeType
  **/
  @Schema(example = "SELL", description = "trade type BUY or SELL")
  public TradeTypeEnum getTradeType() {
    return tradeType;
  }
  public void setTradeType(TradeTypeEnum tradeType) {
    this.tradeType = tradeType;
  }
  public OrderFill timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  

  /**
  * Get timestamp
  * @return timestamp
  **/
  @Schema(example = "1538737692000", description = "")
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
    OrderFill orderFill = (OrderFill) o;
    return Objects.equals(this.id, orderFill.id) &&
        Objects.equals(this.buyOrderId, orderFill.buyOrderId) &&
        Objects.equals(this.sellOrderId, orderFill.sellOrderId) &&
        Objects.equals(this.price, orderFill.price) &&
        Objects.equals(this.amount, orderFill.amount) &&
        Objects.equals(this.tradeType, orderFill.tradeType) &&
        Objects.equals(this.timestamp, orderFill.timestamp);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, buyOrderId, sellOrderId, price, amount, tradeType, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFill {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buyOrderId: ").append(toIndentedString(buyOrderId)).append("\n");
    sb.append("    sellOrderId: ").append(toIndentedString(sellOrderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
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
