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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Autoscaling config for a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterAutoscalingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Autoscaling limits for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingLimits autoscalingLimits;

  /**
   * Required. Autoscaling targets for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingTargets autoscalingTargets;

  /**
   * Required. Autoscaling limits for this cluster.
   * @return value or {@code null} for none
   */
  public AutoscalingLimits getAutoscalingLimits() {
    return autoscalingLimits;
  }

  /**
   * Required. Autoscaling limits for this cluster.
   * @param autoscalingLimits autoscalingLimits or {@code null} for none
   */
  public ClusterAutoscalingConfig setAutoscalingLimits(AutoscalingLimits autoscalingLimits) {
    this.autoscalingLimits = autoscalingLimits;
    return this;
  }

  /**
   * Required. Autoscaling targets for this cluster.
   * @return value or {@code null} for none
   */
  public AutoscalingTargets getAutoscalingTargets() {
    return autoscalingTargets;
  }

  /**
   * Required. Autoscaling targets for this cluster.
   * @param autoscalingTargets autoscalingTargets or {@code null} for none
   */
  public ClusterAutoscalingConfig setAutoscalingTargets(AutoscalingTargets autoscalingTargets) {
    this.autoscalingTargets = autoscalingTargets;
    return this;
  }

  @Override
  public ClusterAutoscalingConfig set(String fieldName, Object value) {
    return (ClusterAutoscalingConfig) super.set(fieldName, value);
  }

  @Override
  public ClusterAutoscalingConfig clone() {
    return (ClusterAutoscalingConfig) super.clone();
  }

}
