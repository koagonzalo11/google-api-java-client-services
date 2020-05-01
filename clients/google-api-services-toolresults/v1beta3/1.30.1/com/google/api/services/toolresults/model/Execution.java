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

package com.google.api.services.toolresults.model;

/**
 * An Execution represents a collection of Steps. For instance, it could represent:    - a mobile
 * test executed across a range of device configurations    - a jenkins job with a build step
 * followed by a test step
 *
 * The maximum size of an execution message is 1 MiB.
 *
 * An Execution can be updated until its state is set to COMPLETE at which point it becomes
 * immutable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Execution extends com.google.api.client.json.GenericJson {

  /**
   * The time when the Execution status transitioned to COMPLETE.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp completionTime;

  /**
   * The time when the Execution was created.
   *
   * This value will be set automatically when CreateExecution is called.
   *
   * - In response: always set - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp creationTime;

  /**
   * The dimensions along which different steps in this execution may vary. This must remain fixed
   * over the life of the execution.
   *
   * Returns INVALID_ARGUMENT if this field is set in an update request.
   *
   * Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition.
   *
   * Returns INVALID_ARGUMENT if the size of the list is over 100.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MatrixDimensionDefinition> dimensionDefinitions;

  /**
   * A unique identifier within a History for this Execution.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response always set - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionId;

  /**
   * Classify the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Outcome outcome;

  /**
   * Lightweight information about execution request.
   *
   * - In response: present if set by create - In create: optional - In update: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Specification specification;

  /**
   * The initial state is IN_PROGRESS.
   *
   * The only legal state transitions is from IN_PROGRESS to COMPLETE.
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state
   * is set to COMPLETE multiple times.
   *
   * If the state is set to COMPLETE, all the in-progress steps within the execution will be set as
   * COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE.
   *
   * - In response always set - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * TestExecution Matrix ID that the TestExecutionService uses.
   *
   * - In response: present if set by create - In create: optional - In update: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testExecutionMatrixId;

  /**
   * The time when the Execution status transitioned to COMPLETE.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * @return value or {@code null} for none
   */
  public Timestamp getCompletionTime() {
    return completionTime;
  }

  /**
   * The time when the Execution status transitioned to COMPLETE.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * @param completionTime completionTime or {@code null} for none
   */
  public Execution setCompletionTime(Timestamp completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * The time when the Execution was created.
   *
   * This value will be set automatically when CreateExecution is called.
   *
   * - In response: always set - In create/update request: never set
   * @return value or {@code null} for none
   */
  public Timestamp getCreationTime() {
    return creationTime;
  }

  /**
   * The time when the Execution was created.
   *
   * This value will be set automatically when CreateExecution is called.
   *
   * - In response: always set - In create/update request: never set
   * @param creationTime creationTime or {@code null} for none
   */
  public Execution setCreationTime(Timestamp creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The dimensions along which different steps in this execution may vary. This must remain fixed
   * over the life of the execution.
   *
   * Returns INVALID_ARGUMENT if this field is set in an update request.
   *
   * Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition.
   *
   * Returns INVALID_ARGUMENT if the size of the list is over 100.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * @return value or {@code null} for none
   */
  public java.util.List<MatrixDimensionDefinition> getDimensionDefinitions() {
    return dimensionDefinitions;
  }

  /**
   * The dimensions along which different steps in this execution may vary. This must remain fixed
   * over the life of the execution.
   *
   * Returns INVALID_ARGUMENT if this field is set in an update request.
   *
   * Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition.
   *
   * Returns INVALID_ARGUMENT if the size of the list is over 100.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * @param dimensionDefinitions dimensionDefinitions or {@code null} for none
   */
  public Execution setDimensionDefinitions(java.util.List<MatrixDimensionDefinition> dimensionDefinitions) {
    this.dimensionDefinitions = dimensionDefinitions;
    return this;
  }

  /**
   * A unique identifier within a History for this Execution.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response always set - In create/update request: never set
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionId() {
    return executionId;
  }

  /**
   * A unique identifier within a History for this Execution.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response always set - In create/update request: never set
   * @param executionId executionId or {@code null} for none
   */
  public Execution setExecutionId(java.lang.String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Classify the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @return value or {@code null} for none
   */
  public Outcome getOutcome() {
    return outcome;
  }

  /**
   * Classify the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @param outcome outcome or {@code null} for none
   */
  public Execution setOutcome(Outcome outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Lightweight information about execution request.
   *
   * - In response: present if set by create - In create: optional - In update: optional
   * @return value or {@code null} for none
   */
  public Specification getSpecification() {
    return specification;
  }

  /**
   * Lightweight information about execution request.
   *
   * - In response: present if set by create - In create: optional - In update: optional
   * @param specification specification or {@code null} for none
   */
  public Execution setSpecification(Specification specification) {
    this.specification = specification;
    return this;
  }

  /**
   * The initial state is IN_PROGRESS.
   *
   * The only legal state transitions is from IN_PROGRESS to COMPLETE.
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state
   * is set to COMPLETE multiple times.
   *
   * If the state is set to COMPLETE, all the in-progress steps within the execution will be set as
   * COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE.
   *
   * - In response always set - In create/update request: optional
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The initial state is IN_PROGRESS.
   *
   * The only legal state transitions is from IN_PROGRESS to COMPLETE.
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state
   * is set to COMPLETE multiple times.
   *
   * If the state is set to COMPLETE, all the in-progress steps within the execution will be set as
   * COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE.
   *
   * - In response always set - In create/update request: optional
   * @param state state or {@code null} for none
   */
  public Execution setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * TestExecution Matrix ID that the TestExecutionService uses.
   *
   * - In response: present if set by create - In create: optional - In update: never set
   * @return value or {@code null} for none
   */
  public java.lang.String getTestExecutionMatrixId() {
    return testExecutionMatrixId;
  }

  /**
   * TestExecution Matrix ID that the TestExecutionService uses.
   *
   * - In response: present if set by create - In create: optional - In update: never set
   * @param testExecutionMatrixId testExecutionMatrixId or {@code null} for none
   */
  public Execution setTestExecutionMatrixId(java.lang.String testExecutionMatrixId) {
    this.testExecutionMatrixId = testExecutionMatrixId;
    return this;
  }

  @Override
  public Execution set(String fieldName, Object value) {
    return (Execution) super.set(fieldName, value);
  }

  @Override
  public Execution clone() {
    return (Execution) super.clone();
  }

}
