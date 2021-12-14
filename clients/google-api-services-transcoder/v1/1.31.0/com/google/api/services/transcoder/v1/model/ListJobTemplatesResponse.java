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

package com.google.api.services.transcoder.v1.model;

/**
 * Response message for `TranscoderService.ListJobTemplates`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListJobTemplatesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of job templates in the specified region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JobTemplate> jobTemplates;

  static {
    // hack to force ProGuard to consider JobTemplate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(JobTemplate.class);
  }

  /**
   * The pagination token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of regions that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * List of job templates in the specified region.
   * @return value or {@code null} for none
   */
  public java.util.List<JobTemplate> getJobTemplates() {
    return jobTemplates;
  }

  /**
   * List of job templates in the specified region.
   * @param jobTemplates jobTemplates or {@code null} for none
   */
  public ListJobTemplatesResponse setJobTemplates(java.util.List<JobTemplate> jobTemplates) {
    this.jobTemplates = jobTemplates;
    return this;
  }

  /**
   * The pagination token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListJobTemplatesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of regions that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * List of regions that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListJobTemplatesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListJobTemplatesResponse set(String fieldName, Object value) {
    return (ListJobTemplatesResponse) super.set(fieldName, value);
  }

  @Override
  public ListJobTemplatesResponse clone() {
    return (ListJobTemplatesResponse) super.clone();
  }

}
