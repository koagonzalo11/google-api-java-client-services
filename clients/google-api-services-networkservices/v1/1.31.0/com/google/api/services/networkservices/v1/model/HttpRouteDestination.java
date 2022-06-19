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

package com.google.api.services.networkservices.v1.model;

/**
 * Specifications of a destination to which the request should be routed to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteDestination extends com.google.api.client.json.GenericJson {

  /**
   * The URL of a BackendService to route traffic to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * Specifies the proportion of requests forwarded to the backend referenced by the serviceName
   * field. This is computed as: weight/Sum(weights in this destination list). For non-zero values,
   * there may be some epsilon from the exact proportion defined here depending on the precision an
   * implementation supports. If only one serviceName is specified and it has a weight greater than
   * 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one
   * service name, they need to be specified for all of them. If weights are unspecified for all
   * services, then, traffic is distributed in equal proportions to all of them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer weight;

  /**
   * The URL of a BackendService to route traffic to.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The URL of a BackendService to route traffic to.
   * @param serviceName serviceName or {@code null} for none
   */
  public HttpRouteDestination setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Specifies the proportion of requests forwarded to the backend referenced by the serviceName
   * field. This is computed as: weight/Sum(weights in this destination list). For non-zero values,
   * there may be some epsilon from the exact proportion defined here depending on the precision an
   * implementation supports. If only one serviceName is specified and it has a weight greater than
   * 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one
   * service name, they need to be specified for all of them. If weights are unspecified for all
   * services, then, traffic is distributed in equal proportions to all of them.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWeight() {
    return weight;
  }

  /**
   * Specifies the proportion of requests forwarded to the backend referenced by the serviceName
   * field. This is computed as: weight/Sum(weights in this destination list). For non-zero values,
   * there may be some epsilon from the exact proportion defined here depending on the precision an
   * implementation supports. If only one serviceName is specified and it has a weight greater than
   * 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one
   * service name, they need to be specified for all of them. If weights are unspecified for all
   * services, then, traffic is distributed in equal proportions to all of them.
   * @param weight weight or {@code null} for none
   */
  public HttpRouteDestination setWeight(java.lang.Integer weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public HttpRouteDestination set(String fieldName, Object value) {
    return (HttpRouteDestination) super.set(fieldName, value);
  }

  @Override
  public HttpRouteDestination clone() {
    return (HttpRouteDestination) super.clone();
  }

}
