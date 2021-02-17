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
 * The payment plan for the Offer. Describes how to make a payment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1Plan extends com.google.api.client.json.GenericJson {

  /**
   * Describes how frequently the reseller will be billed, such as once per month.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Period paymentCycle;

  /**
   * Describes how a reseller will be billed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentPlan;

  /**
   * Specifies when the payment needs to happen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentType;

  /**
   * Present for Offers with a trial period. For trial-only Offers, a paid service needs to start
   * before the trial period ends for continued service. For Regular Offers with a trial period, the
   * regular pricing goes into effect when trial period ends, or if paid service is started before
   * the end of the trial period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Period trialPeriod;

  /**
   * Describes how frequently the reseller will be billed, such as once per month.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Period getPaymentCycle() {
    return paymentCycle;
  }

  /**
   * Describes how frequently the reseller will be billed, such as once per month.
   * @param paymentCycle paymentCycle or {@code null} for none
   */
  public GoogleCloudChannelV1Plan setPaymentCycle(GoogleCloudChannelV1Period paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

  /**
   * Describes how a reseller will be billed.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentPlan() {
    return paymentPlan;
  }

  /**
   * Describes how a reseller will be billed.
   * @param paymentPlan paymentPlan or {@code null} for none
   */
  public GoogleCloudChannelV1Plan setPaymentPlan(java.lang.String paymentPlan) {
    this.paymentPlan = paymentPlan;
    return this;
  }

  /**
   * Specifies when the payment needs to happen.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentType() {
    return paymentType;
  }

  /**
   * Specifies when the payment needs to happen.
   * @param paymentType paymentType or {@code null} for none
   */
  public GoogleCloudChannelV1Plan setPaymentType(java.lang.String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Present for Offers with a trial period. For trial-only Offers, a paid service needs to start
   * before the trial period ends for continued service. For Regular Offers with a trial period, the
   * regular pricing goes into effect when trial period ends, or if paid service is started before
   * the end of the trial period.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Period getTrialPeriod() {
    return trialPeriod;
  }

  /**
   * Present for Offers with a trial period. For trial-only Offers, a paid service needs to start
   * before the trial period ends for continued service. For Regular Offers with a trial period, the
   * regular pricing goes into effect when trial period ends, or if paid service is started before
   * the end of the trial period.
   * @param trialPeriod trialPeriod or {@code null} for none
   */
  public GoogleCloudChannelV1Plan setTrialPeriod(GoogleCloudChannelV1Period trialPeriod) {
    this.trialPeriod = trialPeriod;
    return this;
  }

  @Override
  public GoogleCloudChannelV1Plan set(String fieldName, Object value) {
    return (GoogleCloudChannelV1Plan) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1Plan clone() {
    return (GoogleCloudChannelV1Plan) super.clone();
  }

}
