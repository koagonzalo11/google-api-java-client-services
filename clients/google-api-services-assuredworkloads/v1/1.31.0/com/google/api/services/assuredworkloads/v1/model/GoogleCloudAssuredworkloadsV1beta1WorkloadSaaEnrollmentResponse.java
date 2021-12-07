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

package com.google.api.services.assuredworkloads.v1.model;

/**
 * Signed Access Approvals (SAA) enrollment response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Indicates SAA enrollment setup error if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> setupErrors;

  /**
   * Indicates SAA enrollment status of a given workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setupStatus;

  /**
   * Indicates SAA enrollment setup error if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSetupErrors() {
    return setupErrors;
  }

  /**
   * Indicates SAA enrollment setup error if any.
   * @param setupErrors setupErrors or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse setSetupErrors(java.util.List<java.lang.String> setupErrors) {
    this.setupErrors = setupErrors;
    return this;
  }

  /**
   * Indicates SAA enrollment status of a given workload.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetupStatus() {
    return setupStatus;
  }

  /**
   * Indicates SAA enrollment status of a given workload.
   * @param setupStatus setupStatus or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse setSetupStatus(java.lang.String setupStatus) {
    this.setupStatus = setupStatus;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse clone() {
    return (GoogleCloudAssuredworkloadsV1beta1WorkloadSaaEnrollmentResponse) super.clone();
  }

}
