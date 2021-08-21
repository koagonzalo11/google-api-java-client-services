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

package com.google.api.services.gkehub.v1beta.model;

/**
 * FeatureResourceState describes the state of a Feature *resource* in the GkeHub API. See
 * `FeatureState` for the "running state" of the Feature in the Hub and across Memberships.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FeatureResourceState extends com.google.api.client.json.GenericJson {

  /**
   * The current state of the Feature resource in the Hub API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The current state of the Feature resource in the Hub API.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the Feature resource in the Hub API.
   * @param state state or {@code null} for none
   */
  public FeatureResourceState setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public FeatureResourceState set(String fieldName, Object value) {
    return (FeatureResourceState) super.set(fieldName, value);
  }

  @Override
  public FeatureResourceState clone() {
    return (FeatureResourceState) super.clone();
  }

}
