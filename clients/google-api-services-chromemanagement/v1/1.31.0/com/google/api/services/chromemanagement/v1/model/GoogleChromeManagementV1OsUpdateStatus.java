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
 * Contains information regarding the current OS update status.
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
public final class GoogleChromeManagementV1OsUpdateStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp of the last reboot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastRebootTime;

  /**
   * Output only. Timestamp of the last update check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateCheckTime;

  /**
   * Output only. Timestamp of the last successful update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * Output only. New platform version of the os image being downloaded and applied. It is only set
   * when update status is OS_IMAGE_DOWNLOAD_IN_PROGRESS or OS_UPDATE_NEED_REBOOT. Note this could
   * be a dummy "0.0.0.0" for OS_UPDATE_NEED_REBOOT status for some edge cases, e.g. update engine
   * is restarted without a reboot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newPlatformVersion;

  /**
   * Output only. New requested platform version from the pending updated kiosk app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newRequestedPlatformVersion;

  /**
   * Output only. Current state of the os update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateState;

  /**
   * Output only. Timestamp of the last reboot.
   * @return value or {@code null} for none
   */
  public String getLastRebootTime() {
    return lastRebootTime;
  }

  /**
   * Output only. Timestamp of the last reboot.
   * @param lastRebootTime lastRebootTime or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setLastRebootTime(String lastRebootTime) {
    this.lastRebootTime = lastRebootTime;
    return this;
  }

  /**
   * Output only. Timestamp of the last update check.
   * @return value or {@code null} for none
   */
  public String getLastUpdateCheckTime() {
    return lastUpdateCheckTime;
  }

  /**
   * Output only. Timestamp of the last update check.
   * @param lastUpdateCheckTime lastUpdateCheckTime or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setLastUpdateCheckTime(String lastUpdateCheckTime) {
    this.lastUpdateCheckTime = lastUpdateCheckTime;
    return this;
  }

  /**
   * Output only. Timestamp of the last successful update.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Output only. Timestamp of the last successful update.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Output only. New platform version of the os image being downloaded and applied. It is only set
   * when update status is OS_IMAGE_DOWNLOAD_IN_PROGRESS or OS_UPDATE_NEED_REBOOT. Note this could
   * be a dummy "0.0.0.0" for OS_UPDATE_NEED_REBOOT status for some edge cases, e.g. update engine
   * is restarted without a reboot.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewPlatformVersion() {
    return newPlatformVersion;
  }

  /**
   * Output only. New platform version of the os image being downloaded and applied. It is only set
   * when update status is OS_IMAGE_DOWNLOAD_IN_PROGRESS or OS_UPDATE_NEED_REBOOT. Note this could
   * be a dummy "0.0.0.0" for OS_UPDATE_NEED_REBOOT status for some edge cases, e.g. update engine
   * is restarted without a reboot.
   * @param newPlatformVersion newPlatformVersion or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setNewPlatformVersion(java.lang.String newPlatformVersion) {
    this.newPlatformVersion = newPlatformVersion;
    return this;
  }

  /**
   * Output only. New requested platform version from the pending updated kiosk app.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewRequestedPlatformVersion() {
    return newRequestedPlatformVersion;
  }

  /**
   * Output only. New requested platform version from the pending updated kiosk app.
   * @param newRequestedPlatformVersion newRequestedPlatformVersion or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setNewRequestedPlatformVersion(java.lang.String newRequestedPlatformVersion) {
    this.newRequestedPlatformVersion = newRequestedPlatformVersion;
    return this;
  }

  /**
   * Output only. Current state of the os update.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateState() {
    return updateState;
  }

  /**
   * Output only. Current state of the os update.
   * @param updateState updateState or {@code null} for none
   */
  public GoogleChromeManagementV1OsUpdateStatus setUpdateState(java.lang.String updateState) {
    this.updateState = updateState;
    return this;
  }

  @Override
  public GoogleChromeManagementV1OsUpdateStatus set(String fieldName, Object value) {
    return (GoogleChromeManagementV1OsUpdateStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1OsUpdateStatus clone() {
    return (GoogleChromeManagementV1OsUpdateStatus) super.clone();
  }

}
