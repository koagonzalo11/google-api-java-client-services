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

package com.google.api.services.apigee.v1.model;

/**
 * Apigee endpoint attachment. For more information, see Southbound networking patterns.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1EndpointAttachment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Host that can be used in either the HTTP target endpoint directly or as the host
   * in target server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Required. Location of the endpoint attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Name of the endpoint attachment. Use the following structure in your request:
   * `organizations/{org}/endpointAttachments/{endpoint_attachment}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Format: projects/regions/serviceAttachments
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAttachment;

  /**
   * Output only. Host that can be used in either the HTTP target endpoint directly or as the host
   * in target server.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. Host that can be used in either the HTTP target endpoint directly or as the host
   * in target server.
   * @param host host or {@code null} for none
   */
  public GoogleCloudApigeeV1EndpointAttachment setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Required. Location of the endpoint attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Required. Location of the endpoint attachment.
   * @param location location or {@code null} for none
   */
  public GoogleCloudApigeeV1EndpointAttachment setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the endpoint attachment. Use the following structure in your request:
   * `organizations/{org}/endpointAttachments/{endpoint_attachment}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the endpoint attachment. Use the following structure in your request:
   * `organizations/{org}/endpointAttachments/{endpoint_attachment}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1EndpointAttachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Format: projects/regions/serviceAttachments
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAttachment() {
    return serviceAttachment;
  }

  /**
   * Format: projects/regions/serviceAttachments
   * @param serviceAttachment serviceAttachment or {@code null} for none
   */
  public GoogleCloudApigeeV1EndpointAttachment setServiceAttachment(java.lang.String serviceAttachment) {
    this.serviceAttachment = serviceAttachment;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1EndpointAttachment set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1EndpointAttachment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1EndpointAttachment clone() {
    return (GoogleCloudApigeeV1EndpointAttachment) super.clone();
  }

}
