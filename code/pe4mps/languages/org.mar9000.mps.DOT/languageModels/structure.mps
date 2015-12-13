<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:0a5cde58-e4de-49c7-8dfd-235c9466b7e4(org.mar9000.mps.DOT.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1082978164219" name="jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration" flags="ng" index="AxPO7">
        <property id="1197591154882" name="memberIdentifierPolicy" index="3lZH7k" />
        <reference id="1083171729157" name="memberDataType" index="M4eZT" />
        <child id="1083172003582" name="member" index="M5hS2" />
      </concept>
      <concept id="1082978499127" name="jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration" flags="ng" index="Az7Fb">
        <property id="1083066089218" name="constraint" index="FLfZY" />
      </concept>
      <concept id="1083171877298" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ig" index="M4N5e">
        <property id="1083923523172" name="externalValue" index="1uS6qo" />
        <property id="1083923523171" name="internalValue" index="1uS6qv" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <property id="1587916991969465369" name="conceptId" index="1pbfSe" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169125989551" name="jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration" flags="ig" index="PlHQZ" />
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="12_ge$wSoPk">
    <property role="1pbfSe" value="830918205" />
    <property role="TrG5h" value="Graph" />
    <property role="19KtqR" value="true" />
    <node concept="1TJgyi" id="12_ge$wSoQ1" role="1TKVEl">
      <property role="TrG5h" value="strict" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoQp" role="1TKVEl">
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="12_ge$wSoPD" resolve="GraphType" />
    </node>
    <node concept="PrWs8" id="12_ge$wSoQr" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoQu" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="statementList" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="12_ge$wSoPl" resolve="Statement" />
    </node>
  </node>
  <node concept="PlHQZ" id="12_ge$wSoPl">
    <property role="1pbfSe" value="830918206" />
    <property role="TrG5h" value="Statement" />
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPm">
    <property role="1pbfSe" value="830918207" />
    <property role="TrG5h" value="AssignmentStatement" />
    <node concept="PrWs8" id="12_ge$wSoPK" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoQY" role="1TKVEl">
      <property role="TrG5h" value="left" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoR3" role="1TKVEl">
      <property role="TrG5h" value="right" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPn">
    <property role="1pbfSe" value="830918208" />
    <property role="TrG5h" value="AttributeStatement" />
    <node concept="PrWs8" id="12_ge$wSoPL" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoRb" role="1TKVEl">
      <property role="TrG5h" value="attributeType" />
      <ref role="AX2Wp" node="12_ge$wSoPo" resolve="AttributeStatement_attributeTypeEnum" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoRd" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="multipleList" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="12_ge$wSoPs" resolve="AttributeMultipleList" />
    </node>
  </node>
  <node concept="AxPO7" id="12_ge$wSoPo">
    <property role="TrG5h" value="AttributeStatement_attributeTypeEnum" />
    <property role="3lZH7k" value="derive_from_internal_value" />
    <ref role="M4eZT" to="tpck:fKAOsGN" resolve="string" />
    <node concept="M4N5e" id="12_ge$wSoPp" role="M5hS2">
      <property role="1uS6qo" value="graph" />
      <property role="1uS6qv" value="GRAPH" />
    </node>
    <node concept="M4N5e" id="12_ge$wSoPq" role="M5hS2">
      <property role="1uS6qo" value="node" />
      <property role="1uS6qv" value="NODE" />
    </node>
    <node concept="M4N5e" id="12_ge$wSoPr" role="M5hS2">
      <property role="1uS6qo" value="edge" />
      <property role="1uS6qv" value="EDGE" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPs">
    <property role="1pbfSe" value="830918213" />
    <property role="TrG5h" value="AttributeMultipleList" />
    <node concept="1TJgyj" id="12_ge$wSoRl" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="lists" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="12_ge$wSoPt" resolve="AttributeList" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPt">
    <property role="1pbfSe" value="830918214" />
    <property role="TrG5h" value="AttributeList" />
    <property role="34LRSv" value="[" />
    <node concept="1TJgyj" id="12_ge$wSoRr" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="attributeList" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="12_ge$wSoPu" resolve="AttributeValue" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPu">
    <property role="1pbfSe" value="830918215" />
    <property role="TrG5h" value="AttributeValue" />
    <node concept="1TJgyi" id="12_ge$wSoRF" role="1TKVEl">
      <property role="TrG5h" value="name" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoRH" role="1TKVEl">
      <property role="TrG5h" value="valueFlagGroup" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoSd" role="1TKVEl">
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
  </node>
  <node concept="PlHQZ" id="12_ge$wSoPv">
    <property role="1pbfSe" value="830918216" />
    <property role="TrG5h" value="EdgeEnd" />
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPw">
    <property role="1pbfSe" value="830918217" />
    <property role="TrG5h" value="EdgeRHS" />
    <node concept="1TJgyi" id="12_ge$wSoSi" role="1TKVEl">
      <property role="TrG5h" value="operator" />
      <ref role="AX2Wp" node="12_ge$wSoPG" resolve="EdgeOperator" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSk" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="end" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="12_ge$wSoPv" resolve="EdgeEnd" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPx">
    <property role="1pbfSe" value="830918218" />
    <property role="TrG5h" value="EdgeStatement" />
    <node concept="PrWs8" id="12_ge$wSoPM" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSp" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="start" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="12_ge$wSoPv" resolve="EdgeEnd" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSr" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="endList" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="12_ge$wSoPw" resolve="EdgeRHS" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSH" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="multipleList" />
      <property role="20lbJX" value="0..1" />
      <ref role="20lvS9" node="12_ge$wSoPs" resolve="AttributeMultipleList" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPy">
    <property role="1pbfSe" value="830918219" />
    <property role="TrG5h" value="NodeStatement" />
    <node concept="PrWs8" id="12_ge$wSoPN" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSP" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="nodeId" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="12_ge$wSoPz" resolve="NodeId" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoSR" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="multipleList" />
      <property role="20lbJX" value="0..1" />
      <ref role="20lvS9" node="12_ge$wSoPs" resolve="AttributeMultipleList" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPz">
    <property role="1pbfSe" value="830918220" />
    <property role="TrG5h" value="NodeId" />
    <node concept="PrWs8" id="12_ge$wSoPO" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPv" resolve="EdgeEnd" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoSZ" role="1TKVEl">
      <property role="TrG5h" value="id" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoT1" role="1TKVEl">
      <property role="TrG5h" value="firstFlagGroup" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoTx" role="1TKVEl">
      <property role="TrG5h" value="first" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoTz" role="1TKVEl">
      <property role="TrG5h" value="secondFlagGroup" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoU4" role="1TKVEl">
      <property role="TrG5h" value="second" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoP$">
    <property role="1pbfSe" value="830918221" />
    <property role="TrG5h" value="Subgraph" />
    <property role="34LRSv" value="{" />
    <node concept="PrWs8" id="12_ge$wSoPP" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="PrWs8" id="12_ge$wSoPQ" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPv" resolve="EdgeEnd" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoU9" role="1TKVEl">
      <property role="TrG5h" value="labelFlagGroup" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoUD" role="1TKVEl">
      <property role="TrG5h" value="label" />
      <ref role="AX2Wp" node="12_ge$wSoPJ" resolve="Id" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoUF" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="statementList" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="12_ge$wSoPl" resolve="Statement" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoP_">
    <property role="1pbfSe" value="830918222" />
    <property role="TrG5h" value="Comment" />
    <property role="34LRSv" value="/*" />
    <node concept="PrWs8" id="12_ge$wSoPR" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyj" id="12_ge$wSoVb" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="lines" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="12_ge$wSoPA" resolve="CommentLine" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPA">
    <property role="1pbfSe" value="830918223" />
    <property role="TrG5h" value="CommentLine" />
    <node concept="1TJgyi" id="12_ge$wSoVF" role="1TKVEl">
      <property role="TrG5h" value="line" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPB">
    <property role="1pbfSe" value="830918224" />
    <property role="TrG5h" value="LineComment" />
    <property role="34LRSv" value="//" />
    <node concept="PrWs8" id="12_ge$wSoPS" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoVN" role="1TKVEl">
      <property role="TrG5h" value="comment" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="12_ge$wSoPC">
    <property role="1pbfSe" value="830918225" />
    <property role="TrG5h" value="PreProc" />
    <property role="34LRSv" value="#" />
    <node concept="PrWs8" id="12_ge$wSoPT" role="PzmwI">
      <ref role="PrY4T" node="12_ge$wSoPl" resolve="Statement" />
    </node>
    <node concept="1TJgyi" id="12_ge$wSoVV" role="1TKVEl">
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="AxPO7" id="12_ge$wSoPD">
    <property role="TrG5h" value="GraphType" />
    <property role="3lZH7k" value="derive_from_internal_value" />
    <ref role="M4eZT" to="tpck:fKAOsGN" resolve="string" />
    <node concept="M4N5e" id="12_ge$wSoPE" role="M5hS2">
      <property role="1uS6qo" value="graph" />
      <property role="1uS6qv" value="GRAPH" />
    </node>
    <node concept="M4N5e" id="12_ge$wSoPF" role="M5hS2">
      <property role="1uS6qo" value="digraph" />
      <property role="1uS6qv" value="DIGRAPH" />
    </node>
  </node>
  <node concept="AxPO7" id="12_ge$wSoPG">
    <property role="TrG5h" value="EdgeOperator" />
    <property role="3lZH7k" value="derive_from_internal_value" />
    <ref role="M4eZT" to="tpck:fKAOsGN" resolve="string" />
    <node concept="M4N5e" id="12_ge$wSoPH" role="M5hS2">
      <property role="1uS6qo" value="-&gt;" />
      <property role="1uS6qv" value="DIRECTED" />
    </node>
    <node concept="M4N5e" id="12_ge$wSoPI" role="M5hS2">
      <property role="1uS6qo" value="--" />
      <property role="1uS6qv" value="UNDIRECTED" />
    </node>
  </node>
  <node concept="Az7Fb" id="12_ge$wSoPJ">
    <property role="TrG5h" value="Id" />
    <property role="FLfZY" value="[a-zA-Z\\u0080-\\u00FF_]([a-zA-Z\\u0080-\\u00FF_]|[0-9])*|\&quot;(\\\\[\\\\\&quot;]|[^\\\\\&quot;])*\&quot;|\\&lt;(\\&lt;.*?\\&gt;|[^\\&lt;\\&gt;])*\\&gt;|\\-?(\\.[0-9]+|[0-9]+(\\.[0-9]*)?)" />
  </node>
</model>

