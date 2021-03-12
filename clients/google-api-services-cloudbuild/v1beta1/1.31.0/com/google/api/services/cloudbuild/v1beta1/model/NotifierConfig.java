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

package com.google.api.services.cloudbuild.v1beta1.model;

/**
 * NotifierConfig is the top-level configuration message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotifierConfig extends com.google.api.client.json.GenericJson {

  /**
   * The API version of this configuration format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * The type of notifier to use (e.g. SMTPNotifier).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata for referring to/handling/deploying this notifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotifierMetadata metadata;

  /**
   * The actual configuration for this notifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotifierSpec spec;

  /**
   * The API version of this configuration format.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version of this configuration format.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public NotifierConfig setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The type of notifier to use (e.g. SMTPNotifier).
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of notifier to use (e.g. SMTPNotifier).
   * @param kind kind or {@code null} for none
   */
  public NotifierConfig setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata for referring to/handling/deploying this notifier.
   * @return value or {@code null} for none
   */
  public NotifierMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata for referring to/handling/deploying this notifier.
   * @param metadata metadata or {@code null} for none
   */
  public NotifierConfig setMetadata(NotifierMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The actual configuration for this notifier.
   * @return value or {@code null} for none
   */
  public NotifierSpec getSpec() {
    return spec;
  }

  /**
   * The actual configuration for this notifier.
   * @param spec spec or {@code null} for none
   */
  public NotifierConfig setSpec(NotifierSpec spec) {
    this.spec = spec;
    return this;
  }

  @Override
  public NotifierConfig set(String fieldName, Object value) {
    return (NotifierConfig) super.set(fieldName, value);
  }

  @Override
  public NotifierConfig clone() {
    return (NotifierConfig) super.clone();
  }

}
