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

package com.google.api.services.vmmigration.v1.model;

/**
 * CutoverJob message describes a cutover of a migrating VM. The CutoverJob is the operation of
 * shutting down the VM, creating a snapshot and clonning the VM using the replicated snapshot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CutoverJob extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Details of the target VM in Compute Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeEngineTargetDetails computeEngineTargetDetails;

  /**
   * Output only. The time the cutover job was created (as an API call, not when it was actually
   * created in the target).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Provides details for the errors that led to the Cutover Job's state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Output only. The name of the cutover job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current progress in percentage of the cutover job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progressPercent;

  /**
   * Output only. State of the cutover job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. A message providing possible extra details about the current state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * Output only. The time the state was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String stateTime;

  /**
   * Output only. Details of the target VM in Compute Engine.
   * @return value or {@code null} for none
   */
  public ComputeEngineTargetDetails getComputeEngineTargetDetails() {
    return computeEngineTargetDetails;
  }

  /**
   * Output only. Details of the target VM in Compute Engine.
   * @param computeEngineTargetDetails computeEngineTargetDetails or {@code null} for none
   */
  public CutoverJob setComputeEngineTargetDetails(ComputeEngineTargetDetails computeEngineTargetDetails) {
    this.computeEngineTargetDetails = computeEngineTargetDetails;
    return this;
  }

  /**
   * Output only. The time the cutover job was created (as an API call, not when it was actually
   * created in the target).
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the cutover job was created (as an API call, not when it was actually
   * created in the target).
   * @param createTime createTime or {@code null} for none
   */
  public CutoverJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Provides details for the errors that led to the Cutover Job's state.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. Provides details for the errors that led to the Cutover Job's state.
   * @param error error or {@code null} for none
   */
  public CutoverJob setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The name of the cutover job.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the cutover job.
   * @param name name or {@code null} for none
   */
  public CutoverJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current progress in percentage of the cutover job.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgressPercent() {
    return progressPercent;
  }

  /**
   * Output only. The current progress in percentage of the cutover job.
   * @param progressPercent progressPercent or {@code null} for none
   */
  public CutoverJob setProgressPercent(java.lang.Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Output only. State of the cutover job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the cutover job.
   * @param state state or {@code null} for none
   */
  public CutoverJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. A message providing possible extra details about the current state.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * Output only. A message providing possible extra details about the current state.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public CutoverJob setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * Output only. The time the state was last updated.
   * @return value or {@code null} for none
   */
  public String getStateTime() {
    return stateTime;
  }

  /**
   * Output only. The time the state was last updated.
   * @param stateTime stateTime or {@code null} for none
   */
  public CutoverJob setStateTime(String stateTime) {
    this.stateTime = stateTime;
    return this;
  }

  @Override
  public CutoverJob set(String fieldName, Object value) {
    return (CutoverJob) super.set(fieldName, value);
  }

  @Override
  public CutoverJob clone() {
    return (CutoverJob) super.clone();
  }

}
