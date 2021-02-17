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
 * Represents media information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1Media extends com.google.api.client.json.GenericJson {

  /**
   * URL of the media.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Title of the media.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Type of the media.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * URL of the media.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * URL of the media.
   * @param content content or {@code null} for none
   */
  public GoogleCloudChannelV1Media setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Title of the media.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the media.
   * @param title title or {@code null} for none
   */
  public GoogleCloudChannelV1Media setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Type of the media.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the media.
   * @param type type or {@code null} for none
   */
  public GoogleCloudChannelV1Media setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudChannelV1Media set(String fieldName, Object value) {
    return (GoogleCloudChannelV1Media) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1Media clone() {
    return (GoogleCloudChannelV1Media) super.clone();
  }

}
