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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * A sequence of 360 photos along with metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PhotoSequence extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Absolute time when the photo sequence starts to be captured. If the photo sequence is
   * a video, this is the start time of the video. If this field is populated in input, it overrides
   * the capture time in the video or XDM file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String captureTimeOverride;

  /**
   * Output only. The computed distance of the photo sequence in meters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distanceMeters;

  /**
   * Output only. If this sequence has `failure_reason` set, this may contain additional details
   * about the failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProcessingFailureDetails failureDetails;

  /**
   * Output only. If this sequence has processing_state = FAILED, this will contain the reason why
   * it failed. If the processing_state is any other value, this field will be unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureReason;

  /**
   * Output only. The filename of the upload. Does not include the directory path. Only available if
   * the sequence was uploaded on a platform that provides the filename.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * Input only. If both raw_gps_timeline and the Camera Motion Metadata Track (CAMM) contain GPS
   * measurements, indicate which takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gpsSource;

  /**
   * Output only. Unique identifier for the photo sequence. This also acts as a long running
   * operation ID if uploading is performed asynchronously.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Input only. Three axis IMU data for the collection. If this data is too large to put in the
   * request, then it should be put in the CAMM track for the video. This data always takes
   * precedence over the equivalent CAMM data, if it exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Imu imu;

  /**
   * Output only. Photos with increasing timestamps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Photo> photos;

  static {
    // hack to force ProGuard to consider Photo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Photo.class);
  }

  /**
   * Output only. The processing state of this sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String processingState;

  /**
   * Input only. Raw GPS measurements with increasing timestamps from the device that aren't time
   * synced with each photo. These raw measurements will be used to infer the pose of each frame.
   * Required in input when InputType is VIDEO and raw GPS measurements are not in Camera Motion
   * Metadata Track (CAMM). User can indicate which takes precedence using gps_source if raw GPS
   * measurements are provided in both raw_gps_timeline and Camera Motion Metadata Track (CAMM).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Pose> rawGpsTimeline;

  /**
   * Output only. A rectangular box that encapsulates every image in this photo sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLngBounds sequenceBounds;

  /**
   * Input only. Required when creating photo sequence. The resource name where the bytes of the
   * photo sequence (in the form of video) are uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UploadRef uploadReference;

  /**
   * Output only. The time this photo sequence was created in uSV Store service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String uploadTime;

  /**
   * Output only. The total number of views that all the published images in this PhotoSequence have
   * received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long viewCount;

  /**
   * Optional. Absolute time when the photo sequence starts to be captured. If the photo sequence is
   * a video, this is the start time of the video. If this field is populated in input, it overrides
   * the capture time in the video or XDM file.
   * @return value or {@code null} for none
   */
  public String getCaptureTimeOverride() {
    return captureTimeOverride;
  }

  /**
   * Optional. Absolute time when the photo sequence starts to be captured. If the photo sequence is
   * a video, this is the start time of the video. If this field is populated in input, it overrides
   * the capture time in the video or XDM file.
   * @param captureTimeOverride captureTimeOverride or {@code null} for none
   */
  public PhotoSequence setCaptureTimeOverride(String captureTimeOverride) {
    this.captureTimeOverride = captureTimeOverride;
    return this;
  }

  /**
   * Output only. The computed distance of the photo sequence in meters.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistanceMeters() {
    return distanceMeters;
  }

  /**
   * Output only. The computed distance of the photo sequence in meters.
   * @param distanceMeters distanceMeters or {@code null} for none
   */
  public PhotoSequence setDistanceMeters(java.lang.Double distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

  /**
   * Output only. If this sequence has `failure_reason` set, this may contain additional details
   * about the failure.
   * @return value or {@code null} for none
   */
  public ProcessingFailureDetails getFailureDetails() {
    return failureDetails;
  }

  /**
   * Output only. If this sequence has `failure_reason` set, this may contain additional details
   * about the failure.
   * @param failureDetails failureDetails or {@code null} for none
   */
  public PhotoSequence setFailureDetails(ProcessingFailureDetails failureDetails) {
    this.failureDetails = failureDetails;
    return this;
  }

  /**
   * Output only. If this sequence has processing_state = FAILED, this will contain the reason why
   * it failed. If the processing_state is any other value, this field will be unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureReason() {
    return failureReason;
  }

  /**
   * Output only. If this sequence has processing_state = FAILED, this will contain the reason why
   * it failed. If the processing_state is any other value, this field will be unset.
   * @param failureReason failureReason or {@code null} for none
   */
  public PhotoSequence setFailureReason(java.lang.String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Output only. The filename of the upload. Does not include the directory path. Only available if
   * the sequence was uploaded on a platform that provides the filename.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * Output only. The filename of the upload. Does not include the directory path. Only available if
   * the sequence was uploaded on a platform that provides the filename.
   * @param filename filename or {@code null} for none
   */
  public PhotoSequence setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Input only. If both raw_gps_timeline and the Camera Motion Metadata Track (CAMM) contain GPS
   * measurements, indicate which takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getGpsSource() {
    return gpsSource;
  }

  /**
   * Input only. If both raw_gps_timeline and the Camera Motion Metadata Track (CAMM) contain GPS
   * measurements, indicate which takes precedence.
   * @param gpsSource gpsSource or {@code null} for none
   */
  public PhotoSequence setGpsSource(java.lang.String gpsSource) {
    this.gpsSource = gpsSource;
    return this;
  }

  /**
   * Output only. Unique identifier for the photo sequence. This also acts as a long running
   * operation ID if uploading is performed asynchronously.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. Unique identifier for the photo sequence. This also acts as a long running
   * operation ID if uploading is performed asynchronously.
   * @param id id or {@code null} for none
   */
  public PhotoSequence setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Input only. Three axis IMU data for the collection. If this data is too large to put in the
   * request, then it should be put in the CAMM track for the video. This data always takes
   * precedence over the equivalent CAMM data, if it exists.
   * @return value or {@code null} for none
   */
  public Imu getImu() {
    return imu;
  }

  /**
   * Input only. Three axis IMU data for the collection. If this data is too large to put in the
   * request, then it should be put in the CAMM track for the video. This data always takes
   * precedence over the equivalent CAMM data, if it exists.
   * @param imu imu or {@code null} for none
   */
  public PhotoSequence setImu(Imu imu) {
    this.imu = imu;
    return this;
  }

  /**
   * Output only. Photos with increasing timestamps.
   * @return value or {@code null} for none
   */
  public java.util.List<Photo> getPhotos() {
    return photos;
  }

  /**
   * Output only. Photos with increasing timestamps.
   * @param photos photos or {@code null} for none
   */
  public PhotoSequence setPhotos(java.util.List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  /**
   * Output only. The processing state of this sequence.
   * @return value or {@code null} for none
   */
  public java.lang.String getProcessingState() {
    return processingState;
  }

  /**
   * Output only. The processing state of this sequence.
   * @param processingState processingState or {@code null} for none
   */
  public PhotoSequence setProcessingState(java.lang.String processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Input only. Raw GPS measurements with increasing timestamps from the device that aren't time
   * synced with each photo. These raw measurements will be used to infer the pose of each frame.
   * Required in input when InputType is VIDEO and raw GPS measurements are not in Camera Motion
   * Metadata Track (CAMM). User can indicate which takes precedence using gps_source if raw GPS
   * measurements are provided in both raw_gps_timeline and Camera Motion Metadata Track (CAMM).
   * @return value or {@code null} for none
   */
  public java.util.List<Pose> getRawGpsTimeline() {
    return rawGpsTimeline;
  }

  /**
   * Input only. Raw GPS measurements with increasing timestamps from the device that aren't time
   * synced with each photo. These raw measurements will be used to infer the pose of each frame.
   * Required in input when InputType is VIDEO and raw GPS measurements are not in Camera Motion
   * Metadata Track (CAMM). User can indicate which takes precedence using gps_source if raw GPS
   * measurements are provided in both raw_gps_timeline and Camera Motion Metadata Track (CAMM).
   * @param rawGpsTimeline rawGpsTimeline or {@code null} for none
   */
  public PhotoSequence setRawGpsTimeline(java.util.List<Pose> rawGpsTimeline) {
    this.rawGpsTimeline = rawGpsTimeline;
    return this;
  }

  /**
   * Output only. A rectangular box that encapsulates every image in this photo sequence.
   * @return value or {@code null} for none
   */
  public LatLngBounds getSequenceBounds() {
    return sequenceBounds;
  }

  /**
   * Output only. A rectangular box that encapsulates every image in this photo sequence.
   * @param sequenceBounds sequenceBounds or {@code null} for none
   */
  public PhotoSequence setSequenceBounds(LatLngBounds sequenceBounds) {
    this.sequenceBounds = sequenceBounds;
    return this;
  }

  /**
   * Input only. Required when creating photo sequence. The resource name where the bytes of the
   * photo sequence (in the form of video) are uploaded.
   * @return value or {@code null} for none
   */
  public UploadRef getUploadReference() {
    return uploadReference;
  }

  /**
   * Input only. Required when creating photo sequence. The resource name where the bytes of the
   * photo sequence (in the form of video) are uploaded.
   * @param uploadReference uploadReference or {@code null} for none
   */
  public PhotoSequence setUploadReference(UploadRef uploadReference) {
    this.uploadReference = uploadReference;
    return this;
  }

  /**
   * Output only. The time this photo sequence was created in uSV Store service.
   * @return value or {@code null} for none
   */
  public String getUploadTime() {
    return uploadTime;
  }

  /**
   * Output only. The time this photo sequence was created in uSV Store service.
   * @param uploadTime uploadTime or {@code null} for none
   */
  public PhotoSequence setUploadTime(String uploadTime) {
    this.uploadTime = uploadTime;
    return this;
  }

  /**
   * Output only. The total number of views that all the published images in this PhotoSequence have
   * received.
   * @return value or {@code null} for none
   */
  public java.lang.Long getViewCount() {
    return viewCount;
  }

  /**
   * Output only. The total number of views that all the published images in this PhotoSequence have
   * received.
   * @param viewCount viewCount or {@code null} for none
   */
  public PhotoSequence setViewCount(java.lang.Long viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  @Override
  public PhotoSequence set(String fieldName, Object value) {
    return (PhotoSequence) super.set(fieldName, value);
  }

  @Override
  public PhotoSequence clone() {
    return (PhotoSequence) super.clone();
  }

}
