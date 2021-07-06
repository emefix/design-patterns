# Design patterns
The project of design patterns.

## Table of contents
1. [Structural patterns](#structural-patterns)
    * [Adapter](#11-adapter-pattern)
    * [Decorator](#12-decorator-pattern)
    * [Composite](#13-composite-pattern)
2. [Creational patterns](#creational-patterns)
    * [Builder](#21-builder-pattern)
    * [Factory](#22-factory-pattern)
    * [Abstract factory](#23-abstract-factory-pattern)
3.  [Behavioral patterns](#behavioral-patterns)
    * [Command](#31-command-pattern)
    * [Strategy](#32-strategy-pattern)
    * [Observer](#33-observer-pattern)

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

### 1.3. Composite pattern
__A tree structure of group of object.__
> * Composite pattern treats a group of object in similar way as a single object.
> * This pattern composes objects in term of a tree structure to represent a hierarchy.
> * A class that contains a group of its own objects provides ways to modify them.

## Creational patterns
### 2.1. Builder pattern
__Building an object with fragments.__
> * To build a complex object, first create the necessary simple objects.
> * The builder class decides what a given object should look like and builds the final object step by step.
> * Use when the class being built has more than 4-5 member fields.

### 2.2. Factory pattern
__Creating objects.__
> * Creating an object without exposing the creation logic to the client.
> * Referring to newly created object using a common interface.

### 2.3. Abstract factory pattern
__Factory of factories.__
> * A super-factory which creates other factories.
> * An interface is responsible for creating a factory of related objects.
> * A factory producer class includes a static method that returns an abstract factory type object as specified by the factory selection parameter.
> * Each generated factory can give the objects as per the factory pattern.

## Behavioral patterns
### 3.1. Command pattern
__User request wrapping.__
> * A request is wrapped under an object as a command.
> * Object must be subordinate to one interface, containing one method that performs the specified request.
> * The invoker object passes the command to the appropriate recipient which can handle this command in order to execute command.

### 3.2. Strategy pattern
__Family of algorithms being classes.__
> * Creating objects which represent various strategies.
> * A context object selects which algorithm will be executed.
> * The behavior of the context object varies as per its strategy object.

### 3.3. Observer pattern
__One-to-many relationship between objects.__
> * If one object is modified, its dependent objects are to be notified automatically.
> * Subject class has methods to attach and detach observers.
> * Observer abstract class has a Subject object and an update method. 