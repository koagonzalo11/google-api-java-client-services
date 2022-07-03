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

package com.google.api.services.eventarc.v1.model;

/**
 * The response message for the `ListChannels` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListChannelsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The requested channels, up to the number specified in `page_size`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Channel> channels;

  static {
    // hack to force ProGuard to consider Channel used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Channel.class);
  }

  /**
   * A page token that can be sent to `ListChannels` to request the next page. If this is empty,
   * then there are no more pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Unreachable resources, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The requested channels, up to the number specified in `page_size`.
   * @return value or {@code null} for none
   */
  public java.util.List<Channel> getChannels() {
    return channels;
  }

  /**
   * The requested channels, up to the number specified in `page_size`.
   * @param channels channels or {@code null} for none
   */
  public ListChannelsResponse setChannels(java.util.List<Channel> channels) {
    this.channels = channels;
    return this;
  }

  /**
   * A page token that can be sent to `ListChannels` to request the next page. If this is empty,
   * then there are no more pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A page token that can be sent to `ListChannels` to request the next page. If this is empty,
   * then there are no more pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListChannelsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Unreachable resources, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unreachable resources, if any.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListChannelsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListChannelsResponse set(String fieldName, Object value) {
    return (ListChannelsResponse) super.set(fieldName, value);
  }

  @Override
  public ListChannelsResponse clone() {
    return (ListChannelsResponse) super.clone();
  }

}
