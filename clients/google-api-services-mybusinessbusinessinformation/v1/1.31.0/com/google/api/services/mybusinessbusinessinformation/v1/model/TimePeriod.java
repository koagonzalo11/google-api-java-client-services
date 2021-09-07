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
 * Represents a span of time that the business is open, starting on the specified open day/time and
 * closing on the specified close day/time. The closing time must occur after the opening time, for
 * example later in the same day, or on a subsequent day.
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
public final class TimePeriod extends com.google.api.client.json.GenericJson {

  /**
   * Required. Indicates the day of the week this period ends on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String closeDay;

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay closeTime;

  /**
   * Required. Indicates the day of the week this period starts on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String openDay;

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay openTime;

  /**
   * Required. Indicates the day of the week this period ends on.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloseDay() {
    return closeDay;
  }

  /**
   * Required. Indicates the day of the week this period ends on.
   * @param closeDay closeDay or {@code null} for none
   */
  public TimePeriod setCloseDay(java.lang.String closeDay) {
    this.closeDay = closeDay;
    return this;
  }

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * @return value or {@code null} for none
   */
  public TimeOfDay getCloseTime() {
    return closeTime;
  }

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * @param closeTime closeTime or {@code null} for none
   */
  public TimePeriod setCloseTime(TimeOfDay closeTime) {
    this.closeTime = closeTime;
    return this;
  }

  /**
   * Required. Indicates the day of the week this period starts on.
   * @return value or {@code null} for none
   */
  public java.lang.String getOpenDay() {
    return openDay;
  }

  /**
   * Required. Indicates the day of the week this period starts on.
   * @param openDay openDay or {@code null} for none
   */
  public TimePeriod setOpenDay(java.lang.String openDay) {
    this.openDay = openDay;
    return this;
  }

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * @return value or {@code null} for none
   */
  public TimeOfDay getOpenTime() {
    return openTime;
  }

  /**
   * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the
   * specified day field.
   * @param openTime openTime or {@code null} for none
   */
  public TimePeriod setOpenTime(TimeOfDay openTime) {
    this.openTime = openTime;
    return this;
  }

  @Override
  public TimePeriod set(String fieldName, Object value) {
    return (TimePeriod) super.set(fieldName, value);
  }

  @Override
  public TimePeriod clone() {
    return (TimePeriod) super.clone();
  }

}
