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

package com.google.api.services.gkehub.v1beta1.model;

/**
 * KubernetesMetadata provides informational metadata for Memberships representing Kubernetes
 * clusters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KubernetesMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Kubernetes API server version string as reported by '/version'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kubernetesApiServerVersion;

  /**
   * Output only. The total memory capacity as reported by the sum of all Kubernetes nodes
   * resources, defined in MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryMb;

  /**
   * Output only. Node count as reported by Kubernetes nodes resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodeCount;

  /**
   * Output only. Node providerID as reported by the first node in the list of nodes on the
   * Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP),
   * the node_count will be zero and the node_provider_id will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeProviderId;

  /**
   * Output only. The time at which these details were last updated. This update_time is different
   * from the Membership-level update_time since EndpointDetails are updated internally for API
   * consumers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. vCPU count as reported by Kubernetes nodes resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vcpuCount;

  /**
   * Output only. Kubernetes API server version string as reported by '/version'.
   * @return value or {@code null} for none
   */
  public java.lang.String getKubernetesApiServerVersion() {
    return kubernetesApiServerVersion;
  }

  /**
   * Output only. Kubernetes API server version string as reported by '/version'.
   * @param kubernetesApiServerVersion kubernetesApiServerVersion or {@code null} for none
   */
  public KubernetesMetadata setKubernetesApiServerVersion(java.lang.String kubernetesApiServerVersion) {
    this.kubernetesApiServerVersion = kubernetesApiServerVersion;
    return this;
  }

  /**
   * Output only. The total memory capacity as reported by the sum of all Kubernetes nodes
   * resources, defined in MB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * Output only. The total memory capacity as reported by the sum of all Kubernetes nodes
   * resources, defined in MB.
   * @param memoryMb memoryMb or {@code null} for none
   */
  public KubernetesMetadata setMemoryMb(java.lang.Integer memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * Output only. Node count as reported by Kubernetes nodes resources.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Output only. Node count as reported by Kubernetes nodes resources.
   * @param nodeCount nodeCount or {@code null} for none
   */
  public KubernetesMetadata setNodeCount(java.lang.Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * Output only. Node providerID as reported by the first node in the list of nodes on the
   * Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP),
   * the node_count will be zero and the node_provider_id will be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeProviderId() {
    return nodeProviderId;
  }

  /**
   * Output only. Node providerID as reported by the first node in the list of nodes on the
   * Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP),
   * the node_count will be zero and the node_provider_id will be empty.
   * @param nodeProviderId nodeProviderId or {@code null} for none
   */
  public KubernetesMetadata setNodeProviderId(java.lang.String nodeProviderId) {
    this.nodeProviderId = nodeProviderId;
    return this;
  }

  /**
   * Output only. The time at which these details were last updated. This update_time is different
   * from the Membership-level update_time since EndpointDetails are updated internally for API
   * consumers.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which these details were last updated. This update_time is different
   * from the Membership-level update_time since EndpointDetails are updated internally for API
   * consumers.
   * @param updateTime updateTime or {@code null} for none
   */
  public KubernetesMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. vCPU count as reported by Kubernetes nodes resources.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVcpuCount() {
    return vcpuCount;
  }

  /**
   * Output only. vCPU count as reported by Kubernetes nodes resources.
   * @param vcpuCount vcpuCount or {@code null} for none
   */
  public KubernetesMetadata setVcpuCount(java.lang.Integer vcpuCount) {
    this.vcpuCount = vcpuCount;
    return this;
  }

  @Override
  public KubernetesMetadata set(String fieldName, Object value) {
    return (KubernetesMetadata) super.set(fieldName, value);
  }

  @Override
  public KubernetesMetadata clone() {
    return (KubernetesMetadata) super.clone();
  }

}
