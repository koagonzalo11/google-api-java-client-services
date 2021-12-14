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
 * Deblock preprocessing configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deblock extends com.google.api.client.json.GenericJson {

  /**
   * Enable deblocker. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the
   * stronger the block removal. 0 is no deblocking. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double strength;

  /**
   * Enable deblocker. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Enable deblocker. The default is `false`.
   * @param enabled enabled or {@code null} for none
   */
  public Deblock setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the
   * stronger the block removal. 0 is no deblocking. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getStrength() {
    return strength;
  }

  /**
   * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the
   * stronger the block removal. 0 is no deblocking. The default is 0.
   * @param strength strength or {@code null} for none
   */
  public Deblock setStrength(java.lang.Double strength) {
    this.strength = strength;
    return this;
  }

  @Override
  public Deblock set(String fieldName, Object value) {
    return (Deblock) super.set(fieldName, value);
  }

  @Override
  public Deblock clone() {
    return (Deblock) super.clone();
  }

}
