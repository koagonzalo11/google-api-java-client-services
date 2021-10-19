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

package com.google.api.services.chromepolicy.v1.model;

/**
 * The key used to identify the target on which the policy will be applied.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyV1PolicyTargetKey extends com.google.api.client.json.GenericJson {

  /**
   * Map containing the additional target key name and value pairs used to further identify the
   * target of the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> additionalTargetKeys;

  /**
   * The target resource on which this policy is applied. The following resources are supported: *
   * Organizational Unit ("orgunits/{orgunit_id}")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetResource;

  /**
   * Map containing the additional target key name and value pairs used to further identify the
   * target of the policy.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAdditionalTargetKeys() {
    return additionalTargetKeys;
  }

  /**
   * Map containing the additional target key name and value pairs used to further identify the
   * target of the policy.
   * @param additionalTargetKeys additionalTargetKeys or {@code null} for none
   */
  public GoogleChromePolicyV1PolicyTargetKey setAdditionalTargetKeys(java.util.Map<String, java.lang.String> additionalTargetKeys) {
    this.additionalTargetKeys = additionalTargetKeys;
    return this;
  }

  /**
   * The target resource on which this policy is applied. The following resources are supported: *
   * Organizational Unit ("orgunits/{orgunit_id}")
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetResource() {
    return targetResource;
  }

  /**
   * The target resource on which this policy is applied. The following resources are supported: *
   * Organizational Unit ("orgunits/{orgunit_id}")
   * @param targetResource targetResource or {@code null} for none
   */
  public GoogleChromePolicyV1PolicyTargetKey setTargetResource(java.lang.String targetResource) {
    this.targetResource = targetResource;
    return this;
  }

  @Override
  public GoogleChromePolicyV1PolicyTargetKey set(String fieldName, Object value) {
    return (GoogleChromePolicyV1PolicyTargetKey) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyV1PolicyTargetKey clone() {
    return (GoogleChromePolicyV1PolicyTargetKey) super.clone();
  }

}
