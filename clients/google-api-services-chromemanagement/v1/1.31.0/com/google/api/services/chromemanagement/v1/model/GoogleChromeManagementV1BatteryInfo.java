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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Battery info
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1BatteryInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Design capacity (mAmpere-hours).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long designCapacity;

  /**
   * Output only. Designed minimum output voltage (mV)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer designMinVoltage;

  /**
   * Output only. The date the battery was manufactured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate manufactureDate;

  /**
   * Output only. Battery manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manufacturer;

  /**
   * Output only. Battery serial number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * Output only. Technology of the battery. Example: Li-ion
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String technology;

  /**
   * Output only. Design capacity (mAmpere-hours).
   * @return value or {@code null} for none
   */
  public java.lang.Long getDesignCapacity() {
    return designCapacity;
  }

  /**
   * Output only. Design capacity (mAmpere-hours).
   * @param designCapacity designCapacity or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setDesignCapacity(java.lang.Long designCapacity) {
    this.designCapacity = designCapacity;
    return this;
  }

  /**
   * Output only. Designed minimum output voltage (mV)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDesignMinVoltage() {
    return designMinVoltage;
  }

  /**
   * Output only. Designed minimum output voltage (mV)
   * @param designMinVoltage designMinVoltage or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setDesignMinVoltage(java.lang.Integer designMinVoltage) {
    this.designMinVoltage = designMinVoltage;
    return this;
  }

  /**
   * Output only. The date the battery was manufactured.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getManufactureDate() {
    return manufactureDate;
  }

  /**
   * Output only. The date the battery was manufactured.
   * @param manufactureDate manufactureDate or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setManufactureDate(GoogleTypeDate manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * Output only. Battery manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getManufacturer() {
    return manufacturer;
  }

  /**
   * Output only. Battery manufacturer.
   * @param manufacturer manufacturer or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setManufacturer(java.lang.String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Output only. Battery serial number.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Output only. Battery serial number.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Output only. Technology of the battery. Example: Li-ion
   * @return value or {@code null} for none
   */
  public java.lang.String getTechnology() {
    return technology;
  }

  /**
   * Output only. Technology of the battery. Example: Li-ion
   * @param technology technology or {@code null} for none
   */
  public GoogleChromeManagementV1BatteryInfo setTechnology(java.lang.String technology) {
    this.technology = technology;
    return this;
  }

  @Override
  public GoogleChromeManagementV1BatteryInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1BatteryInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1BatteryInfo clone() {
    return (GoogleChromeManagementV1BatteryInfo) super.clone();
  }

}
