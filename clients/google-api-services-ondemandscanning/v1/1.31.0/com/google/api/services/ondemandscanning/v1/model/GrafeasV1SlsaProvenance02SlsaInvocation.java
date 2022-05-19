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
 * Identifies the event that kicked off the build.
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
public final class GrafeasV1SlsaProvenance02SlsaInvocation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1SlsaProvenance02SlsaConfigSource configSource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> environment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * @return value or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaConfigSource getConfigSource() {
    return configSource;
  }

  /**
   * @param configSource configSource or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaInvocation setConfigSource(GrafeasV1SlsaProvenance02SlsaConfigSource configSource) {
    this.configSource = configSource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getEnvironment() {
    return environment;
  }

  /**
   * @param environment environment or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaInvocation setEnvironment(java.util.Map<String, java.lang.Object> environment) {
    this.environment = environment;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * @param parameters parameters or {@code null} for none
   */
  public GrafeasV1SlsaProvenance02SlsaInvocation setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaInvocation set(String fieldName, Object value) {
    return (GrafeasV1SlsaProvenance02SlsaInvocation) super.set(fieldName, value);
  }

  @Override
  public GrafeasV1SlsaProvenance02SlsaInvocation clone() {
    return (GrafeasV1SlsaProvenance02SlsaInvocation) super.clone();
  }

}
