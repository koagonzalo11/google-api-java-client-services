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

package com.google.api.services.gkehub.v1.model;

/**
 * State indicating an ACM's progress syncing configurations to a cluster
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementSyncState extends com.google.api.client.json.GenericJson {

  /**
   * Sync status code
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * A list of errors resulting from problematic configs. This list will be truncated after 100
   * errors, although it is unlikely for that many errors to simultaneously exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConfigManagementSyncError> errors;

  static {
    // hack to force ProGuard to consider ConfigManagementSyncError used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConfigManagementSyncError.class);
  }

  /**
   * Token indicating the state of the importer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importToken;

  /**
   * Deprecated: use last_sync_time instead. Timestamp of when ACM last successfully synced the repo
   * The time format is specified in https://golang.org/pkg/time/#Time.String
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastSync;

  /**
   * Timestamp type of when ACM last successfully synced the repo
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastSyncTime;

  /**
   * Token indicating the state of the repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceToken;

  /**
   * Token indicating the state of the syncer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncToken;

  /**
   * Sync status code
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Sync status code
   * @param code code or {@code null} for none
   */
  public ConfigManagementSyncState setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * A list of errors resulting from problematic configs. This list will be truncated after 100
   * errors, although it is unlikely for that many errors to simultaneously exist.
   * @return value or {@code null} for none
   */
  public java.util.List<ConfigManagementSyncError> getErrors() {
    return errors;
  }

  /**
   * A list of errors resulting from problematic configs. This list will be truncated after 100
   * errors, although it is unlikely for that many errors to simultaneously exist.
   * @param errors errors or {@code null} for none
   */
  public ConfigManagementSyncState setErrors(java.util.List<ConfigManagementSyncError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Token indicating the state of the importer.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportToken() {
    return importToken;
  }

  /**
   * Token indicating the state of the importer.
   * @param importToken importToken or {@code null} for none
   */
  public ConfigManagementSyncState setImportToken(java.lang.String importToken) {
    this.importToken = importToken;
    return this;
  }

  /**
   * Deprecated: use last_sync_time instead. Timestamp of when ACM last successfully synced the repo
   * The time format is specified in https://golang.org/pkg/time/#Time.String
   * @return value or {@code null} for none
   */
  public java.lang.String getLastSync() {
    return lastSync;
  }

  /**
   * Deprecated: use last_sync_time instead. Timestamp of when ACM last successfully synced the repo
   * The time format is specified in https://golang.org/pkg/time/#Time.String
   * @param lastSync lastSync or {@code null} for none
   */
  public ConfigManagementSyncState setLastSync(java.lang.String lastSync) {
    this.lastSync = lastSync;
    return this;
  }

  /**
   * Timestamp type of when ACM last successfully synced the repo
   * @return value or {@code null} for none
   */
  public String getLastSyncTime() {
    return lastSyncTime;
  }

  /**
   * Timestamp type of when ACM last successfully synced the repo
   * @param lastSyncTime lastSyncTime or {@code null} for none
   */
  public ConfigManagementSyncState setLastSyncTime(String lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  /**
   * Token indicating the state of the repo.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceToken() {
    return sourceToken;
  }

  /**
   * Token indicating the state of the repo.
   * @param sourceToken sourceToken or {@code null} for none
   */
  public ConfigManagementSyncState setSourceToken(java.lang.String sourceToken) {
    this.sourceToken = sourceToken;
    return this;
  }

  /**
   * Token indicating the state of the syncer.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncToken() {
    return syncToken;
  }

  /**
   * Token indicating the state of the syncer.
   * @param syncToken syncToken or {@code null} for none
   */
  public ConfigManagementSyncState setSyncToken(java.lang.String syncToken) {
    this.syncToken = syncToken;
    return this;
  }

  @Override
  public ConfigManagementSyncState set(String fieldName, Object value) {
    return (ConfigManagementSyncState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementSyncState clone() {
    return (ConfigManagementSyncState) super.clone();
  }

}
