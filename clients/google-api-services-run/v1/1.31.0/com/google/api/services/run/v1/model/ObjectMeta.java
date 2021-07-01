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
 * k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta is metadata that all persisted resources must
 * have, which includes all objects users must create.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectMeta extends com.google.api.client.json.GenericJson {

  /**
   * (Optional) Annotations is an unstructured key value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: http://kubernetes.io/docs/user-
   * guide/annotations
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This
   * is used to distinguish resources with same name and namespace in different clusters. This field
   * is not set anywhere right now and apiserver is going to ignore it if set in create or update
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * (Optional) CreationTimestamp is a timestamp representing the server time when this object was
   * created. It is not guaranteed to be set in happens-before order across separate operations.
   * Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by
   * the system. Read-only. Null for lists. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTimestamp;

  /**
   * (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully
   * terminate before it will be removed from the system. Only set when deletionTimestamp is also
   * set. May only be shortened. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer deletionGracePeriodSeconds;

  /**
   * (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this
   * resource will be deleted. This field is set by the server when a graceful deletion is requested
   * by the user, and is not directly settable by a client. The resource is expected to be deleted
   * (no longer visible from resource lists, and not reachable by name) after the time in this
   * field, once the finalizers list is empty. As long as the finalizers list contains items,
   * deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set
   * further into the future, although it may be shortened or the resource may be deleted prior to
   * this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet
   * will react by sending a graceful termination signal to the containers in the pod. After that 30
   * seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after
   * cleanup, remove the pod from the API. In the presence of network partitions, this object may
   * still exist after this timestamp, until an administrator or automated process can determine the
   * resource is fully terminated. If not set, graceful deletion of the object has not been
   * requested. Populated by the system when a graceful deletion is requested. Read-only. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deletionTimestamp;

  /**
   * (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the
   * registry. Each entry is an identifier for the responsible component that will remove the entry
   * from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only
   * be removed. +patchStrategy=merge
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> finalizers;

  /**
   * (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server,
   * to generate a unique name ONLY IF the Name field has not been provided. If this field is used,
   * the name returned to the client will be different than the name passed. This value will also be
   * combined with a unique suffix. The provided value has the same validation rules as the Name
   * field, and may be truncated by the length of the suffix required to make the value unique on
   * the server. If this field is specified and the generated name exists, the server will NOT
   * return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout
   * indicating a unique name could not be found in the time allotted, and the client should retry
   * (optionally after the time indicated in the Retry-After header). Applied only if Name is not
   * specified. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#idempotency string generateName = 2;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String generateName;

  /**
   * (Optional) A sequence number representing a specific generation of the desired state. Populated
   * by the system. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer generation;

  /**
   * (Optional) Map of string keys and values that can be used to organize and categorize (scope and
   * select) objects. May match selectors of replication controllers and routes. More info:
   * http://kubernetes.io/docs/user-guide/labels
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name must be unique within a namespace, within a Cloud Run region. Is required when creating
   * resources, although some resources may allow a client to request the generation of an
   * appropriate name automatically. Name is primarily intended for creation idempotence and
   * configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#names +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Namespace defines the space within each name must be unique, within a Cloud Run region. In
   * Cloud Run the namespace must be equal to either the project ID or project number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in
   * the list have been deleted, this object will be garbage collected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OwnerReference> ownerReferences;

  /**
   * Optional. An opaque value that represents the internal version of this object that can be used
   * by clients to determine when objects have changed. May be used for optimistic concurrency,
   * change detection, and the watch operation on a resource or set of resources. Clients must treat
   * these values as opaque and passed unmodified back to the server or omit the value to disable
   * conflict-detection. They may only be valid for a particular resource or set of resources.
   * Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More
   * info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * #concurrency-control-and-consistency
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceVersion;

  /**
   * (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only.
   * string selfLink = 4;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * (Optional) UID is the unique in time and space value for this object. It is typically generated
   * by the server on successful creation of a resource and is not allowed to change on PUT
   * operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#uids
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * (Optional) Annotations is an unstructured key value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: http://kubernetes.io/docs/user-
   * guide/annotations
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * (Optional) Annotations is an unstructured key value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: http://kubernetes.io/docs/user-
   * guide/annotations
   * @param annotations annotations or {@code null} for none
   */
  public ObjectMeta setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This
   * is used to distinguish resources with same name and namespace in different clusters. This field
   * is not set anywhere right now and apiserver is going to ignore it if set in create or update
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This
   * is used to distinguish resources with same name and namespace in different clusters. This field
   * is not set anywhere right now and apiserver is going to ignore it if set in create or update
   * request.
   * @param clusterName clusterName or {@code null} for none
   */
  public ObjectMeta setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * (Optional) CreationTimestamp is a timestamp representing the server time when this object was
   * created. It is not guaranteed to be set in happens-before order across separate operations.
   * Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by
   * the system. Read-only. Null for lists. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return value or {@code null} for none
   */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * (Optional) CreationTimestamp is a timestamp representing the server time when this object was
   * created. It is not guaranteed to be set in happens-before order across separate operations.
   * Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by
   * the system. Read-only. Null for lists. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public ObjectMeta setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully
   * terminate before it will be removed from the system. Only set when deletionTimestamp is also
   * set. May only be shortened. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }

  /**
   * (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully
   * terminate before it will be removed from the system. Only set when deletionTimestamp is also
   * set. May only be shortened. Read-only.
   * @param deletionGracePeriodSeconds deletionGracePeriodSeconds or {@code null} for none
   */
  public ObjectMeta setDeletionGracePeriodSeconds(java.lang.Integer deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this
   * resource will be deleted. This field is set by the server when a graceful deletion is requested
   * by the user, and is not directly settable by a client. The resource is expected to be deleted
   * (no longer visible from resource lists, and not reachable by name) after the time in this
   * field, once the finalizers list is empty. As long as the finalizers list contains items,
   * deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set
   * further into the future, although it may be shortened or the resource may be deleted prior to
   * this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet
   * will react by sending a graceful termination signal to the containers in the pod. After that 30
   * seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after
   * cleanup, remove the pod from the API. In the presence of network partitions, this object may
   * still exist after this timestamp, until an administrator or automated process can determine the
   * resource is fully terminated. If not set, graceful deletion of the object has not been
   * requested. Populated by the system when a graceful deletion is requested. Read-only. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return value or {@code null} for none
   */
  public String getDeletionTimestamp() {
    return deletionTimestamp;
  }

  /**
   * (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this
   * resource will be deleted. This field is set by the server when a graceful deletion is requested
   * by the user, and is not directly settable by a client. The resource is expected to be deleted
   * (no longer visible from resource lists, and not reachable by name) after the time in this
   * field, once the finalizers list is empty. As long as the finalizers list contains items,
   * deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set
   * further into the future, although it may be shortened or the resource may be deleted prior to
   * this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet
   * will react by sending a graceful termination signal to the containers in the pod. After that 30
   * seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after
   * cleanup, remove the pod from the API. In the presence of network partitions, this object may
   * still exist after this timestamp, until an administrator or automated process can determine the
   * resource is fully terminated. If not set, graceful deletion of the object has not been
   * requested. Populated by the system when a graceful deletion is requested. Read-only. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @param deletionTimestamp deletionTimestamp or {@code null} for none
   */
  public ObjectMeta setDeletionTimestamp(String deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the
   * registry. Each entry is an identifier for the responsible component that will remove the entry
   * from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only
   * be removed. +patchStrategy=merge
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFinalizers() {
    return finalizers;
  }

  /**
   * (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the
   * registry. Each entry is an identifier for the responsible component that will remove the entry
   * from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only
   * be removed. +patchStrategy=merge
   * @param finalizers finalizers or {@code null} for none
   */
  public ObjectMeta setFinalizers(java.util.List<java.lang.String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server,
   * to generate a unique name ONLY IF the Name field has not been provided. If this field is used,
   * the name returned to the client will be different than the name passed. This value will also be
   * combined with a unique suffix. The provided value has the same validation rules as the Name
   * field, and may be truncated by the length of the suffix required to make the value unique on
   * the server. If this field is specified and the generated name exists, the server will NOT
   * return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout
   * indicating a unique name could not be found in the time allotted, and the client should retry
   * (optionally after the time indicated in the Retry-After header). Applied only if Name is not
   * specified. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#idempotency string generateName = 2;
   * @return value or {@code null} for none
   */
  public java.lang.String getGenerateName() {
    return generateName;
  }

  /**
   * (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server,
   * to generate a unique name ONLY IF the Name field has not been provided. If this field is used,
   * the name returned to the client will be different than the name passed. This value will also be
   * combined with a unique suffix. The provided value has the same validation rules as the Name
   * field, and may be truncated by the length of the suffix required to make the value unique on
   * the server. If this field is specified and the generated name exists, the server will NOT
   * return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout
   * indicating a unique name could not be found in the time allotted, and the client should retry
   * (optionally after the time indicated in the Retry-After header). Applied only if Name is not
   * specified. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#idempotency string generateName = 2;
   * @param generateName generateName or {@code null} for none
   */
  public ObjectMeta setGenerateName(java.lang.String generateName) {
    this.generateName = generateName;
    return this;
  }

  /**
   * (Optional) A sequence number representing a specific generation of the desired state. Populated
   * by the system. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGeneration() {
    return generation;
  }

  /**
   * (Optional) A sequence number representing a specific generation of the desired state. Populated
   * by the system. Read-only.
   * @param generation generation or {@code null} for none
   */
  public ObjectMeta setGeneration(java.lang.Integer generation) {
    this.generation = generation;
    return this;
  }

  /**
   * (Optional) Map of string keys and values that can be used to organize and categorize (scope and
   * select) objects. May match selectors of replication controllers and routes. More info:
   * http://kubernetes.io/docs/user-guide/labels
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * (Optional) Map of string keys and values that can be used to organize and categorize (scope and
   * select) objects. May match selectors of replication controllers and routes. More info:
   * http://kubernetes.io/docs/user-guide/labels
   * @param labels labels or {@code null} for none
   */
  public ObjectMeta setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name must be unique within a namespace, within a Cloud Run region. Is required when creating
   * resources, although some resources may allow a client to request the generation of an
   * appropriate name automatically. Name is primarily intended for creation idempotence and
   * configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#names +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name must be unique within a namespace, within a Cloud Run region. Is required when creating
   * resources, although some resources may allow a client to request the generation of an
   * appropriate name automatically. Name is primarily intended for creation idempotence and
   * configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#names +optional
   * @param name name or {@code null} for none
   */
  public ObjectMeta setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace defines the space within each name must be unique, within a Cloud Run region. In
   * Cloud Run the namespace must be equal to either the project ID or project number.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Namespace defines the space within each name must be unique, within a Cloud Run region. In
   * Cloud Run the namespace must be equal to either the project ID or project number.
   * @param namespace namespace or {@code null} for none
   */
  public ObjectMeta setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in
   * the list have been deleted, this object will be garbage collected.
   * @return value or {@code null} for none
   */
  public java.util.List<OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }

  /**
   * (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in
   * the list have been deleted, this object will be garbage collected.
   * @param ownerReferences ownerReferences or {@code null} for none
   */
  public ObjectMeta setOwnerReferences(java.util.List<OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  /**
   * Optional. An opaque value that represents the internal version of this object that can be used
   * by clients to determine when objects have changed. May be used for optimistic concurrency,
   * change detection, and the watch operation on a resource or set of resources. Clients must treat
   * these values as opaque and passed unmodified back to the server or omit the value to disable
   * conflict-detection. They may only be valid for a particular resource or set of resources.
   * Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More
   * info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * #concurrency-control-and-consistency
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceVersion() {
    return resourceVersion;
  }

  /**
   * Optional. An opaque value that represents the internal version of this object that can be used
   * by clients to determine when objects have changed. May be used for optimistic concurrency,
   * change detection, and the watch operation on a resource or set of resources. Clients must treat
   * these values as opaque and passed unmodified back to the server or omit the value to disable
   * conflict-detection. They may only be valid for a particular resource or set of resources.
   * Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More
   * info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * #concurrency-control-and-consistency
   * @param resourceVersion resourceVersion or {@code null} for none
   */
  public ObjectMeta setResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only.
   * string selfLink = 4;
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only.
   * string selfLink = 4;
   * @param selfLink selfLink or {@code null} for none
   */
  public ObjectMeta setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * (Optional) UID is the unique in time and space value for this object. It is typically generated
   * by the server on successful creation of a resource and is not allowed to change on PUT
   * operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#uids
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * (Optional) UID is the unique in time and space value for this object. It is typically generated
   * by the server on successful creation of a resource and is not allowed to change on PUT
   * operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-
   * guide/identifiers#uids
   * @param uid uid or {@code null} for none
   */
  public ObjectMeta setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public ObjectMeta set(String fieldName, Object value) {
    return (ObjectMeta) super.set(fieldName, value);
  }

  @Override
  public ObjectMeta clone() {
    return (ObjectMeta) super.clone();
  }

}
