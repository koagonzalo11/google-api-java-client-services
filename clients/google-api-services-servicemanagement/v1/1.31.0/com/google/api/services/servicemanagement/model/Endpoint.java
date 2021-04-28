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

package com.google.api.services.servicemanagement.model;

/**
 * `Endpoint` describes a network endpoint of a service that serves a set of APIs. It is commonly
 * known as a service endpoint. A service may expose any number of service endpoints, and all
 * service endpoints share the same service definition, such as quota limits and monitoring metrics.
 * Example service configuration: name: library-example.googleapis.com endpoints: # Below entry
 * makes 'google.example.library.v1.Library' # API be served from endpoint address library-
 * example.googleapis.com. # It also allows HTTP OPTIONS calls to be passed to the backend, for # it
 * to decide whether the subsequent cross-origin request is # allowed to proceed. - name: library-
 * example.googleapis.com allow_cors: true
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Endpoint extends com.google.api.client.json.GenericJson {

  /**
   * Unimplemented. Dot not use. DEPRECATED: This field is no longer supported. Instead of using
   * aliases, please specify multiple google.api.Endpoint for each of the intended aliases.
   * Additional names that this endpoint will be hosted on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> aliases;

  /**
   * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain
   * traffic, would allow the backends served from this endpoint to receive and respond to HTTP
   * OPTIONS requests. The response will be used by the browser to determine whether the subsequent
   * cross-origin request is allowed to proceed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowCors;

  /**
   * The canonical name of this endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The specification of an Internet routable address of API frontend that will handle requests to
   * this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid
   * IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or
   * "myservice.appspot.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Unimplemented. Dot not use. DEPRECATED: This field is no longer supported. Instead of using
   * aliases, please specify multiple google.api.Endpoint for each of the intended aliases.
   * Additional names that this endpoint will be hosted on.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAliases() {
    return aliases;
  }

  /**
   * Unimplemented. Dot not use. DEPRECATED: This field is no longer supported. Instead of using
   * aliases, please specify multiple google.api.Endpoint for each of the intended aliases.
   * Additional names that this endpoint will be hosted on.
   * @param aliases aliases or {@code null} for none
   */
  public Endpoint setAliases(java.util.List<java.lang.String> aliases) {
    this.aliases = aliases;
    return this;
  }

  /**
   * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain
   * traffic, would allow the backends served from this endpoint to receive and respond to HTTP
   * OPTIONS requests. The response will be used by the browser to determine whether the subsequent
   * cross-origin request is allowed to proceed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowCors() {
    return allowCors;
  }

  /**
   * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain
   * traffic, would allow the backends served from this endpoint to receive and respond to HTTP
   * OPTIONS requests. The response will be used by the browser to determine whether the subsequent
   * cross-origin request is allowed to proceed.
   * @param allowCors allowCors or {@code null} for none
   */
  public Endpoint setAllowCors(java.lang.Boolean allowCors) {
    this.allowCors = allowCors;
    return this;
  }

  /**
   * The canonical name of this endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The canonical name of this endpoint.
   * @param name name or {@code null} for none
   */
  public Endpoint setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The specification of an Internet routable address of API frontend that will handle requests to
   * this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid
   * IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or
   * "myservice.appspot.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * The specification of an Internet routable address of API frontend that will handle requests to
   * this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid
   * IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or
   * "myservice.appspot.com".
   * @param target target or {@code null} for none
   */
  public Endpoint setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  @Override
  public Endpoint set(String fieldName, Object value) {
    return (Endpoint) super.set(fieldName, value);
  }

  @Override
  public Endpoint clone() {
    return (Endpoint) super.clone();
  }

}
