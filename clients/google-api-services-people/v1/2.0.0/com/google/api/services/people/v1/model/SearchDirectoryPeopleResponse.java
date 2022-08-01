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

package com.google.api.services.people.v1.model;

/**
 * The response to a request for people in the authenticated user's domain directory that match the
 * specified query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchDirectoryPeopleResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of people in the domain directory that match the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Person> people;

  static {
    // hack to force ProGuard to consider Person used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Person.class);
  }

  /**
   * The total number of items in the list without pagination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchDirectoryPeopleResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of people in the domain directory that match the query.
   * @return value or {@code null} for none
   */
  public java.util.List<Person> getPeople() {
    return people;
  }

  /**
   * The list of people in the domain directory that match the query.
   * @param people people or {@code null} for none
   */
  public SearchDirectoryPeopleResponse setPeople(java.util.List<Person> people) {
    this.people = people;
    return this;
  }

  /**
   * The total number of items in the list without pagination.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total number of items in the list without pagination.
   * @param totalSize totalSize or {@code null} for none
   */
  public SearchDirectoryPeopleResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public SearchDirectoryPeopleResponse set(String fieldName, Object value) {
    return (SearchDirectoryPeopleResponse) super.set(fieldName, value);
  }

  @Override
  public SearchDirectoryPeopleResponse clone() {
    return (SearchDirectoryPeopleResponse) super.clone();
  }

}
