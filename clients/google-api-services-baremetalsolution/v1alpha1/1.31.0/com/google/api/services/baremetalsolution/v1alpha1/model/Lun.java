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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * A storage Lun.
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
public final class Lun extends com.google.api.client.json.GenericJson {

  /**
   * Whether this Lun is a boot Lun.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isBoot;

  /**
   * The multiprotocol type of this Lun.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String multiprotocolType;

  /**
   * Output only. The name of this Lun.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The storage volume that this Lun is attached to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Volume remoteVolume;

  /**
   * The serial number of this Lun
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * Whether this Lun is allowed to be shared between multiple physical servers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shareable;

  /**
   * The size of this Lun, in gigabytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeGb;

  /**
   * The state of this Lun.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * World Wide IDentifier of this Lun
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wwid;

  /**
   * Whether this Lun is a boot Lun.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsBoot() {
    return isBoot;
  }

  /**
   * Whether this Lun is a boot Lun.
   * @param isBoot isBoot or {@code null} for none
   */
  public Lun setIsBoot(java.lang.Boolean isBoot) {
    this.isBoot = isBoot;
    return this;
  }

  /**
   * The multiprotocol type of this Lun.
   * @return value or {@code null} for none
   */
  public java.lang.String getMultiprotocolType() {
    return multiprotocolType;
  }

  /**
   * The multiprotocol type of this Lun.
   * @param multiprotocolType multiprotocolType or {@code null} for none
   */
  public Lun setMultiprotocolType(java.lang.String multiprotocolType) {
    this.multiprotocolType = multiprotocolType;
    return this;
  }

  /**
   * Output only. The name of this Lun.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of this Lun.
   * @param name name or {@code null} for none
   */
  public Lun setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The storage volume that this Lun is attached to.
   * @return value or {@code null} for none
   */
  public Volume getRemoteVolume() {
    return remoteVolume;
  }

  /**
   * The storage volume that this Lun is attached to.
   * @param remoteVolume remoteVolume or {@code null} for none
   */
  public Lun setRemoteVolume(Volume remoteVolume) {
    this.remoteVolume = remoteVolume;
    return this;
  }

  /**
   * The serial number of this Lun
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * The serial number of this Lun
   * @param serialNumber serialNumber or {@code null} for none
   */
  public Lun setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Whether this Lun is allowed to be shared between multiple physical servers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShareable() {
    return shareable;
  }

  /**
   * Whether this Lun is allowed to be shared between multiple physical servers.
   * @param shareable shareable or {@code null} for none
   */
  public Lun setShareable(java.lang.Boolean shareable) {
    this.shareable = shareable;
    return this;
  }

  /**
   * The size of this Lun, in gigabytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeGb() {
    return sizeGb;
  }

  /**
   * The size of this Lun, in gigabytes.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public Lun setSizeGb(java.lang.Long sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * The state of this Lun.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of this Lun.
   * @param state state or {@code null} for none
   */
  public Lun setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * World Wide IDentifier of this Lun
   * @return value or {@code null} for none
   */
  public java.lang.String getWwid() {
    return wwid;
  }

  /**
   * World Wide IDentifier of this Lun
   * @param wwid wwid or {@code null} for none
   */
  public Lun setWwid(java.lang.String wwid) {
    this.wwid = wwid;
    return this;
  }

  @Override
  public Lun set(String fieldName, Object value) {
    return (Lun) super.set(fieldName, value);
  }

  @Override
  public Lun clone() {
    return (Lun) super.clone();
  }

}
