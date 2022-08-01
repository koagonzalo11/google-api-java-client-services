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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Response message for ListMeasurementProtocolSecret RPC
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of secrets for the parent stream specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret> measurementProtocolSecrets;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of secrets for the parent stream specified in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret> getMeasurementProtocolSecrets() {
    return measurementProtocolSecrets;
  }

  /**
   * A list of secrets for the parent stream specified in the request.
   * @param measurementProtocolSecrets measurementProtocolSecrets or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse setMeasurementProtocolSecrets(java.util.List<GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret> measurementProtocolSecrets) {
    this.measurementProtocolSecrets = measurementProtocolSecrets;
    return this;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse clone() {
    return (GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse) super.clone();
  }

}
