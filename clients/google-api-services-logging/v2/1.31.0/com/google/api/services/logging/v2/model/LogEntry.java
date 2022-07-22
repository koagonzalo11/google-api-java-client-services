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
 * An individual entry in a log.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRequest httpRequest;

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which are removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.If the insert_id is omitted when writing a log entry, the
   * Logging API assigns its own unique identifier in this field.In queries, the insert_id is also
   * used to order log entries that have the same log_name and timestamp values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertId;

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> jsonPayload;

  /**
   * Optional. A map of key, value pairs that provides additional information about the log entry.
   * The labels can be user-defined or system-defined.User-defined labels are arbitrary key, value
   * pairs that you can use to classify logs.System-defined labels are defined by GCP services for
   * platform logs. They have two components - a service namespace component and the attribute name.
   * For example: compute.googleapis.com/resource_name.Cloud Logging truncates label keys that
   * exceed 512 B and label values that exceed 64 KB upon their associated log entry being written.
   * The truncation is indicated by an ellipsis at the end of the character string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may be used in place of PROJECT_ID. The project number is translated to its
   * corresponding PROJECT_ID internally and the log_name field will contain PROJECT_ID in queries
   * and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".[LOG_ID] must be
   * less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual, but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logName;

  /**
   * Output only. Deprecated. This field is not used by Logging. Any value written to it is cleared.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResourceMetadata metadata;

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntryOperation operation;

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.The following protocol buffer types are supported;
   * user-defined types are not supported:"type.googleapis.com/google.cloud.audit.AuditLog"
   * "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> protoPayload;

  /**
   * Output only. The time the log entry was received by Logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String receiveTimestamp;

  /**
   * Required. The monitored resource that produced this log entry.Example: a log entry that reports
   * a database error would be associated with the monitored resource designating the particular
   * database that reported the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource resource;

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntrySourceLocation sourceLocation;

  /**
   * Optional. The ID of the Cloud Trace (https://cloud.google.com/trace) span associated with the
   * current operation in which the log is being written. For example, if a span has the REST
   * resource name of "projects/some-project/traces/some-trace/spans/some-span-id", then the span_id
   * field is "some-span-id".A Span
   * (https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span)
   * represents a single operation within a trace. Whereas a trace may involve multiple different
   * microservices running on multiple different machines, a span generally corresponds to a single
   * logical operation being performed in a single instance of a microservice on one specific
   * machine. Spans are the nodes within the tree that is a trace.Applications that are instrumented
   * for tracing (https://cloud.google.com/trace/docs/setup) will generally assign a new, unique
   * span ID on each incoming request. It is also common to create and record additional spans
   * corresponding to internal processing elements as well as issuing requests to dependencies.The
   * span ID is expected to be a 16-character, hexadecimal encoding of an 8-byte array and should
   * not be zero. It should be unique within the trace and should, ideally, be generated in a manner
   * that is uniformly random.Example values: 000000000000004a 7a2190356c3fc94b 0000f00300090021
   * d39223e101960076
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spanId;

  /**
   * Optional. Information indicating this LogEntry is part of a sequence of multiple log entries
   * split from a single LogEntry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogSplit split;

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textPayload;

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries must have timestamps that don't exceed the logs retention period
   * (https://cloud.google.com/logging/quotas#logs_retention_periods) in the past, and that don't
   * exceed 24 hours in the future. Log entries outside those time boundaries aren't ingested by
   * Logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Optional. The REST resource name of the trace being written to Cloud Trace
   * (https://cloud.google.com/trace) in association with this log entry. For example, if your trace
   * data is stored in the Cloud project "my-trace-project" and if the service that is creating the
   * log entry receives a trace header that includes the trace ID "12345", then the service should
   * use "projects/my-tracing-project/traces/12345".The trace field provides the link between logs
   * and traces. By using this field, you can navigate from a log entry to a trace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trace;

  /**
   * Optional. The sampling decision of the trace associated with the log entry.True means that the
   * trace resource name in the trace field was sampled for storage in a trace backend. False means
   * that the trace was not sampled for storage when this log entry was written, or the sampling
   * decision was unknown at the time. A non-sampled trace value is still useful as a request
   * correlation identifier. The default is False.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean traceSampled;

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @return value or {@code null} for none
   */
  public HttpRequest getHttpRequest() {
    return httpRequest;
  }

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public LogEntry setHttpRequest(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which are removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.If the insert_id is omitted when writing a log entry, the
   * Logging API assigns its own unique identifier in this field.In queries, the insert_id is also
   * used to order log entries that have the same log_name and timestamp values.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertId() {
    return insertId;
  }

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which are removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.If the insert_id is omitted when writing a log entry, the
   * Logging API assigns its own unique identifier in this field.In queries, the insert_id is also
   * used to order log entries that have the same log_name and timestamp values.
   * @param insertId insertId or {@code null} for none
   */
  public LogEntry setInsertId(java.lang.String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getJsonPayload() {
    return jsonPayload;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @param jsonPayload jsonPayload or {@code null} for none
   */
  public LogEntry setJsonPayload(java.util.Map<String, java.lang.Object> jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

  /**
   * Optional. A map of key, value pairs that provides additional information about the log entry.
   * The labels can be user-defined or system-defined.User-defined labels are arbitrary key, value
   * pairs that you can use to classify logs.System-defined labels are defined by GCP services for
   * platform logs. They have two components - a service namespace component and the attribute name.
   * For example: compute.googleapis.com/resource_name.Cloud Logging truncates label keys that
   * exceed 512 B and label values that exceed 64 KB upon their associated log entry being written.
   * The truncation is indicated by an ellipsis at the end of the character string.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. A map of key, value pairs that provides additional information about the log entry.
   * The labels can be user-defined or system-defined.User-defined labels are arbitrary key, value
   * pairs that you can use to classify logs.System-defined labels are defined by GCP services for
   * platform logs. They have two components - a service namespace component and the attribute name.
   * For example: compute.googleapis.com/resource_name.Cloud Logging truncates label keys that
   * exceed 512 B and label values that exceed 64 KB upon their associated log entry being written.
   * The truncation is indicated by an ellipsis at the end of the character string.
   * @param labels labels or {@code null} for none
   */
  public LogEntry setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may be used in place of PROJECT_ID. The project number is translated to its
   * corresponding PROJECT_ID internally and the log_name field will contain PROJECT_ID in queries
   * and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".[LOG_ID] must be
   * less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual, but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogName() {
    return logName;
  }

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may be used in place of PROJECT_ID. The project number is translated to its
   * corresponding PROJECT_ID internally and the log_name field will contain PROJECT_ID in queries
   * and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".[LOG_ID] must be
   * less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual, but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * @param logName logName or {@code null} for none
   */
  public LogEntry setLogName(java.lang.String logName) {
    this.logName = logName;
    return this;
  }

  /**
   * Output only. Deprecated. This field is not used by Logging. Any value written to it is cleared.
   * @return value or {@code null} for none
   */
  public MonitoredResourceMetadata getMetadata() {
    return metadata;
  }

  /**
   * Output only. Deprecated. This field is not used by Logging. Any value written to it is cleared.
   * @param metadata metadata or {@code null} for none
   */
  public LogEntry setMetadata(MonitoredResourceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @return value or {@code null} for none
   */
  public LogEntryOperation getOperation() {
    return operation;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @param operation operation or {@code null} for none
   */
  public LogEntry setOperation(LogEntryOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.The following protocol buffer types are supported;
   * user-defined types are not supported:"type.googleapis.com/google.cloud.audit.AuditLog"
   * "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getProtoPayload() {
    return protoPayload;
  }

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.The following protocol buffer types are supported;
   * user-defined types are not supported:"type.googleapis.com/google.cloud.audit.AuditLog"
   * "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * @param protoPayload protoPayload or {@code null} for none
   */
  public LogEntry setProtoPayload(java.util.Map<String, java.lang.Object> protoPayload) {
    this.protoPayload = protoPayload;
    return this;
  }

  /**
   * Output only. The time the log entry was received by Logging.
   * @return value or {@code null} for none
   */
  public String getReceiveTimestamp() {
    return receiveTimestamp;
  }

  /**
   * Output only. The time the log entry was received by Logging.
   * @param receiveTimestamp receiveTimestamp or {@code null} for none
   */
  public LogEntry setReceiveTimestamp(String receiveTimestamp) {
    this.receiveTimestamp = receiveTimestamp;
    return this;
  }

  /**
   * Required. The monitored resource that produced this log entry.Example: a log entry that reports
   * a database error would be associated with the monitored resource designating the particular
   * database that reported the error.
   * @return value or {@code null} for none
   */
  public MonitoredResource getResource() {
    return resource;
  }

  /**
   * Required. The monitored resource that produced this log entry.Example: a log entry that reports
   * a database error would be associated with the monitored resource designating the particular
   * database that reported the error.
   * @param resource resource or {@code null} for none
   */
  public LogEntry setResource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * @param severity severity or {@code null} for none
   */
  public LogEntry setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @return value or {@code null} for none
   */
  public LogEntrySourceLocation getSourceLocation() {
    return sourceLocation;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @param sourceLocation sourceLocation or {@code null} for none
   */
  public LogEntry setSourceLocation(LogEntrySourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * Optional. The ID of the Cloud Trace (https://cloud.google.com/trace) span associated with the
   * current operation in which the log is being written. For example, if a span has the REST
   * resource name of "projects/some-project/traces/some-trace/spans/some-span-id", then the span_id
   * field is "some-span-id".A Span
   * (https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span)
   * represents a single operation within a trace. Whereas a trace may involve multiple different
   * microservices running on multiple different machines, a span generally corresponds to a single
   * logical operation being performed in a single instance of a microservice on one specific
   * machine. Spans are the nodes within the tree that is a trace.Applications that are instrumented
   * for tracing (https://cloud.google.com/trace/docs/setup) will generally assign a new, unique
   * span ID on each incoming request. It is also common to create and record additional spans
   * corresponding to internal processing elements as well as issuing requests to dependencies.The
   * span ID is expected to be a 16-character, hexadecimal encoding of an 8-byte array and should
   * not be zero. It should be unique within the trace and should, ideally, be generated in a manner
   * that is uniformly random.Example values: 000000000000004a 7a2190356c3fc94b 0000f00300090021
   * d39223e101960076
   * @return value or {@code null} for none
   */
  public java.lang.String getSpanId() {
    return spanId;
  }

  /**
   * Optional. The ID of the Cloud Trace (https://cloud.google.com/trace) span associated with the
   * current operation in which the log is being written. For example, if a span has the REST
   * resource name of "projects/some-project/traces/some-trace/spans/some-span-id", then the span_id
   * field is "some-span-id".A Span
   * (https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span)
   * represents a single operation within a trace. Whereas a trace may involve multiple different
   * microservices running on multiple different machines, a span generally corresponds to a single
   * logical operation being performed in a single instance of a microservice on one specific
   * machine. Spans are the nodes within the tree that is a trace.Applications that are instrumented
   * for tracing (https://cloud.google.com/trace/docs/setup) will generally assign a new, unique
   * span ID on each incoming request. It is also common to create and record additional spans
   * corresponding to internal processing elements as well as issuing requests to dependencies.The
   * span ID is expected to be a 16-character, hexadecimal encoding of an 8-byte array and should
   * not be zero. It should be unique within the trace and should, ideally, be generated in a manner
   * that is uniformly random.Example values: 000000000000004a 7a2190356c3fc94b 0000f00300090021
   * d39223e101960076
   * @param spanId spanId or {@code null} for none
   */
  public LogEntry setSpanId(java.lang.String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Optional. Information indicating this LogEntry is part of a sequence of multiple log entries
   * split from a single LogEntry.
   * @return value or {@code null} for none
   */
  public LogSplit getSplit() {
    return split;
  }

  /**
   * Optional. Information indicating this LogEntry is part of a sequence of multiple log entries
   * split from a single LogEntry.
   * @param split split or {@code null} for none
   */
  public LogEntry setSplit(LogSplit split) {
    this.split = split;
    return this;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @return value or {@code null} for none
   */
  public java.lang.String getTextPayload() {
    return textPayload;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @param textPayload textPayload or {@code null} for none
   */
  public LogEntry setTextPayload(java.lang.String textPayload) {
    this.textPayload = textPayload;
    return this;
  }

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries must have timestamps that don't exceed the logs retention period
   * (https://cloud.google.com/logging/quotas#logs_retention_periods) in the past, and that don't
   * exceed 24 hours in the future. Log entries outside those time boundaries aren't ingested by
   * Logging.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries must have timestamps that don't exceed the logs retention period
   * (https://cloud.google.com/logging/quotas#logs_retention_periods) in the past, and that don't
   * exceed 24 hours in the future. Log entries outside those time boundaries aren't ingested by
   * Logging.
   * @param timestamp timestamp or {@code null} for none
   */
  public LogEntry setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Optional. The REST resource name of the trace being written to Cloud Trace
   * (https://cloud.google.com/trace) in association with this log entry. For example, if your trace
   * data is stored in the Cloud project "my-trace-project" and if the service that is creating the
   * log entry receives a trace header that includes the trace ID "12345", then the service should
   * use "projects/my-tracing-project/traces/12345".The trace field provides the link between logs
   * and traces. By using this field, you can navigate from a log entry to a trace.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrace() {
    return trace;
  }

  /**
   * Optional. The REST resource name of the trace being written to Cloud Trace
   * (https://cloud.google.com/trace) in association with this log entry. For example, if your trace
   * data is stored in the Cloud project "my-trace-project" and if the service that is creating the
   * log entry receives a trace header that includes the trace ID "12345", then the service should
   * use "projects/my-tracing-project/traces/12345".The trace field provides the link between logs
   * and traces. By using this field, you can navigate from a log entry to a trace.
   * @param trace trace or {@code null} for none
   */
  public LogEntry setTrace(java.lang.String trace) {
    this.trace = trace;
    return this;
  }

  /**
   * Optional. The sampling decision of the trace associated with the log entry.True means that the
   * trace resource name in the trace field was sampled for storage in a trace backend. False means
   * that the trace was not sampled for storage when this log entry was written, or the sampling
   * decision was unknown at the time. A non-sampled trace value is still useful as a request
   * correlation identifier. The default is False.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTraceSampled() {
    return traceSampled;
  }

  /**
   * Optional. The sampling decision of the trace associated with the log entry.True means that the
   * trace resource name in the trace field was sampled for storage in a trace backend. False means
   * that the trace was not sampled for storage when this log entry was written, or the sampling
   * decision was unknown at the time. A non-sampled trace value is still useful as a request
   * correlation identifier. The default is False.
   * @param traceSampled traceSampled or {@code null} for none
   */
  public LogEntry setTraceSampled(java.lang.Boolean traceSampled) {
    this.traceSampled = traceSampled;
    return this;
  }

  @Override
  public LogEntry set(String fieldName, Object value) {
    return (LogEntry) super.set(fieldName, value);
  }

  @Override
  public LogEntry clone() {
    return (LogEntry) super.clone();
  }

}
