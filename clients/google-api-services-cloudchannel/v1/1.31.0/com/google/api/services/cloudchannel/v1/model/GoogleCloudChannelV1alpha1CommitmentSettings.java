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
 * Commitment settings for commitment-based offers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1alpha1CommitmentSettings extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Commitment end timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1alpha1RenewalSettings renewalSettings;

  /**
   * Output only. Commitment start timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. Commitment end timestamp.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Commitment end timestamp.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1CommitmentSettings setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1RenewalSettings getRenewalSettings() {
    return renewalSettings;
  }

  /**
   * Optional. Renewal settings applicable for a commitment-based Offer.
   * @param renewalSettings renewalSettings or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1CommitmentSettings setRenewalSettings(GoogleCloudChannelV1alpha1RenewalSettings renewalSettings) {
    this.renewalSettings = renewalSettings;
    return this;
  }

  /**
   * Output only. Commitment start timestamp.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Commitment start timestamp.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1CommitmentSettings setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudChannelV1alpha1CommitmentSettings set(String fieldName, Object value) {
    return (GoogleCloudChannelV1alpha1CommitmentSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1alpha1CommitmentSettings clone() {
    return (GoogleCloudChannelV1alpha1CommitmentSettings) super.clone();
  }

}
