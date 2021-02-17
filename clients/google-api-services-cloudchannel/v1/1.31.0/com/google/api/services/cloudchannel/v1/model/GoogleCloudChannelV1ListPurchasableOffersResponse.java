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
 * Response message for ListPurchasableOffers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ListPurchasableOffersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of Offers requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1PurchasableOffer> purchasableOffers;

  /**
   * A token to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudChannelV1ListPurchasableOffersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of Offers requested.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1PurchasableOffer> getPurchasableOffers() {
    return purchasableOffers;
  }

  /**
   * The list of Offers requested.
   * @param purchasableOffers purchasableOffers or {@code null} for none
   */
  public GoogleCloudChannelV1ListPurchasableOffersResponse setPurchasableOffers(java.util.List<GoogleCloudChannelV1PurchasableOffer> purchasableOffers) {
    this.purchasableOffers = purchasableOffers;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ListPurchasableOffersResponse set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ListPurchasableOffersResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ListPurchasableOffersResponse clone() {
    return (GoogleCloudChannelV1ListPurchasableOffersResponse) super.clone();
  }

}
