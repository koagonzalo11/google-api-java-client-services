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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Metadata related to the progress of the PurgeUserEvents operation. This will be returned by the
 * google.longrunning.Operation.metadata field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI (Beta). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Operation create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The ID of the request / operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationName;

  /**
   * Operation create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Operation create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The ID of the request / operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationName() {
    return operationName;
  }

  /**
   * The ID of the request / operation.
   * @param operationName operationName or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata setOperationName(java.lang.String operationName) {
    this.operationName = operationName;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata clone() {
    return (GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata) super.clone();
  }

}
