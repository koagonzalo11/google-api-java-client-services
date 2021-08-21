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
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any
 * additional Kubernetes metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * Optional. GKE-specific information. Only present if this Membership is a GKE cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GkeCluster gkeCluster;

  /**
   * Output only. Useful Kubernetes-specific metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KubernetesMetadata kubernetesMetadata;

  /**
   * Optional. GKE-specific information. Only present if this Membership is a GKE cluster.
   * @return value or {@code null} for none
   */
  public GkeCluster getGkeCluster() {
    return gkeCluster;
  }

  /**
   * Optional. GKE-specific information. Only present if this Membership is a GKE cluster.
   * @param gkeCluster gkeCluster or {@code null} for none
   */
  public MembershipEndpoint setGkeCluster(GkeCluster gkeCluster) {
    this.gkeCluster = gkeCluster;
    return this;
  }

  /**
   * Output only. Useful Kubernetes-specific metadata.
   * @return value or {@code null} for none
   */
  public KubernetesMetadata getKubernetesMetadata() {
    return kubernetesMetadata;
  }

  /**
   * Output only. Useful Kubernetes-specific metadata.
   * @param kubernetesMetadata kubernetesMetadata or {@code null} for none
   */
  public MembershipEndpoint setKubernetesMetadata(KubernetesMetadata kubernetesMetadata) {
    this.kubernetesMetadata = kubernetesMetadata;
    return this;
  }

  @Override
  public MembershipEndpoint set(String fieldName, Object value) {
    return (MembershipEndpoint) super.set(fieldName, value);
  }

  @Override
  public MembershipEndpoint clone() {
    return (MembershipEndpoint) super.clone();
  }

}
