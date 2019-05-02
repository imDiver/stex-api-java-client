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
 * Currency
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class Currency {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("code")

  private String code = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("active")

  private Boolean active = null;

  @JsonProperty("delisted")

  private Boolean delisted = null;

  @JsonProperty("precision")

  private Integer precision = null;

  @JsonProperty("minimum_withdrawal_amount")

  private String minimumWithdrawalAmount = null;

  @JsonProperty("minimum_deposit_amount")

  private String minimumDepositAmount = null;

  @JsonProperty("deposit_fee_currency_id")

  private String depositFeeCurrencyId = null;

  @JsonProperty("deposit_fee_currency_code")

  private String depositFeeCurrencyCode = null;

  @JsonProperty("deposit_fee_const")

  private String depositFeeConst = null;

  @JsonProperty("deposit_fee_percent")

  private String depositFeePercent = null;

  @JsonProperty("withdrawal_fee_currency_id")

  private Integer withdrawalFeeCurrencyId = null;

  @JsonProperty("withdrawal_fee_currency_code")

  private String withdrawalFeeCurrencyCode = null;

  @JsonProperty("withdrawal_fee_const")

  private String withdrawalFeeConst = null;

  @JsonProperty("withdrawal_fee_percent")

  private String withdrawalFeePercent = null;

  @JsonProperty("block_explorer_url")

  private String blockExplorerUrl = null;
  public Currency id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Currency ID
  * @return id
  **/
  @Schema(example = "1", description = "Currency ID")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Currency code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Currency code (short name)
  * @return code
  **/
  @Schema(example = "BTC", description = "Currency code (short name)")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Currency name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Currency full name
  * @return name
  **/
  @Schema(example = "Bitcoin", description = "Currency full name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Currency active(Boolean active) {
    this.active = active;
    return this;
  }

  

  /**
  * Currency status
  * @return active
  **/
  @Schema(description = "Currency status")
  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }
  public Currency delisted(Boolean delisted) {
    this.delisted = delisted;
    return this;
  }

  

  /**
  * Is currency delisted?
  * @return delisted
  **/
  @Schema(description = "Is currency delisted?")
  public Boolean isDelisted() {
    return delisted;
  }
  public void setDelisted(Boolean delisted) {
    this.delisted = delisted;
  }
  public Currency precision(Integer precision) {
    this.precision = precision;
    return this;
  }

  

  /**
  * The number of the digits after comma
  * @return precision
  **/
  @Schema(example = "8", description = "The number of the digits after comma")
  public Integer getPrecision() {
    return precision;
  }
  public void setPrecision(Integer precision) {
    this.precision = precision;
  }
  public Currency minimumWithdrawalAmount(String minimumWithdrawalAmount) {
    this.minimumWithdrawalAmount = minimumWithdrawalAmount;
    return this;
  }

  

  /**
  * Minimum amount that can be withdrawn
  * @return minimumWithdrawalAmount
  **/
  @Schema(example = "0.009", description = "Minimum amount that can be withdrawn")
  public String getMinimumWithdrawalAmount() {
    return minimumWithdrawalAmount;
  }
  public void setMinimumWithdrawalAmount(String minimumWithdrawalAmount) {
    this.minimumWithdrawalAmount = minimumWithdrawalAmount;
  }
  public Currency minimumDepositAmount(String minimumDepositAmount) {
    this.minimumDepositAmount = minimumDepositAmount;
    return this;
  }

  

  /**
  * Minimum amount that can be deposited
  * @return minimumDepositAmount
  **/
  @Schema(example = "0.000003", description = "Minimum amount that can be deposited")
  public String getMinimumDepositAmount() {
    return minimumDepositAmount;
  }
  public void setMinimumDepositAmount(String minimumDepositAmount) {
    this.minimumDepositAmount = minimumDepositAmount;
  }
  public Currency depositFeeCurrencyId(String depositFeeCurrencyId) {
    this.depositFeeCurrencyId = depositFeeCurrencyId;
    return this;
  }

  

  /**
  * Currency of the fee for deposit
  * @return depositFeeCurrencyId
  **/
  @Schema(example = "1", description = "Currency of the fee for deposit")
  public String getDepositFeeCurrencyId() {
    return depositFeeCurrencyId;
  }
  public void setDepositFeeCurrencyId(String depositFeeCurrencyId) {
    this.depositFeeCurrencyId = depositFeeCurrencyId;
  }
  public Currency depositFeeCurrencyCode(String depositFeeCurrencyCode) {
    this.depositFeeCurrencyCode = depositFeeCurrencyCode;
    return this;
  }

  

  /**
  * Currency code of the fee for deposit
  * @return depositFeeCurrencyCode
  **/
  @Schema(example = "ETH", description = "Currency code of the fee for deposit")
  public String getDepositFeeCurrencyCode() {
    return depositFeeCurrencyCode;
  }
  public void setDepositFeeCurrencyCode(String depositFeeCurrencyCode) {
    this.depositFeeCurrencyCode = depositFeeCurrencyCode;
  }
  public Currency depositFeeConst(String depositFeeConst) {
    this.depositFeeConst = depositFeeConst;
    return this;
  }

  

  /**
  * The fee amount that is taken for deposit (if not calculated as percent)
  * @return depositFeeConst
  **/
  @Schema(example = "0.00001", description = "The fee amount that is taken for deposit (if not calculated as percent)")
  public String getDepositFeeConst() {
    return depositFeeConst;
  }
  public void setDepositFeeConst(String depositFeeConst) {
    this.depositFeeConst = depositFeeConst;
  }
  public Currency depositFeePercent(String depositFeePercent) {
    this.depositFeePercent = depositFeePercent;
    return this;
  }

  

  /**
  * The percent that is taken as deposit fee (if not set in deposit_fee_const)
  * @return depositFeePercent
  **/
  @Schema(example = "0", description = "The percent that is taken as deposit fee (if not set in deposit_fee_const)")
  public String getDepositFeePercent() {
    return depositFeePercent;
  }
  public void setDepositFeePercent(String depositFeePercent) {
    this.depositFeePercent = depositFeePercent;
  }
  public Currency withdrawalFeeCurrencyId(Integer withdrawalFeeCurrencyId) {
    this.withdrawalFeeCurrencyId = withdrawalFeeCurrencyId;
    return this;
  }

  

  /**
  * Currency of the fee for withdrawals
  * @return withdrawalFeeCurrencyId
  **/
  @Schema(example = "1", description = "Currency of the fee for withdrawals")
  public Integer getWithdrawalFeeCurrencyId() {
    return withdrawalFeeCurrencyId;
  }
  public void setWithdrawalFeeCurrencyId(Integer withdrawalFeeCurrencyId) {
    this.withdrawalFeeCurrencyId = withdrawalFeeCurrencyId;
  }
  public Currency withdrawalFeeCurrencyCode(String withdrawalFeeCurrencyCode) {
    this.withdrawalFeeCurrencyCode = withdrawalFeeCurrencyCode;
    return this;
  }

  

  /**
  * Currency code of the fee for deposit
  * @return withdrawalFeeCurrencyCode
  **/
  @Schema(example = "ETH", description = "Currency code of the fee for deposit")
  public String getWithdrawalFeeCurrencyCode() {
    return withdrawalFeeCurrencyCode;
  }
  public void setWithdrawalFeeCurrencyCode(String withdrawalFeeCurrencyCode) {
    this.withdrawalFeeCurrencyCode = withdrawalFeeCurrencyCode;
  }
  public Currency withdrawalFeeConst(String withdrawalFeeConst) {
    this.withdrawalFeeConst = withdrawalFeeConst;
    return this;
  }

  

  /**
  * The fee amount that is taken for withdrawal (if not calculated as percent)
  * @return withdrawalFeeConst
  **/
  @Schema(example = "0.0015", description = "The fee amount that is taken for withdrawal (if not calculated as percent)")
  public String getWithdrawalFeeConst() {
    return withdrawalFeeConst;
  }
  public void setWithdrawalFeeConst(String withdrawalFeeConst) {
    this.withdrawalFeeConst = withdrawalFeeConst;
  }
  public Currency withdrawalFeePercent(String withdrawalFeePercent) {
    this.withdrawalFeePercent = withdrawalFeePercent;
    return this;
  }

  

  /**
  * The percent that is taken as withdrawal fee (if not set in deposit_fee_const)
  * @return withdrawalFeePercent
  **/
  @Schema(example = "0", description = "The percent that is taken as withdrawal fee (if not set in deposit_fee_const)")
  public String getWithdrawalFeePercent() {
    return withdrawalFeePercent;
  }
  public void setWithdrawalFeePercent(String withdrawalFeePercent) {
    this.withdrawalFeePercent = withdrawalFeePercent;
  }
  public Currency blockExplorerUrl(String blockExplorerUrl) {
    this.blockExplorerUrl = blockExplorerUrl;
    return this;
  }

  

  /**
  * Block explorer URL
  * @return blockExplorerUrl
  **/
  @Schema(example = "https://blockchain.info/tx/", description = "Block explorer URL")
  public String getBlockExplorerUrl() {
    return blockExplorerUrl;
  }
  public void setBlockExplorerUrl(String blockExplorerUrl) {
    this.blockExplorerUrl = blockExplorerUrl;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.id, currency.id) &&
        Objects.equals(this.code, currency.code) &&
        Objects.equals(this.name, currency.name) &&
        Objects.equals(this.active, currency.active) &&
        Objects.equals(this.delisted, currency.delisted) &&
        Objects.equals(this.precision, currency.precision) &&
        Objects.equals(this.minimumWithdrawalAmount, currency.minimumWithdrawalAmount) &&
        Objects.equals(this.minimumDepositAmount, currency.minimumDepositAmount) &&
        Objects.equals(this.depositFeeCurrencyId, currency.depositFeeCurrencyId) &&
        Objects.equals(this.depositFeeCurrencyCode, currency.depositFeeCurrencyCode) &&
        Objects.equals(this.depositFeeConst, currency.depositFeeConst) &&
        Objects.equals(this.depositFeePercent, currency.depositFeePercent) &&
        Objects.equals(this.withdrawalFeeCurrencyId, currency.withdrawalFeeCurrencyId) &&
        Objects.equals(this.withdrawalFeeCurrencyCode, currency.withdrawalFeeCurrencyCode) &&
        Objects.equals(this.withdrawalFeeConst, currency.withdrawalFeeConst) &&
        Objects.equals(this.withdrawalFeePercent, currency.withdrawalFeePercent) &&
        Objects.equals(this.blockExplorerUrl, currency.blockExplorerUrl);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, code, name, active, delisted, precision, minimumWithdrawalAmount, minimumDepositAmount, depositFeeCurrencyId, depositFeeCurrencyCode, depositFeeConst, depositFeePercent, withdrawalFeeCurrencyId, withdrawalFeeCurrencyCode, withdrawalFeeConst, withdrawalFeePercent, blockExplorerUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    delisted: ").append(toIndentedString(delisted)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    minimumWithdrawalAmount: ").append(toIndentedString(minimumWithdrawalAmount)).append("\n");
    sb.append("    minimumDepositAmount: ").append(toIndentedString(minimumDepositAmount)).append("\n");
    sb.append("    depositFeeCurrencyId: ").append(toIndentedString(depositFeeCurrencyId)).append("\n");
    sb.append("    depositFeeCurrencyCode: ").append(toIndentedString(depositFeeCurrencyCode)).append("\n");
    sb.append("    depositFeeConst: ").append(toIndentedString(depositFeeConst)).append("\n");
    sb.append("    depositFeePercent: ").append(toIndentedString(depositFeePercent)).append("\n");
    sb.append("    withdrawalFeeCurrencyId: ").append(toIndentedString(withdrawalFeeCurrencyId)).append("\n");
    sb.append("    withdrawalFeeCurrencyCode: ").append(toIndentedString(withdrawalFeeCurrencyCode)).append("\n");
    sb.append("    withdrawalFeeConst: ").append(toIndentedString(withdrawalFeeConst)).append("\n");
    sb.append("    withdrawalFeePercent: ").append(toIndentedString(withdrawalFeePercent)).append("\n");
    sb.append("    blockExplorerUrl: ").append(toIndentedString(blockExplorerUrl)).append("\n");
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
