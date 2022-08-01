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
 * A link between a GA4 property and a Display & Video 360 advertiser.
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
public final class GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink extends com.google.api.client.json.GenericJson {

  /**
   * Enables personalized advertising features with this integration. If this field is not set on
   * create/update, it will be defaulted to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adsPersonalizationEnabled;

  /**
   * Output only. The display name of the Display & Video 360 Advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserDisplayName;

  /**
   * Immutable. The Display & Video 360 Advertiser's advertiser ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserId;

  /**
   * Immutable. Enables the import of campaign data from Display & Video 360 into the GA4 property.
   * After link creation, this can only be updated from the Display & Video 360 product. If this
   * field is not set on create, it will be defaulted to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean campaignDataSharingEnabled;

  /**
   * Immutable. Enables the import of cost data from Display & Video 360 into the GA4 property. This
   * can only be enabled if campaign_data_sharing_enabled is enabled. After link creation, this can
   * only be updated from the Display & Video 360 product. If this field is not set on create, it
   * will be defaulted to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean costDataSharingEnabled;

  /**
   * Output only. The resource name for this DisplayVideo360AdvertiserLink resource. Format:
   * properties/{propertyId}/displayVideo360AdvertiserLinks/{linkId} Note: linkId is not the Display
   * & Video 360 Advertiser ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Enables personalized advertising features with this integration. If this field is not set on
   * create/update, it will be defaulted to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdsPersonalizationEnabled() {
    return adsPersonalizationEnabled;
  }

  /**
   * Enables personalized advertising features with this integration. If this field is not set on
   * create/update, it will be defaulted to true.
   * @param adsPersonalizationEnabled adsPersonalizationEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setAdsPersonalizationEnabled(java.lang.Boolean adsPersonalizationEnabled) {
    this.adsPersonalizationEnabled = adsPersonalizationEnabled;
    return this;
  }

  /**
   * Output only. The display name of the Display & Video 360 Advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserDisplayName() {
    return advertiserDisplayName;
  }

  /**
   * Output only. The display name of the Display & Video 360 Advertiser.
   * @param advertiserDisplayName advertiserDisplayName or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setAdvertiserDisplayName(java.lang.String advertiserDisplayName) {
    this.advertiserDisplayName = advertiserDisplayName;
    return this;
  }

  /**
   * Immutable. The Display & Video 360 Advertiser's advertiser ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Immutable. The Display & Video 360 Advertiser's advertiser ID.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setAdvertiserId(java.lang.String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Immutable. Enables the import of campaign data from Display & Video 360 into the GA4 property.
   * After link creation, this can only be updated from the Display & Video 360 product. If this
   * field is not set on create, it will be defaulted to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCampaignDataSharingEnabled() {
    return campaignDataSharingEnabled;
  }

  /**
   * Immutable. Enables the import of campaign data from Display & Video 360 into the GA4 property.
   * After link creation, this can only be updated from the Display & Video 360 product. If this
   * field is not set on create, it will be defaulted to true.
   * @param campaignDataSharingEnabled campaignDataSharingEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setCampaignDataSharingEnabled(java.lang.Boolean campaignDataSharingEnabled) {
    this.campaignDataSharingEnabled = campaignDataSharingEnabled;
    return this;
  }

  /**
   * Immutable. Enables the import of cost data from Display & Video 360 into the GA4 property. This
   * can only be enabled if campaign_data_sharing_enabled is enabled. After link creation, this can
   * only be updated from the Display & Video 360 product. If this field is not set on create, it
   * will be defaulted to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCostDataSharingEnabled() {
    return costDataSharingEnabled;
  }

  /**
   * Immutable. Enables the import of cost data from Display & Video 360 into the GA4 property. This
   * can only be enabled if campaign_data_sharing_enabled is enabled. After link creation, this can
   * only be updated from the Display & Video 360 product. If this field is not set on create, it
   * will be defaulted to true.
   * @param costDataSharingEnabled costDataSharingEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setCostDataSharingEnabled(java.lang.Boolean costDataSharingEnabled) {
    this.costDataSharingEnabled = costDataSharingEnabled;
    return this;
  }

  /**
   * Output only. The resource name for this DisplayVideo360AdvertiserLink resource. Format:
   * properties/{propertyId}/displayVideo360AdvertiserLinks/{linkId} Note: linkId is not the Display
   * & Video 360 Advertiser ID
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this DisplayVideo360AdvertiserLink resource. Format:
   * properties/{propertyId}/displayVideo360AdvertiserLinks/{linkId} Note: linkId is not the Display
   * & Video 360 Advertiser ID
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink clone() {
    return (GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink) super.clone();
  }

}
