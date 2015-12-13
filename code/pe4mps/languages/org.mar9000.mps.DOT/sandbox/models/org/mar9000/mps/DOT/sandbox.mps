<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:5531c883-df0b-46bc-b5c3-532821d9891f(org.mar9000.mps.DOT.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="89a77184-079e-486c-b33a-b2d6a93507f2" name="org.mar9000.mps.DOT" version="-1" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="-1" />
  </languages>
  <imports />
  <registry>
    <language id="89a77184-079e-486c-b33a-b2d6a93507f2" name="org.mar9000.mps.DOT">
      <concept id="1199436245787315553" name="org.mar9000.mps.DOT.structure.EdgeStatement" flags="ng" index="KhcQ8">
        <child id="1199436245787315737" name="start" index="KhcVK" />
        <child id="1199436245787315739" name="endList" index="KhcVM" />
      </concept>
      <concept id="1199436245787315552" name="org.mar9000.mps.DOT.structure.EdgeRHS" flags="ng" index="KhcQ9">
        <child id="1199436245787315732" name="end" index="KhcVX" />
      </concept>
      <concept id="1199436245787315555" name="org.mar9000.mps.DOT.structure.NodeId" flags="ng" index="KhcQa">
        <property id="1199436245787315809" name="first" index="KhcU8" />
        <property id="1199436245787315777" name="firstFlagGroup" index="KhcUC" />
        <property id="1199436245787315775" name="id" index="KhcVm" />
      </concept>
      <concept id="1199436245787315554" name="org.mar9000.mps.DOT.structure.NodeStatement" flags="ng" index="KhcQb">
        <child id="1199436245787315765" name="nodeId" index="KhcVs" />
        <child id="1199436245787315767" name="multipleList" index="KhcVu" />
      </concept>
      <concept id="1199436245787315556" name="org.mar9000.mps.DOT.structure.Subgraph" flags="ng" index="KhcQd">
        <property id="1199436245787315881" name="label" index="KhcT0" />
        <property id="1199436245787315849" name="labelFlagGroup" index="KhcTw" />
        <child id="1199436245787315883" name="statementList" index="KhcT2" />
      </concept>
      <concept id="1199436245787315549" name="org.mar9000.mps.DOT.structure.AttributeList" flags="ng" index="KhcQO">
        <child id="1199436245787315675" name="attributeList" index="KhcOM" />
      </concept>
      <concept id="1199436245787315548" name="org.mar9000.mps.DOT.structure.AttributeMultipleList" flags="ng" index="KhcQP">
        <child id="1199436245787315669" name="lists" index="KhcOW" />
      </concept>
      <concept id="1199436245787315550" name="org.mar9000.mps.DOT.structure.AttributeValue" flags="ng" index="KhcQR">
        <property id="1199436245787315691" name="name" index="KhcO2" />
        <property id="1199436245787315693" name="valueFlagGroup" index="KhcO4" />
        <property id="1199436245787315725" name="value" index="KhcV$" />
      </concept>
      <concept id="1199436245787315540" name="org.mar9000.mps.DOT.structure.Graph" flags="ng" index="KhcQX">
        <child id="1199436245787315614" name="statementList" index="KhcPR" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="KhcQX" id="12_ge$wSsoM">
    <property role="TrG5h" value="G" />
    <node concept="KhcQb" id="12_ge$wSsoV" role="KhcPR">
      <node concept="KhcQa" id="12_ge$wSsoX" role="KhcVs">
        <property role="KhcVm" value="a" />
      </node>
      <node concept="KhcQP" id="12_ge$wSsp3" role="KhcVu">
        <node concept="KhcQO" id="12_ge$wSsp4" role="KhcOW">
          <node concept="KhcQR" id="12_ge$wSsp5" role="KhcOM">
            <property role="KhcO2" value="label" />
            <property role="KhcO4" value="true" />
            <property role="KhcV$" value="&quot;Node A&quot;" />
          </node>
        </node>
      </node>
    </node>
    <node concept="KhcQb" id="12_ge$wSspi" role="KhcPR">
      <node concept="KhcQa" id="12_ge$wSspk" role="KhcVs">
        <property role="KhcVm" value="b" />
        <property role="KhcUC" value="true" />
        <property role="KhcU8" value="nw" />
      </node>
      <node concept="KhcQP" id="12_ge$wSspv" role="KhcVu">
        <node concept="KhcQO" id="12_ge$wSspw" role="KhcOW">
          <node concept="KhcQR" id="12_ge$wSspx" role="KhcOM">
            <property role="KhcO2" value="label" />
            <property role="KhcO4" value="true" />
            <property role="KhcV$" value="&quot;Node B&quot;" />
          </node>
        </node>
      </node>
    </node>
    <node concept="KhcQ8" id="12_ge$wSspN" role="KhcPR">
      <node concept="KhcQa" id="12_ge$wSsq9" role="KhcVK">
        <property role="KhcVm" value="a" />
      </node>
      <node concept="KhcQ9" id="12_ge$wSspQ" role="KhcVM">
        <node concept="KhcQa" id="12_ge$wSsqc" role="KhcVX">
          <property role="KhcVm" value="b" />
        </node>
      </node>
    </node>
    <node concept="KhcQd" id="12_ge$wSu5u" role="KhcPR">
      <property role="KhcTw" value="true" />
      <property role="KhcT0" value="c" />
      <node concept="KhcQb" id="12_ge$wSu5J" role="KhcT2">
        <node concept="KhcQa" id="12_ge$wSu5K" role="KhcVs">
          <property role="KhcVm" value="c" />
        </node>
        <node concept="KhcQP" id="12_ge$wSu5L" role="KhcVu">
          <node concept="KhcQO" id="12_ge$wSu5M" role="KhcOW">
            <node concept="KhcQR" id="12_ge$wSu5N" role="KhcOM">
              <property role="KhcO2" value="label" />
              <property role="KhcO4" value="true" />
              <property role="KhcV$" value="&quot;Node C&quot;" />
            </node>
          </node>
        </node>
      </node>
      <node concept="KhcQ8" id="12_ge$wSu60" role="KhcT2">
        <node concept="KhcQa" id="12_ge$wSu6f" role="KhcVK">
          <property role="KhcVm" value="c" />
        </node>
        <node concept="KhcQ9" id="12_ge$wSu63" role="KhcVM">
          <node concept="KhcQa" id="12_ge$wSu6i" role="KhcVX">
            <property role="KhcVm" value="&quot;Node D&quot;" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

