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
 * Telemetry data collected from a managed device.
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
public final class GoogleChromeManagementV1TelemetryDevice extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Audio reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1AudioStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1AudioStatusReport.class);
  }

  /**
   * Output only. Information on battery specs for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1BatteryInfo> batteryInfo;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1BatteryInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1BatteryInfo.class);
  }

  /**
   * Output only. Battery reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1BatteryStatusReport> batteryStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1BatteryStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1BatteryStatusReport.class);
  }

  /**
   * Output only. Information regarding CPU specs for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1CpuInfo> cpuInfo;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1CpuInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1CpuInfo.class);
  }

  /**
   * Output only. CPU status reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1CpuStatusReport> cpuStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1CpuStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1CpuStatusReport.class);
  }

  /**
   * Output only. Google Workspace Customer whose enterprise enrolled the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customer;

  /**
   * Output only. The unique Directory API ID of the device. This value is the same as the Admin
   * Console's Directory API ID in the Chrome OS Devices tab
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceId;

  /**
   * Output only. Contains information regarding Graphic peripherals for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementV1GraphicsInfo graphicsInfo;

  /**
   * Output only. Graphics reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1GraphicsStatusReport> graphicsStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1GraphicsStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1GraphicsStatusReport.class);
  }

  /**
   * Output only. Information regarding memory specs for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementV1MemoryInfo memoryInfo;

  /**
   * Output only. Memory status reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1MemoryStatusReport> memoryStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1MemoryStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1MemoryStatusReport.class);
  }

  /**
   * Output only. Resource name of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Network specs collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1NetworkStatusReport> networkStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1NetworkStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1NetworkStatusReport.class);
  }

  /**
   * Output only. Organization unit ID of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitId;

  /**
   * Output only. Contains relevant information regarding ChromeOS update status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1OsUpdateStatus> osUpdateStatus;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1OsUpdateStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1OsUpdateStatus.class);
  }

  /**
   * Output only. Device serial number. This value is the same as the Admin Console's Serial Number
   * in the Chrome OS Devices tab.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * Output only. Information of storage specs for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementV1StorageInfo storageInfo;

  /**
   * Output only. Storage reports collected periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1StorageStatusReport> storageStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1StorageStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1StorageStatusReport.class);
  }

  /**
   * Output only. Audio reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1AudioStatusReport> getAudioStatusReport() {
    return audioStatusReport;
  }

  /**
   * Output only. Audio reports collected periodically.
   * @param audioStatusReport audioStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setAudioStatusReport(java.util.List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport) {
    this.audioStatusReport = audioStatusReport;
    return this;
  }

  /**
   * Output only. Information on battery specs for the device.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1BatteryInfo> getBatteryInfo() {
    return batteryInfo;
  }

  /**
   * Output only. Information on battery specs for the device.
   * @param batteryInfo batteryInfo or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setBatteryInfo(java.util.List<GoogleChromeManagementV1BatteryInfo> batteryInfo) {
    this.batteryInfo = batteryInfo;
    return this;
  }

  /**
   * Output only. Battery reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1BatteryStatusReport> getBatteryStatusReport() {
    return batteryStatusReport;
  }

  /**
   * Output only. Battery reports collected periodically.
   * @param batteryStatusReport batteryStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setBatteryStatusReport(java.util.List<GoogleChromeManagementV1BatteryStatusReport> batteryStatusReport) {
    this.batteryStatusReport = batteryStatusReport;
    return this;
  }

  /**
   * Output only. Information regarding CPU specs for the device.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1CpuInfo> getCpuInfo() {
    return cpuInfo;
  }

  /**
   * Output only. Information regarding CPU specs for the device.
   * @param cpuInfo cpuInfo or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setCpuInfo(java.util.List<GoogleChromeManagementV1CpuInfo> cpuInfo) {
    this.cpuInfo = cpuInfo;
    return this;
  }

  /**
   * Output only. CPU status reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1CpuStatusReport> getCpuStatusReport() {
    return cpuStatusReport;
  }

  /**
   * Output only. CPU status reports collected periodically.
   * @param cpuStatusReport cpuStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setCpuStatusReport(java.util.List<GoogleChromeManagementV1CpuStatusReport> cpuStatusReport) {
    this.cpuStatusReport = cpuStatusReport;
    return this;
  }

  /**
   * Output only. Google Workspace Customer whose enterprise enrolled the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomer() {
    return customer;
  }

  /**
   * Output only. Google Workspace Customer whose enterprise enrolled the device.
   * @param customer customer or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setCustomer(java.lang.String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Output only. The unique Directory API ID of the device. This value is the same as the Admin
   * Console's Directory API ID in the Chrome OS Devices tab
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * Output only. The unique Directory API ID of the device. This value is the same as the Admin
   * Console's Directory API ID in the Chrome OS Devices tab
   * @param deviceId deviceId or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setDeviceId(java.lang.String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Output only. Contains information regarding Graphic peripherals for the device.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementV1GraphicsInfo getGraphicsInfo() {
    return graphicsInfo;
  }

  /**
   * Output only. Contains information regarding Graphic peripherals for the device.
   * @param graphicsInfo graphicsInfo or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setGraphicsInfo(GoogleChromeManagementV1GraphicsInfo graphicsInfo) {
    this.graphicsInfo = graphicsInfo;
    return this;
  }

  /**
   * Output only. Graphics reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1GraphicsStatusReport> getGraphicsStatusReport() {
    return graphicsStatusReport;
  }

  /**
   * Output only. Graphics reports collected periodically.
   * @param graphicsStatusReport graphicsStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setGraphicsStatusReport(java.util.List<GoogleChromeManagementV1GraphicsStatusReport> graphicsStatusReport) {
    this.graphicsStatusReport = graphicsStatusReport;
    return this;
  }

  /**
   * Output only. Information regarding memory specs for the device.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementV1MemoryInfo getMemoryInfo() {
    return memoryInfo;
  }

  /**
   * Output only. Information regarding memory specs for the device.
   * @param memoryInfo memoryInfo or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setMemoryInfo(GoogleChromeManagementV1MemoryInfo memoryInfo) {
    this.memoryInfo = memoryInfo;
    return this;
  }

  /**
   * Output only. Memory status reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1MemoryStatusReport> getMemoryStatusReport() {
    return memoryStatusReport;
  }

  /**
   * Output only. Memory status reports collected periodically.
   * @param memoryStatusReport memoryStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setMemoryStatusReport(java.util.List<GoogleChromeManagementV1MemoryStatusReport> memoryStatusReport) {
    this.memoryStatusReport = memoryStatusReport;
    return this;
  }

  /**
   * Output only. Resource name of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the device.
   * @param name name or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Network specs collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1NetworkStatusReport> getNetworkStatusReport() {
    return networkStatusReport;
  }

  /**
   * Output only. Network specs collected periodically.
   * @param networkStatusReport networkStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setNetworkStatusReport(java.util.List<GoogleChromeManagementV1NetworkStatusReport> networkStatusReport) {
    this.networkStatusReport = networkStatusReport;
    return this;
  }

  /**
   * Output only. Organization unit ID of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitId() {
    return orgUnitId;
  }

  /**
   * Output only. Organization unit ID of the device.
   * @param orgUnitId orgUnitId or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setOrgUnitId(java.lang.String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

  /**
   * Output only. Contains relevant information regarding ChromeOS update status.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1OsUpdateStatus> getOsUpdateStatus() {
    return osUpdateStatus;
  }

  /**
   * Output only. Contains relevant information regarding ChromeOS update status.
   * @param osUpdateStatus osUpdateStatus or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setOsUpdateStatus(java.util.List<GoogleChromeManagementV1OsUpdateStatus> osUpdateStatus) {
    this.osUpdateStatus = osUpdateStatus;
    return this;
  }

  /**
   * Output only. Device serial number. This value is the same as the Admin Console's Serial Number
   * in the Chrome OS Devices tab.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Output only. Device serial number. This value is the same as the Admin Console's Serial Number
   * in the Chrome OS Devices tab.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Output only. Information of storage specs for the device.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementV1StorageInfo getStorageInfo() {
    return storageInfo;
  }

  /**
   * Output only. Information of storage specs for the device.
   * @param storageInfo storageInfo or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setStorageInfo(GoogleChromeManagementV1StorageInfo storageInfo) {
    this.storageInfo = storageInfo;
    return this;
  }

  /**
   * Output only. Storage reports collected periodically.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1StorageStatusReport> getStorageStatusReport() {
    return storageStatusReport;
  }

  /**
   * Output only. Storage reports collected periodically.
   * @param storageStatusReport storageStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryDevice setStorageStatusReport(java.util.List<GoogleChromeManagementV1StorageStatusReport> storageStatusReport) {
    this.storageStatusReport = storageStatusReport;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TelemetryDevice set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TelemetryDevice) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TelemetryDevice clone() {
    return (GoogleChromeManagementV1TelemetryDevice) super.clone();
  }

}
