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
 * DocumentOccurrence represents an SPDX Document Creation Information section:
 * https://spdx.github.io/spdx-spec/2-document-creation-information/
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
public final class DocumentOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * Identify when the SPDX file was originally created. The date is to be specified according to
   * combined date and time in UTC format as specified in ISO 8601 standard
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A field for creators of the SPDX file to provide general comments about the creation of the
   * SPDX file or any other relevant comment not included in the other fields
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creatorComment;

  /**
   * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was
   * created by an individual, indicate the person's name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> creators;

  /**
   * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX
   * document
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentComment;

  /**
   * Identify any external SPDX documents referenced within this SPDX document
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> externalDocumentRefs;

  /**
   * Identify the current SPDX document which may be referenced in relationships by other files,
   * packages internally and documents externally
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A field for creators of the SPDX file to provide the version of the SPDX License List used when
   * the SPDX file was created
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String licenseListVersion;

  /**
   * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier
   * (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * Identify name of this document as designated by creator
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Identify when the SPDX file was originally created. The date is to be specified according to
   * combined date and time in UTC format as specified in ISO 8601 standard
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Identify when the SPDX file was originally created. The date is to be specified according to
   * combined date and time in UTC format as specified in ISO 8601 standard
   * @param createTime createTime or {@code null} for none
   */
  public DocumentOccurrence setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A field for creators of the SPDX file to provide general comments about the creation of the
   * SPDX file or any other relevant comment not included in the other fields
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatorComment() {
    return creatorComment;
  }

  /**
   * A field for creators of the SPDX file to provide general comments about the creation of the
   * SPDX file or any other relevant comment not included in the other fields
   * @param creatorComment creatorComment or {@code null} for none
   */
  public DocumentOccurrence setCreatorComment(java.lang.String creatorComment) {
    this.creatorComment = creatorComment;
    return this;
  }

  /**
   * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was
   * created by an individual, indicate the person's name
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCreators() {
    return creators;
  }

  /**
   * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was
   * created by an individual, indicate the person's name
   * @param creators creators or {@code null} for none
   */
  public DocumentOccurrence setCreators(java.util.List<java.lang.String> creators) {
    this.creators = creators;
    return this;
  }

  /**
   * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX
   * document
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentComment() {
    return documentComment;
  }

  /**
   * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX
   * document
   * @param documentComment documentComment or {@code null} for none
   */
  public DocumentOccurrence setDocumentComment(java.lang.String documentComment) {
    this.documentComment = documentComment;
    return this;
  }

  /**
   * Identify any external SPDX documents referenced within this SPDX document
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExternalDocumentRefs() {
    return externalDocumentRefs;
  }

  /**
   * Identify any external SPDX documents referenced within this SPDX document
   * @param externalDocumentRefs externalDocumentRefs or {@code null} for none
   */
  public DocumentOccurrence setExternalDocumentRefs(java.util.List<java.lang.String> externalDocumentRefs) {
    this.externalDocumentRefs = externalDocumentRefs;
    return this;
  }

  /**
   * Identify the current SPDX document which may be referenced in relationships by other files,
   * packages internally and documents externally
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Identify the current SPDX document which may be referenced in relationships by other files,
   * packages internally and documents externally
   * @param id id or {@code null} for none
   */
  public DocumentOccurrence setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A field for creators of the SPDX file to provide the version of the SPDX License List used when
   * the SPDX file was created
   * @return value or {@code null} for none
   */
  public java.lang.String getLicenseListVersion() {
    return licenseListVersion;
  }

  /**
   * A field for creators of the SPDX file to provide the version of the SPDX License List used when
   * the SPDX file was created
   * @param licenseListVersion licenseListVersion or {@code null} for none
   */
  public DocumentOccurrence setLicenseListVersion(java.lang.String licenseListVersion) {
    this.licenseListVersion = licenseListVersion;
    return this;
  }

  /**
   * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier
   * (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier
   * (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
   * @param namespace namespace or {@code null} for none
   */
  public DocumentOccurrence setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Identify name of this document as designated by creator
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Identify name of this document as designated by creator
   * @param title title or {@code null} for none
   */
  public DocumentOccurrence setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public DocumentOccurrence set(String fieldName, Object value) {
    return (DocumentOccurrence) super.set(fieldName, value);
  }

  @Override
  public DocumentOccurrence clone() {
    return (DocumentOccurrence) super.clone();
  }

}
