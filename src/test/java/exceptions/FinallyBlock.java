package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		//testFinallyBlock_test1();
		//testFinallyBlock_test2();
		testFinallyBlock_test3();
	}
	
	//Irrespective of what happens finally block is executed
	public static void testFinallyBlock_test1(){
		try{
			System.out.println("Inside try block");
		}catch(Exception e){
			System.out.println("Inside catch block");
		}finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Rest of the code");
	}
	
	//We can use try without catch block - if finally block is present
	public static void testFinallyBlock_test2(){
		try{
			int a = 3/0;
			System.out.println("Inside try block");
		}finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Rest of the code");
	}
	
	//
	public static void testFinallyBlock_test3(){
		try{
			int a =3/0;
			System.out.println("Inside try block");
		}catch(Exception e){
			System.out.println("Inside catch block");
		}finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Rest of the code");
	}
}
