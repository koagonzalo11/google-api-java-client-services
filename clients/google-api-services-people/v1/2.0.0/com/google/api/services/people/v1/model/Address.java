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
 * A person's physical address. May be a P.O. box or street address. All fields are optional.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Address extends com.google.api.client.json.GenericJson {

  /**
   * The city of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The country of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country code of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * The extended address of the address; for example, the apartment number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String extendedAddress;

  /**
   * Output only. The type of the address translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * The unstructured value of the address. If this is not set by the user it will be automatically
   * constructed from structured values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedValue;

  /**
   * Metadata about the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The P.O. box of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poBox;

  /**
   * The postal code of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * The region of the address; for example, the state or province.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The street address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetAddress;

  /**
   * The type of the address. The type can be custom or one of these predefined values: * `home` *
   * `work` * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The city of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * The city of the address.
   * @param city city or {@code null} for none
   */
  public Address setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * The country of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The country of the address.
   * @param country country or {@code null} for none
   */
  public Address setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country code of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country code of the address.
   * @param countryCode countryCode or {@code null} for none
   */
  public Address setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The extended address of the address; for example, the apartment number.
   * @return value or {@code null} for none
   */
  public java.lang.String getExtendedAddress() {
    return extendedAddress;
  }

  /**
   * The extended address of the address; for example, the apartment number.
   * @param extendedAddress extendedAddress or {@code null} for none
   */
  public Address setExtendedAddress(java.lang.String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

  /**
   * Output only. The type of the address translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * Output only. The type of the address translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * @param formattedType formattedType or {@code null} for none
   */
  public Address setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * The unstructured value of the address. If this is not set by the user it will be automatically
   * constructed from structured values.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedValue() {
    return formattedValue;
  }

  /**
   * The unstructured value of the address. If this is not set by the user it will be automatically
   * constructed from structured values.
   * @param formattedValue formattedValue or {@code null} for none
   */
  public Address setFormattedValue(java.lang.String formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

  /**
   * Metadata about the address.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the address.
   * @param metadata metadata or {@code null} for none
   */
  public Address setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The P.O. box of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getPoBox() {
    return poBox;
  }

  /**
   * The P.O. box of the address.
   * @param poBox poBox or {@code null} for none
   */
  public Address setPoBox(java.lang.String poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * The postal code of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * The postal code of the address.
   * @param postalCode postalCode or {@code null} for none
   */
  public Address setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The region of the address; for example, the state or province.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The region of the address; for example, the state or province.
   * @param region region or {@code null} for none
   */
  public Address setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The street address.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetAddress() {
    return streetAddress;
  }

  /**
   * The street address.
   * @param streetAddress streetAddress or {@code null} for none
   */
  public Address setStreetAddress(java.lang.String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * The type of the address. The type can be custom or one of these predefined values: * `home` *
   * `work` * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the address. The type can be custom or one of these predefined values: * `home` *
   * `work` * `other`
   * @param type type or {@code null} for none
   */
  public Address setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Address set(String fieldName, Object value) {
    return (Address) super.set(fieldName, value);
  }

  @Override
  public Address clone() {
    return (Address) super.clone();
  }

}
