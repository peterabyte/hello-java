# Hello JMH

## Overview

This is simple example to understand the basics of *JMH*.

## Dependencies

### Runtime dependencies

*[JMH](https://www.antlr.org/)*: JMH (Java Microbenchmark Harness) is a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM.

### Dev dependencies

*[gradle](https://gradle.org/)*: Gradle is an open source build automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven of declaring the project configuration.

## How to

### Setup

The following software should be installed on your computer.

* Java

* gradle

### Benchmarks

To run the JMH benchmark tests just run the command

* from the root folder: `gradle jmh:clean jmh:jmh`

* from the subproject folder (`./jmh`): `gradle clean jmh`
