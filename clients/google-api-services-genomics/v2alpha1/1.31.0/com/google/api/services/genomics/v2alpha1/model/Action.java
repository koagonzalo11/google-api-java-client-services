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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * Specifies a single action that runs a Docker container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Action extends com.google.api.client.json.GenericJson {

  /**
   * If specified, overrides the `CMD` specified in the container. If the container also has an
   * `ENTRYPOINT` the values are used as entrypoint arguments. Otherwise, they are used as a command
   * and arguments to run inside the container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> commands;

  /**
   * If the specified image is hosted on a private registry other than Google Container Registry,
   * the credentials required to pull the image must be specified here as an encrypted secret. The
   * secret must decrypt to a JSON-encoded dictionary containing both `username` and `password`
   * keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Secret credentials;

  /**
   * The encrypted environment to pass into the container. This environment is merged with values
   * specified in the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values.
   * The secret must decrypt to a JSON-encoded dictionary where key-value pairs serve as environment
   * variable names and their values. The decoded environment variables can overwrite the values
   * specified by the `environment` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Secret encryptedEnvironment;

  /**
   * If specified, overrides the `ENTRYPOINT` specified in the container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entrypoint;

  /**
   * The environment to pass into the container. This environment is merged with values specified in
   * the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values. In addition to
   * the values passed here, a few other values are automatically injected into the environment.
   * These cannot be hidden or overwritten. `GOOGLE_PIPELINE_FAILED` will be set to "1" if the
   * pipeline failed because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional debug or logging
   * actions should execute. `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine authors to determine
   * whether an individual action has succeeded or failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> environment;

  /**
   * The set of flags to apply to this action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> flags;

  /**
   * Required. The URI to pull the container image from. Note that all images referenced by actions
   * in the pipeline are pulled before the first action runs. If multiple actions reference the same
   * image, it is only pulled once, ensuring that the same image is used for all actions in a single
   * pipeline. The image URI can be either a complete host and image specification (e.g.,
   * quay.io/biocontainers/samtools), a library and image name (e.g., google/cloud-sdk) or a bare
   * image name ('bash') to pull from the default library. No schema is required in any of these
   * cases. If the specified image is not public, the service account specified for the Virtual
   * Machine must have access to pull the images from GCR, or appropriate credentials must be
   * specified in the google.genomics.v2alpha1.Action.credentials field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Labels to associate with the action. This field is provided to assist workflow engine authors
   * in identifying actions (for example, to indicate what sort of action they perform, such as
   * localization or debugging). They are returned in the operation metadata, but are otherwise
   * ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A list of mounts to make available to the action. In addition to the values specified here,
   * every action has a special virtual disk mounted under `/google` that contains log files and
   * other operational components. - /google/logs All logs written during the pipeline execution. -
   * /google/logs/output The combined standard output and standard error of all actions run as part
   * of the pipeline execution. - /google/logs/action/stdout The complete contents of each
   * individual action's standard output. - /google/logs/action/stderr The complete contents of each
   * individual action's standard error output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Mount> mounts;

  /**
   * An optional name for the container. The container hostname will be set to this name, making it
   * useful for inter-container communication. The name must contain only upper and lowercase
   * alphanumeric characters and hyphens and cannot start with a hyphen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An optional identifier for a PID namespace to run the action inside. Multiple actions should
   * use the same string to share a namespace. If unspecified, a separate isolated namespace is
   * used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pidNamespace;

  /**
   * A map of containers to host port mappings for this container. If the container already
   * specifies exposed ports, use the `PUBLISH_EXPOSED_PORTS` flag instead. The host port number
   * must be less than 65536. If it is zero, an unused random port is assigned. To determine the
   * resulting port number, consult the `ContainerStartedEvent` in the operation metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Integer> portMappings;

  /**
   * The maximum amount of time to give the action to complete. If the action fails to complete
   * before the timeout, it will be terminated and the exit status will be non-zero. The pipeline
   * will continue or terminate based on the rules defined by the `ALWAYS_RUN` and
   * `IGNORE_EXIT_STATUS` flags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * If specified, overrides the `CMD` specified in the container. If the container also has an
   * `ENTRYPOINT` the values are used as entrypoint arguments. Otherwise, they are used as a command
   * and arguments to run inside the container.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCommands() {
    return commands;
  }

  /**
   * If specified, overrides the `CMD` specified in the container. If the container also has an
   * `ENTRYPOINT` the values are used as entrypoint arguments. Otherwise, they are used as a command
   * and arguments to run inside the container.
   * @param commands commands or {@code null} for none
   */
  public Action setCommands(java.util.List<java.lang.String> commands) {
    this.commands = commands;
    return this;
  }

  /**
   * If the specified image is hosted on a private registry other than Google Container Registry,
   * the credentials required to pull the image must be specified here as an encrypted secret. The
   * secret must decrypt to a JSON-encoded dictionary containing both `username` and `password`
   * keys.
   * @return value or {@code null} for none
   */
  public Secret getCredentials() {
    return credentials;
  }

  /**
   * If the specified image is hosted on a private registry other than Google Container Registry,
   * the credentials required to pull the image must be specified here as an encrypted secret. The
   * secret must decrypt to a JSON-encoded dictionary containing both `username` and `password`
   * keys.
   * @param credentials credentials or {@code null} for none
   */
  public Action setCredentials(Secret credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * The encrypted environment to pass into the container. This environment is merged with values
   * specified in the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values.
   * The secret must decrypt to a JSON-encoded dictionary where key-value pairs serve as environment
   * variable names and their values. The decoded environment variables can overwrite the values
   * specified by the `environment` field.
   * @return value or {@code null} for none
   */
  public Secret getEncryptedEnvironment() {
    return encryptedEnvironment;
  }

  /**
   * The encrypted environment to pass into the container. This environment is merged with values
   * specified in the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values.
   * The secret must decrypt to a JSON-encoded dictionary where key-value pairs serve as environment
   * variable names and their values. The decoded environment variables can overwrite the values
   * specified by the `environment` field.
   * @param encryptedEnvironment encryptedEnvironment or {@code null} for none
   */
  public Action setEncryptedEnvironment(Secret encryptedEnvironment) {
    this.encryptedEnvironment = encryptedEnvironment;
    return this;
  }

  /**
   * If specified, overrides the `ENTRYPOINT` specified in the container.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntrypoint() {
    return entrypoint;
  }

  /**
   * If specified, overrides the `ENTRYPOINT` specified in the container.
   * @param entrypoint entrypoint or {@code null} for none
   */
  public Action setEntrypoint(java.lang.String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * The environment to pass into the container. This environment is merged with values specified in
   * the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values. In addition to
   * the values passed here, a few other values are automatically injected into the environment.
   * These cannot be hidden or overwritten. `GOOGLE_PIPELINE_FAILED` will be set to "1" if the
   * pipeline failed because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional debug or logging
   * actions should execute. `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine authors to determine
   * whether an individual action has succeeded or failed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvironment() {
    return environment;
  }

  /**
   * The environment to pass into the container. This environment is merged with values specified in
   * the google.genomics.v2alpha1.Pipeline message, overwriting any duplicate values. In addition to
   * the values passed here, a few other values are automatically injected into the environment.
   * These cannot be hidden or overwritten. `GOOGLE_PIPELINE_FAILED` will be set to "1" if the
   * pipeline failed because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional debug or logging
   * actions should execute. `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine authors to determine
   * whether an individual action has succeeded or failed.
   * @param environment environment or {@code null} for none
   */
  public Action setEnvironment(java.util.Map<String, java.lang.String> environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The set of flags to apply to this action.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFlags() {
    return flags;
  }

  /**
   * The set of flags to apply to this action.
   * @param flags flags or {@code null} for none
   */
  public Action setFlags(java.util.List<java.lang.String> flags) {
    this.flags = flags;
    return this;
  }

  /**
   * Required. The URI to pull the container image from. Note that all images referenced by actions
   * in the pipeline are pulled before the first action runs. If multiple actions reference the same
   * image, it is only pulled once, ensuring that the same image is used for all actions in a single
   * pipeline. The image URI can be either a complete host and image specification (e.g.,
   * quay.io/biocontainers/samtools), a library and image name (e.g., google/cloud-sdk) or a bare
   * image name ('bash') to pull from the default library. No schema is required in any of these
   * cases. If the specified image is not public, the service account specified for the Virtual
   * Machine must have access to pull the images from GCR, or appropriate credentials must be
   * specified in the google.genomics.v2alpha1.Action.credentials field.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Required. The URI to pull the container image from. Note that all images referenced by actions
   * in the pipeline are pulled before the first action runs. If multiple actions reference the same
   * image, it is only pulled once, ensuring that the same image is used for all actions in a single
   * pipeline. The image URI can be either a complete host and image specification (e.g.,
   * quay.io/biocontainers/samtools), a library and image name (e.g., google/cloud-sdk) or a bare
   * image name ('bash') to pull from the default library. No schema is required in any of these
   * cases. If the specified image is not public, the service account specified for the Virtual
   * Machine must have access to pull the images from GCR, or appropriate credentials must be
   * specified in the google.genomics.v2alpha1.Action.credentials field.
   * @param imageUri imageUri or {@code null} for none
   */
  public Action setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Labels to associate with the action. This field is provided to assist workflow engine authors
   * in identifying actions (for example, to indicate what sort of action they perform, such as
   * localization or debugging). They are returned in the operation metadata, but are otherwise
   * ignored.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to associate with the action. This field is provided to assist workflow engine authors
   * in identifying actions (for example, to indicate what sort of action they perform, such as
   * localization or debugging). They are returned in the operation metadata, but are otherwise
   * ignored.
   * @param labels labels or {@code null} for none
   */
  public Action setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A list of mounts to make available to the action. In addition to the values specified here,
   * every action has a special virtual disk mounted under `/google` that contains log files and
   * other operational components. - /google/logs All logs written during the pipeline execution. -
   * /google/logs/output The combined standard output and standard error of all actions run as part
   * of the pipeline execution. - /google/logs/action/stdout The complete contents of each
   * individual action's standard output. - /google/logs/action/stderr The complete contents of each
   * individual action's standard error output.
   * @return value or {@code null} for none
   */
  public java.util.List<Mount> getMounts() {
    return mounts;
  }

  /**
   * A list of mounts to make available to the action. In addition to the values specified here,
   * every action has a special virtual disk mounted under `/google` that contains log files and
   * other operational components. - /google/logs All logs written during the pipeline execution. -
   * /google/logs/output The combined standard output and standard error of all actions run as part
   * of the pipeline execution. - /google/logs/action/stdout The complete contents of each
   * individual action's standard output. - /google/logs/action/stderr The complete contents of each
   * individual action's standard error output.
   * @param mounts mounts or {@code null} for none
   */
  public Action setMounts(java.util.List<Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  /**
   * An optional name for the container. The container hostname will be set to this name, making it
   * useful for inter-container communication. The name must contain only upper and lowercase
   * alphanumeric characters and hyphens and cannot start with a hyphen.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * An optional name for the container. The container hostname will be set to this name, making it
   * useful for inter-container communication. The name must contain only upper and lowercase
   * alphanumeric characters and hyphens and cannot start with a hyphen.
   * @param name name or {@code null} for none
   */
  public Action setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional identifier for a PID namespace to run the action inside. Multiple actions should
   * use the same string to share a namespace. If unspecified, a separate isolated namespace is
   * used.
   * @return value or {@code null} for none
   */
  public java.lang.String getPidNamespace() {
    return pidNamespace;
  }

  /**
   * An optional identifier for a PID namespace to run the action inside. Multiple actions should
   * use the same string to share a namespace. If unspecified, a separate isolated namespace is
   * used.
   * @param pidNamespace pidNamespace or {@code null} for none
   */
  public Action setPidNamespace(java.lang.String pidNamespace) {
    this.pidNamespace = pidNamespace;
    return this;
  }

  /**
   * A map of containers to host port mappings for this container. If the container already
   * specifies exposed ports, use the `PUBLISH_EXPOSED_PORTS` flag instead. The host port number
   * must be less than 65536. If it is zero, an unused random port is assigned. To determine the
   * resulting port number, consult the `ContainerStartedEvent` in the operation metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Integer> getPortMappings() {
    return portMappings;
  }

  /**
   * A map of containers to host port mappings for this container. If the container already
   * specifies exposed ports, use the `PUBLISH_EXPOSED_PORTS` flag instead. The host port number
   * must be less than 65536. If it is zero, an unused random port is assigned. To determine the
   * resulting port number, consult the `ContainerStartedEvent` in the operation metadata.
   * @param portMappings portMappings or {@code null} for none
   */
  public Action setPortMappings(java.util.Map<String, java.lang.Integer> portMappings) {
    this.portMappings = portMappings;
    return this;
  }

  /**
   * The maximum amount of time to give the action to complete. If the action fails to complete
   * before the timeout, it will be terminated and the exit status will be non-zero. The pipeline
   * will continue or terminate based on the rules defined by the `ALWAYS_RUN` and
   * `IGNORE_EXIT_STATUS` flags.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * The maximum amount of time to give the action to complete. If the action fails to complete
   * before the timeout, it will be terminated and the exit status will be non-zero. The pipeline
   * will continue or terminate based on the rules defined by the `ALWAYS_RUN` and
   * `IGNORE_EXIT_STATUS` flags.
   * @param timeout timeout or {@code null} for none
   */
  public Action setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public Action set(String fieldName, Object value) {
    return (Action) super.set(fieldName, value);
  }

  @Override
  public Action clone() {
    return (Action) super.clone();
  }

}
