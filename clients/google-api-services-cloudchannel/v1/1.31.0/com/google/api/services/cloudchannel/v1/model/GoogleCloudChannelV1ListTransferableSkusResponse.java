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
 * Response message for CloudChannelService.ListTransferableSkus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ListTransferableSkusResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve the next page of results. Pass to ListTransferableSkusRequest.page_token to
   * obtain that page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Information about existing SKUs for a customer that would need to be transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1TransferableSku> transferableSkus;

  /**
   * A token to retrieve the next page of results. Pass to ListTransferableSkusRequest.page_token to
   * obtain that page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. Pass to ListTransferableSkusRequest.page_token to
   * obtain that page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Information about existing SKUs for a customer that would need to be transferred.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1TransferableSku> getTransferableSkus() {
    return transferableSkus;
  }

  /**
   * Information about existing SKUs for a customer that would need to be transferred.
   * @param transferableSkus transferableSkus or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusResponse setTransferableSkus(java.util.List<GoogleCloudChannelV1TransferableSku> transferableSkus) {
    this.transferableSkus = transferableSkus;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ListTransferableSkusResponse set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ListTransferableSkusResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ListTransferableSkusResponse clone() {
    return (GoogleCloudChannelV1ListTransferableSkusResponse) super.clone();
  }

}
