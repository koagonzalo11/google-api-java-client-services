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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceMoveRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceMoveRequest extends com.google.api.client.json.GenericJson {

  /**
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For
   * example, the following are all valid URLs to a zone: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone
   * - zones/zone
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationZone;

  /**
   * The URL of the target instance to move. This can be a full or partial URL. For example, the
   * following are all valid URLs to an instance: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetInstance;

  /**
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For
   * example, the following are all valid URLs to a zone: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone
   * - zones/zone
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationZone() {
    return destinationZone;
  }

  /**
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For
   * example, the following are all valid URLs to a zone: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone
   * - zones/zone
   * @param destinationZone destinationZone or {@code null} for none
   */
  public InstanceMoveRequest setDestinationZone(java.lang.String destinationZone) {
    this.destinationZone = destinationZone;
    return this;
  }

  /**
   * The URL of the target instance to move. This can be a full or partial URL. For example, the
   * following are all valid URLs to an instance: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetInstance() {
    return targetInstance;
  }

  /**
   * The URL of the target instance to move. This can be a full or partial URL. For example, the
   * following are all valid URLs to an instance: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance -
   * projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * @param targetInstance targetInstance or {@code null} for none
   */
  public InstanceMoveRequest setTargetInstance(java.lang.String targetInstance) {
    this.targetInstance = targetInstance;
    return this;
  }

  @Override
  public InstanceMoveRequest set(String fieldName, Object value) {
    return (InstanceMoveRequest) super.set(fieldName, value);
  }

  @Override
  public InstanceMoveRequest clone() {
    return (InstanceMoveRequest) super.clone();
  }

}
