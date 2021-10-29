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

package com.google.api.services.monitoring.v1.model;

/**
 * QueryRangeRequest holds all parameters of the Prometheus upstream range query API plus GCM
 * specific parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryRangeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String end;

  /**
   * A PromQL query string. Query lanauge documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String start;

  /**
   * The resolution of query result. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String step;

  /**
   * An upper bound timeout for the query. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeout;

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnd() {
    return end;
  }

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @param end end or {@code null} for none
   */
  public QueryRangeRequest setEnd(java.lang.String end) {
    this.end = end;
    return this;
  }

  /**
   * A PromQL query string. Query lanauge documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * A PromQL query string. Query lanauge documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * @param query query or {@code null} for none
   */
  public QueryRangeRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getStart() {
    return start;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @param start start or {@code null} for none
   */
  public QueryRangeRequest setStart(java.lang.String start) {
    this.start = start;
    return this;
  }

  /**
   * The resolution of query result. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getStep() {
    return step;
  }

  /**
   * The resolution of query result. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * @param step step or {@code null} for none
   */
  public QueryRangeRequest setStep(java.lang.String step) {
    this.step = step;
    return this;
  }

  /**
   * An upper bound timeout for the query. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeout() {
    return timeout;
  }

  /**
   * An upper bound timeout for the query. Either a Prometheus duration string
   * (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating
   * point seconds. This non-standard encoding must be used for compatibility with the open source
   * API. Clients may still implement timeouts at the connection level while ignoring this field.
   * @param timeout timeout or {@code null} for none
   */
  public QueryRangeRequest setTimeout(java.lang.String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public QueryRangeRequest set(String fieldName, Object value) {
    return (QueryRangeRequest) super.set(fieldName, value);
  }

  @Override
  public QueryRangeRequest clone() {
    return (QueryRangeRequest) super.clone();
  }

}
