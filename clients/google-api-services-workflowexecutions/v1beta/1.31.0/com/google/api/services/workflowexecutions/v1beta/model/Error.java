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

package com.google.api.services.workflowexecutions.v1beta.model;

/**
 * Error describes why the execution was abnormally terminated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workflow Executions API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Error extends com.google.api.client.json.GenericJson {

  /**
   * Human-readable stack trace string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String context;

  /**
   * Error message and data returned represented as a JSON string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * Stack trace with detailed information of where error was generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StackTrace stackTrace;

  /**
   * Human-readable stack trace string.
   * @return value or {@code null} for none
   */
  public java.lang.String getContext() {
    return context;
  }

  /**
   * Human-readable stack trace string.
   * @param context context or {@code null} for none
   */
  public Error setContext(java.lang.String context) {
    this.context = context;
    return this;
  }

  /**
   * Error message and data returned represented as a JSON string.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * Error message and data returned represented as a JSON string.
   * @param payload payload or {@code null} for none
   */
  public Error setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Stack trace with detailed information of where error was generated.
   * @return value or {@code null} for none
   */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /**
   * Stack trace with detailed information of where error was generated.
   * @param stackTrace stackTrace or {@code null} for none
   */
  public Error setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  @Override
  public Error set(String fieldName, Object value) {
    return (Error) super.set(fieldName, value);
  }

  @Override
  public Error clone() {
    return (Error) super.clone();
  }

}
