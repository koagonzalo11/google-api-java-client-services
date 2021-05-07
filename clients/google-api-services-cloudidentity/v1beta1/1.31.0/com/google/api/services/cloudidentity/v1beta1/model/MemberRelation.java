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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Message representing a transitive membership of a group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MemberRelation extends com.google.api.client.json.GenericJson {

  /**
   * Resource name for this member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String member;

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityKey> preferredMemberKey;

  static {
    // hack to force ProGuard to consider EntityKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityKey.class);
  }

  /**
   * The relation between the group and the transitive member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relationType;

  /**
   * The membership role details (i.e name of role and expiry time).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TransitiveMembershipRole> roles;

  /**
   * Resource name for this member.
   * @return value or {@code null} for none
   */
  public java.lang.String getMember() {
    return member;
  }

  /**
   * Resource name for this member.
   * @param member member or {@code null} for none
   */
  public MemberRelation setMember(java.lang.String member) {
    this.member = member;
    return this;
  }

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityKey> getPreferredMemberKey() {
    return preferredMemberKey;
  }

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * @param preferredMemberKey preferredMemberKey or {@code null} for none
   */
  public MemberRelation setPreferredMemberKey(java.util.List<EntityKey> preferredMemberKey) {
    this.preferredMemberKey = preferredMemberKey;
    return this;
  }

  /**
   * The relation between the group and the transitive member.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelationType() {
    return relationType;
  }

  /**
   * The relation between the group and the transitive member.
   * @param relationType relationType or {@code null} for none
   */
  public MemberRelation setRelationType(java.lang.String relationType) {
    this.relationType = relationType;
    return this;
  }

  /**
   * The membership role details (i.e name of role and expiry time).
   * @return value or {@code null} for none
   */
  public java.util.List<TransitiveMembershipRole> getRoles() {
    return roles;
  }

  /**
   * The membership role details (i.e name of role and expiry time).
   * @param roles roles or {@code null} for none
   */
  public MemberRelation setRoles(java.util.List<TransitiveMembershipRole> roles) {
    this.roles = roles;
    return this;
  }

  @Override
  public MemberRelation set(String fieldName, Object value) {
    return (MemberRelation) super.set(fieldName, value);
  }

  @Override
  public MemberRelation clone() {
    return (MemberRelation) super.clone();
  }

}
