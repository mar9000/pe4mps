<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:adc5551a-2872-4022-9701-14ccd5186cd9(org.mar9000.pemap.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="7x96" ref="r:a323de28-5dce-42b5-90b0-98c4114dbd43(org.mar9000.pemap.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237385578942" name="jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem" flags="ln" index="pVoyu" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140114345053" name="allowEmptyText" index="1O74Pk" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1198256887712" name="jetbrains.mps.lang.editor.structure.CellModel_Indent" flags="ng" index="3XFhqQ" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="77xx_JO6VG0">
    <ref role="1XX52x" to="7x96:77xx_JO67wM" resolve="PEMapping" />
    <node concept="3EZMnI" id="77xx_JObvo1" role="2wV5jI">
      <node concept="3F0ifn" id="77xx_JObvoe" role="3EZMnx">
        <property role="3F0ifm" value="PE mapping" />
      </node>
      <node concept="3EZMnI" id="77xx_JObvoq" role="3EZMnx">
        <node concept="VPM3Z" id="77xx_JObvos" role="3F10Kt">
          <property role="VOm3f" value="false" />
        </node>
        <node concept="3XFhqQ" id="77xx_JObvoK" role="3EZMnx" />
        <node concept="3EZMnI" id="77xx_JObvpo" role="3EZMnx">
          <node concept="VPM3Z" id="77xx_JObvpq" role="3F10Kt">
            <property role="VOm3f" value="false" />
          </node>
          <node concept="3F0ifn" id="77xx_JObvpK" role="3EZMnx">
            <property role="3F0ifm" value="PE file path:" />
          </node>
          <node concept="3F0A7n" id="77xx_JObvpY" role="3EZMnx">
            <ref role="1NtTu8" to="7x96:77xx_JO6VFQ" resolve="peFilePath" />
          </node>
          <node concept="3F0ifn" id="77xx_JObvqi" role="3EZMnx">
            <property role="3F0ifm" value="import into language" />
            <node concept="pVoyu" id="77xx_JObvrf" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
          <node concept="3F0A7n" id="77xx_JObvrk" role="3EZMnx">
            <property role="1O74Pk" value="true" />
            <ref role="1NtTu8" to="7x96:77xx_JObotU" resolve="languageName" />
          </node>
          <node concept="l2Vlx" id="77xx_JObvpt" role="2iSdaV" />
        </node>
        <node concept="2iRfu4" id="77xx_JObvov" role="2iSdaV" />
      </node>
      <node concept="2iRkQZ" id="77xx_JObvo4" role="2iSdaV" />
    </node>
  </node>
</model>

