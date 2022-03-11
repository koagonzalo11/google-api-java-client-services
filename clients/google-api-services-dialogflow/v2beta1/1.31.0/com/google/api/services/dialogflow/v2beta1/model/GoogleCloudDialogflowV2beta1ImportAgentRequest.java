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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The request message for Agents.ImportAgent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1ImportAgentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Zip compressed raw byte content for agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentContent;

  /**
   * The URI to a Google Cloud Storage file containing the agent to import. Note: The URI must start
   * with "gs://". Dialogflow performs a read operation for the Cloud Storage object on the caller's
   * behalf, so your request authentication must have read permissions for the object. For more
   * information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUri;

  /**
   * Zip compressed raw byte content for agent.
   * @see #decodeAgentContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentContent() {
    return agentContent;
  }

  /**
   * Zip compressed raw byte content for agent.
   * @see #getAgentContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAgentContent() {
    return com.google.api.client.util.Base64.decodeBase64(agentContent);
  }

  /**
   * Zip compressed raw byte content for agent.
   * @see #encodeAgentContent()
   * @param agentContent agentContent or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ImportAgentRequest setAgentContent(java.lang.String agentContent) {
    this.agentContent = agentContent;
    return this;
  }

  /**
   * Zip compressed raw byte content for agent.
   * @see #setAgentContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowV2beta1ImportAgentRequest encodeAgentContent(byte[] agentContent) {
    this.agentContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(agentContent);
    return this;
  }

  /**
   * The URI to a Google Cloud Storage file containing the agent to import. Note: The URI must start
   * with "gs://". Dialogflow performs a read operation for the Cloud Storage object on the caller's
   * behalf, so your request authentication must have read permissions for the object. For more
   * information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUri() {
    return agentUri;
  }

  /**
   * The URI to a Google Cloud Storage file containing the agent to import. Note: The URI must start
   * with "gs://". Dialogflow performs a read operation for the Cloud Storage object on the caller's
   * behalf, so your request authentication must have read permissions for the object. For more
   * information, see [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * @param agentUri agentUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ImportAgentRequest setAgentUri(java.lang.String agentUri) {
    this.agentUri = agentUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1ImportAgentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1ImportAgentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1ImportAgentRequest clone() {
    return (GoogleCloudDialogflowV2beta1ImportAgentRequest) super.clone();
  }

}
