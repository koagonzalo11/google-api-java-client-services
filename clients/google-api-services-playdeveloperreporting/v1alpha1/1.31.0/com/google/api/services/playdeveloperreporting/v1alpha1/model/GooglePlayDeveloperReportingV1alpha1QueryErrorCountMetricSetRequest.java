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

package com.google.api.services.playdeveloperreporting.v1alpha1.model;

/**
 * Request message for QueryErrorCountMetricSet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions to slice the data by. **Supported dimensions:** * `apiLevel` (string): the API level
   * of Android that was running on the user's device. * `versionCode` (int64): version of the app
   * that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): identifier of the device's form factor, e.g.,
   * PHONE. * `reportType` (string): the type of error. The value should correspond to one of the
   * possible values in ErrorType. * `issueId` (string): the id an error was assigned to. The value
   * should correspond to the `{issue}` component of the issue name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Metrics to aggregate. **Supported metrics:** * `errorReportCount` (`google.type.Decimal`):
   * Absolute count of individual error reports that have been received for an app. *
   * `distinctUsers` (`google.type.Decimal`): Count of distinct users for which reports have been
   * received. Care must be taken not to aggregate this count further, as it may result in users
   * being counted multiple times.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100000; values above 100000 will be coerced to 100000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. The default and only supported
   * timezone is `America/Los_Angeles`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePlayDeveloperReportingV1alpha1TimelineSpec timelineSpec;

  /**
   * Dimensions to slice the data by. **Supported dimensions:** * `apiLevel` (string): the API level
   * of Android that was running on the user's device. * `versionCode` (int64): version of the app
   * that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): identifier of the device's form factor, e.g.,
   * PHONE. * `reportType` (string): the type of error. The value should correspond to one of the
   * possible values in ErrorType. * `issueId` (string): the id an error was assigned to. The value
   * should correspond to the `{issue}` component of the issue name.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * Dimensions to slice the data by. **Supported dimensions:** * `apiLevel` (string): the API level
   * of Android that was running on the user's device. * `versionCode` (int64): version of the app
   * that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): identifier of the device's form factor, e.g.,
   * PHONE. * `reportType` (string): the type of error. The value should correspond to one of the
   * possible values in ErrorType. * `issueId` (string): the id an error was assigned to. The value
   * should correspond to the `{issue}` component of the issue name.
   * @param dimensions dimensions or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * @param filter filter or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Metrics to aggregate. **Supported metrics:** * `errorReportCount` (`google.type.Decimal`):
   * Absolute count of individual error reports that have been received for an app. *
   * `distinctUsers` (`google.type.Decimal`): Count of distinct users for which reports have been
   * received. Care must be taken not to aggregate this count further, as it may result in users
   * being counted multiple times.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * Metrics to aggregate. **Supported metrics:** * `errorReportCount` (`google.type.Decimal`):
   * Absolute count of individual error reports that have been received for an app. *
   * `distinctUsers` (`google.type.Decimal`): Count of distinct users for which reports have been
   * received. Care must be taken not to aggregate this count further, as it may result in users
   * being counted multiple times.
   * @param metrics metrics or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100000; values above 100000 will be coerced to 100000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100000; values above 100000 will be coerced to 100000.
   * @param pageSize pageSize or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * @param pageToken pageToken or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. The default and only supported
   * timezone is `America/Los_Angeles`.
   * @return value or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1TimelineSpec getTimelineSpec() {
    return timelineSpec;
  }

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. The default and only supported
   * timezone is `America/Los_Angeles`.
   * @param timelineSpec timelineSpec or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest setTimelineSpec(GooglePlayDeveloperReportingV1alpha1TimelineSpec timelineSpec) {
    this.timelineSpec = timelineSpec;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest clone() {
    return (GooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetRequest) super.clone();
  }

}
