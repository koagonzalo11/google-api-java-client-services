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

package com.google.api.services.networkservices.v1.model;

/**
 * The specification for redirecting traffic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteRedirect extends com.google.api.client.json.GenericJson {

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostRedirect;

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. The default
   * is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean httpsRedirect;

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or
   * neither. If neither is supplied, the path of the original request will be used for the
   * redirect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathRedirect;

  /**
   * The port that will be used in the redirected request instead of the one that was supplied in
   * the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer portRedirect;

  /**
   * Indicates that during redirection, the matched prefix (or path) should be swapped with this
   * value. This option allows URLs be dynamically created based on the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefixRewrite;

  /**
   * The HTTP Status code to use for the redirect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseCode;

  /**
   * if set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean stripQuery;

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostRedirect() {
    return hostRedirect;
  }

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request.
   * @param hostRedirect hostRedirect or {@code null} for none
   */
  public HttpRouteRedirect setHostRedirect(java.lang.String hostRedirect) {
    this.hostRedirect = hostRedirect;
    return this;
  }

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. The default
   * is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHttpsRedirect() {
    return httpsRedirect;
  }

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. The default
   * is set to false.
   * @param httpsRedirect httpsRedirect or {@code null} for none
   */
  public HttpRouteRedirect setHttpsRedirect(java.lang.Boolean httpsRedirect) {
    this.httpsRedirect = httpsRedirect;
    return this;
  }

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or
   * neither. If neither is supplied, the path of the original request will be used for the
   * redirect.
   * @return value or {@code null} for none
   */
  public java.lang.String getPathRedirect() {
    return pathRedirect;
  }

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or
   * neither. If neither is supplied, the path of the original request will be used for the
   * redirect.
   * @param pathRedirect pathRedirect or {@code null} for none
   */
  public HttpRouteRedirect setPathRedirect(java.lang.String pathRedirect) {
    this.pathRedirect = pathRedirect;
    return this;
  }

  /**
   * The port that will be used in the redirected request instead of the one that was supplied in
   * the request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPortRedirect() {
    return portRedirect;
  }

  /**
   * The port that will be used in the redirected request instead of the one that was supplied in
   * the request.
   * @param portRedirect portRedirect or {@code null} for none
   */
  public HttpRouteRedirect setPortRedirect(java.lang.Integer portRedirect) {
    this.portRedirect = portRedirect;
    return this;
  }

  /**
   * Indicates that during redirection, the matched prefix (or path) should be swapped with this
   * value. This option allows URLs be dynamically created based on the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefixRewrite() {
    return prefixRewrite;
  }

  /**
   * Indicates that during redirection, the matched prefix (or path) should be swapped with this
   * value. This option allows URLs be dynamically created based on the request.
   * @param prefixRewrite prefixRewrite or {@code null} for none
   */
  public HttpRouteRedirect setPrefixRewrite(java.lang.String prefixRewrite) {
    this.prefixRewrite = prefixRewrite;
    return this;
  }

  /**
   * The HTTP Status code to use for the redirect.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseCode() {
    return responseCode;
  }

  /**
   * The HTTP Status code to use for the redirect.
   * @param responseCode responseCode or {@code null} for none
   */
  public HttpRouteRedirect setResponseCode(java.lang.String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * if set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStripQuery() {
    return stripQuery;
  }

  /**
   * if set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * @param stripQuery stripQuery or {@code null} for none
   */
  public HttpRouteRedirect setStripQuery(java.lang.Boolean stripQuery) {
    this.stripQuery = stripQuery;
    return this;
  }

  @Override
  public HttpRouteRedirect set(String fieldName, Object value) {
    return (HttpRouteRedirect) super.set(fieldName, value);
  }

  @Override
  public HttpRouteRedirect clone() {
    return (HttpRouteRedirect) super.clone();
  }

}
