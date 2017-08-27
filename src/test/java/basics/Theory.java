package basics;

public class Theory {
/*
 * Java Compiler converts Java code to byte code [.java file to .class file]
 * Java Run Time Environment[JRE] will convert byte code to machine level language which the underlying platform can understand.
 * Java compiler starts executing after checking syntax of each and every line in teh program.
 * JRE is interpreter. Does line by line execution.
 * Byte code is platform independent. JRE is platform dependent.
 * Wrote a program to open file. If there is syntax error then Java Compiler will throw error.
 * Suppose during run time file is not found in the specified location, then JRE will throw error
 * 
 * Java is preferred language because of its features like
 * platform independent - write once and run many times
 * object oriented
 * secured
 * reusable
 * open source
 * friendly syntax
 * memory management
 * 
 * To run a program we need
 * Editor [Notepad, notepad++, eclipse]
 * Java Compiler 
 * JRE
 * 
 * 
 * Types:
 * Java Standard Edition(J2SE) - used to develop stand alone application
 * Java Enterprise Edition(J2EE) - used to develop web based application [JSP and Servlet are two extra features]
 * Java Micro Edition(J2ME) - used to develop mobile application
 * 
 * Keywords: Built in words in Java which have some predefined meaning Ex: class, method, public, static, void
 * 
 * Every instruction in Java must end with semicolon. Java is free form language you can write everything in same line.
 * 
 * System.out.println(89);  ---> print to standard output
 * System.out.print(89);    ---> keeps printing to the same line
 * System.out.println(89);  ---> After printing inserts a new line
 * 
 * To print data in console:
 * number : System.out.println(89);
 * variable : System.out.println(i);
 * character : System.out.println('H');
 * String : System.out.println("Rathna");
 * 
 * In order to compile we need file name
 * For execution we need class name
 * 
 * We can have "n" number of methods in a class. 
 * While we execute program JRE always starts execution from Main method.
 * To execute other methods we need to call them inside main method.
 * When main method is not there JRE stops execution and throws error
 * "Main method is not found in class <class name>. Please define main method as public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application".
 * We can compile a class without main method, but for execution main method is mandatory.
 * 
 * Identifiers:
 * Names given by programmer or developer inorder to identify a class/interface/method/variable uniquely
 * Syntax:
 * Do not use keywords
 * No special characters are allowed except _ and $. No spaces are allowed.
 * Do not start with digits. Always start with alphabets.
 * Class and Interface: 
 * First letter in every word must be in Upper case
 * Variable and methods : First word in lower case. From second word onwards, first letter in every word should be in upper case.
 * 
 * Variables:
 * Temporary memory space used to store data.
 * 
 * Local variables: Variables declared inside a method. The scope of a local variable is the method in which the variable has been declared.
 * Static and non static variables: Variables declared inside a class but outside a method.
 * 
 * DATA TYPES * 
 * Primitive data types - used to store value
 * short[16]	int[32]		float[32]	char[16]
 * byte[8]		long[64]	double[64]	boolean
 * 
 * Derived data types - used to store objects
 * 
 * OPERATORS PRECEDENCE:
 * Unary operator:			++ --
 * Arithmetic operators :	* / % + -
 * Relational operators : 	> >= < <= == != 
 * Logical operators	:   &&   ||  !
 * 
 * If we enclose something inside a bracket, it will get highest priority.
 * 
 * + --> can be used as addition and concatenation operator.
 * 
 * java.util.Scanner scn = new java.util.Scanner(System.in)
 * scn.next()
 * scn.nextInt()
 * scn.nextDouble()
 * scn.nextShort()
 * scn.nextLong()
 * scn.nextByte()
 * scn.nextBoolean()
 * 
 * Switch(Expression)
 * 
 * switch(expression)
 * {
 * 	case value1:
 * 		.......
 * 		.......
 * 		break;
 * 	
 * 	case value2:
 * 		......
 * 		......
 * 		break;
 *	default:
 *     break;
 * }
 * 
 * Expression can be anything
 * switch, case, break, default --> keywords 
 * values must be unique. Error thrown if duplicate values are given : duplicate case label
 * Depending on the value yielded by expression, corresponding case will be executed
 * If none of the values matches then default will be executed
 * We can write case values in any order
 * If there are more branches prefer switch
 * If there are less branches then prefer If
 * If i enter alphabets during run time, where i have used nextInt() function to accept only numbers, then we get exception in thread main - java.util.InputMismatchException
 * 
 * 
 * Loops:
 * To execute a set of statements repeatedly we use loop
 * 1 iteration = 1 repetition
 * 
 * Four looping statements are available in Java
 * FOR
 * WHILE
 * DO-WHILE
 * FOR-EACH
 * 
 * FOR LOOP
 * Syntax:
 * for(initialization; condition; increment/decrement){
 * 			.......
 * }
 * initialization 		--> will be executed only once at the beginning of the loop, when control enters loop for the first time
 * condition 	  		--> As long as condition is satisfied set of statements will be executed
 * increment/decrement	--> executed at the end of iteration
 * Any variable declared inside for loop cannot be used outside the loop.
 * Hence if you wish to use a variable inside nad outside for loop, declare it before the loop itself.
 * 
 * for(int i=1; i<=10; i++){
 * 		System.out.println(i);
 * 		if(i == 3) break;       ---> STOPS ITERATION
 * }
 * 
 * While Loop  - You dont know how many time you want to execute
 * int i=1;
 * while(i<=10){
 * System.out.println(i);
 * i++
 * }
 * 
 * 
 * Do While - first time if you want to execute mandatorily and then decide if you want to continue /skip
 * int i=1;
 * do{
 * System.out.println(i);
 * i++;
 * }while(i<=10)
 * 
 * For each loop
 * used to iterate elements from array/collection
 * 
 * Return type in JAVA
 * can be void / Primitive data type/ Derived data type [Class / Interface/ Array/Collection]
 * 
 * Following are valid
 * void test1(){
 * System.out.println("Rathna");
 * }
 * 
 * void test1(){
 * System.out.println("Rathna");
 * return;
 * }
 * 
 * void test1(){
 * System.out.println("Rathna");
 * return;
 * }
 * 
 * A test1(){
 * System.out.println("Rathna");
 * return this;
 * }
 * 
 * char test1(){
 * 	return 'c';
 * }
 * 
 * char test5{
 * return 10000; // converts into ascii value
 * }
 * 
 * double test6(int a, int b){  // double can accept integer value since double size is bigger than integer
 * 	return a+b;
 * }
 * 
 * Is it possible to return some value between the method
 * No
 * When JVM sees the return statement it gives back control to the calling method. 
 * So return statement must be the last statement inside method.
 * Even if we write any code after return statement we will get, unreachable code error.
 * this applies to break and throw new Exception();
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
