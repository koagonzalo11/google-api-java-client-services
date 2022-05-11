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

package com.google.api.services.androidpublisher.model;

/**
 * Item-level info for a subscription purchase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionPurchaseLineItem extends com.google.api.client.json.GenericJson {

  /**
   * The item is auto renewing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoRenewingPlan autoRenewingPlan;

  /**
   * Time at which the subscription expired or will expire unless the access is extended (ex.
   * renews).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expiryTime;

  /**
   * The item is prepaid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrepaidPlan prepaidPlan;

  /**
   * The purchased product ID (for example, 'monthly001').
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The item is auto renewing.
   * @return value or {@code null} for none
   */
  public AutoRenewingPlan getAutoRenewingPlan() {
    return autoRenewingPlan;
  }

  /**
   * The item is auto renewing.
   * @param autoRenewingPlan autoRenewingPlan or {@code null} for none
   */
  public SubscriptionPurchaseLineItem setAutoRenewingPlan(AutoRenewingPlan autoRenewingPlan) {
    this.autoRenewingPlan = autoRenewingPlan;
    return this;
  }

  /**
   * Time at which the subscription expired or will expire unless the access is extended (ex.
   * renews).
   * @return value or {@code null} for none
   */
  public String getExpiryTime() {
    return expiryTime;
  }

  /**
   * Time at which the subscription expired or will expire unless the access is extended (ex.
   * renews).
   * @param expiryTime expiryTime or {@code null} for none
   */
  public SubscriptionPurchaseLineItem setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * The item is prepaid.
   * @return value or {@code null} for none
   */
  public PrepaidPlan getPrepaidPlan() {
    return prepaidPlan;
  }

  /**
   * The item is prepaid.
   * @param prepaidPlan prepaidPlan or {@code null} for none
   */
  public SubscriptionPurchaseLineItem setPrepaidPlan(PrepaidPlan prepaidPlan) {
    this.prepaidPlan = prepaidPlan;
    return this;
  }

  /**
   * The purchased product ID (for example, 'monthly001').
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The purchased product ID (for example, 'monthly001').
   * @param productId productId or {@code null} for none
   */
  public SubscriptionPurchaseLineItem setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public SubscriptionPurchaseLineItem set(String fieldName, Object value) {
    return (SubscriptionPurchaseLineItem) super.set(fieldName, value);
  }

  @Override
  public SubscriptionPurchaseLineItem clone() {
    return (SubscriptionPurchaseLineItem) super.clone();
  }

}
