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
 * FileOccurrence represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4
 * -file-information/
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
public final class FileOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * This field provides a place for the SPDX data creator to record, at the file level,
   * acknowledgements that may be needed to be communicated in some contexts
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attributions;

  /**
   * This field provides a place for the SPDX file creator to record any general comments about the
   * file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * This field provides a place for the SPDX file creator to record file contributors
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contributors;

  /**
   * Identify the copyright holder of the file, as well as any dates present
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String copyright;

  /**
   * This field contains the license information actually found in the file, if any
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filesLicenseInfo;

  /**
   * Uniquely identify any element in an SPDX document which may be referenced by other elements
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * This field provides a place for the SPDX file creator to record any relevant background
   * references or analysis that went in to arriving at the Concluded License for a file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String licenseComments;

  /**
   * This field contains the license the SPDX file creator has concluded as governing the file or
   * alternative values if the governing license cannot be determined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String licenseConcluded;

  /**
   * This field provides a place for the SPDX file creator to record license notices or other such
   * related notices found in the file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notice;

  /**
   * This field provides a place for the SPDX data creator to record, at the file level,
   * acknowledgements that may be needed to be communicated in some contexts
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttributions() {
    return attributions;
  }

  /**
   * This field provides a place for the SPDX data creator to record, at the file level,
   * acknowledgements that may be needed to be communicated in some contexts
   * @param attributions attributions or {@code null} for none
   */
  public FileOccurrence setAttributions(java.util.List<java.lang.String> attributions) {
    this.attributions = attributions;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record any general comments about the
   * file
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * This field provides a place for the SPDX file creator to record any general comments about the
   * file
   * @param comment comment or {@code null} for none
   */
  public FileOccurrence setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record file contributors
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContributors() {
    return contributors;
  }

  /**
   * This field provides a place for the SPDX file creator to record file contributors
   * @param contributors contributors or {@code null} for none
   */
  public FileOccurrence setContributors(java.util.List<java.lang.String> contributors) {
    this.contributors = contributors;
    return this;
  }

  /**
   * Identify the copyright holder of the file, as well as any dates present
   * @return value or {@code null} for none
   */
  public java.lang.String getCopyright() {
    return copyright;
  }

  /**
   * Identify the copyright holder of the file, as well as any dates present
   * @param copyright copyright or {@code null} for none
   */
  public FileOccurrence setCopyright(java.lang.String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * This field contains the license information actually found in the file, if any
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilesLicenseInfo() {
    return filesLicenseInfo;
  }

  /**
   * This field contains the license information actually found in the file, if any
   * @param filesLicenseInfo filesLicenseInfo or {@code null} for none
   */
  public FileOccurrence setFilesLicenseInfo(java.util.List<java.lang.String> filesLicenseInfo) {
    this.filesLicenseInfo = filesLicenseInfo;
    return this;
  }

  /**
   * Uniquely identify any element in an SPDX document which may be referenced by other elements
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Uniquely identify any element in an SPDX document which may be referenced by other elements
   * @param id id or {@code null} for none
   */
  public FileOccurrence setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record any relevant background
   * references or analysis that went in to arriving at the Concluded License for a file
   * @return value or {@code null} for none
   */
  public java.lang.String getLicenseComments() {
    return licenseComments;
  }

  /**
   * This field provides a place for the SPDX file creator to record any relevant background
   * references or analysis that went in to arriving at the Concluded License for a file
   * @param licenseComments licenseComments or {@code null} for none
   */
  public FileOccurrence setLicenseComments(java.lang.String licenseComments) {
    this.licenseComments = licenseComments;
    return this;
  }

  /**
   * This field contains the license the SPDX file creator has concluded as governing the file or
   * alternative values if the governing license cannot be determined
   * @return value or {@code null} for none
   */
  public java.lang.String getLicenseConcluded() {
    return licenseConcluded;
  }

  /**
   * This field contains the license the SPDX file creator has concluded as governing the file or
   * alternative values if the governing license cannot be determined
   * @param licenseConcluded licenseConcluded or {@code null} for none
   */
  public FileOccurrence setLicenseConcluded(java.lang.String licenseConcluded) {
    this.licenseConcluded = licenseConcluded;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record license notices or other such
   * related notices found in the file
   * @return value or {@code null} for none
   */
  public java.lang.String getNotice() {
    return notice;
  }

  /**
   * This field provides a place for the SPDX file creator to record license notices or other such
   * related notices found in the file
   * @param notice notice or {@code null} for none
   */
  public FileOccurrence setNotice(java.lang.String notice) {
    this.notice = notice;
    return this;
  }

  @Override
  public FileOccurrence set(String fieldName, Object value) {
    return (FileOccurrence) super.set(fieldName, value);
  }

  @Override
  public FileOccurrence clone() {
    return (FileOccurrence) super.clone();
  }

}
