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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * Explains a dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DimensionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For example, `eventName`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiName;

  /**
   * The display name of the category that this dimension belongs to. Similar dimensions and metrics
   * are categorized together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * True if the dimension is a custom dimension for this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customDefinition;

  /**
   * Still usable but deprecated names for this dimension. If populated, this dimension is available
   * by either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the dimension will be available only by `apiName`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deprecatedApiNames;

  /**
   * Description of how this dimension is used and calculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * This dimension's name within the Google Analytics user interface. For example, `Event name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uiName;

  /**
   * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For example, `eventName`.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiName() {
    return apiName;
  }

  /**
   * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For example, `eventName`.
   * @param apiName apiName or {@code null} for none
   */
  public DimensionMetadata setApiName(java.lang.String apiName) {
    this.apiName = apiName;
    return this;
  }

  /**
   * The display name of the category that this dimension belongs to. Similar dimensions and metrics
   * are categorized together.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The display name of the category that this dimension belongs to. Similar dimensions and metrics
   * are categorized together.
   * @param category category or {@code null} for none
   */
  public DimensionMetadata setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * True if the dimension is a custom dimension for this property.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomDefinition() {
    return customDefinition;
  }

  /**
   * True if the dimension is a custom dimension for this property.
   * @param customDefinition customDefinition or {@code null} for none
   */
  public DimensionMetadata setCustomDefinition(java.lang.Boolean customDefinition) {
    this.customDefinition = customDefinition;
    return this;
  }

  /**
   * Still usable but deprecated names for this dimension. If populated, this dimension is available
   * by either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the dimension will be available only by `apiName`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeprecatedApiNames() {
    return deprecatedApiNames;
  }

  /**
   * Still usable but deprecated names for this dimension. If populated, this dimension is available
   * by either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the dimension will be available only by `apiName`.
   * @param deprecatedApiNames deprecatedApiNames or {@code null} for none
   */
  public DimensionMetadata setDeprecatedApiNames(java.util.List<java.lang.String> deprecatedApiNames) {
    this.deprecatedApiNames = deprecatedApiNames;
    return this;
  }

  /**
   * Description of how this dimension is used and calculated.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of how this dimension is used and calculated.
   * @param description description or {@code null} for none
   */
  public DimensionMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * This dimension's name within the Google Analytics user interface. For example, `Event name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUiName() {
    return uiName;
  }

  /**
   * This dimension's name within the Google Analytics user interface. For example, `Event name`.
   * @param uiName uiName or {@code null} for none
   */
  public DimensionMetadata setUiName(java.lang.String uiName) {
    this.uiName = uiName;
    return this;
  }

  @Override
  public DimensionMetadata set(String fieldName, Object value) {
    return (DimensionMetadata) super.set(fieldName, value);
  }

  @Override
  public DimensionMetadata clone() {
    return (DimensionMetadata) super.clone();
  }

}
