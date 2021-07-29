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

package com.google.api.services.compute.model;

/**
 * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be
 * provided explicitly or in the URL mask. The version is optional and can only be provided
 * explicitly or in the URL mask when service is present. Note: App Engine service must be in the
 * same project and located in the same region as the Serverless NEG.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpointGroupAppEngine extends com.google.api.client.json.GenericJson {

  /**
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long.
   * Example value: "default", "my-service".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * A template to parse service and version fields from a request URL. URL mask allows for routing
   * to multiple App Engine services without having to create multiple Network Endpoint Groups and
   * backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1
   * -dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-
   * appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and
   * { service = "foo1", version = "v2" } respectively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlMask;

  /**
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long.
   * Example value: "v1", "v2".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long.
   * Example value: "default", "my-service".
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long.
   * Example value: "default", "my-service".
   * @param service service or {@code null} for none
   */
  public NetworkEndpointGroupAppEngine setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * A template to parse service and version fields from a request URL. URL mask allows for routing
   * to multiple App Engine services without having to create multiple Network Endpoint Groups and
   * backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1
   * -dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-
   * appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and
   * { service = "foo1", version = "v2" } respectively.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlMask() {
    return urlMask;
  }

  /**
   * A template to parse service and version fields from a request URL. URL mask allows for routing
   * to multiple App Engine services without having to create multiple Network Endpoint Groups and
   * backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1
   * -dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-
   * appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and
   * { service = "foo1", version = "v2" } respectively.
   * @param urlMask urlMask or {@code null} for none
   */
  public NetworkEndpointGroupAppEngine setUrlMask(java.lang.String urlMask) {
    this.urlMask = urlMask;
    return this;
  }

  /**
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long.
   * Example value: "v1", "v2".
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long.
   * Example value: "v1", "v2".
   * @param version version or {@code null} for none
   */
  public NetworkEndpointGroupAppEngine setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public NetworkEndpointGroupAppEngine set(String fieldName, Object value) {
    return (NetworkEndpointGroupAppEngine) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpointGroupAppEngine clone() {
    return (NetworkEndpointGroupAppEngine) super.clone();
  }

}
