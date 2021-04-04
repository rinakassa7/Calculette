#!/bin/bash

export CLASSPATH=".:/usr/local/lib/*:$CLASSPATH"
java org.antlr.v4.Tool MVaP.g4
javac MVaPAssembler.java CBaP.java
java CBaP -d test.mvap.cbap

