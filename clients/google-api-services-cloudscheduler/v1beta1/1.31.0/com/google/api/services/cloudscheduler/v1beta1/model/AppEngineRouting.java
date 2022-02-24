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

package com.google.api.services.cloudscheduler.v1beta1.model;

/**
 * App Engine Routing. For more information about services, versions, and instances see [An Overview
 * of App Engine](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine),
 * [Microservices Architecture on Google App Engine](https://cloud.google.com/appengine/docs/python
 * /microservices-on-app-engine), [App Engine Standard request
 * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed), and
 * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
 * requests-are-routed).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineRouting extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The host that the job is sent to. For more information about how App Engine
   * requests are routed, see [here](https://cloud.google.com/appengine/docs/standard/python/how-
   * requests-are-routed). The host is constructed as: * `host = [application_domain_name]` `|
   * [service] + '.' + [application_domain_name]` `| [version] + '.' + [application_domain_name]` `|
   * [version_dot_service]+ '.' + [application_domain_name]` `| [instance] + '.' +
   * [application_domain_name]` `| [instance_dot_service] + '.' + [application_domain_name]` `|
   * [instance_dot_version] + '.' + [application_domain_name]` `| [instance_dot_version_dot_service]
   * + '.' + [application_domain_name]` * `application_domain_name` = The domain name of the app,
   * for example .appspot.com, which is associated with the job's project ID. * `service =` service
   * * `version =` version * `version_dot_service =` version `+ '.' +` service * `instance =`
   * instance * `instance_dot_service =` instance `+ '.' +` service * `instance_dot_version =`
   * instance `+ '.' +` version * `instance_dot_version_dot_service =` instance `+ '.' +` version `+
   * '.' +` service If service is empty, then the job will be sent to the service which is the
   * default service when the job is attempted. If version is empty, then the job will be sent to
   * the version which is the default version when the job is attempted. If instance is empty, then
   * the job will be sent to an instance which is available when the job is attempted. If service,
   * version, or instance is invalid, then the job will be sent to the default version of the
   * default service when the job is attempted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * App instance. By default, the job is sent to an instance which is available when the job is
   * attempted. Requests can only be sent to a specific instance if [manual scaling is used in App
   * Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?#scaling_types_and_instance_classes). App Engine Flex does not support instances. For
   * more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * App service. By default, the job is sent to the service which is the default service when the
   * job is attempted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * App version. By default, the job is sent to the version which is the default version when the
   * job is attempted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. The host that the job is sent to. For more information about how App Engine
   * requests are routed, see [here](https://cloud.google.com/appengine/docs/standard/python/how-
   * requests-are-routed). The host is constructed as: * `host = [application_domain_name]` `|
   * [service] + '.' + [application_domain_name]` `| [version] + '.' + [application_domain_name]` `|
   * [version_dot_service]+ '.' + [application_domain_name]` `| [instance] + '.' +
   * [application_domain_name]` `| [instance_dot_service] + '.' + [application_domain_name]` `|
   * [instance_dot_version] + '.' + [application_domain_name]` `| [instance_dot_version_dot_service]
   * + '.' + [application_domain_name]` * `application_domain_name` = The domain name of the app,
   * for example .appspot.com, which is associated with the job's project ID. * `service =` service
   * * `version =` version * `version_dot_service =` version `+ '.' +` service * `instance =`
   * instance * `instance_dot_service =` instance `+ '.' +` service * `instance_dot_version =`
   * instance `+ '.' +` version * `instance_dot_version_dot_service =` instance `+ '.' +` version `+
   * '.' +` service If service is empty, then the job will be sent to the service which is the
   * default service when the job is attempted. If version is empty, then the job will be sent to
   * the version which is the default version when the job is attempted. If instance is empty, then
   * the job will be sent to an instance which is available when the job is attempted. If service,
   * version, or instance is invalid, then the job will be sent to the default version of the
   * default service when the job is attempted.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. The host that the job is sent to. For more information about how App Engine
   * requests are routed, see [here](https://cloud.google.com/appengine/docs/standard/python/how-
   * requests-are-routed). The host is constructed as: * `host = [application_domain_name]` `|
   * [service] + '.' + [application_domain_name]` `| [version] + '.' + [application_domain_name]` `|
   * [version_dot_service]+ '.' + [application_domain_name]` `| [instance] + '.' +
   * [application_domain_name]` `| [instance_dot_service] + '.' + [application_domain_name]` `|
   * [instance_dot_version] + '.' + [application_domain_name]` `| [instance_dot_version_dot_service]
   * + '.' + [application_domain_name]` * `application_domain_name` = The domain name of the app,
   * for example .appspot.com, which is associated with the job's project ID. * `service =` service
   * * `version =` version * `version_dot_service =` version `+ '.' +` service * `instance =`
   * instance * `instance_dot_service =` instance `+ '.' +` service * `instance_dot_version =`
   * instance `+ '.' +` version * `instance_dot_version_dot_service =` instance `+ '.' +` version `+
   * '.' +` service If service is empty, then the job will be sent to the service which is the
   * default service when the job is attempted. If version is empty, then the job will be sent to
   * the version which is the default version when the job is attempted. If instance is empty, then
   * the job will be sent to an instance which is available when the job is attempted. If service,
   * version, or instance is invalid, then the job will be sent to the default version of the
   * default service when the job is attempted.
   * @param host host or {@code null} for none
   */
  public AppEngineRouting setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * App instance. By default, the job is sent to an instance which is available when the job is
   * attempted. Requests can only be sent to a specific instance if [manual scaling is used in App
   * Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?#scaling_types_and_instance_classes). App Engine Flex does not support instances. For
   * more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * App instance. By default, the job is sent to an instance which is available when the job is
   * attempted. Requests can only be sent to a specific instance if [manual scaling is used in App
   * Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?#scaling_types_and_instance_classes). App Engine Flex does not support instances. For
   * more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * @param instance instance or {@code null} for none
   */
  public AppEngineRouting setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * App service. By default, the job is sent to the service which is the default service when the
   * job is attempted.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * App service. By default, the job is sent to the service which is the default service when the
   * job is attempted.
   * @param service service or {@code null} for none
   */
  public AppEngineRouting setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * App version. By default, the job is sent to the version which is the default version when the
   * job is attempted.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * App version. By default, the job is sent to the version which is the default version when the
   * job is attempted.
   * @param version version or {@code null} for none
   */
  public AppEngineRouting setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public AppEngineRouting set(String fieldName, Object value) {
    return (AppEngineRouting) super.set(fieldName, value);
  }

  @Override
  public AppEngineRouting clone() {
    return (AppEngineRouting) super.clone();
  }

}
