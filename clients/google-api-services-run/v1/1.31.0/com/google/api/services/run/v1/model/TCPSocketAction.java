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

package com.google.api.services.run.v1.model;

/**
 * Not supported by Cloud Run TCPSocketAction describes an action based on opening a socket
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TCPSocketAction extends com.google.api.client.json.GenericJson {

  /**
   * (Optional) Optional: Host name to connect to, defaults to the pod IP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535.
   * Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of
   * proto's inability to properly support the IntOrString golang type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * (Optional) Optional: Host name to connect to, defaults to the pod IP.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * (Optional) Optional: Host name to connect to, defaults to the pod IP.
   * @param host host or {@code null} for none
   */
  public TCPSocketAction setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535.
   * Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of
   * proto's inability to properly support the IntOrString golang type.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535.
   * Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of
   * proto's inability to properly support the IntOrString golang type.
   * @param port port or {@code null} for none
   */
  public TCPSocketAction setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  @Override
  public TCPSocketAction set(String fieldName, Object value) {
    return (TCPSocketAction) super.set(fieldName, value);
  }

  @Override
  public TCPSocketAction clone() {
    return (TCPSocketAction) super.clone();
  }

}
