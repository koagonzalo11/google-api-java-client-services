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

package com.google.api.services.billingbudgets.v1beta1.model;

/**
 * AllUpdatesRule defines notifications that are sent based on budget spend and thresholds.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1beta1AllUpdatesRule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. When set to true, disables default notifications sent when a threshold is exceeded.
   * Default notifications are sent to those with Billing Account Administrator and Billing Account
   * User IAM roles for the target account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableDefaultIamRecipients;

  /**
   * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to
   * default recipients who have billing account IAM roles. The value is the full REST resource name
   * of a monitoring notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed.
   * See https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> monitoringNotificationChannels;

  /**
   * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the
   * form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals to the
   * topic. The topic needs to be created before the budget is created; see
   * https://cloud.google.com/billing/docs/how-to/budgets#manage-notifications for more details.
   * Caller is expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set
   * for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more
   * details on Pub/Sub roles and permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * Optional. Required when AllUpdatesRule.pubsub_topic is set. The schema version of the
   * notification sent to AllUpdatesRule.pubsub_topic. Only "1.0" is accepted. It represents the
   * JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-
   * notifications#notification_format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schemaVersion;

  /**
   * Optional. When set to true, disables default notifications sent when a threshold is exceeded.
   * Default notifications are sent to those with Billing Account Administrator and Billing Account
   * User IAM roles for the target account.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableDefaultIamRecipients() {
    return disableDefaultIamRecipients;
  }

  /**
   * Optional. When set to true, disables default notifications sent when a threshold is exceeded.
   * Default notifications are sent to those with Billing Account Administrator and Billing Account
   * User IAM roles for the target account.
   * @param disableDefaultIamRecipients disableDefaultIamRecipients or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule setDisableDefaultIamRecipients(java.lang.Boolean disableDefaultIamRecipients) {
    this.disableDefaultIamRecipients = disableDefaultIamRecipients;
    return this;
  }

  /**
   * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to
   * default recipients who have billing account IAM roles. The value is the full REST resource name
   * of a monitoring notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed.
   * See https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more
   * details.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMonitoringNotificationChannels() {
    return monitoringNotificationChannels;
  }

  /**
   * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to
   * default recipients who have billing account IAM roles. The value is the full REST resource name
   * of a monitoring notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed.
   * See https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more
   * details.
   * @param monitoringNotificationChannels monitoringNotificationChannels or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule setMonitoringNotificationChannels(java.util.List<java.lang.String> monitoringNotificationChannels) {
    this.monitoringNotificationChannels = monitoringNotificationChannels;
    return this;
  }

  /**
   * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the
   * form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals to the
   * topic. The topic needs to be created before the budget is created; see
   * https://cloud.google.com/billing/docs/how-to/budgets#manage-notifications for more details.
   * Caller is expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set
   * for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more
   * details on Pub/Sub roles and permissions.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the
   * form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals to the
   * topic. The topic needs to be created before the budget is created; see
   * https://cloud.google.com/billing/docs/how-to/budgets#manage-notifications for more details.
   * Caller is expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set
   * for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more
   * details on Pub/Sub roles and permissions.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  /**
   * Optional. Required when AllUpdatesRule.pubsub_topic is set. The schema version of the
   * notification sent to AllUpdatesRule.pubsub_topic. Only "1.0" is accepted. It represents the
   * JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-
   * notifications#notification_format.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchemaVersion() {
    return schemaVersion;
  }

  /**
   * Optional. Required when AllUpdatesRule.pubsub_topic is set. The schema version of the
   * notification sent to AllUpdatesRule.pubsub_topic. Only "1.0" is accepted. It represents the
   * JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-
   * notifications#notification_format.
   * @param schemaVersion schemaVersion or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule setSchemaVersion(java.lang.String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1beta1AllUpdatesRule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1AllUpdatesRule clone() {
    return (GoogleCloudBillingBudgetsV1beta1AllUpdatesRule) super.clone();
  }

}
