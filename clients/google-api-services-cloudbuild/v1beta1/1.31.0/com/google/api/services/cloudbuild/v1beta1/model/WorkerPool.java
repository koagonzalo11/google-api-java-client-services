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

package com.google.api.services.cloudbuild.v1beta1.model;

/**
 * Configuration for a `WorkerPool` to run the builds. Workers provide a build environment where
 * Cloud Build runs your builds. Cloud Build owns and maintains a pool of workers for general use.
 * By default, when you submit a build, Cloud Build uses one of the workers from this pool. Builds
 * that run in the default worker pool have access to the public internet. If your build needs
 * access to resources on a private network, create and use a `WorkerPool` to run your builds.
 * Custom `WorkerPool`s give your builds access to any single VPC network that you administer,
 * including any on-prem resources connected to that VPC network. For an overview of custom worker
 * pools, see [Custom workers overview](https://cloud.google.com/cloud-build/docs/custom-workers
 * /custom-workers-overview).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerPool extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time at which the request to create the `WorkerPool` was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Time at which the request to delete the `WorkerPool` was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Output only. The resource name of the `WorkerPool`, with format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of
   * `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of
   * `{location}` is determined by the endpoint accessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Network configuration for the `WorkerPool`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkConfig networkConfig;

  /**
   * Output only. `WorkerPool` state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Time at which the request to update the `WorkerPool` was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Worker configuration for the `WorkerPool`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkerConfig workerConfig;

  /**
   * Output only. Time at which the request to create the `WorkerPool` was received.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time at which the request to create the `WorkerPool` was received.
   * @param createTime createTime or {@code null} for none
   */
  public WorkerPool setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Time at which the request to delete the `WorkerPool` was received.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. Time at which the request to delete the `WorkerPool` was received.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public WorkerPool setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Output only. The resource name of the `WorkerPool`, with format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of
   * `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of
   * `{location}` is determined by the endpoint accessed.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the `WorkerPool`, with format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of
   * `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of
   * `{location}` is determined by the endpoint accessed.
   * @param name name or {@code null} for none
   */
  public WorkerPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Network configuration for the `WorkerPool`.
   * @return value or {@code null} for none
   */
  public NetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  /**
   * Network configuration for the `WorkerPool`.
   * @param networkConfig networkConfig or {@code null} for none
   */
  public WorkerPool setNetworkConfig(NetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
    return this;
  }

  /**
   * Output only. `WorkerPool` state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. `WorkerPool` state.
   * @param state state or {@code null} for none
   */
  public WorkerPool setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Time at which the request to update the `WorkerPool` was received.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time at which the request to update the `WorkerPool` was received.
   * @param updateTime updateTime or {@code null} for none
   */
  public WorkerPool setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Worker configuration for the `WorkerPool`.
   * @return value or {@code null} for none
   */
  public WorkerConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Worker configuration for the `WorkerPool`.
   * @param workerConfig workerConfig or {@code null} for none
   */
  public WorkerPool setWorkerConfig(WorkerConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  @Override
  public WorkerPool set(String fieldName, Object value) {
    return (WorkerPool) super.set(fieldName, value);
  }

  @Override
  public WorkerPool clone() {
    return (WorkerPool) super.clone();
  }

}
