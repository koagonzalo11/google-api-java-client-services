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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * Report data for each row. For example if RunReportRequest contains: ```none "dimensions": [ {
 * "name": "eventName" }, { "name": "countryId" } ], "metrics": [ { "name": "eventCount" } ] ``` One
 * row with 'in_app_purchase' as the eventName, 'JP' as the countryId, and 15 as the eventCount,
 * would be: ```none "dimensionValues": [ { "value": "in_app_purchase" }, { "value": "JP" } ],
 * "metricValues": [ { "value": "15" } ] ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Row extends com.google.api.client.json.GenericJson {

  /**
   * List of requested dimension values. In a PivotReport, dimension_values are only listed for
   * dimensions included in a pivot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DimensionValue> dimensionValues;

  static {
    // hack to force ProGuard to consider DimensionValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DimensionValue.class);
  }

  /**
   * List of requested visible metric values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricValue> metricValues;

  static {
    // hack to force ProGuard to consider MetricValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricValue.class);
  }

  /**
   * List of requested dimension values. In a PivotReport, dimension_values are only listed for
   * dimensions included in a pivot.
   * @return value or {@code null} for none
   */
  public java.util.List<DimensionValue> getDimensionValues() {
    return dimensionValues;
  }

  /**
   * List of requested dimension values. In a PivotReport, dimension_values are only listed for
   * dimensions included in a pivot.
   * @param dimensionValues dimensionValues or {@code null} for none
   */
  public Row setDimensionValues(java.util.List<DimensionValue> dimensionValues) {
    this.dimensionValues = dimensionValues;
    return this;
  }

  /**
   * List of requested visible metric values.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricValue> getMetricValues() {
    return metricValues;
  }

  /**
   * List of requested visible metric values.
   * @param metricValues metricValues or {@code null} for none
   */
  public Row setMetricValues(java.util.List<MetricValue> metricValues) {
    this.metricValues = metricValues;
    return this;
  }

  @Override
  public Row set(String fieldName, Object value) {
    return (Row) super.set(fieldName, value);
  }

  @Override
  public Row clone() {
    return (Row) super.clone();
  }

}
