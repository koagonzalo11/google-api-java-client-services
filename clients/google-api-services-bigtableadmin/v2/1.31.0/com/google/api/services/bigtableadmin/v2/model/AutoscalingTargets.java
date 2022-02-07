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
 * The Autoscaling targets for a Cluster. These determine the recommended nodes.
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
public final class AutoscalingTargets extends com.google.api.client.json.GenericJson {

  /**
   * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale
   * from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cpuUtilizationPercent;

  /**
   * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale
   * from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCpuUtilizationPercent() {
    return cpuUtilizationPercent;
  }

  /**
   * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale
   * from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80.
   * @param cpuUtilizationPercent cpuUtilizationPercent or {@code null} for none
   */
  public AutoscalingTargets setCpuUtilizationPercent(java.lang.Integer cpuUtilizationPercent) {
    this.cpuUtilizationPercent = cpuUtilizationPercent;
    return this;
  }

  @Override
  public AutoscalingTargets set(String fieldName, Object value) {
    return (AutoscalingTargets) super.set(fieldName, value);
  }

  @Override
  public AutoscalingTargets clone() {
    return (AutoscalingTargets) super.clone();
  }

}
