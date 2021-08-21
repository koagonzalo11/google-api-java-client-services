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

package com.google.api.services.gkehub.v1beta.model;

/**
 * **Anthos Config Management**: Configuration for a single cluster. Intended to parallel the
 * ConfigManagement CR.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementMembershipSpec extends com.google.api.client.json.GenericJson {

  /**
   * Binauthz conifguration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementBinauthzConfig binauthz;

  /**
   * Config Sync configuration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSync configSync;

  /**
   * Hierarchy Controller configuration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementHierarchyControllerConfig hierarchyController;

  /**
   * Policy Controller configuration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementPolicyController policyController;

  /**
   * Version of ACM installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Binauthz conifguration for the cluster.
   * @return value or {@code null} for none
   */
  public ConfigManagementBinauthzConfig getBinauthz() {
    return binauthz;
  }

  /**
   * Binauthz conifguration for the cluster.
   * @param binauthz binauthz or {@code null} for none
   */
  public ConfigManagementMembershipSpec setBinauthz(ConfigManagementBinauthzConfig binauthz) {
    this.binauthz = binauthz;
    return this;
  }

  /**
   * Config Sync configuration for the cluster.
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSync getConfigSync() {
    return configSync;
  }

  /**
   * Config Sync configuration for the cluster.
   * @param configSync configSync or {@code null} for none
   */
  public ConfigManagementMembershipSpec setConfigSync(ConfigManagementConfigSync configSync) {
    this.configSync = configSync;
    return this;
  }

  /**
   * Hierarchy Controller configuration for the cluster.
   * @return value or {@code null} for none
   */
  public ConfigManagementHierarchyControllerConfig getHierarchyController() {
    return hierarchyController;
  }

  /**
   * Hierarchy Controller configuration for the cluster.
   * @param hierarchyController hierarchyController or {@code null} for none
   */
  public ConfigManagementMembershipSpec setHierarchyController(ConfigManagementHierarchyControllerConfig hierarchyController) {
    this.hierarchyController = hierarchyController;
    return this;
  }

  /**
   * Policy Controller configuration for the cluster.
   * @return value or {@code null} for none
   */
  public ConfigManagementPolicyController getPolicyController() {
    return policyController;
  }

  /**
   * Policy Controller configuration for the cluster.
   * @param policyController policyController or {@code null} for none
   */
  public ConfigManagementMembershipSpec setPolicyController(ConfigManagementPolicyController policyController) {
    this.policyController = policyController;
    return this;
  }

  /**
   * Version of ACM installed.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version of ACM installed.
   * @param version version or {@code null} for none
   */
  public ConfigManagementMembershipSpec setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public ConfigManagementMembershipSpec set(String fieldName, Object value) {
    return (ConfigManagementMembershipSpec) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementMembershipSpec clone() {
    return (ConfigManagementMembershipSpec) super.clone();
  }

}
