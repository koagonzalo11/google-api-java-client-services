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
 * State of Policy Controller installation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementGatekeeperDeploymentState extends com.google.api.client.json.GenericJson {

  /**
   * Status of gatekeeper-audit deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatekeeperAudit;

  /**
   * Status of gatekeeper-controller-manager pod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatekeeperControllerManagerState;

  /**
   * Status of gatekeeper-audit deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatekeeperAudit() {
    return gatekeeperAudit;
  }

  /**
   * Status of gatekeeper-audit deployment.
   * @param gatekeeperAudit gatekeeperAudit or {@code null} for none
   */
  public ConfigManagementGatekeeperDeploymentState setGatekeeperAudit(java.lang.String gatekeeperAudit) {
    this.gatekeeperAudit = gatekeeperAudit;
    return this;
  }

  /**
   * Status of gatekeeper-controller-manager pod.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatekeeperControllerManagerState() {
    return gatekeeperControllerManagerState;
  }

  /**
   * Status of gatekeeper-controller-manager pod.
   * @param gatekeeperControllerManagerState gatekeeperControllerManagerState or {@code null} for none
   */
  public ConfigManagementGatekeeperDeploymentState setGatekeeperControllerManagerState(java.lang.String gatekeeperControllerManagerState) {
    this.gatekeeperControllerManagerState = gatekeeperControllerManagerState;
    return this;
  }

  @Override
  public ConfigManagementGatekeeperDeploymentState set(String fieldName, Object value) {
    return (ConfigManagementGatekeeperDeploymentState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementGatekeeperDeploymentState clone() {
    return (ConfigManagementGatekeeperDeploymentState) super.clone();
  }

}
