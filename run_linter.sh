#!/usr/bin/env bash

java -jar ./linter/checkstyle-8.45.1-all.jar \
     -c ./linter/sun_checks.xml \
     *.java
