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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * Mesh represents a logical configuration grouping for workload to workload communication within a
 * service mesh. Routes that point to mesh dictate how requests are routed within this logical mesh
 * boundary.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Mesh extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
   * specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
   * be redirected to this port regardless of its actual ip:port destination. If unset, a port
   * '15001' is used as the interception port. This will is applicable only for sidecar proxy
   * deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer interceptionPort;

  /**
   * Optional. Set of label tags associated with the Mesh resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Name of the Mesh resource. It matches pattern `projects/locations/global/meshes/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Server-defined URL of this resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public Mesh setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @param description description or {@code null} for none
   */
  public Mesh setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
   * specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
   * be redirected to this port regardless of its actual ip:port destination. If unset, a port
   * '15001' is used as the interception port. This will is applicable only for sidecar proxy
   * deployments.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInterceptionPort() {
    return interceptionPort;
  }

  /**
   * Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the
   * specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to
   * be redirected to this port regardless of its actual ip:port destination. If unset, a port
   * '15001' is used as the interception port. This will is applicable only for sidecar proxy
   * deployments.
   * @param interceptionPort interceptionPort or {@code null} for none
   */
  public Mesh setInterceptionPort(java.lang.Integer interceptionPort) {
    this.interceptionPort = interceptionPort;
    return this;
  }

  /**
   * Optional. Set of label tags associated with the Mesh resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of label tags associated with the Mesh resource.
   * @param labels labels or {@code null} for none
   */
  public Mesh setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Name of the Mesh resource. It matches pattern `projects/locations/global/meshes/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the Mesh resource. It matches pattern `projects/locations/global/meshes/`.
   * @param name name or {@code null} for none
   */
  public Mesh setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @param selfLink selfLink or {@code null} for none
   */
  public Mesh setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Mesh setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Mesh set(String fieldName, Object value) {
    return (Mesh) super.set(fieldName, value);
  }

  @Override
  public Mesh clone() {
    return (Mesh) super.clone();
  }

}
