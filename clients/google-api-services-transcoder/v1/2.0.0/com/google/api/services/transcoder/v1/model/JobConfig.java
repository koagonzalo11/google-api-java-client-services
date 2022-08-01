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

package com.google.api.services.transcoder.v1.model;

/**
 * Job configuration
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobConfig extends com.google.api.client.json.GenericJson {

  /**
   * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdBreak> adBreaks;

  static {
    // hack to force ProGuard to consider AdBreak used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdBreak.class);
  }

  /**
   * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EditAtom> editList;

  static {
    // hack to force ProGuard to consider EditAtom used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EditAtom.class);
  }

  /**
   * List of elementary streams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ElementaryStream> elementaryStreams;

  static {
    // hack to force ProGuard to consider ElementaryStream used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ElementaryStream.class);
  }

  /**
   * List of input assets stored in Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Input> inputs;

  static {
    // hack to force ProGuard to consider Input used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Input.class);
  }

  /**
   * List of output manifests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Manifest> manifests;

  /**
   * List of multiplexing settings for output streams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MuxStream> muxStreams;

  /**
   * Output configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Output output;

  /**
   * List of overlays on the output video, in descending Z-order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Overlay> overlays;

  /**
   * Destination on Pub/Sub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubsubDestination pubsubDestination;

  /**
   * List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SpriteSheet> spriteSheets;

  /**
   * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
   * @return value or {@code null} for none
   */
  public java.util.List<AdBreak> getAdBreaks() {
    return adBreaks;
  }

  /**
   * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
   * @param adBreaks adBreaks or {@code null} for none
   */
  public JobConfig setAdBreaks(java.util.List<AdBreak> adBreaks) {
    this.adBreaks = adBreaks;
    return this;
  }

  /**
   * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
   * @return value or {@code null} for none
   */
  public java.util.List<EditAtom> getEditList() {
    return editList;
  }

  /**
   * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
   * @param editList editList or {@code null} for none
   */
  public JobConfig setEditList(java.util.List<EditAtom> editList) {
    this.editList = editList;
    return this;
  }

  /**
   * List of elementary streams.
   * @return value or {@code null} for none
   */
  public java.util.List<ElementaryStream> getElementaryStreams() {
    return elementaryStreams;
  }

  /**
   * List of elementary streams.
   * @param elementaryStreams elementaryStreams or {@code null} for none
   */
  public JobConfig setElementaryStreams(java.util.List<ElementaryStream> elementaryStreams) {
    this.elementaryStreams = elementaryStreams;
    return this;
  }

  /**
   * List of input assets stored in Cloud Storage.
   * @return value or {@code null} for none
   */
  public java.util.List<Input> getInputs() {
    return inputs;
  }

  /**
   * List of input assets stored in Cloud Storage.
   * @param inputs inputs or {@code null} for none
   */
  public JobConfig setInputs(java.util.List<Input> inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * List of output manifests.
   * @return value or {@code null} for none
   */
  public java.util.List<Manifest> getManifests() {
    return manifests;
  }

  /**
   * List of output manifests.
   * @param manifests manifests or {@code null} for none
   */
  public JobConfig setManifests(java.util.List<Manifest> manifests) {
    this.manifests = manifests;
    return this;
  }

  /**
   * List of multiplexing settings for output streams.
   * @return value or {@code null} for none
   */
  public java.util.List<MuxStream> getMuxStreams() {
    return muxStreams;
  }

  /**
   * List of multiplexing settings for output streams.
   * @param muxStreams muxStreams or {@code null} for none
   */
  public JobConfig setMuxStreams(java.util.List<MuxStream> muxStreams) {
    this.muxStreams = muxStreams;
    return this;
  }

  /**
   * Output configuration.
   * @return value or {@code null} for none
   */
  public Output getOutput() {
    return output;
  }

  /**
   * Output configuration.
   * @param output output or {@code null} for none
   */
  public JobConfig setOutput(Output output) {
    this.output = output;
    return this;
  }

  /**
   * List of overlays on the output video, in descending Z-order.
   * @return value or {@code null} for none
   */
  public java.util.List<Overlay> getOverlays() {
    return overlays;
  }

  /**
   * List of overlays on the output video, in descending Z-order.
   * @param overlays overlays or {@code null} for none
   */
  public JobConfig setOverlays(java.util.List<Overlay> overlays) {
    this.overlays = overlays;
    return this;
  }

  /**
   * Destination on Pub/Sub.
   * @return value or {@code null} for none
   */
  public PubsubDestination getPubsubDestination() {
    return pubsubDestination;
  }

  /**
   * Destination on Pub/Sub.
   * @param pubsubDestination pubsubDestination or {@code null} for none
   */
  public JobConfig setPubsubDestination(PubsubDestination pubsubDestination) {
    this.pubsubDestination = pubsubDestination;
    return this;
  }

  /**
   * List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
   * @return value or {@code null} for none
   */
  public java.util.List<SpriteSheet> getSpriteSheets() {
    return spriteSheets;
  }

  /**
   * List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
   * @param spriteSheets spriteSheets or {@code null} for none
   */
  public JobConfig setSpriteSheets(java.util.List<SpriteSheet> spriteSheets) {
    this.spriteSheets = spriteSheets;
    return this;
  }

  @Override
  public JobConfig set(String fieldName, Object value) {
    return (JobConfig) super.set(fieldName, value);
  }

  @Override
  public JobConfig clone() {
    return (JobConfig) super.clone();
  }

}
