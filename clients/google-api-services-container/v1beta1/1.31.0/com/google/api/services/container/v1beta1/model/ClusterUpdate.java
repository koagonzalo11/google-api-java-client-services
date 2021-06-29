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

package com.google.api.services.container.v1beta1.model;

/**
 * ClusterUpdate describes an update to the cluster. Exactly one update can be applied to a cluster
 * with each request, so at most one field can be provided.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Configurations for the various addons available to run in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AddonsConfig desiredAddonsConfig;

  /**
   * AuthenticatorGroupsConfig specifies the config for the cluster security groups settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuthenticatorGroupsConfig desiredAuthenticatorGroupsConfig;

  /**
   * The desired Autopilot configuration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Autopilot desiredAutopilot;

  /**
   * The desired configuration options for the Binary Authorization feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BinaryAuthorization desiredBinaryAuthorization;

  /**
   * Cluster-level autoscaling configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterAutoscaling desiredClusterAutoscaling;

  /**
   * The desired telemetry integration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterTelemetry desiredClusterTelemetry;

  /**
   * Configuration of etcd encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseEncryption desiredDatabaseEncryption;

  /**
   * The desired datapath provider for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredDatapathProvider;

  /**
   * The desired status of whether to disable default sNAT for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultSnatStatus desiredDefaultSnatStatus;

  /**
   * DNSConfig contains clusterDNS config for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DNSConfig desiredDnsConfig;

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredImageType;

  /**
   * The desired config of Intra-node visibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig;

  /**
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ILBSubsettingConfig desiredL4ilbSubsettingConfig;

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes
   * should be located. This list must always include the cluster's primary zone. Warning: changing
   * cluster locations will update the locations of all node pools and will result in nodes being
   * added and/or removed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> desiredLocations;

  /**
   * The logging service the cluster should use to write logs. Currently available options: *
   * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
   * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer
   * available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an
   * empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `logging.googleapis.com` for earlier versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredLoggingService;

  /**
   * Configuration for master components.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Master desiredMaster;

  /**
   * The desired configuration options for master authorized networks feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig;

  /**
   * The Kubernetes version to change the master to. The only valid value is the latest supported
   * version. Users may specify either explicit versions offered by Kubernetes Engine or version
   * aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes
   * version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks
   * the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit
   * Kubernetes version - "-": picks the default Kubernetes version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredMasterVersion;

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options: *
   * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native
   * resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer
   * available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as
   * an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredMonitoringService;

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodePoolAutoscaling desiredNodePoolAutoscaling;

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family", "desired_node_pool_autoscaling", or "desired_workload_metadata_config"
   * is specified and there is more than one node pool on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredNodePoolId;

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either
   * explicit versions offered by Kubernetes Engine or version aliases, which have the following
   * behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest
   * valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in
   * the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the
   * Kubernetes master version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredNodeVersion;

  /**
   * The desired notification configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationConfig desiredNotificationConfig;

  /**
   * The desired configuration options for the PodSecurityPolicy feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PodSecurityPolicyConfig desiredPodSecurityPolicyConfig;

  /**
   * The desired private cluster configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateClusterConfig desiredPrivateClusterConfig;

  /**
   * The desired state of IPv6 connectivity to Google Services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredPrivateIpv6GoogleAccess;

  /**
   * The desired release channel configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReleaseChannel desiredReleaseChannel;

  /**
   * The desired configuration for exporting resource usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceUsageExportConfig desiredResourceUsageExportConfig;

  /**
   * Configuration for Shielded Nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedNodes desiredShieldedNodes;

  /**
   * The desired Cloud TPU configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TpuConfig desiredTpuConfig;

  /**
   * Cluster-level Vertical Pod Autoscaling configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VerticalPodAutoscaling desiredVerticalPodAutoscaling;

  /**
   * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadCertificates desiredWorkloadCertificates;

  /**
   * Configuration for Workload Identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadIdentityConfig desiredWorkloadIdentityConfig;

  /**
   * Configurations for the various addons available to run in the cluster.
   * @return value or {@code null} for none
   */
  public AddonsConfig getDesiredAddonsConfig() {
    return desiredAddonsConfig;
  }

  /**
   * Configurations for the various addons available to run in the cluster.
   * @param desiredAddonsConfig desiredAddonsConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredAddonsConfig(AddonsConfig desiredAddonsConfig) {
    this.desiredAddonsConfig = desiredAddonsConfig;
    return this;
  }

  /**
   * AuthenticatorGroupsConfig specifies the config for the cluster security groups settings.
   * @return value or {@code null} for none
   */
  public AuthenticatorGroupsConfig getDesiredAuthenticatorGroupsConfig() {
    return desiredAuthenticatorGroupsConfig;
  }

  /**
   * AuthenticatorGroupsConfig specifies the config for the cluster security groups settings.
   * @param desiredAuthenticatorGroupsConfig desiredAuthenticatorGroupsConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredAuthenticatorGroupsConfig(AuthenticatorGroupsConfig desiredAuthenticatorGroupsConfig) {
    this.desiredAuthenticatorGroupsConfig = desiredAuthenticatorGroupsConfig;
    return this;
  }

  /**
   * The desired Autopilot configuration for the cluster.
   * @return value or {@code null} for none
   */
  public Autopilot getDesiredAutopilot() {
    return desiredAutopilot;
  }

  /**
   * The desired Autopilot configuration for the cluster.
   * @param desiredAutopilot desiredAutopilot or {@code null} for none
   */
  public ClusterUpdate setDesiredAutopilot(Autopilot desiredAutopilot) {
    this.desiredAutopilot = desiredAutopilot;
    return this;
  }

  /**
   * The desired configuration options for the Binary Authorization feature.
   * @return value or {@code null} for none
   */
  public BinaryAuthorization getDesiredBinaryAuthorization() {
    return desiredBinaryAuthorization;
  }

  /**
   * The desired configuration options for the Binary Authorization feature.
   * @param desiredBinaryAuthorization desiredBinaryAuthorization or {@code null} for none
   */
  public ClusterUpdate setDesiredBinaryAuthorization(BinaryAuthorization desiredBinaryAuthorization) {
    this.desiredBinaryAuthorization = desiredBinaryAuthorization;
    return this;
  }

  /**
   * Cluster-level autoscaling configuration.
   * @return value or {@code null} for none
   */
  public ClusterAutoscaling getDesiredClusterAutoscaling() {
    return desiredClusterAutoscaling;
  }

  /**
   * Cluster-level autoscaling configuration.
   * @param desiredClusterAutoscaling desiredClusterAutoscaling or {@code null} for none
   */
  public ClusterUpdate setDesiredClusterAutoscaling(ClusterAutoscaling desiredClusterAutoscaling) {
    this.desiredClusterAutoscaling = desiredClusterAutoscaling;
    return this;
  }

  /**
   * The desired telemetry integration for the cluster.
   * @return value or {@code null} for none
   */
  public ClusterTelemetry getDesiredClusterTelemetry() {
    return desiredClusterTelemetry;
  }

  /**
   * The desired telemetry integration for the cluster.
   * @param desiredClusterTelemetry desiredClusterTelemetry or {@code null} for none
   */
  public ClusterUpdate setDesiredClusterTelemetry(ClusterTelemetry desiredClusterTelemetry) {
    this.desiredClusterTelemetry = desiredClusterTelemetry;
    return this;
  }

  /**
   * Configuration of etcd encryption.
   * @return value or {@code null} for none
   */
  public DatabaseEncryption getDesiredDatabaseEncryption() {
    return desiredDatabaseEncryption;
  }

  /**
   * Configuration of etcd encryption.
   * @param desiredDatabaseEncryption desiredDatabaseEncryption or {@code null} for none
   */
  public ClusterUpdate setDesiredDatabaseEncryption(DatabaseEncryption desiredDatabaseEncryption) {
    this.desiredDatabaseEncryption = desiredDatabaseEncryption;
    return this;
  }

  /**
   * The desired datapath provider for the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredDatapathProvider() {
    return desiredDatapathProvider;
  }

  /**
   * The desired datapath provider for the cluster.
   * @param desiredDatapathProvider desiredDatapathProvider or {@code null} for none
   */
  public ClusterUpdate setDesiredDatapathProvider(java.lang.String desiredDatapathProvider) {
    this.desiredDatapathProvider = desiredDatapathProvider;
    return this;
  }

  /**
   * The desired status of whether to disable default sNAT for this cluster.
   * @return value or {@code null} for none
   */
  public DefaultSnatStatus getDesiredDefaultSnatStatus() {
    return desiredDefaultSnatStatus;
  }

  /**
   * The desired status of whether to disable default sNAT for this cluster.
   * @param desiredDefaultSnatStatus desiredDefaultSnatStatus or {@code null} for none
   */
  public ClusterUpdate setDesiredDefaultSnatStatus(DefaultSnatStatus desiredDefaultSnatStatus) {
    this.desiredDefaultSnatStatus = desiredDefaultSnatStatus;
    return this;
  }

  /**
   * DNSConfig contains clusterDNS config for this cluster.
   * @return value or {@code null} for none
   */
  public DNSConfig getDesiredDnsConfig() {
    return desiredDnsConfig;
  }

  /**
   * DNSConfig contains clusterDNS config for this cluster.
   * @param desiredDnsConfig desiredDnsConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredDnsConfig(DNSConfig desiredDnsConfig) {
    this.desiredDnsConfig = desiredDnsConfig;
    return this;
  }

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredImageType() {
    return desiredImageType;
  }

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * @param desiredImageType desiredImageType or {@code null} for none
   */
  public ClusterUpdate setDesiredImageType(java.lang.String desiredImageType) {
    this.desiredImageType = desiredImageType;
    return this;
  }

  /**
   * The desired config of Intra-node visibility.
   * @return value or {@code null} for none
   */
  public IntraNodeVisibilityConfig getDesiredIntraNodeVisibilityConfig() {
    return desiredIntraNodeVisibilityConfig;
  }

  /**
   * The desired config of Intra-node visibility.
   * @param desiredIntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredIntraNodeVisibilityConfig(IntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig) {
    this.desiredIntraNodeVisibilityConfig = desiredIntraNodeVisibilityConfig;
    return this;
  }

  /**
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * @return value or {@code null} for none
   */
  public ILBSubsettingConfig getDesiredL4ilbSubsettingConfig() {
    return desiredL4ilbSubsettingConfig;
  }

  /**
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * @param desiredL4ilbSubsettingConfig desiredL4ilbSubsettingConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredL4ilbSubsettingConfig(ILBSubsettingConfig desiredL4ilbSubsettingConfig) {
    this.desiredL4ilbSubsettingConfig = desiredL4ilbSubsettingConfig;
    return this;
  }

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes
   * should be located. This list must always include the cluster's primary zone. Warning: changing
   * cluster locations will update the locations of all node pools and will result in nodes being
   * added and/or removed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDesiredLocations() {
    return desiredLocations;
  }

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes
   * should be located. This list must always include the cluster's primary zone. Warning: changing
   * cluster locations will update the locations of all node pools and will result in nodes being
   * added and/or removed.
   * @param desiredLocations desiredLocations or {@code null} for none
   */
  public ClusterUpdate setDesiredLocations(java.util.List<java.lang.String> desiredLocations) {
    this.desiredLocations = desiredLocations;
    return this;
  }

  /**
   * The logging service the cluster should use to write logs. Currently available options: *
   * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
   * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer
   * available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an
   * empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `logging.googleapis.com` for earlier versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredLoggingService() {
    return desiredLoggingService;
  }

  /**
   * The logging service the cluster should use to write logs. Currently available options: *
   * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
   * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer
   * available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an
   * empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `logging.googleapis.com` for earlier versions.
   * @param desiredLoggingService desiredLoggingService or {@code null} for none
   */
  public ClusterUpdate setDesiredLoggingService(java.lang.String desiredLoggingService) {
    this.desiredLoggingService = desiredLoggingService;
    return this;
  }

  /**
   * Configuration for master components.
   * @return value or {@code null} for none
   */
  public Master getDesiredMaster() {
    return desiredMaster;
  }

  /**
   * Configuration for master components.
   * @param desiredMaster desiredMaster or {@code null} for none
   */
  public ClusterUpdate setDesiredMaster(Master desiredMaster) {
    this.desiredMaster = desiredMaster;
    return this;
  }

  /**
   * The desired configuration options for master authorized networks feature.
   * @return value or {@code null} for none
   */
  public MasterAuthorizedNetworksConfig getDesiredMasterAuthorizedNetworksConfig() {
    return desiredMasterAuthorizedNetworksConfig;
  }

  /**
   * The desired configuration options for master authorized networks feature.
   * @param desiredMasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredMasterAuthorizedNetworksConfig(MasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig) {
    this.desiredMasterAuthorizedNetworksConfig = desiredMasterAuthorizedNetworksConfig;
    return this;
  }

  /**
   * The Kubernetes version to change the master to. The only valid value is the latest supported
   * version. Users may specify either explicit versions offered by Kubernetes Engine or version
   * aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes
   * version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks
   * the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit
   * Kubernetes version - "-": picks the default Kubernetes version
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredMasterVersion() {
    return desiredMasterVersion;
  }

  /**
   * The Kubernetes version to change the master to. The only valid value is the latest supported
   * version. Users may specify either explicit versions offered by Kubernetes Engine or version
   * aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes
   * version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks
   * the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit
   * Kubernetes version - "-": picks the default Kubernetes version
   * @param desiredMasterVersion desiredMasterVersion or {@code null} for none
   */
  public ClusterUpdate setDesiredMasterVersion(java.lang.String desiredMasterVersion) {
    this.desiredMasterVersion = desiredMasterVersion;
    return this;
  }

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options: *
   * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native
   * resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer
   * available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as
   * an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredMonitoringService() {
    return desiredMonitoringService;
  }

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options: *
   * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native
   * resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer
   * available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as
   * an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * @param desiredMonitoringService desiredMonitoringService or {@code null} for none
   */
  public ClusterUpdate setDesiredMonitoringService(java.lang.String desiredMonitoringService) {
    this.desiredMonitoringService = desiredMonitoringService;
    return this;
  }

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * @return value or {@code null} for none
   */
  public NodePoolAutoscaling getDesiredNodePoolAutoscaling() {
    return desiredNodePoolAutoscaling;
  }

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * @param desiredNodePoolAutoscaling desiredNodePoolAutoscaling or {@code null} for none
   */
  public ClusterUpdate setDesiredNodePoolAutoscaling(NodePoolAutoscaling desiredNodePoolAutoscaling) {
    this.desiredNodePoolAutoscaling = desiredNodePoolAutoscaling;
    return this;
  }

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family", "desired_node_pool_autoscaling", or "desired_workload_metadata_config"
   * is specified and there is more than one node pool on the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredNodePoolId() {
    return desiredNodePoolId;
  }

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family", "desired_node_pool_autoscaling", or "desired_workload_metadata_config"
   * is specified and there is more than one node pool on the cluster.
   * @param desiredNodePoolId desiredNodePoolId or {@code null} for none
   */
  public ClusterUpdate setDesiredNodePoolId(java.lang.String desiredNodePoolId) {
    this.desiredNodePoolId = desiredNodePoolId;
    return this;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either
   * explicit versions offered by Kubernetes Engine or version aliases, which have the following
   * behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest
   * valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in
   * the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the
   * Kubernetes master version
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredNodeVersion() {
    return desiredNodeVersion;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either
   * explicit versions offered by Kubernetes Engine or version aliases, which have the following
   * behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest
   * valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in
   * the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the
   * Kubernetes master version
   * @param desiredNodeVersion desiredNodeVersion or {@code null} for none
   */
  public ClusterUpdate setDesiredNodeVersion(java.lang.String desiredNodeVersion) {
    this.desiredNodeVersion = desiredNodeVersion;
    return this;
  }

  /**
   * The desired notification configuration.
   * @return value or {@code null} for none
   */
  public NotificationConfig getDesiredNotificationConfig() {
    return desiredNotificationConfig;
  }

  /**
   * The desired notification configuration.
   * @param desiredNotificationConfig desiredNotificationConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredNotificationConfig(NotificationConfig desiredNotificationConfig) {
    this.desiredNotificationConfig = desiredNotificationConfig;
    return this;
  }

  /**
   * The desired configuration options for the PodSecurityPolicy feature.
   * @return value or {@code null} for none
   */
  public PodSecurityPolicyConfig getDesiredPodSecurityPolicyConfig() {
    return desiredPodSecurityPolicyConfig;
  }

  /**
   * The desired configuration options for the PodSecurityPolicy feature.
   * @param desiredPodSecurityPolicyConfig desiredPodSecurityPolicyConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredPodSecurityPolicyConfig(PodSecurityPolicyConfig desiredPodSecurityPolicyConfig) {
    this.desiredPodSecurityPolicyConfig = desiredPodSecurityPolicyConfig;
    return this;
  }

  /**
   * The desired private cluster configuration.
   * @return value or {@code null} for none
   */
  public PrivateClusterConfig getDesiredPrivateClusterConfig() {
    return desiredPrivateClusterConfig;
  }

  /**
   * The desired private cluster configuration.
   * @param desiredPrivateClusterConfig desiredPrivateClusterConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredPrivateClusterConfig(PrivateClusterConfig desiredPrivateClusterConfig) {
    this.desiredPrivateClusterConfig = desiredPrivateClusterConfig;
    return this;
  }

  /**
   * The desired state of IPv6 connectivity to Google Services.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredPrivateIpv6GoogleAccess() {
    return desiredPrivateIpv6GoogleAccess;
  }

  /**
   * The desired state of IPv6 connectivity to Google Services.
   * @param desiredPrivateIpv6GoogleAccess desiredPrivateIpv6GoogleAccess or {@code null} for none
   */
  public ClusterUpdate setDesiredPrivateIpv6GoogleAccess(java.lang.String desiredPrivateIpv6GoogleAccess) {
    this.desiredPrivateIpv6GoogleAccess = desiredPrivateIpv6GoogleAccess;
    return this;
  }

  /**
   * The desired release channel configuration.
   * @return value or {@code null} for none
   */
  public ReleaseChannel getDesiredReleaseChannel() {
    return desiredReleaseChannel;
  }

  /**
   * The desired release channel configuration.
   * @param desiredReleaseChannel desiredReleaseChannel or {@code null} for none
   */
  public ClusterUpdate setDesiredReleaseChannel(ReleaseChannel desiredReleaseChannel) {
    this.desiredReleaseChannel = desiredReleaseChannel;
    return this;
  }

  /**
   * The desired configuration for exporting resource usage.
   * @return value or {@code null} for none
   */
  public ResourceUsageExportConfig getDesiredResourceUsageExportConfig() {
    return desiredResourceUsageExportConfig;
  }

  /**
   * The desired configuration for exporting resource usage.
   * @param desiredResourceUsageExportConfig desiredResourceUsageExportConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredResourceUsageExportConfig(ResourceUsageExportConfig desiredResourceUsageExportConfig) {
    this.desiredResourceUsageExportConfig = desiredResourceUsageExportConfig;
    return this;
  }

  /**
   * Configuration for Shielded Nodes.
   * @return value or {@code null} for none
   */
  public ShieldedNodes getDesiredShieldedNodes() {
    return desiredShieldedNodes;
  }

  /**
   * Configuration for Shielded Nodes.
   * @param desiredShieldedNodes desiredShieldedNodes or {@code null} for none
   */
  public ClusterUpdate setDesiredShieldedNodes(ShieldedNodes desiredShieldedNodes) {
    this.desiredShieldedNodes = desiredShieldedNodes;
    return this;
  }

  /**
   * The desired Cloud TPU configuration.
   * @return value or {@code null} for none
   */
  public TpuConfig getDesiredTpuConfig() {
    return desiredTpuConfig;
  }

  /**
   * The desired Cloud TPU configuration.
   * @param desiredTpuConfig desiredTpuConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredTpuConfig(TpuConfig desiredTpuConfig) {
    this.desiredTpuConfig = desiredTpuConfig;
    return this;
  }

  /**
   * Cluster-level Vertical Pod Autoscaling configuration.
   * @return value or {@code null} for none
   */
  public VerticalPodAutoscaling getDesiredVerticalPodAutoscaling() {
    return desiredVerticalPodAutoscaling;
  }

  /**
   * Cluster-level Vertical Pod Autoscaling configuration.
   * @param desiredVerticalPodAutoscaling desiredVerticalPodAutoscaling or {@code null} for none
   */
  public ClusterUpdate setDesiredVerticalPodAutoscaling(VerticalPodAutoscaling desiredVerticalPodAutoscaling) {
    this.desiredVerticalPodAutoscaling = desiredVerticalPodAutoscaling;
    return this;
  }

  /**
   * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
   * @return value or {@code null} for none
   */
  public WorkloadCertificates getDesiredWorkloadCertificates() {
    return desiredWorkloadCertificates;
  }

  /**
   * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
   * @param desiredWorkloadCertificates desiredWorkloadCertificates or {@code null} for none
   */
  public ClusterUpdate setDesiredWorkloadCertificates(WorkloadCertificates desiredWorkloadCertificates) {
    this.desiredWorkloadCertificates = desiredWorkloadCertificates;
    return this;
  }

  /**
   * Configuration for Workload Identity.
   * @return value or {@code null} for none
   */
  public WorkloadIdentityConfig getDesiredWorkloadIdentityConfig() {
    return desiredWorkloadIdentityConfig;
  }

  /**
   * Configuration for Workload Identity.
   * @param desiredWorkloadIdentityConfig desiredWorkloadIdentityConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredWorkloadIdentityConfig(WorkloadIdentityConfig desiredWorkloadIdentityConfig) {
    this.desiredWorkloadIdentityConfig = desiredWorkloadIdentityConfig;
    return this;
  }

  @Override
  public ClusterUpdate set(String fieldName, Object value) {
    return (ClusterUpdate) super.set(fieldName, value);
  }

  @Override
  public ClusterUpdate clone() {
    return (ClusterUpdate) super.clone();
  }

}
