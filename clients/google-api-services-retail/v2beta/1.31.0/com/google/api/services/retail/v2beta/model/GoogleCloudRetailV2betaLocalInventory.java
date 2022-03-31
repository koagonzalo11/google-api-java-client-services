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

package com.google.api.services.retail.v2beta.model;

/**
 * The inventory information at a place (e.g. a store) identified by a place ID.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaLocalInventory extends com.google.api.client.json.GenericJson {

  /**
   * Additional local inventory attributes, for example, store name, promotion tags, etc. This field
   * needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * At most 30
   * attributes are allowed. * The key must be a UTF-8 encoded string with a length limit of 32
   * characters. * The key must match the pattern: `a-zA-Z0-9*`. For example, key0LikeThis or
   * KEY_1_LIKE_THIS. * The attribute values must be of the same type (text or number). * Only 1
   * value is allowed for each attribute. * For text values, the length limit is 256 UTF-8
   * characters. * The attribute does not support search. The `searchable` field should be unset or
   * set to false. * The max summed total bytes of custom attribute keys and values per product is
   * 5MiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2betaCustomAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2betaCustomAttribute.class);
  }

  /**
   * Input only. Supported fulfillment types. Valid fulfillment type values include commonly used
   * types (such as pickup in store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI. Supported values: * "pickup-in-store"
   * * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-
   * type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an
   * invalid value other than these, an INVALID_ARGUMENT error is returned. All the elements must be
   * distinct. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fulfillmentTypes;

  /**
   * The place ID for the current set of inventory information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placeId;

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaPriceInfo priceInfo;

  /**
   * Additional local inventory attributes, for example, store name, promotion tags, etc. This field
   * needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * At most 30
   * attributes are allowed. * The key must be a UTF-8 encoded string with a length limit of 32
   * characters. * The key must match the pattern: `a-zA-Z0-9*`. For example, key0LikeThis or
   * KEY_1_LIKE_THIS. * The attribute values must be of the same type (text or number). * Only 1
   * value is allowed for each attribute. * For text values, the length limit is 256 UTF-8
   * characters. * The attribute does not support search. The `searchable` field should be unset or
   * set to false. * The max summed total bytes of custom attribute keys and values per product is
   * 5MiB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Additional local inventory attributes, for example, store name, promotion tags, etc. This field
   * needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * At most 30
   * attributes are allowed. * The key must be a UTF-8 encoded string with a length limit of 32
   * characters. * The key must match the pattern: `a-zA-Z0-9*`. For example, key0LikeThis or
   * KEY_1_LIKE_THIS. * The attribute values must be of the same type (text or number). * Only 1
   * value is allowed for each attribute. * For text values, the length limit is 256 UTF-8
   * characters. * The attribute does not support search. The `searchable` field should be unset or
   * set to false. * The max summed total bytes of custom attribute keys and values per product is
   * 5MiB.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudRetailV2betaLocalInventory setAttributes(java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Input only. Supported fulfillment types. Valid fulfillment type values include commonly used
   * types (such as pickup in store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI. Supported values: * "pickup-in-store"
   * * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-
   * type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an
   * invalid value other than these, an INVALID_ARGUMENT error is returned. All the elements must be
   * distinct. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFulfillmentTypes() {
    return fulfillmentTypes;
  }

  /**
   * Input only. Supported fulfillment types. Valid fulfillment type values include commonly used
   * types (such as pickup in store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI. Supported values: * "pickup-in-store"
   * * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-
   * type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an
   * invalid value other than these, an INVALID_ARGUMENT error is returned. All the elements must be
   * distinct. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param fulfillmentTypes fulfillmentTypes or {@code null} for none
   */
  public GoogleCloudRetailV2betaLocalInventory setFulfillmentTypes(java.util.List<java.lang.String> fulfillmentTypes) {
    this.fulfillmentTypes = fulfillmentTypes;
    return this;
  }

  /**
   * The place ID for the current set of inventory information.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaceId() {
    return placeId;
  }

  /**
   * The place ID for the current set of inventory information.
   * @param placeId placeId or {@code null} for none
   */
  public GoogleCloudRetailV2betaLocalInventory setPlaceId(java.lang.String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaPriceInfo getPriceInfo() {
    return priceInfo;
  }

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * @param priceInfo priceInfo or {@code null} for none
   */
  public GoogleCloudRetailV2betaLocalInventory setPriceInfo(GoogleCloudRetailV2betaPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaLocalInventory set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaLocalInventory) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaLocalInventory clone() {
    return (GoogleCloudRetailV2betaLocalInventory) super.clone();
  }

}
