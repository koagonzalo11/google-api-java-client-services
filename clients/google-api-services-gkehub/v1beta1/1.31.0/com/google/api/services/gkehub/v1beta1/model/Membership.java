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

package com.google.api.services.gkehub.v1beta1.model;

/**
 * Membership contains information about a member cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Membership extends com.google.api.client.json.GenericJson {

  /**
   * Optional. How to identify workloads from this Membership. See the documentation on Workload
   * Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-
   * identity
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Authority authority;

  /**
   * Output only. When the Membership was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. When the Membership was deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Optional. Description of this membership, limited to 63 characters. Must match the regex:
   * `a-zA-Z0-9*`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Endpoint information to reach this member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MembershipEndpoint endpoint;

  /**
   * Optional. An externally-generated and managed ID for this Membership. This ID may be modified
   * after creation, but this is not recommended. For GKE clusters, external_id is managed by the
   * Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this
   * Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-
   * system` namespace object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalId;

  /**
   * Optional. The infrastructure type this Membership is running on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String infrastructureType;

  /**
   * Optional. GCP labels for this membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes, not continuously.
   * For clusters that do not use GKE Connect, or that have never connected successfully, this field
   * will be unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastConnectionTime;

  /**
   * Output only. The full, unique name of this Membership resource in the format
   * `projects/locations/memberships/{membership_id}`, set during creation. `membership_id` must be
   * a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of
   * lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric
   * character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum
   * length of 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the Membership resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MembershipState state;

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Membership
   * resources. If a Membership resource is deleted and another resource with the same name is
   * created, it gets a different unique_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueId;

  /**
   * Output only. When the Membership was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. How to identify workloads from this Membership. See the documentation on Workload
   * Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-
   * identity
   * @return value or {@code null} for none
   */
  public Authority getAuthority() {
    return authority;
  }

  /**
   * Optional. How to identify workloads from this Membership. See the documentation on Workload
   * Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-
   * identity
   * @param authority authority or {@code null} for none
   */
  public Membership setAuthority(Authority authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Output only. When the Membership was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. When the Membership was created.
   * @param createTime createTime or {@code null} for none
   */
  public Membership setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. When the Membership was deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. When the Membership was deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Membership setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Optional. Description of this membership, limited to 63 characters. Must match the regex:
   * `a-zA-Z0-9*`
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of this membership, limited to 63 characters. Must match the regex:
   * `a-zA-Z0-9*`
   * @param description description or {@code null} for none
   */
  public Membership setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Endpoint information to reach this member.
   * @return value or {@code null} for none
   */
  public MembershipEndpoint getEndpoint() {
    return endpoint;
  }

  /**
   * Optional. Endpoint information to reach this member.
   * @param endpoint endpoint or {@code null} for none
   */
  public Membership setEndpoint(MembershipEndpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Optional. An externally-generated and managed ID for this Membership. This ID may be modified
   * after creation, but this is not recommended. For GKE clusters, external_id is managed by the
   * Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this
   * Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-
   * system` namespace object.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * Optional. An externally-generated and managed ID for this Membership. This ID may be modified
   * after creation, but this is not recommended. For GKE clusters, external_id is managed by the
   * Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this
   * Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-
   * system` namespace object.
   * @param externalId externalId or {@code null} for none
   */
  public Membership setExternalId(java.lang.String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Optional. The infrastructure type this Membership is running on.
   * @return value or {@code null} for none
   */
  public java.lang.String getInfrastructureType() {
    return infrastructureType;
  }

  /**
   * Optional. The infrastructure type this Membership is running on.
   * @param infrastructureType infrastructureType or {@code null} for none
   */
  public Membership setInfrastructureType(java.lang.String infrastructureType) {
    this.infrastructureType = infrastructureType;
    return this;
  }

  /**
   * Optional. GCP labels for this membership.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. GCP labels for this membership.
   * @param labels labels or {@code null} for none
   */
  public Membership setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes, not continuously.
   * For clusters that do not use GKE Connect, or that have never connected successfully, this field
   * will be unset.
   * @return value or {@code null} for none
   */
  public String getLastConnectionTime() {
    return lastConnectionTime;
  }

  /**
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes, not continuously.
   * For clusters that do not use GKE Connect, or that have never connected successfully, this field
   * will be unset.
   * @param lastConnectionTime lastConnectionTime or {@code null} for none
   */
  public Membership setLastConnectionTime(String lastConnectionTime) {
    this.lastConnectionTime = lastConnectionTime;
    return this;
  }

  /**
   * Output only. The full, unique name of this Membership resource in the format
   * `projects/locations/memberships/{membership_id}`, set during creation. `membership_id` must be
   * a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of
   * lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric
   * character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum
   * length of 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The full, unique name of this Membership resource in the format
   * `projects/locations/memberships/{membership_id}`, set during creation. `membership_id` must be
   * a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of
   * lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric
   * character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum
   * length of 63 characters.
   * @param name name or {@code null} for none
   */
  public Membership setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the Membership resource.
   * @return value or {@code null} for none
   */
  public MembershipState getState() {
    return state;
  }

  /**
   * Output only. State of the Membership resource.
   * @param state state or {@code null} for none
   */
  public Membership setState(MembershipState state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Membership
   * resources. If a Membership resource is deleted and another resource with the same name is
   * created, it gets a different unique_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueId() {
    return uniqueId;
  }

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Membership
   * resources. If a Membership resource is deleted and another resource with the same name is
   * created, it gets a different unique_id.
   * @param uniqueId uniqueId or {@code null} for none
   */
  public Membership setUniqueId(java.lang.String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * Output only. When the Membership was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. When the Membership was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Membership setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Membership set(String fieldName, Object value) {
    return (Membership) super.set(fieldName, value);
  }

  @Override
  public Membership clone() {
    return (Membership) super.clone();
  }

}
