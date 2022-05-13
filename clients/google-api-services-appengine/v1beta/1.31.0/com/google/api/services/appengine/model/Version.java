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

package com.google.api.services.appengine.model;

/**
 * A Version resource is a specific set of source code and configuration files that are deployed
 * into a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Version extends com.google.api.client.json.GenericJson {

  /**
   * Serving configuration for Google Cloud Endpoints
   * (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if
   * view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApiConfigHandler apiConfig;

  /**
   * Allows App Engine second generation runtimes to access the legacy bundled services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean appEngineApis;

  /**
   * Automatic scaling is based on request rate, response latencies, and other application metrics.
   * Instances are dynamically created and destroyed as needed in order to handle traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomaticScaling automaticScaling;

  /**
   * A service with basic scaling will create an instance when the application receives a request.
   * The instance will be turned down when the app becomes idle. Basic scaling is ideal for work
   * that is intermittent or driven by user activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicScaling basicScaling;

  /**
   * Metadata settings that are supplied to this version to enable beta runtime features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> betaSettings;

  /**
   * Environment variables available to the build environment.Only returned in GET requests if
   * view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> buildEnvVariables;

  /**
   * Time that this version was created.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Email address of the user who created this version.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createdBy;

  /**
   * Duration that static files should be cached by web proxies and browsers. Only applicable if the
   * corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-
   * api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own
   * expiration time.Only returned in GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String defaultExpiration;

  /**
   * Code and application artifacts that make up this version.Only returned in GET requests if
   * view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Deployment deployment;

  /**
   * Total size in bytes of all the files that are included in this version and currently hosted on
   * the App Engine disk.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskUsageBytes;

  /**
   * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible
   * Service Proxy will be provided to serve the API implemented by the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndpointsApiService endpointsApiService;

  /**
   * The entrypoint for the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entrypoint entrypoint;

  /**
   * App Engine execution environment for this version.Defaults to standard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String env;

  /**
   * Environment variables available to the application.Only returned in GET requests if view=FULL
   * is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> envVariables;

  /**
   * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL
   * is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorHandler> errorHandlers;

  static {
    // hack to force ProGuard to consider ErrorHandler used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorHandler.class);
  }

  /**
   * An ordered list of URL-matching patterns that should be applied to incoming requests. The first
   * matching URL handles the request and other request handlers are not attempted.Only returned in
   * GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UrlMap> handlers;

  static {
    // hack to force ProGuard to consider UrlMap used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(UrlMap.class);
  }

  /**
   * Configures health checking for instances. Unhealthy instances are stopped and replaced with new
   * instances. Only applicable in the App Engine flexible environment.Only returned in GET requests
   * if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HealthCheck healthCheck;

  /**
   * Relative name of the version within the service. Example: v1. Version names can contain only
   * lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with
   * the prefix "ah-".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Before an application can receive email or XMPP messages, the application must be configured to
   * enable the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inboundServices;

  /**
   * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2,
   * F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for
   * AutomaticScaling and B1 for ManualScaling or BasicScaling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceClass;

  /**
   * Configuration for third-party Python runtime libraries that are required by the
   * application.Only returned in GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Library> libraries;

  static {
    // hack to force ProGuard to consider Library used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Library.class);
  }

  /**
   * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced
   * with new instancesOnly returned in GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LivenessCheck livenessCheck;

  /**
   * A service with manual scaling runs continuously, allowing you to perform complex initialization
   * and rely on the state of its memory over time. Manually scaled versions are sometimes referred
   * to as "backends".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManualScaling manualScaling;

  /**
   * Full path to the Version resource in the API. Example:
   * apps/myapp/services/default/versions/v1.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Extra network settings. Only applicable in the App Engine flexible environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Network network;

  /**
   * Files that match this pattern will not be built into this version. Only applicable for Go
   * runtimes.Only returned in GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nobuildFilesRegex;

  /**
   * Configures readiness health checking for instances. Unhealthy instances are not put into the
   * backend traffic rotation.Only returned in GET requests if view=FULL is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReadinessCheck readinessCheck;

  /**
   * Machine resources for this version. Only applicable in the App Engine flexible environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resources resources;

  /**
   * Desired runtime. Example: python27.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtime;

  /**
   * The version of the API in the given runtime environment. Please see the app.yaml reference for
   * valid values at https://cloud.google.com/appengine/docs/standard//config/appref
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeApiVersion;

  /**
   * The channel of the runtime to use. Only available for some runtimes. Defaults to the default
   * channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeChannel;

  /**
   * The path or name of the app's main executable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeMainExecutablePath;

  /**
   * The identity that the deployed version will run as. Admin API will use the App Engine Appspot
   * service account as default if this field is neither provided in app.yaml file nor through CLI
   * flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Current serving status of this version. Only the versions with a SERVING status create
   * instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to
   * SERVING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingStatus;

  /**
   * Whether multiple requests can be dispatched to this version at once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean threadsafe;

  /**
   * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-
   * myapp.appspot.com"@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionUrl;

  /**
   * Whether to deploy this version in a container on a virtual machine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vm;

  /**
   * Enables VPC connectivity for standard apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VpcAccessConnector vpcAccessConnector;

  /**
   * The Google Compute Engine zones that are supported by this version in the App Engine flexible
   * environment. Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> zones;

  /**
   * Serving configuration for Google Cloud Endpoints
   * (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if
   * view=FULL is set.
   * @return value or {@code null} for none
   */
  public ApiConfigHandler getApiConfig() {
    return apiConfig;
  }

  /**
   * Serving configuration for Google Cloud Endpoints
   * (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if
   * view=FULL is set.
   * @param apiConfig apiConfig or {@code null} for none
   */
  public Version setApiConfig(ApiConfigHandler apiConfig) {
    this.apiConfig = apiConfig;
    return this;
  }

  /**
   * Allows App Engine second generation runtimes to access the legacy bundled services.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAppEngineApis() {
    return appEngineApis;
  }

  /**
   * Allows App Engine second generation runtimes to access the legacy bundled services.
   * @param appEngineApis appEngineApis or {@code null} for none
   */
  public Version setAppEngineApis(java.lang.Boolean appEngineApis) {
    this.appEngineApis = appEngineApis;
    return this;
  }

  /**
   * Automatic scaling is based on request rate, response latencies, and other application metrics.
   * Instances are dynamically created and destroyed as needed in order to handle traffic.
   * @return value or {@code null} for none
   */
  public AutomaticScaling getAutomaticScaling() {
    return automaticScaling;
  }

  /**
   * Automatic scaling is based on request rate, response latencies, and other application metrics.
   * Instances are dynamically created and destroyed as needed in order to handle traffic.
   * @param automaticScaling automaticScaling or {@code null} for none
   */
  public Version setAutomaticScaling(AutomaticScaling automaticScaling) {
    this.automaticScaling = automaticScaling;
    return this;
  }

  /**
   * A service with basic scaling will create an instance when the application receives a request.
   * The instance will be turned down when the app becomes idle. Basic scaling is ideal for work
   * that is intermittent or driven by user activity.
   * @return value or {@code null} for none
   */
  public BasicScaling getBasicScaling() {
    return basicScaling;
  }

  /**
   * A service with basic scaling will create an instance when the application receives a request.
   * The instance will be turned down when the app becomes idle. Basic scaling is ideal for work
   * that is intermittent or driven by user activity.
   * @param basicScaling basicScaling or {@code null} for none
   */
  public Version setBasicScaling(BasicScaling basicScaling) {
    this.basicScaling = basicScaling;
    return this;
  }

  /**
   * Metadata settings that are supplied to this version to enable beta runtime features.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getBetaSettings() {
    return betaSettings;
  }

  /**
   * Metadata settings that are supplied to this version to enable beta runtime features.
   * @param betaSettings betaSettings or {@code null} for none
   */
  public Version setBetaSettings(java.util.Map<String, java.lang.String> betaSettings) {
    this.betaSettings = betaSettings;
    return this;
  }

  /**
   * Environment variables available to the build environment.Only returned in GET requests if
   * view=FULL is set.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getBuildEnvVariables() {
    return buildEnvVariables;
  }

  /**
   * Environment variables available to the build environment.Only returned in GET requests if
   * view=FULL is set.
   * @param buildEnvVariables buildEnvVariables or {@code null} for none
   */
  public Version setBuildEnvVariables(java.util.Map<String, java.lang.String> buildEnvVariables) {
    this.buildEnvVariables = buildEnvVariables;
    return this;
  }

  /**
   * Time that this version was created.@OutputOnly
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time that this version was created.@OutputOnly
   * @param createTime createTime or {@code null} for none
   */
  public Version setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Email address of the user who created this version.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatedBy() {
    return createdBy;
  }

  /**
   * Email address of the user who created this version.@OutputOnly
   * @param createdBy createdBy or {@code null} for none
   */
  public Version setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Duration that static files should be cached by web proxies and browsers. Only applicable if the
   * corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-
   * api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own
   * expiration time.Only returned in GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public String getDefaultExpiration() {
    return defaultExpiration;
  }

  /**
   * Duration that static files should be cached by web proxies and browsers. Only applicable if the
   * corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-
   * api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own
   * expiration time.Only returned in GET requests if view=FULL is set.
   * @param defaultExpiration defaultExpiration or {@code null} for none
   */
  public Version setDefaultExpiration(String defaultExpiration) {
    this.defaultExpiration = defaultExpiration;
    return this;
  }

  /**
   * Code and application artifacts that make up this version.Only returned in GET requests if
   * view=FULL is set.
   * @return value or {@code null} for none
   */
  public Deployment getDeployment() {
    return deployment;
  }

  /**
   * Code and application artifacts that make up this version.Only returned in GET requests if
   * view=FULL is set.
   * @param deployment deployment or {@code null} for none
   */
  public Version setDeployment(Deployment deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Total size in bytes of all the files that are included in this version and currently hosted on
   * the App Engine disk.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskUsageBytes() {
    return diskUsageBytes;
  }

  /**
   * Total size in bytes of all the files that are included in this version and currently hosted on
   * the App Engine disk.@OutputOnly
   * @param diskUsageBytes diskUsageBytes or {@code null} for none
   */
  public Version setDiskUsageBytes(java.lang.Long diskUsageBytes) {
    this.diskUsageBytes = diskUsageBytes;
    return this;
  }

  /**
   * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible
   * Service Proxy will be provided to serve the API implemented by the app.
   * @return value or {@code null} for none
   */
  public EndpointsApiService getEndpointsApiService() {
    return endpointsApiService;
  }

  /**
   * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible
   * Service Proxy will be provided to serve the API implemented by the app.
   * @param endpointsApiService endpointsApiService or {@code null} for none
   */
  public Version setEndpointsApiService(EndpointsApiService endpointsApiService) {
    this.endpointsApiService = endpointsApiService;
    return this;
  }

  /**
   * The entrypoint for the application.
   * @return value or {@code null} for none
   */
  public Entrypoint getEntrypoint() {
    return entrypoint;
  }

  /**
   * The entrypoint for the application.
   * @param entrypoint entrypoint or {@code null} for none
   */
  public Version setEntrypoint(Entrypoint entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * App Engine execution environment for this version.Defaults to standard.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnv() {
    return env;
  }

  /**
   * App Engine execution environment for this version.Defaults to standard.
   * @param env env or {@code null} for none
   */
  public Version setEnv(java.lang.String env) {
    this.env = env;
    return this;
  }

  /**
   * Environment variables available to the application.Only returned in GET requests if view=FULL
   * is set.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvVariables() {
    return envVariables;
  }

  /**
   * Environment variables available to the application.Only returned in GET requests if view=FULL
   * is set.
   * @param envVariables envVariables or {@code null} for none
   */
  public Version setEnvVariables(java.util.Map<String, java.lang.String> envVariables) {
    this.envVariables = envVariables;
    return this;
  }

  /**
   * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL
   * is set.
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorHandler> getErrorHandlers() {
    return errorHandlers;
  }

  /**
   * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL
   * is set.
   * @param errorHandlers errorHandlers or {@code null} for none
   */
  public Version setErrorHandlers(java.util.List<ErrorHandler> errorHandlers) {
    this.errorHandlers = errorHandlers;
    return this;
  }

  /**
   * An ordered list of URL-matching patterns that should be applied to incoming requests. The first
   * matching URL handles the request and other request handlers are not attempted.Only returned in
   * GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public java.util.List<UrlMap> getHandlers() {
    return handlers;
  }

  /**
   * An ordered list of URL-matching patterns that should be applied to incoming requests. The first
   * matching URL handles the request and other request handlers are not attempted.Only returned in
   * GET requests if view=FULL is set.
   * @param handlers handlers or {@code null} for none
   */
  public Version setHandlers(java.util.List<UrlMap> handlers) {
    this.handlers = handlers;
    return this;
  }

  /**
   * Configures health checking for instances. Unhealthy instances are stopped and replaced with new
   * instances. Only applicable in the App Engine flexible environment.Only returned in GET requests
   * if view=FULL is set.
   * @return value or {@code null} for none
   */
  public HealthCheck getHealthCheck() {
    return healthCheck;
  }

  /**
   * Configures health checking for instances. Unhealthy instances are stopped and replaced with new
   * instances. Only applicable in the App Engine flexible environment.Only returned in GET requests
   * if view=FULL is set.
   * @param healthCheck healthCheck or {@code null} for none
   */
  public Version setHealthCheck(HealthCheck healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  /**
   * Relative name of the version within the service. Example: v1. Version names can contain only
   * lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with
   * the prefix "ah-".
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Relative name of the version within the service. Example: v1. Version names can contain only
   * lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with
   * the prefix "ah-".
   * @param id id or {@code null} for none
   */
  public Version setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Before an application can receive email or XMPP messages, the application must be configured to
   * enable the service.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInboundServices() {
    return inboundServices;
  }

  /**
   * Before an application can receive email or XMPP messages, the application must be configured to
   * enable the service.
   * @param inboundServices inboundServices or {@code null} for none
   */
  public Version setInboundServices(java.util.List<java.lang.String> inboundServices) {
    this.inboundServices = inboundServices;
    return this;
  }

  /**
   * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2,
   * F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for
   * AutomaticScaling and B1 for ManualScaling or BasicScaling.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceClass() {
    return instanceClass;
  }

  /**
   * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2,
   * F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for
   * AutomaticScaling and B1 for ManualScaling or BasicScaling.
   * @param instanceClass instanceClass or {@code null} for none
   */
  public Version setInstanceClass(java.lang.String instanceClass) {
    this.instanceClass = instanceClass;
    return this;
  }

  /**
   * Configuration for third-party Python runtime libraries that are required by the
   * application.Only returned in GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public java.util.List<Library> getLibraries() {
    return libraries;
  }

  /**
   * Configuration for third-party Python runtime libraries that are required by the
   * application.Only returned in GET requests if view=FULL is set.
   * @param libraries libraries or {@code null} for none
   */
  public Version setLibraries(java.util.List<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  /**
   * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced
   * with new instancesOnly returned in GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public LivenessCheck getLivenessCheck() {
    return livenessCheck;
  }

  /**
   * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced
   * with new instancesOnly returned in GET requests if view=FULL is set.
   * @param livenessCheck livenessCheck or {@code null} for none
   */
  public Version setLivenessCheck(LivenessCheck livenessCheck) {
    this.livenessCheck = livenessCheck;
    return this;
  }

  /**
   * A service with manual scaling runs continuously, allowing you to perform complex initialization
   * and rely on the state of its memory over time. Manually scaled versions are sometimes referred
   * to as "backends".
   * @return value or {@code null} for none
   */
  public ManualScaling getManualScaling() {
    return manualScaling;
  }

  /**
   * A service with manual scaling runs continuously, allowing you to perform complex initialization
   * and rely on the state of its memory over time. Manually scaled versions are sometimes referred
   * to as "backends".
   * @param manualScaling manualScaling or {@code null} for none
   */
  public Version setManualScaling(ManualScaling manualScaling) {
    this.manualScaling = manualScaling;
    return this;
  }

  /**
   * Full path to the Version resource in the API. Example:
   * apps/myapp/services/default/versions/v1.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full path to the Version resource in the API. Example:
   * apps/myapp/services/default/versions/v1.@OutputOnly
   * @param name name or {@code null} for none
   */
  public Version setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Extra network settings. Only applicable in the App Engine flexible environment.
   * @return value or {@code null} for none
   */
  public Network getNetwork() {
    return network;
  }

  /**
   * Extra network settings. Only applicable in the App Engine flexible environment.
   * @param network network or {@code null} for none
   */
  public Version setNetwork(Network network) {
    this.network = network;
    return this;
  }

  /**
   * Files that match this pattern will not be built into this version. Only applicable for Go
   * runtimes.Only returned in GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNobuildFilesRegex() {
    return nobuildFilesRegex;
  }

  /**
   * Files that match this pattern will not be built into this version. Only applicable for Go
   * runtimes.Only returned in GET requests if view=FULL is set.
   * @param nobuildFilesRegex nobuildFilesRegex or {@code null} for none
   */
  public Version setNobuildFilesRegex(java.lang.String nobuildFilesRegex) {
    this.nobuildFilesRegex = nobuildFilesRegex;
    return this;
  }

  /**
   * Configures readiness health checking for instances. Unhealthy instances are not put into the
   * backend traffic rotation.Only returned in GET requests if view=FULL is set.
   * @return value or {@code null} for none
   */
  public ReadinessCheck getReadinessCheck() {
    return readinessCheck;
  }

  /**
   * Configures readiness health checking for instances. Unhealthy instances are not put into the
   * backend traffic rotation.Only returned in GET requests if view=FULL is set.
   * @param readinessCheck readinessCheck or {@code null} for none
   */
  public Version setReadinessCheck(ReadinessCheck readinessCheck) {
    this.readinessCheck = readinessCheck;
    return this;
  }

  /**
   * Machine resources for this version. Only applicable in the App Engine flexible environment.
   * @return value or {@code null} for none
   */
  public Resources getResources() {
    return resources;
  }

  /**
   * Machine resources for this version. Only applicable in the App Engine flexible environment.
   * @param resources resources or {@code null} for none
   */
  public Version setResources(Resources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Desired runtime. Example: python27.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntime() {
    return runtime;
  }

  /**
   * Desired runtime. Example: python27.
   * @param runtime runtime or {@code null} for none
   */
  public Version setRuntime(java.lang.String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * The version of the API in the given runtime environment. Please see the app.yaml reference for
   * valid values at https://cloud.google.com/appengine/docs/standard//config/appref
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeApiVersion() {
    return runtimeApiVersion;
  }

  /**
   * The version of the API in the given runtime environment. Please see the app.yaml reference for
   * valid values at https://cloud.google.com/appengine/docs/standard//config/appref
   * @param runtimeApiVersion runtimeApiVersion or {@code null} for none
   */
  public Version setRuntimeApiVersion(java.lang.String runtimeApiVersion) {
    this.runtimeApiVersion = runtimeApiVersion;
    return this;
  }

  /**
   * The channel of the runtime to use. Only available for some runtimes. Defaults to the default
   * channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeChannel() {
    return runtimeChannel;
  }

  /**
   * The channel of the runtime to use. Only available for some runtimes. Defaults to the default
   * channel.
   * @param runtimeChannel runtimeChannel or {@code null} for none
   */
  public Version setRuntimeChannel(java.lang.String runtimeChannel) {
    this.runtimeChannel = runtimeChannel;
    return this;
  }

  /**
   * The path or name of the app's main executable.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeMainExecutablePath() {
    return runtimeMainExecutablePath;
  }

  /**
   * The path or name of the app's main executable.
   * @param runtimeMainExecutablePath runtimeMainExecutablePath or {@code null} for none
   */
  public Version setRuntimeMainExecutablePath(java.lang.String runtimeMainExecutablePath) {
    this.runtimeMainExecutablePath = runtimeMainExecutablePath;
    return this;
  }

  /**
   * The identity that the deployed version will run as. Admin API will use the App Engine Appspot
   * service account as default if this field is neither provided in app.yaml file nor through CLI
   * flag.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The identity that the deployed version will run as. Admin API will use the App Engine Appspot
   * service account as default if this field is neither provided in app.yaml file nor through CLI
   * flag.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Version setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Current serving status of this version. Only the versions with a SERVING status create
   * instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to
   * SERVING.
   * @return value or {@code null} for none
   */
  public java.lang.String getServingStatus() {
    return servingStatus;
  }

  /**
   * Current serving status of this version. Only the versions with a SERVING status create
   * instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to
   * SERVING.
   * @param servingStatus servingStatus or {@code null} for none
   */
  public Version setServingStatus(java.lang.String servingStatus) {
    this.servingStatus = servingStatus;
    return this;
  }

  /**
   * Whether multiple requests can be dispatched to this version at once.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getThreadsafe() {
    return threadsafe;
  }

  /**
   * Whether multiple requests can be dispatched to this version at once.
   * @param threadsafe threadsafe or {@code null} for none
   */
  public Version setThreadsafe(java.lang.Boolean threadsafe) {
    this.threadsafe = threadsafe;
    return this;
  }

  /**
   * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-
   * myapp.appspot.com"@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionUrl() {
    return versionUrl;
  }

  /**
   * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-
   * myapp.appspot.com"@OutputOnly
   * @param versionUrl versionUrl or {@code null} for none
   */
  public Version setVersionUrl(java.lang.String versionUrl) {
    this.versionUrl = versionUrl;
    return this;
  }

  /**
   * Whether to deploy this version in a container on a virtual machine.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVm() {
    return vm;
  }

  /**
   * Whether to deploy this version in a container on a virtual machine.
   * @param vm vm or {@code null} for none
   */
  public Version setVm(java.lang.Boolean vm) {
    this.vm = vm;
    return this;
  }

  /**
   * Enables VPC connectivity for standard apps.
   * @return value or {@code null} for none
   */
  public VpcAccessConnector getVpcAccessConnector() {
    return vpcAccessConnector;
  }

  /**
   * Enables VPC connectivity for standard apps.
   * @param vpcAccessConnector vpcAccessConnector or {@code null} for none
   */
  public Version setVpcAccessConnector(VpcAccessConnector vpcAccessConnector) {
    this.vpcAccessConnector = vpcAccessConnector;
    return this;
  }

  /**
   * The Google Compute Engine zones that are supported by this version in the App Engine flexible
   * environment. Deprecated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getZones() {
    return zones;
  }

  /**
   * The Google Compute Engine zones that are supported by this version in the App Engine flexible
   * environment. Deprecated.
   * @param zones zones or {@code null} for none
   */
  public Version setZones(java.util.List<java.lang.String> zones) {
    this.zones = zones;
    return this;
  }

  @Override
  public Version set(String fieldName, Object value) {
    return (Version) super.set(fieldName, value);
  }

  @Override
  public Version clone() {
    return (Version) super.clone();
  }

}
