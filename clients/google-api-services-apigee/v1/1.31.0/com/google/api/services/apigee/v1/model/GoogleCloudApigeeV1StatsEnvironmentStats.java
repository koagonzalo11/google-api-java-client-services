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

package com.google.api.services.apigee.v1.model;

/**
 * Encapsulates the environment wrapper: ``` "environments": [ { "metrics": [ { "name":
 * "sum(message_count)", "values": [ "2.52056245E8" ] } ], "name": "prod" } ]```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1StatsEnvironmentStats extends com.google.api.client.json.GenericJson {

  /**
   * List of metrics grouped under dimensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1DimensionMetric> dimensions;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1DimensionMetric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1DimensionMetric.class);
  }

  /**
   * In the final response, only one of the following fields will be present based on the dimensions
   * provided. If no dimensions are provided, then only top-level metrics is provided. If dimensions
   * are included, then there will be a top-level dimensions field under environments which will
   * contain metrics values and the dimension name. Example: ``` "environments": [ { "dimensions": [
   * { "metrics": [ { "name": "sum(message_count)", "values": [ "2.14049521E8" ] } ], "name":
   * "nit_proxy" } ], "name": "prod" } ]``` or ```"environments": [ { "metrics": [ { "name":
   * "sum(message_count)", "values": [ "2.19026331E8" ] } ], "name": "prod" } ]``` List of metric
   * values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Metric> metrics;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Metric.class);
  }

  /**
   * Name of the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of metrics grouped under dimensions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1DimensionMetric> getDimensions() {
    return dimensions;
  }

  /**
   * List of metrics grouped under dimensions.
   * @param dimensions dimensions or {@code null} for none
   */
  public GoogleCloudApigeeV1StatsEnvironmentStats setDimensions(java.util.List<GoogleCloudApigeeV1DimensionMetric> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * In the final response, only one of the following fields will be present based on the dimensions
   * provided. If no dimensions are provided, then only top-level metrics is provided. If dimensions
   * are included, then there will be a top-level dimensions field under environments which will
   * contain metrics values and the dimension name. Example: ``` "environments": [ { "dimensions": [
   * { "metrics": [ { "name": "sum(message_count)", "values": [ "2.14049521E8" ] } ], "name":
   * "nit_proxy" } ], "name": "prod" } ]``` or ```"environments": [ { "metrics": [ { "name":
   * "sum(message_count)", "values": [ "2.19026331E8" ] } ], "name": "prod" } ]``` List of metric
   * values.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Metric> getMetrics() {
    return metrics;
  }

  /**
   * In the final response, only one of the following fields will be present based on the dimensions
   * provided. If no dimensions are provided, then only top-level metrics is provided. If dimensions
   * are included, then there will be a top-level dimensions field under environments which will
   * contain metrics values and the dimension name. Example: ``` "environments": [ { "dimensions": [
   * { "metrics": [ { "name": "sum(message_count)", "values": [ "2.14049521E8" ] } ], "name":
   * "nit_proxy" } ], "name": "prod" } ]``` or ```"environments": [ { "metrics": [ { "name":
   * "sum(message_count)", "values": [ "2.19026331E8" ] } ], "name": "prod" } ]``` List of metric
   * values.
   * @param metrics metrics or {@code null} for none
   */
  public GoogleCloudApigeeV1StatsEnvironmentStats setMetrics(java.util.List<GoogleCloudApigeeV1Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Name of the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the environment.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1StatsEnvironmentStats setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1StatsEnvironmentStats set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1StatsEnvironmentStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1StatsEnvironmentStats clone() {
    return (GoogleCloudApigeeV1StatsEnvironmentStats) super.clone();
  }

}
