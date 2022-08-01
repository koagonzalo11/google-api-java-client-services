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
 * The feedback that the customer has about a certain answer in the conversation.
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
public final class GoogleCloudContactcenterinsightsV1AnswerFeedback extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether an answer or item was clicked by the human agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean clicked;

  /**
   * The correctness level of an answer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctnessLevel;

  /**
   * Indicates whether an answer or item was displayed to the human agent in the agent desktop UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean displayed;

  /**
   * Indicates whether an answer or item was clicked by the human agent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClicked() {
    return clicked;
  }

  /**
   * Indicates whether an answer or item was clicked by the human agent.
   * @param clicked clicked or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnswerFeedback setClicked(java.lang.Boolean clicked) {
    this.clicked = clicked;
    return this;
  }

  /**
   * The correctness level of an answer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectnessLevel() {
    return correctnessLevel;
  }

  /**
   * The correctness level of an answer.
   * @param correctnessLevel correctnessLevel or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnswerFeedback setCorrectnessLevel(java.lang.String correctnessLevel) {
    this.correctnessLevel = correctnessLevel;
    return this;
  }

  /**
   * Indicates whether an answer or item was displayed to the human agent in the agent desktop UI.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisplayed() {
    return displayed;
  }

  /**
   * Indicates whether an answer or item was displayed to the human agent in the agent desktop UI.
   * @param displayed displayed or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnswerFeedback setDisplayed(java.lang.Boolean displayed) {
    this.displayed = displayed;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AnswerFeedback set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1AnswerFeedback) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AnswerFeedback clone() {
    return (GoogleCloudContactcenterinsightsV1AnswerFeedback) super.clone();
  }

}
