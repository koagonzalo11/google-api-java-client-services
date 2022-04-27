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

package com.google.api.services.healthcare.v1.model;

/**
 * Creates a new FHIR store with sensitive information de-identified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeidentifyFhirStoreRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeidentifyConfig config;

  /**
   * The name of the FHIR store to create and write the redacted data to. For example, `projects/{pr
   * oject_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update
   * permission to write to the destination FHIR store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationStore;

  /**
   * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from,
   * overriding the default config. Must be of the form `gs://{bucket_id}/path/to/object`. The Cloud
   * Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's
   * Cloud Healthcare Service Agent service account. Only one of `config` and `gcs_config_uri` can
   * be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsConfigUri;

  /**
   * A filter specifying the resources to include in the output. If not specified, all resources are
   * included in the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FhirFilter resourceFilter;

  /**
   * Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified.
   * @return value or {@code null} for none
   */
  public DeidentifyConfig getConfig() {
    return config;
  }

  /**
   * Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified.
   * @param config config or {@code null} for none
   */
  public DeidentifyFhirStoreRequest setConfig(DeidentifyConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The name of the FHIR store to create and write the redacted data to. For example, `projects/{pr
   * oject_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update
   * permission to write to the destination FHIR store.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationStore() {
    return destinationStore;
  }

  /**
   * The name of the FHIR store to create and write the redacted data to. For example, `projects/{pr
   * oject_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. * The
   * destination dataset must exist. * The source dataset and destination dataset must both reside
   * in the same location. De-identifying data across multiple locations is not supported. * The
   * destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update
   * permission to write to the destination FHIR store.
   * @param destinationStore destinationStore or {@code null} for none
   */
  public DeidentifyFhirStoreRequest setDestinationStore(java.lang.String destinationStore) {
    this.destinationStore = destinationStore;
    return this;
  }

  /**
   * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from,
   * overriding the default config. Must be of the form `gs://{bucket_id}/path/to/object`. The Cloud
   * Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's
   * Cloud Healthcare Service Agent service account. Only one of `config` and `gcs_config_uri` can
   * be specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsConfigUri() {
    return gcsConfigUri;
  }

  /**
   * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from,
   * overriding the default config. Must be of the form `gs://{bucket_id}/path/to/object`. The Cloud
   * Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's
   * Cloud Healthcare Service Agent service account. Only one of `config` and `gcs_config_uri` can
   * be specified.
   * @param gcsConfigUri gcsConfigUri or {@code null} for none
   */
  public DeidentifyFhirStoreRequest setGcsConfigUri(java.lang.String gcsConfigUri) {
    this.gcsConfigUri = gcsConfigUri;
    return this;
  }

  /**
   * A filter specifying the resources to include in the output. If not specified, all resources are
   * included in the output.
   * @return value or {@code null} for none
   */
  public FhirFilter getResourceFilter() {
    return resourceFilter;
  }

  /**
   * A filter specifying the resources to include in the output. If not specified, all resources are
   * included in the output.
   * @param resourceFilter resourceFilter or {@code null} for none
   */
  public DeidentifyFhirStoreRequest setResourceFilter(FhirFilter resourceFilter) {
    this.resourceFilter = resourceFilter;
    return this;
  }

  @Override
  public DeidentifyFhirStoreRequest set(String fieldName, Object value) {
    return (DeidentifyFhirStoreRequest) super.set(fieldName, value);
  }

  @Override
  public DeidentifyFhirStoreRequest clone() {
    return (DeidentifyFhirStoreRequest) super.clone();
  }

}
