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

package com.google.api.services.gkehub.v1.model;

/**
 * The state of ConfigSync's deployment on a cluster
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementConfigSyncDeploymentState extends com.google.api.client.json.GenericJson {

  /**
   * Deployment state of the git-sync pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gitSync;

  /**
   * Deployment state of the importer pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importer;

  /**
   * Deployment state of the monitor pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String monitor;

  /**
   * Deployment state of reconciler-manager pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reconcilerManager;

  /**
   * Deployment state of root-reconciler
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootReconciler;

  /**
   * Deployment state of the syncer pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncer;

  /**
   * Deployment state of the git-sync pod
   * @return value or {@code null} for none
   */
  public java.lang.String getGitSync() {
    return gitSync;
  }

  /**
   * Deployment state of the git-sync pod
   * @param gitSync gitSync or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setGitSync(java.lang.String gitSync) {
    this.gitSync = gitSync;
    return this;
  }

  /**
   * Deployment state of the importer pod
   * @return value or {@code null} for none
   */
  public java.lang.String getImporter() {
    return importer;
  }

  /**
   * Deployment state of the importer pod
   * @param importer importer or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setImporter(java.lang.String importer) {
    this.importer = importer;
    return this;
  }

  /**
   * Deployment state of the monitor pod
   * @return value or {@code null} for none
   */
  public java.lang.String getMonitor() {
    return monitor;
  }

  /**
   * Deployment state of the monitor pod
   * @param monitor monitor or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setMonitor(java.lang.String monitor) {
    this.monitor = monitor;
    return this;
  }

  /**
   * Deployment state of reconciler-manager pod
   * @return value or {@code null} for none
   */
  public java.lang.String getReconcilerManager() {
    return reconcilerManager;
  }

  /**
   * Deployment state of reconciler-manager pod
   * @param reconcilerManager reconcilerManager or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setReconcilerManager(java.lang.String reconcilerManager) {
    this.reconcilerManager = reconcilerManager;
    return this;
  }

  /**
   * Deployment state of root-reconciler
   * @return value or {@code null} for none
   */
  public java.lang.String getRootReconciler() {
    return rootReconciler;
  }

  /**
   * Deployment state of root-reconciler
   * @param rootReconciler rootReconciler or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setRootReconciler(java.lang.String rootReconciler) {
    this.rootReconciler = rootReconciler;
    return this;
  }

  /**
   * Deployment state of the syncer pod
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncer() {
    return syncer;
  }

  /**
   * Deployment state of the syncer pod
   * @param syncer syncer or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState setSyncer(java.lang.String syncer) {
    this.syncer = syncer;
    return this;
  }

  @Override
  public ConfigManagementConfigSyncDeploymentState set(String fieldName, Object value) {
    return (ConfigManagementConfigSyncDeploymentState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementConfigSyncDeploymentState clone() {
    return (ConfigManagementConfigSyncDeploymentState) super.clone();
  }

}
