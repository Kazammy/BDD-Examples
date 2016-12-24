# BDD-Examples
example of BDD (Behavior Driven Development

## List of main BDD frameworks in Java World
I am taking in account only the frameworks based on Java language. 

* Cucumber-jvm
* JBehave
* Concordion
* JGiven
* Serenity BDD

## Cucumber-jvm
Cucumber can be consider as the reference framework for BDD.
Cucumber is not limited in Java but exists in a lot of language.
The java version is called Cucumber-jvm.

Cucumber-jvm works both with JUnit and TestNG. But to configure it with TestNG is quite difficult.

The scenario is written in plain text. 

## Concordion

Concordion works well with JUnit. But it does not work with testNG.

With Concordion the scenario is written in HTML or in md files.

## JGiven

JGiven works both with JUnit and TestNG.

With JGiven, the scenario is not written but generated from the java code.

## Frameworks comparison

Framework    | First version | Language          | JUnit and TestNG integration
------------ | ------------- | ----------------- | ----------------------------
Cucumber-jvm | 2012          | plain test + java | JUnit + TestNG (but ...)
JBehave      | 2008          |                   | 
Concordion   | 2008          | Html or md + java | JUnit only  
JGiven       | 2014          | java only         | JUnit + TestNG
Serenity BDD | 2015          |                   |

