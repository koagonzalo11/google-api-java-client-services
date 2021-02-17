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
 * Response message for CloudChannelService.TransferEntitlements. This will be put into the response
 * field of google.longrunning.Operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1TransferEntitlementsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The entitlements that have been transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1Entitlement> entitlements;

  static {
    // hack to force ProGuard to consider GoogleCloudChannelV1Entitlement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudChannelV1Entitlement.class);
  }

  /**
   * The entitlements that have been transferred.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1Entitlement> getEntitlements() {
    return entitlements;
  }

  /**
   * The entitlements that have been transferred.
   * @param entitlements entitlements or {@code null} for none
   */
  public GoogleCloudChannelV1TransferEntitlementsResponse setEntitlements(java.util.List<GoogleCloudChannelV1Entitlement> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  @Override
  public GoogleCloudChannelV1TransferEntitlementsResponse set(String fieldName, Object value) {
    return (GoogleCloudChannelV1TransferEntitlementsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1TransferEntitlementsResponse clone() {
    return (GoogleCloudChannelV1TransferEntitlementsResponse) super.clone();
  }

}
