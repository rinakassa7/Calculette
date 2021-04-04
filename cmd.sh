#!/bin/bash

export CLASSPATH=".:/usr/local/lib/*:$CLASSPATH"
java org.antlr.v4.Tool CalculetteSuite.g4
javac *.java ./TablesSymboles.java ./AdresseType.java ./TableSymboles.java
java org.antlr.v4.gui.TestRig CalculetteSuite 'calcul' > benchmark/sources-MVaP-3.0/test.mvap
