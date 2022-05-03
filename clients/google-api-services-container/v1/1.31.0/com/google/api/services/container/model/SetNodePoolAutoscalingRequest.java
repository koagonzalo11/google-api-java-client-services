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

package com.google.api.services.container.model;

/**
 * SetNodePoolAutoscalingRequest sets the autoscaler settings of a node pool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetNodePoolAutoscalingRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Autoscaling configuration for the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodePoolAutoscaling autoscaling;

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The name (project, location, cluster, node pool) of the node pool to set autoscaler settings.
   * Specified in the format `projects/locations/clusters/nodePools`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodePoolId;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field
   * has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. Autoscaling configuration for the node pool.
   * @return value or {@code null} for none
   */
  public NodePoolAutoscaling getAutoscaling() {
    return autoscaling;
  }

  /**
   * Required. Autoscaling configuration for the node pool.
   * @param autoscaling autoscaling or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setAutoscaling(NodePoolAutoscaling autoscaling) {
    this.autoscaling = autoscaling;
    return this;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to set autoscaler settings.
   * Specified in the format `projects/locations/clusters/nodePools`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to set autoscaler settings.
   * Specified in the format `projects/locations/clusters/nodePools`.
   * @param name name or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodePoolId() {
    return nodePoolId;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @param nodePoolId nodePoolId or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setNodePoolId(java.lang.String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field
   * has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field
   * has been deprecated and replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public SetNodePoolAutoscalingRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public SetNodePoolAutoscalingRequest set(String fieldName, Object value) {
    return (SetNodePoolAutoscalingRequest) super.set(fieldName, value);
  }

  @Override
  public SetNodePoolAutoscalingRequest clone() {
    return (SetNodePoolAutoscalingRequest) super.clone();
  }

}
