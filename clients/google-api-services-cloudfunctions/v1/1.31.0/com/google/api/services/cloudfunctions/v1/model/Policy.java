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

package com.google.api.services.cloudfunctions.v1.model;

/**
 * An Identity and Access Management (IAM) policy, which specifies access controls for Google Cloud
 * resources. A `Policy` is a collection of `bindings`. A `binding` binds one or more `members` to a
 * single `role`. Members can be user accounts, service accounts, Google groups, and domains (such
 * as G Suite). A `role` is a named list of permissions; each `role` can be an IAM predefined role
 * or a user-created custom role. For some types of Google Cloud resources, a `binding` can also
 * specify a `condition`, which is a logical expression that allows access to a resource only if the
 * expression evaluates to `true`. A condition can add constraints based on attributes of the
 * request, the resource, or both. To learn which resources support conditions in their IAM
 * policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-
 * policies). **JSON example:** { "bindings": [ { "role": "roles/resourcemanager.organizationAdmin",
 * "members": [ "user:mike@example.com", "group:admins@example.com", "domain:google.com",
 * "serviceAccount:my-project-id@appspot.gserviceaccount.com" ] }, { "role":
 * "roles/resourcemanager.organizationViewer", "members": [ "user:eve@example.com" ], "condition": {
 * "title": "expirable access", "description": "Does not grant access after Sep 2020", "expression":
 * "request.time < timestamp('2020-10-01T00:00:00.000Z')", } } ], "etag": "BwWWja0YfJA=", "version":
 * 3 } **YAML example:** bindings: - members: - user:mike@example.com - group:admins@example.com -
 * domain:google.com - serviceAccount:my-project-id@appspot.gserviceaccount.com role:
 * roles/resourcemanager.organizationAdmin - members: - user:eve@example.com role:
 * roles/resourcemanager.organizationViewer condition: title: expirable access description: Does not
 * grant access after Sep 2020 expression: request.time < timestamp('2020-10-01T00:00:00.000Z')
 * etag: BwWWja0YfJA= version: 3 For a description of IAM and its features, see the [IAM
 * documentation](https://cloud.google.com/iam/docs/).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * Specifies cloud audit logging configuration for this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuditConfig> auditConfigs;

  static {
    // hack to force ProGuard to consider AuditConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AuditConfig.class);
  }

  /**
   * Associates a list of `members` to a `role`. Optionally, may specify a `condition` that
   * determines how and when the `bindings` are applied. Each of the `bindings` must contain at
   * least one member. The `bindings` in a `Policy` can refer to up to 1,500 members; up to 250 of
   * these members can be Google groups. Each occurrence of a member counts towards these limits.
   * For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to
   * any other member, then you can add another 1,450 members to the `bindings` in the `Policy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Binding> bindings;

  static {
    // hack to force ProGuard to consider Binding used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Binding.class);
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy. **Important:** If you use IAM Conditions, you must include
   * the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you
   * to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the
   * version `3` policy are lost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify
   * an invalid value are rejected. Any operation that affects conditional role bindings must
   * specify version `3`. This requirement applies to the following operations: * Getting a policy
   * that includes a conditional role binding * Adding a conditional role binding to a policy *
   * Changing a conditional role binding in a policy * Removing any role binding, with or without a
   * condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you
   * must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then
   * IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the
   * conditions in the version `3` policy are lost. If a policy does not include any conditions,
   * operations on that policy may specify any valid version or leave the field unset. To learn
   * which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * Specifies cloud audit logging configuration for this policy.
   * @return value or {@code null} for none
   */
  public java.util.List<AuditConfig> getAuditConfigs() {
    return auditConfigs;
  }

  /**
   * Specifies cloud audit logging configuration for this policy.
   * @param auditConfigs auditConfigs or {@code null} for none
   */
  public Policy setAuditConfigs(java.util.List<AuditConfig> auditConfigs) {
    this.auditConfigs = auditConfigs;
    return this;
  }

  /**
   * Associates a list of `members` to a `role`. Optionally, may specify a `condition` that
   * determines how and when the `bindings` are applied. Each of the `bindings` must contain at
   * least one member. The `bindings` in a `Policy` can refer to up to 1,500 members; up to 250 of
   * these members can be Google groups. Each occurrence of a member counts towards these limits.
   * For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to
   * any other member, then you can add another 1,450 members to the `bindings` in the `Policy`.
   * @return value or {@code null} for none
   */
  public java.util.List<Binding> getBindings() {
    return bindings;
  }

  /**
   * Associates a list of `members` to a `role`. Optionally, may specify a `condition` that
   * determines how and when the `bindings` are applied. Each of the `bindings` must contain at
   * least one member. The `bindings` in a `Policy` can refer to up to 1,500 members; up to 250 of
   * these members can be Google groups. Each occurrence of a member counts towards these limits.
   * For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to
   * any other member, then you can add another 1,450 members to the `bindings` in the `Policy`.
   * @param bindings bindings or {@code null} for none
   */
  public Policy setBindings(java.util.List<Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy. **Important:** If you use IAM Conditions, you must include
   * the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you
   * to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the
   * version `3` policy are lost.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy. **Important:** If you use IAM Conditions, you must include
   * the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you
   * to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the
   * version `3` policy are lost.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy. **Important:** If you use IAM Conditions, you must include
   * the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you
   * to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the
   * version `3` policy are lost.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public Policy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy. **Important:** If you use IAM Conditions, you must include
   * the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you
   * to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the
   * version `3` policy are lost.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Policy encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify
   * an invalid value are rejected. Any operation that affects conditional role bindings must
   * specify version `3`. This requirement applies to the following operations: * Getting a policy
   * that includes a conditional role binding * Adding a conditional role binding to a policy *
   * Changing a conditional role binding in a policy * Removing any role binding, with or without a
   * condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you
   * must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then
   * IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the
   * conditions in the version `3` policy are lost. If a policy does not include any conditions,
   * operations on that policy may specify any valid version or leave the field unset. To learn
   * which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify
   * an invalid value are rejected. Any operation that affects conditional role bindings must
   * specify version `3`. This requirement applies to the following operations: * Getting a policy
   * that includes a conditional role binding * Adding a conditional role binding to a policy *
   * Changing a conditional role binding in a policy * Removing any role binding, with or without a
   * condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you
   * must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then
   * IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the
   * conditions in the version `3` policy are lost. If a policy does not include any conditions,
   * operations on that policy may specify any valid version or leave the field unset. To learn
   * which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @param version version or {@code null} for none
   */
  public Policy setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
