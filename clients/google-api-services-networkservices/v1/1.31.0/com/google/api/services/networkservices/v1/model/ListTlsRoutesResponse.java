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

package com.google.api.services.networkservices.v1.model;

/**
 * Response returned by the ListTlsRoutes method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTlsRoutesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of TlsRoute resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TlsRoute> tlsRoutes;

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there might be more results than those appearing in this response, then `next_page_token` is
   * included. To get the next set of results, call this method again using the value of
   * `next_page_token` as `page_token`.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTlsRoutesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of TlsRoute resources.
   * @return value or {@code null} for none
   */
  public java.util.List<TlsRoute> getTlsRoutes() {
    return tlsRoutes;
  }

  /**
   * List of TlsRoute resources.
   * @param tlsRoutes tlsRoutes or {@code null} for none
   */
  public ListTlsRoutesResponse setTlsRoutes(java.util.List<TlsRoute> tlsRoutes) {
    this.tlsRoutes = tlsRoutes;
    return this;
  }

  @Override
  public ListTlsRoutesResponse set(String fieldName, Object value) {
    return (ListTlsRoutesResponse) super.set(fieldName, value);
  }

  @Override
  public ListTlsRoutesResponse clone() {
    return (ListTlsRoutesResponse) super.clone();
  }

}
