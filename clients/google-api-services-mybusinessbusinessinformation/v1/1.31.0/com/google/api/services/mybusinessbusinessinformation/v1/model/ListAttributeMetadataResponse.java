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

package com.google.api.services.mybusinessbusinessinformation.v1.model;

/**
 * Response for AttributesService.ListAttributeMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Business Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAttributeMetadataResponse extends com.google.api.client.json.GenericJson {

  /**
   * A collection of attribute metadata for the available attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AttributeMetadata> attributeMetadata;

  static {
    // hack to force ProGuard to consider AttributeMetadata used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttributeMetadata.class);
  }

  /**
   * If the number of attributes exceeded the requested page size, this field will be populated with
   * a token to fetch the next page of attributes on a subsequent call to `attributes.list`. If
   * there are no more attributes, this field will not be present in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A collection of attribute metadata for the available attributes.
   * @return value or {@code null} for none
   */
  public java.util.List<AttributeMetadata> getAttributeMetadata() {
    return attributeMetadata;
  }

  /**
   * A collection of attribute metadata for the available attributes.
   * @param attributeMetadata attributeMetadata or {@code null} for none
   */
  public ListAttributeMetadataResponse setAttributeMetadata(java.util.List<AttributeMetadata> attributeMetadata) {
    this.attributeMetadata = attributeMetadata;
    return this;
  }

  /**
   * If the number of attributes exceeded the requested page size, this field will be populated with
   * a token to fetch the next page of attributes on a subsequent call to `attributes.list`. If
   * there are no more attributes, this field will not be present in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If the number of attributes exceeded the requested page size, this field will be populated with
   * a token to fetch the next page of attributes on a subsequent call to `attributes.list`. If
   * there are no more attributes, this field will not be present in the response.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAttributeMetadataResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAttributeMetadataResponse set(String fieldName, Object value) {
    return (ListAttributeMetadataResponse) super.set(fieldName, value);
  }

  @Override
  public ListAttributeMetadataResponse clone() {
    return (ListAttributeMetadataResponse) super.clone();
  }

}
