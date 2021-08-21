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
 * Response message for `TestIamPermissions` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestIamPermissionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A subset of `TestPermissionsRequest.permissions` that the caller is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> permissions;

  /**
   * A subset of `TestPermissionsRequest.permissions` that the caller is allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPermissions() {
    return permissions;
  }

  /**
   * A subset of `TestPermissionsRequest.permissions` that the caller is allowed.
   * @param permissions permissions or {@code null} for none
   */
  public TestIamPermissionsResponse setPermissions(java.util.List<java.lang.String> permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public TestIamPermissionsResponse set(String fieldName, Object value) {
    return (TestIamPermissionsResponse) super.set(fieldName, value);
  }

  @Override
  public TestIamPermissionsResponse clone() {
    return (TestIamPermissionsResponse) super.clone();
  }

}
