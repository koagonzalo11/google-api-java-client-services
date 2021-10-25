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

package com.google.api.services.datastream.v1alpha1.model;

/**
 * MySQL database structure
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MysqlRdbms extends com.google.api.client.json.GenericJson {

  /**
   * Mysql databases on the server
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MysqlDatabase> mysqlDatabases;

  static {
    // hack to force ProGuard to consider MysqlDatabase used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MysqlDatabase.class);
  }

  /**
   * Mysql databases on the server
   * @return value or {@code null} for none
   */
  public java.util.List<MysqlDatabase> getMysqlDatabases() {
    return mysqlDatabases;
  }

  /**
   * Mysql databases on the server
   * @param mysqlDatabases mysqlDatabases or {@code null} for none
   */
  public MysqlRdbms setMysqlDatabases(java.util.List<MysqlDatabase> mysqlDatabases) {
    this.mysqlDatabases = mysqlDatabases;
    return this;
  }

  @Override
  public MysqlRdbms set(String fieldName, Object value) {
    return (MysqlRdbms) super.set(fieldName, value);
  }

  @Override
  public MysqlRdbms clone() {
    return (MysqlRdbms) super.clone();
  }

}
