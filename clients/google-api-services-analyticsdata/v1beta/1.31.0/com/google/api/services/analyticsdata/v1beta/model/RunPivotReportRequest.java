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
 * The request to generate a pivot report.
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
public final class RunPivotReportRequest extends com.google.api.client.json.GenericJson {

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CohortSpec cohortSpec;

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * The date range to retrieve event data for the report. If multiple date ranges are specified,
   * event data from each date range is used in the report. A special dimension with field name
   * "dateRange" can be included in a Pivot's field names; if included, the report compares between
   * date ranges. In a cohort request, this `dateRanges` must be unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DateRange> dateRanges;

  static {
    // hack to force ProGuard to consider DateRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DateRange.class);
  }

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression dimensionFilter;

  /**
   * The dimensions requested. All defined dimensions must be used by one of the following:
   * dimension_expression, dimension_filter, pivots, order_bys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean keepEmptyRows;

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression metricFilter;

  /**
   * The metrics requested, at least one metric needs to be specified. All defined metrics must be
   * used by one of the following: metric_expression, metric_filter, order_bys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  static {
    // hack to force ProGuard to consider Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Metric.class);
  }

  /**
   * Describes the visual format of the report's dimensions in columns or rows. The union of the
   * fieldNames (dimension names) in all pivots must be a subset of dimension names defined in
   * Dimensions. No two pivots can share a dimension. A dimension is only visible if it appears in a
   * pivot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Pivot> pivots;

  static {
    // hack to force ProGuard to consider Pivot used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Pivot.class);
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String property;

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnPropertyQuota;

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * @return value or {@code null} for none
   */
  public CohortSpec getCohortSpec() {
    return cohortSpec;
  }

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * @param cohortSpec cohortSpec or {@code null} for none
   */
  public RunPivotReportRequest setCohortSpec(CohortSpec cohortSpec) {
    this.cohortSpec = cohortSpec;
    return this;
  }

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public RunPivotReportRequest setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The date range to retrieve event data for the report. If multiple date ranges are specified,
   * event data from each date range is used in the report. A special dimension with field name
   * "dateRange" can be included in a Pivot's field names; if included, the report compares between
   * date ranges. In a cohort request, this `dateRanges` must be unspecified.
   * @return value or {@code null} for none
   */
  public java.util.List<DateRange> getDateRanges() {
    return dateRanges;
  }

  /**
   * The date range to retrieve event data for the report. If multiple date ranges are specified,
   * event data from each date range is used in the report. A special dimension with field name
   * "dateRange" can be included in a Pivot's field names; if included, the report compares between
   * date ranges. In a cohort request, this `dateRanges` must be unspecified.
   * @param dateRanges dateRanges or {@code null} for none
   */
  public RunPivotReportRequest setDateRanges(java.util.List<DateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getDimensionFilter() {
    return dimensionFilter;
  }

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * @param dimensionFilter dimensionFilter or {@code null} for none
   */
  public RunPivotReportRequest setDimensionFilter(FilterExpression dimensionFilter) {
    this.dimensionFilter = dimensionFilter;
    return this;
  }

  /**
   * The dimensions requested. All defined dimensions must be used by one of the following:
   * dimension_expression, dimension_filter, pivots, order_bys.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * The dimensions requested. All defined dimensions must be used by one of the following:
   * dimension_expression, dimension_filter, pivots, order_bys.
   * @param dimensions dimensions or {@code null} for none
   */
  public RunPivotReportRequest setDimensions(java.util.List<Dimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKeepEmptyRows() {
    return keepEmptyRows;
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * @param keepEmptyRows keepEmptyRows or {@code null} for none
   */
  public RunPivotReportRequest setKeepEmptyRows(java.lang.Boolean keepEmptyRows) {
    this.keepEmptyRows = keepEmptyRows;
    return this;
  }

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getMetricFilter() {
    return metricFilter;
  }

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * @param metricFilter metricFilter or {@code null} for none
   */
  public RunPivotReportRequest setMetricFilter(FilterExpression metricFilter) {
    this.metricFilter = metricFilter;
    return this;
  }

  /**
   * The metrics requested, at least one metric needs to be specified. All defined metrics must be
   * used by one of the following: metric_expression, metric_filter, order_bys.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * The metrics requested, at least one metric needs to be specified. All defined metrics must be
   * used by one of the following: metric_expression, metric_filter, order_bys.
   * @param metrics metrics or {@code null} for none
   */
  public RunPivotReportRequest setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Describes the visual format of the report's dimensions in columns or rows. The union of the
   * fieldNames (dimension names) in all pivots must be a subset of dimension names defined in
   * Dimensions. No two pivots can share a dimension. A dimension is only visible if it appears in a
   * pivot.
   * @return value or {@code null} for none
   */
  public java.util.List<Pivot> getPivots() {
    return pivots;
  }

  /**
   * Describes the visual format of the report's dimensions in columns or rows. The union of the
   * fieldNames (dimension names) in all pivots must be a subset of dimension names defined in
   * Dimensions. No two pivots can share a dimension. A dimension is only visible if it appears in a
   * pivot.
   * @param pivots pivots or {@code null} for none
   */
  public RunPivotReportRequest setPivots(java.util.List<Pivot> pivots) {
    this.pivots = pivots;
    return this;
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * @return value or {@code null} for none
   */
  public java.lang.String getProperty() {
    return property;
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * @param property property or {@code null} for none
   */
  public RunPivotReportRequest setProperty(java.lang.String property) {
    this.property = property;
    return this;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnPropertyQuota() {
    return returnPropertyQuota;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * @param returnPropertyQuota returnPropertyQuota or {@code null} for none
   */
  public RunPivotReportRequest setReturnPropertyQuota(java.lang.Boolean returnPropertyQuota) {
    this.returnPropertyQuota = returnPropertyQuota;
    return this;
  }

  @Override
  public RunPivotReportRequest set(String fieldName, Object value) {
    return (RunPivotReportRequest) super.set(fieldName, value);
  }

  @Override
  public RunPivotReportRequest clone() {
    return (RunPivotReportRequest) super.clone();
  }

}
