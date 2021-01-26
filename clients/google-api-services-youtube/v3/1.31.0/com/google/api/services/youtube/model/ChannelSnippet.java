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

package com.google.api.services.youtube.model;

/**
 * Basic details about a channel, including title, description and thumbnails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The country of the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The custom url of the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customUrl;

  /**
   * The language of the channel's default title and description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLanguage;

  /**
   * The description of the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Localized title and description, read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelLocalization localized;

  /**
   * The date and time that the channel was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * A map of thumbnail images associated with the channel. For each object in the map, the key is
   * the name of the thumbnail image, and the value is an object that contains other information
   * about the thumbnail. When displaying thumbnails in your application, make sure that your code
   * uses the image URLs exactly as they are returned in API responses. For example, your
   * application should not use the http domain instead of the https domain in a URL returned in an
   * API response. Beginning in July 2018, channel thumbnail URLs will only be available in the
   * https domain, which is how the URLs appear in API responses. After that time, you might see
   * broken images in your application if it tries to load YouTube images from the http domain.
   * Thumbnail images might be empty for newly created channels and might take up to one day to
   * populate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThumbnailDetails thumbnails;

  /**
   * The channel's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The country of the channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The country of the channel.
   * @param country country or {@code null} for none
   */
  public ChannelSnippet setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The custom url of the channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomUrl() {
    return customUrl;
  }

  /**
   * The custom url of the channel.
   * @param customUrl customUrl or {@code null} for none
   */
  public ChannelSnippet setCustomUrl(java.lang.String customUrl) {
    this.customUrl = customUrl;
    return this;
  }

  /**
   * The language of the channel's default title and description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLanguage() {
    return defaultLanguage;
  }

  /**
   * The language of the channel's default title and description.
   * @param defaultLanguage defaultLanguage or {@code null} for none
   */
  public ChannelSnippet setDefaultLanguage(java.lang.String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * The description of the channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the channel.
   * @param description description or {@code null} for none
   */
  public ChannelSnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Localized title and description, read-only.
   * @return value or {@code null} for none
   */
  public ChannelLocalization getLocalized() {
    return localized;
  }

  /**
   * Localized title and description, read-only.
   * @param localized localized or {@code null} for none
   */
  public ChannelSnippet setLocalized(ChannelLocalization localized) {
    this.localized = localized;
    return this;
  }

  /**
   * The date and time that the channel was created.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the channel was created.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public ChannelSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * A map of thumbnail images associated with the channel. For each object in the map, the key is
   * the name of the thumbnail image, and the value is an object that contains other information
   * about the thumbnail. When displaying thumbnails in your application, make sure that your code
   * uses the image URLs exactly as they are returned in API responses. For example, your
   * application should not use the http domain instead of the https domain in a URL returned in an
   * API response. Beginning in July 2018, channel thumbnail URLs will only be available in the
   * https domain, which is how the URLs appear in API responses. After that time, you might see
   * broken images in your application if it tries to load YouTube images from the http domain.
   * Thumbnail images might be empty for newly created channels and might take up to one day to
   * populate.
   * @return value or {@code null} for none
   */
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  /**
   * A map of thumbnail images associated with the channel. For each object in the map, the key is
   * the name of the thumbnail image, and the value is an object that contains other information
   * about the thumbnail. When displaying thumbnails in your application, make sure that your code
   * uses the image URLs exactly as they are returned in API responses. For example, your
   * application should not use the http domain instead of the https domain in a URL returned in an
   * API response. Beginning in July 2018, channel thumbnail URLs will only be available in the
   * https domain, which is how the URLs appear in API responses. After that time, you might see
   * broken images in your application if it tries to load YouTube images from the http domain.
   * Thumbnail images might be empty for newly created channels and might take up to one day to
   * populate.
   * @param thumbnails thumbnails or {@code null} for none
   */
  public ChannelSnippet setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * The channel's title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The channel's title.
   * @param title title or {@code null} for none
   */
  public ChannelSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public ChannelSnippet set(String fieldName, Object value) {
    return (ChannelSnippet) super.set(fieldName, value);
  }

  @Override
  public ChannelSnippet clone() {
    return (ChannelSnippet) super.clone();
  }

}
