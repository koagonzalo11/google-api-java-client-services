/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudchannel.v1.model;

/**
 * A Product is the entity a customer uses when placing an order. For example, Google Workspace,
 * Google Voice, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1Product extends com.google.api.client.json.GenericJson {

  /**
   * Marketing information for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1MarketingInfo marketingInfo;

  /**
   * Resource Name of the Product. Format: products/{product_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Marketing information for the product.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1MarketingInfo getMarketingInfo() {
    return marketingInfo;
  }

  /**
   * Marketing information for the product.
   * @param marketingInfo marketingInfo or {@code null} for none
   */
  public GoogleCloudChannelV1Product setMarketingInfo(GoogleCloudChannelV1MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
    return this;
  }

  /**
   * Resource Name of the Product. Format: products/{product_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource Name of the Product. Format: products/{product_id}
   * @param name name or {@code null} for none
   */
  public GoogleCloudChannelV1Product setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudChannelV1Product set(String fieldName, Object value) {
    return (GoogleCloudChannelV1Product) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1Product clone() {
    return (GoogleCloudChannelV1Product) super.clone();
  }

}
