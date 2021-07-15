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

package com.google.api.services.fcmdata.v1beta1.model;

/**
 * Message delivery data for a given date, app, and analytics label combination.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging Data API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseFcmDataV1beta1AndroidDeliveryData extends com.google.api.client.json.GenericJson {

  /**
   * The analytics label associated with the messages sent. All messages sent without an analytics
   * label will be grouped together in a single entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analyticsLabel;

  /**
   * The app ID to which the messages were sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The data for the specified appId, date, and analyticsLabel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirebaseFcmDataV1beta1Data data;

  /**
   * The date represented by this entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate date;

  /**
   * The analytics label associated with the messages sent. All messages sent without an analytics
   * label will be grouped together in a single entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalyticsLabel() {
    return analyticsLabel;
  }

  /**
   * The analytics label associated with the messages sent. All messages sent without an analytics
   * label will be grouped together in a single entry.
   * @param analyticsLabel analyticsLabel or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData setAnalyticsLabel(java.lang.String analyticsLabel) {
    this.analyticsLabel = analyticsLabel;
    return this;
  }

  /**
   * The app ID to which the messages were sent.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * The app ID to which the messages were sent.
   * @param appId appId or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The data for the specified appId, date, and analyticsLabel.
   * @return value or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1Data getData() {
    return data;
  }

  /**
   * The data for the specified appId, date, and analyticsLabel.
   * @param data data or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData setData(GoogleFirebaseFcmDataV1beta1Data data) {
    this.data = data;
    return this;
  }

  /**
   * The date represented by this entry.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getDate() {
    return date;
  }

  /**
   * The date represented by this entry.
   * @param date date or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData setDate(GoogleTypeDate date) {
    this.date = date;
    return this;
  }

  @Override
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData set(String fieldName, Object value) {
    return (GoogleFirebaseFcmDataV1beta1AndroidDeliveryData) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseFcmDataV1beta1AndroidDeliveryData clone() {
    return (GoogleFirebaseFcmDataV1beta1AndroidDeliveryData) super.clone();
  }

}
