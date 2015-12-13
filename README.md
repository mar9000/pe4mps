# PE4MPS
Project to create an MPS language from its textual description given with the PE grammar.

## Setup

The version of MPS to use is *MPS-3.3-RC1*.

## Getting started

This project utilizes the [PE project](https://github.com/mar9000/pe "PE project") to parse `.pe` files and construct the AST of the language described by the `.pe` file, the AST is then imported into MPS.

PE4MPS is at the moment capable to create:

  * Concepts.
  * Interfaces.
  * Enums.
  * Constrained datatype.
  * Concept editors with some intentions to display/hide optional child or property.

The TextGen aspect should be easily derived with rules similar to those used for generating editors and will be one of
next implemented features.

Once you have imported the project under `code/p24mps` in MPS:

  * a small language *org.mar9000.pemap* to create *PEMapping* nodes.
  * a PEMapping simply map an external `.pe` file to an MPS language.
  * the imported DOT language and its sandbox solution.
  * the plugin solution *org.mar9000.pe.import* used to add a menu to the *Tools* menu.
  * the solution *org.mar9000.pe.import* containing the *MPSPEImporter* class.

The solution *org.mar9000.pemap.sandbox* has a PEMapping already configured to import `/opt/working-dir/pe/tests/pe/DOT.pe` into the *org.mar9000.mps.DOT* language. If you want to test the import of the language you should put into *PE file path* the location of the DOT.pe file that you can find into the PE project.

The additional menu under *Tools* is *Import PE file* and appears only when you are over a *PEMapping* node.
