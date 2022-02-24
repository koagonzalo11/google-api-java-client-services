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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * Pub/Sub target. The job will be delivered by publishing a message to the given Pub/Sub topic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubTarget extends com.google.api.client.json.GenericJson {

  /**
   * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least
   * one attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at
   * least one attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Required. The name of the Cloud Pub/Sub topic to which messages will be published when a job is
   * delivered. The topic name must be in the same format as required by Pub/Sub's [PublishRequest.n
   * ame](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for
   * example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the
   * Cloud Scheduler job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicName;

  /**
   * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least
   * one attribute.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least
   * one attribute.
   * @param attributes attributes or {@code null} for none
   */
  public PubsubTarget setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at
   * least one attribute.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at
   * least one attribute.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at
   * least one attribute.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public PubsubTarget setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at
   * least one attribute.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PubsubTarget encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * Required. The name of the Cloud Pub/Sub topic to which messages will be published when a job is
   * delivered. The topic name must be in the same format as required by Pub/Sub's [PublishRequest.n
   * ame](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for
   * example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the
   * Cloud Scheduler job.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicName() {
    return topicName;
  }

  /**
   * Required. The name of the Cloud Pub/Sub topic to which messages will be published when a job is
   * delivered. The topic name must be in the same format as required by Pub/Sub's [PublishRequest.n
   * ame](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for
   * example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the
   * Cloud Scheduler job.
   * @param topicName topicName or {@code null} for none
   */
  public PubsubTarget setTopicName(java.lang.String topicName) {
    this.topicName = topicName;
    return this;
  }

  @Override
  public PubsubTarget set(String fieldName, Object value) {
    return (PubsubTarget) super.set(fieldName, value);
  }

  @Override
  public PubsubTarget clone() {
    return (PubsubTarget) super.clone();
  }

}
