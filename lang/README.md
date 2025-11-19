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
* **Preview** changes:
  * Switch expressions
  * Pattern matching for instanceof
* JVM changes:
  * New Shenandoah low-pause-time garbage collector
  * Microbenchmark suite
  * Default CDS archive: The Class Data Sharing (CDS) feaure helps reduce the startup time and memory footprint between multiple Java Virtual Machines.

Links:

* https://www.baeldung.com/java-12-new-features

### Java 13

* **Preview** changes:
  * Switch expressions: Using `yield` we can return values from a switch expression.
  * Text blocks: Multi-line String.
* **Dynamic CDS archives**: Class metadata can be shared across different JVMs to reduce startup time and memory footprint. A shared archive can be generated at the time the application is exiting. This eliminates the need for trial runs.
* Legacy socket API reimplemented

Links:

* https://www.baeldung.com/java-13-new-features

### Java 14

* **Switch expressions**
* **Helpful NullPointerException**: Point out what exactly was null in a given line of code.
* **Preview** changes:
  * Pattern matching for instanceof
  * Text blocks
  * Records: To reduce boilerplate code in data model POJOs.

Links:

* https://www.baeldung.com/java-14-new-features

### Java 15

* **Text blocks**
* **Hidden classes**
* **Preview** changes:
  * Records
  * Sealed classes: The aim of sealed classes is to allow individual classes to declare which types may be used as a sub-type.

Links:

* https://www.baeldung.com/java-15-new

### Java 16

* Invoke default methds from Proxy instances
* Day Period Support
* Add `Stream.toList` method
* Pattern matching for instanceof
* **Preview** features:
  * Sealed classes
  * Records
* **Incubator**:
  * Vector API

Links:

* https://www.baeldung.com/java-16-new-features

### Java 17 (LTS)

* Restore always-strict floating-point semantics: The dafult floating-point operations are strict or strictfp, both of which guarantee the same results from the floating-point calculations on every platform.
* Enhanced pseudo-random number generators
* Strongly encapsulate JDK internals
* Remove RMI activation API
* Deprecate the Security Manager for removal
* Sealed classes
* **Preview**:
  * Pattern matching for switch
* **Incubator**:
  * Foreign function and memory API: The foreign function and memory API allow Java developers to access code from outside the JVM and manage memory out of the heap.
  * Vector API

Links:

* https://www.baeldung.com/java-17-new-features
* https://www.oracle.com/java/technologies/javase/17-relnote-issues.html

### Java 18

* UTF-8 by default: Starting with JDK 18, UTF-8 is the default charset for the Java SE APIs.
* Simple Web Server: jwebserver, a command-line tool to start a minimal static web server
* Reimplement Core Reflection With Method Handles
* Internet-Address Resolution SPI: Introduce a service-provider interface (SPI) for host name and address resolution.
* **Preview**:
  * Pattern matching for switch
* **Incubator**:
  * Foreign function and memory API: The foreign function and memory API allow Java developers to access code from outside the JVM and manage memory out of the heap.
  * Vector API

Links:

* https://www.oracle.com/java/technologies/javase/18-relnote-issues.html

### Java 19

* New Methods to Create Preallocated HashMaps and HashSets
* Additional Date-Time Formats
* **Preview**:
  * Record Patterns
  * Pattern Matching for switch
  * Foreign Function & Memory API
* **Incubator**:
  * Virtual Threads: Virtual threads are lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications.
  * Structured Concurrency
  * Vector API

Links:

* https://www.oracle.com/java/technologies/javase/19-relnote-issues.html

### Java 20

* **Preview**:
  * Record Patterns
  * Pattern Matching for switch
  * Foreign Function & Memory API
* **Incubator**:
  * Scoped Values: Introduce scoped values, which enable the sharing of immutable data within and across threads. They are preferred to thread-local variables, especially when using large numbers of virtual threads.
  * Virtual Threads
  * Structured Concurrency
  * Vector API

Links:

* https://www.baeldung.com/java-20-new-features
* https://www.oracle.com/java/technologies/javase/20-relnote-issues.html

### Java 21 (LTS)

* Record patterns
* Pattern Matching for switch
* Virtual Threads: **Virtual threads are lightweight threads with the purpose of reducing the effort of developing high-concurrent applications.** Traditional threads, also called platform threads, are thin wrappers around OS threads. One of the major issues with platform threads is that they run the code on the OS thread and capture the OS thread throughout its lifetime. There is a limit to the number of OS threads, and this creates a scalability bottleneck. Like platform threads, a virtual thread is also an instance of java.lang.Thread class, but it isn’t tied to a specific OS thread. **It runs the code on a specific OS thread but does not capture the thread for an entire lifetime.** Therefore, many virtual threads can share OS threads to run their code.
* Sequenced Collections: Java 21 introduced three new interfaces to represent **sequenced collections, sequenced sets, and sequenced maps**. **A sequenced collection is a collection whose elements have a defined encounter order.** It has first and last elements, and the elements between them have successors and predecessors.
* Key encapsulation mechanism API: Introduce an API for key encapsulation mechanisms (KEMs), an encryption technique for securing symmetric keys using public key cryptography.
* **Preview**:
  * Unnamed variables and patterns
  * String Templates
  * Implicitly declared classes and instance main methods
  * Structured Concurrency
  * Scoped Values
  * Vector API

Links:

* https://www.baeldung.com/java-lts-21-new-features
* https://www.oracle.com/java/technologies/javase/21-relnote-issues.html

### Java 22

* Unnamed variables and patterns
* Foreign Function and Memory API: Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI.
* **Preview**:
  * Statements before `super(...)`
  * Stream Gatherers
  * String Templates
  * Implicitly declared classes and instance main methods
  * Class-File API: Provide a standard API for parsing, generating, and transforming Java class files.
  * Structured Concurrency
  * Scoped Values
  * Vector API

Links:

* https://www.baeldung.com/java-22-overview
* https://www.oracle.com/java/technologies/javase/22-relnote-issues.html