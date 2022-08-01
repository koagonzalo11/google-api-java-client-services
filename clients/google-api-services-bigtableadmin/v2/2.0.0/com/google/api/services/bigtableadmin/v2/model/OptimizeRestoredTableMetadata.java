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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Metadata type for the long-running operation used to track the progress of optimizations
 * performed on a newly restored table. This long-running operation is automatically created by the
 * system after the successful completion of a table restore, and cannot be cancelled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OptimizeRestoredTableMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Name of the restored table being optimized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The progress of the post-restore optimizations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationProgress progress;

  /**
   * Name of the restored table being optimized.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the restored table being optimized.
   * @param name name or {@code null} for none
   */
  public OptimizeRestoredTableMetadata setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The progress of the post-restore optimizations.
   * @return value or {@code null} for none
   */
  public OperationProgress getProgress() {
    return progress;
  }

  /**
   * The progress of the post-restore optimizations.
   * @param progress progress or {@code null} for none
   */
  public OptimizeRestoredTableMetadata setProgress(OperationProgress progress) {
    this.progress = progress;
    return this;
  }

  @Override
  public OptimizeRestoredTableMetadata set(String fieldName, Object value) {
    return (OptimizeRestoredTableMetadata) super.set(fieldName, value);
  }

  @Override
  public OptimizeRestoredTableMetadata clone() {
    return (OptimizeRestoredTableMetadata) super.clone();
  }

}
