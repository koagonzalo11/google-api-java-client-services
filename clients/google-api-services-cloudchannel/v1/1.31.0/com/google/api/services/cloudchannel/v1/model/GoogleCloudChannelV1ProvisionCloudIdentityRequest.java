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
 * Request message for CloudChannelService.ProvisionCloudIdentity
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ProvisionCloudIdentityRequest extends com.google.api.client.json.GenericJson {

  /**
   * CloudIdentity-specific customer information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1CloudIdentityInfo cloudIdentityInfo;

  /**
   * Admin user information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1AdminUser user;

  /**
   * If set, validate the request and preview the review, but do not actually post it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * CloudIdentity-specific customer information.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1CloudIdentityInfo getCloudIdentityInfo() {
    return cloudIdentityInfo;
  }

  /**
   * CloudIdentity-specific customer information.
   * @param cloudIdentityInfo cloudIdentityInfo or {@code null} for none
   */
  public GoogleCloudChannelV1ProvisionCloudIdentityRequest setCloudIdentityInfo(GoogleCloudChannelV1CloudIdentityInfo cloudIdentityInfo) {
    this.cloudIdentityInfo = cloudIdentityInfo;
    return this;
  }

  /**
   * Admin user information.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1AdminUser getUser() {
    return user;
  }

  /**
   * Admin user information.
   * @param user user or {@code null} for none
   */
  public GoogleCloudChannelV1ProvisionCloudIdentityRequest setUser(GoogleCloudChannelV1AdminUser user) {
    this.user = user;
    return this;
  }

  /**
   * If set, validate the request and preview the review, but do not actually post it.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If set, validate the request and preview the review, but do not actually post it.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public GoogleCloudChannelV1ProvisionCloudIdentityRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ProvisionCloudIdentityRequest set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ProvisionCloudIdentityRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ProvisionCloudIdentityRequest clone() {
    return (GoogleCloudChannelV1ProvisionCloudIdentityRequest) super.clone();
  }

}
