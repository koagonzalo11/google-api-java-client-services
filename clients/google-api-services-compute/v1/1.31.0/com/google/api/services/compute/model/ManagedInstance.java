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
 * A Managed Instance resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedInstance extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The current action that the managed instance group has scheduled for the
   * instance. Possible values: - NONE The instance is running, and the managed instance group does
   * not have any scheduled actions for this instance. - CREATING The managed instance group is
   * creating this instance. If the group fails to create this instance, it will try again until it
   * is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create
   * this instance only once. If the group fails to create this instance, it does not try again and
   * the group's targetSize value is decreased instead. - RECREATING The managed instance group is
   * recreating this instance. - DELETING The managed instance group is permanently deleting this
   * instance. - ABANDONING The managed instance group is abandoning this instance. The instance
   * will be removed from the instance group and from any target pools that are associated with this
   * group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The
   * managed instance group is applying configuration changes to the instance without stopping it.
   * For example, the group can update the target pool list for an instance without stopping that
   * instance. - VERIFYING The managed instance group has created the instance and it is in the
   * process of being verified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentAction;

  /**
   * [Output only] The unique identifier for this resource. This field is empty when instance does
   * not exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * [Output Only] Health state of the instance per health-check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ManagedInstanceInstanceHealth> instanceHealth;

  /**
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceStatus;

  /**
   * [Output Only] Information about the last attempt to create or delete the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedInstanceLastAttempt lastAttempt;

  /**
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreservedState preservedStateFromConfig;

  /**
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreservedState preservedStateFromPolicy;

  /**
   * [Output Only] Intended version of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedInstanceVersion version;

  /**
   * [Output Only] The current action that the managed instance group has scheduled for the
   * instance. Possible values: - NONE The instance is running, and the managed instance group does
   * not have any scheduled actions for this instance. - CREATING The managed instance group is
   * creating this instance. If the group fails to create this instance, it will try again until it
   * is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create
   * this instance only once. If the group fails to create this instance, it does not try again and
   * the group's targetSize value is decreased instead. - RECREATING The managed instance group is
   * recreating this instance. - DELETING The managed instance group is permanently deleting this
   * instance. - ABANDONING The managed instance group is abandoning this instance. The instance
   * will be removed from the instance group and from any target pools that are associated with this
   * group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The
   * managed instance group is applying configuration changes to the instance without stopping it.
   * For example, the group can update the target pool list for an instance without stopping that
   * instance. - VERIFYING The managed instance group has created the instance and it is in the
   * process of being verified.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentAction() {
    return currentAction;
  }

  /**
   * [Output Only] The current action that the managed instance group has scheduled for the
   * instance. Possible values: - NONE The instance is running, and the managed instance group does
   * not have any scheduled actions for this instance. - CREATING The managed instance group is
   * creating this instance. If the group fails to create this instance, it will try again until it
   * is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create
   * this instance only once. If the group fails to create this instance, it does not try again and
   * the group's targetSize value is decreased instead. - RECREATING The managed instance group is
   * recreating this instance. - DELETING The managed instance group is permanently deleting this
   * instance. - ABANDONING The managed instance group is abandoning this instance. The instance
   * will be removed from the instance group and from any target pools that are associated with this
   * group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The
   * managed instance group is applying configuration changes to the instance without stopping it.
   * For example, the group can update the target pool list for an instance without stopping that
   * instance. - VERIFYING The managed instance group has created the instance and it is in the
   * process of being verified.
   * @param currentAction currentAction or {@code null} for none
   */
  public ManagedInstance setCurrentAction(java.lang.String currentAction) {
    this.currentAction = currentAction;
    return this;
  }

  /**
   * [Output only] The unique identifier for this resource. This field is empty when instance does
   * not exist.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output only] The unique identifier for this resource. This field is empty when instance does
   * not exist.
   * @param id id or {@code null} for none
   */
  public ManagedInstance setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been
   * created.
   * @param instance instance or {@code null} for none
   */
  public ManagedInstance setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * [Output Only] Health state of the instance per health-check.
   * @return value or {@code null} for none
   */
  public java.util.List<ManagedInstanceInstanceHealth> getInstanceHealth() {
    return instanceHealth;
  }

  /**
   * [Output Only] Health state of the instance per health-check.
   * @param instanceHealth instanceHealth or {@code null} for none
   */
  public ManagedInstance setInstanceHealth(java.util.List<ManagedInstanceInstanceHealth> instanceHealth) {
    this.instanceHealth = instanceHealth;
    return this;
  }

  /**
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceStatus() {
    return instanceStatus;
  }

  /**
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   * @param instanceStatus instanceStatus or {@code null} for none
   */
  public ManagedInstance setInstanceStatus(java.lang.String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

  /**
   * [Output Only] Information about the last attempt to create or delete the instance.
   * @return value or {@code null} for none
   */
  public ManagedInstanceLastAttempt getLastAttempt() {
    return lastAttempt;
  }

  /**
   * [Output Only] Information about the last attempt to create or delete the instance.
   * @param lastAttempt lastAttempt or {@code null} for none
   */
  public ManagedInstance setLastAttempt(ManagedInstanceLastAttempt lastAttempt) {
    this.lastAttempt = lastAttempt;
    return this;
  }

  /**
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * @return value or {@code null} for none
   */
  public PreservedState getPreservedStateFromConfig() {
    return preservedStateFromConfig;
  }

  /**
   * [Output Only] Preserved state applied from per-instance config for this instance.
   * @param preservedStateFromConfig preservedStateFromConfig or {@code null} for none
   */
  public ManagedInstance setPreservedStateFromConfig(PreservedState preservedStateFromConfig) {
    this.preservedStateFromConfig = preservedStateFromConfig;
    return this;
  }

  /**
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * @return value or {@code null} for none
   */
  public PreservedState getPreservedStateFromPolicy() {
    return preservedStateFromPolicy;
  }

  /**
   * [Output Only] Preserved state generated based on stateful policy for this instance.
   * @param preservedStateFromPolicy preservedStateFromPolicy or {@code null} for none
   */
  public ManagedInstance setPreservedStateFromPolicy(PreservedState preservedStateFromPolicy) {
    this.preservedStateFromPolicy = preservedStateFromPolicy;
    return this;
  }

  /**
   * [Output Only] Intended version of this instance.
   * @return value or {@code null} for none
   */
  public ManagedInstanceVersion getVersion() {
    return version;
  }

  /**
   * [Output Only] Intended version of this instance.
   * @param version version or {@code null} for none
   */
  public ManagedInstance setVersion(ManagedInstanceVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public ManagedInstance set(String fieldName, Object value) {
    return (ManagedInstance) super.set(fieldName, value);
  }

  @Override
  public ManagedInstance clone() {
    return (ManagedInstance) super.clone();
  }

}
