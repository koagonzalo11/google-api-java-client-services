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

package com.google.api.services.baremetalsolution.v2.model;

/**
 * A LUN(Logical Unit Number) range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LunRange extends com.google.api.client.json.GenericJson {

  /**
   * Number of LUNs to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer quantity;

  /**
   * The requested size of each LUN, in GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sizeGb;

  /**
   * Number of LUNs to create.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Number of LUNs to create.
   * @param quantity quantity or {@code null} for none
   */
  public LunRange setQuantity(java.lang.Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The requested size of each LUN, in GB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSizeGb() {
    return sizeGb;
  }

  /**
   * The requested size of each LUN, in GB.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public LunRange setSizeGb(java.lang.Integer sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  @Override
  public LunRange set(String fieldName, Object value) {
    return (LunRange) super.set(fieldName, value);
  }

  @Override
  public LunRange clone() {
    return (LunRange) super.clone();
  }

}
