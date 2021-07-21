# Design patterns
The project of design patterns.

## Table of contents
1. [Structural patterns](#structural-patterns)
    * [Adapter](#11-adapter-pattern)
    * [Decorator](#12-decorator-pattern)
    * [Composite](#13-composite-pattern)
    * [Facade](#14-facade-pattern)
    * [Proxy](#15-proxy-pattern)
2. [Creational patterns](#creational-patterns)
    * [Builder](#21-builder-pattern)
    * [Factory](#22-factory-pattern)
    * [Abstract factory](#23-abstract-factory-pattern)
    * [Singleton](#24-singleton-pattern)
    * [Prototype](#25-prototype-pattern)
3.  [Behavioral patterns](#behavioral-patterns)
    * [Command](#31-command-pattern)
    * [Strategy](#32-strategy-pattern)
    * [Observer](#33-observer-pattern)
    * [Template method](#34-template-method-pattern)

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

### 1.4. Facade pattern
__Client interface.__
> * Facade pattern hides the complexities of the system and provides an interface to the client.
> * The client interface allows access to the system.

### 1.5. Proxy pattern
__Representation of another class.__
> * A proxy class is a simplified version of a complex or heavy object.
> * A good solution to enable or mediate access to object, either local or remote.
> * The proxy class has the original object to interface its functionality to outer world.
> * For every other subsequent call, this pattern will skip the initial configuration, and only processing will occur.

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

### 2.4. Singleton pattern
__Only one instance of the class.__
> * A single class which is responsible to create an object while making sure that only single object gets created.
> * This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
> * The static method creates its own instance of the class as a private static field.
> * The defined constructor must be parameterless and private.

### 2.5. Prototype pattern
__A duplicate of a costly object.__
> * A prototype interface tells to create a clone of the object that may include costly operations.
> * The existing object acts as a prototype and contains the state of the object.
> * The newly copied object may change same properties only if required.

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

### 3.4. Template method pattern
__Method with the algorithm template.__
> * An abstract class includes unchanged part of the algorithm in the template method.
> * Subclasses can override the method implementation as per need, but the invocation is to be in the same way as defined by the parent class.

