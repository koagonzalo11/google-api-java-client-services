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
 * Arbitrary client data that is populated by clients. Duplicate keys and values are allowed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupClientData extends com.google.api.client.json.GenericJson {

  /**
   * The client specified key of the client data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The client specified value of the client data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The client specified key of the client data.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The client specified key of the client data.
   * @param key key or {@code null} for none
   */
  public GroupClientData setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The client specified value of the client data.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The client specified value of the client data.
   * @param value value or {@code null} for none
   */
  public GroupClientData setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GroupClientData set(String fieldName, Object value) {
    return (GroupClientData) super.set(fieldName, value);
  }

  @Override
  public GroupClientData clone() {
    return (GroupClientData) super.clone();
  }

}
