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

package com.google.api.services.iap.v1.model;

/**
 * A TunnelDestGroup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TunnelDestGroup extends com.google.api.client.json.GenericJson {

  /**
   * null List of CIDRs that this group applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> cidrs;

  /**
   * null List of FQDNs that this group applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fqdns;

  /**
   * Required. Immutable. Identifier for the TunnelDestGroup. Must be unique within the project and
   * contain only lower case letters (a-z) and dashes (-).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * null List of CIDRs that this group applies to.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCidrs() {
    return cidrs;
  }

  /**
   * null List of CIDRs that this group applies to.
   * @param cidrs cidrs or {@code null} for none
   */
  public TunnelDestGroup setCidrs(java.util.List<java.lang.String> cidrs) {
    this.cidrs = cidrs;
    return this;
  }

  /**
   * null List of FQDNs that this group applies to.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFqdns() {
    return fqdns;
  }

  /**
   * null List of FQDNs that this group applies to.
   * @param fqdns fqdns or {@code null} for none
   */
  public TunnelDestGroup setFqdns(java.util.List<java.lang.String> fqdns) {
    this.fqdns = fqdns;
    return this;
  }

  /**
   * Required. Immutable. Identifier for the TunnelDestGroup. Must be unique within the project and
   * contain only lower case letters (a-z) and dashes (-).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Immutable. Identifier for the TunnelDestGroup. Must be unique within the project and
   * contain only lower case letters (a-z) and dashes (-).
   * @param name name or {@code null} for none
   */
  public TunnelDestGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public TunnelDestGroup set(String fieldName, Object value) {
    return (TunnelDestGroup) super.set(fieldName, value);
  }

  @Override
  public TunnelDestGroup clone() {
    return (TunnelDestGroup) super.clone();
  }

}
