package method;

/*
 * Method - Method is a set of code which is referred to by a name and it can be 
 * called at any point in the program just by utilizing the method name
 * 
 *  Syntax:
 *  modifiers returnType name(list of arguments){
 *  
 *  
 *  }
 *  
 *  method name must be unique
 *  return type is mandatory
 *	modifiers are not mandatory
 *  arguments are local variables
 *  If return type and returning value - are not fo same time - error: Incompatible types
 *  If return type of a method is void and if we use it inside a SOP stmt/Expression - error: void type not allowed here
 *  System.out.println(add(2,5)) or int res2 = add(3, 4) + add(7, 9)
 *
 *  FASP^3
 *  Final Abstract Static Public Private Protected default
 *  
 *  MODIFIERS
 *  Private members 			- can be used within same class
 *  Default/Package/Friendly	- within classes present in same package
 *  Public						- anywhere
 *  Protected					- 
 *  Final						- We can use final keyword for any variable method or class. Final variable values cannot be changed. 
 *  							  In JAVA, constants are created using final keyword
 *  							  Final methods cannot be overridden in subclass [But can be inherited]
 *  							  Final class cannot be extended. It will b ethe last class in inheritance hierarchy.
 *  
 *  
 *  
 * Types of methods: Static and Non static
 * 
 * METHOD OVERLOADING:
 * Creating multiple methods with same name but with different argument signature
 * Arguments may differ either in the no: of arguments or argument type
 * Overloaded methods return type can be anything
 * When overloaded method is called, java executes based on parameter given
 * We use overloading when we write multiple methods for same functionality but input is different
 *  
 *  
 * Ex:
 * void test1(){
 * 
 * }
 * 
 * int test1(int a){
 * 
 * }
 * 
 * int test1(int a, int b){
 * 
 * }
 * 
 * str.indexOf(char c), str.indexOf(String s), str.indexOf(char c, int index), str.indexOf(String s, int index)
 * str.subString(int fromIndex), str.subString(int fromIndex, int endIndex)
 * driver.switchTo.frame(int index), driver.switchTo.frame(String name/ID), driver.switchTo.frame(WebElement frameElement)
 * Actions - contextClick(), contextClick(WebElement ele)
 * driver.navigate().to(String Url)
 * driver.navigate().to(URL Url)
 *  
 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 * 
 * DATA MEMEBERS
 * Any variable declared outside the method but with in a class.
 * Initialization is not mandatory. 
 * If they are not initialized Java assigns default value
 * 
 * Short		0
 * Byte 		0 
 * int 			0
 * long 		0
 * float 		0.0
 * double 		0.0
 * char 		empty
 * boolean 		false
 * String 		null [for all derived types]
 * 
 * 
 * MULTIPLE CLASSES IN A FILE
 * We can write multiple classes in a single java file. But only one class can be public. File name should be same as the public class name.
 * For class we can use default and public modifier.
 * 
 * STATIC AND NON STATIC MEMBERS
 * Within same class:
 * Static methods can access only static members
 * Non static methods can access both static and non static members
 * 
 * In different classes
 * static members can be access using class name
 * non static members can be accessed using object name
 * 
 * JVM has
 * 
 * STACK AREA [LIFO]	: local variables created when corresponding method is called * 
 * METHOD/CLASS AREA	: static variables are created when class is used for the first time * 
 * HEAP AREA			: non static variables are created when object of class is created
 * 
 * 
 * 
 * 
 */
