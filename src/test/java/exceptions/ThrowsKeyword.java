package exceptions;

import java.io.IOException;

//Throws keyword is used to declare an exception (Generally used for checked exceptions)
//Exception can be propagated from one class to another class
//Exception can be propagated from one method to another method
//When ever calling method throws exception you can handle it 
//1.Using try catch block or
//2. By throwing the exception using throws keyword

public class ThrowsKeyword {

	public static void main(String[] args){		
		//test1(); // When you call test1() method compiler forces you to handle it. using try catch/throws keyword
		//test2(); //Same as above
		//test4();
		//test3(); //It wont force you to use throws as exception is handled
	}
	
	public static void test1() throws IOException{
		throw new IOException("IO Exception"); 
	}
	
	public static void test2() throws IOException{
		test1();
	}
	
	public static void test3(){
		try {
			test2();
		} catch (IOException e) {
			System.out.println("Exception handled inside catch block");
		}
	}
	
	public static void test4() throws IOException{
		System.out.println("Inside test4 i am using throws but, I am NOT throwing any exception using throw keyword");
	}
}
