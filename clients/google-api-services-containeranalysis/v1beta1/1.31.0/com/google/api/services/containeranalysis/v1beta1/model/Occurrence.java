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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * An instance of an analysis type that has been found on a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Occurrence extends com.google.api.client.json.GenericJson {

  /**
   * Describes an attestation of an artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Details attestation;

  /**
   * Describes a verifiable build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1BuildDetails build;

  /**
   * Output only. The time this occurrence was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Describes the deployment of an artifact on a runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1DeploymentDetails deployment;

  /**
   * Describes how this resource derives from the basis in the associated note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1ImageDetails derivedImage;

  /**
   * Describes when a resource was discovered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1DiscoveryDetails discovered;

  /**
   * Describes the installation of a package on the linked resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1PackageDetails installation;

  /**
   * Describes a specific in-toto link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1IntotoDetails intoto;

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noteName;

  /**
   * A description of actions that can be taken to remedy the note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remediation;

  /**
   * Required. Immutable. The resource for which the occurrence applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * Describes a specific SPDX Document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentOccurrence sbom;

  /**
   * Describes a specific SPDX File.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileOccurrence spdxFile;

  /**
   * Describes a specific SPDX Package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PackageOccurrence spdxPackage;

  /**
   * Describes a specific SPDX Relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RelationshipOccurrence spdxRelationship;

  /**
   * Output only. The time this occurrence was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Describes a security vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrafeasV1beta1VulnerabilityDetails vulnerability;

  /**
   * Describes an attestation of an artifact.
   * @return value or {@code null} for none
   */
  public Details getAttestation() {
    return attestation;
  }

  /**
   * Describes an attestation of an artifact.
   * @param attestation attestation or {@code null} for none
   */
  public Occurrence setAttestation(Details attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Describes a verifiable build.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1BuildDetails getBuild() {
    return build;
  }

  /**
   * Describes a verifiable build.
   * @param build build or {@code null} for none
   */
  public Occurrence setBuild(GrafeasV1beta1BuildDetails build) {
    this.build = build;
    return this;
  }

  /**
   * Output only. The time this occurrence was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this occurrence was created.
   * @param createTime createTime or {@code null} for none
   */
  public Occurrence setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Describes the deployment of an artifact on a runtime.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1DeploymentDetails getDeployment() {
    return deployment;
  }

  /**
   * Describes the deployment of an artifact on a runtime.
   * @param deployment deployment or {@code null} for none
   */
  public Occurrence setDeployment(GrafeasV1beta1DeploymentDetails deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Describes how this resource derives from the basis in the associated note.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1ImageDetails getDerivedImage() {
    return derivedImage;
  }

  /**
   * Describes how this resource derives from the basis in the associated note.
   * @param derivedImage derivedImage or {@code null} for none
   */
  public Occurrence setDerivedImage(GrafeasV1beta1ImageDetails derivedImage) {
    this.derivedImage = derivedImage;
    return this;
  }

  /**
   * Describes when a resource was discovered.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1DiscoveryDetails getDiscovered() {
    return discovered;
  }

  /**
   * Describes when a resource was discovered.
   * @param discovered discovered or {@code null} for none
   */
  public Occurrence setDiscovered(GrafeasV1beta1DiscoveryDetails discovered) {
    this.discovered = discovered;
    return this;
  }

  /**
   * Describes the installation of a package on the linked resource.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1PackageDetails getInstallation() {
    return installation;
  }

  /**
   * Describes the installation of a package on the linked resource.
   * @param installation installation or {@code null} for none
   */
  public Occurrence setInstallation(GrafeasV1beta1PackageDetails installation) {
    this.installation = installation;
    return this;
  }

  /**
   * Describes a specific in-toto link.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1IntotoDetails getIntoto() {
    return intoto;
  }

  /**
   * Describes a specific in-toto link.
   * @param intoto intoto or {@code null} for none
   */
  public Occurrence setIntoto(GrafeasV1beta1IntotoDetails intoto) {
    this.intoto = intoto;
    return this;
  }

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * @param kind kind or {@code null} for none
   */
  public Occurrence setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * @param name name or {@code null} for none
   */
  public Occurrence setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoteName() {
    return noteName;
  }

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * @param noteName noteName or {@code null} for none
   */
  public Occurrence setNoteName(java.lang.String noteName) {
    this.noteName = noteName;
    return this;
  }

  /**
   * A description of actions that can be taken to remedy the note.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemediation() {
    return remediation;
  }

  /**
   * A description of actions that can be taken to remedy the note.
   * @param remediation remediation or {@code null} for none
   */
  public Occurrence setRemediation(java.lang.String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * Required. Immutable. The resource for which the occurrence applies.
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * Required. Immutable. The resource for which the occurrence applies.
   * @param resource resource or {@code null} for none
   */
  public Occurrence setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Describes a specific SPDX Document.
   * @return value or {@code null} for none
   */
  public DocumentOccurrence getSbom() {
    return sbom;
  }

  /**
   * Describes a specific SPDX Document.
   * @param sbom sbom or {@code null} for none
   */
  public Occurrence setSbom(DocumentOccurrence sbom) {
    this.sbom = sbom;
    return this;
  }

  /**
   * Describes a specific SPDX File.
   * @return value or {@code null} for none
   */
  public FileOccurrence getSpdxFile() {
    return spdxFile;
  }

  /**
   * Describes a specific SPDX File.
   * @param spdxFile spdxFile or {@code null} for none
   */
  public Occurrence setSpdxFile(FileOccurrence spdxFile) {
    this.spdxFile = spdxFile;
    return this;
  }

  /**
   * Describes a specific SPDX Package.
   * @return value or {@code null} for none
   */
  public PackageOccurrence getSpdxPackage() {
    return spdxPackage;
  }

  /**
   * Describes a specific SPDX Package.
   * @param spdxPackage spdxPackage or {@code null} for none
   */
  public Occurrence setSpdxPackage(PackageOccurrence spdxPackage) {
    this.spdxPackage = spdxPackage;
    return this;
  }

  /**
   * Describes a specific SPDX Relationship.
   * @return value or {@code null} for none
   */
  public RelationshipOccurrence getSpdxRelationship() {
    return spdxRelationship;
  }

  /**
   * Describes a specific SPDX Relationship.
   * @param spdxRelationship spdxRelationship or {@code null} for none
   */
  public Occurrence setSpdxRelationship(RelationshipOccurrence spdxRelationship) {
    this.spdxRelationship = spdxRelationship;
    return this;
  }

  /**
   * Output only. The time this occurrence was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this occurrence was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Occurrence setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Describes a security vulnerability.
   * @return value or {@code null} for none
   */
  public GrafeasV1beta1VulnerabilityDetails getVulnerability() {
    return vulnerability;
  }

  /**
   * Describes a security vulnerability.
   * @param vulnerability vulnerability or {@code null} for none
   */
  public Occurrence setVulnerability(GrafeasV1beta1VulnerabilityDetails vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  @Override
  public Occurrence set(String fieldName, Object value) {
    return (Occurrence) super.set(fieldName, value);
  }

  @Override
  public Occurrence clone() {
    return (Occurrence) super.clone();
  }

}
