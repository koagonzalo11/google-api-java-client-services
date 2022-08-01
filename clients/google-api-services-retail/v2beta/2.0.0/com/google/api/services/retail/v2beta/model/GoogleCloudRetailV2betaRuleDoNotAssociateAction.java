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
 * Prevents `query_term` from being associated with specified terms during search. Example: Don't
 * associate "gShoe" and "cheap".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaRuleDoNotAssociateAction extends com.google.api.client.json.GenericJson {

  /**
   * Cannot contain duplicates or the query term. Can specify up to 100 terms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> doNotAssociateTerms;

  /**
   * Terms from the search query. Will not consider do_not_associate_terms for search if in search
   * query. Can specify up to 100 terms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> queryTerms;

  /**
   * Will be [deprecated = true] post migration;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> terms;

  /**
   * Cannot contain duplicates or the query term. Can specify up to 100 terms.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDoNotAssociateTerms() {
    return doNotAssociateTerms;
  }

  /**
   * Cannot contain duplicates or the query term. Can specify up to 100 terms.
   * @param doNotAssociateTerms doNotAssociateTerms or {@code null} for none
   */
  public GoogleCloudRetailV2betaRuleDoNotAssociateAction setDoNotAssociateTerms(java.util.List<java.lang.String> doNotAssociateTerms) {
    this.doNotAssociateTerms = doNotAssociateTerms;
    return this;
  }

  /**
   * Terms from the search query. Will not consider do_not_associate_terms for search if in search
   * query. Can specify up to 100 terms.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQueryTerms() {
    return queryTerms;
  }

  /**
   * Terms from the search query. Will not consider do_not_associate_terms for search if in search
   * query. Can specify up to 100 terms.
   * @param queryTerms queryTerms or {@code null} for none
   */
  public GoogleCloudRetailV2betaRuleDoNotAssociateAction setQueryTerms(java.util.List<java.lang.String> queryTerms) {
    this.queryTerms = queryTerms;
    return this;
  }

  /**
   * Will be [deprecated = true] post migration;
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTerms() {
    return terms;
  }

  /**
   * Will be [deprecated = true] post migration;
   * @param terms terms or {@code null} for none
   */
  public GoogleCloudRetailV2betaRuleDoNotAssociateAction setTerms(java.util.List<java.lang.String> terms) {
    this.terms = terms;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaRuleDoNotAssociateAction set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaRuleDoNotAssociateAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaRuleDoNotAssociateAction clone() {
    return (GoogleCloudRetailV2betaRuleDoNotAssociateAction) super.clone();
  }

}
