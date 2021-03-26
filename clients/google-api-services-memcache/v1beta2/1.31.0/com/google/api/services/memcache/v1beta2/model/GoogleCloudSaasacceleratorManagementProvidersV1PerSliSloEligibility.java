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
 * PerSliSloEligibility is a mapping from an SLI name to eligibility.
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
public final class GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility extends com.google.api.client.json.GenericJson {

  /**
   * An entry in the eligibilities map specifies an eligibility for a particular SLI for the given
   * instance. The SLI key in the name must be a valid SLI name specified in the Eligibility
   * Exporter binary flags otherwise an error will be emitted by Eligibility Exporter and the
   * oncaller will be alerted. If an SLI has been defined in the binary flags but the eligibilities
   * map does not contain it, the corresponding SLI time series will not be emitted by the
   * Eligibility Exporter. This ensures a smooth rollout and compatibility between the data produced
   * by different versions of the Eligibility Exporters. If eligibilities map contains a key for an
   * SLI which has not been declared in the binary flags, there will be an error message emitted in
   * the Eligibility Exporter log and the metric for the SLI in question will not be emitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility> eligibilities;

  /**
   * An entry in the eligibilities map specifies an eligibility for a particular SLI for the given
   * instance. The SLI key in the name must be a valid SLI name specified in the Eligibility
   * Exporter binary flags otherwise an error will be emitted by Eligibility Exporter and the
   * oncaller will be alerted. If an SLI has been defined in the binary flags but the eligibilities
   * map does not contain it, the corresponding SLI time series will not be emitted by the
   * Eligibility Exporter. This ensures a smooth rollout and compatibility between the data produced
   * by different versions of the Eligibility Exporters. If eligibilities map contains a key for an
   * SLI which has not been declared in the binary flags, there will be an error message emitted in
   * the Eligibility Exporter log and the metric for the SLI in question will not be emitted.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility> getEligibilities() {
    return eligibilities;
  }

  /**
   * An entry in the eligibilities map specifies an eligibility for a particular SLI for the given
   * instance. The SLI key in the name must be a valid SLI name specified in the Eligibility
   * Exporter binary flags otherwise an error will be emitted by Eligibility Exporter and the
   * oncaller will be alerted. If an SLI has been defined in the binary flags but the eligibilities
   * map does not contain it, the corresponding SLI time series will not be emitted by the
   * Eligibility Exporter. This ensures a smooth rollout and compatibility between the data produced
   * by different versions of the Eligibility Exporters. If eligibilities map contains a key for an
   * SLI which has not been declared in the binary flags, there will be an error message emitted in
   * the Eligibility Exporter log and the metric for the SLI in question will not be emitted.
   * @param eligibilities eligibilities or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility setEligibilities(java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility> eligibilities) {
    this.eligibilities = eligibilities;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility) super.clone();
  }

}
