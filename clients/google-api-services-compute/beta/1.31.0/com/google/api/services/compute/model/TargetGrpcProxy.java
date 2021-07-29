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
 * Represents a Target gRPC Proxy resource. A target gRPC proxy is a component of load balancers
 * intended for load balancing gRPC traffic. Only global forwarding rules with load balancing scheme
 * INTERNAL_SELF_MANAGED can reference a target gRPC proxy. The target gRPC Proxy references a URL
 * map that specifies how traffic is routed to gRPC backend services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetGrpcProxy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An up-to-
   * date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the
   * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get()
   * request to retrieve the TargetGrpcProxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#targetGrpcProxy for target grpc proxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * URL to the UrlMap resource that defines the mapping from URL to the BackendService. The
   * protocol field in the BackendService must be set to GRPC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlMap;

  /**
   * If true, indicates that the BackendServices referenced by the urlMap may be accessed by gRPC
   * applications without using a sidecar proxy. This will enable configuration checks on urlMap and
   * its referenced BackendServices to not allow unsupported features. A gRPC application must use
   * "xds:" scheme in the target URI of the service it is connecting to. If false, indicates that
   * the BackendServices referenced by the urlMap will be accessed by gRPC applications via a
   * sidecar proxy. In this case, a gRPC application must not use "xds:" scheme in the target URI of
   * the service it is connecting to
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateForProxyless;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public TargetGrpcProxy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public TargetGrpcProxy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An up-to-
   * date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the
   * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get()
   * request to retrieve the TargetGrpcProxy.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An up-to-
   * date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the
   * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get()
   * request to retrieve the TargetGrpcProxy.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An up-to-
   * date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the
   * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get()
   * request to retrieve the TargetGrpcProxy.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public TargetGrpcProxy setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An up-to-
   * date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the
   * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get()
   * request to retrieve the TargetGrpcProxy.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public TargetGrpcProxy encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @param id id or {@code null} for none
   */
  public TargetGrpcProxy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetGrpcProxy for target grpc proxies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetGrpcProxy for target grpc proxies.
   * @param kind kind or {@code null} for none
   */
  public TargetGrpcProxy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public TargetGrpcProxy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public TargetGrpcProxy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public TargetGrpcProxy setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * URL to the UrlMap resource that defines the mapping from URL to the BackendService. The
   * protocol field in the BackendService must be set to GRPC.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlMap() {
    return urlMap;
  }

  /**
   * URL to the UrlMap resource that defines the mapping from URL to the BackendService. The
   * protocol field in the BackendService must be set to GRPC.
   * @param urlMap urlMap or {@code null} for none
   */
  public TargetGrpcProxy setUrlMap(java.lang.String urlMap) {
    this.urlMap = urlMap;
    return this;
  }

  /**
   * If true, indicates that the BackendServices referenced by the urlMap may be accessed by gRPC
   * applications without using a sidecar proxy. This will enable configuration checks on urlMap and
   * its referenced BackendServices to not allow unsupported features. A gRPC application must use
   * "xds:" scheme in the target URI of the service it is connecting to. If false, indicates that
   * the BackendServices referenced by the urlMap will be accessed by gRPC applications via a
   * sidecar proxy. In this case, a gRPC application must not use "xds:" scheme in the target URI of
   * the service it is connecting to
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateForProxyless() {
    return validateForProxyless;
  }

  /**
   * If true, indicates that the BackendServices referenced by the urlMap may be accessed by gRPC
   * applications without using a sidecar proxy. This will enable configuration checks on urlMap and
   * its referenced BackendServices to not allow unsupported features. A gRPC application must use
   * "xds:" scheme in the target URI of the service it is connecting to. If false, indicates that
   * the BackendServices referenced by the urlMap will be accessed by gRPC applications via a
   * sidecar proxy. In this case, a gRPC application must not use "xds:" scheme in the target URI of
   * the service it is connecting to
   * @param validateForProxyless validateForProxyless or {@code null} for none
   */
  public TargetGrpcProxy setValidateForProxyless(java.lang.Boolean validateForProxyless) {
    this.validateForProxyless = validateForProxyless;
    return this;
  }

  @Override
  public TargetGrpcProxy set(String fieldName, Object value) {
    return (TargetGrpcProxy) super.set(fieldName, value);
  }

  @Override
  public TargetGrpcProxy clone() {
    return (TargetGrpcProxy) super.clone();
  }

}
