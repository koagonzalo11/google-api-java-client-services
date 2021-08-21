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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * **Anthos Config Management**: State for a single cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementMembershipState extends com.google.api.client.json.GenericJson {

  /**
   * Binauthz status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementBinauthzState binauthzState;

  /**
   * The user-defined name for the cluster used by ClusterSelectors to group clusters together. This
   * should match Membership's membership_name, unless the user installed ACM on the cluster
   * manually prior to enabling the ACM hub feature. Unique within a Anthos Config Management
   * installation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * Current sync status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSyncState configSyncState;

  /**
   * Hierarchy Controller status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementHierarchyControllerState hierarchyControllerState;

  /**
   * Membership configuration in the cluster. This represents the actual state in the cluster, while
   * the MembershipSpec in the FeatureSpec represents the intended state
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementMembershipSpec membershipSpec;

  /**
   * Current install status of ACM's Operator
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementOperatorState operatorState;

  /**
   * PolicyController status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementPolicyControllerState policyControllerState;

  /**
   * Binauthz status
   * @return value or {@code null} for none
   */
  public ConfigManagementBinauthzState getBinauthzState() {
    return binauthzState;
  }

  /**
   * Binauthz status
   * @param binauthzState binauthzState or {@code null} for none
   */
  public ConfigManagementMembershipState setBinauthzState(ConfigManagementBinauthzState binauthzState) {
    this.binauthzState = binauthzState;
    return this;
  }

  /**
   * The user-defined name for the cluster used by ClusterSelectors to group clusters together. This
   * should match Membership's membership_name, unless the user installed ACM on the cluster
   * manually prior to enabling the ACM hub feature. Unique within a Anthos Config Management
   * installation.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * The user-defined name for the cluster used by ClusterSelectors to group clusters together. This
   * should match Membership's membership_name, unless the user installed ACM on the cluster
   * manually prior to enabling the ACM hub feature. Unique within a Anthos Config Management
   * installation.
   * @param clusterName clusterName or {@code null} for none
   */
  public ConfigManagementMembershipState setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Current sync status
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSyncState getConfigSyncState() {
    return configSyncState;
  }

  /**
   * Current sync status
   * @param configSyncState configSyncState or {@code null} for none
   */
  public ConfigManagementMembershipState setConfigSyncState(ConfigManagementConfigSyncState configSyncState) {
    this.configSyncState = configSyncState;
    return this;
  }

  /**
   * Hierarchy Controller status
   * @return value or {@code null} for none
   */
  public ConfigManagementHierarchyControllerState getHierarchyControllerState() {
    return hierarchyControllerState;
  }

  /**
   * Hierarchy Controller status
   * @param hierarchyControllerState hierarchyControllerState or {@code null} for none
   */
  public ConfigManagementMembershipState setHierarchyControllerState(ConfigManagementHierarchyControllerState hierarchyControllerState) {
    this.hierarchyControllerState = hierarchyControllerState;
    return this;
  }

  /**
   * Membership configuration in the cluster. This represents the actual state in the cluster, while
   * the MembershipSpec in the FeatureSpec represents the intended state
   * @return value or {@code null} for none
   */
  public ConfigManagementMembershipSpec getMembershipSpec() {
    return membershipSpec;
  }

  /**
   * Membership configuration in the cluster. This represents the actual state in the cluster, while
   * the MembershipSpec in the FeatureSpec represents the intended state
   * @param membershipSpec membershipSpec or {@code null} for none
   */
  public ConfigManagementMembershipState setMembershipSpec(ConfigManagementMembershipSpec membershipSpec) {
    this.membershipSpec = membershipSpec;
    return this;
  }

  /**
   * Current install status of ACM's Operator
   * @return value or {@code null} for none
   */
  public ConfigManagementOperatorState getOperatorState() {
    return operatorState;
  }

  /**
   * Current install status of ACM's Operator
   * @param operatorState operatorState or {@code null} for none
   */
  public ConfigManagementMembershipState setOperatorState(ConfigManagementOperatorState operatorState) {
    this.operatorState = operatorState;
    return this;
  }

  /**
   * PolicyController status
   * @return value or {@code null} for none
   */
  public ConfigManagementPolicyControllerState getPolicyControllerState() {
    return policyControllerState;
  }

  /**
   * PolicyController status
   * @param policyControllerState policyControllerState or {@code null} for none
   */
  public ConfigManagementMembershipState setPolicyControllerState(ConfigManagementPolicyControllerState policyControllerState) {
    this.policyControllerState = policyControllerState;
    return this;
  }

  @Override
  public ConfigManagementMembershipState set(String fieldName, Object value) {
    return (ConfigManagementMembershipState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementMembershipState clone() {
    return (ConfigManagementMembershipState) super.clone();
  }

}
