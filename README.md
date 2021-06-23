# Design patterns
The project of design patterns.

## Table of contents
1. [Structural patterns](#structural-patterns)
   1. [Adapter](#11-adapter-pattern)
2. [Creational patterns](#creational-patterns)
   1. [Builder](#21-builder-pattern)
3.  [Behavioral patterns](#behavioral-patterns)

## Structural patterns 
### 1.1. Adapter pattern
__Adopting new functionality.__
> * Adapter pattern works as a bridge between two incompatible interfaces.
> * The adapter class is responsible to join functionalities of independent or incompatible interfaces.
> * So, the adapter class is designed to add new functionality to the old class.

## Creational patterns
### 2.1. Builder pattern
__Building an object with fragments.__
> * To build a complex object, first create the necessary simple objects.
> * The builder class decides what a given object should look like and builds the final object step by step.
> * Use when the class being built has more than 4-5 member fields.

## Behavioral patterns
### 3.1. Command pattern
__User request wrapping.__
> * A request is wrapped under an object as a command.
> * Object must be subordinate to one interface, containing one method that performs the specified request.
> * The invoker object passes the command to the appropriate recipient which can handle this command in order to execute command.

