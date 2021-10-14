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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Resource representing a policy schema. Next ID: 11
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyV1PolicySchema extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Specific access restrictions related to this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessRestrictions;

  /**
   * Output only. Additional key names that will be used to identify the target of the policy value.
   * When specifying a `policyTargetKey`, each of the additional keys specified here will have to be
   * included in the `additionalTargetKeys` map.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1AdditionalTargetKeyName> additionalTargetKeyNames;

  static {
    // hack to force ProGuard to consider GoogleChromePolicyV1AdditionalTargetKeyName used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromePolicyV1AdditionalTargetKeyName.class);
  }

  /**
   * Schema definition using proto descriptor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2FileDescriptorProto definition;

  /**
   * Output only. Detailed description of each field that is part of the schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> fieldDescriptions;

  /**
   * Format: name=customers/{customer}/policySchemas/{schema_namespace}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Special notice messages related to setting certain values in certain fields in the
   * schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1PolicySchemaNoticeDescription> notices;

  /**
   * Output only. Description about the policy schema for user consumption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyDescription;

  /**
   * Output only. The full qualified name of the policy schema. This value is used to fill the field
   * `policy_schema` in PolicyValue when calling BatchInheritOrgUnitPolicies
   * BatchModifyOrgUnitPolicies BatchModifyGroupPolicies or BatchDeleteGroupPolicies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schemaName;

  /**
   * Output only. URI to related support article for this schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String supportUri;

  /**
   * Output only. Information about applicable target resources for the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> validTargetResources;

  /**
   * Output only. Specific access restrictions related to this policy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessRestrictions() {
    return accessRestrictions;
  }

  /**
   * Output only. Specific access restrictions related to this policy.
   * @param accessRestrictions accessRestrictions or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setAccessRestrictions(java.util.List<java.lang.String> accessRestrictions) {
    this.accessRestrictions = accessRestrictions;
    return this;
  }

  /**
   * Output only. Additional key names that will be used to identify the target of the policy value.
   * When specifying a `policyTargetKey`, each of the additional keys specified here will have to be
   * included in the `additionalTargetKeys` map.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1AdditionalTargetKeyName> getAdditionalTargetKeyNames() {
    return additionalTargetKeyNames;
  }

  /**
   * Output only. Additional key names that will be used to identify the target of the policy value.
   * When specifying a `policyTargetKey`, each of the additional keys specified here will have to be
   * included in the `additionalTargetKeys` map.
   * @param additionalTargetKeyNames additionalTargetKeyNames or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setAdditionalTargetKeyNames(java.util.List<GoogleChromePolicyV1AdditionalTargetKeyName> additionalTargetKeyNames) {
    this.additionalTargetKeyNames = additionalTargetKeyNames;
    return this;
  }

  /**
   * Schema definition using proto descriptor.
   * @return value or {@code null} for none
   */
  public Proto2FileDescriptorProto getDefinition() {
    return definition;
  }

  /**
   * Schema definition using proto descriptor.
   * @param definition definition or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setDefinition(Proto2FileDescriptorProto definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Output only. Detailed description of each field that is part of the schema.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> getFieldDescriptions() {
    return fieldDescriptions;
  }

  /**
   * Output only. Detailed description of each field that is part of the schema.
   * @param fieldDescriptions fieldDescriptions or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setFieldDescriptions(java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> fieldDescriptions) {
    this.fieldDescriptions = fieldDescriptions;
    return this;
  }

  /**
   * Format: name=customers/{customer}/policySchemas/{schema_namespace}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Format: name=customers/{customer}/policySchemas/{schema_namespace}
   * @param name name or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Special notice messages related to setting certain values in certain fields in the
   * schema.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1PolicySchemaNoticeDescription> getNotices() {
    return notices;
  }

  /**
   * Output only. Special notice messages related to setting certain values in certain fields in the
   * schema.
   * @param notices notices or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setNotices(java.util.List<GoogleChromePolicyV1PolicySchemaNoticeDescription> notices) {
    this.notices = notices;
    return this;
  }

  /**
   * Output only. Description about the policy schema for user consumption.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyDescription() {
    return policyDescription;
  }

  /**
   * Output only. Description about the policy schema for user consumption.
   * @param policyDescription policyDescription or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setPolicyDescription(java.lang.String policyDescription) {
    this.policyDescription = policyDescription;
    return this;
  }

  /**
   * Output only. The full qualified name of the policy schema. This value is used to fill the field
   * `policy_schema` in PolicyValue when calling BatchInheritOrgUnitPolicies
   * BatchModifyOrgUnitPolicies BatchModifyGroupPolicies or BatchDeleteGroupPolicies.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchemaName() {
    return schemaName;
  }

  /**
   * Output only. The full qualified name of the policy schema. This value is used to fill the field
   * `policy_schema` in PolicyValue when calling BatchInheritOrgUnitPolicies
   * BatchModifyOrgUnitPolicies BatchModifyGroupPolicies or BatchDeleteGroupPolicies.
   * @param schemaName schemaName or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setSchemaName(java.lang.String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * Output only. URI to related support article for this schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getSupportUri() {
    return supportUri;
  }

  /**
   * Output only. URI to related support article for this schema.
   * @param supportUri supportUri or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setSupportUri(java.lang.String supportUri) {
    this.supportUri = supportUri;
    return this;
  }

  /**
   * Output only. Information about applicable target resources for the policy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValidTargetResources() {
    return validTargetResources;
  }

  /**
   * Output only. Information about applicable target resources for the policy.
   * @param validTargetResources validTargetResources or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchema setValidTargetResources(java.util.List<java.lang.String> validTargetResources) {
    this.validTargetResources = validTargetResources;
    return this;
  }

  @Override
  public GoogleChromePolicyV1PolicySchema set(String fieldName, Object value) {
    return (GoogleChromePolicyV1PolicySchema) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyV1PolicySchema clone() {
    return (GoogleChromePolicyV1PolicySchema) super.clone();
  }

}
