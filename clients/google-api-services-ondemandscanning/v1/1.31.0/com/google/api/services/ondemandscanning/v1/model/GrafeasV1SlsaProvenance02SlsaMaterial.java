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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * The collection of artifacts that influenced the build including sources, dependencies, build
 * tools, base images, and so on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GrafeasV1SlsaProvenance02SlsaMaterial extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> digest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDigest() {
    return digest;
  }

  /**
   * @param digest digest or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMaterial setDigest(java.util.Map<String, java.lang.String> digest) {
    this.digest = digest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * @param uri uri or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMaterial setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaMaterial set(String fieldName, Object value) {
    return (GrafeasV1SlsaProvenance02SlsaMaterial) super.set(fieldName, value);
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaMaterial clone() {
    return (GrafeasV1SlsaProvenance02SlsaMaterial) super.clone();
  }

}
