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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of an unpaid or paid payment. See [Payment timelines for
 * AdSense](https://support.google.com/adsense/answer/7164703) for more information about payments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Payment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The amount of unpaid or paid earnings, as a formatted string, including the
   * currency. E.g. "¥1,235 JPY", "$1,234.57", "£87.65".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String amount;

  /**
   * Output only. For paid earnings, the date that the payment was credited. For unpaid earnings,
   * this field is empty. Payment dates are always returned in the billing timezone
   * (America/Los_Angeles).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * Resource name of the payment. Format: - accounts/{account}/payments/unpaid for unpaid (current)
   * AdSense earnings. - accounts/{account}/payments/youtube-unpaid for unpaid (current) YouTube
   * earnings. - accounts/{account}/payments/yyyy-MM-dd for paid AdSense earnings. -
   * accounts/{account}/payments/youtube-yyyy-MM-dd for paid YouTube earnings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The amount of unpaid or paid earnings, as a formatted string, including the
   * currency. E.g. "¥1,235 JPY", "$1,234.57", "£87.65".
   * @return value or {@code null} for none
   */
  public java.lang.String getAmount() {
    return amount;
  }

  /**
   * Output only. The amount of unpaid or paid earnings, as a formatted string, including the
   * currency. E.g. "¥1,235 JPY", "$1,234.57", "£87.65".
   * @param amount amount or {@code null} for none
   */
  public Payment setAmount(java.lang.String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Output only. For paid earnings, the date that the payment was credited. For unpaid earnings,
   * this field is empty. Payment dates are always returned in the billing timezone
   * (America/Los_Angeles).
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Output only. For paid earnings, the date that the payment was credited. For unpaid earnings,
   * this field is empty. Payment dates are always returned in the billing timezone
   * (America/Los_Angeles).
   * @param date date or {@code null} for none
   */
  public Payment setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Resource name of the payment. Format: - accounts/{account}/payments/unpaid for unpaid (current)
   * AdSense earnings. - accounts/{account}/payments/youtube-unpaid for unpaid (current) YouTube
   * earnings. - accounts/{account}/payments/yyyy-MM-dd for paid AdSense earnings. -
   * accounts/{account}/payments/youtube-yyyy-MM-dd for paid YouTube earnings.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the payment. Format: - accounts/{account}/payments/unpaid for unpaid (current)
   * AdSense earnings. - accounts/{account}/payments/youtube-unpaid for unpaid (current) YouTube
   * earnings. - accounts/{account}/payments/yyyy-MM-dd for paid AdSense earnings. -
   * accounts/{account}/payments/youtube-yyyy-MM-dd for paid YouTube earnings.
   * @param name name or {@code null} for none
   */
  public Payment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Payment set(String fieldName, Object value) {
    return (Payment) super.set(fieldName, value);
  }

  @Override
  public Payment clone() {
    return (Payment) super.clone();
  }

}
