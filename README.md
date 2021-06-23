# Design patterns
The project of design patterns.

## Table of contents
1. [Structural patterns](#structural-patterns)
    * [Adapter](#11-adapter-pattern)
    * [Decorator](#12-decorator-pattern)
2. [Creational patterns](#creational-patterns)
    * [Builder](#21-builder-pattern)
3.  [Behavioral patterns](#behavioral-patterns)
    * [Command](#31-command-pattern)

## Structural patterns 
### 1.1. Adapter pattern
__Adopting new functionality.__
> * Adapter pattern works as a bridge between two incompatible interfaces.
> * The adapter class is responsible to join functionalities of independent or incompatible interfaces.
> * So, the adapter class is designed to add new functionality to the old class.

### 1.2. Decorator pattern
__Improvement and development of the object.__
> * The decorator class wraps the original class and provides additional functionality without altering its structure.
> * The decorator class must have the same interface as the object it will decorate.
> * The decorated object must be passed to the decorator object.
> * The existing object receives new functionality at runtime. 

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

