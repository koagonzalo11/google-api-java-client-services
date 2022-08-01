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
 * A description of a change to a single Google Analytics resource.
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
public final class GoogleAnalyticsAdminV1alphaChangeHistoryChange extends com.google.api.client.json.GenericJson {

  /**
   * The type of action that changed this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Resource name of the resource whose changes are described by this entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * Resource contents from after the change was made. If this resource was deleted in this change,
   * this field will be missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource resourceAfterChange;

  /**
   * Resource contents from before the change was made. If this resource was created in this change,
   * this field will be missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource resourceBeforeChange;

  /**
   * The type of action that changed this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The type of action that changed this resource.
   * @param action action or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Resource name of the resource whose changes are described by this entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Resource name of the resource whose changes are described by this entry.
   * @param resource resource or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Resource contents from after the change was made. If this resource was deleted in this change,
   * this field will be missing.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource getResourceAfterChange() {
    return resourceAfterChange;
  }

  /**
   * Resource contents from after the change was made. If this resource was deleted in this change,
   * this field will be missing.
   * @param resourceAfterChange resourceAfterChange or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange setResourceAfterChange(GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource resourceAfterChange) {
    this.resourceAfterChange = resourceAfterChange;
    return this;
  }

  /**
   * Resource contents from before the change was made. If this resource was created in this change,
   * this field will be missing.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource getResourceBeforeChange() {
    return resourceBeforeChange;
  }

  /**
   * Resource contents from before the change was made. If this resource was created in this change,
   * this field will be missing.
   * @param resourceBeforeChange resourceBeforeChange or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange setResourceBeforeChange(GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource resourceBeforeChange) {
    this.resourceBeforeChange = resourceBeforeChange;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaChangeHistoryChange) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaChangeHistoryChange clone() {
    return (GoogleAnalyticsAdminV1alphaChangeHistoryChange) super.clone();
  }

}
