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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * **Cloud Audit Logging**: Spec for Audit Logging Allowlisting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudAuditLoggingFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Service account that should be allowlisted to send the audit logs; eg cloudauditlogging@gcp-
   * project.iam.gserviceaccount.com. These accounts must already exist, but do not need to have any
   * permissions granted to them. The customer's entitlements will be checked prior to allowlisting
   * (i.e. the customer must be an Anthos customer.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowlistedServiceAccounts;

  /**
   * Service account that should be allowlisted to send the audit logs; eg cloudauditlogging@gcp-
   * project.iam.gserviceaccount.com. These accounts must already exist, but do not need to have any
   * permissions granted to them. The customer's entitlements will be checked prior to allowlisting
   * (i.e. the customer must be an Anthos customer.)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowlistedServiceAccounts() {
    return allowlistedServiceAccounts;
  }

  /**
   * Service account that should be allowlisted to send the audit logs; eg cloudauditlogging@gcp-
   * project.iam.gserviceaccount.com. These accounts must already exist, but do not need to have any
   * permissions granted to them. The customer's entitlements will be checked prior to allowlisting
   * (i.e. the customer must be an Anthos customer.)
   * @param allowlistedServiceAccounts allowlistedServiceAccounts or {@code null} for none
   */
  public CloudAuditLoggingFeatureSpec setAllowlistedServiceAccounts(java.util.List<java.lang.String> allowlistedServiceAccounts) {
    this.allowlistedServiceAccounts = allowlistedServiceAccounts;
    return this;
  }

  @Override
  public CloudAuditLoggingFeatureSpec set(String fieldName, Object value) {
    return (CloudAuditLoggingFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public CloudAuditLoggingFeatureSpec clone() {
    return (CloudAuditLoggingFeatureSpec) super.clone();
  }

}
