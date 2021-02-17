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
 * Request message for CloudChannelService.SuspendEntitlement.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1SuspendEntitlementRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. For example, consider a situation where you make an initial request and the request
   * times out. If you make the request again with the same request ID, the server can check if the
   * original operation with the same request ID was received, and if so, will ignore the second
   * request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the
   * exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. For example, consider a situation where you make an initial request and the request
   * times out. If you make the request again with the same request ID, the server can check if the
   * original operation with the same request ID was received, and if so, will ignore the second
   * request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the
   * exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. For example, consider a situation where you make an initial request and the request
   * times out. If you make the request again with the same request ID, the server can check if the
   * original operation with the same request ID was received, and if so, will ignore the second
   * request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the
   * exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudChannelV1SuspendEntitlementRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public GoogleCloudChannelV1SuspendEntitlementRequest set(String fieldName, Object value) {
    return (GoogleCloudChannelV1SuspendEntitlementRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1SuspendEntitlementRequest clone() {
    return (GoogleCloudChannelV1SuspendEntitlementRequest) super.clone();
  }

}
