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

package com.google.api.services.metastore.v1beta.model;

/**
 * Configuration information for the auxiliary service versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuxiliaryVersionConfig extends com.google.api.client.json.GenericJson {

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive
   * metastore (configured in hive-site.xml) in addition to the primary version's overrides. If keys
   * are present in both the auxiliary version's overrides and the primary version's overrides, the
   * value from the auxiliary version's overrides takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> configOverrides;

  /**
   * Output only. The network configuration contains the endpoint URI(s) of the auxiliary Hive
   * metastore service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkConfig networkConfig;

  /**
   * The Hive metastore version of the auxiliary service. It must be less than the primary Hive
   * metastore service's version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive
   * metastore (configured in hive-site.xml) in addition to the primary version's overrides. If keys
   * are present in both the auxiliary version's overrides and the primary version's overrides, the
   * value from the auxiliary version's overrides takes precedence.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getConfigOverrides() {
    return configOverrides;
  }

  /**
   * A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive
   * metastore (configured in hive-site.xml) in addition to the primary version's overrides. If keys
   * are present in both the auxiliary version's overrides and the primary version's overrides, the
   * value from the auxiliary version's overrides takes precedence.
   * @param configOverrides configOverrides or {@code null} for none
   */
  public AuxiliaryVersionConfig setConfigOverrides(java.util.Map<String, java.lang.String> configOverrides) {
    this.configOverrides = configOverrides;
    return this;
  }

  /**
   * Output only. The network configuration contains the endpoint URI(s) of the auxiliary Hive
   * metastore service.
   * @return value or {@code null} for none
   */
  public NetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  /**
   * Output only. The network configuration contains the endpoint URI(s) of the auxiliary Hive
   * metastore service.
   * @param networkConfig networkConfig or {@code null} for none
   */
  public AuxiliaryVersionConfig setNetworkConfig(NetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
    return this;
  }

  /**
   * The Hive metastore version of the auxiliary service. It must be less than the primary Hive
   * metastore service's version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The Hive metastore version of the auxiliary service. It must be less than the primary Hive
   * metastore service's version.
   * @param version version or {@code null} for none
   */
  public AuxiliaryVersionConfig setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public AuxiliaryVersionConfig set(String fieldName, Object value) {
    return (AuxiliaryVersionConfig) super.set(fieldName, value);
  }

  @Override
  public AuxiliaryVersionConfig clone() {
    return (AuxiliaryVersionConfig) super.clone();
  }

}
