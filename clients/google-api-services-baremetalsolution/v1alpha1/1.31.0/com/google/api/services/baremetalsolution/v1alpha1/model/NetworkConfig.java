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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * Configuration parameters for a new network.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * Interconnect bandwidth. Set only when type is CLIENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bandwidth;

  /**
   * CIDR range of the network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cidr;

  /**
   * A transient unique identifier to identify a volume within an ProvisioningConfig request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Location where to deploy the network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Service CIDR, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceCidr;

  /**
   * The type of this network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * User note field, it can be used by customers to add additional information for the BMS Ops team
   * (b/194021617).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userNote;

  /**
   * List of VLAN attachments. As of now there are always 2 attachments, but it is going to change
   * in the future (multi vlan).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VlanAttachment> vlanAttachments;

  /**
   * Interconnect bandwidth. Set only when type is CLIENT.
   * @return value or {@code null} for none
   */
  public java.lang.String getBandwidth() {
    return bandwidth;
  }

  /**
   * Interconnect bandwidth. Set only when type is CLIENT.
   * @param bandwidth bandwidth or {@code null} for none
   */
  public NetworkConfig setBandwidth(java.lang.String bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * CIDR range of the network.
   * @return value or {@code null} for none
   */
  public java.lang.String getCidr() {
    return cidr;
  }

  /**
   * CIDR range of the network.
   * @param cidr cidr or {@code null} for none
   */
  public NetworkConfig setCidr(java.lang.String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * A transient unique identifier to identify a volume within an ProvisioningConfig request.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A transient unique identifier to identify a volume within an ProvisioningConfig request.
   * @param id id or {@code null} for none
   */
  public NetworkConfig setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Location where to deploy the network.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location where to deploy the network.
   * @param location location or {@code null} for none
   */
  public NetworkConfig setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Service CIDR, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Service CIDR, if any.
   * @param serviceCidr serviceCidr or {@code null} for none
   */
  public NetworkConfig setServiceCidr(java.lang.String serviceCidr) {
    this.serviceCidr = serviceCidr;
    return this;
  }

  /**
   * The type of this network.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this network.
   * @param type type or {@code null} for none
   */
  public NetworkConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * User note field, it can be used by customers to add additional information for the BMS Ops team
   * (b/194021617).
   * @return value or {@code null} for none
   */
  public java.lang.String getUserNote() {
    return userNote;
  }

  /**
   * User note field, it can be used by customers to add additional information for the BMS Ops team
   * (b/194021617).
   * @param userNote userNote or {@code null} for none
   */
  public NetworkConfig setUserNote(java.lang.String userNote) {
    this.userNote = userNote;
    return this;
  }

  /**
   * List of VLAN attachments. As of now there are always 2 attachments, but it is going to change
   * in the future (multi vlan).
   * @return value or {@code null} for none
   */
  public java.util.List<VlanAttachment> getVlanAttachments() {
    return vlanAttachments;
  }

  /**
   * List of VLAN attachments. As of now there are always 2 attachments, but it is going to change
   * in the future (multi vlan).
   * @param vlanAttachments vlanAttachments or {@code null} for none
   */
  public NetworkConfig setVlanAttachments(java.util.List<VlanAttachment> vlanAttachments) {
    this.vlanAttachments = vlanAttachments;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
