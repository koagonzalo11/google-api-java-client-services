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
 * Represents information which resellers will get as part of notification from Cloud Pub/Sub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1SubscriberEvent extends com.google.api.client.json.GenericJson {

  /**
   * Customer event send as part of Pub/Sub event to partners.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1CustomerEvent customerEvent;

  /**
   * Entitlement event send as part of Pub/Sub event to partners.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1EntitlementEvent entitlementEvent;

  /**
   * Customer event send as part of Pub/Sub event to partners.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1CustomerEvent getCustomerEvent() {
    return customerEvent;
  }

  /**
   * Customer event send as part of Pub/Sub event to partners.
   * @param customerEvent customerEvent or {@code null} for none
   */
  public GoogleCloudChannelV1SubscriberEvent setCustomerEvent(GoogleCloudChannelV1CustomerEvent customerEvent) {
    this.customerEvent = customerEvent;
    return this;
  }

  /**
   * Entitlement event send as part of Pub/Sub event to partners.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1EntitlementEvent getEntitlementEvent() {
    return entitlementEvent;
  }

  /**
   * Entitlement event send as part of Pub/Sub event to partners.
   * @param entitlementEvent entitlementEvent or {@code null} for none
   */
  public GoogleCloudChannelV1SubscriberEvent setEntitlementEvent(GoogleCloudChannelV1EntitlementEvent entitlementEvent) {
    this.entitlementEvent = entitlementEvent;
    return this;
  }

  @Override
  public GoogleCloudChannelV1SubscriberEvent set(String fieldName, Object value) {
    return (GoogleCloudChannelV1SubscriberEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1SubscriberEvent clone() {
    return (GoogleCloudChannelV1SubscriberEvent) super.clone();
  }

}
