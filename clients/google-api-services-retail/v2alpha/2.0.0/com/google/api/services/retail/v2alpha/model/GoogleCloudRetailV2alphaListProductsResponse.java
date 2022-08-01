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
 * Response message for ProductService.ListProducts method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaListProductsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token that can be sent as ListProductsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaProduct> products;

  /**
   * The total count of matched Products irrespective of pagination. The total number of Products
   * returned by pagination may be less than the total_size that matches. This field is ignored if
   * ListProductsRequest.require_total_size is not set or ListProductsRequest.page_token is not
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * A token that can be sent as ListProductsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as ListProductsRequest.page_token to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRetailV2alphaListProductsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The Products.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaProduct> getProducts() {
    return products;
  }

  /**
   * The Products.
   * @param products products or {@code null} for none
   */
  public GoogleCloudRetailV2alphaListProductsResponse setProducts(java.util.List<GoogleCloudRetailV2alphaProduct> products) {
    this.products = products;
    return this;
  }

  /**
   * The total count of matched Products irrespective of pagination. The total number of Products
   * returned by pagination may be less than the total_size that matches. This field is ignored if
   * ListProductsRequest.require_total_size is not set or ListProductsRequest.page_token is not
   * empty.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total count of matched Products irrespective of pagination. The total number of Products
   * returned by pagination may be less than the total_size that matches. This field is ignored if
   * ListProductsRequest.require_total_size is not set or ListProductsRequest.page_token is not
   * empty.
   * @param totalSize totalSize or {@code null} for none
   */
  public GoogleCloudRetailV2alphaListProductsResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaListProductsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaListProductsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaListProductsResponse clone() {
    return (GoogleCloudRetailV2alphaListProductsResponse) super.clone();
  }

}
