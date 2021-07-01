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

package com.google.api.services.run.v1.model;

/**
 * Not supported by Cloud Run Adapts a ConfigMap into a volume. The contents of the target
 * ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as
 * the file names, unless the items element is populated with specific mappings of keys to paths.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigMapVolumeSource extends com.google.api.client.json.GenericJson {

  /**
   * (Optional) Mode bits to use on created files by default. Must be a value between 0 and 0777.
   * Defaults to 0644. Directories within the path are not affected by this setting. This might be
   * in conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultMode;

  /**
   * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will
   * be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KeyToPath> items;

  /**
   * Name of the config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean optional;

  /**
   * (Optional) Mode bits to use on created files by default. Must be a value between 0 and 0777.
   * Defaults to 0644. Directories within the path are not affected by this setting. This might be
   * in conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultMode() {
    return defaultMode;
  }

  /**
   * (Optional) Mode bits to use on created files by default. Must be a value between 0 and 0777.
   * Defaults to 0644. Directories within the path are not affected by this setting. This might be
   * in conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set.
   * @param defaultMode defaultMode or {@code null} for none
   */
  public ConfigMapVolumeSource setDefaultMode(java.lang.Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will
   * be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * @return value or {@code null} for none
   */
  public java.util.List<KeyToPath> getItems() {
    return items;
  }

  /**
   * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will
   * be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * @param items items or {@code null} for none
   */
  public ConfigMapVolumeSource setItems(java.util.List<KeyToPath> items) {
    this.items = items;
    return this;
  }

  /**
   * Name of the config.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the config.
   * @param name name or {@code null} for none
   */
  public ConfigMapVolumeSource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOptional() {
    return optional;
  }

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * @param optional optional or {@code null} for none
   */
  public ConfigMapVolumeSource setOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return this;
  }

  @Override
  public ConfigMapVolumeSource set(String fieldName, Object value) {
    return (ConfigMapVolumeSource) super.set(fieldName, value);
  }

  @Override
  public ConfigMapVolumeSource clone() {
    return (ConfigMapVolumeSource) super.clone();
  }

}
