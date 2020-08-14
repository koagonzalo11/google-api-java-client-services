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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * The template for an individual field within a tag template.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1TagTemplateField extends com.google.api.client.json.GenericJson {

  /**
   * The display name for this field. Defaults to an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Whether this is a required field. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRequired;

  /**
   * Output only. The resource name of the tag template field in URL format. Example: *
   * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field} Note that
   * this TagTemplateField may not actually be stored in the location in this name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The order of this field with respect to other fields in this tag template. A higher value
   * indicates a more important field. The value can be negative. Multiple fields can have the same
   * order, and field orders within a tag do not have to be sequential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer order;

  /**
   * Required. The type of value this tag field can contain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1beta1FieldType type;

  /**
   * The display name for this field. Defaults to an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name for this field. Defaults to an empty string.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1TagTemplateField setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Whether this is a required field. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRequired() {
    return isRequired;
  }

  /**
   * Whether this is a required field. Defaults to false.
   * @param isRequired isRequired or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1TagTemplateField setIsRequired(java.lang.Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Output only. The resource name of the tag template field in URL format. Example: *
   * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field} Note that
   * this TagTemplateField may not actually be stored in the location in this name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the tag template field in URL format. Example: *
   * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field} Note that
   * this TagTemplateField may not actually be stored in the location in this name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1TagTemplateField setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The order of this field with respect to other fields in this tag template. A higher value
   * indicates a more important field. The value can be negative. Multiple fields can have the same
   * order, and field orders within a tag do not have to be sequential.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOrder() {
    return order;
  }

  /**
   * The order of this field with respect to other fields in this tag template. A higher value
   * indicates a more important field. The value can be negative. Multiple fields can have the same
   * order, and field orders within a tag do not have to be sequential.
   * @param order order or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1TagTemplateField setOrder(java.lang.Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Required. The type of value this tag field can contain.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1FieldType getType() {
    return type;
  }

  /**
   * Required. The type of value this tag field can contain.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1TagTemplateField setType(GoogleCloudDatacatalogV1beta1FieldType type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1TagTemplateField set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1TagTemplateField) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1TagTemplateField clone() {
    return (GoogleCloudDatacatalogV1beta1TagTemplateField) super.clone();
  }

}
