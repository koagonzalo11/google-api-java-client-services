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
 * Model definition for GRPCHealthCheck.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GRPCHealthCheck extends com.google.api.client.json.GenericJson {

  /**
   * The gRPC service name for the health check. This field is optional. The value of
   * grpc_service_name has the following meanings by convention: - Empty service_name means the
   * overall status of all services at the backend. - Non-empty service_name means the health of
   * that gRPC service, as defined by the owner of the service. The grpc_service_name can only be
   * ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String grpcServiceName;

  /**
   * The port number for the health check request. Must be specified if port_name and
   * port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1
   * through 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence. The port_name should conform to RFC1035.
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
   * gRPC health check follows behavior specified in port and portName fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portSpecification;

  /**
   * The gRPC service name for the health check. This field is optional. The value of
   * grpc_service_name has the following meanings by convention: - Empty service_name means the
   * overall status of all services at the backend. - Non-empty service_name means the health of
   * that gRPC service, as defined by the owner of the service. The grpc_service_name can only be
   * ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getGrpcServiceName() {
    return grpcServiceName;
  }

  /**
   * The gRPC service name for the health check. This field is optional. The value of
   * grpc_service_name has the following meanings by convention: - Empty service_name means the
   * overall status of all services at the backend. - Non-empty service_name means the health of
   * that gRPC service, as defined by the owner of the service. The grpc_service_name can only be
   * ASCII.
   * @param grpcServiceName grpcServiceName or {@code null} for none
   */
  public GRPCHealthCheck setGrpcServiceName(java.lang.String grpcServiceName) {
    this.grpcServiceName = grpcServiceName;
    return this;
  }

  /**
   * The port number for the health check request. Must be specified if port_name and
   * port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1
   * through 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The port number for the health check request. Must be specified if port_name and
   * port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1
   * through 65535.
   * @param port port or {@code null} for none
   */
  public GRPCHealthCheck setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence. The port_name should conform to RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortName() {
    return portName;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence. The port_name should conform to RFC1035.
   * @param portName portName or {@code null} for none
   */
  public GRPCHealthCheck setPortName(java.lang.String portName) {
    this.portName = portName;
    return this;
  }

  /**
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The
   * portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port
   * specified for each network endpoint is used for health checking. For other backends, the port
   * or named port specified in the Backend Service is used for health checking. If not specified,
   * gRPC health check follows behavior specified in port and portName fields.
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
   * gRPC health check follows behavior specified in port and portName fields.
   * @param portSpecification portSpecification or {@code null} for none
   */
  public GRPCHealthCheck setPortSpecification(java.lang.String portSpecification) {
    this.portSpecification = portSpecification;
    return this;
  }

  @Override
  public GRPCHealthCheck set(String fieldName, Object value) {
    return (GRPCHealthCheck) super.set(fieldName, value);
  }

  @Override
  public GRPCHealthCheck clone() {
    return (GRPCHealthCheck) super.clone();
  }

}
