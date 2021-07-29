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
 * Model definition for TCPHealthCheck.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TCPHealthCheck extends com.google.api.client.json.GenericJson {

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portName;

  /**
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   * portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   * specified for each network endpoint is used for health checking. For other backends, the port
   * or named port specified in the Backend Service is used for health checking. If not specified,
   * TCP health check follows behavior specified in port and portName fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portSpecification;

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyHeader;

  /**
   * The application data to send once the TCP connection has been established (default value is
   * empty). If both request and response are empty, the connection establishment alone will
   * indicate health. The request data can only be ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String request;

  /**
   * The bytes to match against the beginning of the response data. If left empty (the default
   * value), any response will indicate health. The response data can only be ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String response;

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * @param port port or {@code null} for none
   */
  public TCPHealthCheck setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortName() {
    return portName;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @param portName portName or {@code null} for none
   */
  public TCPHealthCheck setPortName(java.lang.String portName) {
    this.portName = portName;
    return this;
  }

  /**
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   * portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   * specified for each network endpoint is used for health checking. For other backends, the port
   * or named port specified in the Backend Service is used for health checking. If not specified,
   * TCP health check follows behavior specified in port and portName fields.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortSpecification() {
    return portSpecification;
  }

  /**
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   * portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   * specified for each network endpoint is used for health checking. For other backends, the port
   * or named port specified in the Backend Service is used for health checking. If not specified,
   * TCP health check follows behavior specified in port and portName fields.
   * @param portSpecification portSpecification or {@code null} for none
   */
  public TCPHealthCheck setPortSpecification(java.lang.String portSpecification) {
    this.portSpecification = portSpecification;
    return this;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyHeader() {
    return proxyHeader;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @param proxyHeader proxyHeader or {@code null} for none
   */
  public TCPHealthCheck setProxyHeader(java.lang.String proxyHeader) {
    this.proxyHeader = proxyHeader;
    return this;
  }

  /**
   * The application data to send once the TCP connection has been established (default value is
   * empty). If both request and response are empty, the connection establishment alone will
   * indicate health. The request data can only be ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequest() {
    return request;
  }

  /**
   * The application data to send once the TCP connection has been established (default value is
   * empty). If both request and response are empty, the connection establishment alone will
   * indicate health. The request data can only be ASCII.
   * @param request request or {@code null} for none
   */
  public TCPHealthCheck setRequest(java.lang.String request) {
    this.request = request;
    return this;
  }

  /**
   * The bytes to match against the beginning of the response data. If left empty (the default
   * value), any response will indicate health. The response data can only be ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponse() {
    return response;
  }

  /**
   * The bytes to match against the beginning of the response data. If left empty (the default
   * value), any response will indicate health. The response data can only be ASCII.
   * @param response response or {@code null} for none
   */
  public TCPHealthCheck setResponse(java.lang.String response) {
    this.response = response;
    return this;
  }

  @Override
  public TCPHealthCheck set(String fieldName, Object value) {
    return (TCPHealthCheck) super.set(fieldName, value);
  }

  @Override
  public TCPHealthCheck clone() {
    return (TCPHealthCheck) super.clone();
  }

}
