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
 * Represents a Cloud Storage Bucket resource. This Cloud Storage bucket resource is referenced by a
 * URL map of a load balancer. For more information, read Backend Buckets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendBucket extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage bucket name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketName;

  /**
   * Cloud CDN configuration for this BackendBucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackendBucketCdnPolicy cdnPolicy;

  /**
   * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding
   * header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compressionMode;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * Headers that the HTTP/S load balancer should add to proxied responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> customResponseHeaders;

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The resource URL for the edge security policy associated with this backend
   * bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String edgeSecurityPolicy;

  /**
   * If true, enable Cloud CDN for this BackendBucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableCdn;

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Type of the resource.
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
   * Cloud Storage bucket name.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketName() {
    return bucketName;
  }

  /**
   * Cloud Storage bucket name.
   * @param bucketName bucketName or {@code null} for none
   */
  public BackendBucket setBucketName(java.lang.String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Cloud CDN configuration for this BackendBucket.
   * @return value or {@code null} for none
   */
  public BackendBucketCdnPolicy getCdnPolicy() {
    return cdnPolicy;
  }

  /**
   * Cloud CDN configuration for this BackendBucket.
   * @param cdnPolicy cdnPolicy or {@code null} for none
   */
  public BackendBucket setCdnPolicy(BackendBucketCdnPolicy cdnPolicy) {
    this.cdnPolicy = cdnPolicy;
    return this;
  }

  /**
   * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding
   * header.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompressionMode() {
    return compressionMode;
  }

  /**
   * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding
   * header.
   * @param compressionMode compressionMode or {@code null} for none
   */
  public BackendBucket setCompressionMode(java.lang.String compressionMode) {
    this.compressionMode = compressionMode;
    return this;
  }

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
  public BackendBucket setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Headers that the HTTP/S load balancer should add to proxied responses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCustomResponseHeaders() {
    return customResponseHeaders;
  }

  /**
   * Headers that the HTTP/S load balancer should add to proxied responses.
   * @param customResponseHeaders customResponseHeaders or {@code null} for none
   */
  public BackendBucket setCustomResponseHeaders(java.util.List<java.lang.String> customResponseHeaders) {
    this.customResponseHeaders = customResponseHeaders;
    return this;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @param description description or {@code null} for none
   */
  public BackendBucket setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The resource URL for the edge security policy associated with this backend
   * bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getEdgeSecurityPolicy() {
    return edgeSecurityPolicy;
  }

  /**
   * [Output Only] The resource URL for the edge security policy associated with this backend
   * bucket.
   * @param edgeSecurityPolicy edgeSecurityPolicy or {@code null} for none
   */
  public BackendBucket setEdgeSecurityPolicy(java.lang.String edgeSecurityPolicy) {
    this.edgeSecurityPolicy = edgeSecurityPolicy;
    return this;
  }

  /**
   * If true, enable Cloud CDN for this BackendBucket.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableCdn() {
    return enableCdn;
  }

  /**
   * If true, enable Cloud CDN for this BackendBucket.
   * @param enableCdn enableCdn or {@code null} for none
   */
  public BackendBucket setEnableCdn(java.lang.Boolean enableCdn) {
    this.enableCdn = enableCdn;
    return this;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @param id id or {@code null} for none
   */
  public BackendBucket setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of the resource.
   * @param kind kind or {@code null} for none
   */
  public BackendBucket setKind(java.lang.String kind) {
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
  public BackendBucket setName(java.lang.String name) {
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
  public BackendBucket setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public BackendBucket set(String fieldName, Object value) {
    return (BackendBucket) super.set(fieldName, value);
  }

  @Override
  public BackendBucket clone() {
    return (BackendBucket) super.clone();
  }

}
