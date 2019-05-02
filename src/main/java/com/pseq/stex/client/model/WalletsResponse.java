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
import com.pseq.stex.client.model.Wallet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * WalletsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class WalletsResponse {

  @JsonProperty("success")

  private Boolean success = null;

  @JsonProperty("data")

  private List<Wallet> data = null;
  public WalletsResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  

  /**
  * Get success
  * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  public WalletsResponse data(List<Wallet> data) {
    this.data = data;
    return this;
  }

  public WalletsResponse addDataItem(Wallet dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Wallet>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
  * Get data
  * @return data
  **/
  @Schema(description = "")
  public List<Wallet> getData() {
    return data;
  }
  public void setData(List<Wallet> data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletsResponse walletsResponse = (WalletsResponse) o;
    return Objects.equals(this.success, walletsResponse.success) &&
        Objects.equals(this.data, walletsResponse.data);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(success, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletsResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
