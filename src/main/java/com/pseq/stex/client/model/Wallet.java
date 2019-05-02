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
 * Wallet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class Wallet {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("currency_id")

  private Integer currencyId = null;

  @JsonProperty("delisted")

  private Boolean delisted = null;

  @JsonProperty("disabled")

  private Boolean disabled = null;

  @JsonProperty("disable_deposits")

  private Boolean disableDeposits = null;

  @JsonProperty("currency_code")

  private String currencyCode = null;

  @JsonProperty("balance")

  private String balance = null;

  @JsonProperty("frozen_balance")

  private String frozenBalance = null;

  @JsonProperty("bonus_balance")

  private String bonusBalance = null;
  public Wallet id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "45875", description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Wallet currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  

  /**
  * Get currencyId
  * @return currencyId
  **/
  @Schema(example = "1", description = "")
  public Integer getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }
  public Wallet delisted(Boolean delisted) {
    this.delisted = delisted;
    return this;
  }

  

  /**
  * Get delisted
  * @return delisted
  **/
  @Schema(description = "")
  public Boolean isDelisted() {
    return delisted;
  }
  public void setDelisted(Boolean delisted) {
    this.delisted = delisted;
  }
  public Wallet disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  

  /**
  * Get disabled
  * @return disabled
  **/
  @Schema(description = "")
  public Boolean isDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }
  public Wallet disableDeposits(Boolean disableDeposits) {
    this.disableDeposits = disableDeposits;
    return this;
  }

  

  /**
  * Get disableDeposits
  * @return disableDeposits
  **/
  @Schema(description = "")
  public Boolean isDisableDeposits() {
    return disableDeposits;
  }
  public void setDisableDeposits(Boolean disableDeposits) {
    this.disableDeposits = disableDeposits;
  }
  public Wallet currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  

  /**
  * Get currencyCode
  * @return currencyCode
  **/
  @Schema(example = "BTC", description = "")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }
  public Wallet balance(String balance) {
    this.balance = balance;
    return this;
  }

  

  /**
  * Available balance in given currency
  * @return balance
  **/
  @Schema(example = "0.198752", description = "Available balance in given currency")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }
  public Wallet frozenBalance(String frozenBalance) {
    this.frozenBalance = frozenBalance;
    return this;
  }

  

  /**
  * Amount of coins frozen in orders
  * @return frozenBalance
  **/
  @Schema(example = "1.5784", description = "Amount of coins frozen in orders")
  public String getFrozenBalance() {
    return frozenBalance;
  }
  public void setFrozenBalance(String frozenBalance) {
    this.frozenBalance = frozenBalance;
  }
  public Wallet bonusBalance(String bonusBalance) {
    this.bonusBalance = bonusBalance;
    return this;
  }

  

  /**
  * Bonus (e.g. for affiliate program) balance
  * @return bonusBalance
  **/
  @Schema(example = "0.000", description = "Bonus (e.g. for affiliate program) balance")
  public String getBonusBalance() {
    return bonusBalance;
  }
  public void setBonusBalance(String bonusBalance) {
    this.bonusBalance = bonusBalance;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.id, wallet.id) &&
        Objects.equals(this.currencyId, wallet.currencyId) &&
        Objects.equals(this.delisted, wallet.delisted) &&
        Objects.equals(this.disabled, wallet.disabled) &&
        Objects.equals(this.disableDeposits, wallet.disableDeposits) &&
        Objects.equals(this.currencyCode, wallet.currencyCode) &&
        Objects.equals(this.balance, wallet.balance) &&
        Objects.equals(this.frozenBalance, wallet.frozenBalance) &&
        Objects.equals(this.bonusBalance, wallet.bonusBalance);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, currencyId, delisted, disabled, disableDeposits, currencyCode, balance, frozenBalance, bonusBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    delisted: ").append(toIndentedString(delisted)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    disableDeposits: ").append(toIndentedString(disableDeposits)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    frozenBalance: ").append(toIndentedString(frozenBalance)).append("\n");
    sb.append("    bonusBalance: ").append(toIndentedString(bonusBalance)).append("\n");
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
