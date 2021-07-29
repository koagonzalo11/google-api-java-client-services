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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * FileNote represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-
 * information/
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileNote extends com.google.api.client.json.GenericJson {

  /**
   * Provide a unique identifier to match analysis information on each specific file in a package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> checksum;

  /**
   * This field provides information about the type of file identified
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * Identify the full path and filename that corresponds to the file information in this section
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Provide a unique identifier to match analysis information on each specific file in a package
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getChecksum() {
    return checksum;
  }

  /**
   * Provide a unique identifier to match analysis information on each specific file in a package
   * @param checksum checksum or {@code null} for none
   */
  public FileNote setChecksum(java.util.List<java.lang.String> checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * This field provides information about the type of file identified
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * This field provides information about the type of file identified
   * @param fileType fileType or {@code null} for none
   */
  public FileNote setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Identify the full path and filename that corresponds to the file information in this section
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Identify the full path and filename that corresponds to the file information in this section
   * @param title title or {@code null} for none
   */
  public FileNote setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public FileNote set(String fieldName, Object value) {
    return (FileNote) super.set(fieldName, value);
  }

  @Override
  public FileNote clone() {
    return (FileNote) super.clone();
  }

}
