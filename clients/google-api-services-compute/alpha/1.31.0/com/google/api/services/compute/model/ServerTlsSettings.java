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
 * The TLS settings for the server.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServerTlsSettings extends com.google.api.client.json.GenericJson {

  /**
   * Configures the mechanism to obtain security certificates and identity information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TlsContext proxyTlsContext;

  /**
   * A list of alternate names to verify the subject identity in the certificate presented by the
   * client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subjectAltNames;

  /**
   * Indicates whether connections should be secured using TLS. The value of this field determines
   * how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections
   * with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by
   * presenting client certificates for authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tlsMode;

  /**
   * Configures the mechanism to obtain security certificates and identity information.
   * @return value or {@code null} for none
   */
  public TlsContext getProxyTlsContext() {
    return proxyTlsContext;
  }

  /**
   * Configures the mechanism to obtain security certificates and identity information.
   * @param proxyTlsContext proxyTlsContext or {@code null} for none
   */
  public ServerTlsSettings setProxyTlsContext(TlsContext proxyTlsContext) {
    this.proxyTlsContext = proxyTlsContext;
    return this;
  }

  /**
   * A list of alternate names to verify the subject identity in the certificate presented by the
   * client.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubjectAltNames() {
    return subjectAltNames;
  }

  /**
   * A list of alternate names to verify the subject identity in the certificate presented by the
   * client.
   * @param subjectAltNames subjectAltNames or {@code null} for none
   */
  public ServerTlsSettings setSubjectAltNames(java.util.List<java.lang.String> subjectAltNames) {
    this.subjectAltNames = subjectAltNames;
    return this;
  }

  /**
   * Indicates whether connections should be secured using TLS. The value of this field determines
   * how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections
   * with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by
   * presenting client certificates for authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getTlsMode() {
    return tlsMode;
  }

  /**
   * Indicates whether connections should be secured using TLS. The value of this field determines
   * how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections
   * with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by
   * presenting client certificates for authentication.
   * @param tlsMode tlsMode or {@code null} for none
   */
  public ServerTlsSettings setTlsMode(java.lang.String tlsMode) {
    this.tlsMode = tlsMode;
    return this;
  }

  @Override
  public ServerTlsSettings set(String fieldName, Object value) {
    return (ServerTlsSettings) super.set(fieldName, value);
  }

  @Override
  public ServerTlsSettings clone() {
    return (ServerTlsSettings) super.clone();
  }

}
