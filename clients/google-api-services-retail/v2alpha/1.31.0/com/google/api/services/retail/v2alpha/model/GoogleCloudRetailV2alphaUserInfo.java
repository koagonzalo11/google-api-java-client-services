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

package com.google.api.services.retail.v2alpha.model;

/**
 * Information of an end user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaUserInfo extends com.google.api.client.json.GenericJson {

  /**
   * True if the request is made directly from the end user, in which case the ip_address and
   * user_agent can be populated from the HTTP request. This flag should be set only if the API
   * request is made directly from the end user such as a mobile app (and not if a gateway or a
   * server is processing and pushing the user events). This should not be set when using the
   * JavaScript tag in UserEventService.CollectUserEvent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean directUserRequest;

  /**
   * The end user's IP address. This field is used to extract location information for
   * personalization. This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
   * address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an INVALID_ARGUMENT error
   * is returned. This should not be set when: * setting SearchRequest.user_info. * using the
   * JavaScript tag in UserEventService.CollectUserEvent or if direct_user_request is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * User agent as included in the HTTP header. Required for getting
   * SearchResponse.sponsored_results. The field must be a UTF-8 encoded string with a length limit
   * of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. This should not be set
   * when using the client side event reporting with GTM or JavaScript tag in
   * UserEventService.CollectUserEvent or if direct_user_request is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * Highly recommended for logged-in users. Unique identifier for logged-in user, such as a user
   * name. Always use a hashed value for this ID. The field must be a UTF-8 encoded string with a
   * length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * True if the request is made directly from the end user, in which case the ip_address and
   * user_agent can be populated from the HTTP request. This flag should be set only if the API
   * request is made directly from the end user such as a mobile app (and not if a gateway or a
   * server is processing and pushing the user events). This should not be set when using the
   * JavaScript tag in UserEventService.CollectUserEvent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDirectUserRequest() {
    return directUserRequest;
  }

  /**
   * True if the request is made directly from the end user, in which case the ip_address and
   * user_agent can be populated from the HTTP request. This flag should be set only if the API
   * request is made directly from the end user such as a mobile app (and not if a gateway or a
   * server is processing and pushing the user events). This should not be set when using the
   * JavaScript tag in UserEventService.CollectUserEvent.
   * @param directUserRequest directUserRequest or {@code null} for none
   */
  public GoogleCloudRetailV2alphaUserInfo setDirectUserRequest(java.lang.Boolean directUserRequest) {
    this.directUserRequest = directUserRequest;
    return this;
  }

  /**
   * The end user's IP address. This field is used to extract location information for
   * personalization. This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
   * address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an INVALID_ARGUMENT error
   * is returned. This should not be set when: * setting SearchRequest.user_info. * using the
   * JavaScript tag in UserEventService.CollectUserEvent or if direct_user_request is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * The end user's IP address. This field is used to extract location information for
   * personalization. This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
   * address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an INVALID_ARGUMENT error
   * is returned. This should not be set when: * setting SearchRequest.user_info. * using the
   * JavaScript tag in UserEventService.CollectUserEvent or if direct_user_request is set.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public GoogleCloudRetailV2alphaUserInfo setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * User agent as included in the HTTP header. Required for getting
   * SearchResponse.sponsored_results. The field must be a UTF-8 encoded string with a length limit
   * of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. This should not be set
   * when using the client side event reporting with GTM or JavaScript tag in
   * UserEventService.CollectUserEvent or if direct_user_request is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * User agent as included in the HTTP header. Required for getting
   * SearchResponse.sponsored_results. The field must be a UTF-8 encoded string with a length limit
   * of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. This should not be set
   * when using the client side event reporting with GTM or JavaScript tag in
   * UserEventService.CollectUserEvent or if direct_user_request is set.
   * @param userAgent userAgent or {@code null} for none
   */
  public GoogleCloudRetailV2alphaUserInfo setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Highly recommended for logged-in users. Unique identifier for logged-in user, such as a user
   * name. Always use a hashed value for this ID. The field must be a UTF-8 encoded string with a
   * length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Highly recommended for logged-in users. Unique identifier for logged-in user, such as a user
   * name. Always use a hashed value for this ID. The field must be a UTF-8 encoded string with a
   * length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param userId userId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaUserInfo setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaUserInfo set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaUserInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaUserInfo clone() {
    return (GoogleCloudRetailV2alphaUserInfo) super.clone();
  }

}
