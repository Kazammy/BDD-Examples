# BDD-Examples
example of BDD (Behavior Driven Development

## List of main BDD frameworks in Java World
I am taking in account only the frameworks based on Java language. 

### list of active frameworks 

* Cucumber-jvm
* JBehave
* Concordion
* JGiven
* Serenity BDD

### list of dead project
 
 * JDave (2011)
 * Easyb (2014)

## Cucumber-jvm
Cucumber can be consider as the reference framework for BDD.
Cucumber is not limited in Java but exists in a lot of language.
The java version is called Cucumber-jvm.

Cucumber-jvm works both with JUnit and TestNG.
Cucumber-jvm has a plugin Eclipse.

The scenario is written in plain text.

## JBehave

JBehave has a plugin Eclipse. 

## Concordion

Concordion works well with JUnit. But it does not work with testNG.

With Concordion the scenario is written in HTML or in md files.

## JGiven

JGiven works both with JUnit and TestNG.

With JGiven, the scenario is not written but generated from the java code.

## Frameworks comparison

Framework    | First version | Language                            | JUnit and TestNG integration | Eclipse integration
------------ | ------------- | ----------------------------------- | -----------------------------|--------------------
Cucumber-jvm | 2012          | plain test (Gherkin syntaxe) + java | JUnit + TestNG				  | Yes	
JBehave      | 2008          |                                     |                              | Yes 
Concordion   | 2008          | Html or md + java                   | JUnit only  				  | ?
JGiven       | 2014          | java only                           | JUnit + TestNG				  | ?
Serenity BDD | 2015          |                                     |                              | ?

