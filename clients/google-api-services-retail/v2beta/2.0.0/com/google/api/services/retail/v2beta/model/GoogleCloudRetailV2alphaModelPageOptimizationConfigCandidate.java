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

package com.google.api.services.retail.v2beta.model;

/**
 * A candidate to consider for a given panel. Currently only ServingConfig are valid candidates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate extends com.google.api.client.json.GenericJson {

  /**
   * This has to be a valid ServingConfig identifier. e.g. for a ServingConfig with full name:
   * `projects/locations/global/catalogs/default_catalog/servingConfigs/my_candidate_config` this
   * would be 'my_candidate_config'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingConfigId;

  /**
   * This has to be a valid ServingConfig identifier. e.g. for a ServingConfig with full name:
   * `projects/locations/global/catalogs/default_catalog/servingConfigs/my_candidate_config` this
   * would be 'my_candidate_config'
   * @return value or {@code null} for none
   */
  public java.lang.String getServingConfigId() {
    return servingConfigId;
  }

  /**
   * This has to be a valid ServingConfig identifier. e.g. for a ServingConfig with full name:
   * `projects/locations/global/catalogs/default_catalog/servingConfigs/my_candidate_config` this
   * would be 'my_candidate_config'
   * @param servingConfigId servingConfigId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate setServingConfigId(java.lang.String servingConfigId) {
    this.servingConfigId = servingConfigId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate clone() {
    return (GoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate) super.clone();
  }

}
