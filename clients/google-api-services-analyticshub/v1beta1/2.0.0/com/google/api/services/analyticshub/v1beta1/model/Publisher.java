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

package com.google.api.services.analyticshub.v1beta1.model;

/**
 * Contains details of the listing publisher.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Publisher extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Name of the listing publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Email or URL of the listing publisher. Max Length: 1000 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryContact;

  /**
   * Optional. Name of the listing publisher.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Name of the listing publisher.
   * @param name name or {@code null} for none
   */
  public Publisher setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Email or URL of the listing publisher. Max Length: 1000 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryContact() {
    return primaryContact;
  }

  /**
   * Optional. Email or URL of the listing publisher. Max Length: 1000 bytes.
   * @param primaryContact primaryContact or {@code null} for none
   */
  public Publisher setPrimaryContact(java.lang.String primaryContact) {
    this.primaryContact = primaryContact;
    return this;
  }

  @Override
  public Publisher set(String fieldName, Object value) {
    return (Publisher) super.set(fieldName, value);
  }

  @Override
  public Publisher clone() {
    return (Publisher) super.clone();
  }

}
