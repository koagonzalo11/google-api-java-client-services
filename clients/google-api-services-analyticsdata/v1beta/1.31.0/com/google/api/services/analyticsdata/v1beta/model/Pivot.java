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
 * Describes the visible dimension columns and rows in the report response.
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
public final class Pivot extends com.google.api.client.json.GenericJson {

  /**
   * Dimension names for visible columns in the report response. Including "dateRange" produces a
   * date range column; for each row in the response, dimension values in the date range column will
   * indicate the corresponding date range from the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fieldNames;

  /**
   * The number of unique combinations of dimension values to return in this pivot. The `limit`
   * parameter is required. A `limit` of 10,000 is common for single pivot requests. The product of
   * the `limit` for each `pivot` in a `RunPivotReportRequest` must not exceed 100,000. For example,
   * a two pivot request with `limit: 1000` in each pivot will fail because the product is
   * `1,000,000`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long limit;

  /**
   * Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metricAggregations;

  /**
   * The row count of the start row. The first row is counted as row 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long offset;

  /**
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine
   * Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine only
   * PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderBy> orderBys;

  static {
    // hack to force ProGuard to consider OrderBy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderBy.class);
  }

  /**
   * Dimension names for visible columns in the report response. Including "dateRange" produces a
   * date range column; for each row in the response, dimension values in the date range column will
   * indicate the corresponding date range from the request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFieldNames() {
    return fieldNames;
  }

  /**
   * Dimension names for visible columns in the report response. Including "dateRange" produces a
   * date range column; for each row in the response, dimension values in the date range column will
   * indicate the corresponding date range from the request.
   * @param fieldNames fieldNames or {@code null} for none
   */
  public Pivot setFieldNames(java.util.List<java.lang.String> fieldNames) {
    this.fieldNames = fieldNames;
    return this;
  }

  /**
   * The number of unique combinations of dimension values to return in this pivot. The `limit`
   * parameter is required. A `limit` of 10,000 is common for single pivot requests. The product of
   * the `limit` for each `pivot` in a `RunPivotReportRequest` must not exceed 100,000. For example,
   * a two pivot request with `limit: 1000` in each pivot will fail because the product is
   * `1,000,000`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLimit() {
    return limit;
  }

  /**
   * The number of unique combinations of dimension values to return in this pivot. The `limit`
   * parameter is required. A `limit` of 10,000 is common for single pivot requests. The product of
   * the `limit` for each `pivot` in a `RunPivotReportRequest` must not exceed 100,000. For example,
   * a two pivot request with `limit: 1000` in each pivot will fail because the product is
   * `1,000,000`.
   * @param limit limit or {@code null} for none
   */
  public Pivot setLimit(java.lang.Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetricAggregations() {
    return metricAggregations;
  }

  /**
   * Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations.
   * @param metricAggregations metricAggregations or {@code null} for none
   */
  public Pivot setMetricAggregations(java.util.List<java.lang.String> metricAggregations) {
    this.metricAggregations = metricAggregations;
    return this;
  }

  /**
   * The row count of the start row. The first row is counted as row 0.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * The row count of the start row. The first row is counted as row 0.
   * @param offset offset or {@code null} for none
   */
  public Pivot setOffset(java.lang.Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine
   * Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine only
   * PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderBy> getOrderBys() {
    return orderBys;
  }

  /**
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine
   * Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine only
   * PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * @param orderBys orderBys or {@code null} for none
   */
  public Pivot setOrderBys(java.util.List<OrderBy> orderBys) {
    this.orderBys = orderBys;
    return this;
  }

  @Override
  public Pivot set(String fieldName, Object value) {
    return (Pivot) super.set(fieldName, value);
  }

  @Override
  public Pivot clone() {
    return (Pivot) super.clone();
  }

}
