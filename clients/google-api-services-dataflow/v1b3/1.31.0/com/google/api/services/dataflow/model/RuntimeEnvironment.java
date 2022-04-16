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

package com.google.api.services.dataflow.model;

/**
 * The environment values to set at runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RuntimeEnvironment extends com.google.api.client.json.GenericJson {

  /**
   * Additional experiment flags for the job, specified with the `--experiments` option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalExperiments;

  /**
   * Additional user labels to be specified for the job. Keys and values should follow the
   * restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs
   * /labeling-resources#restrictions) page. An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> additionalUserLabels;

  /**
   * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bypassTempDirValidation;

  /**
   * Whether to enable Streaming Engine for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStreamingEngine;

  /**
   * Configuration for VM IPs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipConfiguration;

  /**
   * Name for the Cloud KMS key for the job. Key format is:
   * projects//locations//keyRings//cryptoKeys/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * The machine type to use for the job. Defaults to the value from the template if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The maximum number of Google Compute Engine instances to be made available to your pipeline
   * during execution, from 1 to 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxWorkers;

  /**
   * Network to which VMs will be assigned. If empty or unspecified, the service will use the
   * network "default".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The initial number of Google Compute Engine instances for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numWorkers;

  /**
   * The email address of the service account to run the job as.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either
   * a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/c
   * ompute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or
   * "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network,
   * you must use the complete URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning
   * with `gs://`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tempLocation;

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerRegion;

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone`
   * takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerZone;

  /**
   * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones
   * /regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone
   * will take precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Additional experiment flags for the job, specified with the `--experiments` option.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalExperiments() {
    return additionalExperiments;
  }

  /**
   * Additional experiment flags for the job, specified with the `--experiments` option.
   * @param additionalExperiments additionalExperiments or {@code null} for none
   */
  public RuntimeEnvironment setAdditionalExperiments(java.util.List<java.lang.String> additionalExperiments) {
    this.additionalExperiments = additionalExperiments;
    return this;
  }

  /**
   * Additional user labels to be specified for the job. Keys and values should follow the
   * restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs
   * /labeling-resources#restrictions) page. An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAdditionalUserLabels() {
    return additionalUserLabels;
  }

  /**
   * Additional user labels to be specified for the job. Keys and values should follow the
   * restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs
   * /labeling-resources#restrictions) page. An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * @param additionalUserLabels additionalUserLabels or {@code null} for none
   */
  public RuntimeEnvironment setAdditionalUserLabels(java.util.Map<String, java.lang.String> additionalUserLabels) {
    this.additionalUserLabels = additionalUserLabels;
    return this;
  }

  /**
   * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBypassTempDirValidation() {
    return bypassTempDirValidation;
  }

  /**
   * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
   * @param bypassTempDirValidation bypassTempDirValidation or {@code null} for none
   */
  public RuntimeEnvironment setBypassTempDirValidation(java.lang.Boolean bypassTempDirValidation) {
    this.bypassTempDirValidation = bypassTempDirValidation;
    return this;
  }

  /**
   * Whether to enable Streaming Engine for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStreamingEngine() {
    return enableStreamingEngine;
  }

  /**
   * Whether to enable Streaming Engine for the job.
   * @param enableStreamingEngine enableStreamingEngine or {@code null} for none
   */
  public RuntimeEnvironment setEnableStreamingEngine(java.lang.Boolean enableStreamingEngine) {
    this.enableStreamingEngine = enableStreamingEngine;
    return this;
  }

  /**
   * Configuration for VM IPs.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpConfiguration() {
    return ipConfiguration;
  }

  /**
   * Configuration for VM IPs.
   * @param ipConfiguration ipConfiguration or {@code null} for none
   */
  public RuntimeEnvironment setIpConfiguration(java.lang.String ipConfiguration) {
    this.ipConfiguration = ipConfiguration;
    return this;
  }

  /**
   * Name for the Cloud KMS key for the job. Key format is:
   * projects//locations//keyRings//cryptoKeys/
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Name for the Cloud KMS key for the job. Key format is:
   * projects//locations//keyRings//cryptoKeys/
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public RuntimeEnvironment setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * The machine type to use for the job. Defaults to the value from the template if not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * The machine type to use for the job. Defaults to the value from the template if not specified.
   * @param machineType machineType or {@code null} for none
   */
  public RuntimeEnvironment setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The maximum number of Google Compute Engine instances to be made available to your pipeline
   * during execution, from 1 to 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxWorkers() {
    return maxWorkers;
  }

  /**
   * The maximum number of Google Compute Engine instances to be made available to your pipeline
   * during execution, from 1 to 1000.
   * @param maxWorkers maxWorkers or {@code null} for none
   */
  public RuntimeEnvironment setMaxWorkers(java.lang.Integer maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  /**
   * Network to which VMs will be assigned. If empty or unspecified, the service will use the
   * network "default".
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Network to which VMs will be assigned. If empty or unspecified, the service will use the
   * network "default".
   * @param network network or {@code null} for none
   */
  public RuntimeEnvironment setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The initial number of Google Compute Engine instances for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumWorkers() {
    return numWorkers;
  }

  /**
   * The initial number of Google Compute Engine instances for the job.
   * @param numWorkers numWorkers or {@code null} for none
   */
  public RuntimeEnvironment setNumWorkers(java.lang.Integer numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  /**
   * The email address of the service account to run the job as.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * The email address of the service account to run the job as.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public RuntimeEnvironment setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either
   * a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/c
   * ompute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or
   * "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network,
   * you must use the complete URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either
   * a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/c
   * ompute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or
   * "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network,
   * you must use the complete URL.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public RuntimeEnvironment setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning
   * with `gs://`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTempLocation() {
    return tempLocation;
  }

  /**
   * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning
   * with `gs://`.
   * @param tempLocation tempLocation or {@code null} for none
   */
  public RuntimeEnvironment setTempLocation(java.lang.String tempLocation) {
    this.tempLocation = tempLocation;
    return this;
  }

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerRegion() {
    return workerRegion;
  }

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * @param workerRegion workerRegion or {@code null} for none
   */
  public RuntimeEnvironment setWorkerRegion(java.lang.String workerRegion) {
    this.workerRegion = workerRegion;
    return this;
  }

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone`
   * takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerZone() {
    return workerZone;
  }

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone`
   * takes precedence.
   * @param workerZone workerZone or {@code null} for none
   */
  public RuntimeEnvironment setWorkerZone(java.lang.String workerZone) {
    this.workerZone = workerZone;
    return this;
  }

  /**
   * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones
   * /regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone
   * will take precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones
   * /regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone
   * will take precedence.
   * @param zone zone or {@code null} for none
   */
  public RuntimeEnvironment setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public RuntimeEnvironment set(String fieldName, Object value) {
    return (RuntimeEnvironment) super.set(fieldName, value);
  }

  @Override
  public RuntimeEnvironment clone() {
    return (RuntimeEnvironment) super.clone();
  }

}
