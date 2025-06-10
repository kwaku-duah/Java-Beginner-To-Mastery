Lambda expressions additions booted the overall expressive power of java
It helped java to take advantage of parallel processing

it brought the addition of default method etc

A lambda expression is basically an anonymous (unnamed) method. However, this 
method is not executed on its own, instead it is used to implement a method
defined by a functional interface

Lambda expressions results in anonynous classes...They are commonly referred to
us closures

Functional interface is an interface that contains one and only one abstract method
The method specifies the intent of the interface. A functional interface represents a 
single action
It defines the target type of a lambda expression
A lambda expression is used only if its target type is specified
a functional interface is also sometimes called single abstract method, SAM
A functional interface may specify public Object such equals() and that does not 
affect the functional status because Object is considered implicit members of a functional interface


