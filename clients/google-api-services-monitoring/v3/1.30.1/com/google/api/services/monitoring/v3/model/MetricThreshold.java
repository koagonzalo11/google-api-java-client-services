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

package com.google.api.services.monitoring.v3.model;

/**
 * A condition type that compares a collection of time series against a threshold.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricThreshold extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the alignment of data points in individual time series as well as how to combine the
   * retrieved time series together (such as when aggregating multiple streams on each resource to a
   * single stream for each resource or when aggregating streams across all members of a group of
   * resrouces). Multiple aggregations are applied in the order specified.This field is similar to
   * the one in the ListTimeSeries request. It is advisable to use the ListTimeSeries method when
   * debugging this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Aggregation> aggregations;

  static {
    // hack to force ProGuard to consider Aggregation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Aggregation.class);
  }

  /**
   * The comparison to apply between the time series (indicated by filter and aggregation) and the
   * threshold (indicated by threshold_value). The comparison is applied on each time series, with
   * the time series on the left-hand side and the threshold on the right-hand side.Only
   * COMPARISON_LT and COMPARISON_GT are supported currently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comparison;

  /**
   * Specifies the alignment of data points in individual time series selected by denominatorFilter
   * as well as how to combine the retrieved time series together (such as when aggregating multiple
   * streams on each resource to a single stream for each resource or when aggregating streams
   * across all members of a group of resources).When computing ratios, the aggregations and
   * denominator_aggregations fields must use the same alignment period and produce time series that
   * have the same periodicity and labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Aggregation> denominatorAggregations;

  static {
    // hack to force ProGuard to consider Aggregation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Aggregation.class);
  }

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series
   * that should be used as the denominator of a ratio that will be compared with the threshold. If
   * a denominator_filter is specified, the time series specified by the filter field will be used
   * as the numerator.The filter must specify the metric type and optionally may contain
   * restrictions on resource type, resource labels, and metric labels. This field may not exceed
   * 2048 Unicode characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String denominatorFilter;

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series
   * should be compared with the threshold.The filter is similar to the one that is specified in the
   * ListTimeSeries request (that call is useful to verify the time series that will be retrieved /
   * processed) and must specify the metric type and optionally may contain restrictions on resource
   * type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in
   * length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * A value against which to compare the time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double thresholdValue;

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Trigger trigger;

  /**
   * Specifies the alignment of data points in individual time series as well as how to combine the
   * retrieved time series together (such as when aggregating multiple streams on each resource to a
   * single stream for each resource or when aggregating streams across all members of a group of
   * resrouces). Multiple aggregations are applied in the order specified.This field is similar to
   * the one in the ListTimeSeries request. It is advisable to use the ListTimeSeries method when
   * debugging this field.
   * @return value or {@code null} for none
   */
  public java.util.List<Aggregation> getAggregations() {
    return aggregations;
  }

  /**
   * Specifies the alignment of data points in individual time series as well as how to combine the
   * retrieved time series together (such as when aggregating multiple streams on each resource to a
   * single stream for each resource or when aggregating streams across all members of a group of
   * resrouces). Multiple aggregations are applied in the order specified.This field is similar to
   * the one in the ListTimeSeries request. It is advisable to use the ListTimeSeries method when
   * debugging this field.
   * @param aggregations aggregations or {@code null} for none
   */
  public MetricThreshold setAggregations(java.util.List<Aggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  /**
   * The comparison to apply between the time series (indicated by filter and aggregation) and the
   * threshold (indicated by threshold_value). The comparison is applied on each time series, with
   * the time series on the left-hand side and the threshold on the right-hand side.Only
   * COMPARISON_LT and COMPARISON_GT are supported currently.
   * @return value or {@code null} for none
   */
  public java.lang.String getComparison() {
    return comparison;
  }

  /**
   * The comparison to apply between the time series (indicated by filter and aggregation) and the
   * threshold (indicated by threshold_value). The comparison is applied on each time series, with
   * the time series on the left-hand side and the threshold on the right-hand side.Only
   * COMPARISON_LT and COMPARISON_GT are supported currently.
   * @param comparison comparison or {@code null} for none
   */
  public MetricThreshold setComparison(java.lang.String comparison) {
    this.comparison = comparison;
    return this;
  }

  /**
   * Specifies the alignment of data points in individual time series selected by denominatorFilter
   * as well as how to combine the retrieved time series together (such as when aggregating multiple
   * streams on each resource to a single stream for each resource or when aggregating streams
   * across all members of a group of resources).When computing ratios, the aggregations and
   * denominator_aggregations fields must use the same alignment period and produce time series that
   * have the same periodicity and labels.
   * @return value or {@code null} for none
   */
  public java.util.List<Aggregation> getDenominatorAggregations() {
    return denominatorAggregations;
  }

  /**
   * Specifies the alignment of data points in individual time series selected by denominatorFilter
   * as well as how to combine the retrieved time series together (such as when aggregating multiple
   * streams on each resource to a single stream for each resource or when aggregating streams
   * across all members of a group of resources).When computing ratios, the aggregations and
   * denominator_aggregations fields must use the same alignment period and produce time series that
   * have the same periodicity and labels.
   * @param denominatorAggregations denominatorAggregations or {@code null} for none
   */
  public MetricThreshold setDenominatorAggregations(java.util.List<Aggregation> denominatorAggregations) {
    this.denominatorAggregations = denominatorAggregations;
    return this;
  }

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series
   * that should be used as the denominator of a ratio that will be compared with the threshold. If
   * a denominator_filter is specified, the time series specified by the filter field will be used
   * as the numerator.The filter must specify the metric type and optionally may contain
   * restrictions on resource type, resource labels, and metric labels. This field may not exceed
   * 2048 Unicode characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getDenominatorFilter() {
    return denominatorFilter;
  }

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series
   * that should be used as the denominator of a ratio that will be compared with the threshold. If
   * a denominator_filter is specified, the time series specified by the filter field will be used
   * as the numerator.The filter must specify the metric type and optionally may contain
   * restrictions on resource type, resource labels, and metric labels. This field may not exceed
   * 2048 Unicode characters in length.
   * @param denominatorFilter denominatorFilter or {@code null} for none
   */
  public MetricThreshold setDenominatorFilter(java.lang.String denominatorFilter) {
    this.denominatorFilter = denominatorFilter;
    return this;
  }

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * @param duration duration or {@code null} for none
   */
  public MetricThreshold setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series
   * should be compared with the threshold.The filter is similar to the one that is specified in the
   * ListTimeSeries request (that call is useful to verify the time series that will be retrieved /
   * processed) and must specify the metric type and optionally may contain restrictions on resource
   * type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in
   * length.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series
   * should be compared with the threshold.The filter is similar to the one that is specified in the
   * ListTimeSeries request (that call is useful to verify the time series that will be retrieved /
   * processed) and must specify the metric type and optionally may contain restrictions on resource
   * type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in
   * length.
   * @param filter filter or {@code null} for none
   */
  public MetricThreshold setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * A value against which to compare the time series.
   * @return value or {@code null} for none
   */
  public java.lang.Double getThresholdValue() {
    return thresholdValue;
  }

  /**
   * A value against which to compare the time series.
   * @param thresholdValue thresholdValue or {@code null} for none
   */
  public MetricThreshold setThresholdValue(java.lang.Double thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * @return value or {@code null} for none
   */
  public Trigger getTrigger() {
    return trigger;
  }

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * @param trigger trigger or {@code null} for none
   */
  public MetricThreshold setTrigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  @Override
  public MetricThreshold set(String fieldName, Object value) {
    return (MetricThreshold) super.set(fieldName, value);
  }

  @Override
  public MetricThreshold clone() {
    return (MetricThreshold) super.clone();
  }

}
