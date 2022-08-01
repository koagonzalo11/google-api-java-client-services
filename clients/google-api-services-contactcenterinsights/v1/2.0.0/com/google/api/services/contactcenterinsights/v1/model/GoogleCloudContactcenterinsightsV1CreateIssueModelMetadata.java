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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Metadata for creating an issue model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The original request for creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1CreateIssueModelRequest request;

  /**
   * Output only. The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The original request for creation.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CreateIssueModelRequest getRequest() {
    return request;
  }

  /**
   * The original request for creation.
   * @param request request or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata setRequest(GoogleCloudContactcenterinsightsV1CreateIssueModelRequest request) {
    this.request = request;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata clone() {
    return (GoogleCloudContactcenterinsightsV1CreateIssueModelMetadata) super.clone();
  }

}
