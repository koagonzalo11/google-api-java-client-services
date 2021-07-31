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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * A definition of a matcher that selects endpoints to which the policies should be applied.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EndpointMatcher extends com.google.api.client.json.GenericJson {

  /**
   * The matcher is based on node metadata presented by xDS clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetadataLabelMatcher metadataLabelMatcher;

  /**
   * The matcher is based on node metadata presented by xDS clients.
   * @return value or {@code null} for none
   */
  public MetadataLabelMatcher getMetadataLabelMatcher() {
    return metadataLabelMatcher;
  }

  /**
   * The matcher is based on node metadata presented by xDS clients.
   * @param metadataLabelMatcher metadataLabelMatcher or {@code null} for none
   */
  public EndpointMatcher setMetadataLabelMatcher(MetadataLabelMatcher metadataLabelMatcher) {
    this.metadataLabelMatcher = metadataLabelMatcher;
    return this;
  }

  @Override
  public EndpointMatcher set(String fieldName, Object value) {
    return (EndpointMatcher) super.set(fieldName, value);
  }

  @Override
  public EndpointMatcher clone() {
    return (EndpointMatcher) super.clone();
  }

}
