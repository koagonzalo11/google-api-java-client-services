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
 * DocumentNote represents an SPDX Document Creation Infromation section: https://spdx.github.io
 * /spdx-spec/2-document-creation-information/
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
public final class DocumentNote extends com.google.api.client.json.GenericJson {

  /**
   * Compliance with the SPDX specification includes populating the SPDX fields therein with data
   * related to such fields ("SPDX-Metadata")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataLicence;

  /**
   * Provide a reference number that can be used to understand how to parse and interpret the rest
   * of the file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spdxVersion;

  /**
   * Compliance with the SPDX specification includes populating the SPDX fields therein with data
   * related to such fields ("SPDX-Metadata")
   * @return value or {@code null} for none
   */
  public java.lang.String getDataLicence() {
    return dataLicence;
  }

  /**
   * Compliance with the SPDX specification includes populating the SPDX fields therein with data
   * related to such fields ("SPDX-Metadata")
   * @param dataLicence dataLicence or {@code null} for none
   */
  public DocumentNote setDataLicence(java.lang.String dataLicence) {
    this.dataLicence = dataLicence;
    return this;
  }

  /**
   * Provide a reference number that can be used to understand how to parse and interpret the rest
   * of the file
   * @return value or {@code null} for none
   */
  public java.lang.String getSpdxVersion() {
    return spdxVersion;
  }

  /**
   * Provide a reference number that can be used to understand how to parse and interpret the rest
   * of the file
   * @param spdxVersion spdxVersion or {@code null} for none
   */
  public DocumentNote setSpdxVersion(java.lang.String spdxVersion) {
    this.spdxVersion = spdxVersion;
    return this;
  }

  @Override
  public DocumentNote set(String fieldName, Object value) {
    return (DocumentNote) super.set(fieldName, value);
  }

  @Override
  public DocumentNote clone() {
    return (DocumentNote) super.clone();
  }

}
