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

package com.google.api.services.assuredworkloads.v1.model;

/**
 * An Workload object for managing highly regulated workloads of cloud customers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1beta1Workload extends com.google.api.client.json.GenericJson {

  /**
   * Input only. The billing account used for the resources which are direct children of workload.
   * This billing account is initially associated with the resources created as part of Workload
   * creation. After the initial creation of these resources, the customer can change the assigned
   * billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For
   * example, `billingAccounts/012345-567890-ABCDEF`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingAccount;

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for CJIS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings cjisSettings;

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceRegime;

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by
   * Europe/Canada customers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSovereignControls;

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP High.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings fedrampHighSettings;

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP Moderate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings fedrampModerateSettings;

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for IL4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings il4Settings;

  /**
   * Output only. Represents the KAJ enrollment state of the given workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kajEnrollmentState;

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings kmsSettings;

  /**
   * Optional. Labels applied to the workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either empty or a folder resource which is a child of the Workload parent. If not specified all
   * resources are created under the parent organization. Format: folders/{folder_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provisionedResourcesParent;

  /**
   * Input only. Resource properties that are used to customize workload resources. These properties
   * (such as custom project id) will be used to create workload resources if possible. This field
   * is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings> resourceSettings;

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo> resources;

  /**
   * Output only. Represents the SAA enrollment response of the given workload. SAA enrollment
   * response is queried during GetWorkload call. In failure cases, user friendly error message is
   * shown in SAA details page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse saaEnrollmentResponse;

  /**
   * Input only. The billing account used for the resources which are direct children of workload.
   * This billing account is initially associated with the resources created as part of Workload
   * creation. After the initial creation of these resources, the customer can change the assigned
   * billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For
   * example, `billingAccounts/012345-567890-ABCDEF`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingAccount() {
    return billingAccount;
  }

  /**
   * Input only. The billing account used for the resources which are direct children of workload.
   * This billing account is initially associated with the resources created as part of Workload
   * creation. After the initial creation of these resources, the customer can change the assigned
   * billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For
   * example, `billingAccounts/012345-567890-ABCDEF`.
   * @param billingAccount billingAccount or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setBillingAccount(java.lang.String billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for CJIS.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings getCjisSettings() {
    return cjisSettings;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for CJIS.
   * @param cjisSettings cjisSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setCjisSettings(GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings cjisSettings) {
    this.cjisSettings = cjisSettings;
    return this;
  }

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceRegime() {
    return complianceRegime;
  }

  /**
   * Required. Immutable. Compliance Regime associated with this workload.
   * @param complianceRegime complianceRegime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setComplianceRegime(java.lang.String complianceRegime) {
    this.complianceRegime = complianceRegime;
    return this;
  }

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Immutable. The Workload creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The user-assigned display name of the Workload. When present it must be between 4 to
   * 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and
   * spaces. Example: My Workload
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by
   * Europe/Canada customers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSovereignControls() {
    return enableSovereignControls;
  }

  /**
   * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by
   * Europe/Canada customers.
   * @param enableSovereignControls enableSovereignControls or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setEnableSovereignControls(java.lang.Boolean enableSovereignControls) {
    this.enableSovereignControls = enableSovereignControls;
    return this;
  }

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will
   * be used in Update & Delete operations.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP High.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings getFedrampHighSettings() {
    return fedrampHighSettings;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP High.
   * @param fedrampHighSettings fedrampHighSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setFedrampHighSettings(GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings fedrampHighSettings) {
    this.fedrampHighSettings = fedrampHighSettings;
    return this;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP Moderate.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings getFedrampModerateSettings() {
    return fedrampModerateSettings;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP Moderate.
   * @param fedrampModerateSettings fedrampModerateSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setFedrampModerateSettings(GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings fedrampModerateSettings) {
    this.fedrampModerateSettings = fedrampModerateSettings;
    return this;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for IL4.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings getIl4Settings() {
    return il4Settings;
  }

  /**
   * Required. Input only. Immutable. Settings specific to resources needed for IL4.
   * @param il4Settings il4Settings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setIl4Settings(GoogleCloudAssuredworkloadsV1beta1WorkloadIL4Settings il4Settings) {
    this.il4Settings = il4Settings;
    return this;
  }

  /**
   * Output only. Represents the KAJ enrollment state of the given workload.
   * @return value or {@code null} for none
   */
  public java.lang.String getKajEnrollmentState() {
    return kajEnrollmentState;
  }

  /**
   * Output only. Represents the KAJ enrollment state of the given workload.
   * @param kajEnrollmentState kajEnrollmentState or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setKajEnrollmentState(java.lang.String kajEnrollmentState) {
    this.kajEnrollmentState = kajEnrollmentState;
    return this;
  }

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings getKmsSettings() {
    return kmsSettings;
  }

  /**
   * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key
   * is provisioned. This field is mandatory for a subset of Compliance Regimes.
   * @param kmsSettings kmsSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setKmsSettings(GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings kmsSettings) {
    this.kmsSettings = kmsSettings;
    return this;
  }

  /**
   * Optional. Labels applied to the workload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels applied to the workload.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The resource name of the workload. Format:
   * organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either empty or a folder resource which is a child of the Workload parent. If not specified all
   * resources are created under the parent organization. Format: folders/{folder_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getProvisionedResourcesParent() {
    return provisionedResourcesParent;
  }

  /**
   * Input only. The parent resource for the resources managed by this Assured Workload. May be
   * either empty or a folder resource which is a child of the Workload parent. If not specified all
   * resources are created under the parent organization. Format: folders/{folder_id}
   * @param provisionedResourcesParent provisionedResourcesParent or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setProvisionedResourcesParent(java.lang.String provisionedResourcesParent) {
    this.provisionedResourcesParent = provisionedResourcesParent;
    return this;
  }

  /**
   * Input only. Resource properties that are used to customize workload resources. These properties
   * (such as custom project id) will be used to create workload resources if possible. This field
   * is optional.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings> getResourceSettings() {
    return resourceSettings;
  }

  /**
   * Input only. Resource properties that are used to customize workload resources. These properties
   * (such as custom project id) will be used to create workload resources if possible. This field
   * is optional.
   * @param resourceSettings resourceSettings or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setResourceSettings(java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings> resourceSettings) {
    this.resourceSettings = resourceSettings;
    return this;
  }

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo> getResources() {
    return resources;
  }

  /**
   * Output only. The resources associated with this workload. These resources will be created when
   * creating the workload. If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setResources(java.util.List<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceInfo> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Output only. Represents the SAA enrollment response of the given workload. SAA enrollment
   * response is queried during GetWorkload call. In failure cases, user friendly error message is
   * shown in SAA details page.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse getSaaEnrollmentResponse() {
    return saaEnrollmentResponse;
  }

  /**
   * Output only. Represents the SAA enrollment response of the given workload. SAA enrollment
   * response is queried during GetWorkload call. In failure cases, user friendly error message is
   * shown in SAA details page.
   * @param saaEnrollmentResponse saaEnrollmentResponse or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1Workload setSaaEnrollmentResponse(GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse saaEnrollmentResponse) {
    this.saaEnrollmentResponse = saaEnrollmentResponse;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1Workload set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1beta1Workload) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1Workload clone() {
    return (GoogleCloudAssuredworkloadsV1beta1Workload) super.clone();
  }

}
