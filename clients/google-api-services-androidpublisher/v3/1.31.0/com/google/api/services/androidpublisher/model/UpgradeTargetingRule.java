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
 * Represents a targeting rule of the form: User currently has {scope} [with billing period
 * {billing_period}].
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
public final class UpgradeTargetingRule extends com.google.api.client.json.GenericJson {

  /**
   * The specific billing period duration, specified in ISO 8601 format, that a user must be
   * currently subscribed to to be eligible for this rule. If not specified, users subscribed to any
   * billing period are matched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingPeriodDuration;

  /**
   * Limit this offer to only once per user. If set to true, a user can never be eligible for this
   * offer again if they ever subscribed to this offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean oncePerUser;

  /**
   * Required. The scope of subscriptions this rule considers. Only allows "this subscription" and
   * "specific subscription in app".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetingRuleScope scope;

  /**
   * The specific billing period duration, specified in ISO 8601 format, that a user must be
   * currently subscribed to to be eligible for this rule. If not specified, users subscribed to any
   * billing period are matched.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingPeriodDuration() {
    return billingPeriodDuration;
  }

  /**
   * The specific billing period duration, specified in ISO 8601 format, that a user must be
   * currently subscribed to to be eligible for this rule. If not specified, users subscribed to any
   * billing period are matched.
   * @param billingPeriodDuration billingPeriodDuration or {@code null} for none
   */
  public UpgradeTargetingRule setBillingPeriodDuration(java.lang.String billingPeriodDuration) {
    this.billingPeriodDuration = billingPeriodDuration;
    return this;
  }

  /**
   * Limit this offer to only once per user. If set to true, a user can never be eligible for this
   * offer again if they ever subscribed to this offer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOncePerUser() {
    return oncePerUser;
  }

  /**
   * Limit this offer to only once per user. If set to true, a user can never be eligible for this
   * offer again if they ever subscribed to this offer.
   * @param oncePerUser oncePerUser or {@code null} for none
   */
  public UpgradeTargetingRule setOncePerUser(java.lang.Boolean oncePerUser) {
    this.oncePerUser = oncePerUser;
    return this;
  }

  /**
   * Required. The scope of subscriptions this rule considers. Only allows "this subscription" and
   * "specific subscription in app".
   * @return value or {@code null} for none
   */
  public TargetingRuleScope getScope() {
    return scope;
  }

  /**
   * Required. The scope of subscriptions this rule considers. Only allows "this subscription" and
   * "specific subscription in app".
   * @param scope scope or {@code null} for none
   */
  public UpgradeTargetingRule setScope(TargetingRuleScope scope) {
    this.scope = scope;
    return this;
  }

  @Override
  public UpgradeTargetingRule set(String fieldName, Object value) {
    return (UpgradeTargetingRule) super.set(fieldName, value);
  }

  @Override
  public UpgradeTargetingRule clone() {
    return (UpgradeTargetingRule) super.clone();
  }

}
