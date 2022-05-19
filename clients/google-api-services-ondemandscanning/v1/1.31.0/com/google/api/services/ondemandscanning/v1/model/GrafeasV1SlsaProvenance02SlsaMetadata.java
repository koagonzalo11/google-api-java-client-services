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
 * Other properties of the build.
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
public final class GrafeasV1SlsaProvenance02SlsaMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String buildFinishedOn;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildInvocationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String buildStartedOn;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1SlsaProvenance02SlsaCompleteness completeness;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reproducible;

  /**
   * @return value or {@code null} for none
   */
  public String getBuildFinishedOn() {
    return buildFinishedOn;
  }

  /**
   * @param buildFinishedOn buildFinishedOn or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMetadata setBuildFinishedOn(String buildFinishedOn) {
    this.buildFinishedOn = buildFinishedOn;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildInvocationId() {
    return buildInvocationId;
  }

  /**
   * @param buildInvocationId buildInvocationId or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMetadata setBuildInvocationId(java.lang.String buildInvocationId) {
    this.buildInvocationId = buildInvocationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getBuildStartedOn() {
    return buildStartedOn;
  }

  /**
   * @param buildStartedOn buildStartedOn or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMetadata setBuildStartedOn(String buildStartedOn) {
    this.buildStartedOn = buildStartedOn;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaCompleteness getCompleteness() {
    return completeness;
  }

  /**
   * @param completeness completeness or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMetadata setCompleteness(GrafeasV1SlsaProvenance02SlsaCompleteness completeness) {
    this.completeness = completeness;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReproducible() {
    return reproducible;
  }

  /**
   * @param reproducible reproducible or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaMetadata setReproducible(java.lang.Boolean reproducible) {
    this.reproducible = reproducible;
    return this;
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaMetadata set(String fieldName, Object value) {
    return (GrafeasV1SlsaProvenance02SlsaMetadata) super.set(fieldName, value);
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaMetadata clone() {
    return (GrafeasV1SlsaProvenance02SlsaMetadata) super.clone();
  }

}
