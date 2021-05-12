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

package com.google.api.services.sheets.v4.model;

/**
 * The specifications of a slicer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SlicerSpec extends com.google.api.client.json.GenericJson {

  /**
   * True if the filter should apply to pivot tables. If not set, default to `True`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean applyToPivotTables;

  /**
   * The background color of the slicer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color backgroundColor;

  /**
   * The background color of the slicer. If background_color is also set, this field takes
   * precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle backgroundColorStyle;

  /**
   * The column index in the data table on which the filter is applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnIndex;

  /**
   * The data range of the slicer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange dataRange;

  /**
   * The filtering criteria of the slicer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterCriteria filterCriteria;

  /**
   * The horizontal alignment of title in the slicer. If unspecified, defaults to `LEFT`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String horizontalAlignment;

  /**
   * The text format of title in the slicer. The link field is not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat textFormat;

  /**
   * The title of the slicer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * True if the filter should apply to pivot tables. If not set, default to `True`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApplyToPivotTables() {
    return applyToPivotTables;
  }

  /**
   * True if the filter should apply to pivot tables. If not set, default to `True`.
   * @param applyToPivotTables applyToPivotTables or {@code null} for none
   */
  public SlicerSpec setApplyToPivotTables(java.lang.Boolean applyToPivotTables) {
    this.applyToPivotTables = applyToPivotTables;
    return this;
  }

  /**
   * The background color of the slicer.
   * @return value or {@code null} for none
   */
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background color of the slicer.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public SlicerSpec setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The background color of the slicer. If background_color is also set, this field takes
   * precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getBackgroundColorStyle() {
    return backgroundColorStyle;
  }

  /**
   * The background color of the slicer. If background_color is also set, this field takes
   * precedence.
   * @param backgroundColorStyle backgroundColorStyle or {@code null} for none
   */
  public SlicerSpec setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
    this.backgroundColorStyle = backgroundColorStyle;
    return this;
  }

  /**
   * The column index in the data table on which the filter is applied to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnIndex() {
    return columnIndex;
  }

  /**
   * The column index in the data table on which the filter is applied to.
   * @param columnIndex columnIndex or {@code null} for none
   */
  public SlicerSpec setColumnIndex(java.lang.Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

  /**
   * The data range of the slicer.
   * @return value or {@code null} for none
   */
  public GridRange getDataRange() {
    return dataRange;
  }

  /**
   * The data range of the slicer.
   * @param dataRange dataRange or {@code null} for none
   */
  public SlicerSpec setDataRange(GridRange dataRange) {
    this.dataRange = dataRange;
    return this;
  }

  /**
   * The filtering criteria of the slicer.
   * @return value or {@code null} for none
   */
  public FilterCriteria getFilterCriteria() {
    return filterCriteria;
  }

  /**
   * The filtering criteria of the slicer.
   * @param filterCriteria filterCriteria or {@code null} for none
   */
  public SlicerSpec setFilterCriteria(FilterCriteria filterCriteria) {
    this.filterCriteria = filterCriteria;
    return this;
  }

  /**
   * The horizontal alignment of title in the slicer. If unspecified, defaults to `LEFT`
   * @return value or {@code null} for none
   */
  public java.lang.String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * The horizontal alignment of title in the slicer. If unspecified, defaults to `LEFT`
   * @param horizontalAlignment horizontalAlignment or {@code null} for none
   */
  public SlicerSpec setHorizontalAlignment(java.lang.String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

  /**
   * The text format of title in the slicer. The link field is not supported.
   * @return value or {@code null} for none
   */
  public TextFormat getTextFormat() {
    return textFormat;
  }

  /**
   * The text format of title in the slicer. The link field is not supported.
   * @param textFormat textFormat or {@code null} for none
   */
  public SlicerSpec setTextFormat(TextFormat textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  /**
   * The title of the slicer.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the slicer.
   * @param title title or {@code null} for none
   */
  public SlicerSpec setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public SlicerSpec set(String fieldName, Object value) {
    return (SlicerSpec) super.set(fieldName, value);
  }

  @Override
  public SlicerSpec clone() {
    return (SlicerSpec) super.clone();
  }

}
