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
 * Represents an Interconnect Attachment (VLAN) Location resource. You can use this resource to find
 * location details about an Interconnect attachment (VLAN). For more information about interconnect
 * attachments, read Creating VLAN Attachments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectLocation extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The postal address of the Point of Presence, each line in the address is
   * separated by a newline character.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * [Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   * (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   * Example: "zone1" or "zone2".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availabilityZone;

  /**
   * [Output Only] Metropolitan area designator that indicates which city an interconnect is
   * located. For example: "Chicago, IL", "Amsterdam, Netherlands".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * [Output Only] Continent for this location, which can take one of the following values: - AFRICA
   * - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String continent;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * [Output Only] An optional description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String facilityProvider;

  /**
   * [Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String facilityProviderFacilityId;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   * locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   * peeringdb).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peeringdbFacilityId;

  /**
   * [Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   * pertaining to the relation between this InterconnectLocation and various Google Cloud regions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InterconnectLocationRegionInfo> regionInfos;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The status of this InterconnectLocation, which can take one of the following
   * values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   * Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   * Interconnects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] The postal address of the Point of Presence, each line in the address is
   * separated by a newline character.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * [Output Only] The postal address of the Point of Presence, each line in the address is
   * separated by a newline character.
   * @param address address or {@code null} for none
   */
  public InterconnectLocation setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * [Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   * (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   * Example: "zone1" or "zone2".
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * [Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   * (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   * Example: "zone1" or "zone2".
   * @param availabilityZone availabilityZone or {@code null} for none
   */
  public InterconnectLocation setAvailabilityZone(java.lang.String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * [Output Only] Metropolitan area designator that indicates which city an interconnect is
   * located. For example: "Chicago, IL", "Amsterdam, Netherlands".
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * [Output Only] Metropolitan area designator that indicates which city an interconnect is
   * located. For example: "Chicago, IL", "Amsterdam, Netherlands".
   * @param city city or {@code null} for none
   */
  public InterconnectLocation setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * [Output Only] Continent for this location, which can take one of the following values: - AFRICA
   * - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA
   * @return value or {@code null} for none
   */
  public java.lang.String getContinent() {
    return continent;
  }

  /**
   * [Output Only] Continent for this location, which can take one of the following values: - AFRICA
   * - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA
   * @param continent continent or {@code null} for none
   */
  public InterconnectLocation setContinent(java.lang.String continent) {
    this.continent = continent;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public InterconnectLocation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * [Output Only] An optional description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Output Only] An optional description of the resource.
   * @param description description or {@code null} for none
   */
  public InterconnectLocation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
   * @return value or {@code null} for none
   */
  public java.lang.String getFacilityProvider() {
    return facilityProvider;
  }

  /**
   * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
   * @param facilityProvider facilityProvider or {@code null} for none
   */
  public InterconnectLocation setFacilityProvider(java.lang.String facilityProvider) {
    this.facilityProvider = facilityProvider;
    return this;
  }

  /**
   * [Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).
   * @return value or {@code null} for none
   */
  public java.lang.String getFacilityProviderFacilityId() {
    return facilityProviderFacilityId;
  }

  /**
   * [Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).
   * @param facilityProviderFacilityId facilityProviderFacilityId or {@code null} for none
   */
  public InterconnectLocation setFacilityProviderFacilityId(java.lang.String facilityProviderFacilityId) {
    this.facilityProviderFacilityId = facilityProviderFacilityId;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public InterconnectLocation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   * locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   * locations.
   * @param kind kind or {@code null} for none
   */
  public InterconnectLocation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] Name of the resource.
   * @param name name or {@code null} for none
   */
  public InterconnectLocation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   * peeringdb).
   * @return value or {@code null} for none
   */
  public java.lang.String getPeeringdbFacilityId() {
    return peeringdbFacilityId;
  }

  /**
   * [Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   * peeringdb).
   * @param peeringdbFacilityId peeringdbFacilityId or {@code null} for none
   */
  public InterconnectLocation setPeeringdbFacilityId(java.lang.String peeringdbFacilityId) {
    this.peeringdbFacilityId = peeringdbFacilityId;
    return this;
  }

  /**
   * [Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   * pertaining to the relation between this InterconnectLocation and various Google Cloud regions.
   * @return value or {@code null} for none
   */
  public java.util.List<InterconnectLocationRegionInfo> getRegionInfos() {
    return regionInfos;
  }

  /**
   * [Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   * pertaining to the relation between this InterconnectLocation and various Google Cloud regions.
   * @param regionInfos regionInfos or {@code null} for none
   */
  public InterconnectLocation setRegionInfos(java.util.List<InterconnectLocationRegionInfo> regionInfos) {
    this.regionInfos = regionInfos;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public InterconnectLocation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The status of this InterconnectLocation, which can take one of the following
   * values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   * Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   * Interconnects.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of this InterconnectLocation, which can take one of the following
   * values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   * Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   * Interconnects.
   * @param status status or {@code null} for none
   */
  public InterconnectLocation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public InterconnectLocation set(String fieldName, Object value) {
    return (InterconnectLocation) super.set(fieldName, value);
  }

  @Override
  public InterconnectLocation clone() {
    return (InterconnectLocation) super.clone();
  }

}
