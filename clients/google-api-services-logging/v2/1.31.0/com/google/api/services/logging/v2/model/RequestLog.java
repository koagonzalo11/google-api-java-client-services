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

package com.google.api.services.logging.v2.model;

/**
 * Complete log information about a single HTTP request to an App Engine application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestLog extends com.google.api.client.json.GenericJson {

  /**
   * App Engine release version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appEngineRelease;

  /**
   * Application that handled this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * An indication of the relative cost of serving this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double cost;

  /**
   * Time when the request finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Whether this request is finished or active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean finished;

  /**
   * Whether this is the first RequestLog entry for this request. If an active request has several
   * RequestLog entries written to Stackdriver Logging, then this field will be set for one of them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean first;

  /**
   * Internet host and port number of the resource being requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * HTTP version of request. Example: "HTTP/1.1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpVersion;

  /**
   * An identifier for the instance that handled the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * If the instance processing this request belongs to a manually scaled module, then this is the
   * 0-based index of the instance. Otherwise, this value is -1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer instanceIndex;

  /**
   * Origin IP address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ip;

  /**
   * Latency of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String latency;

  /**
   * A list of log lines emitted by the application while serving this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogLine> line;

  static {
    // hack to force ProGuard to consider LogLine used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LogLine.class);
  }

  /**
   * Number of CPU megacycles used to process request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long megaCycles;

  /**
   * Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * Module of the application that handled this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moduleId;

  /**
   * The logged-in user who made the request.Most likely, this is the part of the user's email
   * before the @ sign. The field value is the same for different requests from the same user, but
   * different users can have similar names. This information is also available to the application
   * via the App Engine Users API.This field will be populated starting with App Engine 1.9.21.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nickname;

  /**
   * Time this request spent in the pending request queue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String pendingTime;

  /**
   * Referrer URL of request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referrer;

  /**
   * Globally unique identifier for a request, which is based on the request start time. Request IDs
   * for requests which started later will compare greater as strings than those for requests which
   * started earlier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Contains the path and query portion of the URL that was requested. For example, if the URL was
   * "http://example.com/app?name=val", the resource would be "/app?name=val". The fragment
   * identifier, which is identified by the # character, is not included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * Size in bytes sent back to client by request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long responseSize;

  /**
   * Source code for the application that handled this request. There can be more than one source
   * reference per deployed application if source code is distributed among multiple repositories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceReference> sourceReference;

  /**
   * Stackdriver Trace span identifier for this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spanId;

  /**
   * Time when the request started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * HTTP response status code. Example: 200, 404.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * Task name of the request, in the case of an offline request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskName;

  /**
   * Queue name of the request, in the case of an offline request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskQueueName;

  /**
   * Stackdriver Trace identifier for this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String traceId;

  /**
   * If true, the value in the 'trace_id' field was sampled for storage in a trace backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean traceSampled;

  /**
   * File or class that handled the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlMapEntry;

  /**
   * User agent that made the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * Version of the application that handled this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionId;

  /**
   * Whether this was a loading request for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean wasLoadingRequest;

  /**
   * App Engine release version.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppEngineRelease() {
    return appEngineRelease;
  }

  /**
   * App Engine release version.
   * @param appEngineRelease appEngineRelease or {@code null} for none
   */
  public RequestLog setAppEngineRelease(java.lang.String appEngineRelease) {
    this.appEngineRelease = appEngineRelease;
    return this;
  }

  /**
   * Application that handled this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Application that handled this request.
   * @param appId appId or {@code null} for none
   */
  public RequestLog setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * An indication of the relative cost of serving this request.
   * @return value or {@code null} for none
   */
  public java.lang.Double getCost() {
    return cost;
  }

  /**
   * An indication of the relative cost of serving this request.
   * @param cost cost or {@code null} for none
   */
  public RequestLog setCost(java.lang.Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Time when the request finished.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Time when the request finished.
   * @param endTime endTime or {@code null} for none
   */
  public RequestLog setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Whether this request is finished or active.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFinished() {
    return finished;
  }

  /**
   * Whether this request is finished or active.
   * @param finished finished or {@code null} for none
   */
  public RequestLog setFinished(java.lang.Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Whether this is the first RequestLog entry for this request. If an active request has several
   * RequestLog entries written to Stackdriver Logging, then this field will be set for one of them.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFirst() {
    return first;
  }

  /**
   * Whether this is the first RequestLog entry for this request. If an active request has several
   * RequestLog entries written to Stackdriver Logging, then this field will be set for one of them.
   * @param first first or {@code null} for none
   */
  public RequestLog setFirst(java.lang.Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Internet host and port number of the resource being requested.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Internet host and port number of the resource being requested.
   * @param host host or {@code null} for none
   */
  public RequestLog setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * HTTP version of request. Example: "HTTP/1.1".
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpVersion() {
    return httpVersion;
  }

  /**
   * HTTP version of request. Example: "HTTP/1.1".
   * @param httpVersion httpVersion or {@code null} for none
   */
  public RequestLog setHttpVersion(java.lang.String httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

  /**
   * An identifier for the instance that handled the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * An identifier for the instance that handled the request.
   * @param instanceId instanceId or {@code null} for none
   */
  public RequestLog setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * If the instance processing this request belongs to a manually scaled module, then this is the
   * 0-based index of the instance. Otherwise, this value is -1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInstanceIndex() {
    return instanceIndex;
  }

  /**
   * If the instance processing this request belongs to a manually scaled module, then this is the
   * 0-based index of the instance. Otherwise, this value is -1.
   * @param instanceIndex instanceIndex or {@code null} for none
   */
  public RequestLog setInstanceIndex(java.lang.Integer instanceIndex) {
    this.instanceIndex = instanceIndex;
    return this;
  }

  /**
   * Origin IP address.
   * @return value or {@code null} for none
   */
  public java.lang.String getIp() {
    return ip;
  }

  /**
   * Origin IP address.
   * @param ip ip or {@code null} for none
   */
  public RequestLog setIp(java.lang.String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Latency of the request.
   * @return value or {@code null} for none
   */
  public String getLatency() {
    return latency;
  }

  /**
   * Latency of the request.
   * @param latency latency or {@code null} for none
   */
  public RequestLog setLatency(String latency) {
    this.latency = latency;
    return this;
  }

  /**
   * A list of log lines emitted by the application while serving this request.
   * @return value or {@code null} for none
   */
  public java.util.List<LogLine> getLine() {
    return line;
  }

  /**
   * A list of log lines emitted by the application while serving this request.
   * @param line line or {@code null} for none
   */
  public RequestLog setLine(java.util.List<LogLine> line) {
    this.line = line;
    return this;
  }

  /**
   * Number of CPU megacycles used to process request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMegaCycles() {
    return megaCycles;
  }

  /**
   * Number of CPU megacycles used to process request.
   * @param megaCycles megaCycles or {@code null} for none
   */
  public RequestLog setMegaCycles(java.lang.Long megaCycles) {
    this.megaCycles = megaCycles;
    return this;
  }

  /**
   * Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE".
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE".
   * @param method method or {@code null} for none
   */
  public RequestLog setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * Module of the application that handled this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getModuleId() {
    return moduleId;
  }

  /**
   * Module of the application that handled this request.
   * @param moduleId moduleId or {@code null} for none
   */
  public RequestLog setModuleId(java.lang.String moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  /**
   * The logged-in user who made the request.Most likely, this is the part of the user's email
   * before the @ sign. The field value is the same for different requests from the same user, but
   * different users can have similar names. This information is also available to the application
   * via the App Engine Users API.This field will be populated starting with App Engine 1.9.21.
   * @return value or {@code null} for none
   */
  public java.lang.String getNickname() {
    return nickname;
  }

  /**
   * The logged-in user who made the request.Most likely, this is the part of the user's email
   * before the @ sign. The field value is the same for different requests from the same user, but
   * different users can have similar names. This information is also available to the application
   * via the App Engine Users API.This field will be populated starting with App Engine 1.9.21.
   * @param nickname nickname or {@code null} for none
   */
  public RequestLog setNickname(java.lang.String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Time this request spent in the pending request queue.
   * @return value or {@code null} for none
   */
  public String getPendingTime() {
    return pendingTime;
  }

  /**
   * Time this request spent in the pending request queue.
   * @param pendingTime pendingTime or {@code null} for none
   */
  public RequestLog setPendingTime(String pendingTime) {
    this.pendingTime = pendingTime;
    return this;
  }

  /**
   * Referrer URL of request.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferrer() {
    return referrer;
  }

  /**
   * Referrer URL of request.
   * @param referrer referrer or {@code null} for none
   */
  public RequestLog setReferrer(java.lang.String referrer) {
    this.referrer = referrer;
    return this;
  }

  /**
   * Globally unique identifier for a request, which is based on the request start time. Request IDs
   * for requests which started later will compare greater as strings than those for requests which
   * started earlier.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Globally unique identifier for a request, which is based on the request start time. Request IDs
   * for requests which started later will compare greater as strings than those for requests which
   * started earlier.
   * @param requestId requestId or {@code null} for none
   */
  public RequestLog setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Contains the path and query portion of the URL that was requested. For example, if the URL was
   * "http://example.com/app?name=val", the resource would be "/app?name=val". The fragment
   * identifier, which is identified by the # character, is not included.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Contains the path and query portion of the URL that was requested. For example, if the URL was
   * "http://example.com/app?name=val", the resource would be "/app?name=val". The fragment
   * identifier, which is identified by the # character, is not included.
   * @param resource resource or {@code null} for none
   */
  public RequestLog setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Size in bytes sent back to client by request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResponseSize() {
    return responseSize;
  }

  /**
   * Size in bytes sent back to client by request.
   * @param responseSize responseSize or {@code null} for none
   */
  public RequestLog setResponseSize(java.lang.Long responseSize) {
    this.responseSize = responseSize;
    return this;
  }

  /**
   * Source code for the application that handled this request. There can be more than one source
   * reference per deployed application if source code is distributed among multiple repositories.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceReference> getSourceReference() {
    return sourceReference;
  }

  /**
   * Source code for the application that handled this request. There can be more than one source
   * reference per deployed application if source code is distributed among multiple repositories.
   * @param sourceReference sourceReference or {@code null} for none
   */
  public RequestLog setSourceReference(java.util.List<SourceReference> sourceReference) {
    this.sourceReference = sourceReference;
    return this;
  }

  /**
   * Stackdriver Trace span identifier for this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpanId() {
    return spanId;
  }

  /**
   * Stackdriver Trace span identifier for this request.
   * @param spanId spanId or {@code null} for none
   */
  public RequestLog setSpanId(java.lang.String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Time when the request started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time when the request started.
   * @param startTime startTime or {@code null} for none
   */
  public RequestLog setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * HTTP response status code. Example: 200, 404.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * HTTP response status code. Example: 200, 404.
   * @param status status or {@code null} for none
   */
  public RequestLog setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Task name of the request, in the case of an offline request.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskName() {
    return taskName;
  }

  /**
   * Task name of the request, in the case of an offline request.
   * @param taskName taskName or {@code null} for none
   */
  public RequestLog setTaskName(java.lang.String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Queue name of the request, in the case of an offline request.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskQueueName() {
    return taskQueueName;
  }

  /**
   * Queue name of the request, in the case of an offline request.
   * @param taskQueueName taskQueueName or {@code null} for none
   */
  public RequestLog setTaskQueueName(java.lang.String taskQueueName) {
    this.taskQueueName = taskQueueName;
    return this;
  }

  /**
   * Stackdriver Trace identifier for this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getTraceId() {
    return traceId;
  }

  /**
   * Stackdriver Trace identifier for this request.
   * @param traceId traceId or {@code null} for none
   */
  public RequestLog setTraceId(java.lang.String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * If true, the value in the 'trace_id' field was sampled for storage in a trace backend.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTraceSampled() {
    return traceSampled;
  }

  /**
   * If true, the value in the 'trace_id' field was sampled for storage in a trace backend.
   * @param traceSampled traceSampled or {@code null} for none
   */
  public RequestLog setTraceSampled(java.lang.Boolean traceSampled) {
    this.traceSampled = traceSampled;
    return this;
  }

  /**
   * File or class that handled the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlMapEntry() {
    return urlMapEntry;
  }

  /**
   * File or class that handled the request.
   * @param urlMapEntry urlMapEntry or {@code null} for none
   */
  public RequestLog setUrlMapEntry(java.lang.String urlMapEntry) {
    this.urlMapEntry = urlMapEntry;
    return this;
  }

  /**
   * User agent that made the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * User agent that made the request.
   * @param userAgent userAgent or {@code null} for none
   */
  public RequestLog setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Version of the application that handled this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionId() {
    return versionId;
  }

  /**
   * Version of the application that handled this request.
   * @param versionId versionId or {@code null} for none
   */
  public RequestLog setVersionId(java.lang.String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Whether this was a loading request for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWasLoadingRequest() {
    return wasLoadingRequest;
  }

  /**
   * Whether this was a loading request for the instance.
   * @param wasLoadingRequest wasLoadingRequest or {@code null} for none
   */
  public RequestLog setWasLoadingRequest(java.lang.Boolean wasLoadingRequest) {
    this.wasLoadingRequest = wasLoadingRequest;
    return this;
  }

  @Override
  public RequestLog set(String fieldName, Object value) {
    return (RequestLog) super.set(fieldName, value);
  }

  @Override
  public RequestLog clone() {
    return (RequestLog) super.clone();
  }

}
