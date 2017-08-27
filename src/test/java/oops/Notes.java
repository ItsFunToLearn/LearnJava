package oops;

public class Notes {
/*
 * A a1 = new A();
 * 
 * new keyword is used to create an object
 * It allocates memory in Heap and loads all non static members and finally returns reference.
 * 
 * Object is a instance of class.
 * In java object is a group of variables which represent state and methods which represent behavior.
 * 
 * Abundant Object --> Object without any reference
 * Program called garbage collector manages heap memory. Abundant objects will be removed by garbage collector.
 * 
 * this keyword
 * represents current instance
 * it is used to refer non static variables of current instance
 * it is used to refer non static methods of current instance
 * 
 * this() - call to this - is used to call current class constructor from a constructor
 * 
 * Constructor:
 * Class will contain data members, constructor and methods.
 * Constructor is a special kind of method which is executed when an object of class is created.
 * Constructor name is same as class name.
 * There is no return type for constructor
 * static keyword is not allowed for constructor
 * If there is no constructor - Java compiler will implicitly add default/ no argument constructor
 * Constructors are used to initialize the objects
 * 
 * Inheritance [IS A RELATIONSHIP]
 *  is a process of acquiring properties of one class in another class.
 * It is to access non static members directly since static members can be accessed directly using class name.
 * Private members cannot be inherited to subclass
 * Constructor is not inherited into subclass
 * static members are not inherited [But it can be used in subclass]
 * 
 * * Uses of Inheritance - REUSABILITY, POLYMORPHISM, ABSTRACTION
 * 
 * A parent[super class] can have multiple children[sub class]
 * A child[subclass] cannot have multiple parents[superclass]
 * 
 * Object class is super most class in Java. All other classes are direct/indirect subclasses of object class
 * 
 * 
 * METHOD OVERRIDING
 * Changing implementation of a inherited method in subclass as per subclass requirement is known as overriding
 * While overriding argument signature, method name and return type should be same as superclass method.
 * Access specifier can be changed but visibility cannot be reduced.
 * private
 * default
 * protected
 * public
 * 
 * super keyword:
 * using super keyword we can access immediate super class variable/method
 * 
 * Final:
 * We can use final keyword for any variable method or class. Final variable values cannot be changed. 
 * In JAVA, constants are created using final keyword
 * Final methods cannot be overridden in subclass [But can be inherited]
 * Final class cannot be extended. It will b ethe last class in inheritance hierarchy.
 * 
 * Abstract method
 * Method without body or implementation is known as abstract method.
 * Abstract methods are declared using keyword abstract
 * Ex: abstract public void test1();
 * 
 * Abstract Class:
 * Class which has atleast one abstract method is known as abstract class.
 * Abstract class are declared using keyword abstract
 * Abstract class cannot be instantiated [Object of an abstract class cannot be created]
 * Abstract class can contain only concrete methods
 * When a class extends abstract class, overriding all abstract methods in subclass is mandatory. otherwise subclass becomes abstract.
 * Abstract method in superclass forces sub class to implement a method wthout altering method signature.
 * 
 * 
 * abstract class A(){
 * 		void test1(){ 
 *
 *  	 }
 *   	abstract void test2();
 *  }
 *  
 *  Upcasting 
 *  is an example of late binding
 *  For up casting inheritance is mandatory
 *  Assigning subclass instance to super class variable
 *  Ex: A a = new B();
 *  
 *  When we call a over ridden method, method implementation depends on instance type.[Not based on reference type]
 *  
 *  Downcasting:
 *  Assigning superclass reference which is a instance of sub class to subclass variable
 *  Downcasting is always explicit
 *  Down casting is required when the subclass instance is upcasted, but we need to access subclass features.
 *  Before downcasting to specific type always verify instance type using "instanceOf" keyword
 *  
 *  instanceOf --> keyword verifies if the given reference is of given type or not.
 *  			   it returns boolean value
 *  Ex: a1 instanceOf B --  true/false
 *  
 * 
 * Binding:
 * Early Binding Compiler connects method call to method body @ compile time based on parameter 
 * Late Binding  JRE connects method call to method body @ runtime based on instance type
 * 
 * POLYMORPHISM:
 * Is a concept in which one method call shows different behavior @ different situation
 * 
 * COMPILE TIME POLYMORPHISM
 * It is a technique in which call to overloaded method is based on parameter type
 * 
 * RUN TIME POLYMORPHISM - INHERITANCE, OVERRIDING, UPCASTING IS mandatory
 * It is a technique in which call to overridden method is based on instance type
 *
 * INTERFACE
 * Like class interface is also a type
 * Interface is used to access hidden implementation
 * In interface by default variables are public, static and final
 * In interface by default methods are public, abstract
 * There is no constructor in interface
 * Since interface is 100% abstract object of interface cannot be created
 * Using interface we try to achieve 100% abstraction and multiple inheritance.
 * 
 * Interface EXTENDS interface
 * Class EXTENDS class
 * Class IMPLEMENTS interface
 * 
 * Ex: Class B extends A implements I{
 * 
 * 
 *	 
 *
 *}
 *
 *ABSTRACTION
 *Process of hiding the implementation and providing only required features for users.
 *Abstraction can be achieved using 
 *abstract class
 *interface
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
