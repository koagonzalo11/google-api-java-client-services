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

package com.google.api.services.compute.model;

/**
 * Describes the status of MACsec encryption on the link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectDiagnosticsMacsecStatus extends com.google.api.client.json.GenericJson {

  /**
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is
   * operational.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ckn;

  /**
   * The current state of MACsec configuration on this Interconnect, which can take one of the
   * following values: - INITIALIZED: MACsec has been configured on the bundle interface. The Google
   * edge router is waiting to establish a MACsec session with the customer router on the other side
   * of this Interconnect. In addition, when key rollover fails between the two routers, the bundle
   * interface will return to the initialized state. - SECURED: MACsec session has been successfully
   * established between the Google edge router and the customer router. - FAILED: MACsec
   * configuration on the bundle interface encountered an error. - DISABLED: MACsec is explicitly
   * disabled on this Interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is
   * operational.
   * @return value or {@code null} for none
   */
  public java.lang.String getCkn() {
    return ckn;
  }

  /**
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is
   * operational.
   * @param ckn ckn or {@code null} for none
   */
  public InterconnectDiagnosticsMacsecStatus setCkn(java.lang.String ckn) {
    this.ckn = ckn;
    return this;
  }

  /**
   * The current state of MACsec configuration on this Interconnect, which can take one of the
   * following values: - INITIALIZED: MACsec has been configured on the bundle interface. The Google
   * edge router is waiting to establish a MACsec session with the customer router on the other side
   * of this Interconnect. In addition, when key rollover fails between the two routers, the bundle
   * interface will return to the initialized state. - SECURED: MACsec session has been successfully
   * established between the Google edge router and the customer router. - FAILED: MACsec
   * configuration on the bundle interface encountered an error. - DISABLED: MACsec is explicitly
   * disabled on this Interconnect.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of MACsec configuration on this Interconnect, which can take one of the
   * following values: - INITIALIZED: MACsec has been configured on the bundle interface. The Google
   * edge router is waiting to establish a MACsec session with the customer router on the other side
   * of this Interconnect. In addition, when key rollover fails between the two routers, the bundle
   * interface will return to the initialized state. - SECURED: MACsec session has been successfully
   * established between the Google edge router and the customer router. - FAILED: MACsec
   * configuration on the bundle interface encountered an error. - DISABLED: MACsec is explicitly
   * disabled on this Interconnect.
   * @param state state or {@code null} for none
   */
  public InterconnectDiagnosticsMacsecStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public InterconnectDiagnosticsMacsecStatus set(String fieldName, Object value) {
    return (InterconnectDiagnosticsMacsecStatus) super.set(fieldName, value);
  }

  @Override
  public InterconnectDiagnosticsMacsecStatus clone() {
    return (InterconnectDiagnosticsMacsecStatus) super.clone();
  }

}
