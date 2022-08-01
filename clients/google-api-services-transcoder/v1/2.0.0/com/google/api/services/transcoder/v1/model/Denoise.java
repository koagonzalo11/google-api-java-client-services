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
 * Denoise preprocessing configuration. **Note:** This configuration is not supported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Denoise extends com.google.api.client.json.GenericJson {

  /**
   * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother
   * the image. 0 is no denoising. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double strength;

  /**
   * Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` -
   * `grain`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tune;

  /**
   * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother
   * the image. 0 is no denoising. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getStrength() {
    return strength;
  }

  /**
   * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother
   * the image. 0 is no denoising. The default is 0.
   * @param strength strength or {@code null} for none
   */
  public Denoise setStrength(java.lang.Double strength) {
    this.strength = strength;
    return this;
  }

  /**
   * Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` -
   * `grain`
   * @return value or {@code null} for none
   */
  public java.lang.String getTune() {
    return tune;
  }

  /**
   * Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` -
   * `grain`
   * @param tune tune or {@code null} for none
   */
  public Denoise setTune(java.lang.String tune) {
    this.tune = tune;
    return this;
  }

  @Override
  public Denoise set(String fieldName, Object value) {
    return (Denoise) super.set(fieldName, value);
  }

  @Override
  public Denoise clone() {
    return (Denoise) super.clone();
  }

}
