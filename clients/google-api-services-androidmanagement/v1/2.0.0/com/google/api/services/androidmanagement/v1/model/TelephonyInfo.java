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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Telephony information associated with a given SIM card on the device. Only supported on fully
 * managed devices starting from Android API level 23.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TelephonyInfo extends com.google.api.client.json.GenericJson {

  /**
   * The carrier name associated with this SIM card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrierName;

  /**
   * The phone number associated with this SIM card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The carrier name associated with this SIM card.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrierName() {
    return carrierName;
  }

  /**
   * The carrier name associated with this SIM card.
   * @param carrierName carrierName or {@code null} for none
   */
  public TelephonyInfo setCarrierName(java.lang.String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * The phone number associated with this SIM card.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The phone number associated with this SIM card.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public TelephonyInfo setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  @Override
  public TelephonyInfo set(String fieldName, Object value) {
    return (TelephonyInfo) super.set(fieldName, value);
  }

  @Override
  public TelephonyInfo clone() {
    return (TelephonyInfo) super.clone();
  }

}
