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

package com.google.api.services.retail.v2alpha.model;

/**
 * Configures metadata that is used to generate serving time results (e.g. search results or
 * recommendation predictions). The ServingConfig is passed in the search and predict request and
 * together with the Catalog.default_branch, generates results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaServingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Condition boost specifications. If a product matches multiple conditions in the specifications,
   * boost scores from these specifications are all applied and combined in a non-linear way.
   * Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids
   * and SearchRequest.boost_spec are set, the boost conditions from both places are evaluated. If a
   * search request matches multiple boost conditions, the final boost score is equal to the sum of
   * the boost scores from all matched boost conditions. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> boostControlIds;

  /**
   * Required. The human readable serving config display name. Used in Retail UI. This field must be
   * a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-
   * diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity'
   * * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on
   * recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diversityLevel;

  /**
   * Condition do not associate specifications. If multiple do not associate conditions match, all
   * matching do not associate controls in the list will execute. - Order does not matter. - Maximum
   * number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> doNotAssociateControlIds;

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec dynamicFacetSpec;

  /**
   * Whether to add additional category filters on the 'similar-items' model. If not specified, we
   * enable it by default. Allowed values are: * 'no-category-match': No additional filtering of
   * original results from the model and the customer's filters. * 'relaxed-category-match': Only
   * keep results with categories that match at least one item categories in the PredictRequests's
   * context item. * If customer also sends filters in the PredictRequest, then the results will
   * satisfy both conditions (user given and category match). Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enableCategoryFilterLevel;

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the
   * ids of Control resources with only the Facet control set. These controls are assumed to be in
   * the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an
   * INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> facetControlIds;

  /**
   * Condition filter specifications. If a product matches multiple conditions in the
   * specifications, filters from these specifications are all applied and combined via the AND
   * operator. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filterControlIds;

  /**
   * Condition ignore specifications. If multiple ignore conditions match, all matching ignore
   * controls in the list will execute. - Order does not matter. - Maximum number of specifications
   * is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ignoreControlIds;

  /**
   * The id of the model to use at serving time. Currently only RecommendationModels are supported:
   * https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only
   * to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when
   * solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelId;

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/servingConfig`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all
   * matching oneway synonyms controls in the list will execute. Order of controls in the list will
   * not matter. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> onewaySynonymsControlIds;

  /**
   * How much price ranking we want in serving results. Price reranking causes product items with a
   * similar recommendation probability to be ordered by price, with the highest-priced items first.
   * This setting could result in a decrease in click-through and conversion rates. Allowed values
   * are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-
   * reranking' If not specified, we choose default based on model type. Default value: 'no-price-
   * reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priceRerankingLevel;

  /**
   * Condition redirect specifications. Only the first triggered redirect action is applied, even if
   * multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> redirectControlIds;

  /**
   * Condition replacement specifications. - Applied according to the order in the list. - A
   * previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can
   * only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replacementControlIds;

  /**
   * Required. Immutable. Specifies the solution types that a serving config can be associated with.
   * Currently we support setting only one type of solution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> solutionTypes;

  /**
   * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms
   * control in the list will execute. Order of controls in the list will not matter. Maximum number
   * of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> twowaySynonymsControlIds;

  /**
   * Condition boost specifications. If a product matches multiple conditions in the specifications,
   * boost scores from these specifications are all applied and combined in a non-linear way.
   * Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids
   * and SearchRequest.boost_spec are set, the boost conditions from both places are evaluated. If a
   * search request matches multiple boost conditions, the final boost score is equal to the sum of
   * the boost scores from all matched boost conditions. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBoostControlIds() {
    return boostControlIds;
  }

  /**
   * Condition boost specifications. If a product matches multiple conditions in the specifications,
   * boost scores from these specifications are all applied and combined in a non-linear way.
   * Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids
   * and SearchRequest.boost_spec are set, the boost conditions from both places are evaluated. If a
   * search request matches multiple boost conditions, the final boost score is equal to the sum of
   * the boost scores from all matched boost conditions. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @param boostControlIds boostControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setBoostControlIds(java.util.List<java.lang.String> boostControlIds) {
    this.boostControlIds = boostControlIds;
    return this;
  }

  /**
   * Required. The human readable serving config display name. Used in Retail UI. This field must be
   * a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human readable serving config display name. Used in Retail UI. This field must be
   * a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-
   * diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity'
   * * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on
   * recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiversityLevel() {
    return diversityLevel;
  }

  /**
   * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-
   * diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity'
   * * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on
   * recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * @param diversityLevel diversityLevel or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setDiversityLevel(java.lang.String diversityLevel) {
    this.diversityLevel = diversityLevel;
    return this;
  }

  /**
   * Condition do not associate specifications. If multiple do not associate conditions match, all
   * matching do not associate controls in the list will execute. - Order does not matter. - Maximum
   * number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDoNotAssociateControlIds() {
    return doNotAssociateControlIds;
  }

  /**
   * Condition do not associate specifications. If multiple do not associate conditions match, all
   * matching do not associate controls in the list will execute. - Order does not matter. - Maximum
   * number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param doNotAssociateControlIds doNotAssociateControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setDoNotAssociateControlIds(java.util.List<java.lang.String> doNotAssociateControlIds) {
    this.doNotAssociateControlIds = doNotAssociateControlIds;
    return this;
  }

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec getDynamicFacetSpec() {
    return dynamicFacetSpec;
  }

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param dynamicFacetSpec dynamicFacetSpec or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setDynamicFacetSpec(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec dynamicFacetSpec) {
    this.dynamicFacetSpec = dynamicFacetSpec;
    return this;
  }

  /**
   * Whether to add additional category filters on the 'similar-items' model. If not specified, we
   * enable it by default. Allowed values are: * 'no-category-match': No additional filtering of
   * original results from the model and the customer's filters. * 'relaxed-category-match': Only
   * keep results with categories that match at least one item categories in the PredictRequests's
   * context item. * If customer also sends filters in the PredictRequest, then the results will
   * satisfy both conditions (user given and category match). Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnableCategoryFilterLevel() {
    return enableCategoryFilterLevel;
  }

  /**
   * Whether to add additional category filters on the 'similar-items' model. If not specified, we
   * enable it by default. Allowed values are: * 'no-category-match': No additional filtering of
   * original results from the model and the customer's filters. * 'relaxed-category-match': Only
   * keep results with categories that match at least one item categories in the PredictRequests's
   * context item. * If customer also sends filters in the PredictRequest, then the results will
   * satisfy both conditions (user given and category match). Can only be set if solution_types is
   * SOLUTION_TYPE_RECOMMENDATION.
   * @param enableCategoryFilterLevel enableCategoryFilterLevel or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setEnableCategoryFilterLevel(java.lang.String enableCategoryFilterLevel) {
    this.enableCategoryFilterLevel = enableCategoryFilterLevel;
    return this;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the
   * ids of Control resources with only the Facet control set. These controls are assumed to be in
   * the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an
   * INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFacetControlIds() {
    return facetControlIds;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the
   * ids of Control resources with only the Facet control set. These controls are assumed to be in
   * the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an
   * INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param facetControlIds facetControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setFacetControlIds(java.util.List<java.lang.String> facetControlIds) {
    this.facetControlIds = facetControlIds;
    return this;
  }

  /**
   * Condition filter specifications. If a product matches multiple conditions in the
   * specifications, filters from these specifications are all applied and combined via the AND
   * operator. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilterControlIds() {
    return filterControlIds;
  }

  /**
   * Condition filter specifications. If a product matches multiple conditions in the
   * specifications, filters from these specifications are all applied and combined via the AND
   * operator. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @param filterControlIds filterControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setFilterControlIds(java.util.List<java.lang.String> filterControlIds) {
    this.filterControlIds = filterControlIds;
    return this;
  }

  /**
   * Condition ignore specifications. If multiple ignore conditions match, all matching ignore
   * controls in the list will execute. - Order does not matter. - Maximum number of specifications
   * is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIgnoreControlIds() {
    return ignoreControlIds;
  }

  /**
   * Condition ignore specifications. If multiple ignore conditions match, all matching ignore
   * controls in the list will execute. - Order does not matter. - Maximum number of specifications
   * is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param ignoreControlIds ignoreControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setIgnoreControlIds(java.util.List<java.lang.String> ignoreControlIds) {
    this.ignoreControlIds = ignoreControlIds;
    return this;
  }

  /**
   * The id of the model to use at serving time. Currently only RecommendationModels are supported:
   * https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only
   * to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when
   * solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelId() {
    return modelId;
  }

  /**
   * The id of the model to use at serving time. Currently only RecommendationModels are supported:
   * https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only
   * to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when
   * solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * @param modelId modelId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setModelId(java.lang.String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/servingConfig`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/servingConfig`
   * @param name name or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all
   * matching oneway synonyms controls in the list will execute. Order of controls in the list will
   * not matter. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOnewaySynonymsControlIds() {
    return onewaySynonymsControlIds;
  }

  /**
   * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all
   * matching oneway synonyms controls in the list will execute. Order of controls in the list will
   * not matter. Maximum number of specifications is 100. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @param onewaySynonymsControlIds onewaySynonymsControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setOnewaySynonymsControlIds(java.util.List<java.lang.String> onewaySynonymsControlIds) {
    this.onewaySynonymsControlIds = onewaySynonymsControlIds;
    return this;
  }

  /**
   * How much price ranking we want in serving results. Price reranking causes product items with a
   * similar recommendation probability to be ordered by price, with the highest-priced items first.
   * This setting could result in a decrease in click-through and conversion rates. Allowed values
   * are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-
   * reranking' If not specified, we choose default based on model type. Default value: 'no-price-
   * reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriceRerankingLevel() {
    return priceRerankingLevel;
  }

  /**
   * How much price ranking we want in serving results. Price reranking causes product items with a
   * similar recommendation probability to be ordered by price, with the highest-priced items first.
   * This setting could result in a decrease in click-through and conversion rates. Allowed values
   * are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-
   * reranking' If not specified, we choose default based on model type. Default value: 'no-price-
   * reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
   * @param priceRerankingLevel priceRerankingLevel or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setPriceRerankingLevel(java.lang.String priceRerankingLevel) {
    this.priceRerankingLevel = priceRerankingLevel;
    return this;
  }

  /**
   * Condition redirect specifications. Only the first triggered redirect action is applied, even if
   * multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRedirectControlIds() {
    return redirectControlIds;
  }

  /**
   * Condition redirect specifications. Only the first triggered redirect action is applied, even if
   * multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is
   * SOLUTION_TYPE_SEARCH.
   * @param redirectControlIds redirectControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setRedirectControlIds(java.util.List<java.lang.String> redirectControlIds) {
    this.redirectControlIds = redirectControlIds;
    return this;
  }

  /**
   * Condition replacement specifications. - Applied according to the order in the list. - A
   * previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can
   * only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplacementControlIds() {
    return replacementControlIds;
  }

  /**
   * Condition replacement specifications. - Applied according to the order in the list. - A
   * previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can
   * only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param replacementControlIds replacementControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setReplacementControlIds(java.util.List<java.lang.String> replacementControlIds) {
    this.replacementControlIds = replacementControlIds;
    return this;
  }

  /**
   * Required. Immutable. Specifies the solution types that a serving config can be associated with.
   * Currently we support setting only one type of solution.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSolutionTypes() {
    return solutionTypes;
  }

  /**
   * Required. Immutable. Specifies the solution types that a serving config can be associated with.
   * Currently we support setting only one type of solution.
   * @param solutionTypes solutionTypes or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setSolutionTypes(java.util.List<java.lang.String> solutionTypes) {
    this.solutionTypes = solutionTypes;
    return this;
  }

  /**
   * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms
   * control in the list will execute. Order of controls in the list will not matter. Maximum number
   * of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTwowaySynonymsControlIds() {
    return twowaySynonymsControlIds;
  }

  /**
   * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms
   * control in the list will execute. Order of controls in the list will not matter. Maximum number
   * of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
   * @param twowaySynonymsControlIds twowaySynonymsControlIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaServingConfig setTwowaySynonymsControlIds(java.util.List<java.lang.String> twowaySynonymsControlIds) {
    this.twowaySynonymsControlIds = twowaySynonymsControlIds;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaServingConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaServingConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaServingConfig clone() {
    return (GoogleCloudRetailV2alphaServingConfig) super.clone();
  }

}
