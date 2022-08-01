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

package com.google.api.services.retail.v2.model;

/**
 * Response for CatalogService.ListCatalogs method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2ListCatalogsResponse extends com.google.api.client.json.GenericJson {

  /**
   * All the customer's Catalogs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2Catalog> catalogs;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2Catalog used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2Catalog.class);
  }

  /**
   * A token that can be sent as ListCatalogsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * All the customer's Catalogs.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2Catalog> getCatalogs() {
    return catalogs;
  }

  /**
   * All the customer's Catalogs.
   * @param catalogs catalogs or {@code null} for none
   */
  public GoogleCloudRetailV2ListCatalogsResponse setCatalogs(java.util.List<GoogleCloudRetailV2Catalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  /**
   * A token that can be sent as ListCatalogsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as ListCatalogsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRetailV2ListCatalogsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudRetailV2ListCatalogsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2ListCatalogsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2ListCatalogsResponse clone() {
    return (GoogleCloudRetailV2ListCatalogsResponse) super.clone();
  }

}
