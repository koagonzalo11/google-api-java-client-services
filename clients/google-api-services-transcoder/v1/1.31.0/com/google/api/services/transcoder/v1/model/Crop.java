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

package com.google.api.services.transcoder.v1.model;

/**
 * Video cropping configuration for the input video. The cropped input video is scaled to match the
 * output resolution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Crop extends com.google.api.client.json.GenericJson {

  /**
   * The number of pixels to crop from the bottom. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bottomPixels;

  /**
   * The number of pixels to crop from the left. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer leftPixels;

  /**
   * The number of pixels to crop from the right. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rightPixels;

  /**
   * The number of pixels to crop from the top. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer topPixels;

  /**
   * The number of pixels to crop from the bottom. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBottomPixels() {
    return bottomPixels;
  }

  /**
   * The number of pixels to crop from the bottom. The default is 0.
   * @param bottomPixels bottomPixels or {@code null} for none
   */
  public Crop setBottomPixels(java.lang.Integer bottomPixels) {
    this.bottomPixels = bottomPixels;
    return this;
  }

  /**
   * The number of pixels to crop from the left. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeftPixels() {
    return leftPixels;
  }

  /**
   * The number of pixels to crop from the left. The default is 0.
   * @param leftPixels leftPixels or {@code null} for none
   */
  public Crop setLeftPixels(java.lang.Integer leftPixels) {
    this.leftPixels = leftPixels;
    return this;
  }

  /**
   * The number of pixels to crop from the right. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRightPixels() {
    return rightPixels;
  }

  /**
   * The number of pixels to crop from the right. The default is 0.
   * @param rightPixels rightPixels or {@code null} for none
   */
  public Crop setRightPixels(java.lang.Integer rightPixels) {
    this.rightPixels = rightPixels;
    return this;
  }

  /**
   * The number of pixels to crop from the top. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTopPixels() {
    return topPixels;
  }

  /**
   * The number of pixels to crop from the top. The default is 0.
   * @param topPixels topPixels or {@code null} for none
   */
  public Crop setTopPixels(java.lang.Integer topPixels) {
    this.topPixels = topPixels;
    return this;
  }

  @Override
  public Crop set(String fieldName, Object value) {
    return (Crop) super.set(fieldName, value);
  }

  @Override
  public Crop clone() {
    return (Crop) super.clone();
  }

}
