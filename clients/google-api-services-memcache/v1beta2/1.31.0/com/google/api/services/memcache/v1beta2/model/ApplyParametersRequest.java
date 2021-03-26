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

package com.google.api.services.memcache.v1beta2.model;

/**
 * Request for ApplyParameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplyParametersRequest extends com.google.api.client.json.GenericJson {

  /**
   * Whether to apply instance-level parameter group to all nodes. If set to true, users are
   * restricted from specifying individual nodes, and `ApplyParameters` updates all nodes within the
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean applyAll;

  /**
   * Nodes to which the instance-level parameter group is applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nodeIds;

  /**
   * Whether to apply instance-level parameter group to all nodes. If set to true, users are
   * restricted from specifying individual nodes, and `ApplyParameters` updates all nodes within the
   * instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApplyAll() {
    return applyAll;
  }

  /**
   * Whether to apply instance-level parameter group to all nodes. If set to true, users are
   * restricted from specifying individual nodes, and `ApplyParameters` updates all nodes within the
   * instance.
   * @param applyAll applyAll or {@code null} for none
   */
  public ApplyParametersRequest setApplyAll(java.lang.Boolean applyAll) {
    this.applyAll = applyAll;
    return this;
  }

  /**
   * Nodes to which the instance-level parameter group is applied.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNodeIds() {
    return nodeIds;
  }

  /**
   * Nodes to which the instance-level parameter group is applied.
   * @param nodeIds nodeIds or {@code null} for none
   */
  public ApplyParametersRequest setNodeIds(java.util.List<java.lang.String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  @Override
  public ApplyParametersRequest set(String fieldName, Object value) {
    return (ApplyParametersRequest) super.set(fieldName, value);
  }

  @Override
  public ApplyParametersRequest clone() {
    return (ApplyParametersRequest) super.clone();
  }

}
