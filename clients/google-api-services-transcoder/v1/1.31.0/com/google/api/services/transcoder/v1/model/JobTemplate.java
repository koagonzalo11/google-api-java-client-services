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
 * Transcoding job template resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobTemplate extends com.google.api.client.json.GenericJson {

  /**
   * The configuration for this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobConfig config;

  /**
   * The resource name of the job template. Format:
   * `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The configuration for this template.
   * @return value or {@code null} for none
   */
  public JobConfig getConfig() {
    return config;
  }

  /**
   * The configuration for this template.
   * @param config config or {@code null} for none
   */
  public JobTemplate setConfig(JobConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The resource name of the job template. Format:
   * `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the job template. Format:
   * `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
   * @param name name or {@code null} for none
   */
  public JobTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public JobTemplate set(String fieldName, Object value) {
    return (JobTemplate) super.set(fieldName, value);
  }

  @Override
  public JobTemplate clone() {
    return (JobTemplate) super.clone();
  }

}
