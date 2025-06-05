Annotations remains a crucial part of java because it reduces boiler plate code
There are language defined annotations and custom defined annotations which can defined by the user
in all these are examples of some language defined annotations:

@Documented - used atop another annotation
@Inherited - can be used on a superclass to allow subclass to inherit an annotation on the superclass
@Target - very important, used to define a list items an annotation can be applied on 
It is an enumeration with values such as ElementType.METHOD, TYPE, FIELD, CONSTRUCTOR, MODULE, PACKAGE, RECORD_COMPONENT, TYPE_USE, TYPE_PARAMETER
@deprecated - to indicate a declaration is deprecated
@override - used only on methods, to indicate a subclass is overriding a method of its superclass
@FuntionalInterface - purely informational
@SafeVarags - used only on methods and constructors to indicate that no unsafe actions related to varargs parameter
A non-reifable type is a generic type
@suppresswarnings - indicate warnings are suppressed