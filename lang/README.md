# Hello Java

## Overview

This is simple project to track major features and changes in the Java language versions starting from Java 8.

## Dependencies

### Dev dependencies

*[gradle](https://gradle.org/)*: Gradle is an open source build automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven of declaring the project configuration.

## How to

### Setup

The following software should be installed on your computer.

* Java

* gradle

## Java versions

### Java 8 (LTS)

* **static and default methods in interfaces**
* **Optional<T>**
* **Functional interfaces**
* **Lambda Expressions**
* **Stream API**

Links:

* https://www.baeldung.com/java-8-new-features

### Java 9

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

### Java 10

* **Local-variable type inference**: This feature is only available only for local variables with the initializer.
* Changes related to **unmodifiable collections**
* **Optional.orElseThrow()**
* **Performance improvements**
* **Container awareness**: JVMs are now aware of being run in a Docker container.
* **Time-based release versioning**: A new Java release every six months. Support for feature releases will last only for six months. LTS support will be for three years.

Links:

* https://www.baeldung.com/java-10-overview
* https://www.baeldung.com/java-10-local-variable-type-inference

### Java 11 (LTS)

* **New String methods**: New `isBlank`, `lines`, `strip`, `stripLeading`, `stripTrailing` and `repeat` methods in `String`.
* **New File methods**: New `readString` and `writeString` static methods in `Files`.
* **Collection to an Array**: New default `toArray` method in `java.util.Collection`.
* **not Preidcate method**: New static `not` method in `Predicate`.
* **Local-variable syntax for lambda**: Local-variable syntax in lambda parameters.
* **HTTP client**
* **Nest based access control**: Java 11 introduces the notion of nestmates and the associated access rules within the JVM.
* **Running Java files**: No need to compile the Java source files with `javac` explicitly. It's possible to directly run the file using `java`.
* **Performance enhancements**
  * no-op garbage collector
  * Java Flight Recorder (JFR) is open-source in OpenJDK.
* **Removed and Deprecated**
  * JDK Mission Control (JMC) is no longer included in the JDK. A standalone version of JMC is available as a separate download.
  * Nashhorn JavaScript engine
  * JavaFX modules
  * Java EE and CORBA modules

Links:

* https://www.baeldung.com/java-11-new-features
* https://www.baeldung.com/java-11-string-api
* https://www.baeldung.com/java-negate-predicate-method-reference
* https://www.baeldung.com/java-var-lambda-params
* https://www.baeldung.com/java-nest-based-access-control  

### Java 12

* **New String methods**: New `indent` and `transform` methods.
* **New File method**: New `mismatch` method which compare to files and finds the position of the first mismatched byte in their contents.
* **New teeing collector**: It is a composite of two downstream collectors. Every element is processed by both collectors and their results are merged.
* **Compact number formatting**
* Preview changes:
  * Switch expressions
  * Pattern matching for instanceof
* JVM changes:
  * New Shenandoah low-pause-time garbage collector
  * Microbenchmark suite
  * Default CDS archive: The Class Data Sharing (CDS) feaure helps reduce the startup time and memory footprint between multiple Java Virtual Machines.

Links:

* https://www.baeldung.com/java-12-new-features
