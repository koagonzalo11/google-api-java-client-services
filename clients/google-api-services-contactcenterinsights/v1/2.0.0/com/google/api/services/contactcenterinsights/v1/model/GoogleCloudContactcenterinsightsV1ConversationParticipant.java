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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * The call participant speaking for a given utterance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1ConversationParticipant extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Use `dialogflow_participant_name` instead. The name of the Dialogflow participant.
   * Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dialogflowParticipant;

  /**
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dialogflowParticipantName;

  /**
   * Obfuscated user ID from Dialogflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obfuscatedExternalUserId;

  /**
   * The role of the participant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * A user-specified ID representing the participant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Deprecated. Use `dialogflow_participant_name` instead. The name of the Dialogflow participant.
   * Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * @return value or {@code null} for none
   */
  public java.lang.String getDialogflowParticipant() {
    return dialogflowParticipant;
  }

  /**
   * Deprecated. Use `dialogflow_participant_name` instead. The name of the Dialogflow participant.
   * Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * @param dialogflowParticipant dialogflowParticipant or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationParticipant setDialogflowParticipant(java.lang.String dialogflowParticipant) {
    this.dialogflowParticipant = dialogflowParticipant;
    return this;
  }

  /**
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * @return value or {@code null} for none
   */
  public java.lang.String getDialogflowParticipantName() {
    return dialogflowParticipantName;
  }

  /**
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * @param dialogflowParticipantName dialogflowParticipantName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationParticipant setDialogflowParticipantName(java.lang.String dialogflowParticipantName) {
    this.dialogflowParticipantName = dialogflowParticipantName;
    return this;
  }

  /**
   * Obfuscated user ID from Dialogflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getObfuscatedExternalUserId() {
    return obfuscatedExternalUserId;
  }

  /**
   * Obfuscated user ID from Dialogflow.
   * @param obfuscatedExternalUserId obfuscatedExternalUserId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationParticipant setObfuscatedExternalUserId(java.lang.String obfuscatedExternalUserId) {
    this.obfuscatedExternalUserId = obfuscatedExternalUserId;
    return this;
  }

  /**
   * The role of the participant.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The role of the participant.
   * @param role role or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationParticipant setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * A user-specified ID representing the participant.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * A user-specified ID representing the participant.
   * @param userId userId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ConversationParticipant setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ConversationParticipant set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1ConversationParticipant) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ConversationParticipant clone() {
    return (GoogleCloudContactcenterinsightsV1ConversationParticipant) super.clone();
  }

}
