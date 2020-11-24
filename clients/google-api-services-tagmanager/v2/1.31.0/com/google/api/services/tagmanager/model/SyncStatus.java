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

package com.google.api.services.tagmanager.model;

/**
 * The status of a workspace after synchronization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SyncStatus extends com.google.api.client.json.GenericJson {

  /**
   * Synchornization operation detected a merge conflict.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mergeConflict;

  /**
   * An error occurred during the synchronization operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean syncError;

  /**
   * Synchornization operation detected a merge conflict.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMergeConflict() {
    return mergeConflict;
  }

  /**
   * Synchornization operation detected a merge conflict.
   * @param mergeConflict mergeConflict or {@code null} for none
   */
  public SyncStatus setMergeConflict(java.lang.Boolean mergeConflict) {
    this.mergeConflict = mergeConflict;
    return this;
  }

  /**
   * An error occurred during the synchronization operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSyncError() {
    return syncError;
  }

  /**
   * An error occurred during the synchronization operation.
   * @param syncError syncError or {@code null} for none
   */
  public SyncStatus setSyncError(java.lang.Boolean syncError) {
    this.syncError = syncError;
    return this;
  }

  @Override
  public SyncStatus set(String fieldName, Object value) {
    return (SyncStatus) super.set(fieldName, value);
  }

  @Override
  public SyncStatus clone() {
    return (SyncStatus) super.clone();
  }

}
