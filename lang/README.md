# Hello JAVA

## Overview

This is simple project to track major features and changes in the JAVA language versions starting from JAVA 8.

## Dependencies

### Dev dependencies

*[gradle](https://gradle.org/)*: Gradle is an open source build automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven of declaring the project configuration.

## How to

### Setup

The following software should be installed on your computer.

* Java

* gradle

## JAVA versions

### JAVA 8

* **static and default methods in interfaces**
* **Optional<T>**
* **Functional interfaces**
* **Lambda Expressions**
* **Stream API**

Links:

* https://www.baeldung.com/java-8-new-features

### JAVA 9

* **Modularity** (separate example in `lang-module`)
* **try-with-resources** enhancements
* **Diamond Operator Extension**
* **Interface Private Method**
* **Unified JVM Logging**
* **Immutable Set**

Links:

* https://www.baeldung.com/new-java-9
* https://www.baeldung.com/java-modularity

#### Modularity

The `lang-module` sub-module contains a short example on the **modularity** feature in Java 9. To run it execute `gradle lang-module:clean lang-module:integrationTest`

One issue is that the test does not execute from VS Code because the IDE can not find the `org.junit.jupiter.api` module. Most probably the module-path is not set properly.
