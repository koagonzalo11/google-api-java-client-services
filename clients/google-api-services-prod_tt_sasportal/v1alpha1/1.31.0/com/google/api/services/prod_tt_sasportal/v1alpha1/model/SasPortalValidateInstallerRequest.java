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

package com.google.api.services.prod_tt_sasportal.v1alpha1.model;

/**
 * Request for ValidateInstaller.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API (Testing). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalValidateInstallerRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim
   * whose value is the secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encodedSecret;

  /**
   * Required. Unique installer id (CPI ID) from the Certified Professional Installers database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installerId;

  /**
   * Required. Secret returned by the GenerateSecret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secret;

  /**
   * Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim
   * whose value is the secret.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncodedSecret() {
    return encodedSecret;
  }

  /**
   * Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim
   * whose value is the secret.
   * @param encodedSecret encodedSecret or {@code null} for none
   */
  public SasPortalValidateInstallerRequest setEncodedSecret(java.lang.String encodedSecret) {
    this.encodedSecret = encodedSecret;
    return this;
  }

  /**
   * Required. Unique installer id (CPI ID) from the Certified Professional Installers database.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstallerId() {
    return installerId;
  }

  /**
   * Required. Unique installer id (CPI ID) from the Certified Professional Installers database.
   * @param installerId installerId or {@code null} for none
   */
  public SasPortalValidateInstallerRequest setInstallerId(java.lang.String installerId) {
    this.installerId = installerId;
    return this;
  }

  /**
   * Required. Secret returned by the GenerateSecret.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecret() {
    return secret;
  }

  /**
   * Required. Secret returned by the GenerateSecret.
   * @param secret secret or {@code null} for none
   */
  public SasPortalValidateInstallerRequest setSecret(java.lang.String secret) {
    this.secret = secret;
    return this;
  }

  @Override
  public SasPortalValidateInstallerRequest set(String fieldName, Object value) {
    return (SasPortalValidateInstallerRequest) super.set(fieldName, value);
  }

  @Override
  public SasPortalValidateInstallerRequest clone() {
    return (SasPortalValidateInstallerRequest) super.clone();
  }

}
