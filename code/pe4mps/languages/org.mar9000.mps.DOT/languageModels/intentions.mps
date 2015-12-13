<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:95a06b7f-099b-4ea9-927f-5c76f0c5cdbf(org.mar9000.mps.DOT.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="2sdj" ref="r:0a5cde58-e4de-49c7-8dfd-235c9466b7e4(org.mar9000.mps.DOT.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795771125" name="jetbrains.mps.lang.intentions.structure.IsApplicableBlock" flags="in" index="2SaL7w" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <property id="2522969319638091386" name="isAvailableInChildNodes" index="2ZfUl0" />
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093995" name="isApplicableFunction" index="2ZfVeh" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2S6QgY" id="12_ge$wSoQa">
    <property role="TrG5h" value="Graph_strict" />
    <ref role="2ZfgGC" to="2sdj:12_ge$wSoPk" resolve="Graph" />
    <node concept="2Sbjvc" id="12_ge$wSoQb" role="2ZfgGD">
      <node concept="3clFbS" id="12_ge$wSoQc" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoQd" role="3cqZAp">
          <node concept="37vLTI" id="12_ge$wSoQe" role="3clFbG">
            <node concept="3fqX7Q" id="12_ge$wSoQf" role="37vLTx">
              <node concept="2OqwBi" id="12_ge$wSoQg" role="3fr31v">
                <node concept="2Sf5sV" id="12_ge$wSoQh" role="2Oq$k0" />
                <node concept="3TrcHB" id="12_ge$wSoQi" role="2OqNvi">
                  <ref role="3TsBF5" to="2sdj:12_ge$wSoQ1" resolve="strict" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="12_ge$wSoQj" role="37vLTJ">
              <node concept="2Sf5sV" id="12_ge$wSoQk" role="2Oq$k0" />
              <node concept="3TrcHB" id="12_ge$wSoQl" role="2OqNvi">
                <ref role="3TsBF5" to="2sdj:12_ge$wSoQ1" resolve="strict" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2S6ZIM" id="12_ge$wSoQm" role="2ZfVej">
      <node concept="3clFbS" id="12_ge$wSoQn" role="2VODD2">
        <node concept="3cpWs6" id="12_ge$wSoQo" role="3cqZAp">
          <node concept="Xl_RD" id="12_ge$wSoQ9" role="3cqZAk">
            <property role="Xl_RC" value="Toggle Strict" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2S6QgY" id="12_ge$wSoRQ">
    <property role="2ZfUl0" value="true" />
    <property role="TrG5h" value="AttributeValue_ToggleGroupValue" />
    <ref role="2ZfgGC" to="2sdj:12_ge$wSoPu" resolve="AttributeValue" />
    <node concept="2Sbjvc" id="12_ge$wSoRR" role="2ZfgGD">
      <node concept="3clFbS" id="12_ge$wSoRS" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoRT" role="3cqZAp">
          <node concept="37vLTI" id="12_ge$wSoRU" role="3clFbG">
            <node concept="3fqX7Q" id="12_ge$wSoRV" role="37vLTx">
              <node concept="2OqwBi" id="12_ge$wSoRW" role="3fr31v">
                <node concept="2Sf5sV" id="12_ge$wSoRX" role="2Oq$k0" />
                <node concept="3TrcHB" id="12_ge$wSoRY" role="2OqNvi">
                  <ref role="3TsBF5" to="2sdj:12_ge$wSoRH" resolve="valueFlagGroup" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="12_ge$wSoRZ" role="37vLTJ">
              <node concept="2Sf5sV" id="12_ge$wSoS0" role="2Oq$k0" />
              <node concept="3TrcHB" id="12_ge$wSoS1" role="2OqNvi">
                <ref role="3TsBF5" to="2sdj:12_ge$wSoRH" resolve="valueFlagGroup" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2S6ZIM" id="12_ge$wSoS2" role="2ZfVej">
      <node concept="3clFbS" id="12_ge$wSoS3" role="2VODD2">
        <node concept="3cpWs6" id="12_ge$wSoS4" role="3cqZAp">
          <node concept="Xl_RD" id="12_ge$wSoRP" role="3cqZAk">
            <property role="Xl_RC" value="Toggle Value" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2S6QgY" id="12_ge$wSoTa">
    <property role="2ZfUl0" value="true" />
    <property role="TrG5h" value="NodeId_ToggleGroupFirst" />
    <ref role="2ZfgGC" to="2sdj:12_ge$wSoPz" resolve="NodeId" />
    <node concept="2Sbjvc" id="12_ge$wSoTb" role="2ZfgGD">
      <node concept="3clFbS" id="12_ge$wSoTc" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoTd" role="3cqZAp">
          <node concept="37vLTI" id="12_ge$wSoTe" role="3clFbG">
            <node concept="3fqX7Q" id="12_ge$wSoTf" role="37vLTx">
              <node concept="2OqwBi" id="12_ge$wSoTg" role="3fr31v">
                <node concept="2Sf5sV" id="12_ge$wSoTh" role="2Oq$k0" />
                <node concept="3TrcHB" id="12_ge$wSoTi" role="2OqNvi">
                  <ref role="3TsBF5" to="2sdj:12_ge$wSoT1" resolve="firstFlagGroup" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="12_ge$wSoTj" role="37vLTJ">
              <node concept="2Sf5sV" id="12_ge$wSoTk" role="2Oq$k0" />
              <node concept="3TrcHB" id="12_ge$wSoTl" role="2OqNvi">
                <ref role="3TsBF5" to="2sdj:12_ge$wSoT1" resolve="firstFlagGroup" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2S6ZIM" id="12_ge$wSoTm" role="2ZfVej">
      <node concept="3clFbS" id="12_ge$wSoTn" role="2VODD2">
        <node concept="3cpWs6" id="12_ge$wSoTo" role="3cqZAp">
          <node concept="Xl_RD" id="12_ge$wSoT9" role="3cqZAk">
            <property role="Xl_RC" value="Toggle First" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2S6QgY" id="12_ge$wSoTG">
    <property role="2ZfUl0" value="true" />
    <property role="TrG5h" value="NodeId_ToggleGroupSecond" />
    <ref role="2ZfgGC" to="2sdj:12_ge$wSoPz" resolve="NodeId" />
    <node concept="2Sbjvc" id="12_ge$wSoTH" role="2ZfgGD">
      <node concept="3clFbS" id="12_ge$wSoTI" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoTJ" role="3cqZAp">
          <node concept="37vLTI" id="12_ge$wSoTK" role="3clFbG">
            <node concept="3fqX7Q" id="12_ge$wSoTL" role="37vLTx">
              <node concept="2OqwBi" id="12_ge$wSoTM" role="3fr31v">
                <node concept="2Sf5sV" id="12_ge$wSoTN" role="2Oq$k0" />
                <node concept="3TrcHB" id="12_ge$wSoTO" role="2OqNvi">
                  <ref role="3TsBF5" to="2sdj:12_ge$wSoTz" resolve="secondFlagGroup" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="12_ge$wSoTP" role="37vLTJ">
              <node concept="2Sf5sV" id="12_ge$wSoTQ" role="2Oq$k0" />
              <node concept="3TrcHB" id="12_ge$wSoTR" role="2OqNvi">
                <ref role="3TsBF5" to="2sdj:12_ge$wSoTz" resolve="secondFlagGroup" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2S6ZIM" id="12_ge$wSoTS" role="2ZfVej">
      <node concept="3clFbS" id="12_ge$wSoTT" role="2VODD2">
        <node concept="3cpWs6" id="12_ge$wSoTU" role="3cqZAp">
          <node concept="Xl_RD" id="12_ge$wSoTF" role="3cqZAk">
            <property role="Xl_RC" value="Toggle Second" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2SaL7w" id="12_ge$wSoTV" role="2ZfVeh">
      <node concept="3clFbS" id="12_ge$wSoTW" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoTX" role="3cqZAp">
          <node concept="2OqwBi" id="12_ge$wSoTY" role="3clFbG">
            <node concept="2Sf5sV" id="12_ge$wSoTZ" role="2Oq$k0" />
            <node concept="3TrcHB" id="12_ge$wSoU0" role="2OqNvi">
              <ref role="3TsBF5" to="2sdj:12_ge$wSoT1" resolve="firstFlagGroup" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2S6QgY" id="12_ge$wSoUi">
    <property role="2ZfUl0" value="true" />
    <property role="TrG5h" value="Subgraph_ToggleGroupLabel" />
    <ref role="2ZfgGC" to="2sdj:12_ge$wSoP$" resolve="Subgraph" />
    <node concept="2Sbjvc" id="12_ge$wSoUj" role="2ZfgGD">
      <node concept="3clFbS" id="12_ge$wSoUk" role="2VODD2">
        <node concept="3clFbF" id="12_ge$wSoUl" role="3cqZAp">
          <node concept="37vLTI" id="12_ge$wSoUm" role="3clFbG">
            <node concept="3fqX7Q" id="12_ge$wSoUn" role="37vLTx">
              <node concept="2OqwBi" id="12_ge$wSoUo" role="3fr31v">
                <node concept="2Sf5sV" id="12_ge$wSoUp" role="2Oq$k0" />
                <node concept="3TrcHB" id="12_ge$wSoUq" role="2OqNvi">
                  <ref role="3TsBF5" to="2sdj:12_ge$wSoU9" resolve="labelFlagGroup" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="12_ge$wSoUr" role="37vLTJ">
              <node concept="2Sf5sV" id="12_ge$wSoUs" role="2Oq$k0" />
              <node concept="3TrcHB" id="12_ge$wSoUt" role="2OqNvi">
                <ref role="3TsBF5" to="2sdj:12_ge$wSoU9" resolve="labelFlagGroup" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2S6ZIM" id="12_ge$wSoUu" role="2ZfVej">
      <node concept="3clFbS" id="12_ge$wSoUv" role="2VODD2">
        <node concept="3cpWs6" id="12_ge$wSoUw" role="3cqZAp">
          <node concept="Xl_RD" id="12_ge$wSoUh" role="3cqZAk">
            <property role="Xl_RC" value="Toggle Label" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

