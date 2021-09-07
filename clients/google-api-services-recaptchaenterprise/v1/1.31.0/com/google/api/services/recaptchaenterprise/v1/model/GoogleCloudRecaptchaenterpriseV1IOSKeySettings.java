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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * Settings specific to keys that can be used by iOS apps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1IOSKeySettings extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, it means allowed_bundle_ids will not be enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowAllBundleIds;

  /**
   * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedBundleIds;

  /**
   * If set to true, it means allowed_bundle_ids will not be enforced.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowAllBundleIds() {
    return allowAllBundleIds;
  }

  /**
   * If set to true, it means allowed_bundle_ids will not be enforced.
   * @param allowAllBundleIds allowAllBundleIds or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1IOSKeySettings setAllowAllBundleIds(java.lang.Boolean allowAllBundleIds) {
    this.allowAllBundleIds = allowAllBundleIds;
    return this;
  }

  /**
   * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedBundleIds() {
    return allowedBundleIds;
  }

  /**
   * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
   * @param allowedBundleIds allowedBundleIds or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1IOSKeySettings setAllowedBundleIds(java.util.List<java.lang.String> allowedBundleIds) {
    this.allowedBundleIds = allowedBundleIds;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1IOSKeySettings set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1IOSKeySettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1IOSKeySettings clone() {
    return (GoogleCloudRecaptchaenterpriseV1IOSKeySettings) super.clone();
  }

}
