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

package com.google.api.services.mybusinessbusinessinformation.v1.model;

/**
 * Represents a single time period when a location's operational hours differ from its normal
 * business hours. A special hour period must represent a range of less than 24 hours. The
 * `open_time` and `start_date` must predate the `close_time` and `end_date`. The `close_time` and
 * `end_date` can extend to 11:59 a.m. on the day after the specified `start_date`. For example, the
 * following inputs are valid: start_date=2015-11-23, open_time=08:00, close_time=18:00
 * start_date=2015-11-23, end_date=2015-11-23, open_time=08:00, close_time=18:00
 * start_date=2015-11-23, end_date=2015-11-24, open_time=13:00, close_time=11:59 The following
 * inputs are not valid: start_date=2015-11-23, open_time=13:00, close_time=11:59
 * start_date=2015-11-23, end_date=2015-11-24, open_time=13:00, close_time=12:00
 * start_date=2015-11-23, end_date=2015-11-25, open_time=08:00, close_time=18:00
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Business Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpecialHourPeriod extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay closeTime;

  /**
   * Optional. If true, `end_date`, `open_time`, and `close_time` are ignored, and the date
   * specified in `start_date` is treated as the location being closed for the entire day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean closed;

  /**
   * Optional. The calendar date this special hour period ends on. If `end_date` field is not set,
   * default to the date specified in `start_date`. If set, this field must be equal to or at most 1
   * day after `start_date`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date endDate;

  /**
   * Optional. Valid values are 00:00-24:00 where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay openTime;

  /**
   * Required. The calendar date this special hour period starts on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date startDate;

  /**
   * Optional. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * @return value or {@code null} for none
   */
  public TimeOfDay getCloseTime() {
    return closeTime;
  }

  /**
   * Optional. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * @param closeTime closeTime or {@code null} for none
   */
  public SpecialHourPeriod setCloseTime(TimeOfDay closeTime) {
    this.closeTime = closeTime;
    return this;
  }

  /**
   * Optional. If true, `end_date`, `open_time`, and `close_time` are ignored, and the date
   * specified in `start_date` is treated as the location being closed for the entire day.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClosed() {
    return closed;
  }

  /**
   * Optional. If true, `end_date`, `open_time`, and `close_time` are ignored, and the date
   * specified in `start_date` is treated as the location being closed for the entire day.
   * @param closed closed or {@code null} for none
   */
  public SpecialHourPeriod setClosed(java.lang.Boolean closed) {
    this.closed = closed;
    return this;
  }

  /**
   * Optional. The calendar date this special hour period ends on. If `end_date` field is not set,
   * default to the date specified in `start_date`. If set, this field must be equal to or at most 1
   * day after `start_date`.
   * @return value or {@code null} for none
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Optional. The calendar date this special hour period ends on. If `end_date` field is not set,
   * default to the date specified in `start_date`. If set, this field must be equal to or at most 1
   * day after `start_date`.
   * @param endDate endDate or {@code null} for none
   */
  public SpecialHourPeriod setEndDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Optional. Valid values are 00:00-24:00 where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * @return value or {@code null} for none
   */
  public TimeOfDay getOpenTime() {
    return openTime;
  }

  /**
   * Optional. Valid values are 00:00-24:00 where 24:00 represents midnight at the end of the
   * specified day field. Must be specified if `closed` is false.
   * @param openTime openTime or {@code null} for none
   */
  public SpecialHourPeriod setOpenTime(TimeOfDay openTime) {
    this.openTime = openTime;
    return this;
  }

  /**
   * Required. The calendar date this special hour period starts on.
   * @return value or {@code null} for none
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Required. The calendar date this special hour period starts on.
   * @param startDate startDate or {@code null} for none
   */
  public SpecialHourPeriod setStartDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public SpecialHourPeriod set(String fieldName, Object value) {
    return (SpecialHourPeriod) super.set(fieldName, value);
  }

  @Override
  public SpecialHourPeriod clone() {
    return (SpecialHourPeriod) super.clone();
  }

}
