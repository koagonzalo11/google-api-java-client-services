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

package com.google.api.services.sqladmin.model;

/**
 * Database instance local user password validation policy
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PasswordValidationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The complexity of the password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complexity;

  /**
   * Disallow username as a part of the password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disallowUsernameSubstring;

  /**
   * Whether the password policy is enabled or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePasswordPolicy;

  /**
   * Minimum number of characters allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minLength;

  /**
   * Minimum interval after which the password can be changed. This flag is only supported for
   * PostgresSQL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String passwordChangeInterval;

  /**
   * Number of previous passwords that cannot be reused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer reuseInterval;

  /**
   * The complexity of the password.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplexity() {
    return complexity;
  }

  /**
   * The complexity of the password.
   * @param complexity complexity or {@code null} for none
   */
  public PasswordValidationPolicy setComplexity(java.lang.String complexity) {
    this.complexity = complexity;
    return this;
  }

  /**
   * Disallow username as a part of the password.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisallowUsernameSubstring() {
    return disallowUsernameSubstring;
  }

  /**
   * Disallow username as a part of the password.
   * @param disallowUsernameSubstring disallowUsernameSubstring or {@code null} for none
   */
  public PasswordValidationPolicy setDisallowUsernameSubstring(java.lang.Boolean disallowUsernameSubstring) {
    this.disallowUsernameSubstring = disallowUsernameSubstring;
    return this;
  }

  /**
   * Whether the password policy is enabled or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePasswordPolicy() {
    return enablePasswordPolicy;
  }

  /**
   * Whether the password policy is enabled or not.
   * @param enablePasswordPolicy enablePasswordPolicy or {@code null} for none
   */
  public PasswordValidationPolicy setEnablePasswordPolicy(java.lang.Boolean enablePasswordPolicy) {
    this.enablePasswordPolicy = enablePasswordPolicy;
    return this;
  }

  /**
   * Minimum number of characters allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinLength() {
    return minLength;
  }

  /**
   * Minimum number of characters allowed.
   * @param minLength minLength or {@code null} for none
   */
  public PasswordValidationPolicy setMinLength(java.lang.Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Minimum interval after which the password can be changed. This flag is only supported for
   * PostgresSQL.
   * @return value or {@code null} for none
   */
  public String getPasswordChangeInterval() {
    return passwordChangeInterval;
  }

  /**
   * Minimum interval after which the password can be changed. This flag is only supported for
   * PostgresSQL.
   * @param passwordChangeInterval passwordChangeInterval or {@code null} for none
   */
  public PasswordValidationPolicy setPasswordChangeInterval(String passwordChangeInterval) {
    this.passwordChangeInterval = passwordChangeInterval;
    return this;
  }

  /**
   * Number of previous passwords that cannot be reused.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReuseInterval() {
    return reuseInterval;
  }

  /**
   * Number of previous passwords that cannot be reused.
   * @param reuseInterval reuseInterval or {@code null} for none
   */
  public PasswordValidationPolicy setReuseInterval(java.lang.Integer reuseInterval) {
    this.reuseInterval = reuseInterval;
    return this;
  }

  @Override
  public PasswordValidationPolicy set(String fieldName, Object value) {
    return (PasswordValidationPolicy) super.set(fieldName, value);
  }

  @Override
  public PasswordValidationPolicy clone() {
    return (PasswordValidationPolicy) super.clone();
  }

}
