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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * Contains notification related data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Array of string values. e.g. instance's replica information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * Optional. Array of string values. e.g. instance's replica information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Optional. Array of string values. e.g. instance's replica information.
   * @param values values or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter) super.clone();
  }

}
