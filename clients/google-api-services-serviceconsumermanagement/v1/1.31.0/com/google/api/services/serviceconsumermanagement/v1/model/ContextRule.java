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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * A context rule provides information about the context for an individual API element.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContextRule extends com.google.api.client.json.GenericJson {

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * client to backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedRequestExtensions;

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * backend to client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedResponseExtensions;

  /**
   * A list of full type names of provided contexts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> provided;

  /**
   * A list of full type names of requested contexts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requested;

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * client to backend.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedRequestExtensions() {
    return allowedRequestExtensions;
  }

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * client to backend.
   * @param allowedRequestExtensions allowedRequestExtensions or {@code null} for none
   */
  public ContextRule setAllowedRequestExtensions(java.util.List<java.lang.String> allowedRequestExtensions) {
    this.allowedRequestExtensions = allowedRequestExtensions;
    return this;
  }

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * backend to client.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedResponseExtensions() {
    return allowedResponseExtensions;
  }

  /**
   * A list of full type names or extension IDs of extensions allowed in grpc side channel from
   * backend to client.
   * @param allowedResponseExtensions allowedResponseExtensions or {@code null} for none
   */
  public ContextRule setAllowedResponseExtensions(java.util.List<java.lang.String> allowedResponseExtensions) {
    this.allowedResponseExtensions = allowedResponseExtensions;
    return this;
  }

  /**
   * A list of full type names of provided contexts.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProvided() {
    return provided;
  }

  /**
   * A list of full type names of provided contexts.
   * @param provided provided or {@code null} for none
   */
  public ContextRule setProvided(java.util.List<java.lang.String> provided) {
    this.provided = provided;
    return this;
  }

  /**
   * A list of full type names of requested contexts.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequested() {
    return requested;
  }

  /**
   * A list of full type names of requested contexts.
   * @param requested requested or {@code null} for none
   */
  public ContextRule setRequested(java.util.List<java.lang.String> requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies. Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public ContextRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public ContextRule set(String fieldName, Object value) {
    return (ContextRule) super.set(fieldName, value);
  }

  @Override
  public ContextRule clone() {
    return (ContextRule) super.clone();
  }

}
