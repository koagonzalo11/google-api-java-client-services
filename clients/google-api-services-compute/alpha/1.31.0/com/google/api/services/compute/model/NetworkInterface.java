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

package com.google.api.services.compute.model;

/**
 * A network interface resource attached to an instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkInterface extends com.google.api.client.json.GenericJson {

  /**
   * An array of configurations for this interface. Currently, only one access config,
   * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will
   * have no external internet access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccessConfig> accessConfigs;

  static {
    // hack to force ProGuard to consider AccessConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AccessConfig.class);
  }

  /**
   * An array of alias IP ranges for this network interface. You can only specify this field for
   * network interfaces in VPC networks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AliasIpRange> aliasIpRanges;

  static {
    // hack to force ProGuard to consider AliasIpRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AliasIpRange.class);
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface. The request will fail with error 400 Bad Request if
   * the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The prefix length of the primary internal IPv6 range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer internalIpv6PrefixLength;

  /**
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access
   * config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this
   * instance will have no external IPv6 Internet access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccessConfig> ipv6AccessConfigs;

  static {
    // hack to force ProGuard to consider AccessConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AccessConfig.class);
  }

  /**
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the
   * Internet. This field is always inherited from its subnetwork. Valid only if stackType is
   * IPV4_IPV6.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6AccessType;

  /**
   * An IPv6 internal network address for this network interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6Address;

  /**
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] The name of the network interface, which is generated by the server. For a VM,
   * the network interface uses the nicN naming format. Where N is a value between 0 and 7. The
   * default interface value is nic0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * URL of the VPC network resource for this instance. When creating an instance, if neither the
   * network nor the subnetwork is specified, the default network global/networks/default is used.
   * If the selected project doesn't have the default network, you must specify a network or subnet.
   * If the network is not specified but the subnetwork is specified, the network is inferred. If
   * you specify this property, you can specify the network as a full or partial URL. For example,
   * the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/global/networks/ network -
   * projects/project/global/networks/network - global/networks/default
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * An IPv4 internal IP address to assign to the instance for this network interface. If not
   * specified by the user, an unused internal IP is assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkIP;

  /**
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nicType;

  /**
   * The networking queue count that's specified by users for the network interface. Both Rx and Tx
   * queues will be set to this number. It'll be empty if not specified by the users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer queueCount;

  /**
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or
   * not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation
   * and update network interface operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stackType;

  /**
   * SubInterfaces help enable L2 communication for the instance over subnetworks that support L2.
   * Every network interface will get a default untagged (vlan not specified) subinterface. Users
   * can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkInterfaceSubInterface> subinterfaces;

  /**
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
   * mode, do not specify this field. If the network is in auto subnet mode, specifying the
   * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
   * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
   * For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork -
   * regions/region/subnetworks/subnetwork
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * An array of configurations for this interface. Currently, only one access config,
   * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will
   * have no external internet access.
   * @return value or {@code null} for none
   */
  public java.util.List<AccessConfig> getAccessConfigs() {
    return accessConfigs;
  }

  /**
   * An array of configurations for this interface. Currently, only one access config,
   * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will
   * have no external internet access.
   * @param accessConfigs accessConfigs or {@code null} for none
   */
  public NetworkInterface setAccessConfigs(java.util.List<AccessConfig> accessConfigs) {
    this.accessConfigs = accessConfigs;
    return this;
  }

  /**
   * An array of alias IP ranges for this network interface. You can only specify this field for
   * network interfaces in VPC networks.
   * @return value or {@code null} for none
   */
  public java.util.List<AliasIpRange> getAliasIpRanges() {
    return aliasIpRanges;
  }

  /**
   * An array of alias IP ranges for this network interface. You can only specify this field for
   * network interfaces in VPC networks.
   * @param aliasIpRanges aliasIpRanges or {@code null} for none
   */
  public NetworkInterface setAliasIpRanges(java.util.List<AliasIpRange> aliasIpRanges) {
    this.aliasIpRanges = aliasIpRanges;
    return this;
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface. The request will fail with error 400 Bad Request if
   * the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface. The request will fail with error 400 Bad Request if
   * the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface. The request will fail with error 400 Bad Request if
   * the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public NetworkInterface setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface. The request will fail with error 400 Bad Request if
   * the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public NetworkInterface encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * The prefix length of the primary internal IPv6 range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInternalIpv6PrefixLength() {
    return internalIpv6PrefixLength;
  }

  /**
   * The prefix length of the primary internal IPv6 range.
   * @param internalIpv6PrefixLength internalIpv6PrefixLength or {@code null} for none
   */
  public NetworkInterface setInternalIpv6PrefixLength(java.lang.Integer internalIpv6PrefixLength) {
    this.internalIpv6PrefixLength = internalIpv6PrefixLength;
    return this;
  }

  /**
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access
   * config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this
   * instance will have no external IPv6 Internet access.
   * @return value or {@code null} for none
   */
  public java.util.List<AccessConfig> getIpv6AccessConfigs() {
    return ipv6AccessConfigs;
  }

  /**
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access
   * config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this
   * instance will have no external IPv6 Internet access.
   * @param ipv6AccessConfigs ipv6AccessConfigs or {@code null} for none
   */
  public NetworkInterface setIpv6AccessConfigs(java.util.List<AccessConfig> ipv6AccessConfigs) {
    this.ipv6AccessConfigs = ipv6AccessConfigs;
    return this;
  }

  /**
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the
   * Internet. This field is always inherited from its subnetwork. Valid only if stackType is
   * IPV4_IPV6.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6AccessType() {
    return ipv6AccessType;
  }

  /**
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the
   * Internet. This field is always inherited from its subnetwork. Valid only if stackType is
   * IPV4_IPV6.
   * @param ipv6AccessType ipv6AccessType or {@code null} for none
   */
  public NetworkInterface setIpv6AccessType(java.lang.String ipv6AccessType) {
    this.ipv6AccessType = ipv6AccessType;
    return this;
  }

  /**
   * An IPv6 internal network address for this network interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6Address() {
    return ipv6Address;
  }

  /**
   * An IPv6 internal network address for this network interface.
   * @param ipv6Address ipv6Address or {@code null} for none
   */
  public NetworkInterface setIpv6Address(java.lang.String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * @param kind kind or {@code null} for none
   */
  public NetworkInterface setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] The name of the network interface, which is generated by the server. For a VM,
   * the network interface uses the nicN naming format. Where N is a value between 0 and 7. The
   * default interface value is nic0.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] The name of the network interface, which is generated by the server. For a VM,
   * the network interface uses the nicN naming format. Where N is a value between 0 and 7. The
   * default interface value is nic0.
   * @param name name or {@code null} for none
   */
  public NetworkInterface setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * URL of the VPC network resource for this instance. When creating an instance, if neither the
   * network nor the subnetwork is specified, the default network global/networks/default is used.
   * If the selected project doesn't have the default network, you must specify a network or subnet.
   * If the network is not specified but the subnetwork is specified, the network is inferred. If
   * you specify this property, you can specify the network as a full or partial URL. For example,
   * the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/global/networks/ network -
   * projects/project/global/networks/network - global/networks/default
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * URL of the VPC network resource for this instance. When creating an instance, if neither the
   * network nor the subnetwork is specified, the default network global/networks/default is used.
   * If the selected project doesn't have the default network, you must specify a network or subnet.
   * If the network is not specified but the subnetwork is specified, the network is inferred. If
   * you specify this property, you can specify the network as a full or partial URL. For example,
   * the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/global/networks/ network -
   * projects/project/global/networks/network - global/networks/default
   * @param network network or {@code null} for none
   */
  public NetworkInterface setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * An IPv4 internal IP address to assign to the instance for this network interface. If not
   * specified by the user, an unused internal IP is assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkIP() {
    return networkIP;
  }

  /**
   * An IPv4 internal IP address to assign to the instance for this network interface. If not
   * specified by the user, an unused internal IP is assigned by the system.
   * @param networkIP networkIP or {@code null} for none
   */
  public NetworkInterface setNetworkIP(java.lang.String networkIP) {
    this.networkIP = networkIP;
    return this;
  }

  /**
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @return value or {@code null} for none
   */
  public java.lang.String getNicType() {
    return nicType;
  }

  /**
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @param nicType nicType or {@code null} for none
   */
  public NetworkInterface setNicType(java.lang.String nicType) {
    this.nicType = nicType;
    return this;
  }

  /**
   * The networking queue count that's specified by users for the network interface. Both Rx and Tx
   * queues will be set to this number. It'll be empty if not specified by the users.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQueueCount() {
    return queueCount;
  }

  /**
   * The networking queue count that's specified by users for the network interface. Both Rx and Tx
   * queues will be set to this number. It'll be empty if not specified by the users.
   * @param queueCount queueCount or {@code null} for none
   */
  public NetworkInterface setQueueCount(java.lang.Integer queueCount) {
    this.queueCount = queueCount;
    return this;
  }

  /**
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or
   * not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation
   * and update network interface operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getStackType() {
    return stackType;
  }

  /**
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or
   * not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation
   * and update network interface operations.
   * @param stackType stackType or {@code null} for none
   */
  public NetworkInterface setStackType(java.lang.String stackType) {
    this.stackType = stackType;
    return this;
  }

  /**
   * SubInterfaces help enable L2 communication for the instance over subnetworks that support L2.
   * Every network interface will get a default untagged (vlan not specified) subinterface. Users
   * can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkInterfaceSubInterface> getSubinterfaces() {
    return subinterfaces;
  }

  /**
   * SubInterfaces help enable L2 communication for the instance over subnetworks that support L2.
   * Every network interface will get a default untagged (vlan not specified) subinterface. Users
   * can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
   * @param subinterfaces subinterfaces or {@code null} for none
   */
  public NetworkInterface setSubinterfaces(java.util.List<NetworkInterfaceSubInterface> subinterfaces) {
    this.subinterfaces = subinterfaces;
    return this;
  }

  /**
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
   * mode, do not specify this field. If the network is in auto subnet mode, specifying the
   * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
   * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
   * For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork -
   * regions/region/subnetworks/subnetwork
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
   * mode, do not specify this field. If the network is in auto subnet mode, specifying the
   * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
   * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
   * For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork -
   * regions/region/subnetworks/subnetwork
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkInterface setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  @Override
  public NetworkInterface set(String fieldName, Object value) {
    return (NetworkInterface) super.set(fieldName, value);
  }

  @Override
  public NetworkInterface clone() {
    return (NetworkInterface) super.clone();
  }

}
