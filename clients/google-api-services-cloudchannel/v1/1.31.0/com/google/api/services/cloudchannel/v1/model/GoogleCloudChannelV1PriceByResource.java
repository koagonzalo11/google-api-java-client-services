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
 * Represents price by resource type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1PriceByResource extends com.google.api.client.json.GenericJson {

  /**
   * Price of the Offer. Present if there are no price phases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Price price;

  /**
   * Specifies the price by time range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1PricePhase> pricePhases;

  /**
   * Resource Type. Example: SEAT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Price of the Offer. Present if there are no price phases.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Price getPrice() {
    return price;
  }

  /**
   * Price of the Offer. Present if there are no price phases.
   * @param price price or {@code null} for none
   */
  public GoogleCloudChannelV1PriceByResource setPrice(GoogleCloudChannelV1Price price) {
    this.price = price;
    return this;
  }

  /**
   * Specifies the price by time range.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1PricePhase> getPricePhases() {
    return pricePhases;
  }

  /**
   * Specifies the price by time range.
   * @param pricePhases pricePhases or {@code null} for none
   */
  public GoogleCloudChannelV1PriceByResource setPricePhases(java.util.List<GoogleCloudChannelV1PricePhase> pricePhases) {
    this.pricePhases = pricePhases;
    return this;
  }

  /**
   * Resource Type. Example: SEAT
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Resource Type. Example: SEAT
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleCloudChannelV1PriceByResource setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public GoogleCloudChannelV1PriceByResource set(String fieldName, Object value) {
    return (GoogleCloudChannelV1PriceByResource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1PriceByResource clone() {
    return (GoogleCloudChannelV1PriceByResource) super.clone();
  }

}
