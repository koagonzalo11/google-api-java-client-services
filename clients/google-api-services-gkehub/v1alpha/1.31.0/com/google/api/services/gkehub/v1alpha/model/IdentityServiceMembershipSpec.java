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
 * **Anthos Identity Service**: Configuration for a single Membership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IdentityServiceMembershipSpec extends com.google.api.client.json.GenericJson {

  /**
   * A member may support multiple auth methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IdentityServiceAuthMethod> authMethods;

  static {
    // hack to force ProGuard to consider IdentityServiceAuthMethod used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IdentityServiceAuthMethod.class);
  }

  /**
   * A member may support multiple auth methods.
   * @return value or {@code null} for none
   */
  public java.util.List<IdentityServiceAuthMethod> getAuthMethods() {
    return authMethods;
  }

  /**
   * A member may support multiple auth methods.
   * @param authMethods authMethods or {@code null} for none
   */
  public IdentityServiceMembershipSpec setAuthMethods(java.util.List<IdentityServiceAuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }

  @Override
  public IdentityServiceMembershipSpec set(String fieldName, Object value) {
    return (IdentityServiceMembershipSpec) super.set(fieldName, value);
  }

  @Override
  public IdentityServiceMembershipSpec clone() {
    return (IdentityServiceMembershipSpec) super.clone();
  }

}
