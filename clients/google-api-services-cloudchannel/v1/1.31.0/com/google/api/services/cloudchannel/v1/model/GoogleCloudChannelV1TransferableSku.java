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
 * TransferableSku represents information a reseller needs to view existing provisioned services for
 * a customer that they do not own. Read-only.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1TransferableSku extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The customer to transfer has an entitlement with the populated legacy SKU.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Sku legacySku;

  /**
   * The SKU pertaining to the provisioning resource as specified in the Offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Sku sku;

  /**
   * Describes the transfer eligibility of a SKU.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1TransferEligibility transferEligibility;

  /**
   * Optional. The customer to transfer has an entitlement with the populated legacy SKU.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Sku getLegacySku() {
    return legacySku;
  }

  /**
   * Optional. The customer to transfer has an entitlement with the populated legacy SKU.
   * @param legacySku legacySku or {@code null} for none
   */
  public GoogleCloudChannelV1TransferableSku setLegacySku(GoogleCloudChannelV1Sku legacySku) {
    this.legacySku = legacySku;
    return this;
  }

  /**
   * The SKU pertaining to the provisioning resource as specified in the Offer.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Sku getSku() {
    return sku;
  }

  /**
   * The SKU pertaining to the provisioning resource as specified in the Offer.
   * @param sku sku or {@code null} for none
   */
  public GoogleCloudChannelV1TransferableSku setSku(GoogleCloudChannelV1Sku sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Describes the transfer eligibility of a SKU.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1TransferEligibility getTransferEligibility() {
    return transferEligibility;
  }

  /**
   * Describes the transfer eligibility of a SKU.
   * @param transferEligibility transferEligibility or {@code null} for none
   */
  public GoogleCloudChannelV1TransferableSku setTransferEligibility(GoogleCloudChannelV1TransferEligibility transferEligibility) {
    this.transferEligibility = transferEligibility;
    return this;
  }

  @Override
  public GoogleCloudChannelV1TransferableSku set(String fieldName, Object value) {
    return (GoogleCloudChannelV1TransferableSku) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1TransferableSku clone() {
    return (GoogleCloudChannelV1TransferableSku) super.clone();
  }

}
